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
public class Usuario {
    private String idUser;
    private String nome;
    public String login;
    private String senha;

    
    public Usuario(String idUser, String nome, String login, String senha) {
        this.idUser = idUser;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Usuario() {
        
    }
    
    @Override
    public String toString() {
        return "  << Cadastrado >>" + "\n  Identificador: " + idUser + "\n  Nome: " + nome + 
                "\n  Nivel de acesso: " + getAcesso() + "\n  Login: " + login + "\n  Senha: " + senha + "\n======================";
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcesso() {
        return "USUARIO COMUM";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    @Override
    public boolean equals(Object object){
        Usuario outro = (Usuario) object;
        return idUser.equals(outro);
    }
}
