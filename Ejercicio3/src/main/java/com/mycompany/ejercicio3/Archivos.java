/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RICHARD RIVERA
 */
public class Archivos {
    
    public static Cola_Clientes<Cliente> hacerColaClientes() {
        Cola_Clientes<Cliente> clientes = new Cola_Clientes();
        Cliente tempCliente = new Cliente();
        try {
            Scanner leer = new Scanner(new FileReader("Clientes.txt"));
            String nombre, apellido, cedula, tramite;
            nombre = apellido = cedula = tramite = null;
            while(leer.hasNextLine()) {
                String line = leer.nextLine();
                String[] separado = line.split("::");
                nombre = separado[0];
                apellido = separado[1];
                cedula = separado[2];
                tramite = separado [3];
                tempCliente = new Cliente(nombre, apellido, cedula, tramite);
                clientes.enqueue(tempCliente);
            }
        } catch (FileNotFoundException fnfe) {
            Mostrar.error("El archivo \"Clientes.txt\" no encontrado.");
        } catch (IOException ioe) { 
            Mostrar.error("El archivo \"Clientes.txt\" no se puede leer.");
        }
        return clientes;
    }
    
    public static void guardarFactura(int nPuesto, String reporte, Cliente cliente) {
    FileWriter file = null;
    BufferedWriter bw = null;
    try {
        file = new FileWriter("tramites.txt", true);
        bw = new BufferedWriter(file);
        bw.write("\t******************************");
        bw.newLine();
        bw.write("\t\t\t  REPORTE");
        bw.newLine();
        bw.newLine();
        bw.write("\tPedido nº: " + nPuesto);
        bw.newLine();
        bw.write("\tCliente: ");
        bw.newLine();
        bw.write("\tNombre: " + cliente.getNombre());
        bw.newLine();
        bw.write("\tApellido: " + cliente.getApellido());
        bw.newLine();
        bw.write("\Cedula: " + cliente.getCedula());
        bw.newLine();
        bw.write("\Tramites: " + cliente.getTramites());
        bw.newLine();
        bw.newLine();
        bw.write(reporte);
        bw.write("\t******************************");
        bw.newLine();
        bw.newLine();
        bw.flush();
    } catch (FileNotFoundException fnfe) {
        Mostrar.error("El archivo \"tramites.txt\" no encontrado.");
    } catch (IOException ioe) {
        Mostrar.error("El archivo \"tramites.txt\" no se puede leer.");
    } finally {
        }try {
            if(bw != null) { 
                 bw.close();
            }
            if(file != null) { 
                file.close();
            } 
        } catch (IOException ioe) { 
        
        }    
    }
    
}
