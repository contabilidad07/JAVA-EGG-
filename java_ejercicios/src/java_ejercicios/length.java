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
public class length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
        // declara la cadena como un objeto S1 S2       
        String S1 = "GUSTAVO";       
        String S2 = "RockStar";       
 
        // El método length () de String devuelve la longitud de una cadena S1.       
        int length = S1.length();       // LLAMO length a una variable
        System.out.println("Longitud de una cadena es:" + length);       
        // 8 Longitud de una cadena RockStar     
        System.out.println("Longitud de una cadena es:" + S2.length());   
    }
        // TODO code application logic here
    
    
}
