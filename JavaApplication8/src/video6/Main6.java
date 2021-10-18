/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cecilia Bruna
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Mascota> mascotas= new ArrayList();//ArrayList de clase mascota, objeto mascotas
       mascotas.add(new Mascota("Fer","chiquito", "perro"));// creo objetos y se los añado al arraylist
         mascotas.add(new Mascota("Pepe","verdi", "loro"));
            mascotas.add(new Mascota("Pepe","verdi", "loro"));
         Collections.sort(mascotas,Comparadores.ordenarPorNombreDesc);//sobreescribe la coleccion ordenandola de una manera determinada
         Collections.shuffle(mascotas);//lo desordena
         for  (Mascota mascota:mascotas){//for each para recorrerlo, clase Mascota, variable mascota la igualo al objeto mascotas
             System.out.println(mascota);
                 
            
        }
    }
    
}
