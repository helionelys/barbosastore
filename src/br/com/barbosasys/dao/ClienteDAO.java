/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.Endereco;
import br.com.barbosasys.model.Contato;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class ClienteDAO extends ConexaoBanco {

    // Inserir cliente dentro banco de dados
    public int salvarClienteDAO(Cliente cliente) {
        try {
            this.conectar();
                return this.insertSQL(
                    "INSERT INTO TBL_CLIENTE ("
                    + "TIPOCLIENTE,"
                    + "DATANASCIMENTO,"
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
                    + "EMAIL,"
                    + "DATACADASTRAMENTO"
                    + ") VALUES ("
                    + "'" + cliente.getPessoaTipo() + "',"
                    + "'" + cliente.getDataNascimento() + "',"
                    + "'" + cliente.getNomeRazaoSocial() + "',"
                    + "'" + cliente.getApelidoNomeFantasia() + "',"
                    + "'" + cliente.getCpfCnpj() + "',"
                    + "'" + cliente.getRgInscricaoEstadual() + "',"
                    + "'" + cliente.getCep() + "',"
                    + "'" + cliente.getCidade() + "',"
                    + "'" + cliente.getUf() + "',"
                    + "'" + cliente.getLogradouro() + "',"
                    + "'" + cliente.getNumero() + "',"
                    + "'" + cliente.getBairro() + "',"
                    + "'" + cliente.getComplemento() + "',"
                    + "'" + cliente.getCelular() + "',"
                    + "'" + cliente.getTelefone() + "',"
                    + "'" + cliente.getEmail() + "',"
                    + "'" + cliente.getDataCadastramento() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera cliente através do codigo
    public Cliente getClienteDAO(int codigo) {
        Cliente cliente = new Cliente();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCLIENTE,"
                    + "TIPOCLIENTE,"
                    + "DATANASCIMENTO,"
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
                    + "EMAIL,"
                    + "DATACADASTRAMENTO"
                    + " FROM"
                    + " TBL_CLIENTE"
                    + " WHERE"
                    + " CODCLIENTE = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                                
                cliente.setCodigo(this.getResultSet().getInt(1));
                cliente.setPessoaTipo(this.getResultSet().getInt(2));
                cliente.setDataNascimento(this.getResultSet().getString(3));
                cliente.setNomeRazaoSocial(this.getResultSet().getString(4));
                cliente.setApelidoNomeFantasia(this.getResultSet().getString(5));
                cliente.setCpfCnpj(this.getResultSet().getString(6));
                cliente.setRgInscricaoEstadual(this.getResultSet().getString(7));
                cliente.setCep(this.getResultSet().getString(8));
                cliente.setCidade(this.getResultSet().getString(9));
                cliente.setUf(this.getResultSet().getString(10));
                cliente.setLogradouro(this.getResultSet().getString(11));
                cliente.setNumero(this.getResultSet().getString(12));
                cliente.setBairro(this.getResultSet().getString(13));
                cliente.setComplemento(this.getResultSet().getString(14));
                
                cliente.setCelular(this.getResultSet().getString(15));
                cliente.setTelefone(this.getResultSet().getString(16));
                cliente.setEmail(this.getResultSet().getString(17));
                
                cliente.setDataCadastramento(this.getResultSet().getString(18));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return cliente;
    }

    public Cliente getClienteDAO(String nome) {
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Contato contato = new Contato();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCLIENTE,"
                    + "TIPOCLIENTE,"
                    + "DATANASCIMENTO,"
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
                    + "EMAIL,"
                    + "DATACADASTRAMENTO"
                    + " FROM"
                    + " TBL_CLIENTE"
                    + " WHERE"
                    + " NOME_RAZAOSOCIAL = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                Endereco end = new Endereco();
                Contato cont = new Contato();
                                
                cliente.setCodigo(this.getResultSet().getInt(1));
                cliente.setPessoaTipo(this.getResultSet().getInt(2));
                cliente.setDataNascimento(this.getResultSet().getString(3));
                cliente.setNomeRazaoSocial(this.getResultSet().getString(4));
                cliente.setApelidoNomeFantasia(this.getResultSet().getString(5));
                cliente.setCpfCnpj(this.getResultSet().getString(6));
                
                cliente.setCep(this.getResultSet().getString(7));
                cliente.setCidade(this.getResultSet().getString(8));
                cliente.setUf(this.getResultSet().getString(9));
                cliente.setLogradouro(this.getResultSet().getString(10));
                cliente.setNumero(this.getResultSet().getString(11));
                cliente.setBairro(this.getResultSet().getString(12));
                cliente.setComplemento(this.getResultSet().getString(13));
                
                cliente.setCelular(this.getResultSet().getString(14));
                cliente.setTelefone(this.getResultSet().getString(15));
                cliente.setEmail(this.getResultSet().getString(16));
                
                cliente.setDataCadastramento(this.getResultSet().getString(17));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return cliente;
    }

//    public ArrayList<Cliente> getListaTodosClienteDAO() {
//        ArrayList<Cliente> listaCliente = new ArrayList();
//        Cliente cliente = new Cliente();
//
//        try {
//
//            this.conectar();
//            this.executarSQL(
//                    "SELECT "
//                    + "CODCLIENTE,"
//                    + "TIPOCLIENTE,"
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
//                    + " TBL_CLIENTE"
//                    + ";"
//            );
//
//            while (this.getResultSet().next()) {
//                Endereco end = new Endereco();
//                Contato cont = new Contato();
//                                
//                cliente.setCodigo(this.getResultSet().getInt(1));
//                cliente.setPessoaTipo(this.getResultSet().getInt(2));
//                cliente.setDataNascimento(this.getResultSet().getString(3));
//                cliente.setNomeRazaoSocial(this.getResultSet().getString(4));
//                cliente.setApelidoNomeFantasia(this.getResultSet().getString(5));
//                cliente.setCpfCnpj(this.getResultSet().getString(6));
//                
//                cliente.setCep(this.getResultSet().getString(7));
//                cliente.setCidade(this.getResultSet().getString(8));
//                cliente.setUf(this.getResultSet().getString(9));
//                cliente.setLogradouro(this.getResultSet().getString(10));
//                cliente.setNumero(this.getResultSet().getString(11));
//                cliente.setBairro(this.getResultSet().getString(12));
//                cliente.setComplemento(this.getResultSet().getString(13));
//                
//                cliente.setCelular(this.getResultSet().getString(14));
//                cliente.setTelefone(this.getResultSet().getString(15));
//                cliente.setEmail(this.getResultSet().getString(16));
//                
//                cliente.setDataCadastramento(this.getResultSet().getString(17));
//
//                listaCliente.add(cliente);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            this.fecharConexao();
//        }
//        return listaCliente;
//    }
    
    public ArrayList<Cliente> getListaClienteDAO() {
        ArrayList<Cliente> listaCliente = new ArrayList();
        Cliente cliente = new Cliente();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCLIENTE,"
                    + "NOME_RAZAOSOCIAL,"
                    + "TIPOCLIENTE,"
                    + "CPF_CNPJ,"
                    + "EMAIL"
                    + " FROM"
                    + " TBL_CLIENTE"
                    + ";"
            );

            while (this.getResultSet().next()) {
                cliente = new Cliente();                                
                cliente.setCodigo(this.getResultSet().getInt(1));
                cliente.setNomeRazaoSocial(this.getResultSet().getString(2));
                cliente.setPessoaTipo(this.getResultSet().getInt(3));
                cliente.setCpfCnpj(this.getResultSet().getString(4));
                cliente.setEmail(this.getResultSet().getString(5));
  
                listaCliente.add(cliente);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCliente;
    }

    public boolean atualizarClienteDAO(Cliente cliente) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_CLIENTE SET "
                    + "TIPOCLIENTE = '" + cliente.getPessoaTipo() + "',"
                    + "DATANASCIMENTO = '" + cliente.getDataNascimento() + "',"
                    + "NOME_RAZAOSOCIAL = '" + cliente.getNomeRazaoSocial() + "',"
                    + "APELIDO_NOMEFANTASIA = '" + cliente.getApelidoNomeFantasia() + "',"
                    + "CPF_CNPJ = '" + cliente.getCpfCnpj() + "',"
                    + "RG_INSCRICAOESTADUAL = '" + cliente.getRgInscricaoEstadual() + "',"
                    + "CEP = '" + cliente.getCep()+ "',"
                    + "CIDADE = '" + cliente.getCidade() + "',"
                    + "UF = '" + cliente.getUf() + "',"
                    + "LOGRADOURO = '" + cliente.getLogradouro() + "',"
                    + "NUMERO = '" + cliente.getNumero() + "',"
                    + "BAIRRO = '" + cliente.getBairro() + "',"
                    + "COMPLEMENTO = '" + cliente.getComplemento() + "',"
                    + "CELULAR = '" + cliente.getCelular() + "',"
                    + "TELEFONE = '" + cliente.getTelefone() + "',"
                    + "EMAIL = '" + cliente.getEmail() + "'"
                    + "WHERE "
                        + "CODCLIENTE = '" + cliente.getCodigo() + "'"
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

    public boolean excluirClienteDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_CLIENTE "
                    + "WHERE CODCLIENTE = '" + codigo + "'"
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
