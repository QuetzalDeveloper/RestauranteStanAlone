/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.MenuDto;
import DTO.MenuRequestDto;
import DTO.TypeFoodDto;
import DataBase.DBConnection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @file MenuService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 7 mar. 2023
 */
public class MenuService {

    private static String INSERT_MENU = "INSERT INTO platillos (name, type, type_name, cost, menu) VALUES(?,?,?,?,?)";
    private static String DELETE_MENU = "UPDATE platillos SET menu = false WHERE id = ?";
    private static String UPDATE_MENU = "UPDATE platillos SET name = ?, type = ?, type_name = ?, cost = ?, menu = ? WHERE id = ?";
    private static String QUERY_MENU = "SELECT * FROM platillos ";
    private static String QUERY_FOOD_TYPE = "SELECT * FROM tipoplatillo";
    
    /**
     * Insert a new menu item
     * @param item. MenuDto container
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int InsertMenuItem(MenuDto item){
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(INSERT_MENU);
            statement.setString(1, item.getName());
            statement.setInt(2, item.getType());
            statement.setString(3, item.getTypeName());
            statement.setDouble(4, item.getCost());
            statement.setBoolean(5, item.isInMenu());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. InsertMenuItem = " + e.getMessage());
            return 1;
        }
        
        dbcon.Close();
        return 0;
    }
    
    /**
     * Update a menu item
     * @param item MenuDto container
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int UpdateMenuItem(MenuDto item){
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(UPDATE_MENU);
            statement.setString(1, item.getName());
            statement.setInt(2, item.getType());
            statement.setString(3, item.getTypeName());
            statement.setDouble(4, item.getCost());
            statement.setBoolean(5, item.isInMenu());
            statement.setInt(6, item.getId());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. UpdateMenuItem = " + e.getMessage());
            return 1;
        }
        
        dbcon.Close();
        return 0;
    }
    
    /**
     * Get the type of food 
     * @return List<TypeFoodDto>
     */
    public List<TypeFoodDto> getTypeFood(){
        List<TypeFoodDto> result = new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        
        try{
            Connection con = dbcon.Connect();
            ResultSet res = dbcon.Query(con.prepareStatement(QUERY_FOOD_TYPE));
            TypeFoodDto type = null;
            
            while (res.next()) {
                type = new TypeFoodDto();
                type.setIdTipo(res.getInt(1));
                type.setNombreTipo(res.getString(2));
                result.add(type);
            }

        } catch (Exception e) {
            System.out.println("MenuService. GetTypeFood = " + e.getMessage());
            return null;
        }
        
        dbcon.Close();
        return result;
    }
    
    public List<MenuDto> getMenu(MenuRequestDto request){
        StringBuilder sb = new StringBuilder(QUERY_MENU);
        String sql = null;
        List<MenuDto> result = new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        
        try{
            
            if(request.isActive()){
                sb.append("WHERE (menu = 1 OR menu = 0)");
            }else{
                sb.append("WHERE menu = 1");
            }
            
            if(request.getMenuId() > 0){
                sb.append(" AND id = ");
                sb.append(request.getMenuId());
            }
            
            if(request.getMenuNombre() != null){
                sb.append(" AND name LIKE '" + request.getMenuNombre() + "%'");
            }
            
            if(request.getMenuTipo() > 0 ){
                sb.append(" AND type = ");
                sb.append(request.getMenuTipo());
            }
            
            sql = sb.toString();
            System.out.println("SQL = " + sql);
            Connection con = dbcon.Connect();
            ResultSet res = dbcon.Query(con.prepareStatement(sql));
            MenuDto menu = null;
            
            while(res.next()){
                menu = new MenuDto();
                menu.setId(res.getInt(1));
                menu.setName(res.getString(2));
                menu.setType(res.getInt(3));
                menu.setTypeName(res.getString(4));
                menu.setCost(res.getDouble(5));
                menu.setInMenu(res.getBoolean(6));
                result.add(menu);
            }
            
        }catch(Exception e ){
            System.out.println("MenuService. getMenu = " + e.getMessage());
            return null;
        }
        dbcon.Close();
        return result;
    }
}
