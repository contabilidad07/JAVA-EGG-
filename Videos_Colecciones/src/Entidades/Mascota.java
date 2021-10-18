/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.Raza;
import Enumeraciones.SexoAnimal;

/**
 *
 * @author Cecilia Bruna
 */

    public class Mascota { // clase Mascota
//atributos
    private String nombre;
   private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private Raza raza;
    private int energia;    // video 7
    private SexoAnimal sexo;
    
    public Mascota() {// genero constructor vacio
        this.energia=1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, Raza raza, int energia, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = energia;
        this.sexo = sexo;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }
     
   

   
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
public String getNombre(){
        return nombre;
    
}          

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public Raza getRaza() {
        return raza;
    }
//    /**
//     * * funcion destinada a pasear /**+enter
//     * @param energiaRestar parametro que llega a la funcion
//     * @return 
//     */
//    public int pasear( int energiaRestar){
//        energia-=energiaRestar;
//        return energia;
//}

//    @Override
//    public String toString() {
//        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + ", sexo=" + sexo + '}';
//    }
/** 
 * funcion destinada a pasear /**+enter
 * @param energiaRestar es el parametro que llega a la funcion
 * @param vueltas es el otro parametro
 * @return energia
 */
//    public int pasear(int energiaRestar,int vueltas) {
//        for (int i = 0; i < vueltas; i++) {// la cantidad de vueltas a realizar sera (vueltas)
//            energia-=energiaRestar;
//        }
//            return energia;
//        
//    }
//    

    
}
