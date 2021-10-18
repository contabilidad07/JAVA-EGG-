package shop;

import java.util.Collection;
import java.util.Scanner;
import shop.dominio.manufacturer.Manufacturer;
import shop.dominio.manufacturer.ManufacturerService;
import shop.dominio.product.Product;
import shop.dominio.product.ProductService;

/**
 *onectarme a tienda en mysql
 * @author diegomartinezgiardini
 */
public class shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ProductService ps = new ProductService();
        ManufacturerService ms = new ManufacturerService();

        try {

            // 1 - Listar todos los productos
            /*1
            Product p = new Product();
            Collection<Product> productos = ps.listarProductos(p);
            for (Product aux : productos) {
                System.out.println(aux);
            }
             */
            // 2 - Listar productos por nombre y precio
            /*
            Collection<Product> productos = ps.listarPorNombreYPrecio();
            for (Product aux : productos) {
                System.out.println(aux.getNombre()+" = $"+aux.getPrecio());
            }
             */
            // 3 - Listar por rango de precios
            /*
            Collection<Product> productos = ps.listarRangoPrecio();
            for (Product producto : productos) {
                System.out.println(producto);
            }
             */
            // 4 - Listar portatiles
            /*
            Collection<Product> productos = ps.listarPortatil();
            for (Product producto : productos) {
                System.out.println(producto.getNombre());
            }
             */
            // 5 - Listar producto con precio mas barato
            /*
            Collection<Product> productos = ps.listarPrecioMasBarato();
            for (Product aux : productos) {
                System.out.println(aux.getNombre() + " = $" + aux.getPrecio());
            }
             */
            // 6 - Crear producto
            //ps.crearProducto("iPad",500.00,2);
            // 7 - Crear un fabricante
            /*
            Manufacturer fab = new Manufacturer(null,"Apple");
            ms.crearFabricante(fab);
             */
            // 8 - Modificar un producto
            //ps.modificarPrecio(2, 100000.00);
            menu();
            // 9 - Eliminar un producto
            //ps.eliminarProducto(13);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void menu() throws Exception {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ProductService ps = new ProductService();
        ManufacturerService ms = new ManufacturerService();

        int op;
        do {
            System.out.println("<---------------------->");
            System.out.println("BIENVENIDOS!\n"
                    + "1.Listar todos los productos.\n"
                    + "2.Listar nombre y precios.\n"
                    + "3.Listar entre rango de precio 120 y 200.\n"
                    + "4.Listar todos los portÃ¡tiles.\n"
                    + "5.Listar nombre y precio del producto mas barato.\n"
                    + "6.Ingresar producto a BBDD.\n"
                    + "7.Ingresar fabricante a la BBDD.\n"
                    + "8.Actualizar precio de un producto.\n"
                    + "9.Borrar un producto.\n"
                    + "10.SALIR");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    Product p = new Product();
                    Collection<Product> productos = ps.listarProductos(p);
                    for (Product aux : productos) {
                        System.out.println(aux);
                    }
                    break;

                case 2:
                    productos = ps.listarPorNombreYPrecio();
                    for (Product aux : productos) {
                        System.out.println(aux.getNombre() + " = $" + aux.getPrecio());
                    }
                    break;
                    
                case 3:
                    productos = ps.listarRangoPrecio();
                    for (Product producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                    
                case 4:
                    productos = ps.listarPortatil();
                    for (Product producto : productos) {
                        System.out.println(producto.getNombre());
                    }
                    break;
                    
                case 5:
                    productos = ps.listarPrecioMasBarato();
                    for (Product aux : productos) {
                        System.out.println(aux.getNombre() + " = $" + aux.getPrecio());
                    }
                    break;
                    
                case 6:
                    System.out.println("Ingrese un producto nuevo: 1Âº-Nombre, 2Âº-Precio, 3Âº-Codigo");
                    ps.crearProducto(sc.next(), sc.nextDouble(), sc.nextInt());
                    break;
                    
                case 7:
                    System.out.println("Agregar nuevo fabricante: 1Âº-CÃ³digo, 2Âº-Nombre");
                    Manufacturer fab = new Manufacturer(sc.nextInt(), sc.next());
                    ms.crearFabricante(fab);
                    break;
                    
                case 8:
                    System.out.println("Ingrese cÃ³digo y nuevo precio: ");
                    ps.modificarPrecio(sc.nextInt(), sc.nextDouble());
                    break;
                    
                case 9:
                    System.out.print("Introduzca codigo de producto a eliminar: ");
                    ps.eliminarProducto(sc.nextInt());
                    break;
                    
                case 10:
                    System.out.println("Gracias por consultar la base de datos!");
                    break;
                    
                default:
                    System.out.println("Elija la opciÃ³n correcta...");
            }
        } while (op != 10);
    }
}
