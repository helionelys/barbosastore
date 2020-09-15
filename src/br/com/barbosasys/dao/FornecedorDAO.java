/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Fornecedor;
import br.com.barbosasys.model.Endereco;
import br.com.barbosasys.model.Contato;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class FornecedorDAO extends ConexaoBanco {

    // Inserir fornecedor dentro banco de dados
    public int salvarFornecedorDAO(Fornecedor fornecedor) {
        try {
            this.conectar();
                return this.insertSQL(
                    "INSERT INTO TBL_FORNECEDOR ("
                    + "TIPOFORNECEDOR,"
                    + "NOMEREPRESENTANTE,"
                    + "NOME_RAZAOSOCIAL,"
                    + "APELIDO_NOMEFANTASIA,"
                    + "CPF_CNPJ,"
                    + "RG_INSCRICAOESTADUAL,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "LOGRADOURO,"
                    + "NUMERO,"
                    + "BAIRRO,"
                    + "COMPLEMENTO,"
                    + "CELULAR,"
                    + "TELEFONE,"
                    + "EMAIL"
                    + ") VALUES ("
                    + "'" + fornecedor.getPessoaTipo() + "',"
                    + "'" + fornecedor.getNomeRepresentante()+ "',"
                    + "'" + fornecedor.getNomeRazaoSocial() + "',"
                    + "'" + fornecedor.getApelidoNomeFantasia() + "',"
                    + "'" + fornecedor.getCpfCnpj() + "',"
                    + "'" + fornecedor.getRgInscricaoEstadual() + "',"
                    + "'" + fornecedor.getCep() + "',"
                    + "'" + fornecedor.getCidade() + "',"
                    + "'" + fornecedor.getUf() + "',"
                    + "'" + fornecedor.getLogradouro() + "',"
                    + "'" + fornecedor.getNumero() + "',"
                    + "'" + fornecedor.getBairro() + "',"
                    + "'" + fornecedor.getComplemento() + "',"
                    + "'" + fornecedor.getCelular() + "',"
                    + "'" + fornecedor.getTelefone() + "',"
                    + "'" + fornecedor.getEmail() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera fornecedor através do codigo
    public Fornecedor getFornecedorDAO(int codigo) {
        Fornecedor fornecedor = new Fornecedor();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODFORNECEDOR,"
                    + "TIPOFORNECEDOR,"
                    + "NOMEREPRESENTANTE,"        
                    + "NOME_RAZAOSOCIAL,"
                    + "APELIDO_NOMEFANTASIA,"
                    + "CPF_CNPJ,"
                    + "RG_INSCRICAOESTADUAL,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "LOGRADOURO,"
                    + "NUMERO,"
                    + "BAIRRO,"
                    + "COMPLEMENTO,"
                    + "CELULAR,"
                    + "TELEFONE,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_FORNECEDOR"
                    + " WHERE"
                    + " CODFORNECEDOR = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                fornecedor.setCodigo(this.getResultSet().getInt(1));
                fornecedor.setPessoaTipo(this.getResultSet().getInt(2));
                fornecedor.setNomeRepresentante(this.getResultSet().getString(3));
                fornecedor.setNomeRazaoSocial(this.getResultSet().getString(4));
                fornecedor.setApelidoNomeFantasia(this.getResultSet().getString(5));
                fornecedor.setCpfCnpj(this.getResultSet().getString(6));
                fornecedor.setRgInscricaoEstadual(this.getResultSet().getString(7));
                fornecedor.setCep(this.getResultSet().getString(8));
                fornecedor.setCidade(this.getResultSet().getString(9));
                fornecedor.setUf(this.getResultSet().getString(10));
                fornecedor.setLogradouro(this.getResultSet().getString(11));
                fornecedor.setNumero(this.getResultSet().getString(12));
                fornecedor.setBairro(this.getResultSet().getString(13));
                fornecedor.setComplemento(this.getResultSet().getString(14));
                
                fornecedor.setCelular(this.getResultSet().getString(15));
                fornecedor.setTelefone(this.getResultSet().getString(16));
                fornecedor.setEmail(this.getResultSet().getString(17));
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return fornecedor;
    }

    public Fornecedor getFornecedorDAO(String nome) {
        Fornecedor fornecedor = new Fornecedor();
        Endereco endereco = new Endereco();
        Contato contato = new Contato();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODFORNECEDOR,"
                    + "TIPOFORNECEDOR,"
                    + "NOMEREPRESENTANTE,"
                    + "NOME_RAZAOSOCIAL,"
                    + "APELIDO_NOMEFANTASIA,"
                    + "CPF_CNPJ,"
                    + "RG_INSCRICAOESTADUAL,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "LOGRADOURO,"
                    + "NUMERO,"
                    + "BAIRRO,"
                    + "COMPLEMENTO,"
                    + "CELULAR,"
                    + "TELEFONE,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_FORNECEDOR"
                    + " WHERE"
                    + " NOME_RAZAOSOCIAL = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                fornecedor.setCodigo(this.getResultSet().getInt(1));
                fornecedor.setPessoaTipo(this.getResultSet().getInt(2));
                fornecedor.setNomeRepresentante(this.getResultSet().getString(3));
                fornecedor.setNomeRazaoSocial(this.getResultSet().getString(4));
                fornecedor.setApelidoNomeFantasia(this.getResultSet().getString(5));
                fornecedor.setCpfCnpj(this.getResultSet().getString(6));
                
                fornecedor.setCep(this.getResultSet().getString(7));
                fornecedor.setCidade(this.getResultSet().getString(8));
                fornecedor.setUf(this.getResultSet().getString(9));
                fornecedor.setLogradouro(this.getResultSet().getString(10));
                fornecedor.setNumero(this.getResultSet().getString(11));
                fornecedor.setBairro(this.getResultSet().getString(12));
                fornecedor.setComplemento(this.getResultSet().getString(13));
                
                fornecedor.setCelular(this.getResultSet().getString(14));
                fornecedor.setTelefone(this.getResultSet().getString(15));
                fornecedor.setEmail(this.getResultSet().getString(16));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return fornecedor;
    }

//    public ArrayList<Fornecedor> getListaTodosFornecedorDAO() {
//        ArrayList<Fornecedor> listaFornecedor = new ArrayList();
//        Fornecedor fornecedor = new Fornecedor();
//
//        try {
//
//            this.conectar();
//            this.executarSQL(
//                    "SELECT "
//                    + "CODFORNECEDOR,"
//                    + "TIPOFORNECEDOR,"
//                    + "DATANASCIMENTO,"
//                    + "NOME_RAZAOSOCIAL,"
//                    + "APELIDO_NOMEFANTASIA,"
//                    + "CPF_CNPJ,"
//                    + "RG_INSCRICAOESTADUAL,"
//                    + "CEP,"
//                    + "CIDADE,"
//                    + "UF,"
//                    + "LOGRADOURO,"
//                    + "NUMERO,"
//                    + "BAIRRO,"
//                    + "COMPLEMENTO,"
//                    + "CELULAR,"
//                    + "TELEFONE,"
//                    + "EMAIL,"
//                    + "DATACADASTRAMENTO"
//                    + " FROM"
//                    + " TBL_FORNECEDOR"
//                    + ";"
//            );
//
//            while (this.getResultSet().next()) {
//                Endereco end = new Endereco();
//                Contato cont = new Contato();
//                                
//                fornecedor.setCodigo(this.getResultSet().getInt(1));
//                fornecedor.setPessoaTipo(this.getResultSet().getInt(2));
//                fornecedor.setDataNascimento(this.getResultSet().getString(3));
//                fornecedor.setNomeRazaoSocial(this.getResultSet().getString(4));
//                fornecedor.setApelidoNomeFantasia(this.getResultSet().getString(5));
//                fornecedor.setCpfCnpj(this.getResultSet().getString(6));
//                
//                fornecedor.setCep(this.getResultSet().getString(7));
//                fornecedor.setCidade(this.getResultSet().getString(8));
//                fornecedor.setUf(this.getResultSet().getString(9));
//                fornecedor.setLogradouro(this.getResultSet().getString(10));
//                fornecedor.setNumero(this.getResultSet().getString(11));
//                fornecedor.setBairro(this.getResultSet().getString(12));
//                fornecedor.setComplemento(this.getResultSet().getString(13));
//                
//                fornecedor.setCelular(this.getResultSet().getString(14));
//                fornecedor.setTelefone(this.getResultSet().getString(15));
//                fornecedor.setEmail(this.getResultSet().getString(16));
//                
//                fornecedor.setDataCadastramento(this.getResultSet().getString(17));
//
//                listaFornecedor.add(fornecedor);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            this.fecharConexao();
//        }
//        return listaFornecedor;
//    }
    
    public ArrayList<Fornecedor> getListaFornecedorDAO() {
        ArrayList<Fornecedor> listaFornecedor = new ArrayList();
        Fornecedor fornecedor = new Fornecedor();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODFORNECEDOR,"
                    + "NOME_RAZAOSOCIAL,"
                    + "TIPOFORNECEDOR,"
                    + "CPF_CNPJ,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_FORNECEDOR"
                    + ";"
            );

            while (this.getResultSet().next()) {
                fornecedor = new Fornecedor();                                
                fornecedor.setCodigo(this.getResultSet().getInt(1));
                fornecedor.setNomeRazaoSocial(this.getResultSet().getString(2));
                fornecedor.setPessoaTipo(this.getResultSet().getInt(3));
                fornecedor.setCpfCnpj(this.getResultSet().getString(4));
                fornecedor.setEmail(this.getResultSet().getString(5));
  
                listaFornecedor.add(fornecedor);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaFornecedor;
    }

    public boolean atualizarFornecedorDAO(Fornecedor fornecedor) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_FORNECEDOR SET "
                    + "TIPOFORNECEDOR = '" + fornecedor.getPessoaTipo() + "',"
                    + "NOMEREPRESENTANTE = '" + fornecedor.getNomeRepresentante()+ "',"
                    + "NOME_RAZAOSOCIAL = '" + fornecedor.getNomeRazaoSocial() + "',"
                    + "APELIDO_NOMEFANTASIA = '" + fornecedor.getApelidoNomeFantasia() + "',"
                    + "CPF_CNPJ = '" + fornecedor.getCpfCnpj() + "',"
                    + "RG_INSCRICAOESTADUAL = '" + fornecedor.getRgInscricaoEstadual() + "',"
                    + "CEP = '" + fornecedor.getCep()+ "',"
                    + "CIDADE = '" + fornecedor.getCidade() + "',"
                    + "UF = '" + fornecedor.getUf() + "',"
                    + "LOGRADOURO = '" + fornecedor.getLogradouro() + "',"
                    + "NUMERO = '" + fornecedor.getNumero() + "',"
                    + "BAIRRO = '" + fornecedor.getBairro() + "',"
                    + "COMPLEMENTO = '" + fornecedor.getComplemento() + "',"
                    + "CELULAR = '" + fornecedor.getCelular() + "',"
                    + "TELEFONE = '" + fornecedor.getTelefone() + "',"
                    + "EMAIL = '" + fornecedor.getEmail() + "'"
                    + "WHERE "
                        + "CODFORNECEDOR = '" + fornecedor.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirFornecedorDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_FORNECEDOR "
                    + "WHERE CODFORNECEDOR = '" + codigo + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
