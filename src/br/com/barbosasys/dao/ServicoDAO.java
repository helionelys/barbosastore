/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Servico;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class ServicoDAO extends ConexaoBanco {

    // Inserir Servico dentro banco de dados
    public int salvarServicoDAO(Servico servico) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_SERVICO ("
                    //+ "CODPRODUTO,"
                    //+ "CODSTATUSPRODUTO,"
                    + "DATACADASTRAMENTO,"
                    + "DESCRICAO,"
                    + "CODCATEGORIA,"
                    + "OBSERVACAO"
                    + ") VALUES ("
                    // + "'" + servico.getCodServico() + "',"
                    // + "'" + servico.getStatusServico() + "',"
                    + "'" + servico.getDataCadastramento() + "',"
                    + "'" + servico.getDescricao() + "',"
                    + "'" + servico.getCodCategoria() + "',"
                    + "'" + servico.getObservacao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera servico através do codigo
    public Servico getServicoDAO(int codigo) {
        Servico servico = new Servico();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODSERVICO," //1
                    //+ "CODSTATUSPRODUTO," 
                    + "DATACADASTRAMENTO," //2
                    + "DESCRICAO," //3
                    + "CODCATEGORIA," //5
                    + "OBSERVACAO" //4
                    + " FROM"
                    + " TBL_SERVICO"
                    + " WHERE"
                    + " CODSERVICO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                servico.setCodServico(this.getResultSet().getInt(1));
                servico.setDataCadastramento(this.getResultSet().getString(2));
                servico.setDescricao(this.getResultSet().getString(3));
                servico.setCodCategoria(this.getResultSet().getInt(4));
                servico.setObservacao(this.getResultSet().getString(5));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return servico;
    }

    public Servico getServicoDAO(String nome) {
        Servico servico = new Servico();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODSERVICO,"
                    //+ "CODSTATUSPRODUTO,"
                    + "DATACADASTRAMENTO,"
                    + "DESCRICAO,"
                    + "CODCATEGORIA,"
                    + "OBSERVACAO"
                    + " FROM"
                    + " TBL_SERVICO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                servico.setCodServico(this.getResultSet().getInt(1));
                servico.setDataCadastramento(this.getResultSet().getString(2));
                servico.setDescricao(this.getResultSet().getString(3));
                servico.setCodCategoria(this.getResultSet().getInt(4));
                servico.setObservacao(this.getResultSet().getString(5));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return servico;
    }

//    public ArrayList<Servico> getListaTodosServicoDAO() {
//        ArrayList<Servico> listaServico = new ArrayList();
//        Servico servico = new Servico();
//
//        try {
//
//            this.conectar();
//            this.executarSQL(
//                    "SELECT "
//                    + "CODPRODUTO,"
//                    + "TIPOPRODUTO,"
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
//                    + " TBL_PRODUTO"
//                    + ";"
//            );
//
//            while (this.getResultSet().next()) {
//                Endereco end = new Endereco();
//                Contato cont = new Contato();
//                                
//                servico.setCodigo(this.getResultSet().getInt(1));
//                servico.setPessoaTipo(this.getResultSet().getInt(2));
//                servico.setDataNascimento(this.getResultSet().getString(3));
//                servico.setNomeRazaoSocial(this.getResultSet().getString(4));
//                servico.setApelidoNomeFantasia(this.getResultSet().getString(5));
//                servico.setCpfCnpj(this.getResultSet().getString(6));
//                
//                servico.setCep(this.getResultSet().getString(7));
//                servico.setCidade(this.getResultSet().getString(8));
//                servico.setUf(this.getResultSet().getString(9));
//                servico.setLogradouro(this.getResultSet().getString(10));
//                servico.setNumero(this.getResultSet().getString(11));
//                servico.setBairro(this.getResultSet().getString(12));
//                servico.setComplemento(this.getResultSet().getString(13));
//                
//                servico.setCelular(this.getResultSet().getString(14));
//                servico.setTelefone(this.getResultSet().getString(15));
//                servico.setEmail(this.getResultSet().getString(16));
//                
//                servico.setDataCadastramento(this.getResultSet().getString(17));
//
//                listaServico.add(servico);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            this.fecharConexao();
//        }
//        return listaServico;
//    }
    public ArrayList<Servico> getListaServicoDAO() {
        ArrayList<Servico> listaServico = new ArrayList();
        Servico servico = new Servico();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_SERVICO.CODSERVICO,"
                    + "TBL_SERVICO.DESCRICAO,"
                    + "TBL_CATEGORIASERVICO.DESCRICAO"
                    + " FROM"
                    + " TBL_SERVICO "
                    + "INNER JOIN TBL_CATEGORIASERVICO "
                    + "ON TBL_SERVICO.CODCATEGORIA = TBL_CATEGORIASERVICO.CODCATEGORIA"
                    + ";"
            );

            while (this.getResultSet().next()) {
                servico = new Servico();
                servico.setCodServico(this.getResultSet().getInt(1));
                servico.setDescricao(this.getResultSet().getString(2));
                servico.setDescricaoCategoria(this.getResultSet().getString(3));

                listaServico.add(servico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaServico;
    }

    public boolean atualizarServicoDAO(Servico servico) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_SERVICO SET "
                    //+ "CODSTATUSPRODUTO = '" + servico.getStatusServico() + "',"
                    + "DESCRICAO = '" + servico.getDescricao() + "',"
                    + "CODCATEGORIA = '" + servico.getCodCategoria()+ "',"
                    + "OBSERVACAO = '" + servico.getObservacao() + "'"
                    + "WHERE "
                    + "CODSERVICO = '" + servico.getCodServico() + "'"
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

    public boolean excluirServicoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_SERVICO "
                    + "WHERE CODSERVICO = '" + codigo + "'"
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
