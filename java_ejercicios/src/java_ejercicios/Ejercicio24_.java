/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio24_ {

    
    public static void main(String[] args) { //scanner sc
       Scanner sc = new Scanner(System.in);
    	int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
    	String numCadena;
    	System.out.println("Ingrese el tamaño del vector");//dim es el tamaño
    	int dim = sc.nextInt();
    	sc.nextLine();
   	 
    	double [] vector = new double [dim]; //vector tipo real
   	 
    	for(int i=0; i<dim; i++){
        	vector[i] = Math.round(Math.random()*100000+1);//math.round(redondea al valor mas cercano al entero)del random generado 
    	}
    	for(int i=0; i<dim; i++){
        	System.out.print(vector[i]+" ");
    	}
    	System.out.println("");
   	 
    	for(int i=0; i<dim; i++){
        	numCadena = String.valueOf(vector[i]);//convierte valores en cadena
        	if(numCadena.length()==3){
            	cont1++;
        	}else if(numCadena.length()==4){
            	cont2++;
        	}else if(numCadena.length()==5){
            	cont3++;
        	}else if(numCadena.length()==6){
            	cont4++;
        	}else if(numCadena.length()==7){
            	cont5++;
        	}
    	}
    	System.out.println("Los numeros de 1 cifra son: "+cont1);
    	System.out.println("Los numeros de 2 cifra son: "+cont2);
    	System.out.println("Los numeros de 3 cifra son: "+cont3);
    	System.out.println("Los numeros de 4 cifra son: "+cont4);
    	System.out.println("Los numeros de 5 cifra son: "+cont5);

    }
    
}
