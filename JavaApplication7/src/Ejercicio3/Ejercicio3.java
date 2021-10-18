/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
         Operacion operacion1 = new Operacion();// objeto operacion1
        
        operacion1.crearOperacion();
        System.out.println("La suma es: "+ operacion1.sumar());
        System.out.println("La resta es: "+ operacion1.restar());
        
        System.out.println("La multiplicacion es: "+ operacion1.multiplicar());
        System.out.println("La division es: "+ operacion1.dividir());
    }
    
}
