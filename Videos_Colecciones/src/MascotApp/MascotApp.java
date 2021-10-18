/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotApp;

import Enumeraciones.Raza;
import Enumeraciones.SexoHumano;
import Entidades.Usuario;

/**
 *
 * @author Cecilia Bruna
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //importo enumeracion Raza
     /** for (Raza aux: Raza.values()){ // tipo de dato Raza de la variable aux,Raza.values (trae todos los valores de la numeracion en un arrays)
          System.out.println(aux);//variable aux es del tipo Raza. las variables tipo num hay que convertirlas a string para trabajarlas
         // aux.toString();
          */
     Usuario u= new Usuario();// creo objeto u de clase Usuario de constructor vacio
     u.setSexo(SexoHumano.MUJER);//para añadir al objeto u tipo usuario un sexo (sexoHumano es el enum)
        System.out.println(u.getSexo());
      }
    }
      

