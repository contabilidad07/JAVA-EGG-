/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio22 {

  
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int[] vector= new int[100];//defino vector 
        int i,j=0;
        for(i=(vector.length)-1;i>=0;i--)
        {
            vector[j]=i;
            j++;
        }
                String aux="";
        for(int elemento : vector)
        {
            aux=aux+"["+elemento+"]";
        }
        System.out.println(aux);
        
    }
    
}
