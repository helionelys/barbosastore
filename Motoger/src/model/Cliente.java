package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;
    
    @Column(name = "cli_nome", length = 150)
    private String cliNome;
    
    @Column(name = "cli_cpf", length = 14)
    private String cliCPF;
    
    @Column(name = "cli_rg", length = 20)
    private String cliRG;
    
    @Column(name = "cli_orgaoexp", length = 6)
    private String cliOrgaoExp;
    
    @Column(name = "cli_endereco", length = 100)
    private String cliEndereco;
    
    @Column(name = "cli_numero", length = 10)
    private String cliNumero;
    
    @Column(name = "cli_complemento", length = 50)
    private String cliComplemento;
    
    @Column(name = "cli_bairro", length = 50)
    private String cliBairro;
    
    @Column(name = "cli_cidade", length = 100)
    private String cliCidade;
    
    @Column(name = "cli_uf", length = 2)
    private String cliUF;
    
    @Column(name = "cli_datanasc")
    @Temporal(TemporalType.DATE)
    private Date cliDataNasc;
    
    @Column(name = "cli_datacad")
    @Temporal(TemporalType.DATE)
    private Date cliDataCad;
    
    @Column(name = "cli_telefone", length = 13)
    private String cliTelefone;
    
    @Column(name = "cli_celular", length = 14)
    private String cliCelular;
    
    @Column(name = "cli_email", length = 100)
    private String cliEmail;
    
    @Column(name = "cli_obs", length = 255)
    private String cliObs;
    
    @Column(name = "cli_status")
    private boolean cliStatus;
    
    //OneToMany Venda
    @OneToMany(mappedBy = "cliente")
    private List<Venda>vendas;
    
    //OneToMany Veiculo
    @OneToMany(mappedBy = "cliente")
    private List<Veiculo>veiculos;

    public Cliente() {
    }

    public Cliente(String cliNome, String cliCPF, String cliRG, String 
            cliOrgaoExp, String cliEndereco, String cliNumero, String 
                    cliComplemento, String cliBairro, String cliCidade, String 
                    cliUF, Date cliDataNasc, Date cliDataCad, String
                    cliTelefone, String cliCelular, String cliEmail, String 
                    cliObs, boolean cliStatus, List<Venda> vendas, List<Veiculo> veiculos) {
        this.cliNome = cliNome;
        this.cliCPF = cliCPF;
        this.cliRG = cliRG;
        this.cliOrgaoExp = cliOrgaoExp;
        this.cliEndereco = cliEndereco;
        this.cliNumero = cliNumero;
        this.cliComplemento = cliComplemento;
        this.cliBairro = cliBairro;
        this.cliCidade = cliCidade;
        this.cliUF = cliUF;
        this.cliDataNasc = cliDataNasc;
        this.cliDataCad = cliDataCad;
        this.cliTelefone = cliTelefone;
        this.cliCelular = cliCelular;
        this.cliEmail = cliEmail;
        this.cliObs = cliObs;
        this.cliStatus = cliStatus;
        this.vendas = vendas;
        this.veiculos = veiculos;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliCPF() {
        return cliCPF;
    }

    public void setCliCPF(String cliCPF) {
        this.cliCPF = cliCPF;
    }

    public String getCliRG() {
        return cliRG;
    }

    public void setCliRG(String cliRG) {
        this.cliRG = cliRG;
    }

    public String getCliOrgaoExp() {
        return cliOrgaoExp;
    }

    public void setCliOrgaoExp(String cliOrgaoExp) {
        this.cliOrgaoExp = cliOrgaoExp;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliNumero() {
        return cliNumero;
    }

    public void setCliNumero(String cliNumero) {
        this.cliNumero = cliNumero;
    }

    public String getCliComplemento() {
        return cliComplemento;
    }

    public void setCliComplemento(String cliComplemento) {
        this.cliComplemento = cliComplemento;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliUF() {
        return cliUF;
    }

    public void setCliUF(String cliUF) {
        this.cliUF = cliUF;
    }

    public Date getCliDataNasc() {
        return cliDataNasc;
    }

    public void setCliDataNasc(Date cliDataNasc) {
        this.cliDataNasc = cliDataNasc;
    }

    public Date getCliDataCad() {
        return cliDataCad;
    }

    public void setCliDataCad(Date cliDataCad) {
        this.cliDataCad = cliDataCad;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliObs() {
        return cliObs;
    }

    public void setCliObs(String cliObs) {
        this.cliObs = cliObs;
    }

    public boolean isCliStatus() {
        return cliStatus;
    }

    public void setCliStatus(boolean cliStatus) {
        this.cliStatus = cliStatus;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return cliNome;
    }
          
}
