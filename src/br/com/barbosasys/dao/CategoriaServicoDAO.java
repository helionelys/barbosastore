/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.CategoriaServico;
import br.com.barbosasys.model.Endereco;
import br.com.barbosasys.model.Contato;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class CategoriaServicoDAO extends ConexaoBanco {

    // Inserir categoriaServico dentro banco de dados
    public int salvarCategoriaServicoDAO(CategoriaServico categoriaServico) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_CATEGORIASERVICO ("
                    + "DESCRICAO"
                    + ") VALUES ("
                    + "'" + categoriaServico.getDescricao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera categoriaServico através do codigo
    public CategoriaServico getCategoriaServicoDAO(int codigo) {
        CategoriaServico categoriaServico = new CategoriaServico();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO "
                    + "FROM"
                    + " TBL_CATEGORIASERVICO"
                    + " WHERE"
                    + " CODCATEGORIA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                categoriaServico.setCodigo(this.getResultSet().getInt(1));
                categoriaServico.setDescricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return categoriaServico;
    }

    public CategoriaServico getCategoriaServicoDAO(String nome) {
        CategoriaServico categoriaServico = new CategoriaServico();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_CATEGORIASERVICO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                categoriaServico.setCodigo(this.getResultSet().getInt(1));
                categoriaServico.setDescricao(this.getResultSet().getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return categoriaServico;
    }

    public ArrayList<CategoriaServico> getListaCategoriaServicoDAO() {
        ArrayList<CategoriaServico> listaCategoriaServico = new ArrayList();
        CategoriaServico categoriaServico = new CategoriaServico();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCATEGORIA,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_CATEGORIASERVICO "
                    + ";"
            );

            while (this.getResultSet().next()) {
                categoriaServico = new CategoriaServico();
                categoriaServico.setCodigo(this.getResultSet().getInt(1));
                categoriaServico.setDescricao(this.getResultSet().getString(2));
                listaCategoriaServico.add(categoriaServico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCategoriaServico;
    }

    public boolean atualizarCategoriaServicoDAO(CategoriaServico categoriaServico) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_CATEGORIASERVICO SET "
                    + "DESCRICAO = '" + categoriaServico.getDescricao()+ "'"
                    + "WHERE "
                    + "CODCATEGORIA = '" + categoriaServico.getCodigo()+ "'"
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

    public boolean excluirCategoriaServicoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_CATEGORIASERVICO "
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
