/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
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
public class Coenta {
    private int numeroCuenta;
	private long dniCliente;
	private double saldoActual;
	private double interes;
    

	public Coenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
    	this.numeroCuenta = numeroCuenta;
    	this.dniCliente = dniCliente;
    	this.saldoActual = saldoActual;
    	this.interes = interes;
	}

	public Coenta() {
	}

	public int getNumeroCuenta() {
    	return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
    	this.numeroCuenta = numeroCuenta;
	}

	public long getDniCliente() {
    	return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
    	this.dniCliente = dniCliente;
	}

	public double getSaldoActual() {
    	return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
    	this.saldoActual = saldoActual;
	}

	public double getInteres() {
    	return interes;
	}

	public void setInteres(double interes) {
    	this.interes = interes;
	}
    

}
