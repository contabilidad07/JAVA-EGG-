/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Principal {

    public static void main(String[] args) throws Exception {
        //SOLO PARA CREAR LAS TABLAS SIN NECESIDAD D CREAR UN OBJETO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAModeloBasePU");
        EntityManager em = emf.createEntityManager();
        MenuOpciones nuevaEjecucion = new MenuOpciones();
        nuevaEjecucion.menu();

    }
}