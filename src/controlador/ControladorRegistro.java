/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;

/**
 *
 * @author xaca
 */
public class ControladorRegistro {
    private Usuario usuario;

    public ControladorRegistro() {
        usuario = new Usuario();
    }
    
    public boolean insertar(String nombre_usuario,String nombre,String apellido,String correo,String clave){
              
        usuario.setUsuario(nombre_usuario);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setClave(clave);
        
        return GestorBaseDatos.insertar(usuario);
    }
    
}
