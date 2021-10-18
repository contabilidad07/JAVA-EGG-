/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video2;

/**
 *
 * @author Cecilia Bruna
 */
public class NewMain {

    /**generamos arraylist con tipo de dato string
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota servMasc= new ServicioMascota();// creo objeto servMasc de la clase ServicioMascota va al constructor vacio
        //creo dos objetos tipo string
        servMasc.crearMascota();// invoco al metodo crearMascota, dos veces porque son dos mascotas
        servMasc.crearMascota();// cada objeto por cada mascota,no hay problema que se llamen igual, las listas soportan elementos duplicados
        servMasc.mostrarMascota(); //muestro
    }
    //hemos creado dos objetos tipo string en base al arraylist o dentro de una lista
    
}
