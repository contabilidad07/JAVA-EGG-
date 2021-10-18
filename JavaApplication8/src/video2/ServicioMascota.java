/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**generamos arraylist con tipo de dato string
 *
 * @author Cecilia Bruna
 */
public class ServicioMascota {
    private Scanner leer = new Scanner (System.in);
    private List<String> mascota;// importo list creo objeto mascota tipo string creo lista
    
    public ServicioMascota(){ // constructor vacio inicializa lista
        this. mascota=new ArrayList(); 
    }
    
    public void crearMascota(){ // metodo crearMascota tipo void
        System.out.println("introducir nombre");// ingreso atributos por teclado del objeto
        String nombre = leer.next(); // lee nombre ingresado x teclado
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
         System.out.println("introducir tipo");
        String tipo = leer.next();
        String mascotas=nombre+" "+apodo+" "+tipo;// genero una variable llamada mascota concatenando los atributos
       mascota.add(mascotas); //agrego variable mascotas tipo string para imprimir
    }
    public void mostrarMascota (){   
        System.out.println("las mascotas actuales de la lista Mascota son: ");
        for (String aux : mascota) { //for+control+espacio para for each va a recorrer sobre la lista de mascotas
            System.out.println(aux);
            
        }
        System.out.println("cantidad= "+mascota.size());// cantidad
    }
}
// //hemos creado dos objetos tipo string en base al arraylist o dentro de una lista