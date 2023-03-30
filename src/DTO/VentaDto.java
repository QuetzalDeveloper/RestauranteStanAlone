/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 * @file VentaDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 22 mar. 2023
 */
public class VentaDto {
    
    private int id;
    private int table;
    private String idUser;
    private String startDate;
    private String endDate;
    private double subTotal;
    private double discount;
    private double total;
    private double tip;
    private double cash;
    private double card;
    private String reference;
    private boolean close;
    private boolean active;

    public VentaDto() {
    }

    /**
     * Save de initial data of the sale
     * @param table
     * @param idUser
     * @param startDate
     * @param close
     * @param active 
     */
    public VentaDto(int table, String idUser, String startDate, boolean close, boolean active) {
        this.table = table;
        this.idUser = idUser;
        this.startDate = startDate;
        this.close = close;
        this.active = active;
    }

    /**
     * Save de information of ticket
     * @param id
     * @param endDate
     * @param subTotal
     * @param discount
     * @param total
     * @param tip
     * @param close
     * @param active 
     */
    public VentaDto(int id, String endDate, double subTotal, double discount, double total, double tip, boolean close, boolean active) {
        this.id = id;
        this.endDate = endDate;
        this.subTotal = subTotal;
        this.discount = discount;
        this.total = total;
        this.tip = tip;
        this.close = close;
        this.active = active;
    }

    /**
     * Save the information of the payment
     * @param id
     * @param cash
     * @param card
     * @param reference
     * @param close
     * @param active 
     */
    public VentaDto(int id, double cash, double card, String reference, boolean close, boolean active) {
        this.id = id;
        this.cash = cash;
        this.card = card;
        this.reference = reference;
        this.close = close;
        this.active = active;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
