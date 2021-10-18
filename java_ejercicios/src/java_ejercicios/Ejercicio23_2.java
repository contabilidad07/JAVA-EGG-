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
public class Ejercicio23_2 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    	int cont=0;
    	System.out.println("Ingrese el tamaño del vector");
    	int dim = sc.nextInt();//lee tamaño dim
    	sc.nextLine();
   	 
    	double [] vector = new double [dim];
   	 
    	for(int i=0; i<dim; i++){
        	vector[i] = Math.round(Math.random()*10);//math round (redondea a entero)numeros entre cero y 10 (sin incluir cero ni 10)
    	}
    	for(int i=0; i<dim; i++){
        	System.out.println(vector[i]);;
    	}
   	 
    	System.out.println("Ingrese un numero a buscar");
    	double num = sc.nextDouble();
   	 
    	for(int j=0; j<dim; j++){
        	if(vector[j]==num){
            	System.out.println("El numero se encuentra en la posición: "+(j+1));
            	cont++;
        	}
    	}
    	if(cont>1){
        	System.out.println("El numero estaba repetido");
    	}else if(cont==0){
        	System.out.println("El numero no esta en el vector");

    }
    
}
}
