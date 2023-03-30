/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 * @file CommandDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 24 mar. 2023
 */
public class CommandInitDto {

    private int table;
    private boolean active;
    private int idSale;
    private String idUser;
    private String userName;
    private TypeFoodDto typeFood;

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TypeFoodDto getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(TypeFoodDto typeFood) {
        this.typeFood = typeFood;
    }
  
    
}
