/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author RICHARD RIVERA
 */

/*
*3-> Mediante el uso de archivos y los TAD que considere usted necesarios, 
*realice la carga de datos correspondiente a los clientes que serán atendidos 
*en el SAIME, dónde los datos de entrada de cada cliente sean: nombres, apellidos, 
*cédula y trámite a realizar, dicho trámite puede ser de 3 tipos: cedulación, cita 
*de pasaporte y retiro de documentos, cuyos tiempos de ejecución son 15, 20 y 3 
*minutos respectivamente, debe realizar la carga de esos clientes en un TAD, 
*de modo que una vez procesadas todas las solicitudes de cada cliente se imprima 
*en un archivo de texto plano un reporte de tiempo total de actividades realizadas 
*durante la ejecución del programa, mostrando el día en el que se ejecutó la actividad 
*y el total de tiempo que tomó realizar dicho trabajo, además de imprimir los datos de
*cada cliente, su trámite y el detalle del tiempo que el mismo proceso que el 
*cliente solicitaba tardo.
*/
public class Ejercicio3 {

    public static void main(String[] args) {
        
        final String[] TRAMITE = {"Cedulacion", "cita de pasaporte", "Retiro de documentos"};
        
        Cola_Clientes colaClientes = new Cola_Clientes();
        colaClientes = Archivos.hacerColaClientes();
        
        boolean salir = false;
        int op = 0;
        
        
        do{
            Mostrar.menuPrincipal();
            op = Leer.opcion(3, "Elija la opcion a realizar: ");
            switch (op) {
                case 1:
                    while (!colaClientes.isEmpty()) {
                        boolean terminada = false;
                        do {
                            Mostrar.menuProcesos();
                            op = Leer.opcion(4, "Elija la opcion a realizar: ");
                        
                            switch (op) {
                                case 1:
                                    System.out.println("LA PARTE IMPORTANTE NO DIO TIEMPO; QUE DECEPCION");
                                 
                                    break;
                                case 2:
                                    System.out.println("LA PARTE IMPORTANTE NO DIO TIEMPO; QUE DECEPCION");
                                
                                    
                                    break;
                                case 3:
                                    System.out.println("LA PARTE IMPORTANTE NO DIO TIEMPO; QUE DECEPCION");
                                   
                                    break;
                                case 4:
                                    System.out.println("LA PARTE IMPORTANTE NO DIO TIEMPO; QUE DECEPCION");
                                    
                                default:
                                if (op != -1) {
                                    Mostrar.error("La opcion no es valida.");
                                }
                            }
                        }while(!terminada); 
                    }
                    break;
                case 2:
                   
                    break;
                case 3: 
                    //Salida 
                    Mostrar.salida(); 
                    salir = true;
                    break;
                default:
                    if (op != -1) {
                        Mostrar.error("La opcion no es valida.");
                    }
            }
        }while(!salir); //Culminar.  
    }
}
