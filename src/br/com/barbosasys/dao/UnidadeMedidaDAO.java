/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.UnidadeMedida;
import br.com.barbosasys.model.Endereco;
import br.com.barbosasys.model.Contato;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class UnidadeMedidaDAO extends ConexaoBanco {

    // Inserir unidadeMedida dentro banco de dados
    public int salvarUnidadeMedidaDAO(UnidadeMedida unidadeMedida) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_UNIDADEMEDIDA ("
                    + "DESCRICAO,"
                    + "DESCRICAOCOMPLETA"        
                    + ") VALUES ("
                    + "'" + unidadeMedida.getDescricao() + "',"
                    + "'" + unidadeMedida.getDescricaoCompleta()+ "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera unidadeMedida através do codigo
    public UnidadeMedida getUnidadeMedidaDAO(int codigo) {
        UnidadeMedida unidadeMedida = new UnidadeMedida();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODUNIDADE,"
                    + "DESCRICAO, "
                    + "DESCRICAOCOMPLETA "
                    + "FROM"
                    + " TBL_UNIDADEMEDIDA"
                    + " WHERE"
                    + " CODUNIDADE = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                unidadeMedida.setCodigo(this.getResultSet().getInt(1));
                unidadeMedida.setDescricao(this.getResultSet().getString(2));
                unidadeMedida.setDescricaoCompleta(this.getResultSet().getString(3));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return unidadeMedida;
    }

    public UnidadeMedida getUnidadeMedidaDAO(String nome) {
        UnidadeMedida unidadeMedida = new UnidadeMedida();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODUNIDADE,"
                    + "DESCRICAO,"
                    + "DESCRICAOCOMPLETA "
                    + "FROM"        
                    + " TBL_UNIDADEMEDIDA"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                unidadeMedida.setCodigo(this.getResultSet().getInt(1));
                unidadeMedida.setDescricao(this.getResultSet().getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return unidadeMedida;
    }

    public ArrayList<UnidadeMedida> getListaUnidadeMedidaDAO() {
        ArrayList<UnidadeMedida> listaUnidadeMedida = new ArrayList();
        UnidadeMedida unidadeMedida = new UnidadeMedida();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODUNIDADE,"
                    + "DESCRICAO,"
                    + "DESCRICAOCOMPLETA"
                    + " FROM"
                    + " TBL_UNIDADEMEDIDA "
                    + ";"
            );

            while (this.getResultSet().next()) {
                unidadeMedida = new UnidadeMedida();
                unidadeMedida.setCodigo(this.getResultSet().getInt(1));
                unidadeMedida.setDescricao(this.getResultSet().getString(2));
                unidadeMedida.setDescricaoCompleta(this.getResultSet().getString(3));
                listaUnidadeMedida.add(unidadeMedida);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaUnidadeMedida;
    }

    public boolean atualizarUnidadeMedidaDAO(UnidadeMedida unidadeMedida) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_UNIDADEMEDIDA SET "
                    + "DESCRICAO = '" + unidadeMedida.getDescricao()+ "',"
                    + "DESCRICAOCOMPLETA = '" + unidadeMedida.getDescricaoCompleta()+ "'"
                    + "WHERE "
                    + "CODUNIDADE = '" + unidadeMedida.getCodigo()+ "'"
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

    public boolean excluirUnidadeMedidaDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_UNIDADEMEDIDA "
                    + "WHERE CODUNIDADE = '" + codigo + "'"
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
