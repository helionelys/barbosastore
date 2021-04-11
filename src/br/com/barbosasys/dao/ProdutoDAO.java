/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class ProdutoDAO extends ConexaoBanco {

    // Inserir produto dentro banco de dados
    public int salvarProdutoDAO(Produto produto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_PRODUTO ("
                    //+ "CODPRODUTO,"
                    //+ "CODSTATUSPRODUTO,"
                    + "DATACADASTRAMENTO,"
                    + "DESCRICAO,"
                    + "CODCATEGORIA,"
                    + "VALOR,"
                    + "CODFORNECEDOR,"
                    + "FABRICANTE,"
                    + "CODUNIDADEMEDIDA,"
                    + "OBSERVACAO"
                    + ") VALUES ("
                    // + "'" + produto.getCodProduto() + "',"
                    // + "'" + produto.getStatusProduto() + "',"
                    + "'" + produto.getDataCadastramento() + "',"
                    + "'" + produto.getDescricao() + "',"
                    + "'" + produto.getCodCategoriaProduto() + "',"
                    + "'" + produto.getValor() + "',"
                    + "'" + produto.getCodFornecedor() + "',"
                    + "'" + produto.getFabricante() + "',"
                    + "'" + produto.getCodUnidadeMedida() + "',"
                    + "'" + produto.getObservacao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
        // Recupera funcionario através do codigo para uso no cadastro de produtos, retorna apenas código e nome
    public Produto getProdutoSimplesDAO(int codigo) {
        Produto produto = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODPRODUTO," //1
                    + "DESCRICAO," //2
                    + "VALOR" //3
                    + " FROM"
                    + " TBL_PRODUTO"
                    + " WHERE"
                    + " CODPRODUTO = '" + codigo + "'"
                    + ";"
            );
            
             while (this.getResultSet().next()) {

            produto.setCodProduto(this.getResultSet().getInt(1));
            produto.setDescricao(this.getResultSet().getString(2));
            produto.setValor(Double.parseDouble(this.getResultSet().getString(3)));
        }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        } 
        return produto;
        }
    
    
    // Recupera produto através do codigo
    public Produto getProdutoDAO(int codigo) {
        Produto produto = new Produto();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODPRODUTO," //1
                    //+ "CODSTATUSPRODUTO," 
                    + "DATACADASTRAMENTO," //2
                    + "DESCRICAO," //3
                    + "CODUNIDADEMEDIDA," //4
                    + "CODCATEGORIA," //5
                    + "VALOR," //6
                    + "CODFORNECEDOR," //7
                    + "FABRICANTE," //8
                    + "OBSERVACAO" //9
                    + " FROM"
                    + " TBL_PRODUTO"
                    + " WHERE"
                    + " CODPRODUTO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDataCadastramento(this.getResultSet().getString(2));
                produto.setDescricao(this.getResultSet().getString(3));
                produto.setCodUnidadeMedida(this.getResultSet().getInt(4));
                produto.setCodCategoriaProduto(this.getResultSet().getInt(5));
                produto.setValor(Double.parseDouble(this.getResultSet().getString(6)));
                produto.setCodFornecedor(this.getResultSet().getInt(7));
                produto.setFabricante(this.getResultSet().getString(8));
                produto.setObservacao(this.getResultSet().getString(9));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produto;
    }

    // Recupera produto através do codigo
    public Produto getProdutoVendaDAO(int codigo) {
        Produto produto = new Produto();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "DESCRICAO," //1
                    + "VALOR," //2
                    + " FROM"
                    + " TBL_PRODUTO"
                    + " WHERE"
                    + " CODPRODUTO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                produto.setDescricao(this.getResultSet().getString(3));
                produto.setValor(Double.parseDouble(this.getResultSet().getString(6)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produto;
    }
    
    public Produto getProdutoDAO(String nome) {
        Produto produto = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODPRODUTO,"
                    //+ "CODSTATUSPRODUTO,"
                    + "DATACADASTRAMENTO,"
                    + "DESCRICAO,"
                    + "CODUNIDADEMEDIDA,"
                    + "CODCATEGORIA,"
                    + "VALOR,"
                    + "CODFORNECEDOR,"
                    + "FABRICANTE,"
                    + "OBSERVACAO"
                    + " FROM"
                    + " TBL_PRODUTO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDataCadastramento(this.getResultSet().getString(2));
                produto.setDescricao(this.getResultSet().getString(3));
                produto.setCodUnidadeMedida(this.getResultSet().getInt(4));
                produto.setCodCategoriaProduto(this.getResultSet().getInt(5));
                produto.setValor(Double.parseDouble(this.getResultSet().getString(6)));
                produto.setCodFornecedor(this.getResultSet().getInt(7));
                produto.setFabricante(this.getResultSet().getString(8));
                produto.setObservacao(this.getResultSet().getString(9));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produto;
    }

//    public ArrayList<Produto> getListaTodosProdutoDAO() {
//        ArrayList<Produto> listaProduto = new ArrayList();
//        Produto produto = new Produto();
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
//                produto.setCodigo(this.getResultSet().getInt(1));
//                produto.setPessoaTipo(this.getResultSet().getInt(2));
//                produto.setDataNascimento(this.getResultSet().getString(3));
//                produto.setNomeRazaoSocial(this.getResultSet().getString(4));
//                produto.setApelidoNomeFantasia(this.getResultSet().getString(5));
//                produto.setCpfCnpj(this.getResultSet().getString(6));
//                
//                produto.setCep(this.getResultSet().getString(7));
//                produto.setCidade(this.getResultSet().getString(8));
//                produto.setUf(this.getResultSet().getString(9));
//                produto.setLogradouro(this.getResultSet().getString(10));
//                produto.setNumero(this.getResultSet().getString(11));
//                produto.setBairro(this.getResultSet().getString(12));
//                produto.setComplemento(this.getResultSet().getString(13));
//                
//                produto.setCelular(this.getResultSet().getString(14));
//                produto.setTelefone(this.getResultSet().getString(15));
//                produto.setEmail(this.getResultSet().getString(16));
//                
//                produto.setDataCadastramento(this.getResultSet().getString(17));
//
//                listaProduto.add(produto);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            this.fecharConexao();
//        }
//        return listaProduto;
//    }
    public ArrayList<Produto> getListaProdutoDAO() {
        ArrayList<Produto> listaProduto = new ArrayList();
        Produto produto = new Produto();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_PRODUTO.CODPRODUTO,"
                    + "TBL_PRODUTO.DESCRICAO,"
                    + "TBL_UNIDADEMEDIDA.DESCRICAO"
                    + " FROM"
                    + " TBL_PRODUTO "
                    + "INNER JOIN TBL_UNIDADEMEDIDA "
                    + "ON TBL_PRODUTO.CODUNIDADEMEDIDA = TBL_UNIDADEMEDIDA.CODUNIDADE"
                    + ";"
            );

            while (this.getResultSet().next()) {
                produto = new Produto();
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDescricao(this.getResultSet().getString(2));
                produto.setDescricaoUnidadeMedida(this.getResultSet().getString(3));

                listaProduto.add(produto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaProduto;
    }
    
       public ArrayList<Produto> getListaProdutoSimplesDAO() {
        ArrayList<Produto> listaProduto = new ArrayList();
        Produto produto = new Produto();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_PRODUTO.CODPRODUTO,"
                    + "TBL_PRODUTO.DESCRICAO,"
                    + "TBL_PRODUTO.VALOR"
                    + " FROM"
                    + " TBL_PRODUTO "
                    + ";"
            );

            while (this.getResultSet().next()) {
                produto = new Produto();
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDescricao(this.getResultSet().getString(2));
                produto.setValor(Double.parseDouble(this.getResultSet().getString(3)));

                listaProduto.add(produto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaProduto;
    }

    public boolean atualizarProdutoDAO(Produto produto) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_PRODUTO SET "
                    //+ "CODSTATUSPRODUTO = '" + produto.getStatusProduto() + "',"
                    + "DESCRICAO = '" + produto.getDescricao() + "',"
                    + "CODUNIDADEMEDIDA = '" + produto.getCodUnidadeMedida()+ "',"
                    + "CODCATEGORIA = '" + produto.getCodCategoriaProduto() + "',"
                    + "VALOR = '" + produto.getValor()+ "',"
                    + "CODFORNECEDOR = '" + produto.getCodFornecedor()+ "',"
                    + "FABRICANTE = '" + produto.getFabricante() + "',"
                    + "OBSERVACAO = '" + produto.getObservacao() + "'"
                    + "WHERE "
                    + "CODPRODUTO = '" + produto.getCodProduto() + "'"
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

    public boolean excluirProdutoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_PRODUTO "
                    + "WHERE CODPRODUTO = '" + codigo + "'"
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
