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
public class Fecha {
    private String anualidad;
    private String mes;
    private String dia;
    
    public Fecha()
    {
        
    }
     public Fecha(int anualidad,int mes,int dia)
    {
        this.anualidad = parse(anualidad);
        this.mes = parse(mes);
        this.dia = parse(dia);
    }
     
    public String parse(int valor){
        return valor<10?"0"+valor:""+valor;
    }
    
    public String getFecha(){
        return this.anualidad+"-"+this.getMes()+"-"+this.getDia();
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
}
