package br.com.barbosasys.model;

public class ItemVenda {
    private int codItemVenda;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private Double subtotal;
    
    private ItemVenda(){
        
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
    
    
}
