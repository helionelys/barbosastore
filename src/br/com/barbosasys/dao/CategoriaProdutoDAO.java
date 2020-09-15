/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.CategoriaProduto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hbarbosa
 */
public class CategoriaProdutoDAO extends ConexaoBanco {

    // Inserir categoriaProduto dentro banco de dados
    public int salvarCategoriaProdutoDAO(CategoriaProduto categoriaProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_CATEGORIAPRODUTO ("
                    + "DESCRICAO"
                    + ") VALUES ("
                    + "'" + categoriaProduto.getDescricao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera categoriaProduto através do codigo
    public CategoriaProduto getCategoriaProdutoDAO(int codigo) {
        CategoriaProduto categoriaProduto = new CategoriaProduto();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO "
                    + "FROM"
                    + " TBL_CATEGORIAPRODUTO"
                    + " WHERE"
                    + " CODCATEGORIA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                categoriaProduto.setCodigo(this.getResultSet().getInt(1));
                categoriaProduto.setDescricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return categoriaProduto;
    }

    public CategoriaProduto getCategoriaProdutoDAO(String nome) {
        CategoriaProduto categoriaProduto = new CategoriaProduto();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_CATEGORIAPRODUTO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                categoriaProduto.setCodigo(this.getResultSet().getInt(1));
                categoriaProduto.setDescricao(this.getResultSet().getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return categoriaProduto;
    }

    public ArrayList<CategoriaProduto> getListaCategoriaProdutoDAO() {
        ArrayList<CategoriaProduto> listaCategoriaProduto = new ArrayList();
        CategoriaProduto categoriaProduto = new CategoriaProduto();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_CATEGORIAPRODUTO "
                    + ";"
            );

            while (this.getResultSet().next()) {
                categoriaProduto = new CategoriaProduto();
                categoriaProduto.setCodigo(this.getResultSet().getInt(1));
                categoriaProduto.setDescricao(this.getResultSet().getString(2));
                listaCategoriaProduto.add(categoriaProduto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCategoriaProduto;
    }
    

    public boolean atualizarCategoriaProdutoDAO(CategoriaProduto categoriaProduto) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_CATEGORIAPRODUTO SET "
                    + "DESCRICAO = '" + categoriaProduto.getDescricao()+ "'"
                    + "WHERE "
                    + "CODCATEGORIA = '" + categoriaProduto.getCodigo()+ "'"
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

    public boolean excluirCategoriaProdutoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_CATEGORIAPRODUTO "
                    + "WHERE CODCATEGORIA = '" + codigo + "'"
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
