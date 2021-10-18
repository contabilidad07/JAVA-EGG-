/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1tarde_repaso;

/**
 *
 * @author Cecilia Bruna
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;

     //CONSTRUCTOR PARAMETRIZADO 
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
   //CONSTRUCTOR VACIO
    public Persona() {
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
