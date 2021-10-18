/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *cortinez
 * @author Cecilia Bruna
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    	CuentaService cuentaNueva = new CuentaService();
   	 
    	cuentaNueva.crearCuenta();
    	cuentaNueva.ingresar(1000);
    	cuentaNueva.retirar(500);
    	cuentaNueva.extraccionRapida();
    	cuentaNueva.consultarSaldo();
    	cuentaNueva.consultarDatos();

    }
    
}
