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
public class Ejercicio27_ {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Matriz Magica");

        int tam = 0;
        do {
            System.out.print("Ingrese el tamaño de la matriz(orden minimo 2):");//ingresa tamaño mayor a 1
            tam = leer.nextInt();
        } while (tam < 2);

        int[][] matriz = new int[tam][tam];//define matriz
        System.out.println("Ingrese los elemento de la matriz:");// recorre matriz mientras los elementos entre 1 y 9
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                do {
                    System.out.print("M[" + i + "][" + j + "]:");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }

        System.out.println("Matriz Cargada");//imprime matriz cargada
        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }

        System.out.println("Suma Filas ");// crea vector para sumar filas
        int[] vectorfila = new int[tam];
        int a = 0;
        
        for (int[] fila : matriz) {
            int sumafila = 0;
            for (int elemento : fila) {
                sumafila += +elemento;//sumafila=sumafila+elemento
            }
            System.out.println("[" + sumafila + "]");
            vectorfila[a] = sumafila;
            a = a + 1;
        }

        int c1 = 0, c2 = 0, sumacolumna = 0;
        int[] vectorcolumna = new int[tam];

        System.out.println("Suma Columnas");

        do {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    if (c1 == c2) {
                        sumacolumna = sumacolumna + elemento;
                    }
                    c1 = c1 + 1;
                }
                c1 = 0;
            }
            System.out.print("[" + sumacolumna + "]");
            vectorcolumna[c2] = sumacolumna;
            sumacolumna = 0;
            c2 = c2 + 1;
        } while (c2 < tam);
        System.out.println("");

        System.out.println("Diagonal Principal");
        int diagonal = 0;
        for (int i = 0; i < tam; i++) {
            diagonal = diagonal + matriz[i][i];
        }
        System.out.println("[" + diagonal + "]");

        //comparamos los valores calculados
        int contador = 0;
        for (int i = 0; i < tam; i++) {
            if (diagonal == vectorfila[i] && diagonal == vectorcolumna[i]) {
                contador = contador + 1;
            }
        }

        if (contador == 3) {
            System.out.println("Es una Matriz Magica");
        } else {
            System.out.println("No es una Matriz Magica");
        }
        /* <<<<<<<<<<<<<< PRECAUCION >>>>>>>>>>>>>>>>>
       EN ESTE PROGRAMA SE HACE USO CASI EN SU TOTALIDAD DEL "FOR MEJORADO"*/

    }
    
}
