package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_da_compra")
public class ItemDaCompra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemcompra", nullable = false)
    private Integer idItemCompra;
    
    @Column(name = "itc_precounitario")
    private double itcPrecoUnitario;
    
    @Column(name = "itc_quantidade")
    private Integer itcQuantidade;
    
    @Column(name = "itc_valortotal")
    private double itcValorTotal;
    
    //ManyToOne compra
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_compra", name = "cod_compra")
    private Compra compra;
    
    //ManyToOne produto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_produto", name = "cod_produto")
    private Produto produto;

    public ItemDaCompra() {
    }

    public ItemDaCompra(double itcPrecoUnitario, Integer itcQuantidade, double 
            itcValorTotal, Compra compra, Produto produto) {
        this.itcPrecoUnitario = itcPrecoUnitario;
        this.itcQuantidade = itcQuantidade;
        this.itcValorTotal = itcValorTotal;
        this.compra = compra;
        this.produto = produto;
    }

    public Integer getIdItemCompra() {
        return idItemCompra;
    }

    public void setIdItemCompra(Integer idItemCompra) {
        this.idItemCompra = idItemCompra;
    }

    public double getItcPrecoUnitario() {
        return itcPrecoUnitario;
    }

    public void setItcPrecoUnitario(double itcPrecoUnitario) {
        this.itcPrecoUnitario = itcPrecoUnitario;
    }

    public Integer getItcQuantidade() {
        return itcQuantidade;
    }

    public void setItcQuantidade(Integer itcQuantidade) {
        this.itcQuantidade = itcQuantidade;
    }

    public double getItcValorTotal() {
        return itcValorTotal;
    }

    public void setItcValorTotal(double itcValorTotal) {
        this.itcValorTotal = itcValorTotal;
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

    @Override
    public String toString() {
        return "ItemDaCompra{" + "idItemCompra=" + idItemCompra 
                + ", itcPrecoUnitario=" + itcPrecoUnitario + ", itcQuantidade=" 
                + itcQuantidade + ", itcValorTotal=" + itcValorTotal + '}';
    }
    
    
}
