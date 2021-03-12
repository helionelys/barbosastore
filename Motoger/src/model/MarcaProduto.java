package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca_produto")
public class MarcaProduto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marcaproduto", nullable = false)
    private Integer idMarcaProduto;
    
    @Column(name = "map_marcaproduto", length = 100)
    private String mapMarcaProduto;
    
    //OneToMany produto
    @OneToMany(mappedBy = "marcaProduto")
    private List<Produto>produtos;

    public MarcaProduto() {
    }

    public MarcaProduto(String mapMarcaProduto, List<Produto> produtos) {
        this.mapMarcaProduto = mapMarcaProduto;
        this.produtos = produtos;
    }

    public Integer getIdMarcaProduto() {
        return idMarcaProduto;
    }

    public void setIdMarcaProduto(Integer idMarcaProduto) {
        this.idMarcaProduto = idMarcaProduto;
    }

    public String getMapMarcaProduto() {
        return mapMarcaProduto;
    }

    public void setMapMarcaProduto(String mapMarcaProduto) {
        this.mapMarcaProduto = mapMarcaProduto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return this.getMapMarcaProduto();
    }
    
}
