
package Principal.persistencia;


import Principal.dominio.usuario.Usuario;
import java.util.ArrayList;
import java.util.Collection;

public final class UsuarioDAO extends DAO {  //final para que nadie herede de esta clase, extends para heredar de DAO

    public void guardarUsuario(Usuario usuario) throws Exception { //recibe la clase  usuario como objeto (paquete principal.dominio.usuario, lo importo)
        try {
            if (usuario == null) {  // si el usuario es nulo lanzamos la excepcion con el trow new
                throw new Exception("Debe indicar el usuario"); // lanza una exception con el mensaje entre comillas se  añade la clausula throws al metodo
            }
// variable sql sentencia sql nativo(base datos)obtengo el correo y la clave del objeto que llega (clase usuario) y realizo una query de sql
            String sql = "INSERT INTO Usuario (correoElectronico, clave)"  //insertar en la tabla usuario (de la base de datos)los atributos correo eletronico y clave
                    //cuyos valores son entre (comillas dobles la frase tipo string para java, la comilla simple es para sql) el correo del usuario y la clave
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";  // lo envío a 
 
            insertarModificarEliminar(sql); //lo envia al metodo insertarModificarEliminar (de clase DAO PADRE)para ejecutar una query en la base de datos (no la modifica) 
            //solo modifica mi query, no la database de sql
        } catch (Exception e) {
            throw e;   //throw es el error = (e), lo atrapa, lo lanza mas adelante
        } finally {
            desconectarBase();
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {//modifica el usuario, seteo los datos
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario que desea modificar");
            }

            String sql = "UPDATE Usuario SET " //armo la query nativa
                    + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "'";

            insertarModificarEliminar(sql);//lo envia al metodo insertarModificarEliminar (de clase DAO PADRE)para ejecutar una query en la base de datos (no la modifica) 
            //solo modifica mi query, no la database de sql
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarUsuario(String correEletronico) throws Exception {
        try {

            String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + correEletronico + "'";  // query nativa

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {
        try {

            String sql = "SELECT * FROM Usuario "
                    + " WHERE correoElectronico = '" + correoElectronico + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM Usuario "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Usuario> listarUsuarios() throws Exception {
        try {
            String sql = "SELECT correoElectronico, clave FROM Usuario ";

            consultarBase(sql);

            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
