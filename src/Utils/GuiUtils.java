/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Utils;

import DTO.CommandInitDto;
import DTO.MenuSaleDto;
import DTO.VentaDto;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
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
    
    /**
     * Configurations for open a JFrame undecorated
     * @param frame 
     */
    public void OpenJFrame(JFrame frame){
        frame.dispose();
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    /**
     * Configurations for open a JDialog undecorated
     * @param frame 
     */
    public void OpenJDialog(JDialog dialog){
        dialog.dispose();
        dialog.setUndecorated(true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
    
    public boolean PrintTicketSale(CommandInitDto data, List<MenuSaleDto> product, VentaDto sale) {
        try {
            System.out.println("RUTA = " + System.getProperty("user.dir"));
            //String logo = "C:\\Program Files\\ElManjar\\logoticket.jpg";
            String logo = System.getProperty("user.dir") + "\\src\\Imagenes\\logoticket.jpg";
            String namePrinter = "Caja";
            DatesFormat df = new DatesFormat();
            File img = new File(logo);
            DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
            PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
            FileInputStream fileInputStream = new FileInputStream(img);
            if (fileInputStream != null) {
                
                try {
                    PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
                    pras.add(OrientationRequested.PORTRAIT);
                    pras.add(new MediaPrintableArea(0, 0, 48, 29, MediaPrintableArea.MM));
                    PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
                    
                    if (ps.length == 0) {
                        throw new IllegalStateException("1. No se encontro la impresora");
                    }
                    PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
                    PrintService myService = null;
                    
                    for (PrintService printService : printServices) {
                        System.out.println(printService.getName());
                        
                        if (printService.getName().equals(namePrinter)) {
                            myService = printService;
                            break;
                        }
                    }
                    
                    if (myService == null) {
                        System.out.println("2. Impresora no encontrada");
                        return false;
                    }
                    DocPrintJob docPrintJob = myService.createPrintJob();
                    Doc doc = new SimpleDoc(fileInputStream, DocFlavor.INPUT_STREAM.JPEG, null);
                    docPrintJob.print(doc, pras);
                    fileInputStream.close();
                    ByteArrayOutputStream expected = new ByteArrayOutputStream();
                    expected.writeBytes(" Av.Libertad #90. Cabecera mun. \n".getBytes());   //32 caracteres
                    expected.writeBytes("Chicoloapan de Juarez. CP.56370 \n".getBytes());
                    expected.writeBytes("       Estado de Mexico.        \n\n".getBytes());
                    expected.writeBytes((df.getTodayTextFormat()+"\n").getBytes());
                    expected.writeBytes((RowLimit("Folio: " + String.valueOf(data.getIdSale()))+"\n").getBytes());
                    expected.writeBytes((RowLimit("Mesa: " + String.valueOf(data.getTable()))+"\n").getBytes());
                    expected.writeBytes((RowLimit("Mesero: " + data.getUserName())+"\n").getBytes());
                    expected.writeBytes("--------------------------------\n".getBytes());
                    
                    for(MenuSaleDto food : product){
                        expected.writeBytes((RowLimit(food.getMenuName())+"\n").getBytes());    //Platillo
                        expected.writeBytes(("x" + String.valueOf(food.getQuantity()) + "          $" + PriceToString(food.getTotal()) + "\n").getBytes());    //Precio
                    }
                    expected.writeBytes("--------------------------------\n".getBytes());
                    expected.writeBytes(("        Subtotal: $ " + PriceToString(sale.getSubTotal()) + "\n").getBytes());
                    expected.writeBytes(("        Descuento: $ " + PriceToString(sale.getDiscount()) + "\n").getBytes());
                    expected.writeBytes("--------------------------------\n".getBytes());
                    expected.writeBytes(("TOTAL: $" + PriceToString(sale.getTotal())+ "\n").getBytes());
                    expected.writeBytes("--------------------------------\n".getBytes());
                    expected.writeBytes("  Gracias por tu preferencia.   \n".getBytes());
                    expected.writeBytes("         Vuelve pronto.         \n".getBytes());
                    expected.writeBytes(" \n".getBytes());
                    expected.writeBytes(" \n".getBytes());
                    expected.writeBytes(" \n".getBytes());
                    expected.writeBytes(" \n".getBytes());
                    expected.writeBytes(" \n".getBytes());
                    DocPrintJob job = myService.createPrintJob();
                    doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
                    job.print(doc, new HashPrintRequestAttributeSet());  
                } catch (PrintException ex) {
                    System.out.println(ex);
                } catch (IOException ex) {
                    System.out.println(ex);
                } 
            }
            
            //
        } catch (FileNotFoundException ex) {
            System.out.println("Error ticket = " + ex.getMessage());
            return false;
        } 
        return true;
    }
    
    private String RowLimit(String text){
        int x = text.length();
        if(x >32){
            return text.substring(0, 31);
        }else{
            return text;
        }
    }
    
    private String PriceToString(Double value){
        return String.format("%.2f", value);
    }
}
