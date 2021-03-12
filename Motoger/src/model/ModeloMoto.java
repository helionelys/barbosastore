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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "modelo_moto")
public class ModeloMoto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelomoto", nullable = false)
    private Integer idModeloMoto;
    
    @Column(name = "mod_modelo", length = 100)
    private String modModelo;
    
    //OneToMany veiculo
    @OneToMany(mappedBy = "modeloMoto")
    private Collection<Veiculo>veiculos;
    
    //OneToMany produto_modmoto
    @OneToMany(mappedBy = "modeloMoto")
    private Collection<ProdutoModMoto>produtosModMoto;
    
    //ManyToOne marca_moto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_marcamoto", name = "cod_marcamoto")
    private MarcaMoto marcaMoto;

    public ModeloMoto() {
        veiculos = new ArrayList<Veiculo>();
        produtosModMoto = new ArrayList<ProdutoModMoto>();
    }

    public ModeloMoto(String modModelo, List<Veiculo> veiculos, 
            List<ProdutoModMoto> produtosModMoto, MarcaMoto marcaMoto) {
        this.modModelo = modModelo;
        this.veiculos = veiculos;
        this.produtosModMoto = produtosModMoto;
        this.marcaMoto = marcaMoto;
    }

    public Integer getIdModeloMoto() {
        return idModeloMoto;
    }

    public void setIdModeloMoto(Integer idModeloMoto) {
        this.idModeloMoto = idModeloMoto;
    }

    public String getModModelo() {
        return modModelo;
    }

    public void setModModelo(String modModelo) {
        this.modModelo = modModelo;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Collection<ProdutoModMoto> getProdutosModMoto() {
        return produtosModMoto;
    }

    public void setProdutosModMoto(List<ProdutoModMoto> produtosModMoto) {
        this.produtosModMoto = produtosModMoto;
    }

    public MarcaMoto getMarcaMoto() {
        return marcaMoto;
    }

    public void setMarcaMoto(MarcaMoto marcaMoto) {
        this.marcaMoto = marcaMoto;
    }

    public ModeloMoto(Integer idModeloMoto, String modModelo) {
        this.idModeloMoto = idModeloMoto;
        this.modModelo = modModelo;
    }

    @Override
    public String toString() {
        return this.modModelo;
    }
    
    public void adicionarMarca(MarcaMoto mar){
        mar.getIdMarcaMoto();
        this.setMarcaMoto(mar);
    }
    
}
