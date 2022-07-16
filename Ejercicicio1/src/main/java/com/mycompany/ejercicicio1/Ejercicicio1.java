/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicicio1;

/**
 *
 * @author RICHARD RIVERA
 */

/*
*elabore una función que imprima en pantalla los resultados de satisfacción de las llamadas de atención al cliente de una empresa de servicios, con data generada en un arreglo con los siguientes datos:
[
["Silvestre Cárdenas", "8"],
["Andrés López", "1"],
["Andreina Gonzalez","5"],
["Maria Perez","0"],
["Armando Paredes","10"]
]
Donde deberá imprimirse el resultado de satisfacción de los clientes bajo los siguientes criterios:
0: el cliente no atendió.
1~4: no satisfecho.
5: neutro.
6~8: satisfecho.
9~10: muy satisfecho.
*/


public class Ejercicicio1 {

    public static void main(String[] args) {
        
        String n = "", ape = "";
        int se = 0;
        Personas Atencion[]={new Personas("Silvestre","Cardenas",8), new Personas("Andrés","López",1), new Personas("Andreina","Gonzalez",5), 
            new Personas("Maria","Perez",0), new Personas("Armando","Paredes",10)};
        Personas s = new Personas(n,ape,se);
        
        
        System.out.print("El cliente #1" + Atencion[0]+ " Esta: "); s.satisfaccion(8); System.out.print(" Con la atencion.");
        System.out.println();
        System.out.print("El cliente #2" + Atencion[1]+ " Esta: "); s.satisfaccion(1); System.out.print(" Con la atencion.");
        System.out.println();
        System.out.print("El cliente #3" + Atencion[2]+ " Esta: "); s.satisfaccion(5); System.out.print(" Con la atencion.");
        System.out.println();
        System.out.print("El cliente #4" + Atencion[3]+ " Esta: "); s.satisfaccion(0); System.out.print(" Con la atencion.");
        System.out.println();
        System.out.print("El cliente #5" + Atencion[4]+ " Esta: "); s.satisfaccion(10); System.out.print(" Con la atencion.");
         

    }
}
