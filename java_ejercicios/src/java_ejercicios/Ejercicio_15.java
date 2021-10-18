/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio_15 {

  
    public static void main(String[] args) {
        int num1,num2;
       
        Scanner leer=new Scanner (System.in).useDelimiter ("\n");
       do{
            System.out.println("ingrese el primer numero  mayor que cero ");
             num1=leer.nextInt();
            System.out.println("ingrese el segundo numero  mayor que cero ");
             num2=leer.nextInt();
            
       
        }while (num1<0||num2<0);
                 

       int opcion;
        String dato;
        do{
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma de " +num1+ " + " +num2+ " es " +(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de " +num1+ " - " +num2+ " es "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de " +num1+ " * " +num2+ " es " +(num1*num2));
                    break;
                case 4:
                    System.out.println("La division de " +num1+ " / " +num2+ " es " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Desea Salir?");
                    
                         
                    dato=leer.next();
                    if (dato.equals ("si")){
                    opcion=7;
                    break;
                                       
                    }
                
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
        }while(opcion<6);
                        
                    
    }
    
}
