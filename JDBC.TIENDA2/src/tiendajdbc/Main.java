/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Cortinez Juan JosÃ©
 */
package tiendajdbc;

import Servicios.MenuServicio;
import java.sql.SQLException;

/**
 *
 * @author Cecilia Bruna
 */
public class Main {

   public static void main(String[] args) throws SQLException, ClassNotFoundException, Exception {
        
        MenuServicio nuevoMenu = new MenuServicio();
        nuevoMenu.Menu();
    }
    
}
