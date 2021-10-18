/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**multiplico vector por matriz
 *
 * @author Cecilia Bruna
 */
public class matriz_cardelli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int []vector= new int [2];//declaro vector y lo creo en memoria(dos filas)por defecto inicializa en cero
       int []producto= new int [3];// nuevo vector para recibir el producto de tres filas
       
       int[][]matriz={{4,8,6},{2,1,7}};  // declaro e inicializo matriz con valores predeterminados y no en cero
       //{4,8,6} es la primer fila columnas 1 a3, {2,1,7} es la segunda fila columnas 1a3
        System.out.println("ingrese los valores del vector tamaño"+vector.length+": ");
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         for (int i=0; i<vector.length;i++){ // length es el largo del vector
             System.out.print("V["+i+"]= ");//accede al valor del vector
             vector[i]=leer.nextInt(); // vector i se lee
         }
                 
         //multiplica vector por matriz
         int sum;
         //para cada columna de la matriz
       
         for (int j=0; j<matriz[0].length;j++){ // digo que nuestra matriz tiene 3 columnas
           sum=0; // recorro el vector  y lo multiplico
           for (int i=0; i<vector.length;i++){
               sum +=vector[i]*matriz[i][j];// multiplica cada fila por cada columna, un vector de 3 columnas
           }
           producto[j]=sum;
         }
         String aux = "";
    //mostrar vector
        System.out.println("vector");
        //bucle for mejorado
        for(int elemento: vector){  //recorre elementos x elementos sin ir x subindices
            aux=aux+"["+elemento+"]";
        }
           System.out.println(aux);
           
           //mostrar matriz
           
           System.out.println("\n matriz:");
           //para cada fila de la matriz   
        
           for (int[]fila:matriz) {
                       aux="";                     
               //para cada elemento de la fila
                for (int elemento:fila) {
                    aux=aux+""+elemento;
                }
                  System.out.println(aux);
           }
                  //mostrar resultado
                  aux="";
                   System.out.println("\n* vector X matriz:");
                     for (int elemento:producto) {
                    aux=aux+"["+elemento+"]";
           }
               System.out.println(aux);
        }
    }
      
