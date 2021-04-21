/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.ItemVenda;
import br.com.barbosasys.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class VendaDAO extends ConexaoBanco {

    // Inserir informações de venda dentro banco de dados
    public int salvarVendasDAO(Venda venda) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_VENDA ("
                    + "CODCLIENTE,"
                    + "DATAVENDA,"
                    + "TOTALVENDA,"
                    + "DESCONTO,"
                    + "CODTIPOPAGAMENTO,"
                    //+ "CODSTATUSVENDA,"
                    + "OBSERVACAO) "
                    + "VALUES ("
                    + "'" + venda.getCodCliente() + "',"
                    + "'" + venda.getDataVenda() + "',"
                    + "'" + venda.getValorTotal() + "',"
                    + "'" + venda.getValorDesconto() + "',"
                    + "'" + venda.getTipoPagamento() + "',"
                    //+ "'" + venda.getCodStatusVenda() + "',"
                    + "'" + venda.getObservavao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarItensVendasDAO(ItemVenda itemVenda) {
        try {
            this.conectar();
            int tamanhoLista = itemVenda.getListaItemVenda().size();
            for (int i = 0; i < tamanhoLista; i++) {
                this.insertSQL(
                        "INSERT INTO TBL_ITENSVENDA "
                        + "(CODVENDA,CODPRODUTO,QUANTIDADE,SUBTOTAL)"
                        + "VALUES ("
                        //+ "'" + itemVenda.getVenda() + "',"
                        + "'" + itemVenda.getVenda().getCodVenda() + "',"
                        //+ "'" + itemVenda.getListaItemVenda().get(i).getVenda().getCodVenda()      + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getProduto().getCodProduto()    + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getQuantidade() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getSubtotal()   + "'"
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
                    + " TBL_VENDA"
                    + "WHERE"
                    + "CODVENDA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setValorTotal(this.getResultSet().getFloat(2));
                venda.setCodCliente(this.getResultSet().getInt(3));
                venda.setDataVenda(this.getResultSet().getString(4));
                venda.setValorDesconto(this.getResultSet().getDouble(5));
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
                    + "TBL_VENDA.CODVENDA,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + "TBL_VENDA.TOTALVENDA,"
                    + "TBL_VENDA.DATAVENDA"
                    + " FROM"
                    + " TBL_VENDA"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_VENDA.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setNomeRazaoSocial(this.getResultSet().getString(2));
                venda.setValorTotal(this.getResultSet().getDouble(3));
                venda.setDataVenda(this.getResultSet().getString(4));
                listaVenda.add(venda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaVenda;
    }

    public ArrayList<Venda> getListaVendaDAO(int codigo) {
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
                    + "TBL_VENDA WHERE CODVENDA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setCodCliente(this.getResultSet().getInt(2));
                venda.setDataVenda(this.getResultSet().getString(3));
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
                    "DELETE FROM TBL_VENDA WHERE CODVENDA = '" + codigo + "';"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally{
            this.fecharConexao();
        }
    }
    
public int getUltimaVendaDAO() {
        //Venda venda = new Venda();
        int codVenda = 0;
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT MAX(CODVENDA) CODVENDA FROM TBL_VENDA"
            );

            while (this.getResultSet().next()) {
            Venda venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                codVenda = venda.getCodVenda();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return codVenda;
    }

}
