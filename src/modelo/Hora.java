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


public class Hora {
    
    private ArrayList<Integer> horarios;
    public static final String CAMPO_HORA = "hora";
    public enum Dias{LUNES, MARTES, MIERCOLES, JUEVES,VIERNES, SABADO, DOMINGO;}
    
    public Hora(){
        horarios = new ArrayList<Integer>();
    }
    
    public void add(int hora){
        horarios.add(hora);
    }
    
    public int get(int i){
        return horarios.get(i);
    }
    
    public ArrayList<Integer> getHorario(){
        return horarios;
    }
}
