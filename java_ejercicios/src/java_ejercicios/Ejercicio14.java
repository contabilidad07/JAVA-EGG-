

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 * @author Cecilia Bruna
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un valor limite:");
        int limite = leer.nextInt();
        int valor, suma = 0, i = 1;
        do {
            System.out.println("Ingrese valor n°" + i);
            valor = leer.nextInt();
            if (valor>0){ // si el numero es positivo suma y cuenta
                
            suma = suma + valor;
            i = i + 1;
            }else {
                System.out.println("ingrese un numero positivo ");
            }
            
          
        } while (suma < limite);
        System.out.println("Se supero el limite ingresado");
        // TODO code application logic here
    }
    
}
