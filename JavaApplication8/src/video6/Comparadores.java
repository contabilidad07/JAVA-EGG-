/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video6;

import java.util.Comparator;

/**uso una clase para tener los Comparadores
 *
 * @author Cecilia Bruna
 */
public class Comparadores {
    public static Comparator<Mascota>ordenarPorNombreDesc= new Comparator<Mascota>() {//importo clase comparator, me coloco al final de <Mascota> ctrol+espacio y aparece lo siguente
        // le digo que Comparator tiene que trabajar con mascota
        @Override
        public int compare(Mascota o1, Mascota o2) {// metodo compare es una interface, hace una comparacion entre atributos u objetos y devuelve un valor
           return o2.getNombre().compareTo(o1.getNombre());// el segundo objeto o2 lo compara con o1. comparacion tipo string
        }
        public static Comparator<Mascota>ordenarPorEdadDesc= new Comparator<Mascota>() {//importo clase comparator, me coloco al final de <Mascota> ctrol+espacio y aparece lo siguente
        // le digo que Comparator tiene que trabajar con mascota
        @Override
        public int compare(Mascota o1, Mascota o2) {// metodo compare es una interface, hace una comparacion entre atributos u objetos y devuelve un valor
           return o2.getEdad().compareTo(o1.getEdad());// el segundo objeto o2 lo compara con o1. comparacion tipo string
        }
        }
                
            

        
    
                

