/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 * @file MessageDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 14 mar. 2023
 */
public class MessageDto {
    
    private String title;
    private String message;
    private int type;

    public MessageDto(String title, String message, int type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }
        
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return int. The URI of the image 
     * Get the type of the message: 0. Confirmation; 1.Correct; 2. Warning; 3. Error
     */
    public int getType() {
        return type;
    }

    /**
     * @param type 
     * Save the type of the message: 0. Confirmation; 1.Correct; 2. Warning; 3. Error
     */
    public void setType(int type) {
        this.type = type;
    }
    
    /**
     * @return String. The URI of the image 
     */
    public String getImage(){
        return switch (type) {
            case 0 -> "/Imagenes/confirmx40.png";
            case 1 -> "/Imagenes/confirmx40.png";
            case 2 -> "/Imagenes/alertax36.png";
            default -> "/Imagenes/errorx36.png";
        };
    }   

}
