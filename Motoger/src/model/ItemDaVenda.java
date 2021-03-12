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
@Table(name = "item_da_venda")
public class ItemDaVenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemvenda", nullable = false)
    private Integer idItemVenda;
    
    @Column(name = "itv_precounitario")
    private double itvPrecoUnitario;
    
    @Column(name = "itv_quantidade")
    private Integer itvQuantidade;
    
    @Column(name = "itv_valortotal")
    private double itvValorTotal;
    
    @Column(name = "itv_origem")
    private String itvOrigem;
    
    //ManyToOne venda
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_venda", name = "cod_venda")
    private Venda venda;    
    
    //ManyToOne produto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_produto", name = "cod_produto")
    private Produto produto;

    public ItemDaVenda() {
    }

    public ItemDaVenda(double itvPrecoUnitario, Integer itvQuantidade, double 
            itvValorTotal, String itvOrigem, Venda venda, Produto produto) {
        this.itvPrecoUnitario = itvPrecoUnitario;
        this.itvQuantidade = itvQuantidade;
        this.itvValorTotal = itvValorTotal;
        this.itvOrigem = itvOrigem;
        this.venda = venda;
        this.produto = produto;
    }

    public ItemDaVenda(double itvPrecoUnitario, Integer itvQuantidade, double 
            itvValorTotal, String itvOrigem, Venda venda) {
        this.itvPrecoUnitario = itvPrecoUnitario;
        this.itvQuantidade = itvQuantidade;
        this.itvValorTotal = itvValorTotal;
        this.itvOrigem = itvOrigem;
        this.venda = venda;
    }
    
    public ItemDaVenda(double itvPrecoUnitario, Integer itvQuantidade, double 
            itvValorTotal, String itvOrigem, Produto produto) {
        this.itvPrecoUnitario = itvPrecoUnitario;
        this.itvQuantidade = itvQuantidade;
        this.itvValorTotal = itvValorTotal;
        this.itvOrigem = itvOrigem;
        this.produto = produto;
    }
    
    public ItemDaVenda(double itvPrecoUnitario, Integer itvQuantidade, double
            itvValorTotal, String itvOrigem){
        this.itvPrecoUnitario = itvPrecoUnitario;
        this.itvQuantidade = itvQuantidade;
        this.itvValorTotal = itvValorTotal;
        this.itvOrigem = itvOrigem;
    }

    public ItemDaVenda(Produto produto) {
        this.produto = produto;
    }    

    public Integer getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(Integer idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public double getItvPrecoUnitario() {
        return itvPrecoUnitario;
    }

    public void setItvPrecoUnitario(double itvPrecoUnitario) {
        this.itvPrecoUnitario = itvPrecoUnitario;
    }

    public Integer getItvQuantidade() {
        return itvQuantidade;
    }

    public void setItvQuantidade(Integer itvQuantidade) {
        this.itvQuantidade = itvQuantidade;
    }

    public double getItvValorTotal() {
        return itvValorTotal;
    }

    public void setItvValorTotal(double itvValorTotal) {
        this.itvValorTotal = itvValorTotal;
    }
    
    public String getItvOrigem() {
        return itvOrigem;
    }

    public void setItvOrigem(String itvOrigem) {
        this.itvOrigem = itvOrigem;
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

    @Override
    public String toString() {
        return "ItemDaVenda{" + "idItemVenda=" + idItemVenda +
                ", itvPrecoUnitario=" + itvPrecoUnitario + ", itvQuantidade=" +
                itvQuantidade + ", itvValorTotal=" + itvValorTotal +
                ", itvOrigem=" + itvOrigem + ", venda=" + venda +
                ", produto=" + produto + '}';
    }   
      
    public void adicionarVenda(Venda ven){
        ven.getIdVenda();
        this.setVenda(ven);
    }
    
    public void adicionarProduto(Produto pro){
        pro.getIdProduto();
        this.setProduto(pro);
    }
    
}
