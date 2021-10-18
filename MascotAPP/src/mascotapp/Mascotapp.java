/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota; //importo la clase mascota del paquete mascotapp.entidades
import mascotapp.servicios.servicioMascota;

/**
 *
 * @author Cecilia Bruna
 */
public class Mascotapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// metodo main
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("CHIQUITO", leer.next(), "perro");// primero importo clase mascota del paquete mascotapp.entidades y creo objet m1 para leer sus atributos
        servicioMascota sm= new servicioMascota();
        // tome el segundo constructor de mascota  public Mascota(String nombre, String apodo, String tipo) {
        
        //System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " "); // la edad da cero porque no esta en el constructor
        //video 3, luego se saca, se inicializaron los atributos del objeto m1 que estaban en clase Mascota
//        luego creo el objeto m1 de la clase Mascota
//        m1.apodo = "chiquito";// relleno los atributos de la clase Mascota, invocandolos con el objeto m1
//        m1.nombre = leer.next();
//        m1.tipo = "perro";
//        m1.edad = 14;
//        m1.raza = "Beagle";
//        m1.cola=true;
//        m1.color="tricolor";
//        //muestro los datos del objeto m1
//        System.out.println("apodo: "+m1.apodo+ ", nombre: "+m1.nombre+ ", tipo: "+m1.tipo+", edad: "+m1.edad+", raza: "+m1.raza+", color: "+m1.color);

//          en video 4 se reemplaza por el metodo constructor    
        m1.setNombre("saquito");// cambie el nombre chiquito por saquito
        m1.pasear(100);// en video 7, se invoca el metodo pasear
        System.out.println(m1);
        
    }
}
