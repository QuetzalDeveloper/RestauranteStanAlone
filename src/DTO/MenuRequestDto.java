/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 * @file MenuRequestDto.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 19 mar. 2023
 */
public class MenuRequestDto {
    
    private Integer menuId;
    private String menuNombre;
    private Integer menuTipo;
    private boolean active;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuNombre() {
        return menuNombre;
    }

    public void setMenuNombre(String menuNombre) {
        this.menuNombre = menuNombre;
    }

    public int getMenuTipo() {
        return menuTipo;
    }

    public void setMenuTipo(int menuTipo) {
        this.menuTipo = menuTipo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
