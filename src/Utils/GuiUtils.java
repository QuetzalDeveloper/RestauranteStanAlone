/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Utils;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @file GuiUtils.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 14 mar. 2023
 */
public class GuiUtils {
    
    /**
     * Return the Icon for the label sended
     * @param url
     * @param label
     * @return Icon
     */
    public Icon ImageLabel(String url, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        Image escala = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        Icon res = new ImageIcon(escala);
        return res;
    }
    
    /**
     * Finish the application
     */
    public void AppExit(){
        System.exit(0);
    }
    
    /**
     * Clean a JTable
     * @param table
     * @return DefaultTableModel
     */
    public DefaultTableModel ClearTable(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        return model;
    }

    /**
     * Returns the base text from the first and last names (separated by spaces) for the accountId.
     * @param string
     * @return String
     */
    public String GenerateBaseAccount(String string){
        StringBuilder sb = new StringBuilder("");
        String array[] = string.split(" ");
        
        for(var i = 0; i < array.length; i++){
            char chars[] = array[i].toCharArray();
            sb.append(chars[0]);
            sb.append(chars[1]);
        }
        
        return sb.toString();
    }
}
