/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.constantes.Consulta;
import java.sql.*;
import modelo.Fecha;
import modelo.Hora;
import modelo.Usuario;
import modelo.constantes.Configuracion;

/**
 *
 * @author xaca
 */
public class GestorBaseDatos {

    public static Hora getHoras() {

        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Hora hora = null;

        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(Consulta.TODAS_LAS_HORAS);
            hora = new Hora();

            while (rs.next()) {
                hora.add(rs.getInt(Hora.CAMPO_HORA));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return hora;
    }
    
    
    public static Usuario traerReservas(int id_hora,Fecha fecha) {

        Connection conn;
        Statement stmt;
        ResultSet rs = null;
        Usuario respuesta = null;
        
        try {
            Class.forName(Configuracion.DRIVER);
            conn = DriverManager.getConnection(Configuracion.URL_BASE_DATOS, Configuracion.USUARIO, Configuracion.CLAVE);
            stmt = conn.createStatement();
            //System.out.println(Consulta.crearValidacionClave(usuario));
            //rs = stmt.executeQuery(Consulta.crearValidacionClave(usuario));
            
            if(rs.next())
            {
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
    

}
