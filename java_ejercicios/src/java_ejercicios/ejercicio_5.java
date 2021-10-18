/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Cecilia Bruna
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grados,f; // defino variables grados y f como reales
        Scanner leer = new Scanner (System. in).useDelimiter("\n");
        System.out.println("ingrese los grados centígrados"); // ingresa datos x teclado
        grados=leer.nextDouble(); // lee los grados como reales
        f= 32+(9*grados/ 5); // funcion f lo pasa a Fahreenheit
     
      
       System.out.println("La temperatura en Fahrenheit:"+f);//muestra x pantalla el resultado f
        // TODO code application logic here
    }
    
}
