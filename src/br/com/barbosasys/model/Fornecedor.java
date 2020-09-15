package br.com.barbosasys.model;

public class Fornecedor extends Pessoa {

    private String nomeRepresentante;

    public Fornecedor() {
        super();
    }
    
    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nomeRepresentante=" + nomeRepresentante + "codigo" + super.getCodigo()+ "nomeRazaoSocial" + super.getNomeRazaoSocial() +'}';
    }
    
    
    
}
