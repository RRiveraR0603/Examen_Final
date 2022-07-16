/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicicio1;

/**
 *
 * @author RICHARD RIVERA
 */
public class Personas {
    private String nombre;
    private String apellido;
    private int escala;
    
    public Personas(String nomb, String apell, int esc){
        nombre = nomb;
        apellido = apell;
        escala = esc;
    }
    @Override
    public String toString(){
        return "[" + nombre + " " + apellido + ", " + escala + "]";
    }
    
    public void satisfaccion(int escala){
        if(escala == 0){
            System.out.print("El cliente no atendio");
        }else if(escala == 1 || escala == 4){
            System.out.print("no satisfecho");
        }else if(escala == 5){
            System.out.print("Neutro");
        }else if(escala == 6 || escala == 8){
            System.out.print("satisfecho");
        }else if(escala ==9 || escala == 10){
            System.out.print("muy satisfecho");
        }else
            System.out.println("No existe el grado de satisfaccion");
    }
}
