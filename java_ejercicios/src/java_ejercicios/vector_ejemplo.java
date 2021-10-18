/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

/**
 *
 * @author Cecilia Bruna
 */
public class vector_ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 5; i++) {
         
            vector[i] = 6; // Le asignamos a cada posicion del vector el numero 6 
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print("[" + vector[i] + "]");
            
        }
        
        System.out.println(" ");
    }
    
}
