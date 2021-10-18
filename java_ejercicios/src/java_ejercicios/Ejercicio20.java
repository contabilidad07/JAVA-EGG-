/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 *
 * @author Cecilia Bruna
 */
public class Ejercicio20 {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
		int num;

		// entrada de datos
		System.out.println("Ingrese un número entre 1 a 20:");
		num = entrada.nextInt();

		// Validamos que el numero ingresado este en el rango de 1 - 20
		if (num >= 1 && num <= 20) {
			// Mostramos el número
			System.out.print(num + " ");// deja espacio entre comillas para separar con los ** (no es println)porquesalta de linea
			// el for se itera la cantidad de veces del num ingresado e imprime el *
			for (int i = 0; i < num; i++) {
				System.out.print("*"); 
			}
		} else {
			System.out.println("Número ingresado fuera de rango.");
		}
		
		entrada.close();
    }
    
}
