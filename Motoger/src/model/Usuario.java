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
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    
    @Column(name = "usu_nome", length = 150)
    private String usuNome;
    
    @Column(name = "usu_login", length = 20)
    private String usuLogin;
    
    @Column(name = "usu_senha", length = 20)
    private String usuSenha;
    
    @Column(name = "usu_datacad")
    @Temporal(TemporalType.DATE)
    private Date usuDataCad;
    
    @Column(name = "usu_datanasc")
    @Temporal(TemporalType.DATE)
    private Date usuDataNasc;
    
    @Column(name = "usu_permissao", length = 20)
    private String usuPermissao;
    
    //OneToMany compra
    @OneToMany(mappedBy = "usuario")
    private List<Compra>compras;
    
    //OneToMany venda
    @OneToMany(mappedBy = "usuario")
    private List<Venda>vendas;
    
    //OneToMany entrada
    @OneToMany(mappedBy = "usuario")
    private List<Estoque>estoques;
            
    public Usuario() {
    }

    public Usuario(String usuNome, String usuLogin, String usuSenha, Date 
            usuDataCad, Date usuDataNasc, String usuPermissao, List<Compra> 
                  compras, List<Venda> vendas, List<Estoque> estoques) {
        this.usuNome = usuNome;
        this.usuLogin = usuLogin;
        this.usuSenha = usuSenha;
        this.usuDataCad = usuDataCad;
        this.usuDataNasc = usuDataNasc;
        this.usuPermissao = usuPermissao;
        this.compras = compras;
        this.vendas = vendas;
        this.estoques = estoques;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public Date getUsuDataCad() {
        return usuDataCad;
    }

    public void setUsuDataCad(Date usuDataCad) {
        this.usuDataCad = usuDataCad;
    }

    public Date getUsuDataNasc() {
        return usuDataNasc;
    }

    public void setUsuDataNasc(Date usuDataNasc) {
        this.usuDataNasc = usuDataNasc;
    }

    public String getUsuPermissao() {
        return usuPermissao;
    }

    public void setUsuPermissao(String usuPermissao) {
        this.usuPermissao = usuPermissao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuNome=" + usuNome +
                ", usuLogin=" + usuLogin + ", usuSenha=" + usuSenha +
                ", usuDataCad=" + usuDataCad + ", usuDataNasc=" + usuDataNasc +
                ", usuPermissao=" + usuPermissao + '}';
    }


    
}
