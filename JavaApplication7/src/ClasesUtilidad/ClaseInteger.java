/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesUtilidad;

/**
 *
 * @author Cecilia Bruna
 */
public class ClaseInteger {
     public static void main(String[] args) {

        Integer numero1 = 10; //objeto clase integer numero1

        Integer numero2 = 15;

        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("El numero " + numero1 + " comparado con " + numero2
                + " para saber si son iguales dio un resultado de " + numero1.compareTo(numero2));// cuando es distinto da -1

        System.out.println("------------------------------------------------------");
        System.out.println("DoubleValue: ");

        double numReal = numero1.doubleValue();// pasa de entero a double real

        System.out.println("Numero transformado a real: " + numReal);

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("El numero " + numero1 + " es igual a 10"
                + "/ Resultado: " + numero1.equals(10));//devuelve true o false

        System.out.println("------------------------------------------------------");
        System.out.println("ParseInt: ");

        int num = Integer.parseInt("20");//pasa cadena a numero

        System.out.println("La cadena pasada a num quedo: " + num);

        System.out.println("------------------------------------------------------");
        System.out.println("ToString: ");

        String numCadena = numero1.toString();// numero a cadena, integer a string

        System.out.println("El numero pasado a cadena quedo: " + numCadena);

    }
}
