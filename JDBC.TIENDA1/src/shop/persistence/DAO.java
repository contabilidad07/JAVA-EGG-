/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**onectarme a tienda en mysql
 *
 * @author diegomartinezgiardini
 */
public abstract class DAO { //No puede ser instanciadas

    protected Connection connection = null; //Variables globales, se agregan y luego tmb se debe agregar en la libreria
    protected ResultSet result = null;
    protected Statement sentence = null;

    //Agregamos constantes
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    //Creamos los metodos que esta clase padre le dara a sus hijos
    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            connection = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (result != null) {
                result.close();
            }
            if (sentence != null) {
                sentence.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (Exception e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception { // Recibimos la consulta a ejecutar 
        try {
            conectarBase(); // 1-Se conecta a la base de datos
            sentence = connection.createStatement(); // 2-Prepara la sentencia a ejecutar
            sentence.executeUpdate(sql); // 3-Ejecuta mediante sentencia la query que llega por parametro
        } catch (SQLException | ClassNotFoundException ex) {
            // conexion.rollback();
            /*  
                Ayuda a volver atras en caso de que surja un error, por ejemplo cargando 5000 datos y el dato 1400 tire error. 
                Entonces con rollback podemos deshacer lo hecho hasta ese punto.
            
                Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda
             */
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentence = connection.createStatement();
            result = sentence.executeQuery(sql); //Almaceno el resultado de la consulta, por ejemplo los nombres de los empleados
        } catch (Exception ex) {
            throw ex;
        }
        //No lleva el metodo desconectarBase()
    }
}
