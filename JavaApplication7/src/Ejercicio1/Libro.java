    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/** juan cortinez
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 * @author Cecilia Bruna
 */
public class Libro {// clase libro
    private int isbn; //atributos siempre conviene para encapsular y que no cambienlos datos desde otra clase
	private String autor;
	private String titulo;
	private int numPaginas;
    

	public Libro(int isbn, String autor, String titulo, int numPaginas) {// metodo constructor con todos los atrbutos pasados x parametros
    	this.isbn = isbn; //asigna a los atributos con this isbn, los parametros del metodo 
    	this.autor = autor;
    	this.titulo = titulo;
    	this.numPaginas = numPaginas;
	}

	public Libro() {//metodo vacio para pasarle los parametros despues
	}

    

	public void cargarDatos(){ //metodo void cargarDatospara imprimir o cargar datos, no devuelve nada
    	Scanner leer = new Scanner(System.in);//Scanner para leer datos
    	System.out.println("Ingrese el isbn");
    	int isbn1 = leer.nextInt();// lo guardo en la varible isbn1
    	this.isbn = isbn1; // paso datos del parametro  los atributos
    
    	System.out.println("Ingrese el autor");
    	String autor1 = leer.nextLine();
    	this.autor = autor1;
          
        
        
    	System.out.println("Ingrese el titulo");
    	String titulo1 = leer.nextLine();
    	this.titulo = titulo1;
    	System.out.println("Ingrese el numero de paginas");
    	int num = leer.nextInt();
    	this.numPaginas = num;
	}
    
	public void mostrarDatos(){//metodo void para imprimir
    	System.out.println("ISBN: "+this.isbn);
    	System.out.println("Autor: "+this.autor);
    	System.out.println("Titulo: "+this.titulo);
    	System.out.println("Numero de paginas: "+this.numPaginas);

    
}
}
