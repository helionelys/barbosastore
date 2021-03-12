package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;
    
    @Column(name = "cat_categoria", length = 100)
    private String catCategoria;
    
    //OneToMany produto
    @OneToMany(mappedBy = "categoria")
    private Collection<Produto>produtos;

    public Categoria() {
        produtos = new ArrayList<Produto>();
    }

    public Categoria(String catCategoria, List<Produto> produtos) {
        this.catCategoria = catCategoria;
        this.produtos = produtos;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCatCategoria() {
        return catCategoria;
    }

    public void setCatCategoria(String catCategoria) {
        this.catCategoria = catCategoria;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return this.getCatCategoria();
    }
    
}
