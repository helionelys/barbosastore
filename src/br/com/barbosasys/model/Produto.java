package br.com.barbosasys.model;

import java.util.ArrayList;

public class Produto {

    private int codProduto;
    private int statusProduto;
    private String dataCadastramento;
    private String descricao;
    private int codCategoriaProduto;
    private Double valor;
    private Double valorCompra;
    private int estoque;
    private int codFornecedor;
    private String fabricante;
    private int codUnidadeMedida;
    private String descricaoUnidadeMedida;
    private String observacao;
    private int quantidade;
    private ArrayList<Produto> listaItensVendas;
    private String dataEstoqueAtualizacao;
    
    public Produto() {
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(int statusProduto) {
        this.statusProduto = statusProduto;
    }

    public String getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(String dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodCategoriaProduto() {
        return codCategoriaProduto;
    }

    public void setCodCategoriaProduto(int codCategoriaProduto) {
        this.codCategoriaProduto = codCategoriaProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodUnidadeMedida() {
        return codUnidadeMedida;
    }

    public void setCodUnidadeMedida(int codUnidadeMedida) {
        this.codUnidadeMedida = codUnidadeMedida;
    }

    public String getDescricaoUnidadeMedida() {
        return descricaoUnidadeMedida;
    }

    public void setDescricaoUnidadeMedida(String descricaoUnidadeMedida) {
        this.descricaoUnidadeMedida = descricaoUnidadeMedida;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", statusProduto=" + statusProduto + ", dataCadastramento=" + dataCadastramento + ", descricao=" + descricao + ", codCategoriaProduto=" + codCategoriaProduto + ", valor=" + valor +", valorCompra=" + valorCompra + ", fabricante=" + fabricante + ", codUnidadeMedida=" + codUnidadeMedida + ", descricaoUnidadeMedida=" + descricaoUnidadeMedida + ", observacao=" + observacao + ", estoque= "+ estoque +'}';
    }
    
    public void setListaItensVendas(ArrayList<Produto> listaItensVendas){
        this.listaItensVendas = listaItensVendas;
    }

    public String getDataEstoqueAtualizacao() {
        return dataEstoqueAtualizacao;
    }

    public void setDataEstoqueAtualizacao(String dataEstoqueAtualizacao) {
        this.dataEstoqueAtualizacao = dataEstoqueAtualizacao;
    }
    
    
    
    
}
