/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1tarde_repaso;

/**
 *
 * @author Cecilia Bruna
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo instancia de mi servicio para poder acceder a sus metodos.
        PersonaServicio nuevaEjecucion = new PersonaServicio();
        //Cargo dos personas haciendo uso del metodo
        Persona persona1 = nuevaEjecucion.cargarPersonas();   
        Persona persona2 = nuevaEjecucion.cargarPersonas();  
        //Cargo una personas haciendo uso del constructor que recibe parametros
        Persona persona3 = new Persona("ADRIANA","BESTILLEIRO"); 
        System.out.println("ESTAS SON LAS PERSONAS INGRESADAS");
        System.out.println(persona1);
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        
        //Invoco a un metoodo para recordar como envio como parametro a una funcion un objeto        
        nuevaEjecucion.imprimirAlguno(persona3);
    
    }
    
}
