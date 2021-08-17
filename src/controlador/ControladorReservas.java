/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Fecha;
import modelo.Reserva;
import modelo.Usuario;

/**
 *
 * @author xaca
 */
public class ControladorReservas {
    private ArrayList<Reserva> reservas;
    
    public void traerReservas(int id_hora,Fecha fecha){
        reservas = GestorBaseDatos.traerReservas(id_hora, fecha);
    }

    public boolean borrarReserva(Usuario usuario){
        return GestorBaseDatos.borrarReserva(usuario);
    }
    /**
     * @return the reservas
     */
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
