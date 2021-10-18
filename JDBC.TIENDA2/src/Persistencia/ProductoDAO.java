/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO{
    
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" +producto.getCodigo()+ "' , '" + producto.getNombre()+ "', '" + producto.getPrecio()+ "', '" + producto.getCodigoFabricante()+ "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "',precio='"+producto.getPrecio()+"',codigo_fabricante='"+producto.getCodigoFabricante()+"' WHERE codigo = '" + producto.getCodigo()+"';";

            insertarModificarEliminar(sql);
            System.out.println("Producto modificado con Ã©xito!!!!!");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    

    public Producto buscarProductoPorId(Integer id) throws Exception {
        try {
            String sql = "SELECT * FROM producto "
                    + " WHERE codigo = '" + id + "'";
            consultarBase(sql);
           Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
                
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public List<Producto> listarNombreProductos() throws Exception {
        try {
                      
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            Producto producto = null;
            List<Producto> productos = new ArrayList<>();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public List<Producto> listarProductos() throws Exception {
        try {
                      
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            List<Producto> productos = new ArrayList<>();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            
            return productos;
            
        } catch (Exception e) {
            
            desconectarBase();
            throw e;
        }
    }
    
    public List<Producto> listarRangoPrecios() throws Exception {
        try {
                      
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);
            Producto producto = null;
            List<Producto> productos = new ArrayList<>();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public List<Producto> listarPortatil() throws Exception {
        try {
                      
            String sql = "SELECT * FROM producto WHERE nombre LIKE \"Port%\"";
            consultarBase(sql);
            Producto producto = null;
            List<Producto> productos = new ArrayList<>();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public List<Producto> listarProductoBarato() throws Exception {
        try {
                      
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBase(sql);
            Producto producto = null;
            List<Producto> productos = new ArrayList<>();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }


}
