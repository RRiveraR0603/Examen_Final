/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author RICHARD RIVERA
 */
public class Nodo {
    
    private String valor;
    private Nodo siguiente;

    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public Nodo(String v, Nodo sig){
        this.valor = v;
        this.siguiente = sig;
    }
    
    public Nodo(String v) {
        this.valor = v;
        this.siguiente = null;
    }
    
    public Nodo getSiguiente() {
       return this.siguiente;
    }
    
    public void setSiguiente(Nodo sig) {
        this.siguiente = sig;
    }
    
    public String getValor() {
       return this.valor;
    }
    
    public void setValor(String v) {
        this.valor = v;
    }
}
