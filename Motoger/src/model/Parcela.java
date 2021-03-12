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
@Table(name = "parcela")
public class Parcela implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_parcela", nullable = false)
    private Integer idParcela;
    
    @Column(name = "par_parcela")
    private Integer parParcela;
    
    @Column(name = "par_datavenc")
    @Temporal(TemporalType.DATE)
    private Date parDataVenc;
    
    @Column(name = "par_datapagto")
    @Temporal(TemporalType.DATE)
    private Date parDataPagto;
    
    @Column(name = "par_valorinicial")
    private double parValorInicial;
    
    @Column(name = "par_status", length = 20)
    private String parStatus;
    
    //manyToOne - venda
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_venda", name = "cod_venda")
    private Venda venda;
    
    public Parcela(){}

    public Parcela(Integer parParcela, Date parDataVenc, Date parDataPagto, 
            double parValorInicial, String parStatus, String parOrigem, Venda venda) {
        this.parParcela = parParcela;
        this.parDataVenc = parDataVenc;
        this.parDataPagto = parDataPagto;
        this.parValorInicial = parValorInicial;
        this.parStatus = parStatus;
        this.venda = venda;
    }

    public Parcela(Integer parParcela, Date parDataVenc, double parValorInicial,
            String parStatus, String parOrigem, Venda venda) {
        this.parParcela = parParcela;
        this.parDataVenc = parDataVenc;
        this.parValorInicial = parValorInicial;
        this.parStatus = parStatus;
        this.venda = venda;
    }

    public Parcela(Integer parParcela, Date parDataVenc, double parValorInicial,
            String parStatus, String parOrigem) {
        this.parParcela = parParcela;
        this.parDataVenc = parDataVenc;
        this.parValorInicial = parValorInicial;
        this.parStatus = parStatus;
    }

    public Integer getIdParcela() {
        return idParcela;
    }
    public void setIdParcela(Integer idParcela) {
        this.idParcela = idParcela;
    }

    public Integer getParParcela() {
        return parParcela;
    }
    public void setParParcela(Integer parParcela) {
        this.parParcela = parParcela;
    }

    public Date getParDataVenc() {
        return parDataVenc;
    }
    public void setParDataVenc(Date parDataVenc) {
        this.parDataVenc = parDataVenc;
    }

    public Date getParDataPagto() {
        return parDataPagto;
    }
    public void setParDataPagto(Date parDataPagto) {
        this.parDataPagto = parDataPagto;
    }

    public double getParValorInicial() {
        return parValorInicial;
    }
    public void setParValorInicial(double parValorInicial) {
        this.parValorInicial = parValorInicial;
    }

    public String getParStatus() {
        return parStatus;
    }
    public void setParStatus(String parStatus) {
        this.parStatus = parStatus;
    }
    
    public Venda getVenda() {
        return venda;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Parcela{" + "idParcela=" + idParcela + ", parParcela=" + 
           parParcela + ", parDataVenc=" + parDataVenc + ", parDataPagto=" +
           parDataPagto + ", parValorInicial=" + parValorInicial +
           ", parStatus=" + parStatus + ", venda=" + venda + '}';
    }     
    
    public void adicionarVenda(Venda ven){
        ven.getIdVenda();
        this.setVenda(ven);
    }
    
}
