/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.UserDto;
import DTO.VentaDto;
import DataBase.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @file SaleService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 31 mar. 2023
 */
public class SaleService {
    
    private static String GET_USER_TABLE = "SELECT * FROM user WHERE id  = ?";
    private static String GET_SALE_PRE_PAYMENT = "SELECT * FROM venta where id = ?";
    private static String UPDATE_DISCOUNT_TOTAL = "UPDATE venta SET descuento = ?, total = ? WHERE id = ?";
    
    /**
     * Get the user data from the id sale
     * @param table
     * @return UserDto. The user data
     */
    public UserDto getUserTable(String userId){
        UserDto result = null;
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement query = con.prepareStatement(GET_USER_TABLE);
            query.setString(1, userId);
            ResultSet res = dbcon.Query(query);
            if(res.next()){
                result = new UserDto();
                result.setAccount(res.getString(1));
                result.setName(res.getString(2));
                result.setPhone(res.getString(3));
                result.setActive(res.getBoolean(5));
            }
        }catch(Exception e){
            System.out.println("SaleService. getUserTable =  " + e.getMessage());
            dbcon.Close();
            return null;
        }
        dbcon.Close();
        return result;
    }

    public VentaDto getSalePrePayment(int sale) {
        VentaDto result = null;
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement query = con.prepareStatement(GET_SALE_PRE_PAYMENT);
            query.setInt(1, sale);
            ResultSet res = dbcon.Query(query);
            if(res.next()){
                result = new VentaDto();
                result.setId(res.getInt(1));
                result.setTable(res.getInt(2));
                result.setIdUser(res.getString(3));
                result.setStartDate(res.getString(4));
                result.setEndDate(res.getString(5));
                result.setSubTotal(res.getDouble(6));
                result.setDiscount(res.getDouble(7));
                result.setTotal(res.getDouble(8));
                result.setClose(res.getBoolean(13));
                result.setActive(res.getBoolean(14));
            }
        }catch(Exception e){
            System.out.println("SaleService. getSalePrePayment =  " + e.getMessage());
            dbcon.Close();
            return null;
        }
        dbcon.Close();
        return result;
    }

    /**
     * Update the discount and total of the sale
     * @param sale 
     */
    public boolean UpdateDiscountSale(VentaDto sale) {
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            PreparedStatement statement = con.prepareStatement(UPDATE_DISCOUNT_TOTAL);
            statement.setDouble(1, sale.getDiscount());
            statement.setDouble(2, sale.getTotal());
            statement.setInt(3, sale.getId());
            dbcon.Update(statement);
        }catch(Exception e){
            System.out.println("MenuService. UpdateMenuSale = " + e.getMessage());
            dbcon.Close();
            return false;
        }
        
        dbcon.Close();
        return true;
    }

}
