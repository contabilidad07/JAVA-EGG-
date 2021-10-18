/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Random;
import java.util.Scanner;

/**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 *
 * @author Cecilia Bruna
 * 
 */
public class Ejercicio23 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random(); //importo java.util Random y crea un objeto random
        //Random variable= new Random (). genera numeros aleatorios que cambian en cada ejecucion
        System.out.print("Ingrese el tamaño del vector:");
        int tam=leer.nextInt();// lee tamaño
        System.out.print("Ingrese el numero a Buscar:");
        int buscar=leer.nextInt();//lee numero a buscar
        int[] vector= new int[tam]; // define tamaño
        for(int i = 0; i <tam; i++) {
            //para generar un numero aleatorio random.nextInt (entre 1 y 10)+0(incluido cero)
            vector[i] = random.nextInt((10 - 0) + 0) ; //random.nextInt((MAX - min) + min)
        }
       
        System.out.println("Vector Generado");//imprime
        String aux="";
        for(int elemento : vector) // imprime for each
        {
            aux=aux+"["+elemento+"]";
        }
        System.out.println(aux);
        // busca el numero
        int contador=0;
         for(int i = 0; i <tam; i++) {
            if(buscar==vector[i])// si encuentra el numero dice donde esta y cuenta
            {
                System.out.println("*El "+buscar+" se envuenta en v["+i+"]");
                contador=contador+1;
            }
        }
        System.out.println("#El numero "+buscar+" se repite "+contador);
    }
    
}
