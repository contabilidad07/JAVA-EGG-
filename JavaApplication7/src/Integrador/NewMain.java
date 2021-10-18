/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

/**
 *
 * @author Cecilia Bruna
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    class Examen{
  public String inversa(String palabra) {
    String invertida = "";
    for (int i = palabra.length() - 1; i >= 0; i--) {
      invertida = invertida + palabra.charAt(i);
    } 
    invertida = invertida.toLowerCase();
    return invertida;
  } 

    }
    
}
