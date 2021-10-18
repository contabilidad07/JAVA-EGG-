/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio25_ {

   
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 10);
            }
        }
        System.out.println("La matriz:");//imprime matriz
        for (int i = 0; i < 4; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("La matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }
    
}
