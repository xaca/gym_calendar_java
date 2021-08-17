/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.constantes.Consulta;
import java.sql.*;
import java.util.ArrayList;
import modelo.Fecha;
import modelo.Horario;
import modelo.Reserva;
import modelo.Usuario;
import modelo.constantes.Configuracion;

/**
 *
 * @author xaca
 */
public class GestorBaseDatos {

    public static Horario getHoras() {

        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Horario hora = null;

        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(Consulta.TODAS_LAS_HORAS);
            hora = new Horario();

            while (rs.next()) {
                hora.add(rs.getInt("id"),rs.getInt("hora"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return hora;
    }
    
    
    public static ArrayList<Reserva> traerReservas(int id_hora,Fecha fecha) {

        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        ArrayList<Reserva> reservas = null;
        Reserva reserva;
        Usuario usuario;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            System.out.println(Consulta.traerReservas(id_hora,fecha));
            rs = stmt.executeQuery(Consulta.traerReservas(id_hora,fecha));
            reservas = new ArrayList<Reserva>();
            
            while(rs.next())
            {
                reserva = new Reserva();
                reserva.setId_reserva(rs.getInt("id"));
                reserva.setId_hora(rs.getInt("id_hora"));
                reserva.setFecha(new Fecha(rs.getString("dia")));
                usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setCorreo(rs.getString("correo"));
                reserva.setUsuario(usuario);
                reservas.add(reserva);
            }
            
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return reservas;
    }
    
    
    /**
     * Inserta un usuario en la base de datos
     * @param usuario Objeto de tipo Usuario
     * @return true si se realizo la operacion correctamente, false en caso contrario
     */
    public static boolean insertar(Usuario usuario) {

        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            pe = conn.prepareStatement(Consulta.crearInsertUsuario(usuario),Statement.RETURN_GENERATED_KEYS);
            pe.executeUpdate();
            rs = pe.getGeneratedKeys();

            if(rs.next())
            {
                usuario.setId(rs.getInt(1));
                pe = conn.prepareStatement(Consulta.crearInsertClave(usuario),Statement.RETURN_GENERATED_KEYS);
                pe.executeUpdate();
                rs = pe.getGeneratedKeys();
                
                if(rs.next())
                {
                    return rs.getInt(1)>1;//TODO: Se puede validar si se inserto la clave, sino hacer un rollback
                }
            }
            
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
    

    public static Usuario actualizarReserva(Usuario usuario) {
        
        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Usuario respuesta = null;

        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(Consulta.crearValidacionClave(usuario));
            
            if (rs.next()) {
                respuesta = new Usuario();
                respuesta.setId(rs.getInt("id"));
                respuesta.setUsuario(rs.getString("usuario"));
                respuesta.setNombre(rs.getString("nombre"));
                respuesta.setApellido(rs.getString("apellido"));
                respuesta.setCorreo(rs.getString("correo"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return respuesta;
    }
    
    public static Usuario validarClave(Usuario usuario) {
        
        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Usuario respuesta = null;

        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(Consulta.crearValidacionClave(usuario));
            
            if (rs.next()) {
                respuesta = new Usuario();
                respuesta.setId(rs.getInt("id"));
                respuesta.setUsuario(rs.getString("usuario"));
                respuesta.setNombre(rs.getString("nombre"));
                respuesta.setApellido(rs.getString("apellido"));
                respuesta.setCorreo(rs.getString("correo"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return respuesta;
    }

    public static boolean actualizar(Usuario usuario) {
        Connection conn;
        PreparedStatement pe;
        ResultSet rs;
        boolean respuesta = false;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            System.out.println(Consulta.actualizarUsuario(usuario));
            pe = conn.prepareStatement(Consulta.actualizarUsuario(usuario));
            pe.execute();    
            respuesta = pe.getUpdateCount()>0;
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return respuesta;
    }
    
    public static Usuario traerUsuario(Usuario usuario) {

        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Usuario respuesta = null;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            System.out.println(Consulta.traerUsuario(usuario));
            rs = stmt.executeQuery(Consulta.traerUsuario(usuario));
            
            if(rs.next())
            {
                respuesta = new Usuario();
                respuesta.setId(rs.getInt("id"));
                respuesta.setUsuario(rs.getString("usuario"));
                respuesta.setNombre(rs.getString("nombre"));
                respuesta.setApellido(rs.getString("apellido"));
                respuesta.setDireccion(rs.getString("direccion"));
                respuesta.setTelefono(rs.getString("telefono"));
                respuesta.setCorreo(rs.getString("correo"));
            }
            
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return respuesta;
    }

    public static boolean borrarReserva(Usuario usuario) {
        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        boolean resultado = false;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            System.out.println(Consulta.borrarReserva(usuario));
            
            stmt.execute(Consulta.borrarReserva(usuario));
            resultado = stmt.getUpdateCount()>0;
                        
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
}
