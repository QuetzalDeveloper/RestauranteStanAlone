/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @file MenuContainersDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 28 mar. 2023
 */
public class MenuContainersDto {

    private JPanel panel;
    private JLabel label;

    public MenuContainersDto() {
    }

    public MenuContainersDto(JPanel panel, JLabel label) {
        this.panel = panel;
        this.label = label;
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
       
}
