/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

/**La función recibirá tres numéros:

numEnt, de tipo int
numReal, de tipo double
numLargo, de tipo long
y deberá devolver true si se cumplen todas las siguientes condiciones:

numEnt es par
numReal está próximo a su valor entero anterior. Por ejemplo, 1.4 SÍ está próximo a 1; 43.9 NO está próximo a 43; 123.5 NO está próximo a 123.
numLargo es positivo o es igual a cero
Resultados esperados:

Si se ingresan los números 4, 1.4, 6 deberá devolver true.
Si se ingresan los números 2, 1.49999, 77 deberá devolver true.
Si se ingresan los números 10000, 1, 123 deberá devolver true.
Si se ingresan los números 1, 10, 6 deberá devolver false.
Si se ingresa los números 2, 2.9, 6 deberá devolver false.
Si se ingresan los números 2, 2, -3 deberá devolver false.
 *
 * @author Cecilia Bruna
 */
public class prueba_mañana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(parCieloPiso(2,2,-3));
    }
  public static Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
      boolean resultado=false;
    if (numEnt % 2 == 0 && Math.round(numReal) == Math.floor(numReal)&& numLargo>= 0 ) {  
            resultado = true; 
        }
        return resultado;
    }
  }
    

