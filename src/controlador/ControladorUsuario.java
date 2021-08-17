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
public class ControladorUsuario {
    private Usuario usuario;

    public ControladorUsuario() {
        usuario = new Usuario();
    }
    
    public boolean insertar(String nombre_usuario,String nombre,String apellido,String correo,String clave){
              
        getUsuario().setUsuario(nombre_usuario);
        getUsuario().setNombre(nombre);
        getUsuario().setApellido(apellido);
        getUsuario().setCorreo(correo);
        getUsuario().setClave(clave);
        
        return GestorBaseDatos.insertar(getUsuario());
    }
    
    public boolean actualizar(Usuario nueva_data){
        
        boolean respuesta = GestorBaseDatos.actualizar(nueva_data);
        
        if(respuesta)
        {
            usuario = nueva_data;
        }
        return respuesta;
    }
    
    public boolean mostrarUsuario(){
        usuario = GestorBaseDatos.traerUsuario(usuario);
        return usuario!=null;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
