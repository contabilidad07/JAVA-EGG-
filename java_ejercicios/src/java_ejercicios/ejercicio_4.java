/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 * @author Cecilia Bruna
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System. in).useDelimiter("\n");
        // TODO code application logic here
        System.out.println("ingrese una frase");     
        String frase= leer.next();
        System.out.println("Frase en mayuscula:"+frase.toUpperCase());
        System.out.println("Frase en minuscula:"+frase.toLowerCase());
              
    }
  
}