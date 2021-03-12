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
@Table(name = "servico_da_venda")
public class ServicoDaVenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicovenda", nullable = false)
    private Integer idServicosVenda;
    
    @Column(name = "sve_valorservico")
    private double sveValorServico;
    
    //ManyToOne venda
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_venda", name = "cod_venda")
    private Venda venda;
    
    //ManyToOne servico
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_servico", name = "cod_servico")
    private Servico servico;

    public ServicoDaVenda() {
    }

    public ServicoDaVenda(Integer idServicosVenda, double sveValorServico, Venda venda, Servico servico) {
        this.idServicosVenda = idServicosVenda;
        this.sveValorServico = sveValorServico;
        this.venda = venda;
        this.servico = servico;
    }

    public ServicoDaVenda(Integer idServicosVenda, double sveValorServico, Servico servico) {
        this.idServicosVenda = idServicosVenda;
        this.sveValorServico = sveValorServico;
        this.servico = servico;
    }
    
    public ServicoDaVenda(double sveValorServico, Servico servico) {
        this.sveValorServico = sveValorServico;
        this.servico = servico;
    }

    public Integer getIdServicosVenda() {
        return idServicosVenda;
    }

    public void setIdServicosVenda(Integer idServicosVenda) {
        this.idServicosVenda = idServicosVenda;
    }

    public double getSveValorServico() {
        return sveValorServico;
    }

    public void setSveValorServico(double sveValorServico) {
        this.sveValorServico = sveValorServico;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "ServicoDaVenda{" + "idServicosVenda=" + idServicosVenda +
                ", sveValorServico=" + sveValorServico + ", venda=" +
                venda + ", servico=" + servico + '}';
    }
    
    public void adicionarVenda(Venda ven){
        ven.getIdVenda();
        this.setVenda(ven);
    }
    
    public void adicionarServico(Servico ser){
        ser.getIdServico();
        this.setServico(ser);
    }   
    
}
