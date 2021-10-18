package shop.persistence;

import shop.dominio.manufacturer.Manufacturer;

/**
 *
 * @author Cecilia Bruna
 */

    public final class ManufacturerDAO extends DAO {

    public void guardarFabricante(Manufacturer fab) throws Exception {
        try {
            if (fab == null) {
                throw new Exception("Debes indicar un fabricante.");
            }

            String sql = "INSERT INTO Fabricante (nombre) VALUES('" + fab.getNombreFab() + "');";
            
            System.out.println(sql);
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
}


