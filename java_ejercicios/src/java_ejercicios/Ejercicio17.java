/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

import java.util.Scanner;

/**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 *
 * @author Cecilia Bruna
 */
public class Ejercicio17 {

      public static void main(String[] args) {
      
		Scanner leer = new Scanner(System.in);
		String userText = "";//inicializo
		int correctas = 0; 
		int incorrectas = 0;

		// Bucle para la lectura de cadenas, mientras la entrada sea distinta a "&&&&&"
		while (!"&&&&&".equals(userText)) {        // la variable a evualuar puede ir adentro
			System.out.println("Ingrese una cadena de texto: ");
			userText = leer.nextLine();
			userText = userText.toUpperCase();

			// Validamos que tenga un maximo de 5 caracteres
			if ( userText.length() == 5) {
				// Validamos el primer y ultimo caracter sean igual a X y O respectivamente
				if (userText.substring(0, 1).equals("X") && (userText.substring(4, 5).equals("O"))) {
					correctas++; // incrementa el contador en 1
				} else {
					incorrectas++; // incrementa el contador en 1
				}
				
			} else {
				System.out.println("[ ERROR ] la cadena debe contener 5 caracteres.");
			}
		}

		leer.close(); // cerramos la entrada de datos
		
		// Mostramos el total de cadenas correctas
		System.out.println("[ INFORME ]");
		System.out.println("Se ingresaron un total de [" + correctas + "] cadenas correctas.");
		System.out.println("Se ingresaron un total de [" + (incorrectas-1) + "] cadenas incorrectas.");
		
        
    }
    
}
