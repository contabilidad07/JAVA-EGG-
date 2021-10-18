/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €  libras
* 1.28611 $ es un 1 € dolares
* 129.852 yenes es un 1 €
 *
 * @author Cecilia Bruna
 */
public class Ejercicio21 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el monto(€)");
        double monto = leer.nextDouble();
        System.out.println("Convertir a Dolares,Yenes,Libra");
        String tipodemoneda = leer.next();
        tipodemoneda = tipodemoneda.toUpperCase();
        
        switch (tipodemoneda) {
            case "DOLARES":
                System.out.print( monto + " EURO");
                monto = monto * 1.28611;
                System.out.print(" es igual a " + monto + " " + tipodemoneda);
                System.out.println("");
                break;
            case "YENES":
                System.out.print("" + monto + " EURO");
                monto = monto * 129.852;
                System.out.print(" es igual a " + monto + " " + tipodemoneda);
                System.out.println("");
                break;
            case "LIBRAS":
                System.out.print("" + monto + " EURO");
                monto = monto * 0.86;
                System.out.print(" es igual a " + monto + " " + tipodemoneda);
                System.out.println("");
                break;
            default:
                System.out.println("Tipo de moneda mal ingresado");
        }
    }
    
}
