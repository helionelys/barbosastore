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
@Table(name = "fornecedor")
public class Fornecedor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor", nullable = false)
    private Integer idFornecedor;
    
    @Column(name = "for_razaosocial", length = 150)
    private String forRazaoSocial;
    
    @Column(name = "for_nomefantasia", length = 100)
    private String forNomeFantasia;
    
    @Column(name = "for_cnpj", length = 19)
    private String forCnpj;
    
    @Column(name = "for_insc_estadual", length = 20)
    private String forInscEstadual;
    
    @Column(name = "for_endereco", length = 100)
    private String forEndereco;
    
    @Column(name = "for_bairro", length = 50)
    private String forBairro;
    
    @Column(name = "for_cidade", length = 100)
    private String forCidade;
    
    @Column(name = "for_uf", length = 50)
    private String forUf;
    
    @Column(name = "for_telefone", length = 20)
    private String forTelefone;
    
    @Column(name = "for_email", length = 100)
    private String forEmail;
    
    @Column(name = "for_contato", length = 100)
    private String forContato;
    
    //OneToMany compra
    @OneToMany(mappedBy = "fornecedor")
    private List<Compra>compras;

    public Fornecedor() {
    }

    public Fornecedor(String forRazaoSocial, String forNomeFantasia, String 
            forCnpj, String forInscEstadual, String forEndereco, String 
                    forBairro, String forCidade, String forUf, String 
                            forTelefone, String forEmail, String forContato, 
                            List<Compra> compras) {
        this.forRazaoSocial = forRazaoSocial;
        this.forNomeFantasia = forNomeFantasia;
        this.forCnpj = forCnpj;
        this.forInscEstadual = forInscEstadual;
        this.forEndereco = forEndereco;
        this.forBairro = forBairro;
        this.forCidade = forCidade;
        this.forUf = forUf;
        this.forTelefone = forTelefone;
        this.forEmail = forEmail;
        this.forContato = forContato;
        this.compras = compras;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getForRazaoSocial() {
        return forRazaoSocial;
    }

    public void setForRazaoSocial(String forRazaoSocial) {
        this.forRazaoSocial = forRazaoSocial;
    }

    public String getForNomeFantasia() {
        return forNomeFantasia;
    }

    public void setForNomeFantasia(String forNomeFantasia) {
        this.forNomeFantasia = forNomeFantasia;
    }

    public String getForCnpj() {
        return forCnpj;
    }

    public void setForCnpj(String forCnpj) {
        this.forCnpj = forCnpj;
    }

    public String getForInscEstadual() {
        return forInscEstadual;
    }

    public void setForInscEstadual(String forInscEstadual) {
        this.forInscEstadual = forInscEstadual;
    }

    public String getForEndereco() {
        return forEndereco;
    }

    public void setForEndereco(String forEndereco) {
        this.forEndereco = forEndereco;
    }

    public String getForBairro() {
        return forBairro;
    }

    public void setForBairro(String forBairro) {
        this.forBairro = forBairro;
    }

    public String getForCidade() {
        return forCidade;
    }

    public void setForCidade(String forCidade) {
        this.forCidade = forCidade;
    }

    public String getForUf() {
        return forUf;
    }

    public void setForUf(String forUf) {
        this.forUf = forUf;
    }

    public String getForTelefone() {
        return forTelefone;
    }

    public void setForTelefone(String forTelefone) {
        this.forTelefone = forTelefone;
    }

    public String getForEmail() {
        return forEmail;
    }

    public void setForEmail(String forEmail) {
        this.forEmail = forEmail;
    }

    public String getForContato() {
        return forContato;
    }

    public void setForContato(String forContato) {
        this.forContato = forContato;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idFornecedor=" + idFornecedor 
               + ", forRazaoSocial=" + forRazaoSocial + ", forNomeFantasia=" 
               + forNomeFantasia + ", forCnpj=" + forCnpj + ", forInscEstadual=" 
               + forInscEstadual + ", forEndereco=" + forEndereco 
               + ", forBairro=" + forBairro + ", forCidade=" + forCidade 
               + ", forUf=" + forUf + ", forTelefone=" + forTelefone 
               + ", forEmail=" + forEmail + ", forContato=" + forContato + '}';
    }
    
    
    
}
