/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1tarde_repaso;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class PersonaServicio {
     private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona cargarPersonas() {
        System.out.println("Ingrese su nombre");
        String nombreI = leer.next();

        System.out.println("Ingrese su apellido");
        String apellidoI = leer.next();
//        //Creo los objetos usando el contructor vacio y dps VALORES
//        Persona nuevaP =  new Persona();
//        nuevaP.setNombre(nombreI.toUpperCase());
//        nuevaP.setApellido(apellidoI.toUpperCase());      
//        return nuevaP;     
        return new Persona (nombreI,apellidoI);
    }
        
    
    /** puedo crear con metodo void
     
     public void cargarPersonas() {
        System.out.println("Ingrese su nombre");
        String nombreI = leer.next();
        System.out.println("Ingrese su apellido");
        String apellidoI = leer.next();
        /Creo los objetos usando el contructor vacio y dps VALORES
        Persona nuevaP =  new Persona();
        nuevaP.setNombre(nombreI.toUpperCase());
        nuevaP.setApellido(apellidoI.toUpperCase()); 
        * 
        otra opcion constructor recibe parametros   
       Persona nuevaP2= new Persona(nombreI,apellidoI); y no uso los seters
        */
    

    public void imprimirAlguno(Persona personaCualquiera){
        //Creo un metodo, que reciba un OBJETO del tipo PERSONA, y muestro un atributo....
        if (personaCualquiera!=null) {
            System.out.println("La persona de apellido: " +personaCualquiera.getApellido() + " hoy come PASTA" );
        }
        
    }
}
