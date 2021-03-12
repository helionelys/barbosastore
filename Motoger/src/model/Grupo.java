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
@Table(name = "grupo")
public class Grupo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo", nullable = false)
    private Integer idGrupo;
    
    @Column(name = "gru_descricao", length = 100)
    private String gruDescricao;
    
    //OneToMany produto
    @OneToMany(mappedBy = "grupo")
    private List<Produto>produtos;

    public Grupo() {
    }

    public Grupo(String gruDescricao, List<Produto> produtos) {
        this.gruDescricao = gruDescricao;
        this.produtos = produtos;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGruDescricao() {
        return gruDescricao;
    }

    public void setGruDescricao(String gruDescricao) {
        this.gruDescricao = gruDescricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return this.getGruDescricao();
    }
    
    
}
