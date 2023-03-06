/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elmanjarcomanda;

import DTO.UserDto;
import Services.LoginService;

/**
 *
 * @author Diego Hernandez Cote
 */
public class ElManjarComanda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginService l = new LoginService();
        UserDto user = new UserDto();
        user.setAccount("KS90");
        user.setPassword("011290");
        l.Login(user);
    }
    
}
