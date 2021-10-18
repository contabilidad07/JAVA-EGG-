/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class ProductoServicio {

    public ProductoServicio() {
    }
    
    
    
    public void listarNombreProductos() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("Nombre Producto: ");
                for (Producto aux : productos) {
                    System.out.println(aux.getNombre());
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
     public void listarCodigoNombreProductos() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("CÃ³digo:\t\t"+espacios("Nombre:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo()+"\t\t" + aux.getNombre());
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    public void listarNombrePrecioProductos() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarProductos();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println(espacios("Nombre Producto:")+espacios("Precio:"));
                for (Producto aux : productos) {
                    System.out.println(espacios(aux.getNombre()) +"$ "+ aux.getPrecio());
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    
    public void listarRangoPrecios() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarRangoPrecios();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("Codigo:\t\t"+ espacios("Nombre Producto:")+espacios("Precio:")+espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo()+"\t\t"+ espacios(aux.getNombre()) +"$ "+ espacios(String.valueOf(aux.getPrecio()))+espacios(String.valueOf(aux.getCodigoFabricante())));
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    
    public void listarPortatil() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarPortatil();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("Codigo:\t\t"+ espacios("Nombre Producto:")+espacios("Precio:")+espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo()+"\t\t"+ espacios(aux.getNombre()) +"$ "+ espacios(String.valueOf(aux.getPrecio()))+espacios(String.valueOf(aux.getCodigoFabricante())));
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    public void listarProductoBarato() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        try {
            List<Producto> productos = dao.listarProductoBarato();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("Codigo:\t\t"+ espacios("Nombre Producto:")+espacios("Precio:")+espacios("Codigo Fabricante:"));
                for (Producto aux : productos) {
                    System.out.println(aux.getCodigo()+"\t\t"+ espacios(aux.getNombre()) +"$ "+ espacios(String.valueOf(aux.getPrecio()))+espacios(String.valueOf(aux.getCodigoFabricante())));
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    
    public void cargarProducto() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        FabricanteServicio fabricante = new FabricanteServicio();
        Scanner sc = new Scanner(System.in);
        Producto nuevoProducto = new Producto();
        System.out.println("Ingrese el nombre del producto:");
        nuevoProducto.setNombre(sc.nextLine());
        System.out.println("Ingrese el precio del producto:");
        nuevoProducto.setPrecio(sc.nextDouble());
        System.out.println("Ingrese el cÃ³digo del fabricante: ");
        fabricante.listarFabricantes();
        nuevoProducto.setCodigoFabricante(sc.nextInt());sc.nextLine();
        dao.guardarProducto(nuevoProducto);
        System.out.println("Producto Cargado con Ã©xito!!!");
        
    }
    public void modificarProducto() throws Exception{
        ProductoDAO dao = new ProductoDAO();
        FabricanteServicio fabricante = new FabricanteServicio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el codigo del producto a modificar:");
        listarCodigoNombreProductos();
        Producto nuevoProducto = dao.buscarProductoPorId(sc.nextInt());sc.nextLine();
        System.out.println("Desea modificar el nombre? y/n");
        String opcion = sc.nextLine().toUpperCase();
        if(opcion.equals("Y")){
            System.out.println("Ingrese el nuevo nombre:");
            nuevoProducto.setNombre(sc.nextLine());
        }
        System.out.println("Desea modificar el precio? y/n");
        opcion = sc.nextLine().toUpperCase();
        if(opcion.equals("Y")){
            System.out.println("Ingrese el nuevo precio:");
            nuevoProducto.setPrecio(sc.nextDouble());
        }
        System.out.println("Desea modificar el codigo del fabricante? y/n");
        opcion = sc.nextLine().toUpperCase();
        if(opcion.equals("Y")){
            System.out.println("Elija el codigo del fabricante:");
            fabricante.listarFabricantes();
            nuevoProducto.setCodigoFabricante(sc.nextInt());sc.nextLine();
        }
        dao.modificarProducto(nuevoProducto);
        
    }
    
    public static String espacios(String cadena){
        int cantEspacios = 40-cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena +=" ";
        }
        return cadena;
    }

}
