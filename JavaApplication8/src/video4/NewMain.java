/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video4;

/**aprendemos a actualizar objetos
 *
 * @author Cecilia Bruna
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota servMasc= new ServicioMascota();// creo objeto servMasc de la clase ServicioMascota va al constructor vacio

         servMasc.fabricaMasc(1); //creo 1 mascotas por teclado
         servMasc.mostraMascota();//muestra las mascotas
         servMasc.actualizarMascota(0); //modifica la que esta en primera posicion
            servMasc.mostraMascota();//vuelve a mostrar mascotas
            servMasc.eliminarMascota(3);// elimina mascota en la posicion tres
            servMasc.mostraMascota();//vuelve a mostrar mascotas
    }
    
}
