/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Persona;
import java.util.Comparator;

/**
 *
 * @author Cecilia Bruna
 */
public class Comparadores {
    //Lo declaro estatico al metodo, accedo de forma directa NOMBRECLASE.nombreMetodo
    public static Comparator <Persona> ordenarporApellidoAsc=  new Comparator<Persona> (){
        @Override
        public int compare(Persona o1, Persona o2){
            return o1.getApellido().compareTo(o2.getApellido());
    }
};
       
     public static Comparator <Persona> ordenarporNombreDesc=  new Comparator<Persona> (){
        @Override
        public int compare(Persona p1, Persona p2){
            return -(p1.getApellido().compareTo(p2.getApellido()));
    }
};
}
