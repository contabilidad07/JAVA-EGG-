/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 *
 * @author Cecilia Bruna
 */
public class Circunferencia {
    
    private double radio;// atributo radio esta encapsulado, solo puedo acceder desde la misma clase con set y get
   

    public Circunferencia(double radio) {// Metodo constructor para inicializar radio
        this.radio = radio;
    }

    public Circunferencia() {// metodo vacio para pasar parametros del objeto circunferencia
    }
    

    public double getRadio() {// metodo get (atributo), devuelve valor del atributo para mostrar
        return radio;
    }

    public void setRadio(double radio) {// metdo set (atributo) para establecer un valor del atributo
        this.radio = radio;
    }
    
    public void crearRadio(){// metodo crearRadio para ingresar los valores por teclado y leerlos
        Scanner sc = new Scanner(System.in);//scanner para leer datos
        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();// lee el parametro ingresado
        this.radio = radio;// pasa el dato del parametro al atributo
        
    }
    
    public double area(){// metdo area para que el parametro radio calcule el area de la circunferencia
        return (this.radio*this.radio*Math.PI);
    }
    
    public double perimetro(){
        return (2*Math.PI*this.radio);
    }
    }