/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia();// creo objeto circunferencia1 y pasa los valores al metodo vacio
         circunferencia1.crearRadio();//imvoco metodo crear radio del objeto circunferencia1 para leer valores por teclado
         System.out.println("El area es: "+circunferencia1.area()); //invoco al metodo area
        System.out.println("El perimetro es: "+circunferencia1.perimetro());// invoco al metodo perimetro
    }
    
}
