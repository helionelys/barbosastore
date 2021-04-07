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
public class DadosEmpresa extends Pessoa {

    private String imagemEndereco;

    public DadosEmpresa() {
    }

    public String getImagemEndereco() {
        return imagemEndereco;
    }

    public void setImagemEndereco(String imagemEndereco) {
        this.imagemEndereco = imagemEndereco;
    }

}
