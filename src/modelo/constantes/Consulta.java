/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.constantes;

import modelo.Fecha;
import modelo.Usuario;

/**
 *
 * @author xaca
 */
public class Consulta {
    public static final int ANUALIDAD = 2021;
    public static final String TODOS_LOS_USUARIOS = "select * from usuarios;";    
    public static final String TODAS_LAS_HORAS = "select * from horario;";

    public static String crearInsertUsuario(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `usuarios` (`id`,`usuario`, `nombre`, `apellido`, `direccion`, `telefono`, `correo`) VALUES");
        sql.append("(NULL,'"+usuario.getUsuario()+"' , '"+usuario.getNombre()+"', '"+usuario.getApellido()+"', '"+usuario.getDireccion()+"', '"+usuario.getTelefono()+"', '"+usuario.getCorreo()+"');");
        return sql.toString();
    }
    
    public static String crearInsertClave(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO `claves` (`id`, `id_usuario`, `clave`) VALUES ");
        sql.append("(NULL, '"+usuario.getId()+"', '"+usuario.getClave()+"');");
        return sql.toString();
    }

    public static String crearValidacionClave(Usuario usuario){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM `usuarios` as usuarios,`claves` as claves WHERE usuario ='");
        sql.append(usuario.getUsuario()+"' and clave='");
        sql.append(usuario.getClave()+"' and usuarios.id = claves.id_usuario;");
        return sql.toString();
    }
    
    public static String traerReservas(int id_hora,Fecha fecha){
        //SELECT * FROM `reservas` WHERE id_hora = 1 and dia = '2021-09-08'; 
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM `reservas`,`usuarios` WHERE");
        sql.append(" id_hora = "+id_hora);
        sql.append(" and dia = '"+fecha.getFecha()+"'");
        sql.append(" and reservas.id_usuario = usuarios.id;");
        return sql.toString();
    }
    
    public static String traerUsuario(Usuario usuario){
        //SELECT * FROM `reservas` WHERE id_hora = 1 and dia = '2021-09-08'; 
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM `usuarios` WHERE");
        sql.append(" correo = '"+usuario.getCorreo()+"';");
        return sql.toString();
    }

    public static String actualizarUsuario(Usuario usuario) {
        //UPDATE `usuarios` SET `usuario` = 'Lucy Sky', `direccion` = 'Calle siempre alegre 4 Ever', `telefono` = '3002345618', `correo` = 'lucy.sky@hotmail.com' WHERE `usuarios`.`id` = 3; 
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE `usuarios` SET");
        sql.append(" usuario = '"+usuario.getUsuario()+"',");
        sql.append(" nombre = '"+usuario.getNombre()+"',");
        sql.append(" apellido = '"+usuario.getApellido()+"',");
        sql.append(" direccion = '"+usuario.getDireccion()+"',");
        sql.append(" telefono = '"+usuario.getTelefono()+"'");
        sql.append(" WHERE id = '"+usuario.getId()+"';");
        return sql.toString();
    }
    public static String borrarReserva(Usuario usuario){
        //DELETE FROM `reservas` WHERE `reservas`.`id` = 3"
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM `reservas`");
        sql.append(" WHERE `reservas`.`id_usuario` = "+usuario.getId()+";");
        return sql.toString();
    }
}
