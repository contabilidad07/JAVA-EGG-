/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio27 {

   
    public static void main(String[] args) {
       //INSERTO EL ORDEN DE LA MATRIZ
       int n;
       int contador=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        n=leer.nextInt();
        int matriz[][]=new int [n][n];
       
       System.out.println("Ingrese los elementos de la matriz: ");//RELLENO MATRIZ
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                matriz[i][j]=leer.nextInt();
                while(matriz[i][j]<0||matriz[i][j]>10){
                    System.out.println("Valores permitidos solo del 1 al 9, ingrese el valor nuevamente");
                     matriz[i][j]=leer.nextInt();
                }
                
               
            }                              
          
        }//         MUESTRO LA MATRIZ QUE RELLENÃ‰
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        //          EVALUO LA MATRIZ
        
        //Primero sumo las filas y cada resultado las almaceno en un vector llamado guardaSumas
        int sumaFila=0;
        
        int guardaSumas[]=new int[(n*2)+2];//creo vector para sumar filas
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            sumaFila=sumaFila+matriz[i][j];// creo variable sumafilas para sumar la matriz
            }
            guardaSumas[contador]=sumaFila;
            sumaFila=0;
            contador=contador+1;
        }
        //Hago la suma de las columnas
        
        int sumaColumnas=0;
        
        for(int i=0;i<n;i++){
        
        for(int j=0;j<n;j++){
            sumaColumnas=sumaColumnas+matriz[j][i];
        }
        guardaSumas[contador]=sumaColumnas;
        sumaColumnas=0;
        contador=contador+1;
        }
        //Ahora sumo la diagonal principal
        int sumaDiagonal=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sumaDiagonal=sumaDiagonal+matriz[i][j];
                }
            }
        }
        guardaSumas[contador]=sumaDiagonal;
        contador=contador+1;
        
        int sumaDiagonalContra=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    sumaDiagonalContra=sumaDiagonalContra+matriz[i][j];
                }
            }
        }
        guardaSumas[contador]=sumaDiagonalContra;
        
        int contadorAux=0;
        int aux=guardaSumas[0];
        for(int i=0;i<contador;i++){
            if(aux==guardaSumas[i]){
                contadorAux=contadorAux+1;
            }
        }
        if(contador==contadorAux){
            System.out.println("La matriz es magica ");
        }else{
            System.out.println("La matriz no es magica");
        }
    }
    
}
