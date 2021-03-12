package model;

import java.io.Serializable;
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

@Entity
@Table(name = "produto")
public class Produto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto", nullable = false)
    private Integer idProduto;
    
    @Column(name = "pro_codigo", length = 50)
    private String proCodigo;
    
    @Column(name = "pro_descricao", length = 100)
    private String proDescricao;
    
    @Column(name = "pro_precovenda")
    private double proPrecoVenda;
    
    @Column(name = "pro_estoqueinicial")
    private Integer proEstoqueInicial;
    
    @Column(name = "pro_estoqueatual")
    private Integer proEstoqueAtual;
    
    @Column(name = "pro_estoqueminimo")
    private Integer proEstoqueMinimo;
    
    @Column(name = "pro_foto")
    private String proFoto;
    
    //ManyToOne categoria
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_categoria", name = "cod_categoria")
    private Categoria categoria;
    
    //ManyToOne marca_produto
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_marcaproduto", name = "cod_marcaproduto")
    private MarcaProduto marcaProduto;
    
    //ManyToOne grupo
    @ManyToOne
    @JoinColumn(referencedColumnName = "id_grupo", name = "cod_grupo")
    private Grupo grupo;
    
    //OneToMany item da compra
    @OneToMany(mappedBy = "produto")
    private List<ItemDaCompra>itensDaCompra;
            
    //OneToMany estoque
    @OneToMany(mappedBy = "produto")
    private List<Estoque>estoques;
    
    //OneToMany item da venda
    @OneToMany(mappedBy = "produto")
    private List<ItemDaVenda>itensDaVenda;
    
    /**
     * Construtor Padrão
     */
    public Produto() {
    }
    
    public Produto(Integer idProduto){
        this.idProduto = idProduto;
    }

    public Produto(Integer idProduto, Integer proEstoqueAtual) {
        this.idProduto = idProduto;
        this.proEstoqueAtual = proEstoqueAtual;
    }    

    public Produto(Integer idProduto, String proCodigo, String proDescricao, double proPrecoVenda, Integer proEstoqueInicial, Integer proEstoqueAtual, Integer proEstoqueMinimo, String proFoto, Categoria categoria, MarcaProduto marcaProduto, Grupo grupo) {
        this.idProduto = idProduto;
        this.proCodigo = proCodigo;
        this.proDescricao = proDescricao;
        this.proPrecoVenda = proPrecoVenda;
        this.proEstoqueInicial = proEstoqueInicial;
        this.proEstoqueAtual = proEstoqueAtual;
        this.proEstoqueMinimo = proEstoqueMinimo;
        this.proFoto = proFoto;
        this.categoria = categoria;
        this.marcaProduto = marcaProduto;
        this.grupo = grupo;
    }  
    

    public Produto(String proCodigo, String proDescricao, double proPrecoVenda, 
            Integer proEstoqueInicial, Integer proEstoqueAtual, Integer 
            proEstoqueMinimo, String proFoto, Categoria categoria, MarcaProduto marcaProduto, 
            Grupo grupo, List<ItemDaCompra> itensDaCompra, List<Estoque> 
            estoques, List<ItemDaVenda> itensDaVenda) {
        this.proCodigo = proCodigo;
        this.proDescricao = proDescricao;
        this.proPrecoVenda = proPrecoVenda;
        this.proEstoqueInicial = proEstoqueInicial;
        this.proEstoqueAtual = proEstoqueAtual;
        this.proEstoqueMinimo = proEstoqueMinimo;
        this.proFoto = proFoto;
        this.categoria = categoria;
        this.marcaProduto = marcaProduto;
        this.grupo = grupo;
        this.itensDaCompra = itensDaCompra;
        this.estoques = estoques;
        this.itensDaVenda = itensDaVenda;
    }
    
    

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public double getProPrecoVenda() {
        return proPrecoVenda;
    }

    public void setProPrecoVenda(double proPrecoVenda) {
        this.proPrecoVenda = proPrecoVenda;
    }

    public Integer getProEstoqueInicial() {
        return proEstoqueInicial;
    }

    public void setProEstoqueInicial(Integer proEstoqueInicial) {
        this.proEstoqueInicial = proEstoqueInicial;
    }

    public Integer getProEstoqueAtual() {
        return proEstoqueAtual;
    }

    public void setProEstoqueAtual(Integer proEstoqueAtual) {
        this.proEstoqueAtual = proEstoqueAtual;
    }

    public Integer getProEstoqueMinimo() {
        return proEstoqueMinimo;
    }

    public void setProEstoqueMinimo(Integer proEstoqueMinimo) {
        this.proEstoqueMinimo = proEstoqueMinimo;
    }
    
    public String getProFoto() {
        return proFoto;
    }
    
    public void setProFoto(String proFoto) {
        this.proFoto = proFoto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public MarcaProduto getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(MarcaProduto marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<ItemDaCompra> getItensDaCompra() {
        return itensDaCompra;
    }

    public void setItensDaCompra(List<ItemDaCompra> itensDaCompra) {
        this.itensDaCompra = itensDaCompra;
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    public List<ItemDaVenda> getItensDaVenda() {
        return itensDaVenda;
    }

    public void setItensDaVenda(List<ItemDaVenda> itensDaVenda) {
        this.itensDaVenda = itensDaVenda;
    }

    @Override
    public String toString() {
        return proDescricao;
    }    

    public void adicionaCategoria(Categoria cat){
        cat.getIdCategoria();
        this.setCategoria(cat);
    }
    
    public void adicionarGrupo(Grupo gru){
        gru.getIdGrupo();
        this.setGrupo(gru);
    }
    
    public void adicionarMarcaProduto(MarcaProduto mar){
        mar.getIdMarcaProduto();
        this.setMarcaProduto(mar);
    }
    
}
