/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
18
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad
 *
 * @author Cecilia Bruna-camus
 */
public class Ejercicio6 {

    
    public static void main(String[] args) {
         ServiciosCafetera sc = new ServiciosCafetera();//objeto sc clase serviciosCafetera
        Cafetera c1 = sc.crearCafetera(); //objeto cl de clase cafetera igual al objeto sc metodo crear cafetera, metodo con funcion, devuelve cafetera
         sc.servirTaza(c1);
        sc.llenarCafetera(c1);
        sc.agregarCafe(c1,40);
       
    }
    
}
