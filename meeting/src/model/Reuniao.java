/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Reuniao{
    private String pauta;
    private String data;
    private String horaInicio;
    private String horaFim;
    private ArrayList<Sala> sala;
    private ArrayList<Participante> participante;

    public Reuniao(String pauta, String data, String horaInicio, String horaFim, ArrayList<Sala> sala, ArrayList<Participante> participante) {
        this.pauta = pauta;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.sala = sala;
        this.participante = participante;
    }
    
    public Reuniao(){
        
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }

    public ArrayList<Participante> getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList<Participante> e) {
        
        this.participante = e;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    public String getDataInicio() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }


    @Override
    public String toString() {
        return "<<<Ata da Reunião>>>" + "\nPauta: " + pauta+ 
                "\nData: " + data + "\nHorario inicial: " + horaInicio + "\nHorario final: " + horaFim 
                +"\n"+"\nSala: " + sala + "\n" + "\nParticipante: " + participante;
    }    

    @Override
    public boolean equals(Object o) {
        Reuniao outro = (Reuniao) o;
        return pauta.equals(outro);
    }
}
