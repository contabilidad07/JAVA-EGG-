/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.persistence;

import java.util.ArrayList;
import java.util.Collection;
import shop.dominio.product.Product;
/**
 *
 * @author Cecilia Bruna
 */

public final class ProductDAO extends DAO {




    public void guardarProducto(Product producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto.");
            }

            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ('" + producto.getNombre() + "' , " + producto.getPrecio() + " ," + producto.getCodFabricante() + ");";

            System.out.println(sql);

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecio(Integer codigo, Double precio) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar un codigo valido.");
            }

            String sql = "UPDATE Producto SET "
                    + "precio = " + precio + " WHERE codigo = " + codigo + ";";
            System.out.println(sql);
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(Integer codigo) throws Exception {

        try {

            String sql = "DELETE FROM Producto WHERE codigo = " + codigo + ";";
            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Product buscarProductoPorCodigo(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM Producto "
                    + "WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Product producto = null;

            while (result.next()) { //Consulto si en resultado hay algun valor proximo
                producto = new Product();
                producto.setCodigo(result.getInt(1));
                producto.setNombre(result.getString(2));
                producto.setPrecio(result.getDouble(3));
                producto.setCodFabricante(result.getInt(4));
            }

            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Product> listarProductos() throws Exception {
        try {

            String sql = "SELECT * FROM Producto";

            consultarBase(sql);

            Product producto = null;

            Collection<Product> productos = new ArrayList();

            while (result.next()) {
                producto = new Product();
                producto.setCodigo(result.getInt(1));
                producto.setNombre(result.getString(2));
                producto.setPrecio(result.getDouble(3));
                producto.setCodFabricante(result.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("System Error");
        }
    }

    public Collection<Product> listarRangoPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 and 202";
            System.out.println(sql);

            consultarBase(sql);

            Product producto = null;

            Collection<Product> productos = new ArrayList();

            while (result.next()) {
                producto = new Product();
                producto.setCodigo(result.getInt(1));
                producto.setNombre(result.getString(2));
                producto.setPrecio(result.getDouble(3));
                producto.setCodFabricante(result.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("System Error");
        }
    }

    public Collection<Product> listarPorNombreYPrecio() throws Exception {
        try {

            String sql = "SELECT nombre, precio FROM Producto";

            consultarBase(sql);

            Product producto = null;

            Collection<Product> productos = new ArrayList();

            while (result.next()) {
                producto = new Product();

                producto.setNombre(result.getString(1));
                producto.setPrecio(result.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("System Error");
        }
    }

    public Collection<Product> listarPortatiles() throws Exception {
        try {

            String sql = "SELECT nombre FROM producto WHERE nombre like '%portatil%'";

            consultarBase(sql);

            Product producto = null;

            Collection<Product> productos = new ArrayList();

            while (result.next()) {
                producto = new Product();

                producto.setNombre(result.getString(1));
                //producto.setPrecio(result.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("System Error");
        }
    }
    
    public Collection<Product> listarPrecioMasBarato() throws Exception {
        try {

            String sql = "SELECT nombre, precio FROM Producto ORDER BY precio LIMIT 1";

            consultarBase(sql);

            Product producto = null;

            Collection<Product> productos = new ArrayList();

            while (result.next()) {
                producto = new Product();

                producto.setNombre(result.getString(1));
                producto.setPrecio(result.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("System Error");
        }
    }
    
    public void modificarProducto(Product producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto.");
            }
            if(producto.getPrecio() == null || producto.getPrecio() <= 0) {
                throw new Exception("El precio debe ser mayor a 0.");
            }
            if(producto.getNombre() == null || producto.getNombre() == "") {
                throw new Exception("Debe colocar al menos un caracter al nombre.");
            }

            String sql = "UPDATE Producto SET "
                    + "precio = " + producto.getPrecio() + " WHERE codigo = " + producto.getCodigo() + ";";
            System.out.println(sql);
            
            
        } catch (Exception e) {
            throw e;
        }
    }
}
