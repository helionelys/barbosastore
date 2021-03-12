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
@Table(name = "movimento")
public class Movimento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimento", nullable = false)
    private Integer idMovimento;
    
    @Column(name = "mov_motivo", length = 20)
    private String movMotivo;
    
    @Column(name = "mov_tipo", length = 10)
    private String movTipo;
    
    @Column(name = "mov_data")
    @Temporal(TemporalType.DATE)
    private Date movData;
    
    @Column(name = "mov_valor")
    private double movValor;
    
    //manyToOne venda
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_venda", name = "cod_venda")
    private Venda venda;
    
    public Movimento(){
        
    }

    public Movimento(String movMotivo, String movTipo, Date movData, double movValor) {
        this.movMotivo = movMotivo;
        this.movTipo = movTipo;
        this.movData = movData;
        this.movValor = movValor;
    }

    public Integer getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(Integer idMovimento) {
        this.idMovimento = idMovimento;
    }

    public String getMovMotivo() {
        return movMotivo;
    }

    public void setMovMotivo(String movMotivo) {
        this.movMotivo = movMotivo;
    }

    public String getMovTipo() {
        return movTipo;
    }

    public void setMovTipo(String movTipo) {
        this.movTipo = movTipo;
    }

    public Date getMovData() {
        return movData;
    }

    public void setMovData(Date movData) {
        this.movData = movData;
    }

    public double getMovValor() {
        return movValor;
    }

    public void setMovValor(double movValor) {
        this.movValor = movValor;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Movimento{" + "idMovimento=" + idMovimento + ", movMotivo=" + 
             movMotivo + ", movTipo=" + movTipo + ", movData=" + movData + 
             ", movValor=" + movValor + ", venda=" + venda + '}';
    }
    
    
    
    public void adicionarVenda(Venda ven){
        ven.getIdVenda();
        this.setVenda(ven);
    } 
 
}
