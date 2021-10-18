/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Random;
import java.util.Scanner;

/**Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
Ejemplo:
 *
 * @author Cecilia Bruna
 */
public class Ejercicio26 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Ingrese el tamaño de la matriz:");
        int tam=leer.nextInt();//lee variable tam
        System.out.println("Ingrese los elementos de la Matriz");
        int[][] matriz = new int[tam][tam];
        int[][] traspuesta = new int[tam][tam];
        
        for (int i = 0; i < tam; i++) {// carga la matriz y lee
            for (int j = 0; j < tam; j++) {
                System.out.print("M["+i+"]["+j+"]:");
                matriz[i][j]=leer.nextInt();
            }
        }

        System.out.println("Matriz Generado");//imprime matriz

        for (int[] fila : matriz) {
            String aux = " ";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       
        System.out.println("Matriz Traspuesta"); //iguala matriz a matriz traspuesta
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
               traspuesta[i][j]=matriz[j][i];
            }
        }
        
        for (int[] fila :traspuesta ) {// imprime traspuesta
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       int b=0;
        for (int i = 0; i < tam; i++) {// antisimetrica
            for (int j = 0; j < tam; j++) {
               if((-1*matriz[i][j])!=(traspuesta[i][j]))
               {
                   b=1;
                   break;}
            }
        }
        
        if(b==0)
        {
            System.out.println("Es Antisimetrica");
        }
        else
        {
            System.out.println("No es Antiimtrica");
        }
       
    }
    
}
