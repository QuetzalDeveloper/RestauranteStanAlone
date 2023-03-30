/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * @file Connection.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 6 mar. 2023
 */
public class DBConnection {
    
    private static String DATABASE = "jdbc:mysql://localhost:3306/elmanjarrestaurante";
    private static String USER = "root";
    private static String PASSWORD = "";
    private static String DRIVER = "com.mysql.jdbc.Driver";
    
    private Connection connection;   

    /**
     * Connect the database for a petition
     * @param null
     * @return The value of the connection:
     *  - 0. Connection started successfully
     *  - 1. Driver definition failed
     *  - 2. Wrong database credentials 
     */
    public Connection Connect(){
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("BDConnection. Connect -> Connection failed = " + ex.getMessage());
            return null;
        }
        try{
            connection = DriverManager.getConnection(DATABASE,USER, PASSWORD); //192.168.1.64
            //System.out.println("BDConnection. Connect -> Connection started");
            return connection;
        } catch (SQLException ex) {
            System.out.println("BDConnection. Connect -> Connection stopped = " + ex.getMessage());
            return null;
        }
    }
    
    /**
     * Function for insert, update and delete statements
     * @param sql. The SQL statement
     * @return The status of the transaction
     *  - 0. The update was successful
     *  - 1. A problem has occurred. Check the exception message
     */
    public synchronized int Update (PreparedStatement sql){
        try{
            sql.executeUpdate();
        }catch(SQLException e){
             System.out.println("BDConnection. Update = " + e.getMessage());
             return 1;
        }
        return 0;
    }
    
    /**
     * Function for any query
     * @param sql. The SQL query statement
     * @return The ReseultSet fron the database result
     */
    public ResultSet Query(PreparedStatement sql){
        ResultSet result = null;
        try {
            result = sql.executeQuery();
        } catch (SQLException e) {
            System.out.println("BDConnection. Query = " + e.getMessage());
        }
        return result;
    }
    
    /**
     * Function to close the connection to the database
     * @param null
     * @return Shutdown Status: 
     *0. The connection to the database has been successfully closed. 
     *1. A problem has occurred. Check the exception message
     */
    public int Close(){
        try{
            connection.close();
            //System.out.println("BDConnection. Close -> Connection closed");
        }catch(SQLException e){
            System.out.println("BDConnection. Close = " + e.getMessage());
            return 1;
        }
        return 0;
    }
}
