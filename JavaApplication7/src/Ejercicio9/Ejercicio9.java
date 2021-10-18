/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creo un objeto de tipo Matematicas
        Matematicas matematicas1 = new Matematicas();
        //Creo un objeto de tipo MatematicasServicio para acceder a los metodos
        MatematicasServicio nuevo = new MatematicasServicio();
        
        matematicas1.setNumero1(Math.random()*10);
        matematicas1.setNumero2(Math.random()*10);
               
        System.out.println("El numero mayor nÂº entre "+matematicas1.getNumero1()+" y "+matematicas1.getNumero2()+" es: "+ nuevo.devolverMayor(matematicas1));
        System.out.println("La potencia del mayor nÂº elevado al menor es: "+nuevo.calcularPotencia(matematicas1));
        System.out.println("La raiz cuadrada del menor numero es: "+ nuevo.calcularRaiz(matematicas1));
        
    }
    }
    

