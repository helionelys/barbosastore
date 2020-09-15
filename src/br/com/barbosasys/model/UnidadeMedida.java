
package br.com.barbosasys.model;

public class UnidadeMedida {
    private int codigo;
    private String descricao;
    private String descricaoCompleta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }
    

    @Override
    public String toString() {
        return "UnidadeMedida{" + "codigo=" + codigo + ", descricao=" + descricao + "descricaoCompleta=" + descricaoCompleta + '}';
    }
    
    
    
}
