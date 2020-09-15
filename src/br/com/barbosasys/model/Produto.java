package br.com.barbosasys.model;

public class Produto {

    private int codProduto;
    private int statusProduto;
    private String dataCadastramento;
    private String descricao;
    private int codCategoriaProduto;
    private Double valor;
    private int codFornecedor;
    private String fabricante;
    private int codUnidadeMedida;
    private String descricaoUnidadeMedida;
    private String observacao;
    
    public Produto() {
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(int statusProduto) {
        this.statusProduto = statusProduto;
    }

    public String getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(String dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodCategoriaProduto() {
        return codCategoriaProduto;
    }

    public void setCodCategoriaProduto(int codCategoriaProduto) {
        this.codCategoriaProduto = codCategoriaProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodUnidadeMedida() {
        return codUnidadeMedida;
    }

    public void setCodUnidadeMedida(int codUnidadeMedida) {
        this.codUnidadeMedida = codUnidadeMedida;
    }

    public String getDescricaoUnidadeMedida() {
        return descricaoUnidadeMedida;
    }

    public void setDescricaoUnidadeMedida(String descricaoUnidadeMedida) {
        this.descricaoUnidadeMedida = descricaoUnidadeMedida;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", statusProduto=" + statusProduto + ", dataCadastramento=" + dataCadastramento + ", descricao=" + descricao + ", codCategoriaProduto=" + codCategoriaProduto + ", valor=" + valor + ", fabricante=" + fabricante + ", codUnidadeMedida=" + codUnidadeMedida + ", descricaoUnidadeMedida=" + descricaoUnidadeMedida + ", observacao=" + observacao + '}';
    }
    
    
    
    
}
