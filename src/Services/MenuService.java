/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.MenuDto;
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
    private static String QUERY_MENU = "SELECT * FROM platillos";
    
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
}
