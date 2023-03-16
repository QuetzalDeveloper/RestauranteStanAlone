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
        if(string != null || !string.isBlank()){
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
        if(string != null || !string.isBlank()){
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
        if(string != null || !string.isBlank()){
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
        if (string != null || !string.isBlank()) {
            return !string.chars().allMatch(Character::isWhitespace);
        } else {
            return false;
        }
    }

}
