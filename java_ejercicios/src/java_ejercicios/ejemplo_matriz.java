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
public class ejemplo_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // DEFINO matriz
        
     int[][] matriz= new int[2][3]; //inicializa matriz de 2 filas y 3 columnas
     System.out.println("ingrese valor matriz");
     for (int i=0;i<2;i++){  // recorre 2filas
         for (int j=0;j<3;j++){ // recorre 3 columnas
        System.out.println("ingrese valor fila ["+i+"]. Columna ["+j+"]");
       matriz [i][j]=leer.nextInt(); // lee la matriz
         }    
       
    }
     // imprimir matriz
        System.out.println("la matriz es :");
          for (int i=0;i<2;i++){  // recorre 2filas
         for (int j=0;j<3;j++){ // recorre 3 columnas2
       System.out.print("["+matriz [i][j]+"]");
         }
         System.out.println("");// que salte en cada fila
        
          
          }
            
    }
}


