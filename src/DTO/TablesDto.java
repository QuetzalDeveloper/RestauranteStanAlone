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
    private Integer mesa;

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

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }
    
    
}
