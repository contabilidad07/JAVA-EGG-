/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Random;
import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author Cecilia Bruna
 */
public class Ejercicio24 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();//metodo Random
        System.out.print("Ingrese el tamaño del vector:");
        int tam=leer.nextInt();
        
        int[] vector= new int[tam];//define vector segun tamaño ingresado
        for(int i = 0; i <tam; i++) {
            vector[i] = random.nextInt((100000 - 0) + 0) ; //random.nextInt((MAX - min) + min)
        }
        System.out.println("Vector Generado");//imprime vector
        String aux="";//aux es espacio variable tipo string
        for(int elemento : vector)// elemento toma datos de vector
        {
            aux=aux+"[" +elemento+ "]";// espacio + vector, lo acumula segun tamaño vector
        }
        System.out.println(aux);//muestra vector
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i = 0; i <tam; i++) {
            if(vector[i]<10)//cuenta numeros con un digito
            {c1=c1+1;}
            if(vector[i]<100)//cuenta numeros con dos digitos
            {c2=c2+1;}
            if(vector[i]<1000)
            {c3=c3+1;}
            if(vector[i]<10000)
            {c4=c4+1;}
            if(vector[i]<100000)
            {c5=c5+1;}
        }
        System.out.println("Numero de 1 digito: "+c1);
        System.out.println("Numero de 2 digito: "+c2);
        System.out.println("Numero de 3 digito: "+c3);
        System.out.println("Numero de 4 digito: "+c4);
        System.out.println("Numero de 5 digito: "+c5);
        
    }
    
}
