/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import JDBC.entidad.Usuario;
import JDBC.exception.MiExcepcion;

public class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws MiExcepcion {
        try {
            if (usuario == null) {
                throw new MiExcepcion("USUARIO INVÃ�LIDO");
            }

            // SENTENCIA SQL DE INSERCIÃ“N
            String sql = "INSERT INTO usuario(correo, nombre, apellido) "
                    + "VALUES('" + usuario.getCorreo()
                    + "', '" + usuario.getNombre() + "', '" + usuario.getApellido()
                    + "');";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR USUARIO");
        }
    }

    public void modificarUsuario(Usuario usuario) throws MiExcepcion {
        try {
            if (usuario == null) {
                throw new MiExcepcion("USUARIO INVÃ�LIDO");
            }

            // SENTENCIA SQL DE MODIFICACIÃ“N
            String sql = "UPDATE usuario SET nombre = '" + usuario.getNombre() + "', "
                    + "apellido = '" + usuario.getApellido() + "' "
                    + "WHERE correo = '" + usuario.getCorreo() + "';";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR USUARIO");
        }
    }

    public Usuario buscarUsuarioPorCorreo(String correo) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM usuario WHERE correo = '" + correo + "';";

            consultarBase(sql);

            Usuario usuario = null;

            while (resultado.next()) {
                usuario = new Usuario();

                usuario.setCorreo(resultado.getString(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setApellido(resultado.getString(3));
            }

            return usuario;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER USUARIO");
        } finally {
            desconectarBase();
        }
    }

    public void eliminarUsuario(String correo) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE ELIMINACIÃ“N
            String sql = "DELETE FROM usuario WHERE correo = '" + correo + "';";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR USUARIO");
        }
    }

    public List<Usuario> obtenerUsuarios() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM usuario"; // "SELECT correo, nombre, apellido FROM usuario";

            consultarBase(sql);

            List<Usuario> usuarios = new ArrayList<>();
            Usuario usuario = null;

            while (resultado.next()) {
                usuario = new Usuario();

                usuario.setCorreo(resultado.getString(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setApellido(resultado.getString(3));

                usuarios.add(usuario);
            }

            return usuarios;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER USUARIOS");
        } finally {
            desconectarBase();
        }
    }
}
