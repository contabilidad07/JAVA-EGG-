/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.dominio.product;

/**conectarme a tienda en mysql
 *
 * @author Cecilia Bruna
 */
public class Product {
    
private Integer codigo; //primary key
    private String nombre;
    private Double precio;
    private Integer codFabricante; // foreign key

    public Product() {
    }

    public Product(Integer codigo, String nombre, Double precio, Integer codFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codFabricante = codFabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(Integer codFabricante) {
        this.codFabricante = codFabricante;
    }

    @Override
    public String toString() {
        return "Product{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codFabricante=" + codFabricante + '}';
    }
    
}

