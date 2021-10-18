/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1;

import java.util.ArrayList;

/**
 *
 * @author Cecilia Bruna
 */
public class video1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays tradicional, no es collection
//        String [] nombresArray= new String [5]; //objeto tipo String, que corresponde a un array de una dimension (vector), el objeto nombresArray es un vector dimension 5 elementos
//        for (int i = 0; i < nombresArray.length; i++) { // bucle va desde 0 hasta el largo del objeto
//            nombresArray[i]="chiquito"+(i+1); // relleno el vector le digo al arreglo que en cada posicion le asigno objetos distintos, llamados chiquito1.. chiquito2...a 5
//            
//        }
//        for (String var: nombresArray) {// creo variable var e imprime lo que esta en el arrays
//            System.out.println(var);
//            
//        }
        //collections, arreglo dinamico de tamaño variable, creo una lista
        ArrayList<String>nombresArrayList= new ArrayList();//Arraylist del tipo string  llamado nombresArrayList, se instancia con el new E INICIALIZA EN CERO Y CREA EL OBJETO
        
        //importo Arraylist, comienza con dimension cero
      nombresArrayList.add("chiquito");// añado objetos al Arraylist mediante el metodo.Add
           nombresArrayList.add("chiquito");// cuanto mas objetos agrego se agranda la dimension, el arreglo es dinamico
           nombresArrayList.add("chiquito");
           //imprime la dimension (3)objetos
        System.out.println(nombresArrayList.size());// muestra variable nombresArraylist, del tipo Arraylist contiene String (size devuelve la dimension)
        
       //para eliminar un objeto cualquiera uso funcion remove
        nombresArrayList.remove("chiquito");
        System.out.println(nombresArrayList.size());//muestra nueva dimension luego de remover
    }
}
