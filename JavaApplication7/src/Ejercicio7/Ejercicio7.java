/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import Ejercicio6.ServiciosCafetera;

/**A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.(hago un vector en PersonaServicio)
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 *
 * @author Cecilia Bruna
 */
public class Ejercicio7 {//profe Egg

    /**creo atributos en clase persona, cargo los metodos en persona servicio, vinculando 
     * personaServicio (metodos) con clase persona (atributos)
     * el main class invoca a personaServicio a traves de objetos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();//creo un metodo (servicio) para crear persona  de la clase personaServicio para acceder a los metodos  de la clase
       // Persona p1 = servicio.crearPersona();// pide crear cuatro objetos tipo persona para llamar a los metodos crearPersona, invoca metodo crearPersona de la clase persona
        // Persona p2 = servicio.crearPersona();//puedo hacer un bucle con 4 vueltas y cargarle una persona
        // Persona p3 = servicio.crearPersona(); pi va a tener los datos del metodo crear persona
        // Persona p4 = servicio.crearPersona();
        
        //puedo hacer un bucle con 4 vueltas y cargarle una persona
       Persona [] vectorPersonas=servicio.crearPersonasTest(); // devuelve arreglo o vector de clasePersona, y lo guarda []listaPersonas, invocando metodo crearPersonasTest
        //despues de probar lo saco y dejo el metodo CrearPersonas
        //servicio.crearPersona();
        servicio.porcentajesPeso(vectorPersonas);// muestra el porcentaje de peso del vector Personas
        servicio.porcentajeEdad(vectorPersonas); // toma los datos de vectorPersonas del arreglo
      
    }

} 
    
    
    

