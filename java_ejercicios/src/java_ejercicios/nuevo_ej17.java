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
public class nuevo_ej17 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int cont_error = 0, contOK = 0, longitud,cont=0;
        do {
            cont=cont+1; // contador veces que ingresa palabra
            System.out.println("Ingrese palabra que empiece co [X] y termine con [O] por: "+(cont)+"° vez");
            palabra = leer.next(); //variable palabra
            longitud = palabra.length(); //mide longitud
            if (longitud !=5){ 
                System.out.println(" Error, ingrese palabra de cinco caracteres");
                
            }else if (!palabra.substring(0, 1).equalsIgnoreCase("X") || !palabra.substring(4, 5).equalsIgnoreCase("O") ){
                System.out.println("su palabra no ha comenzado con X y terminado con O");
            }
            else if (longitud == 5 &&palabra.substring(0, 1).equalsIgnoreCase("X") && palabra.substring(4, 5).equalsIgnoreCase("O")) 
            {
                    // si la palabra es correcta
                   // SUBSTRING SUBCADENA EN POSICION INICIAL CERO Y FINAL NO INCLUIDA 1 (0,0) es igual a x y a ultima posicion igual a o (mayuscula o minuscula)
                
                    contOK=contOK+1; // cuenta las veces correctas
                } 
                else // si la longititud no es correcta la variable palabra cuenta las veces incorrectas
                {
                    cont_error=cont_error+1; // no es correcta por no empezar con X y terminar con O
                }
            
            
                
        } while (!palabra.equals ("&&&&&")); // repetir mientras no ingrese la varible final
        
        System.out.println("Palabra Incorrecta Ingresada: "+contOK);
        System.out.println("Palabra Correcta Ingresada: "+cont_error);
        // TODO code application logic here
    }
    
}
