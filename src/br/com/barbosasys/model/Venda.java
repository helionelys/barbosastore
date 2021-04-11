/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.model;

import br.com.barbosasys.model.Cliente;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class Venda {
    private int codVenda;
    private int codProduto;
    private int codCliente;
    private String nomeRazaoSocial;
    private Date dataVenda;
    private int quantidade;
    private Double valor;
    private Double valorTotal;
    private float valorDesconto;
    private int tipoPagamento;
    private ArrayList<Venda> listaVenda;
    private int codStatusVenda;

    public Venda() {
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ArrayList<Venda> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(ArrayList<Venda> listaVenda) {
        this.listaVenda = listaVenda;
    }
    
    @Override
    public String toString(){
        return "Vendas {" + "::codigoVenda = " + this.codVenda + "::codigoProduto = " + this.codProduto + "::codigoCliente = " + this.codCliente + "::dataVenda = " + this.dataVenda + "::quantidade = " + this.quantidade +  "}";
    }

    public int getCodStatusVenda() {
        return codStatusVenda;
    }

    public void setCodStatusVenda(int codStatusVenda) {
        this.codStatusVenda = codStatusVenda;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }
    
    
}
