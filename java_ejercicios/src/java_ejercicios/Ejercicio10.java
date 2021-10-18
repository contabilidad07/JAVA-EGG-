/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio10 {

    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase de 8 caracter:");
        String frase=leer.next();
        System.out.println("la longitud es: "+frase.length());// lo puse para medir la longitud
        
        if(frase.length()==8) //length es la longitud de la frase
        {
            System.out.println("CORRECTO");
        }
        else
        {
            System.out.println("INCORRECTO");
        }
  
    }
    
}
