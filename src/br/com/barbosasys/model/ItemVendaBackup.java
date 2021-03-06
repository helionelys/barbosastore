package br.com.barbosasys.model;

import java.util.ArrayList;

public class ItemVendaBackup {
    private int codItemVenda;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private Double subtotal;
    private ArrayList<ItemVendaBackup> listaItemVenda;
    
    public ItemVendaBackup(){
        
    }

    public int getCodItemVenda() {
        return codItemVenda;
    }

    public void setCodItemVenda(int codItemVenda) {
        this.codItemVenda = codItemVenda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public ArrayList<ItemVendaBackup> getListaItemVenda() {
        return listaItemVenda;
    }

    public void setListaItemVenda(ArrayList<ItemVendaBackup> listaItemVenda) {
        this.listaItemVenda = listaItemVenda;
    }
    
    @Override
    public String toString(){
    return "ItemVenda {" + "::codItemVenda = " + this.codItemVenda + " ::quantidade = " + this.quantidade +"::subTotal = " + this.subtotal +"}";
    }
    
}
