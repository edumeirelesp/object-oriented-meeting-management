/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Sala {
    private String numSala;
    private boolean situacao;

    public Sala(String numSala, boolean situacao) {
        this.numSala = numSala;
        this.situacao = situacao;
    }

    public Sala() {
    }

    @Override
    public String toString() {
        return "Sala:" + "\nNumero da Sala: " + numSala + "\nsituação: " + situacao;
    }

    public String getIdSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public boolean equals(Object o){
        Sala outro = (Sala) o;
        return numSala.equals(outro);
    }
}
