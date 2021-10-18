/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEggPago;

import java.util.Scanner;


public class CuentaServicio {//
  Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el numero de Cuenta");// CREO VARIABLES
        int varCuenta = leer.nextInt();
        System.out.println("Ingrese el numero de DNI");
        long varDNI = leer.nextLong();
        System.out.println("SALDO DE INICIO");
        int varSaldo = leer.nextInt();
        return new Cuenta(varCuenta, varDNI, varSaldo); // Esta opcion, utilice una FUNCION con retorno
        //Utilizando los parametros que requieren el "Constructor lleno". En el Main, asigno esta funcion a la variable
    }

    public void hacerDeposito(Cuenta x  ) { //recibe el objeto cuenta como parametro) y lo llamo como quiera (x)
        System.out.println("Ingrese el monto a depositar");
        //Modificando el valor
        x.setSaldoActual(x.getSaldoActual() + leer.nextInt()); // Hago todo directo

        //Esta seria la forma de paso a paso de lo que hice en linea 23
        /*int varIngreso = leer.nextInt();//Lee lo que quiere depositar
        int varSaldoAnterior = x.getSaldoActual(); // Guarda el saldo anterior
        int varSumatoria = varSaldoAnterior +varIngreso ;    // Suma ambos datos      
        x.setSaldoActual(varSumatoria);*/ // Envie el monto
    }

    public void hacerRetiro(Cuenta x) {
        System.out.println("Ingrese el monto a retirar");
        //Modificando el valor
        int varRetiro = leer.nextInt(); // El usuario pone cuanto quiere sacar

        if (varRetiro <= x.getSaldoActual()) { // Me aseguro que tenga saldo suficiente
            System.out.println("Tiene dinero disponible");
            x.setSaldoActual(x.getSaldoActual() - varRetiro);
        } else {
            System.out.println("UPSSSS, NO TENES TANTO DINERO");
            x.setSaldoActual(0); // El enunciado decia que si no alcanza, que vuelva saldo a 0
        }
    }

    public void extraccionRapida(Cuenta x) {
        System.out.println("Ingrese cuanto quiere retirar");
        int varRetiro = leer.nextInt();
        
        int varCalculo = x.getSaldoActual() * 20 / 100; // En una variable Auxiliar, calculo el 20% del saldo actual

        if (varCalculo >= varRetiro) { // Verifico que lo que quiera retirar no sea mayor al 20%
            System.out.println("Tiene dinero disponible");
            x.setSaldoActual(x.getSaldoActual() - varRetiro); // Si pudo sacar la platica, seteo el nuevo saldo
        } else {
            System.out.println("NO PUEDE RETIRAR ESTE DINERO"); 
        }
    }  
}
 