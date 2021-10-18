/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Crear un programa que dado un numero determine si es par o impar.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println(" ingrese un numero");
        num=leer.nextInt();
         if (num%2==0)
         {
            System.out.println("El numero "+num+" es par");
        }
         else {
              System.out.println("El numero "+num+" es impar");
         }
// TODO code application logic here
    }
    
}
