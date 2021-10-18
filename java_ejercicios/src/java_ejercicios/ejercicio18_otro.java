/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/****Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 *
 * @author Cecilia Bruna
 */
public class ejercicio18_otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Limitaremos hasta donde contara el contador:");
        System.out.println("Ingrese el último digito del contador (X-X-X)");
        int num = leer.nextInt();
        int i,j;
        String conversor;
        for(i=0;i<=num;i++)
        {
            conversor = String.valueOf(i); // string..valueOf convierte el dato (i) en tipo cadena
            if(i<10) // en primer digito (unidad)
            {
                System.out.println("Contador: 00"+conversor.replace('3', 'E'));//imprime los dos ultimos 00 y el primer digito lo reemplaza
            }
            else if(i<100)//segundo digito (decena)
                {
                    System.out.println("Contador: 0"+conversor.replace('3', 'E'));//imprime el  ultimo 0 y el primer y segundo digito lo reemplaza
            }
                
            else if(i>99)
                {System.out.println("Contador: "+conversor.replace('3', 'E'));}
                }
        
            
    }
}
    
