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
public class Participante {
    
    private String profissao;
    private String nome;
    private String idade;
    private boolean presenca;
    private String cpf;


    public Participante(String profissao, String nome, String idade, boolean presenca, String cpf) {
  
        this.profissao = profissao;
        this.nome = nome;
        this.idade = idade;
        this.presenca = presenca;
        this.cpf = cpf;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public Participante() {
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        
        return "Participantes:" + "\nCPF: XXX-XXX-XXX-XX" + "\nProfissão: " + profissao + "\nNome: " + nome
                + "\nIdade: " + idade + "\nPresença: " +presenca +"\n";
        
    }

    @Override
    public boolean equals(Object o) {
        Participante outro = (Participante) o;
        return cpf.equals(outro); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
