/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 *
 * @author Cecilia Bruna
 */
public class Ejercicio1_Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main
       Libro libro1 = new Libro(); //creo objeto libro1, de la clase Libro con el constructor vacio
   	 
    	libro1.cargarDatos();//llamo al metodo cargar datos
    	libro1.mostrarDatos();//llamo al metodo para mostrar los datos

    }
    
}
