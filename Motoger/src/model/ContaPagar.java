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
@Table(name = "conta_pagar")
public class ContaPagar implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contapagar", nullable = false)
    private Integer idContaPagar;
    
    @Column(name = "cpa_descricao", length = 150)
    private String cpaDescricao;
    
    @Column(name = "cpa_valor")
    private double cpaValor;
    
    //ManyToOne compra
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_compra", name = "cod_compra")
    private Compra compra;

    public ContaPagar() {
    }

    public ContaPagar(String cpaDescricao, double cpaValor, Compra compra) {
        this.cpaDescricao = cpaDescricao;
        this.cpaValor = cpaValor;
        this.compra = compra;
    }

    public Integer getIdContaPagar() {
        return idContaPagar;
    }

    public void setIdContaPagar(Integer idContaPagar) {
        this.idContaPagar = idContaPagar;
    }

    public String getCpaDescricao() {
        return cpaDescricao;
    }

    public void setCpaDescricao(String cpaDescricao) {
        this.cpaDescricao = cpaDescricao;
    }

    public double getCpaValor() {
        return cpaValor;
    }

    public void setCpaValor(double cpaValor) {
        this.cpaValor = cpaValor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "ContaPagar{" + "idContaPagar=" + idContaPagar 
                + ", cpaDescricao=" + cpaDescricao + ", cpaValor=" + cpaValor 
                + ", compra=" + compra + '}';
    }
    
}
