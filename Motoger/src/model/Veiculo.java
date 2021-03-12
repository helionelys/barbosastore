package model;

import java.io.Serializable;
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
@Table(name = "veiculo")
public class Veiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo", nullable = false)
    private Integer idVeiculo;
    
    @Column(name = "vei_anofabric")
    private Integer veiAnoFabric;
    
    @Column(name = "vei_anomodelo")
    private Integer veiAnoModelo;
    
    @Column(name = "vei_placa", length = 10, nullable = false)
    private String veiPlaca;
    
    @Column(name = "vei_datacad")
    @Temporal(TemporalType.DATE)
    private Date veiDataCad;
    
    @Column(name = "vei_cor", length = 20)
    private String veiCor;
    
    @Column(name = "vei_obs", length = 255)
    private String veiObs;
    
    //ManyToOne ModeloMoto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_modelomoto", name = "cod_modelomoto")
    private ModeloMoto modeloMoto;
    
    //ManyToOne Cliente
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_cliente", name = "cod_cliente")
    private Cliente cliente;

    //OneToMany Venda
    @OneToMany(mappedBy = "veiculo")
    private List<Venda>vendas;
    
    
    public Veiculo() {
    }

    public Veiculo(Integer veiAnoFabric, Integer veiAnoModelo, String veiPlaca,
            Date veiDataCad, String veiCor, String veiObs, ModeloMoto 
                    modeloMoto, Cliente cliente, List<Venda> vendas) {
        this.veiAnoFabric = veiAnoFabric;
        this.veiAnoModelo = veiAnoModelo;
        this.veiPlaca = veiPlaca;
        this.veiDataCad = veiDataCad;
        this.veiCor = veiCor;
        this.veiObs = veiObs;
        this.modeloMoto = modeloMoto;
        this.cliente = cliente;
        this.vendas = vendas;
    }

    
    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Integer getVeiAnoFabric() {
        return veiAnoFabric;
    }

    public void setVeiAnoFabric(Integer veiAnoFabric) {
        this.veiAnoFabric = veiAnoFabric;
    }

    public Integer getVeiAnoModelo() {
        return veiAnoModelo;
    }

    public void setVeiAnoModelo(Integer veiAnoModelo) {
        this.veiAnoModelo = veiAnoModelo;
    }

    public String getVeiPlaca() {
        return veiPlaca;
    }

    public void setVeiPlaca(String veiPlaca) {
        this.veiPlaca = veiPlaca;
    }

    public Date getVeiDataCad() {
        return veiDataCad;
    }

    public void setVeiDataCad(Date veiDataCad) {
        this.veiDataCad = veiDataCad;
    }

    public String getVeiCor() {
        return veiCor;
    }

    public void setVeiCor(String veiCor) {
        this.veiCor = veiCor;
    }

    public String getVeiObs() {
        return veiObs;
    }

    public void setVeiObs(String veiObs) {
        this.veiObs = veiObs;
    }

    public ModeloMoto getModeloMoto() {
        return modeloMoto;
    }

    public void setModeloMoto(ModeloMoto modeloMoto) {
        this.modeloMoto = modeloMoto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    @Override
    public String toString() {
        return "Veiculo{" + "idVeiculo=" + idVeiculo + ", veiAnoFabric=" 
               + veiAnoFabric + ", veiAnoModelo=" + veiAnoModelo + ", veiPlaca=" 
               + veiPlaca + ", veiDataCad=" + veiDataCad + ", veiCor=" + veiCor 
               + ", veiObs=" + veiObs + '}';
    }
    
    public void adicionarModeloMoto(ModeloMoto mod){
        mod.getIdModeloMoto();
        this.setModeloMoto(mod);
    }
    
    public void adicionarCliente(Cliente cli){
        cli.getIdCliente();
        this.setCliente(cli);
    }
       
}
