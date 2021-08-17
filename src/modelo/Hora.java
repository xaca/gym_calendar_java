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
public class Hora {
    private String hora_mostrar;
    private int id_hora;
    private int hora_militar;

    public Hora(){
        
    }
    
    public Hora(int id_hora,int hora){
        this.id_hora = id_hora;
        this.hora_militar = hora;
        this.hora_mostrar = Fecha.parse(hora)+":00";
    }
    
    /**
     * @return the hora_mostrar
     */
    public String getHora_mostrar() {
        return hora_mostrar;
    }

    /**
     * @param hora_mostrar the hora_mostrar to set
     */
    public void setHora_mostrar(String hora_mostrar) {
        this.hora_mostrar = hora_mostrar;
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
