/*Ejercicio 1
 *
 */
package POO_Ejercicios_Guia;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 *
 * @author Cecilia Bruna
 */
public class Libro { // clase libro
    int ISBN;   // atributos
    String titulo;
    int numeroPaginas;

    public Libro(int ISBN, String titulo, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
    }
    
  
}
