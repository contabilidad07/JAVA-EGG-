/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio16 {  

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         int i,n,sum=0; //es un vector de 20 numeros, mejor usar el for, desde la posicion cero hasta posicion 19
        for(i=0;i<20;i++)// i++ es que avance en uno
        {System.out.println("ingrese el numero "+ i+"°");
        n=leer.nextInt();
        if (n==0){
            System.out.println("se capturo el numero cero");
        break;       
       
        }else if (n>0){
              sum=sum+n;
           }else{ System.out.println("ingrese numeros positivos");
        
        }
        }
        System.out.println("la suma de los numeros ingresados es: "+sum);
    
         
    }
    
}
