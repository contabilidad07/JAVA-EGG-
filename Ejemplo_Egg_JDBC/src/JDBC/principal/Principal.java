/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.principal;

import JDBC.Menu.Menu;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.menuPrincipal();
    }
}
//jdbc:mysql://localhost:3306/egg?zeroDateTimeBehavior=convertToNull [root on Default schema
//jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull [root on Default schema]
//jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull