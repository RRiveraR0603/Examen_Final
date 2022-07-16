/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author RICHARD RIVERA
 */



public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Lista listaPalabras = new Lista();
		
	System.out.print("Introduzca un texto: ");
	String texto = leer.nextLine();
	listaPalabras = hacerLista(listaPalabras, texto);
	System.out.println("\n" + listaPalabras.toString());
        
    }
    
    public static Lista hacerLista(Lista lista, String texto) {
        String espacio = " ";
        StringTokenizer tokens = new StringTokenizer(texto, espacio);
        lista.agregar(tokens.nextToken());
        
        if (texto.indexOf(espacio) < 0) {
            return lista;
        } else {
            return hacerLista(lista, texto.substring(texto.indexOf(espacio) + espacio.length()));
        }          
    }
}
