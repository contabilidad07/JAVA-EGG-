/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Cecilia Bruna
 */
public class Perro {
     private String nombreP;
    private String apodo;
    private String raza;
    private boolean tieneD; ///Este aributo es de validacion ... si el perro tiene dueño no lo muestro, sino tiene dueño si lo muestro para adopcion

    public Perro(String nombreP, String apodo, String raza) {
        this.nombreP = nombreP;
        this.apodo = apodo;
        this.raza = raza;
        this.tieneD = false;
    }

    public Perro() {
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isTieneD() {
        return tieneD;
    }

    public void setTieneD(boolean tieneD) {
        this.tieneD = tieneD;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreP=" + nombreP + ", apodo=" + apodo + ", raza=" + raza + ", tieneD=" + tieneD + '}';
    }

    
}
