/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_video_class; // nombre del paquete, sirve para organizar programas en java 
//y empaquetar muchos programas con un mismo fin

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 * * @author Cecilia Bruna
 */
public class NewMain {// public class es la clase publica
    //main abre el metodo main que se usa para ejecutar el programa

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // entre estas llaves se carga lo que quiero programar
        //main es un subprograma que invoca java, lo primero en ejecutar
        //string es una cadena de vectores 
        //TIPOS DE DATOS DE LAS VARIABLES
        int entero;// define a num como entero (int) y lo inicializa en cero
        //punto y coma separa variables
        double real; // los reales se definen con double y van con 0.0 
        // la coma se reemplaza por el punto
        // TODO code application logic here
        String cadena = "hola pais";  // String con mayusculas define datos como cadena, comilla doble
        char caracter; // char define caracter, va con comillas simples
        // caracteres solo se puede colocar un solo caracter
        boolean logico; // boolean define logico, true o false
        // ESCRIBIR
        System.out.println("Hola mundo");// muesta lo que va entre parentesis, como es texto tb lleva comillas

        System.out.print("Hola:" + cadena);//con el signo mas agrego lo quedice la variable cadena
        //prinln (ln) hace saltar de linea
        //atajo para escribir system.out.print.   escribo sout+tab
        
        //LEER IMPORTAR SCANNER (boton en foquito de la izquierda para guardarlo),se inserta arriba import java
            //Scanner es igual a leer en pseint (lee los datos ingresados x teclado por el usuario)
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); // me permite leer (leer es el nombre del escaner que yo le dí
        //use delimiter permite que toma las siguents palabras despues de scanner hasta que demos enter

        System.out.println("ingresar una palabra");// aparece por pantalla
        String palabra = leer.next(); // leer cadena // leer ingresa datos por teclado
        System.out.println(" palabra:" + palabra);

        System.out.println("ingresar un numero");
        entero = leer.nextInt();
        System.out.println("numero: " + entero);

        System.out.println("ingresar un real");
        real = leer.nextDouble();
        System.out.println("real:" + real);

        System.out.println("ingresar un valor booleano");
        logico = leer.nextBoolean();
        System.out.println("logico: " + logico);

        System.out.println("ingresar un valor caracter");
        caracter = leer.next().charAt(0);
        System.out.println("caracter" + caracter);

    }

}// cierra el metodo main
