/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 *
 * @author Cecilia Bruna
 */
public class Ej_7_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero entero N°1:");
        int n1=leer.nextInt();
        
        System.out.println("Ingrese el numero entero N°2:");
        int n2=leer.nextInt();
        
        if(n1>n2){
            System.out.println("El numero "+n1+" es mayor que "+n2);
        }
        else{                      // si n1 no es mayor a n2 pero aca no puse condicion, esta vacia, solo imprime
            System.out.println("El numero "+n2+" es mayor que "+n1);
        }
    }
    
}
