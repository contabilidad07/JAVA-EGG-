/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejerecicio4 {


    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo();// objeto rectangulo1 vacio
   	 
    	rectangulo1.crearRectangulo();
    	System.out.println("El perimetro es: "+ rectangulo1.perimetro());
    	System.out.println("La superficie es: "+ rectangulo1.superficie());
    	rectangulo1.dibujarRectangulo();

    }
    
}
