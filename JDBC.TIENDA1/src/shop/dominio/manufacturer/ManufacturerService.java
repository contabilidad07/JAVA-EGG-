/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.dominio.manufacturer;

import shop.persistence.ManufacturerDAO;

/**
 *
 * @author Cecilia Bruna
 */
public class ManufacturerService {
    
    private ManufacturerDAO dao;

    public ManufacturerService() {
        this.dao = new ManufacturerDAO();
    }

    public void crearFabricante(Manufacturer fab) throws Exception {
        try {
            
            if (fab.getNombreFab() == null || fab.getNombreFab() == "") {
                throw new Exception("Debe ingresar un nombre valido.");
            }

            Manufacturer fabricante = new Manufacturer(); //Creamos un objeto fabricante

            //fabricante.setCodigoFab(fab.getCodigoFab());
            fabricante.setNombreFab(fab.getNombreFab());

            dao.guardarFabricante(fab); //Guardamos el fabricante

        } catch (Exception e) {
            throw e;
        }
    }


}
