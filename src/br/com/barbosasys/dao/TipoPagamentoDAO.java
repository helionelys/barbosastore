/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.TipoPagamento;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class TipoPagamentoDAO extends ConexaoBanco {

    public int salvarTipoPagamentoDAO(TipoPagamento tipoPagamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_TIPOPAGAMENTO (DESCRICAO) VALUES ('" + tipoPagamento.getDescricao() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public TipoPagamento getTipoPagamentoDAO(int codigo) {
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT CODTIPOPAGAMENTO,DESCRICAO FROM TBL_TIPOPAGAMENTO WHERE CODTIPOPAGAMENTO = '" + codigo + "';"
            );

            while (this.getResultSet().next()) {
                tipoPagamento.setCodTipoPagamento(this.getResultSet().getInt(1));
                tipoPagamento.setDescricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return tipoPagamento;
    }

    public TipoPagamento getTipoPagamentoDAO(String nome) {
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODTIPOPAGAMENTO,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_TIPOPAGAMENTO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                tipoPagamento.setCodTipoPagamento(this.getResultSet().getInt(1));
                tipoPagamento.setDescricao(this.getResultSet().getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return tipoPagamento;
    }

    public ArrayList<TipoPagamento> getListaTipoPagamentoDAO() {
        ArrayList<TipoPagamento> listaTipoPagamento = new ArrayList();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODTIPOPAGAMENTO,"
                    + "DESCRICAO"
                    + " FROM"
                    + " TBL_TIPOPAGAMENTO"
                    + ";"
            );

            while (this.getResultSet().next()) {
                tipoPagamento = new TipoPagamento();
                tipoPagamento.setCodTipoPagamento(this.getResultSet().getInt(1));
                tipoPagamento.setDescricao(this.getResultSet().getString(2));
                listaTipoPagamento.add(tipoPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaTipoPagamento;    
    }        
            

    public boolean atualizarTipoPagamentoDAO(TipoPagamento tipoPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE TBL_TIPOPAGAMENTO SET "
                    + "CODTIPOPAGAMENTO = '" + tipoPagamento.getCodTipoPagamento()+ "',"
                    + "DESCRICAO = '" + tipoPagamento.getDescricao() + "'"
                    + " WHERE "
                    + "CODTIPOPAGAMENTO = '" + tipoPagamento.getCodTipoPagamento()+ "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
     public boolean excluirTipoPagamentoDAO(int codigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM TBL_TIPOPAGAMENTO "
                + " WHERE "
                    + "CODTIPOPAGAMENTO = '" + codigo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}
