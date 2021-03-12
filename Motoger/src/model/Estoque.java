package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "estoque")
public class Estoque implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estoque", nullable = false)
    private Integer idEstoque;
    
    @Column(name = "est_dataentsai")
    @Temporal(TemporalType.DATE)
    private Date estDataEntSai;
    
    @Column(name = "est_quantentsai")
    private Integer estQuantEntSai;
    
    @Column(name = "est_motivoentsai", length = 150)
    private String estMotivoEntSai;
    
    //ManyToOne produto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_produto", name = "cod_produto")
    private Produto produto;
    
    //ManyToOne usuario
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_usuario", name = "cod_usuario")
    private Usuario usuario;

    public Estoque() {
    }

    public Estoque(Date estDataEntSai, Integer estQuantEntSai, String 
            estMotivoEntSai, Produto produto, Usuario usuario) {
        this.estDataEntSai = estDataEntSai;
        this.estQuantEntSai = estQuantEntSai;
        this.estMotivoEntSai = estMotivoEntSai;
        this.produto = produto;
        this.usuario = usuario;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Date getEstDataEntSai() {
        return estDataEntSai;
    }

    public void setEstDataEntSai(Date estDataEntSai) {
        this.estDataEntSai = estDataEntSai;
    }

    public Integer getEstQuantEntSai() {
        return estQuantEntSai;
    }

    public void setEstQuantEntSai(Integer estQuantEntSai) {
        this.estQuantEntSai = estQuantEntSai;
    }

    public String getEstMotivoEntSai() {
        return estMotivoEntSai;
    }

    public void setEstMotivoEntSai(String estMotivoEntSai) {
        this.estMotivoEntSai = estMotivoEntSai;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Estoque{" + "idEstoque=" + idEstoque + ", estDataEntSai=" + 
                estDataEntSai + ", estQuantEntSai=" + estQuantEntSai + ", "
                + "estMotivoEntSai=" + estMotivoEntSai + ", produto=" + 
                produto + ", usuario=" + usuario + '}';
    }    
    
    public void adicionarProduto(Produto pro){
        pro.getIdProduto();
        this.setProduto(pro);
    }      
    
}
