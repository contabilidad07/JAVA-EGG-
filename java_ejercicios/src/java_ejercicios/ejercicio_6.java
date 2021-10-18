/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class ejercicio_6 {

    /**Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero:");
        int num=leer.nextInt();
        
        System.out.println("El doble de "+num+" es:"+(2*num));
        System.out.println("El triple de "+num+" es:"+(3*num));
        System.out.println("El raiz cuadrada de "+num+" es:"+(Math.sqrt(num)));
        // TODO code application logic here
      
    }
    
}
