/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 *
 * @author Cecilia Bruna
 */
public class Ejercicio26_ {

    
    public static void main(String[] args) {
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        n=leer.nextInt();
        int matriz[][]=new int [n][n];
        int matrizT[][]=new int [n][n];
        int cont=0;
        
        System.out.println("Ingrese los elementos de la matriz: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){// lee elementos
                System.out.print("M["+i+"]["+j+"]:");
                matriz[i][j]=leer.nextInt();
                
            }
          
        }
        System.out.println("LA MATRIZ GENERADA ES: ");//IMPRIME MATRIZ CARGADA
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
         System.out.println("LA MATRIZ TRASPUESTA ES: ");//IMPRIME MATRIZ TRASPUESTA
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                matrizT[i][j]=matriz[j][i];// iguala matriz a traspuesta y la imprime
                System.out.print("["+matrizT[i][j]+"]");
                
                if(-matrizT[i][j]==matriz[i][j]){//antisimetrica
                    cont=cont+1;
                }
                
            }
            System.out.println("");
        }
        if(cont==n*n){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
