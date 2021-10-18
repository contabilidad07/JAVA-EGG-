/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 * @author Cecilia Bruna
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println (" ingrese una frase");
        String frase=leer.next();
        if (frase.equalsIgnoreCase("eureka")) //equals para igualar  textos
                                                // equals ignorecase (para ignorar mayusculas) que compare en minusculas
                                                // SI escribo en mayusculas lo toma igual
        {
            System.out.println (" La frase es correcta ");
        } 
        else { 
                System.out.println (" La frase es incorrecta ");
                
        }
    
    }
}