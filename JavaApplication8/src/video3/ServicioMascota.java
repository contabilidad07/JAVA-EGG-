/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class ServicioMascota {
     private Scanner leer = new Scanner (System.in);
    private List<Mascota> mascota;// importo list creo objeto mascota tipo de dato mascota creo lista
    
    public ServicioMascota(){ // constructor vacio inicializa lista
        this. mascota=new ArrayList(); 
    }
    
    public  Mascota crearMascota(){ // metodo crearMascota 
        System.out.println("introducir nombre");// ingreso atributos por teclado del objeto
        String nombre = leer.next(); // lee nombre ingresado x teclado
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
         System.out.println("introducir tipo");
        String tipo = leer.next();
       Mascota m=new Mascota(nombre, apodo, tipo);// creo objeto m de clase Mascota
       mascota.add(m);// agrego objeto m
     return m;
    }
    public void mostraMascota (){   
        System.out.println("las mascotas actuales de la lista Mascota son: ");
        for (Mascota aux : mascota) { //for+control+espacio para for each va a recorrer sobre la lista de mascotas, la variable aux es de tipo Mascota
            System.out.println(aux.toString());// imprime la variable aux, el objeto con metodo toString
            
        }
        System.out.println("cantidad= "+mascota.size());// cantidad
    }
    //
    //crea mascotas todos chiquitos
    public void fabricachiquitos(int cantidad){   //recibe el parametro cantidad, que  equivale a la cantidad de mascotas a crear y añadir a la lista
        
        for (int i = 0; i < cantidad; i++) {// bucle de cero a cantidad
            //creamos y añadirlas las mascotas todas en las mismas listas para automatizarlas, es una forma rápida de crear muchos objetos
            mascota.add(new Mascota("fer","chiquito","Beagle") ); // a la lista mascota.add(le añado como argumento newMascota-mejor
           
           //es lo mismo poner de forma mas facil (es mejor el anterior)
           //la variable aux cada vez que da una vuelta el bucle crea un objeto o variables aux
          // Mascota aux= new Mascota ("fer","chiquito","Beagle"); //creo variable aux, le asigno una mascota nueva que estoy creando 
          // mascota.add(aux);//paso como argumento variable aux de clase mascota
            
        }
    }
    
    //crea mascotas pidiendo datos por teclado, automatizado// si quiero crear 100 mascotas cantidad debe ser = a 100
    public void fabricaMasc(int cantidad){// recibe la cantidad de mascotas a crear, cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
        for (int i = 0; i < cantidad; i++) {//llamo al metodo crearMascota para crearla
            
         
          Mascota mascotaCreada=crearMascota();// creo un objeto mascotaCreada para imprimirla lo igualo al metodo crearMascota que acabo de invocar
            System.out.println(mascotaCreada.toString());// imprimo mascotaCreada es igual a crearMascota
        }
                
    }
}


