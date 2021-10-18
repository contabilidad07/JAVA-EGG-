/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cecilia Bruna
 */
public abstract class DAO {// la usamos como padre de todas las otras clases DAO
    //variables que toman la data de la base de datos
    protected Connection conexion = null; //atributo del  tipo connection lo inicializo en nulo, administra la conexion
    protected ResultSet resultado = null; //atributo del  tipo Resulset
    protected Statement sentencia = null; //atributo del  tipo Statement, voya agregar MySQL DRIVER en libreria y le importo
    //connection, Resulset, Statement (variables globales)
    private final String USER = "root"; // constantes , nombre usuario, clave
    private final String PASSWORD = "root";
    private final String DATABASE = "perros";//nombre de la base de datos previamente creada
    private final String DRIVER = "com.mysql.jdbc.Driver";// descripcion del tipo de conector que uso en este DAO
//creo los métodos que este DAO padre o madre le dará a sus hijos

   
    protected void conectarBase() throws Exception {  //void, no recibe nada  envuelto en try an catch
        try {
            Class.forName(DRIVER);     //para cada base se debe elegir su driver. 1° clas forName(nombre driver)   registra el driver   
            
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false"; 
             // url que nos conecta a la base de datos
            //REVISAR LA URL CONECTADA EN SERVICE AMARILLO, SI DICE zeroDateTimeBehavior=convertToNull LO CAMBIO POR ESTA "?useSSL=false" EN PROPERTIES y 
            //y queda jdbc:mysql://localhost:3306/perros?useSSL=false
            
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);// Drivemanager importo import java.sql.DriverManager;
        } catch (ClassNotFoundException | SQLException ex) {  // importo java sql exception
            throw ex;
        }
    }

    //CONSULTO LO NECESARIO Y LO CIERRO
    // hay que cortar las consultas, consulto lo que necesito, y luego que lo saco de la base de datos y plasmarlo en java
    // tengo que cortar la conexion a la base de datos, no la dejo abierta xq el servidor tiene un numero limitado de conexiones  
    protected void desconectarBase() throws Exception {
        try {                          // el try intenta cerrar la base de datos con las tres opciones si es que estan abiertos
                                        // si surge un error lo atrapa el catch, lanza la excepcion el error para que se muestre, le agregamos el throw
            if (resultado != null) { //resultado es una variable Resulset de consulta   , que alberga un resultado de 1 consulta
                resultado.close();  //cdo ya consulté lo cierro  (.close)
            }
            if (sentencia != null) {//en sentencia algo que quiero ejecutar en la base de datos y luego la cierro
                sentencia.close();
            }
            if (conexion != null) { // 
                conexion.close();
            }
        } catch (Exception ex) {// puede largar una excepcion
            throw ex;
        }
    }
// como ya me desconecte de la base de datos x el metodo deconectarBase, me tengo que volver a conectar
        protected void insertarModificarEliminar(String sql) throws Exception { // recibe una variable tipo string llamada sql, recibe la consulta a ejecutar
        try {
            conectarBase(); // me vuelvo a conectar, llamo al metodo conectarBase
            sentencia = conexion.createStatement(); // en la sentencia uso la varible conexion para conectarme, createStatement()me dice que 
            //estoy preparando me para crear una sentencia de query de sql
            sentencia.executeUpdate(sql);// que ejecute la query que llego de la varible(sql) cuando modifica es executeUpdate
          
            
        } catch (SQLException ex) { // si larga error el catch lo toma como sql exception
            // conexion.rollback();          // si algo sale mal lo devuelve al estado anterior es lo correcto usar
            /*
                Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;   // el autocommit debería estar en true si quiero usar el rollback, si el autocommit falla aplica el rollback
                COMMIT;
            
                **Sin rollback igual anda
             */
            throw ex;
        } finally {
            desconectarBase();  // llama al metodo desconectarBase cada vez qaue inserte, modifique o elimine se desconecte
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase(); // me vuelvo a conectar, llamo al metodo conectarBase
            sentencia = conexion.createStatement();// en la sentencia uso la varible conexion para conectarme, createStatement()me dice que 
            //estoy preparando me para crear una sentencia de query de sql
            resultado = sentencia.executeQuery(sql); //variable resultado tipo resulset que ejecute la query que llego de la varible(sql)
            //cuando consulta es  es executeQuery (resultado alberga el rdo de la consulta)cdo termina la consulta se cierre y se borra lo acumulado de la consulta
        } catch (Exception ex) {
            throw ex;
        }
    }
}
