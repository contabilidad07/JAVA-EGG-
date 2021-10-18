/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**Función mediasAmigas():
 * En un universo paralelo, donde los habitantes son medias, existe un crucero de medias
donde se sube una lista de medias. Esta lista de tripulantes del crucero es una Collection
de letras.
Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y retornar una
lista que contenga los grupos de medias que si tenían pares. Esta lista final de medias
pares se mostraran ordenadas de menor a mayor.
A continuación un ejemplo:
List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no.
Entonces la List que se debería retornar sería: A,B,C.
* Resultados esperados:
• Si se ingresa la lista "A", "B", "C", "D", "A", "C", "D", "A". El resultado sería "A", "C", "D".
• Si se ingresa la lista "R", "R", "A", "A", "S", "S", "G", "H". El resultado sería "A", "R", "S"
• Si se ingresa la lista "R", "E", "T", "A", "P", "S", "G", "H". El resultado sería vacío porque no
hay pares.
Nota: Recordemos que tenemos que correr el archivo EggTest para probar nuestros
ejercicios, igualmente recomendamos ir probando con el main y viendo que resultado nos
arroja.
 *
 * @author Cecilia Bruna
 */
public class Integrador3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> Lista_Letras = new ArrayList<>();

        System.out.print("Ingrese cantidad de letras: ");
        int Cantidad_Letras = leer.nextInt();

        for (int i = 0; i < Cantidad_Letras; i++) {
            System.out.print("Ingrese la letra: ");
            Lista_Letras.add(leer.next().toUpperCase());
        }

        HashSet<String> Final = new HashSet(mediasAmigas(Lista_Letras));
        
        for (String Letra : Final) {
            System.out.print(Letra + " ");
        }
        System.out.println("\n--------------------------------------------");
    }
    /*------------------------------ FUNCION ------------------------------------------*/
    public static ArrayList<String> mediasAmigas(ArrayList<String> Lista_Letras){
        
        ArrayList<String> Lista_Repetidos = new ArrayList<>();
        int repetidos = 0;

        for (int i = 0; i < Lista_Letras.size(); i++) {
            for (int j = 0; j < Lista_Letras.size(); j++) {
                if (Lista_Letras.get(i).equals(Lista_Letras.get(j))) {
                    repetidos++;
                }
            }
            if (repetidos > 1) {
                Lista_Repetidos.add(Lista_Letras.get(i));
            }
            repetidos = 0;
        }

        System.out.println("----------------------------------------------");
        System.out.println("REPETIDOS");
        for (String aux : Lista_Repetidos) {
            System.out.print(aux + " ");
        }

        System.out.println("\n--------------------------------------------");
        System.out.println("LISTA DEFINITIVA");
        HashSet<String> Lista_Final = new HashSet(Lista_Repetidos);
        return new ArrayList(Lista_Final);
        
    }  
    /*------------------------------------------------------------------------*/
}
