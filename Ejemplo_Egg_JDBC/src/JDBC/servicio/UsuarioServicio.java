/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.servicio;

import java.util.List;
import JDBC.entidad.Usuario;
import JDBC.exception.MiExcepcion;
import JDBC.persistencia.UsuarioDAO;

public class UsuarioServicio {

    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() {
        usuarioDAO = new UsuarioDAO();
    }

    public void crearUsuario(String correo, String nombre, String apellido) throws MiExcepcion {
        try {
            // VALIDACIÃ“N
            if (correo == null | correo.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN CORREO");
            }

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }

            if (apellido == null | apellido.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN APELLIDO");
            }

            Usuario usuario = new Usuario();

            usuario.setCorreo(correo);
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);

            usuarioDAO.guardarUsuario(usuario);
        } catch (MiExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

    public void modificarUsuario(String correo, String nombre, String apellido) throws MiExcepcion {
        try {
            // VALIDACIÃ“N
            if (correo == null | correo.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN CORREO");
            }

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }

            if (apellido == null | apellido.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN APELLIDO");
            }

            Usuario usuario = usuarioDAO.buscarUsuarioPorCorreo(correo);

            if (usuario == null) {
                throw new MiExcepcion("EL CORREO INGRESADO NO ESTÃ� ASOCIADO A NINGÃšN USUARIO");
            }

            usuario.setNombre(nombre);
            usuario.setApellido(apellido);

            usuarioDAO.modificarUsuario(usuario);
        } catch (MiExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

    public void eliminarUsuario(String correo) throws MiExcepcion {
        try {
            if (correo == null || correo.trim().isEmpty()) {
                throw new MiExcepcion("DEBE INGRESAR UN CORREO");
            }

            Usuario usuario = usuarioDAO.buscarUsuarioPorCorreo(correo);

            if (usuario == null) {
                throw new MiExcepcion("EL CORREO INGRESADO NO ESTÃ� ASOCIADO A NINGÃšN USUARIO");
            }

            usuarioDAO.eliminarUsuario(correo);
        } catch (MiExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

    public void imprimirUsuarios() throws MiExcepcion {
        try {
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

            if (usuarios.isEmpty()) {
                throw new MiExcepcion("NO EXISTEN USUARIOS");
            } else {
                System.out.println("*** LISTA DE USUARIOS ***");
                System.out.printf("%-20s%-15s%-15s\n", "CORREO", "NOMBRE", "APELLIDO"); // FORMATO DE IMPRESIÃ“N
                for (Usuario usuario : usuarios) {
                    System.out.println(usuario);
                }
                System.out.println();
            }
        } catch (MiExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }
}
