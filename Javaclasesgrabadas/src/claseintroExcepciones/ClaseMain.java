/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseintroExcepciones;


public class ClaseMain {

    /** clase 11 intro excepciones
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("aca inicia todo");
        try {
             Integer numero1=null;   //NullPointerException es el error que larga, cdo lo inicializo en null larga el error
             //para evitar la interrupcion del programa creo el try and catch
        System.out.println(numero1.compareTo(1));
        } catch (NullPointerException e) {  //recibe la excepcion, e(nombre del objeto)
            // me conviene colocar el error que larga el programa en el catch
            //3 opciones 
            System.out.println(e.toString()+ " inicialice el numero");//le puedo agregar un mensaje
        }
       
                
        System.out.println("aca termina todo");
    }
    
}
