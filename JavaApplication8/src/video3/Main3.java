/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video3;

/**
 *
 * @author Cecilia Bruna
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioMascota servMasc= new ServicioMascota();// creo objeto servMasc de la clase ServicioMascota va al constructor vacio

         servMasc.fabricaMasc(2); //creo dos mascotas por teclad
        servMasc.fabricachiquitos(2); //creo 2 perros chiquitos
        servMasc.mostraMascota();
  
    }
    
}
