/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class Integrador2 {

    /**Función prisioneroDulce():
Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una vez al mes, se
sienta una n cantidad de presos en ronda, contemplando al preso que inicia la ronda, como
el preso 0.
A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno
en uno a cada preso, contemplando que se comenzaran a repartir los caramelos desde el
primer preso (inicio). Se repartirán los caramelos hasta que no queden más y el ultimo
caramelo en repartirse estará podrido, determinar a que preso, según su posición en la
ronda le tocara el caramelo podrido.
Esta función recibe tres variables:
• inicio: está variable será el numero del preso que inicia la ronda.
• cantidadCaramelos: está variable será el numero de caramelos que se les da a los
presos.
• cantidadPresos: está variable será el numero de presos que componen a la ronda.
Resultados esperados:
• Sí se inicia con el preso 0, con 10 caramelos y 6 presos el resultado esperado es 3.
• Sí se inicia con el preso 7, con 4 caramelos y 8 presos el resultado esperado es 2.
• Sí se inicia con el preso 1, con 5 caramelos y 2 presos el resultado esperado es 1.
• Sí se inicia con el preso 0, con 10 caramelos y 1 preso el resultado esperado es 0.
• Sí se inicia con el preso 455, con 1585 caramelos y 500 presos el resultado esperado es
39.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Presos:");
        int Presos = leer.nextInt();

        System.out.println("Ingrese la cantidad de caramelos:");
        int Caramelos = leer.nextInt();
        
        System.out.println("Ingrese el inicio para repartir:");
        int Inicio=leer.nextInt();
        prisioneroDulce(Presos,Caramelos,Inicio);
    }
    /*---------------------------------  FUNCION ---------------------------------------*/
    public static void prisioneroDulce(int Presos,int Caramelos,int Inicio){
        
        int Cantidad_Presos = Inicio, Cantidad_Caramelos = 1;

        do {
            if (Cantidad_Presos == Presos) {
                Cantidad_Presos = 0;
                Cantidad_Caramelos++;
            }

            System.out.println("Preso " + Cantidad_Presos + " Caramelos " + Cantidad_Caramelos);
            Cantidad_Presos++;
            Caramelos--;

        } while (Caramelos != 0);

        System.out.println("El Preso " + (Cantidad_Presos - 1) + " tiene el Caramelo Podrido");
        
    }  
    /*------------------------------------------------------------------------*/
}


