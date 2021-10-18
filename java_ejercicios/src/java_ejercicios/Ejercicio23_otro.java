/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio23_otro {

    /**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese tamaño del vector");
        int n = scan.nextInt(); // leer n (tamaño)
        System.out.println("Ingrese numero a buscar");
        int numero = scan.nextInt(); // leer numero
        int[] vector = new int[n];// defino vector tamaño n
        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * 10);
            if (vector[i] == numero) {
                contador += 1;
            }
        }
        String[] posiciones = new String[contador];
        contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                posiciones[contador] = Integer.toString(i);
                contador += 1;
            }
        }
        System.out.println("Se repite " + contador + " veces");
        System.out.println(Arrays.toString(posiciones));
        scan.close();
    }
    
}
