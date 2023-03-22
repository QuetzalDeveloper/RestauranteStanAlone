/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Utils;

/**
 * @file Validations.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 14 mar. 2023
 */
public class Validations {
    
    /**
     * Return true if it only has letters, false otherwise 
     * @param string. The string to validate
     * @return boolean. 
     */
    public boolean OnlyLetters(String string){
        if(!string.isBlank()){
            return string.chars().allMatch(Character::isLetter); 
        }else{
            return false;
        }
    }
    
    /**
     * Return true if it has letters or whithspaces, false otherwise 
     * @param string. The string to validate
     * @return boolean
     */
    public boolean LettersAndSpace(String string){
        if(!string.isBlank()){
            string = string.replaceAll(" ", "a");
            return string.chars().allMatch(Character::isLetter); 
        }else{
            return false;
        }
    }
    
    /**
     * Return true if the String is a phone number whith 10 digits, false otherwise 
     * @param string. The string to validate
     * @return boolean
     */
    public boolean PhoneNumber(String string){
        if(!string.isBlank()){
            if(string.length() <= 10){
                return string.chars().allMatch(Character::isDigit);
            }else{
                return false;
            }             
        }else{
            return false;
        }
    }
    
    /**
     * Return true if the String is valid password (no white spaces), false otherwise 
     * @param string. The string to validate
     * @return boolean
     */
    public boolean ValidPassword(String string){
        if (!string.isBlank()) {
            return !string.chars().allMatch(Character::isWhitespace);
        } else {
            return false;
        }
    }

    /**
     * Return true if the String is valid price format, false otherwise 
     * @param string The String to validate
     * @return boolean.  True if is price format, false otherwise
     */
    public boolean PriceFormat(String string) {
        if (!string.isBlank()) {
            
            try{
                Double.parseDouble(string);
                return true;
            }catch(Exception e){
                return false;
            }                
        } else {
            return false;
        }
    }
    
    /**
     * Return true if the String is valid letter, number and whitespace format, false otherwise 
     * @param string The String to validate
     * @return boolean.  True if the format is correct, false otherwise
     */
    public boolean NumbersLettersAndSpace(String string){
        if (!string.isBlank()) {
            string = string.replaceAll(" ", "a");
            return string.chars().allMatch(Character::isLetterOrDigit);
        } else {
            return false;
        }
    }
    
    /**
     * Return true if the String is only number format, false otherwise 
     * @param string The String to validate
     * @return boolean.  True if the format is nomber, false otherwise
     */
    public boolean OnlyNumbers(String string){
        if(!string.isBlank()){
            return string.chars().allMatch(Character::isDigit);
        }else{
            return false;
        }
    }
}
