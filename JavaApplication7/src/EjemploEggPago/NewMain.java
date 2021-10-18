/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEggPago;

import java.util.Scanner;

/**import enitdades.Cuenta;
import java.util.Scanner;
import servicios.CuentaServicio;
 *
 * @author Cecilia Bruna
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio metodos = new CuentaServicio(); // Llamo al servicio,  y creo un objeto metodos para acceder a los metodos.
        Cuenta nuevaCuenta=  metodos.crearCuenta(); // creo un objeto del tipo cuenta y llamo al metodo que la crea
        Scanner leer = new Scanner(System.in); // Para poder hacer lectura de datos
        boolean varSalida = false; // variable que usopara la salida del  "MENU"
     
        // Creamos un MENU, donde el usuario acceda a lo que quiere

        
        do {
            System.out.println("Elegi la opcion elegida"                  
                    + "\n 1. Hacer un Deposito"
                    + "\n 2. Hacer un Retiro"
                    + "\n 3. Ver Datos de la Cuenta"
                    + "\n 4. Hacer retiro Express (20%)"
                    + "\n 5. Consultar SALDO"
                    + "\n 6. SALIR / NO QUIERO HACER MAS NADA");
            byte varOpcion = leer.nextByte();
            switch (varOpcion) {               
                case 1:
                    metodos.hacerDeposito(nuevaCuenta);
                    System.out.println("SU SALDO ACTUALIZADO ES:" + nuevaCuenta.getSaldoActual());
                    break;
                case 2:
                    metodos.hacerRetiro(nuevaCuenta);//void
                    
                    break;
                case 3:
                    System.out.println(nuevaCuenta.toString());//void
                    break;
                case 4:
                    metodos.extraccionRapida(nuevaCuenta);//void
                    break;
                case 5:
                    System.out.println("SU SALDO ACTUAL ES:" + nuevaCuenta.getSaldoActual());
                    break;
                case 6:
                    System.out.println("SALIR");
                    varSalida = true;
                    break;
                default:
                    System.out.println("INGRESASTE UNA OPCION INCORRECTA");
                    ;
            }

       
        } while (!varSalida);

    
    }
    
}
