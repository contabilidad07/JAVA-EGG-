/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.exception;

/**
 *
 * @author Cecilia Bruna
 */
public class MiExcepcion extends Exception{
     public MiExcepcion() { // constructor vacio
    }

    public MiExcepcion(String msg) {
        super(msg);
    }
}
