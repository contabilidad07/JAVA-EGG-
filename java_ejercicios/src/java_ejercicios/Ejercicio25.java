/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Random;
import java.util.Scanner;

/**Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y
muestre traspuesta. ¿Que es una matriz traspuesta?
* 
* 
 *
 * @author Cecilia Bruna
 */
public class Ejercicio25 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int[][] matriz = new int[4][4];//define matriz
        for (int i = 0; i < 4; i++) {//recorre matriz
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt((10 - 0) + 0); //random.nextInt((MAX - min) + min)incluye 0
            }
        }

        System.out.println("Matriz Generada");//imprime matriz

        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       
        System.out.println("Matriz Traspuesta");//muestra traspuesta (cambia el orden de la matriz al mostrarla (j, i)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
