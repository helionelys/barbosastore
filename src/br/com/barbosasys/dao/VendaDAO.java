/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Item;
import br.com.barbosasys.model.Produto;
import br.com.barbosasys.model.TipoPagamento;
import br.com.barbosasys.model.Venda;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                    + "CODSTATUSVENDA,"
                    + "OBSERVACAO) "
                    + "VALUES ("
                    + "'" + venda.getCodCliente() + "',"
                    + "'" + venda.getDataVenda() + "',"
                    + "'" + venda.getValorTotal() + "',"
                    + "'" + venda.getValorDesconto() + "',"
                    + "'" + venda.getTipoPagamento() + "',"
                    + "'" + venda.getCodStatusVenda() + "',"
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

    public boolean salvarItensVendasDAO(Item itemVenda) {
        try {
            this.conectar();
            int tamanhoLista = itemVenda.getListaItemVenda().size();
            for (int i = 0; i < tamanhoLista; i++) {
                this.insertSQL(
                        "INSERT INTO TBL_ITENSVENDA "
                        + "(CODVENDA,CODPRODUTO,QUANTIDADE,SUBTOTAL)"
                        + "VALUES ("
                        //+ "'" + venda.getListaVenda().get(i).getProduto().getCodProduto() + "',"
                        //+ "'" + itemVenda.getVenda().getCodVenda()+ "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getVenda().getCodVenda() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getProduto().getCodProduto() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getQuantidade() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getSubtotal() + "'"
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
        
        public boolean excluirItensVendasDAO(int codigo){
            try {
                this.conectar();
                this.executarUpdateDeleteSQL(
                        "DELETE FROM TBL_ITENSVENDA WHERE CODVENDA = '" + codigo +"';"
                );
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } finally{
                this.fecharConexao();
            }
        }
        
        public boolean salvarItensVendasUpdateDAO(Item itemVenda) {
        try {
            this.conectar();
            int tamanhoLista = itemVenda.getListaItemVenda().size();
            for (int i = 0; i < tamanhoLista; i++) {    
                this.insertSQL(
                        "INSERT INTO TBL_ITENSVENDA "
                        + "(CODVENDA,CODPRODUTO,QUANTIDADE,SUBTOTAL)"
                        + "VALUES ("
                        //+ "'" + venda.getListaVenda().get(i).getProduto().getCodProduto() + "',"
                        //+ "'" + itemVenda.getVenda().getCodVenda()+ "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getVenda().getCodVenda() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getProduto().getCodProduto() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getQuantidade() + "',"
                        + "'" + itemVenda.getListaItemVenda().get(i).getSubtotal() + "'"
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
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_VENDA.CODVENDA,"
                    + "TBL_VENDA.TOTALVENDA,"
                    + "TBL_VENDA.CODCLIENTE,"
                    + "TBL_VENDA.DATAVENDA,"
                    + "TBL_VENDA.DESCONTO,"
                    + "TBL_VENDA.CODSTATUSVENDA,"
                    + "TBL_VENDA.CODTIPOPAGAMENTO,"
                    + "TBL_STATUSVENDA.DESCRICAO"
                    + " FROM"
                    + " TBL_VENDA"
                    + " INNER JOIN TBL_STATUSVENDA"
                    + " ON TBL_VENDA.CODSTATUSVENDA = TBL_STATUSVENDA.CODSTATUSVENDA"
                    + " WHERE"
                    + " TBL_VENDA.CODVENDA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setValorTotal(this.getResultSet().getDouble(2));
                venda.setCodCliente(this.getResultSet().getInt(3));
                venda.setDataVenda(this.getResultSet().getString(4));
                venda.setValorDesconto(this.getResultSet().getDouble(5));
                venda.setCodStatusVenda(this.getResultSet().getInt(6));
                venda.setTipoPagamento(this.getResultSet().getInt(7));
                venda.setDescricaoStatus(this.getResultSet().getString(8));
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
                    + "TBL_VENDA.DATAVENDA,"
                    + "TBL_STATUSVENDA.DESCRICAO"
                    + " FROM"
                    + " TBL_VENDA"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_VENDA.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSVENDA"
                    + " ON TBL_VENDA.CODSTATUSVENDA = TBL_STATUSVENDA.CODSTATUSVENDA"
                    + " ORDER BY TBL_VENDA.CODVENDA DESC;"
            );

            while (this.getResultSet().next()) {
                venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setNomeRazaoSocial(this.getResultSet().getString(2));

                venda.setValorTotal(this.getResultSet().getDouble(3));

                String dataRetorno = (this.getResultSet().getString(4));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataVendaFormatada = localDate.format(formatter2);
                venda.setDataVenda(dataVendaFormatada);
                venda.setDescricaoStatus(this.getResultSet().getString(5));
                listaVenda.add(venda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaVenda;
    }
    
        public ArrayList<Venda> getListaVendaStatusAguardandoDAO() {
        ArrayList<Venda> listaVenda = new ArrayList();
        Venda venda = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_VENDA.CODVENDA,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + "TBL_VENDA.TOTALVENDA,"
                    + "TBL_VENDA.DATAVENDA,"
                    + "TBL_STATUSVENDA.DESCRICAO"
                    + " FROM"
                    + " TBL_VENDA"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_VENDA.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSVENDA"
                    + " ON TBL_VENDA.CODSTATUSVENDA = TBL_STATUSVENDA.CODSTATUSVENDA"
                    + " WHERE TBL_VENDA.CODSTATUSVENDA = 2 ORDER BY TBL_VENDA.CODVENDA DESC;"
            );

            while (this.getResultSet().next()) {
                venda = new Venda();
                venda.setCodVenda(this.getResultSet().getInt(1));
                venda.setNomeRazaoSocial(this.getResultSet().getString(2));

                venda.setValorTotal(this.getResultSet().getDouble(3));

                String dataRetorno = (this.getResultSet().getString(4));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataVendaFormatada = localDate.format(formatter2);
                venda.setDataVenda(dataVendaFormatada);
                venda.setDescricaoStatus(this.getResultSet().getString(5));
                listaVenda.add(venda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaVenda;
    }
    

    public ArrayList<Item> getListaItensVendaDAO(int codigo) {
        ArrayList<Item> listaItensVenda = new ArrayList();
        
        
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    //+ "CODVENDA,"
                    + "TBL_ITENSVENDA.CODPRODUTO,"
                    + "TBL_PRODUTO.DESCRICAO,"
                    + "TBL_PRODUTO.VALOR,"
                    + "TBL_ITENSVENDA.QUANTIDADE,"
                    + "TBL_ITENSVENDA.SUBTOTAL "
                    + "FROM"
                    + " TBL_ITENSVENDA"
                    + " INNER JOIN TBL_VENDA"
                    + " ON TBL_ITENSVENDA.CODVENDA = TBL_VENDA.CODVENDA"
                    + " INNER JOIN TBL_PRODUTO"
                    + " ON TBL_ITENSVENDA.CODPRODUTO = TBL_PRODUTO.CODPRODUTO"
                    + "  WHERE TBL_ITENSVENDA.CODVENDA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                //Venda venda = new Venda();
                Produto produto = new Produto();
                Item itemVenda = new Item();
                //venda.setCodVenda(this.getResultSet().getInt(1));
                //itemVenda.setVenda(venda);
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDescricao(this.getResultSet().getString(2));
                produto.setValor(this.getResultSet().getDouble(3));
                itemVenda.setQuantidade(this.getResultSet().getInt(4));
                itemVenda.setSubtotal(this.getResultSet().getDouble(5));
                itemVenda.setProduto(produto);
                
                listaItensVenda.add(itemVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaItensVenda;
    }

    public boolean atualizarVendaDAO(Venda venda) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_VENDA SET "
                    + "TOTALVENDA = '" + venda.getValorTotal() + "',"
                    + "CODCLIENTE = '" + venda.getCodCliente() + "',"
                    + "DATAVENDA =  '" + venda.getDataVenda()  + "',"
                    + "DESCONTO = '" + venda.getValorDesconto()+ "',"
                    + "CODSTATUSVENDA = '" + venda.getCodStatusVenda()+ "',"
                    + "OBSERVACAO = '" + venda.getObservavao()+ "'"
                   // + "CODTIPOPAGAMENTO = '" + venda.getTipoPagamento()+ "'"
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
    
    public boolean atualizarVendaFaturamentoDAO(Venda venda) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_VENDA SET "
                    + "CODSTATUSVENDA = '1'"
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
    
    public boolean excluirVendaDAO(int codigo) {
        try {
            this.conectar();
            this.executarSQL(
                    "DELETE FROM TBL_VENDA WHERE CODVENDA = '" + codigo + "';"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
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
