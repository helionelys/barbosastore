/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.model;

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
    private Date dataCompra;
    private int quantidade;
    private Double valor;
    private Float valorTotal;
    private Float desconto;
    private int tipoPagamento;
    private ArrayList<Compra> listaCompra;

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

    public void setCodFornecedor(int codCliente) {
        this.codFornecedor = codCliente;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
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

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ArrayList<Compra> getListaVendas() {
        return listaCompra;
    }

    public void setListaVendas(ArrayList<Venda> listaVendas) {
        this.listaCompra = listaCompra;
    }
    
    @Override
    public String toString(){
        return "Vendas {" + "::codigoCompra = " + this.codCompra + "::codigoProduto = " + this.codProduto + "::codigoFornecedor = " + this.codFornecedor + "::dataVenda = " + this.dataCompra + "::quantidade = " + this.quantidade +  "}";
    }
}
