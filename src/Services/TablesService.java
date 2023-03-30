/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services;

import DTO.TablesDto;
import DTO.VentaDto;
import DataBase.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @file TablesService.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 22 mar. 2023
 */
public class TablesService {
    
    private static String SQL_TABLES_ACTIVE= "SELECT DISTINCT id, mesa, id_mesero, cerrada FROM venta WHERE activa = 1";
    private static String SQL_SAVE_INIT_SALE = "INSERT INTO venta(mesa, id_mesero, fecha_inicio, cerrada, activa) VALUES(?,?,?,?,?)";
    
    /**
     * Insert a new sale with de init params
     * @param venta
     * @return True if the insert is ok, false otherwise 
     */
    public boolean InsertInitSale(VentaDto venta){
        DBConnection dbConnection = new DBConnection();
        Connection con = dbConnection.Connect();
        try{
            PreparedStatement query = con.prepareStatement(SQL_SAVE_INIT_SALE);
            query.setInt(1, venta.getTable());
            query.setString(2, venta.getIdUser());
            query.setString(3, venta.getStartDate());
            query.setBoolean(4, venta.isClose());
            query.setBoolean(5, venta.isActive());
            dbConnection.Update(query);
        }catch(Exception e){
            System.out.println("TableService. InsertInitSale = " + e.getMessage());
            dbConnection.Close();
            return false;
        }
        dbConnection.Close();
        return true;
    }
    
    
    /**
     * Get the active tables
     * @return List<TablesDto>
     */
    public List<TablesDto> getTablesActive(){
        List<TablesDto> result = new ArrayList<>();
        DBConnection dbcon = new DBConnection();
        try{
            Connection con = dbcon.Connect();
            ResultSet res = dbcon.Query(con.prepareStatement(SQL_TABLES_ACTIVE));
            TablesDto data= null;
            
            while(res.next()){
                data = new TablesDto();
                data.setId(res.getInt(1));
                data.setTable(res.getInt(2));
                data.setUser(res.getString(3));
                data.setClose(res.getBoolean(4));
                data.setActive(true);
                result.add(data);
            }
            
        }catch(Exception e){
            System.out.println("TableService. getTablesActive = " + e.getMessage());
        }
        
        dbcon.Close();
        return result;
    }
    
}
