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
@Table(name = "produto_modmoto")
public class ProdutoModMoto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produtomodmoto", nullable = false)
    private Integer idProdutoModMoto;
    
    //ManyToOne produto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_produto", name = "cod_produto")
    private Produto produto;
    
    //ManyToOne modelo_moto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_modelomoto", name = "cod_modelomoto")
    private ModeloMoto modeloMoto;

    public ProdutoModMoto() {
    }

    public ProdutoModMoto(Produto produto, ModeloMoto modeloMoto) {
        this.produto = produto;
        this.modeloMoto = modeloMoto;
    }

    public Integer getIdProdutoModMoto() {
        return idProdutoModMoto;
    }

    public void setIdProdutoModMoto(Integer idProdutoModMoto) {
        this.idProdutoModMoto = idProdutoModMoto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ModeloMoto getModeloMoto() {
        return modeloMoto;
    }

    public void setModeloMoto(ModeloMoto modeloMoto) {
        this.modeloMoto = modeloMoto;
    }

    @Override
    public String toString() {
        return "ProdutoModMoto{" + "idProdutoModMoto=" + idProdutoModMoto + '}';
    }
    
}
