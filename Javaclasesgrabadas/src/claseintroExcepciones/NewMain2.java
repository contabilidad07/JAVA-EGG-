/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseintroExcepciones;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class NewMain2 {

    public static void main(String[] args) throws Exception {
        Scanner leer =new Scanner (System.in);// para leer variables
        System.out.println("aca inicia todo");
        try {
            System.out.println("ingrese datos");
            Integer numero1=leer.nextInt();   //ingrese datos x teclado
             //para evitar la interrupcion del programa creo el try and catch
             validar(numero1); //llamo al metodo validar
        System.out.println(numero1.compareTo(8));
        } catch (NullPointerException e) {  //recibe la excepcion, e(nombre del objeto)
            // me conviene colocar el error que larga el programa en el catch
            //3 opciones 
            System.out.println(e.toString()+ " inicialice el numero");//le puedo agregar un mensaje
        }        catch (RuntimeException e){
       
              System.out.println(" ocurrio algo que no trabaje "+e.toString());//le puedo agregar un mensaje, el e.toString()me larga el error especifico para verlo
        }
        finally {
            System.out.println("esto ocurre si o si finally");
        }
        System.out.println("aca termina todo");
        }
    public static void validar(Integer numero)throws Exception{ //debp incorporar la clausula throws al metodo
        //creo una excepcion manual,la declaro yo, no es una excepcion de java
        //pero yo la creo como un error, si el usuario ingreso un N° menor a 15, es un error
        if (numero<15) {    
            throw new Exception ("el numero no debeser mayor a 15 "); //creo objeto tipo excepcion con la palabra new
                   // y agrego throw Exception al metodo
                //el numero no quiero que sea menor a 15   throws Exception, hereda de los metodos de excepcion
            
        }
    }
    
    }

    
