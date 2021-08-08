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
public class ControladorLogin {
    private Usuario usuario;
    
    public ControladorLogin(){
        usuario = new Usuario();
    }
    
    public Usuario validarUsuario(String nombre_usuario,String clave){
                
        usuario.setUsuario(nombre_usuario);
        usuario.setClave(clave);
        
        return GestorBaseDatos.validarClave(usuario);
    }
    
}
