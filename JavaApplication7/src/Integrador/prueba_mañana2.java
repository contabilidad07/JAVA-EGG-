/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

/**Es decir, si la palabra es:

"Hola"-> "Hopolapa"
"Casa"-> "Capasapa"
"Perro"-> "Peperropo"
"Carpincho"-> "Caparpipinchopo"
En síntesis, debemos añadir después de cada vocal las letras p + {{vocal}}, siendo esa vocal igual a la hallada. Por ejemplo, si encontramos la vocal "o", añadiremos la sílaba "po".

Resultados esperados:

Si se ingresa la palabra hola deberá devolver hopolapa.
Si se ingresa la palabra qwrty deberá devolver qwrty.
Si se ingresa la palabra a deberá devolver apa.
Si se ingresa la palabra gato deberá devolver gapatopo.
 *
 * @author Cecilia Bruna
 */
public class prueba_mañana2 {

   
    public static void main(String[] args) {
      System.out.println(geringoso("Casa")); // ingreso los valores para que analice la funcion
    }
    public static String geringoso(String palabra) {
        String resultado = palabra;

    resultado = resultado.replaceAll("a","apa").replaceAll("e","epe").replaceAll("i","ipi").replaceAll("o","opo").replaceAll("u","upu");

    return resultado;
  }
}

    

