package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compra")
public class Compra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra", nullable = false)
    private Integer idCompra;
    
    @Column(name = "com_datacompra")
    @Temporal(TemporalType.DATE)
    private Date comDataCompra;
    
    //@Column(name = "com_horacompra")
    //@Temporal(TemporalType.TIME)
    //private Time comHoraCompra;
    
    @Column(name = "com_descricao", length = 150)
    private String comDescricao;
    
    @Column(name = "com_valor")
    private double comValor;
    
    @Column(name = "com_quantparcelas")
    private Integer comQuantParcelas;

    //ManyToOne fornecedor
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_fornecedor", name = "cod_fornecedor")
    private Fornecedor fornecedor;
    
    //ManyToOne usuario
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_usuario", name = "cod_usuario")
    private Usuario usuario;
    
    //OneToMany item_da_compra
    @OneToMany(mappedBy = "compra")
    private List<ItemDaCompra>itensDaCompra;
    
    //OneToMany conta_pagar
    @OneToMany(mappedBy = "compra")
    private List<ContaPagar>contasPagar;

    public Compra() {
    }

    public Compra(Date comDataCompra, /*Time comHoraCompra,*/ String 
            comDescricao, double comValor, Integer comQuantParcelas, Fornecedor
                  fornecedor, Usuario usuario, List<ItemDaCompra> itensDaCompra,
                  List<ContaPagar> contasPagar) {
        this.comDataCompra = comDataCompra;
        //this.comHoraCompra = comHoraCompra;
        this.comDescricao = comDescricao;
        this.comValor = comValor;
        this.comQuantParcelas = comQuantParcelas;
        this.fornecedor = fornecedor;
        this.usuario = usuario;
        this.itensDaCompra = itensDaCompra;
        this.contasPagar = contasPagar;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Date getComDataCompra() {
        return comDataCompra;
    }

    public void setComDataCompra(Date comDataCompra) {
        this.comDataCompra = comDataCompra;
    }
/*
    public Time getComHoraCompra() {
        return comHoraCompra;
    }

    public void setComHoraCompra(Time comHoraCompra) {
        this.comHoraCompra = comHoraCompra;
    }
*/
    public String getComDescricao() {
        return comDescricao;
    }

    public void setComDescricao(String comDescricao) {
        this.comDescricao = comDescricao;
    }

    public double getComValor() {
        return comValor;
    }

    public void setComValor(double comValor) {
        this.comValor = comValor;
    }

    public Integer getComQuantParcelas() {
        return comQuantParcelas;
    }

    public void setComQuantParcelas(Integer comQuantParcelas) {
        this.comQuantParcelas = comQuantParcelas;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ItemDaCompra> getItensDaCompra() {
        return itensDaCompra;
    }

    public void setItensDaCompra(List<ItemDaCompra> itensDaCompra) {
        this.itensDaCompra = itensDaCompra;
    }

    public List<ContaPagar> getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(List<ContaPagar> contasPagar) {
        this.contasPagar = contasPagar;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", comDataCompra=" 
                + comDataCompra + ", comHoraCompra=" /*+ comHoraCompra */
                + ", comDescricao=" + comDescricao + ", comValor=" + comValor 
                + ", comQuantParcelas=" + comQuantParcelas + '}';
    }
    
}
