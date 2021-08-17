/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Hora;
import modelo.Horario;

/**
 *
 * @author xaca
 */
public class ControladorHorario{
    
    private Horario horas;
    
    public ControladorHorario(){
        horas = new Horario();
    }
    public void setHorarios(){
        horas = GestorBaseDatos.getHoras();
    }
    public ArrayList<Hora> getHorario(){
        return horas.getHorarios();
    }
    public int getIdHora(int i){
        return horas.getIdHora(i);
    }
}
