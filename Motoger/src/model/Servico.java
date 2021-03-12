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
@Table(name = "servico")
public class Servico implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servico", nullable = false)
    private Integer idServico;
    
    @Column(name = "ser_descricao", length = 150)
    private String serDescricao;
    
    @Column(name = "ser_valor")
    private double serValor;
    
    //OneToMany servicos_os
    @OneToMany(mappedBy = "servico")
    private List<ServicoDaVenda>servicosOs;

    public Servico() {
    }

    public Servico(String serDescricao, double serValor, List<ServicoDaVenda> 
            servicosOs) {
        this.serDescricao = serDescricao;
        this.serValor = serValor;
        this.servicosOs = servicosOs;
    }

    public Integer getIdServico() {
        return idServico;
    }

    public void setIdServico(Integer idServico) {
        this.idServico = idServico;
    }

    public String getSerDescricao() {
        return serDescricao;
    }

    public void setSerDescricao(String serDescricao) {
        this.serDescricao = serDescricao;
    }

    public double getSerValor() {
        return serValor;
    }

    public void setSerValor(double serValor) {
        this.serValor = serValor;
    }

    public List<ServicoDaVenda> getServicosOs() {
        return servicosOs;
    }

    public void setServicosOs(List<ServicoDaVenda> servicosOs) {
        this.servicosOs = servicosOs;
    }

    @Override
    public String toString() {
        return serDescricao;
    }
    
    
}
