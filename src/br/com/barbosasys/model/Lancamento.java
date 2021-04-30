package br.com.barbosasys.model;

public class Lancamento {

    private int codLancamento;
    private Pessoa pessoa;
    private String descricaoLancamento;
    private String dataLancamento;
    private String dataVencimento;
    private String dataPagamento;
    private Double valorLancamento;
    private int codTipoPagamento;
    private String observacao;
    private int codTipoLancamento;
    private int codStatusLancamento;

    public Lancamento() {
    }

    public int getCodLancamento() {
        return codLancamento;
    }

    public void setCodLancamento(int codLancamento) {
        this.codLancamento = codLancamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDescricaoLancamento() {
        return descricaoLancamento;
    }

    public void setDescricaoLancamento(String descricaoLancamento) {
        this.descricaoLancamento = descricaoLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(Double valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    public int getCodTipoPagamento() {
        return codTipoPagamento;
    }

    public void setCodTipoPagamento(int codTipoPagamento) {
        this.codTipoPagamento = codTipoPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getCodTipoLancamento() {
        return codTipoLancamento;
    }

    public void setCodTipoLancamento(int codTipoLancamento) {
        this.codTipoLancamento = codTipoLancamento;
    }

    public int getCodStatusLancamento() {
        return codStatusLancamento;
    }

    public void setCodStatusLancamento(int codStatusLancamento) {
        this.codStatusLancamento = codStatusLancamento;
    }

   
}
