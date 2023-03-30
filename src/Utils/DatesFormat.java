/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Utils;

import datechooser.beans.DateChooserCombo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @file DatesFormat.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 6 mar. 2023
 */
public class DatesFormat {
    
    /**
     * Generate the actual date in DB format
     * @param null
     * @return String. The date in format: YYYY-mm-dd
     */
    public String getTodayDBFormat(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-d");
        String date = dateFormat.format(new Date());
        return date;
    }
    
    /**
     * Generate the actual date in text format
     * @param null
     * @return String. The date in text format
     */
    public String getTodayTextFormat(){
        Calendar date = Calendar.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(date.get(Calendar.DAY_OF_MONTH));
        sb.append(" de ");
        
        switch(date.get(Calendar.MONTH)){
            case 0 -> sb.append("enero");
            case 1 -> sb.append("febrero");
            case 2 -> sb.append("marzo");
            case 3 -> sb.append("abril");
            case 4 -> sb.append("mayo");
            case 5 -> sb.append("junio");
            case 6 -> sb.append("julio");
            case 7 -> sb.append("agosto");
            case 8 -> sb.append("septiembre");
            case 9 -> sb.append("octubre");
            case 10 -> sb.append("noviembre");
            case 11 -> sb.append("diciembre");
            default -> sb.append("error");
        }
        
        sb.append(" de ");
        sb.append(date.get(Calendar.YEAR));
        
        return sb.toString();
    }
    
    /**
     * Generate the actual date in number format: dd/mm/yyyy
     * @param null
     * @return String. The date in format: dd/mm/yyyy
     */
    public String getTodayNumberFormat(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(new Date());
        return date;
    }
    
    /**
     * Convert a database date format to text
     * @param date. String. database format: yyyy:mm:dd
     * @return String. Text format
     */
    public String ConvertDateDBToTextFormat(String date){
        StringBuilder sb = new StringBuilder();
        String[] data = date.split("-");
        sb.append(data[2]);
        sb.append(" de ");
        
        switch(data[1]){
            case "01" -> sb.append("enero");
            case "02" -> sb.append("febrero");
            case "03" -> sb.append("marzo");
            case "04" -> sb.append("abril");
            case "05" -> sb.append("mayo");
            case "06" -> sb.append("junio");
            case "07" -> sb.append("julio");
            case "08" -> sb.append("agosto");
            case "09" -> sb.append("septiembre");
            case "10" -> sb.append("octubre");
            case "11" -> sb.append("noviembre");
            case "12" -> sb.append("diciembre");
            default -> sb.append("error");
        }
        
        sb.append(" de ");
        sb.append(data[0]);
        
        return sb.toString();
    }

    /**
     * Get the date from JDateChooser
     * @param DateChooserCombo. Origin of the date
     * @Return String. Date in database format
     */
    public String DateJDateChooser(DateChooserCombo dateChooserCombo){
        StringBuilder sb = new StringBuilder();
        Calendar date = dateChooserCombo.getSelectedDate();
        sb.append(date.get(Calendar.YEAR));
        sb.append("-");
        int num = date.get(Calendar.MONTH) + 1;
        
        if (num < 10) {
            sb.append("0");
        }
        sb.append(num);
        sb.append("-");
        num = date.get(Calendar.DATE);
        
        if (num < 10) {
            sb.append("0");
        } 
        sb.append(num);
        
        return sb.toString();
    }
    
    /**
     * Generate the actual date in datetime format: yyyy-MM-dd hh:mm:ss
     * @return String. Datetime yyyy-MM-dd hh:mm:ss
     */
    public String getTodayDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = dateFormat.format(new Date());
        return date;
    }

}
