package br.com.barbosasys.model;

public class Pessoa {

    private int codigo;
    private int pessoaTipo;
    
    private String dataNascimento;
    private String nomeRazaoSocial;
    private String apelidoNomeFantasia;
    private String cpfCnpj;
    private String rgInscricaoEstadual;

    private String cep;
    private String cidade;
    private String uf;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;

    private String celular;
    private String telefone;
    private String email;

    public Pessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPessoaTipo() {
        return pessoaTipo;
    }

    public void setPessoaTipo(int pessoaTipo) {
        this.pessoaTipo = pessoaTipo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getApelidoNomeFantasia() {
        return apelidoNomeFantasia;
    }

    public void setApelidoNomeFantasia(String apelidoNomeFantasia) {
        this.apelidoNomeFantasia = apelidoNomeFantasia;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgInscricaoEstadual() {
        return rgInscricaoEstadual;
    }

    public void setRgInscricaoEstadual(String rgInscricaoEstadual) {
        this.rgInscricaoEstadual = rgInscricaoEstadual;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", pessoaTipo=" + pessoaTipo + ", dataNascimento=" + dataNascimento + ", nomeRazaoSocial=" + nomeRazaoSocial + ", apelidoNomeFantasia=" + apelidoNomeFantasia + ", cpfCnpj=" + cpfCnpj + ", rgInscricaoEstadual=" + rgInscricaoEstadual + ", cep=" + cep + ", cidade=" + cidade + ", uf=" + uf + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", celular=" + celular + ", telefone=" + telefone + ", email=" + email + '}';
    }

    
}
