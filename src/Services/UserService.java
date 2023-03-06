/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.UserDto;
import DataBase.DBConnection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @file UserService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 6 mar. 2023
 */
public class UserService {

    private static String INSERT_USER = "INSERT INTO user VALUES(?,?,?,?,?)";
    private static String DELETE_USER = "UPDATE user SET active = ? WHERE id = ?";
    private static String UPDATE_USER = "UPDATE user SET ";
    private static String GET_USER = "SELECT * FROM user";
    
    /**
     * Insert a new user
     * @param user. UserDto container
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int InsertUser(UserDto user){
        try {
            DBConnection dbConnection = new DBConnection();
            Connection con = dbConnection.Connect();
            PreparedStatement query = con.prepareStatement(INSERT_USER);
            query.setString(1, user.getAccount());
            query.setString(2, user.getName());
            query.setString(3, user.getPhone());
            query.setString(4, user.getPassword());
            query.setBoolean(5, user.isActive());
            dbConnection.Update(query);
        } catch (SQLException e) {
            System.out.println("UserService. InsertUser = " + e.getMessage());
            return 1;
        }
        return 0;
    }
    
    /**
     * Delete an user. The attrib active is update to false
     * @param account. The user account
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int DeleteUser(String account){<?php`````<?php<?php
        return 0;
    }
}
