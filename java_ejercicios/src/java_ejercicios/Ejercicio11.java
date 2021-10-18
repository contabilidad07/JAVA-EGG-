/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase o palabra que comienze con A:");
        String fraseopalabra=leer.next();
        
        String letra=fraseopalabra.substring(0,1);// DEVUELVE SOLO EL PRIMER CARACTER, inicia en 0 y el caracter 1 se excluye
        // substring (caracter inicial incluido, caracter final excluido)
        System.out.println("la primer letra es:"+letra);
        
        if(letra.equalsIgnoreCase("A"))// que ignore si es mayuscula o minuscula
        {
            System.out.println("CORRECTO");
        }
        else         {
            System.out.println("INCORECTO");
        }
        
    }
    
}
