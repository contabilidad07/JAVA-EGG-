/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class ServiciosCafetera {
   private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   

    public  Cafetera  crearCafetera () {
        System.out.println("Ingrese la cantidad máxima de la cafetera en cm3");
        int cantMax = leer . nextInt ();
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int cantAct = leer . nextInt ();
        return  new Cafetera (cantMax, cantAct);// crea objeto para ir a clase cafetera
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public  void  llenarCafetera ( Cafetera c ) { // recibe el objeto como parametro, metodo void
        int llenar = c . getCapacidadMaxima ();
        c . setCantidadActual (llenar);//seteo llenar
        System.out.println(" la cafetera se llena con: "+llenar);// llene la cafetera
    }
    /**Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taz
     * @param c*/
    public  void  servirTaza ( Cafetera  c ) {
        System.out.println ( " Tamaño de taza en cm3 " );
        int taza = leer.nextInt();// variable taza es la cantidad de la tasa vacia
        
         if(c.getCantidadActual()>taza){// si la cantidad de la cafetera es mayor a la taza
            int cantidad = c.getCantidadActual();// creo variable cantidad
            cantidad -= taza; // igualo cantidad  restandole taza
            c.setCantidadActual(cantidad);
             System.out.println("la cantidad de la cafetera queda en: "+cantidad+" cm3 luego de servir la taza");
        }else{
            int resto = taza - c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("la taza quedo con :"+resto +"cm3 sin llenar y la cafetera quedo vacia");
        }
    }
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public  void  vaciarCafetera ( Cafetera  c ) {
        c . setCantidadActual ( 0 );
    }

    
    public void agregarCafe(Cafetera c, int cantCafe){
        if (c.getCapacidadMaxima()<=6 && cantCafe>25){
            System.out.println("para un cafetera de 6 o menos tazas se recomienda 20 gr de cafe");
        }else if(c.getCapacidadMaxima()<=12 && cantCafe>45){
            System.out.println("para un cafetera de entre 6 y 12 tazas se recomienda 40 gr de cafe");
        }else{
            c.setCantidadCafe(cantCafe);
        }
            
    }
}