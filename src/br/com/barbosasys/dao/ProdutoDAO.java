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
                    + "VALORCOMPRA,"
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
                    + "'" + produto.getValorCompra()+ "',"
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
    
        public Produto getProdutoCompraSimplesDAO(int codigo) {
        Produto produto = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODPRODUTO," //1
                    + "DESCRICAO," //2
                    + "VALORCOMPRA" //3
                    + " FROM"
                    + " TBL_PRODUTO"
                    + " WHERE"
                    + " CODPRODUTO = '" + codigo + "'"
                    + ";"
            );
            
             while (this.getResultSet().next()) {

            produto.setCodProduto(this.getResultSet().getInt(1));
            produto.setDescricao(this.getResultSet().getString(2));
            produto.setValorCompra(Double.parseDouble(this.getResultSet().getString(3)));
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
                    + "VALORCOMPRA," //7
                    + "CODFORNECEDOR," //8
                    + "FABRICANTE," //9
                    + "OBSERVACAO," //10
                    + "QUANTIDADE," //10
                    + "DATAATUALIZACAOESTOQUE" //10
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
                produto.setValorCompra(Double.parseDouble(this.getResultSet().getString(7)));
                produto.setCodFornecedor(this.getResultSet().getInt(8));
                produto.setFabricante(this.getResultSet().getString(9));
                produto.setObservacao(this.getResultSet().getString(10));
                produto.setQuantidade(this.getResultSet().getInt(11));
                produto.setDataEstoqueAtualizacao(this.getResultSet().getString(12));

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
                    + "VALORCOMPRA,"
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
                produto.setValorCompra(Double.parseDouble(this.getResultSet().getString(7)));
                produto.setCodFornecedor(this.getResultSet().getInt(8));
                produto.setFabricante(this.getResultSet().getString(9));
                produto.setObservacao(this.getResultSet().getString(10));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produto;
    }


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
       
       public ArrayList<Produto> getListaProdutoSimplesComprasDAO() {
        ArrayList<Produto> listaProduto = new ArrayList();
        Produto produto = new Produto();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_PRODUTO.CODPRODUTO,"
                    + "TBL_PRODUTO.DESCRICAO,"
                    + "TBL_PRODUTO.VALORCOMPRA,"
                    + "TBL_PRODUTO.VALOR"
                    + " FROM"
                    + " TBL_PRODUTO "
                    + ";"
            );

            while (this.getResultSet().next()) {
                produto = new Produto();
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDescricao(this.getResultSet().getString(2));
                produto.setValorCompra(Double.parseDouble(this.getResultSet().getString(3)));
                produto.setValor(Double.parseDouble(this.getResultSet().getString(4)));

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
                    + "VALORCOMPRA = '" + produto.getValorCompra()+ "',"
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
    
    public boolean atualizarEstoqueProduto(Produto produto){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_PRODUTO SET "
                    + "QUANTIDADE = '" + produto.getQuantidade() + "',"
                    + "DATAATUALIZACAOESTOQUE = '" + produto.getDataEstoqueAtualizacao()+ "'"
                    + "WHERE CODPRODUTO = '" + produto.getCodProduto() + "'"
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
