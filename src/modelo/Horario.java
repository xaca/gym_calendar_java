/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author xaca
 */


public class Horario {
    
    private ArrayList<Hora> horarios;
    public static final String CAMPO_HORA = "hora";
    //public enum Dias{LUNES, MARTES, MIERCOLES, JUEVES,VIERNES, SABADO, DOMINGO;}
    
    public Horario(){
        horarios = new ArrayList<Hora>();
    }
    
    public void add(int id_hora,int hora){
        getHorarios().add(new Hora(id_hora, hora));
    }
    
    public int getIdHora(int i){
        return getHorarios().get(i).getId_hora();
    }
    
    public String getHoraMostrar(int i){
        return getHorarios().get(i).getHora_mostrar();
    }

    /**
     * @return the horarios
     */
    public ArrayList<Hora> getHorarios() {
        return horarios;
    }
    
}
