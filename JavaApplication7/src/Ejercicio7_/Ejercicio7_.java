/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7_;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio7_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPersona s = new ServiciosPersona();
		
		// instanciamos 4 Objetos de tipo persona
		Personal p1 = new Personal();
		Personal p2 = new Personal();
		Personal p3 = new Personal();
		Personal p4 = new Personal();
		
		// Damos valores a los objetos de tipo persona
		s.crearPersona(p1);
		s.crearPersona(p2);
		s.crearPersona(p3);
		s.crearPersona(p4);
		
		// validamos la edad de las 4 personas
		s.esMayorDeEdad(p1);
		s.esMayorDeEdad(p2);
		s.esMayorDeEdad(p3);
		s.esMayorDeEdad(p4);
		
		// Calculamos el IMC de las 4 personas
		s.calcularIMC(p1);
		s.calcularIMC(p2);
		s.calcularIMC(p3);
		s.calcularIMC(p4);
		
	}

    }
    

