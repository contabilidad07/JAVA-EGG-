/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo
 * actual. Las operaciones asociadas a dicha clase son: • Constructor por
 * defecto y constructor con DNI, saldo, número de cuenta e interés. • Agregar
 * los métodos getters y setters correspondientes • Metodo para crear un objeto
 * Cuenta, pidiéndole los datos al usuario. • Método ingresar(double ingreso):
 * el método recibe una cantidad de dinero a ingresar y se la sumara a saldo
 * actual. • Método retirar(double retiro): el método recibe una cantidad de
 * dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la
 * cantidad de dinero a retirar, se pondrá el saldo actual en 0. • Método
 * extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que
 * el usuario no saque más del 20%. • Método consultarSaldo(): permitirá
 * consultar el saldo disponible en la cuenta. • Método consultarDatos():
 * permitirá mostrar todos los datos de la cuenta
 *
 * @author Cecilia Bruna-CLASES EJEMPLO
 */
public class CuentaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() { // metodo crear cuenta
        Cuenta c = new Cuenta(); // objeto c de la clase cuenta
        // int numeroCuenta = new Random().nextInt(999999); // creo un numero de cuenta aleatorio clase random (hasta 99999)
        // System.out.println("numero de cuenta: " ); // muestra numero cuenta
        int numeroCuenta = new Random().nextInt(999999);
        System.out.println("su numero de cuenta es:" + numeroCuenta);
        System.out.println("ingrese DNI");//ingreso dni y lee
        long dni = leer.nextLong();
        System.out.println("ingrese saldo actual");
        double saldoActual = leer.nextDouble();
        c.setNumeroCuenta(numeroCuenta); // seteo datos, envia datos al objeto c y luego a los atributos de la clase cuenta
        c.setDni(dni);
        c.setSaldoActual(saldoActual);
        return c;
    }

    public void ingreso(Cuenta c, double ingreso) { // recibe el dinero a ingresar de la cuenta c
        c.setSaldoActual(c.getSaldoActual() + ingreso);
        System.out.println(" ingreso exitoso, saldo actual: $ " + c.getSaldoActual());
    }

    public void retirar(Cuenta c) { // metodo para retirar dinero
        double retiro;
        System.out.println("ingrese cantidad a retirar");// creo variable retiro
        retiro = leer.nextDouble();// lee e importe a retirar
        if (c.getSaldoActual() < retiro) {
            System.out.println("no hay saldo disponible para ese retiro");
        } else {
            c.setSaldoActual(c.getSaldoActual() - retiro);
            System.out.println("retiro exitoso, su saldo actual es : $" + c.getSaldoActual());
        }

    }

    public void extraccionRapida(Cuenta c) {
        double retiro;  //creo variable retiro
        retiro = leer.nextInt();
        if (c.getSaldoActual() * 0.2 < retiro) {
            System.out.println("el retiro no puede superar e 20%");
        } else {
            c.setSaldoActual(c.getSaldoActual() - retiro);
            System.out.println("retiro exitoso. Saldo actual: $ " + c.getSaldoActual());

        }

    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("saldo disponible: $ " + c.getSaldoActual());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println("DNI: " + c.getDni());
        System.out.println("numero de cuenta: " + c.getNumeroCuenta());
        System.out.println("Saldo Actual: $" + c.getSaldoActual());
    }

    public void mostrarMenu() {
        System.out.println("-----------MENU---------\n"
                + "1:-Ingreso\n"
                + "2:- Extraccion\n"
                + "3:- Extraccion rápida\n"
                + "4- Consulta saldo disponible\n"
                + "5- Consulta datos de la cuenta\n"
                + "6- Salir\n"
                + " -----Elija una opción-----"
        );

    }

    private int elegirOpcion() {
        int sel;
        do {
            sel = leer.nextInt();
            if (sel < 1 || sel > 6) {
                System.out.println("selección invalida.Intente nuevamente");

            }

        } while (sel < 1 || sel > 6);
        return sel;
    }

    public void ejecutarMenu() {
        Cuenta c1 = crearCuenta();// creo objeto c1 dentro de cuentaservicio, va al metodo CrearCuenta e ingresa los datos
        mostrarMenu();
        int sel = 0;
        do {
            sel = elegirOpcion();// repite el bucle mientras sea menor a 1 y mayor a 6, toma una opcion valida
            switch (sel) {
                case 1:
                    System.out.println("digite monto a ingresar");//opcion 1 ingrese monto
                    double ingreso = leer.nextDouble(); //metdo ingreso
                    ingreso(c1, ingreso);
                    break;
                case 2:
                    retirar(c1);
                    break;
                case 3:
                    extraccionRapida(c1);
                    break;
                case 4:
                    consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("adios");
                    break;
            }

                    System.out.println("");
                    if (sel != 6);
                    mostrarMenu();
                    System.out.println("");

            
        } while (sel != 6);
    }


}
