/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**Cortinez Juan JosÃ©
 *
 * @author Cecilia Bruna
 */
@Entity// se mapea con tablas de la base de datos
public class Producto implements Serializable{
    

   @Id
    private String id;
    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;
            @ManyToOne //muchos productos pueden tener un fabricante, establezco la relacion
    private Fabricante fabricante; //agrego atributo de la clase fabricante

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
    
    

}

