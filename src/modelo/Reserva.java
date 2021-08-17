/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author xaca
 */
public class Reserva {

    private int id_reserva;
    private int id_hora;
    private Fecha fecha;
    private Usuario usuario;
    /**
     * @return the id_reserva
     */
    public int getId_reserva() {
        return id_reserva;
    }

    /**
     * @param id_reserva the id_reserva to set
     */
    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
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

    /**
     * @return the id_hora
     */
    public int getId_hora() {
        return id_hora;
    }

    /**
     * @param id_hora the id_hora to set
     */
    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }
}
