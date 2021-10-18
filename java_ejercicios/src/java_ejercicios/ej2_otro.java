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
public class ej2_otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,resultado;
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese numero los numeros para sumar");
        num1=leer.nextInt();
        num2=leer.nextInt();
        resultado= num1+num2;
        System.out.println("el resultado de la suma es : "+ resultado);
    }
    
}
