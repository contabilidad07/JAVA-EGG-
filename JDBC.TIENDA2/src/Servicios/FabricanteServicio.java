/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Fabricante;
import Persistencia.FabricanteDAO;
import static Servicios.ProductoServicio.espacios;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cecilia Bruna
 */
public class FabricanteServicio {
    public void listarFabricantes() throws Exception{
        FabricanteDAO dao = new FabricanteDAO();
        try {
            List<Fabricante> fabricantes = dao.listarFabricantes();
            if(fabricantes.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                System.out.println("CÃ³digo:\t\t"+espacios("Nombre:"));
                for (Fabricante aux : fabricantes) {
                    System.out.println(aux.getCodigo()+"\t\t" + aux.getNombre());
            }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    } 
    
    public void cargarFabricante() throws Exception{
        FabricanteDAO dao = new FabricanteDAO();
        
        Scanner sc = new Scanner(System.in);
        Fabricante nuevoFabricante = new Fabricante();
        System.out.println("Ingrese el nombre del Fabricante:");
        nuevoFabricante.setNombre(sc.nextLine());
        dao.guardarFabricante(nuevoFabricante);
        System.out.println("Fabricante Cargado con Ã©xito!!!");
        
    }

}


