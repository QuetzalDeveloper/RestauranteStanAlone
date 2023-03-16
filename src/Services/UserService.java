/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.UserDto;
import DTO.UserRequestDto;
import DataBase.DBConnection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @file UserService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 6 mar. 2023
 */
public class UserService {

    private static String INSERT_USER = "INSERT INTO user VALUES(?,?,?,?,?)";
    private static String DELETE_USER = "UPDATE user SET active = false WHERE id = ?";
    private static String UPDATE_USER = "UPDATE user SET nombre = ?, telefono = ?, pass = ?, active = ? WHERE id = ?";
    private static String GET_USER = "SELECT * FROM user ";
    
    /**
     * Insert a new user
     * @param user. UserDto container
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int InsertUser(UserDto user){
        DBConnection dbConnection = new DBConnection();
        Connection con;
        StringBuilder sb = new StringBuilder(GET_USER);
        sb.append("WHERE id = '");
        boolean edo = false;
        int value = 1;
        
        try {
            while (edo == false) {
                String sql = sb.toString() + user.getAccount() + "'";
                System.out.println("SQL = " + sql);

                con = dbConnection.Connect();
                ResultSet res = dbConnection.Query(con.prepareStatement(sql));
                
                if (res.next()) {
                    sql = user.getAccount() + "" + String.valueOf(value);
                    user.setAccount(sql);
                } else {
                    edo = true;
                }
                con.close();
                value++;
            }
        } catch (Exception e) {
            System.out.println("UserService. InsertUser = " + e.getMessage());
            return 1;
        }

        try {
            con = dbConnection.Connect();
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
        dbConnection.Close();
        return 0;
    }
    
    /**
     * Delete an user. The attrib active is update to false
     * @param account. The user account
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int DeleteUser(String account){
        DBConnection dbConnection = new DBConnection();
        try{
            Connection con = dbConnection.Connect();
            PreparedStatement query = con.prepareStatement(DELETE_USER);
            query.setString(1, account);
            dbConnection.Update(query);
        }catch(Exception e){
            System.out.println("UserService. DeleteUser = " + e.getMessage());
            return 1;
        }
        dbConnection.Close();
        return 0;
    }
    
    /**
     * Update the data. The account can't change
     * @param user. UserDto container
     * @return The value of the petition. 
     * 0 = Is succesful
     * 1 = A problem has occurred. Check the exception message
     */
    public int UpdateUser(UserDto user){
        DBConnection dbConnection = new DBConnection();
        try{
            Connection con = dbConnection.Connect();
            PreparedStatement query = con.prepareStatement(UPDATE_USER);
            query.setString(1, user.getName());
            query.setString(2, user.getPhone());
            query.setString(3, user.getPassword());
            query.setBoolean(4, user.isActive());
            query.setString(5, user.getAccount());
            dbConnection.Update(query);
        }catch(Exception e){
            System.out.println("UserService. UpdateUser = " + e.getMessage());
            return 1;
        }
        dbConnection.Close();
        return 0;
    }
    
    /**
     * Get the user's data.
     * @param request. UserRequestDto container
     * @return List<UserDto>. The data from the database
     */
    public List<UserDto> GetUsers(UserRequestDto request){
        StringBuilder sb = new StringBuilder(GET_USER);
        String sql = sb.toString();
        List<UserDto> result= new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        try{
            
            if(!request.isInactive()){
                sb.append("WHERE active = 1");
            }else{
                sb.append("WHERE (active = 1 OR active = 0)");
            }
            if(request.isFilters()){                
                if(request.getAccount() != null){
                    sb.append(" AND id = '" + request.getAccount()+ "'");
                }
                
                if(request.getName() != null){
                    sb.append(" AND nombre LIKE '" + request.getName() + "%'");
                }
            }

            sql = sb.toString();
            System.out.println("SQL = " + sql);
            Connection con = dbcon.Connect();
            ResultSet res = dbcon.Query(con.prepareStatement(sql));
            UserDto user = null;
            
            while (res.next()) {
                user = new UserDto();
                user.setAccount(res.getString(1));
                user.setName(res.getString(2));
                user.setPhone(res.getString(3));
                user.setPassword(res.getString(4));
                user.setActive(res.getBoolean(5));
                result.add(user);
            }

        } catch (Exception e) {
            System.out.println("UserService. GetUsers = " + e.getMessage());
            return null;
        }
        
        dbcon.Close();
        return result;
    }
}
