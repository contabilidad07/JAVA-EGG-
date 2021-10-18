/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/***Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Cecilia Bruna
 */
public class CuentaService { //uso servicio para controlar los datos, lee valores ingresados por teclado
    Coenta cuenta1 = new Coenta();//creo objeto cuenta1 de la clase cuenta, pasa parametros vacios
    
	public Coenta crearCuenta(){ // metodo crearCuenta de la clase Cuenta
    	Scanner sc = new Scanner(System.in);// la variable sc de tipo Scanner para leer datos
    	System.out.println("Ingrese el numero de cuenta: ");
    	cuenta1.setNumeroCuenta(sc.nextInt()); // va al metodo set para leer el dato
    	System.out.println("Ingrese el DNI del cliente");
    	cuenta1.setDniCliente(sc.nextLong());
    	System.out.println("Ingrese el saldo actual: ");
    	cuenta1.setSaldoActual(sc.nextDouble());
    	return cuenta1; // devuele el objeto cuenta1
	}
    
	public void ingresar(double ingreso){
    	cuenta1.setSaldoActual(ingreso+cuenta1.getSaldoActual());
    	System.out.println("Saldo Actual: "+cuenta1.getSaldoActual());
	}
    
	public void retirar(double retirar){
    	if(retirar > cuenta1.getSaldoActual()){
        	cuenta1.setSaldoActual(0);
    	}else{
        	cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retirar);
    	}
    	System.out.println("Saldo actual: "+cuenta1.getSaldoActual());
	}
    
	public void extraccionRapida(){
    	cuenta1.setSaldoActual(cuenta1.getSaldoActual()-(cuenta1.getSaldoActual()*20/100));
    	System.out.println("Saldo actual despues de la extracción rapida: "+cuenta1.getSaldoActual());
	}
    
	public void consultarSaldo(){
    	System.out.println("Su saldo actual es: "+ cuenta1.getSaldoActual());
	}
    
	public void consultarDatos(){
    	System.out.println("Numero de cuenta: "+cuenta1.getNumeroCuenta()+"\nNumero de DNI: "+cuenta1.getDniCliente()+"\nSaldo Actual: "+cuenta1.getSaldoActual());
        }
}
