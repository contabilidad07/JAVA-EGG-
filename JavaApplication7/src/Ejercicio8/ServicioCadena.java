/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**Herrera Felipe
 * En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 * @author Cecilia Bruna
 */
public class ServicioCadena {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

	// Crea la cadena ingresada por el usuario  y obtiene su longitud.
	public Cadena crearCadena() { //metodo crearCadena
		System.out.println("Ingresa una frase: ");
		String frase = leer.next();// lee variable frase

		int longitudFrase = frase.length();// igualo longitudfrase al largo de la frase

		return new Cadena(frase, longitudFrase);//que retorne una nueva cadena,llamando a su constructor (cadena) para retornar parametros
        //en lugar de setear los atributos, lo guarde en variables frase y longitud y lo pase por constructor, hay que hacer objeto
        //new crea un nuevo objeto clase cadena y enviamos los parametros segun el constructor
	}
	/*
	 * Deberá contabilizar la cantidad de vocales que tiene
	 * la frase ingresada.
	 */
	public void mostrarVocales(Cadena c) {//
		// obtenemos la cadena del objeto
		String frase = c.getFrase();//muestra la frase

		// Variables contador para c/u de las vocales
		int a = 0, e = 0, i = 0, o = 0, u = 0;

		// Recorremos la frase para contar las vocales
		for (int j = 0; j < frase.length(); j++) {
			// con charAt obtenemos el caracter actual del recorrido
			// y dentro del switch evualamos coincidencias con las vocales e incrementa el
			// contador correspondiente
			switch (frase.charAt(j)) {//paso de string a char y evalua en cada posicion j y luego cuenta
			case 'a':
				a++; // contador a
				break;
			case 'e':
				e++;// contador e
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;

			default:
				break;
			}
		}

		System.out.println();
		System.out.println("La frase tiene: " + a + " vocales A");
		System.out.println("La frase tiene: " + e + " vocales E");
		System.out.println("La frase tiene: " + i + " vocales I");
		System.out.println("La frase tiene: " + o + " vocales O");
		System.out.println("La frase tiene: " + u + " vocales U");
	}

	/*
	 * Deberá invertir la frase ingresada y mostrar la frase
	 * invertida por pantalla.
	 */
	public String invertirFrase(Cadena c) {
		String cadenaInvertida = "";// inicializo variable cadenaInvertida

		// Recorremos la frase desde el fin hasta el inicio de la cadena
		//  y almacenamos caracter por caracter a la cadena invertida
		for (int i = c.getFrase().length() - 1; i >= 0; i--)// recorre al reves de mayor a menor
			cadenaInvertida = cadenaInvertida + c.getFrase().charAt(i);//paso a char la posicion i
		return cadenaInvertida;
	}

	/*
	 * Deberá recibir por parámetro un carácter
	 * ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase.
	 */
	public void vecesRepetido(Cadena c, char letra) {
		int contador = 0;
		
		// Recorremosla frase en busca de la letra
		for (int i = 0; i < c.getFrase().length(); i++) {
			// validamos coincidencias
			if (c.getFrase().charAt(i)== letra) {
				contador++; 
			}
		}
				System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
	}

	/*
	 * Deberá comparar la longitud de la frase que compone la clase 
	 * con otra nueva frase ingresada por el usuario.
	 */
	public void compararLongitud(Cadena c, String nuevaFrase) {
		// comparamos las longitudes
		if (c.getLongitudFrase() == nuevaFrase.length() ) {
			System.out.println("Las dos frases tienen la misma longitud.");
		} else {
			System.out.println("La longitud de las frases es distinta.");
		}
	}

	/*
	 * Deberá unir la frase contenida en la clase
	 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
	 * resultante.
	 */
	public void unirFrases(Cadena c, String nuevaFrase) {
		String fraseConcatenada = c.getFrase().concat(nuevaFrase); // unimos las frases
		System.out.println("\nLa frase resultante es: [" + fraseConcatenada + "].");
	}

	/*
	 * Deberá reemplazar todas las letras “a” que
	 * se encuentren en la frase, por algún otro carácter seleccionado por el
	 * usuario y mostrar la frase resultante.
	 */
	public void reemplazar(Cadena c, String nuevaLetra) {
		String nuevaFrase = c.getFrase().replace("a", nuevaLetra); // reemplazamos el cracter a por el nuevo
		System.out.println("La frase resultante con caracteres reemplazados es: [" + nuevaFrase + "].");
	}

	/*
	 * Método contiene(String letra), deberá comprobar si la frase contiene una
	 * letra que ingresa el usuario y devuelve verdadero si la contiene y falso si
	 * no.
	 */
	public boolean contiene(Cadena c, String letra) {
		boolean resultado = false;
		char aux_letra;
		int contador = 0;
		
		// Recorremos la frase para comparar caracter por caracter
		for (int i = 0; i < c.getFrase().length(); i++) {
			// almacenamos el caracter de la frase
			aux_letra = c.getFrase().charAt(i); 
			
			// Validamos si los cracteres son iguales
			resultado = letra.contains(String.valueOf(aux_letra));
			
			// si resultado es true aumentamos contador
			if (resultado) {
				contador++;
			}
		}
		
		/*
		 *  si el contador es distinto a cero resultado sera true.
		 *  Nota: hacemos uso del [ operador ternario ?: ] 
		 *  resultado = (condicion) ? valor_si : valor_sino;
		 */
		return resultado = (contador != 0) ? true : false;
	}
}
