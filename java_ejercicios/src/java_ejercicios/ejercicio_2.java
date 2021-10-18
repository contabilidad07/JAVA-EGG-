/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;// 1)nombre del paquete

import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la sumaEscribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 * @author Cecilia Bruna
 */
public class ejercicio_2 {//nombre clase 2)creo la clase o programa
    //en package, new,other, java, java main clas (creo metodo main)
    //que invoca  subprograma dento de la clase llamada metodo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//main es una funcion
        //string vector de cadena, recibe parametros (args)
        // agrego scanner y da error, con lupa agrego import ,que importa un codigo de java
        //(add impor for java util scanner) y se inserta arriba import (importa un codigo de java)
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");// Scanner es leer como pseint
        //scaner es una fc de leer, y le sigue la variable que llamé leer  y asigno un objeto que es new scanner
        //(system.in) lee lo que ingrese por teclado
        //System.out es la salida x pantalla
        System.out.println("Ingrese el numero entero N°1:");
        int n1=leer.nextInt();//int es para dato entero
        
        System.out.println("Ingrese el numero entero N°2:");
        int n2=leer.nextInt();
        
        System.out.println("La suma de los numero "+n1+"+"+n2+"="+(n1+n2));
    }
    
}
