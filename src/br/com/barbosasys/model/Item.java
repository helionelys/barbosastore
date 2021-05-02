package br.com.barbosasys.model;

import java.util.ArrayList;

public class Item {
    private int codItem;
    private Venda venda;
    private Produto produto;
    private Compra compra;
    private int quantidade;
    private Double subtotal;
    private ArrayList<Item> listaItemVenda;
    private ArrayList<Item> listaItemCompra;
    
    public Item(){
        
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
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

    public ArrayList<Item> getListaItemVenda() {
        return listaItemVenda;
    }
    
    public ArrayList<Item> getListaItemCompra() {
        return listaItemCompra;
    }

    public void setListaItemVenda(ArrayList<Item> listaItemVenda) {
        this.listaItemVenda = listaItemVenda;
    }
    
    public void setListaItemCompra(ArrayList<Item> listaItemCompra) {
        this.listaItemCompra = listaItemCompra;
    }
    
    @Override
    public String toString(){
    return "ItemVenda {" + "::codItemVenda = " + this.codItem + " ::quantidade = " + this.quantidade +"::subTotal = " + this.subtotal +"}";
    }
    
}
