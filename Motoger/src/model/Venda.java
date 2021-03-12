package model;

import java.io.Serializable;
import java.util.Collection;
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
@Table(name = "venda")
public class Venda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda", nullable = false)
    private Integer idVenda;
    
    @Column(name = "ven_datavenda")
    @Temporal(TemporalType.DATE)
    private Date venDataVenda;
    
    @Column(name = "ven_desconto")
    private double venDesconto;
    
    @Column(name = "ven_status", length = 20)
    private String venStatus;
    
    @Column(name = "ven_valortotal")
    private double venValorTotal;
    
    @Column(name = "ven_taxajuros")
    private double venTaxaJuros;
    
    @Column(name = "ven_orcamento")
    private boolean venOrcamento;
    
    //ManyToOne usuario
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_usuario", name = "cod_usuario")
    private Usuario usuario;
    
    //ManyToOne cliente
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_cliente", name = "cod_cliente")
    private Cliente cliente;
    
    //ManyToOne veiculo
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_veiculo", name = "cod_veiculo")
    private Veiculo veiculo;
    
    //OneToMany item_da_venda
    @OneToMany(mappedBy = "venda")
    private List<ItemDaVenda>itensDaVenda;
    
    //OneToMany movimento
    @OneToMany(mappedBy = "venda")
    private List<Movimento>movimentos;

    public Venda() {
    }

    public Venda(Integer idVenda, Date venDataVenda, double venDesconto, 
            String venStatus, double venValorTotal, double venTaxaJuros, 
            boolean venOrcamento, Usuario usuario, Cliente cliente, Veiculo 
                    veiculo) {
        this.idVenda = idVenda;
        this.venDataVenda = venDataVenda;
        this.venDesconto = venDesconto;
        this.venStatus = venStatus;
        this.venValorTotal = venValorTotal;
        this.venTaxaJuros = venTaxaJuros;
        this.venOrcamento = venOrcamento;
        this.usuario = usuario;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }    

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Date getVenDataVenda() {
        return venDataVenda;
    }

    public void setVenDataVenda(Date venDataVenda) {
        this.venDataVenda = venDataVenda;
    }

    public double getVenDesconto() {
        return venDesconto;
    }

    public void setVenDesconto(double venDesconto) {
        this.venDesconto = venDesconto;
    }

    public String getVenStatus() {
        return venStatus;
    }

    public void setVenStatus(String venStatus) {
        this.venStatus = venStatus;
    }

    public double getVenValorTotal() {
        return venValorTotal;
    }

    public void setVenValorTotal(double venValorTotal) {
        this.venValorTotal = venValorTotal;
    }
    
    public double getVenTaxaJuros(){
        return venTaxaJuros;
    }
    
    public void setVenTaxaJuros(double venTaxaJuros){
        this.venTaxaJuros = venTaxaJuros;
    }

    public boolean isVenOrcamento() {
        return venOrcamento;
    }

    public void setVenOrcamento(boolean venOrcamento) {
        this.venOrcamento = venOrcamento;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public Collection<ItemDaVenda> getItensDaVenda() {
        return itensDaVenda;
    }

    public void setItensDaVenda(Collection<ItemDaVenda> itensDaVenda) {
        this.itensDaVenda = (List<ItemDaVenda>) itensDaVenda;
    }

    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    @Override
    public String toString() {
      return "Venda{" + "idVenda=" + idVenda + ", venDataVenda=" + venDataVenda 
              + ", venDesconto=" + venDesconto + ", venStatus=" + venStatus 
              + ", venValorTotal=" + venValorTotal + ", venTaxaJuros=" 
              + venTaxaJuros + ", venOrcamento=" + venOrcamento + ", usuario=" 
              + usuario + ", cliente=" + cliente + ", veiculo=" + veiculo 
              + ", itensDaVenda=" + itensDaVenda + ", movimentos=" + movimentos 
              + '}';
    }

    
    
    /**
     * Método que adiciona Itens da Venda
     * @param itv 
     */
    public void adicionarItem(ItemDaVenda itv){
        itv.setVenda(this);
        this.getItensDaVenda().add(itv);
    }
    
    
}
