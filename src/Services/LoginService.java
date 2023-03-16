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

/**
 * @file LogginService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 6 mar. 2023
 */
public class LoginService {
    
    private static String GET_ACCOUNT_PASSWORD = "SELECT * FROM user WHERE id = ? AND active = 1";
    
    /**
     * Function for the sign in
     * @param user. The account and password of the user
     * @return The user information if is registred and NULL when nos exist
     */
    public UserDto Login(UserDto user){
        DBConnection con = new DBConnection();
        ResultSet result = null;
        
        try{
            Connection bdcon = con.Connect();
            PreparedStatement query = bdcon.prepareStatement(GET_ACCOUNT_PASSWORD);
            query.setString(1, user.getAccount());
            result = con.Query(query);
            
            if(result.next()){
                
                if(user.getPassword().equals(result.getString(4))){
                    user.setName(result.getString(2));
                    user.setPhone(result.getString(3));
                }else{
                    return null;
                }
            }else{
                return null;
            }
            con.Close();
            
        }catch(Exception e){
            System.out.println("LoginService. Login = " + e.getMessage());
            con.Close();
            return null;
        }
        return user;
    }
    
}
