/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author RICHARD RIVERA
 */
public class Mostrar {
    
    public static void menuPrincipal() {
        System.out.println("\n\tSAIME \n");
        System.out.println("\t1.Iniciar proceso");
        System.out.println("\t2.Reporte Total");
        System.out.println("\t3.Salir del sistema");
    }
    
    public static void menuProcesos() {
        System.out.println("\n\t***** Bienvenido *****\n");
        System.out.println("\t1.Cedulacion");
        System.out.println("\t2.Pasaporte");
        System.out.println("\t3.Retirar documentos");
        System.out.println("\t3.Salir (Ver reporte)");
    }
    
    public static void Reporte(int npuesto, String reporte, Cliente cliente) {
        System.out.println("\n\t******************************");
        System.out.println("\t\t  Reporte\n");
        System.out.println("\tPedido nº: " + npuesto);
        System.out.println("\tCliente: ");
        System.out.println("\tNombre: " + cliente.getNombre());
        System.out.println("\tApellido: " + cliente.getApellido());
        System.out.println("\tCedula: " + cliente.getCedula());
        System.out.println("\tTramite: " + cliente.getTramites());
        System.out.print("\n" + reporte);
        System.out.println("\t******************************");
        System.out.println("\t**** PROCESO TERMINADO ****");
    }
    
    public static void error(String msj) {
        System.out.println("\n\tError: " + msj);
    }
    
    public static void salida() {
        System.out.print("\n\tHa salido del sistema");
        for (int i = 1; i <= 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000); // Duerme el hilo durante 1000 milisegundos, 1 segundo pues
            } catch(InterruptedException ie) {
                // ignorar
            }
        }
    }
    
}
