/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import java.util.Objects;
import java.util.Scanner;

/**Función numeroCapicua():
La función recibirá un numero x y deberá determinar si es capicúa o no. Este deberá
devolver verdadero(true) si es capicúa y falso(false) si no lo es. Además deberemos
contemplar los siguientes escenarios:
• Contemplar que el numero que llega puede ser negativo.
• Contemplar que el numero que llega puede ser de un digito, si es así debe devolver
true.
• Contemplar que el numero que llega puede ser null, si es así debe devolver false.
Resultados esperados:
Si se ingresa el numero 123454321 deberá devolver true.
Si se ingresa el numero -123454321 deberá devolver true.
Si se ingresa el numero 2 deberá devolver true.
Si se ingresa el numero 0 deberá devolver true.
Si se ingresa null deberá devolver false.
Si se ingresa el numero 231 deberá devolver false.
Si se ingresa el numero 123 deberá devolver true.
 *
 * @author Cecilia Bruna
 */
public class Integrador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer numero;
        boolean ver;

        System.out.print("Introduce un número: ");
        numero = leer.nextInt();

        ver = numeroCapicua(numero);

        System.out.println("La funcion me devuelve: " + ver);

    }

    /*--------------------------- FUNCION ----------------------------------*/
    public static boolean numeroCapicua(Integer numero) {
        Integer aux, inverso = 0, cifra;
        boolean estado;
        if (numero == null) {
            estado = false;
        } else {

            //le damos la vuelta al número
            aux = numero;
            System.out.println("<<< TABLA >>>");
            while (aux != 0) {
                cifra = aux % 10;
                inverso = inverso * 10 + cifra;
                aux = aux / 10;
                System.out.println(cifra + "\t" + inverso + "\t" + aux);
            }

            if (Objects.equals(inverso, numero)) {
                System.out.println("Es capicua");
                estado = true;
//                return estado;

            } else {
                System.out.println("No es capicua");
                estado = false;
//                return estado;
            }
        }
        return estado;
    }
    /*-------------------------------------------------------------*/
}

    
    

