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
public class Caixa {
    private int codCaixa;
    private float dinheiro;
    private float cheque;
    private float cartao;
    private float vale;

    public Caixa() {
    }

    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getCheque() {
        return cheque;
    }

    public void setCheque(float cheque) {
        this.cheque = cheque;
    }

    public float getCartao() {
        return cartao;
    }

    public void setCartao(float cartao) {
        this.cartao = cartao;
    }

    public float getVale() {
        return vale;
    }

    public void setVale(float vale) {
        this.vale = vale;
    }
    
    @Override
    public String toString(){
        return "Caixa {" + "::codCaixa = " + this.codCaixa + "::dinheiro = " + this.dinheiro + "::cheque = " + this.cheque + "::cartao = " + this.cartao + "::vale = " + this.vale +  "}";
    }
}
