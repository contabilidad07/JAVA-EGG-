/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 * @author Cecilia Bruna Cortinez Juan José

 */
public class Rectangulo {
    private int base;// atributo privado base
	private int altura;//atributo altura

	public Rectangulo() {// constructor rectangulo vacio
	}

	public int getBase() {
    	return base;
	}

	public void setBase(int base) {
    	this.base = base;
	}

	public int getAltura() {
    	return altura;
	}

	public void setAltura(int altura) {
    	this.altura = altura;
	}
    
	public void crearRectangulo(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Ingrese la base");
    	this.base = sc.nextInt();
    	System.out.println("Ingresela altura");
    	this.altura = sc.nextInt();
	}
    
	public int superficie(){
    	return (this.base*this.altura);
	}
    
	public int perimetro(){
    	return((this.altura+this.base)*2);
	}
    
	public void dibujarRectangulo(){
    	for (int i = 0; i < this.altura; i++) {
        	for (int j = 0; j < this.base; j++) {
            	if(i==0 || i==this.altura-1){
                	System.out.print("*");
            	}else{
                	if(j==0 || j==this.base-1){
                    	System.out.print("*");
                	}else{
                    	System.out.print(" ");
                	}
            	}
        	}	 
        	System.out.println("");
    	}

        }
}
