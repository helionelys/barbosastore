/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.model;

import br.com.barbosasys.model.Fornecedor;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class Compra {
    private int codCompra;
    private int codProduto;
    private int codFornecedor;
    private String nomeRazaoSocial;
    private String dataCompra;
    private int quantidade;
    private Double subTotal;
    private Double valorTotal;
    private Double valorDesconto;
    private int tipoPagamento;
    private ArrayList<Compra> listaCompra;
    private int codStatusCompra;
    private String descricaoStatus;
    private String observacao;

    public Compra() {
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ArrayList<Compra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
    @Override
    public String toString(){
        return "Compras {" + "::codigoCompra = " + this.codCompra + "::codigoProduto = " + this.codProduto + "::codigoFornecedor = " + this.codFornecedor + "::dataCompra = " + this.dataCompra + "::quantidade = " + this.quantidade +  "}";
    }

    public int getCodStatusCompra() {
        return codStatusCompra;
    }

    public void setCodStatusCompra(int codStatusCompra) {
        this.codStatusCompra = codStatusCompra;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }
    
    public String getObservavao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getDescricaStatus() {
        return descricaoStatus;
    }

    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }
}
