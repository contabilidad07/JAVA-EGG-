/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.dominio.manufacturer;

/**
 *
 * @author Cecilia Bruna
 */
public class Manufacturer {
    
    private Integer codigoFab;
    private String nombreFab;
    
    public Manufacturer() {
    }

    public Manufacturer(Integer codigoFab, String nombreFab) {
        this.codigoFab = codigoFab;
        this.nombreFab = nombreFab;
    }

    public Integer getCodigoFab() {
        return codigoFab;
    }

    public void setCodigoFab(Integer codigoFab) {
        this.codigoFab = codigoFab;
    }

    public String getNombreFab() {
        return nombreFab;
    }

    public void setNombreFab(String nombreFab) {
        this.nombreFab = nombreFab;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "codigoFab=" + codigoFab + ", nombreFab=" + nombreFab + '}';
    }
    
    
}
