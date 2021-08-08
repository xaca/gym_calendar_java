/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Hora;

/**
 *
 * @author xaca
 */
public class ControladorHorario{
    
    private Hora horas;
    
    public ControladorHorario(){
        horas = new Hora();
    }
    public void setHora(){
        horas = GestorBaseDatos.getHoras();
    }
    public ArrayList<Integer> getHorario(){
        return horas.getHorario();
    }
    public void add(int hora){
        horas.add(hora);
    }
}
