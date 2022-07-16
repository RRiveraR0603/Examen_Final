/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author RICHARD RIVERA
 */
public class Procesos {
    
    private String proceso;
    
     public Procesos() {
        this.proceso = null;
    }
    
    public Procesos(String pro) {
        this.proceso = pro;
    }
    
    /**
     * Metodo que modifica el sabor del helado
     * 
     *  sabor Nombre del sabor del helado
     */
    public void setSabor(String proc) {
        this.proceso = proc;
    }
    
    /**
     * Metodo que retorna el sabor del helado
     * 
     * retorna el nombre del sabor del helado
     */
    public String getSabor() {
        return this.proceso;
    }
    
}
