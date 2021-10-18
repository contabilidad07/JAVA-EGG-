/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2tarde_colecciones;

import java.util.Comparator;

/**
 *
 * @author Cecilia Bruna
 */
public class Comparadores {
     //Lo declaro estatico al metodo, accedo de forma directa NOMBRECLASE.nombreMetodo
    public static Comparator <Persona> ordenarporApellidoAsc=  new Comparator<Persona> (){// ordena ascendente de la Aa la Z
        @Override
        public int compare(Persona p1, Persona p2){
            return p1.getApellido().compareTo(p2.getApellido());
    }
};
       
     public static Comparator <Persona> ordenarporNombreDesc=  new Comparator<Persona> (){
        @Override
        public int compare(Persona p1, Persona p2){
            return -(p1.getApellido().compareTo(p2.getApellido()));
    }
};
}
