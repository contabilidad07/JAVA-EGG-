/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 * @author Cecilia Bruna
 */
public class Ejercicio13 {

        public static void main(String[] args) {
        int nota;
        Scanner leer=new Scanner (System.in).useDelimiter ("\n");
        do {
             System.out.println("Ingrese la nota (0 a 10):");
            nota=leer.nextInt();
            if (nota>=0&&nota<=10){
                System.out.println(" la nota ingresada es correcta ");
                break;
                
            }else {
                System.out.println("la nota ingresada es incorrcta");
            }
          
        } while (nota<0||nota>10);
       
    }
    
}
