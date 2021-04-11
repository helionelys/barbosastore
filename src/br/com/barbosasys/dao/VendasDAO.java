/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class VendasDAO extends ConexaoBanco {

    // Inserir informações de venda dentro banco de dados
    public int salvarVendasDAO(Venda venda) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_VENDAS ("
                    + "CODCLIENTE,"
                    + "DATAVENDA,"
                    + "TOTALDAVENDA,"
                    + "DESCONTO,"
                    + "TIPODEPAGAMENTO,"
                    + "CODSTATUSVENDA) "
                    + "VALUES ("
                    + "'" + venda.getCodCliente() + "',"
                    + "'" + venda.getDataVenda() + "',"
                    + "'" + venda.getValorTotal() + "',"
                    + "'" + venda.getValorDesconto() + "',"
                    + "'" + venda.getTipoPagamento() + "',"
                    + "'" + venda.getCodStatusVenda() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarItensVendasDAO(Venda venda) {
        try {
            this.conectar();
            int tamanhoLista = venda.getListaVenda().size();
            for (int i = 0; i < tamanhoLista; i++) {
                this.insertSQL(
                        "INSERT INT TBL_ITENSVENDA "
                        + "( "
                        + ("CODVENDA,")
                        + ("CODPRODUTO,")
                        + ("QUANTIDADE,")
                        + ("SUBTOTAL")
                        + "VALUES ("
                        + "'" + venda.getListaVenda().get(i).getListaVenda() + "',"
                        + "'" + venda.getCodVenda() + "',"
                        + "'" + venda.getListaVenda().get(i).getQuantidade() + "'"
                        + "'" + venda.getQuantidade() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public Venda getVendaDAO(int codigo) {
        Venda venda = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODVENDA,"
                    + "TOTALVENDA,"
                    + "CODCLIENTE,"
                    + "DATAVENDA,"
                    + "DESCONTO,"
                    + "CODSTATUSVENDA"
                    + "CODTIPOPAGAMENTO"
                    + " FROM"
                    + " TBL_VENDAS"
                    + "WHERE"
                    + "CODVENDA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setValorTotal(this.getResultSet().getFloat(2));
                venda.setCodCliente(this.getResultSet().getInt(3));
                venda.setDataVenda(this.getResultSet().getDate(4));
                venda.setValorDesconto(this.getResultSet().getFloat(5));
                venda.setCodStatusVenda(this.getResultSet().getInt(6));
                venda.setTipoPagamento(this.getResultSet().getInt(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return venda;
    }

    public ArrayList<Venda> getListaVendaDAO() {
        ArrayList<Venda> listaVenda = new ArrayList();
        Venda venda = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODVENDA,"
                    + "CODCLIENTE,"
                    + "DATAVENDA,"
                    + "FROM"
                    + "TBL_VENDA"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setCodCliente(this.getResultSet().getInt(2));
                venda.setDataVenda(this.getResultSet().getDate(3));
                listaVenda.add(venda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaVenda;
    }

    public boolean atualizarVendaDAO(Venda venda) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_VENDA SET"
                    + "CODVENDA = '" + venda.getCodVenda() + "',"
                    + "TOTALVENDA = '" + venda.getValorTotal() + "',"
                    + "CODCLIENTE = '" + venda.getCodCliente() + "',"
                    + "DATAVENDA =  '" + venda.getDataVenda() + "',"
                    + "DESCONTO = '" + venda.getValorDesconto() + "',"
                    + "CODTIPOPAGAMENTO = '" + venda.getValorDesconto() + "'"
                    + "WHERE "
                    + "CODVENDA = '" + venda.getCodVenda() + "'"
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
    
    public boolean excluirVendaDAO(int codigo){
        try {
            this.conectar();
            this.executarSQL(
                    "DELETE FROM TBL_VENDAS WHERE CODVENDA = '" + codigo + "';"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally{
            this.fecharConexao();
        }
    }

}
