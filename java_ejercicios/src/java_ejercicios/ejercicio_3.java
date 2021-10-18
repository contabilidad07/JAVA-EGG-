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
public class ejercicio_3 {

    /**Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        // defino variable de cadena llamada nombre
        System.out.println("ingrese su nombre");//muestra por pantalla
        String nombre=leer.next();//lee LA VARIABLE NOMBRE DE CADENA
        System.out.println("Su nombre es:  "+nombre);//MUESTRA POR PANTALLA
        // TODO code application logic here
    }
    
}
