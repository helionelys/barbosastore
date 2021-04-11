
package br.com.barbosasys.model;

/**
 *
 * @author helionelys
 */
public class TipoPagamento {
    private int codTipoPagamento;
    private String descricao;
    
    public TipoPagamento(){}

    public int getCodTipoPagamento() {
        return codTipoPagamento;
    }

    public void setCodTipoPagamento(int codTipoPagamento) {
        this.codTipoPagamento = codTipoPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return "ModelTipoPagamento {" + "::codigo = " + this.codTipoPagamento + "::descricao = " + this.descricao +  "}";
    }
}
