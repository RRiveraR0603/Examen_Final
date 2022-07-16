/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author RICHARD RIVERA
 */
public class Lista {
    
    private Nodo inicio;
    private int longitud;
    
    public void Lista(){
        inicio = null;
        longitud = 0;
    }
    
    public boolean esVacia() {
        return inicio == null;
    }
    
    public int getLongitud() {
        return longitud;
    }
    
    public void agregar(String v){
        Nodo nuevo = new Nodo(v);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo auxNodo = inicio;
            while(auxNodo.getSiguiente() != null) {
                auxNodo = auxNodo.getSiguiente();
            }
            auxNodo.setSiguiente(nuevo);
        }
        longitud++;
    }
    
    @Override
    public String toString() {
        String string = "Lista: ";
        Nodo actual = inicio;
        for (int i = 1; i <= longitud; i++) {
            string += i + " -> [ " + actual.getValor() + " ] ";
            actual = actual.getSiguiente();
        }
        return string;
    }
}
