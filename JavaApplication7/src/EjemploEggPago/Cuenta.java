/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEggPago;


public class Cuenta {
     private int numeroCuenta; // Definimos los atributos de la cuenta
    private long dniCliente;
    private int saldoActual;

    //creo en forma automática por si lo necesito
    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {//constructor lleno recibe todos los parametros para crear un objeto
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {// constructor vacio para que no me declare error si instancio la clase
    }
    
//getters y setters para poder acceder a los atributos de diferentes clases
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

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override// to string imprime mi objeto en forma rápida, se puede modificar        
    public String toString() {
        return "Cuenta{ " + "NumeroCuenta=" + numeroCuenta+"}" 
                + "\n, dniCliente=" + dniCliente + ", saldoActual=$ " + saldoActual + '}';
    }
}
