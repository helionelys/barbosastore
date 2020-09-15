package br.com.barbosasys.model;

public class Servico {

    private int codServico;
    private int statusServico;
    private String dataCadastramento;
    private String descricao;
    private int codCategoria;
    private String descricaoCategoria;
    private String observacao;

    public Servico() {
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public int getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(int statusServico) {
        this.statusServico = statusServico;
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

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
