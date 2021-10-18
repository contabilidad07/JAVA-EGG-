/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_video_class;

import java.util.Scanner;

/**comentarios multilineas entre barras y asteriscos
 * 
 *
 * @author Cecilia Bruna
 */
public class video1_cardelli {

    /**
     * @param args the command line arguments
     */ 
    //la variable scanner sirve para leer datos del usuario
    public static void main(String[] args) { // //string es un vector de cadena qye recbe los parametros
        //main es el primer subprgrama que invoca java y ejecuta
        Scanner leer = new Scanner (System.in) ;// system in (ingresa datos x teclado)
       
        String nombre;//nombre es la variable, y string variable tipo datos de cadena de caracteres
       
        // TODO code application logic here
        System.out.println ("ingrese tu nombre"); // imprime x pantalla
        nombre=leer.next();//en la variable nombre, se lee el nombre de la persona
        //next()invoca el metodo next de la variable elegida y le asigna el resultado a nombre
        //mostramos saludo x pantalla
        System.out.println ("ingrese datos del usuario "+nombre+ " estoy programando en java!! ");
        // cadenas van entre comillas, y se agrega + para una variable seguida de lo que imprime
        
    }
    
}
