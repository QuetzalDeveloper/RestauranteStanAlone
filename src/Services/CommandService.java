/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.CommandInitDto;
import DTO.MenuDto;
import DTO.MenuSaleDto;
import DTO.VentaDto;
import DataBase.DBConnection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @file CommandService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 24 mar. 2023
 */
public class CommandService {
    
    public static String GET_COMMAND_INIT = "SELECT venta.id, venta.id_mesero, user.nombre FROM venta JOIN user ON venta.id_mesero = user.id "
            + "WHERE venta.activa = 1 AND mesa = ? LIMIT 1";
    public static String GET_MENU_TYPE = "SELECT * FROM platillos WHERE type = ? AND menu = 1";
    public static String GET_MENU_SALE_ITEMS = "SELECT vp.id, vp.id_venta, vp.id_platillo, p.name, p.type, vp.cantidad, vp.precio, vp.total FROM venta_platillo vp JOIN platillos p ON vp.id_platillo = p.id "
            + "WHERE vp.id_venta = ?";
    public static String INSERT_MENU_SALE_ITEM = "INSERT INTO venta_platillo (id_venta, id_platillo, cantidad, precio, total) VALUES(?,?,1,?,?)";
    public static String UPDATE_MENU_SALE_ITEM = "UPDATE venta_platillo SET cantidad = ?, precio = ?, total = ? WHERE id = ?";
    public static String DELETE_MENU_SALE_ITEM = "DELETE FROM venta_platillo WHERE id = ?";
    public static String CLOSE_TABLE_SALE = "UPDATE venta SET fecha_cierre = ?, subtotal = ?, descuento = ?, total = ?, cerrada = ? WHERE id = ?";
    
    /**
     * Insert the data for close the sale and table
     * @param sale
     * @return Boolean. True if is confirm, false in error
     */
    public boolean CloseSale(VentaDto sale) {
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(CLOSE_TABLE_SALE);
            statement.setString(1, sale.getEndDate());
            statement.setDouble(2, sale.getSubTotal());
            statement.setDouble(3, sale.getDiscount());
            statement.setDouble(4, sale.getTotal());
            statement.setBoolean(5, sale.isClose());
            statement.setInt(6, sale.getId());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. CloseSale = " + e.getMessage());
            dbcon.Close();
            return false;
        }
        
        dbcon.Close();
        return true;
    }
    
    /**
     * Delete a item from the list of product on sale
     * @param id
     * @return True if is Ok, false otherwise
     */
    public boolean DeleteMenuSale(int id){
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(DELETE_MENU_SALE_ITEM);
            statement.setInt(1, id);
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. DeleteMenuSale = " + e.getMessage());
            dbcon.Close();
            return false;
        }
        
        dbcon.Close();
        return true;
    }
    
    /**
     * Update the menu item in the sale 
     * @param item
     * @return 
     */
    public boolean UpdateMenuSale(MenuSaleDto item){
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(UPDATE_MENU_SALE_ITEM);
            statement.setInt(1, item.getQuantity());
            statement.setDouble(2, item.getPrice());
            statement.setDouble(3, item.getTotal());
            statement.setInt(4, item.getId());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. UpdateMenuSale = " + e.getMessage());
            dbcon.Close();
            return false;
        }
        
        dbcon.Close();
        return true;
    }
        
    /**
     * Insert a new menu item to the sale
     * @param item
     * @return 
     */
    public boolean InsertMenuSale(MenuSaleDto item){
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(INSERT_MENU_SALE_ITEM);
            statement.setInt(1, item.getIdSale());
            statement.setInt(2, item.getIdMenu());
            statement.setDouble(3, item.getPrice());
            statement.setDouble(4, item.getTotal());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. InsertMenuItem = " + e.getMessage());
            dbcon.Close();
            return false;
        }
        
        dbcon.Close();
        return true;
    }
    
    /**
     * Return the menu items in the indicate sale
     * @param sale
     * @return 
     */
    public List<MenuSaleDto> getMenuSale(int sale){
        List<MenuSaleDto> result = new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement query = con.prepareStatement(GET_MENU_SALE_ITEMS);
            query.setInt(1,sale);
            ResultSet res = dbcon.Query(query);
            MenuSaleDto item = null;
            while(res.next()){
                item = new MenuSaleDto();
                item.setId(res.getInt(1));
                item.setIdSale(res.getInt(2));
                item.setIdMenu(res.getInt(3));
                item.setMenuName(res.getString(4));
                item.setMenuType(res.getInt(5));
                item.setQuantity(res.getInt(6));
                item.setPrice(res.getDouble(7));
                item.setTotal(res.getDouble(8));
                result.add(item);
            }                       
        }catch(Exception e){
            System.out.println("CommandService. getMenuSale.  = " + e.getMessage());
            dbcon.Close();
            return null;
        }
        return result;
    }
    
    /**
     * Return all the data items of menu from the type
     * @param type
     * @return 
     */
    public List<MenuDto> getMenuTypeItem(int type){
        List<MenuDto> result = new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement query = con.prepareStatement(GET_MENU_TYPE);
            query.setInt(1,type);
            ResultSet res = dbcon.Query(query);
            MenuDto item = null;
            while(res.next()){
                item = new MenuDto();
                item.setId(res.getInt(1));
                item.setName(res.getString(2));
                item.setType(res.getInt(3));
                item.setTypeName(res.getString(4));
                item.setCost(res.getDouble(5));
                item.setInMenu(res.getBoolean(6));
                result.add(item);
            }                       
        }catch(Exception e){
            System.out.println("CommandService. getMenuTypeItem.  = " + e.getMessage());
            dbcon.Close();
            return null;
        }
        return result;
    }
    
    /**
     * Gets the initial data for the command window
     * @param table
     * @return 
     */   
    public CommandInitDto getCommandInit(int table){
        CommandInitDto result = null;
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement query = con.prepareStatement(GET_COMMAND_INIT);
            query.setInt(1, table);
            ResultSet res = dbcon.Query(query);
            if(res.next()){
                result = new CommandInitDto();
                result.setTable(table);
                result.setActive(true);
                result.setIdSale(res.getInt(1));
                result.setIdUser(res.getString(2));
                result.setUserName(res.getString(3));
            }
        }catch(Exception e){
            System.out.println("CommandService. getCommandInit =  " + e.getMessage());
            dbcon.Close();
            return null;
        }
        dbcon.Close();
        return result;
    }

    /**
     * Search the product in a list and return the position
     * @param product
     * @param id
     * @return 
     */
    public int SearchProduct(List<MenuSaleDto> product, Integer id) {
        for(int i = 0; i < product.size(); i++){
            if(product.get(i).getIdMenu() == id){
                return i;
            }
        }
        return -1;
    }

    /**
     * Calculate the subtotal from the price of the list of products in the table sale
     * @param product
     * @return Double. The subtotal of the products
     */
    public double getSubTotal(List<MenuSaleDto> product) {
       double result = 0.0;
       for(MenuSaleDto data : product){
           result += data.getTotal();
       }
       return result;
    }

}
