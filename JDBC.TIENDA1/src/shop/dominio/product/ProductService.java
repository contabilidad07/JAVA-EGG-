/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.dominio.product;
import java.util.Collection;
import shop.persistence.ProductDAO;

/**conectarme a tienda en mysql
 *
 * @author Cecilia Bruna
 */
public class ProductService {
    
private ProductDAO dao;

    public ProductService() {
        this.dao = new ProductDAO();
    }

    public void crearProducto(String nombre, Double precio, Integer codigoFab) throws Exception {
        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar nombre del producto.");
            }

            if (precio == null || precio < 0) {
                System.out.println(precio);
                throw new Exception("Debe indicar un precio vÃ¡lido.");
            }

            Product producto = new Product();

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodFabricante(codigoFab);

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
        //Creamos el producto
    }

    public Collection<Product> listarRangoPrecio() throws Exception {
        try {

            //Collection<Product> productos = dao.listarRangoPrecio();
            return dao.listarRangoPrecio();

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto(Integer codigo) throws Exception {
        try {
            if (codigo == null || codigo <= 0) {
                throw new Exception("CÃ³digo invalido o no existe.");
            }
            dao.eliminarProducto(codigo);

        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Product> listarProductos(Product producto) throws Exception {
        try {
            return dao.listarProductos();

        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Product> listarPorNombreYPrecio() throws Exception {
        try {
            return dao.listarPorNombreYPrecio();

        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Product> listarPortatil() throws Exception {
        try {
            return dao.listarPortatiles();
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Product> listarPrecioMasBarato() throws Exception {
        try {
            return dao.listarPrecioMasBarato();

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecio(Integer codigo, Double precio) throws Exception {
        try {
            if (codigo == null || codigo <= 0) {
                throw new Exception("CÃ³digo invalido o no existe.");
            }
            if(precio == null || precio <= 0) {
                throw new Exception("Precio invÃ¡lido.");
            }
            
            dao.modificarPrecio(codigo, precio);

        } catch (Exception e) {
            throw e;
        }
    }
}

