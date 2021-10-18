/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Cecilia Bruna
 */
public class servicioMascota {

    private Scanner leer = new Scanner (System.in);
    public Mascota crearMascota(){
        System.out.println("introducir nombre");// ingreso atributos por teclado del objeto
        String nombre = leer.next(); // lee nombre ingresado x teclado
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
         System.out.println("introducir tipo");
        String tipo = leer.next();
        
        Mascota m = new Mascota(nombre, apodo, tipo);
        return m;
}
    
}