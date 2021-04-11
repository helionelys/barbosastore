/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Caixa;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class CaixaDAO extends ConexaoBanco {

    public int salvarCaixaDAO(Caixa caixa) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO caixa ("
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale"
                    + ") VALUES ("
                    + "'" + caixa.getCodCaixa() + "',"
                    + "'" + caixa.getDinheiro() + "',"
                    + "'" + caixa.getCheque() + "',"
                    + "'" + caixa.getCartao() + "',"
                    + "'" + caixa.getVale() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public Caixa getCaixaDAO(int codigo) {
        Caixa caixa = new Caixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale"
                    + " FROM"
                    + " caixa"
                    + " WHERE"
                    + " codigo = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                caixa.setCodCaixa(this.getResultSet().getInt(1));
                caixa.setDinheiro(this.getResultSet().getFloat(2));
                caixa.setCheque(this.getResultSet().getFloat(3));
                caixa.setCartao(this.getResultSet().getFloat(4));
                caixa.setVale(this.getResultSet().getFloat(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return caixa;
    }

    public ArrayList<Caixa> getListaCaixaDAO() {
        ArrayList<Caixa> listaCaixa = new ArrayList();
        Caixa caixa = new Caixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODCAIXA,"
                    + "DINHEIRO,"
                    + "CHEQUE,"
                    + "CARTAO,"
                    + "VALE"
                    + " FROM"
                    + " TBL_CAIXA"
                    + ";"
            );

            while (this.getResultSet().next()) {
                caixa = new Caixa();
                caixa.setCodCaixa(this.getResultSet().getInt(1));
                caixa.setDinheiro(this.getResultSet().getFloat(2));
                caixa.setCheque(this.getResultSet().getFloat(3));
                caixa.setCartao(this.getResultSet().getFloat(4));
                caixa.setVale(this.getResultSet().getFloat(5));
                listaCaixa.add(caixa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCaixa;
    }

    public boolean atualizarCaixaDAO(Caixa caixa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE TBL_CAIXA SET "
                    + "CODCAIXA = '" + caixa.getCodCaixa()+ "',"
                    + "DINHEIRO = '" + caixa.getDinheiro() + "',"
                    + "CHEQUE = '" + caixa.getCheque() + "',"
                    + "CARTAO = '" + caixa.getCartao() + "',"
                    + "VALE = '" + caixa.getVale() + "'"
                    + " WHERE "
                    + "CODCAIXA = '" + caixa.getCodCaixa()+ "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
        public boolean excluirCaixaDAO(int codigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM TBL_CAIXA "
                + " WHERE "
                    + "CODCAIXA = '" + codigo + "'"
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
