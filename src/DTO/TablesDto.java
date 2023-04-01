/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @file TablesDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 21 mar. 2023
 */
public class TablesDto {

    private JPanel panel;
    private JLabel label;
    private Integer table;
    private boolean close;
    private String user;
    private int id;
    private boolean active;

    
    public TablesDto(){
        
    }

    public TablesDto(int id, JPanel panel, JLabel label, Integer table, boolean active, boolean close, String user) {
        this.id = id;
        this.panel = panel;
        this.label = label;
        this.table = table;
        this.active = active;
    }
       
    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Integer getTable() {
        return table;
    }

    public void setTable(Integer table) {
        this.table = table;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
        
}
