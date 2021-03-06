/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author RICHARD RIVERA
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String tramites;
    
    public Cliente() {
        this.nombre = null;
    }
    
    public Cliente(String n, String a, String ced, String tram) {
        this.nombre = n;
        this.apellido = a;
        this.cedula = ced;
        this.tramites = tram;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    public String getTramites(){
        return this.tramites;
    }
    
}
