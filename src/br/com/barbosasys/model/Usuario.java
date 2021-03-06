/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.model;

/**
 *
 * @author helionelys
 */
public class Usuario extends Pessoa{
    private int codUsuario;
    private String login;
    private String senha;
    private int codigoPerfil;
    private String nomePerfil;

    public Usuario() {
    }
    
    public int getCodUsuario(){
        return codUsuario;
    }
    
    public void setCodUsuario(int codUsuario){
        this.codUsuario = codUsuario;
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

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(int codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }
    
    @Override
    public String toString(){
        return "Usuario {" + "::codUsuario = "+ this.codUsuario + "::login = "+ this.login + 
                             "::senha = " + this.senha + "::codigoPerfil = " + this.codigoPerfil + 
                             "::nomePerfil =" + this.nomePerfil +"}";
    }
    
}
