/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2tarde_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> listaPersonas = new ArrayList();/*Creo una variable GLOBAL, que me permitira
   almacenar mis OBBETOS del tipo persona (siempre que asi lo decida) */
    public Persona cargarPersonas() {
        System.out.println("Ingrese su nombre");
        String nombreI = leer.next();
        System.out.println("Ingrese su apellido");
        String apellidoI = leer.next();
        System.out.println("Ingrese su Edad");
        Integer edadI = leer.nextInt();
        //Creo los objetos usando el contructor vacio y dps SET VALORES
        Persona nuevaP = new Persona();
        nuevaP.setNombre(nombreI.toUpperCase());
        nuevaP.setApellido(apellidoI.toUpperCase());
        nuevaP.setEdad(edadI);
        return nuevaP;
    }

    public void cargarArreglo(Persona x) {// recibe un parametro del main (persona3)para incorporar a la lista , tipo de dato persona y x(cualquier nombre)
        listaPersonas.add(x); // Utilizo ADD para incorporar elementos y envio objeto como parametro
    }

    public void imprimirlista() { //recorre la lista con for each
        ordenarAscendente(); // LLamo a la FUNCION que ORDENA, luego imprimo
        for (Persona unitario : listaPersonas) {
            System.out.println(unitario); // Como deje previsto mi toString en clase entidad... imprime el objeto con todos sus atributos
        }
    }

    public void eliminarElemento(String apellidoR) {
        Iterator<Persona> it = listaPersonas.iterator();
        //OJO CUANDO ELIMINAN... SI ELIMAN ADRI SE ROMPE EL PROGRAMA
        while (it.hasNext()) {//mientras exista un objeto seguir ejecutando la instruccion
            Persona next = it.next();
            if (next.getApellido().equalsIgnoreCase(apellidoR)) {   //traigo apellido con get y  lo comparo con apellidoR que recibi como parametro            
                it.remove(); // borro el dato
            }
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaPersonas, Comparadores.ordenarporApellidoAsc);
    }
    
    
}
