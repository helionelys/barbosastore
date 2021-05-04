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
import br.com.barbosasys.model.Compra;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class CompraDAO extends ConexaoBanco {

    // Inserir informações de compra dentro banco de dados
    public int salvarComprasDAO(Compra compra) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_COMPRA ("
                    + "CODFORNECEDOR,"
                    + "DATACOMPRA,"
                    + "TOTALCOMPRA,"
                    + "DESCONTO,"
                    + "CODTIPOPAGAMENTO,"
                    + "CODSTATUSCOMPRA,"
                    + "OBSERVACAO) "
                    + "VALUES ("
                    + "'" + compra.getCodFornecedor() + "',"
                    + "'" + compra.getDataCompra() + "',"
                    + "'" + compra.getValorTotal() + "',"
                    + "'" + compra.getValorDesconto() + "',"
                    + "'" + compra.getTipoPagamento() + "',"
                    + "'" + compra.getCodStatusCompra() + "',"
                    + "'" + compra.getObservavao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarItensComprasDAO(Item itemCompra) {
        try {
            this.conectar();
            int tamanhoLista = itemCompra.getListaItemCompra().size();
            for (int i = 0; i < tamanhoLista; i++) {
                this.insertSQL(
                        "INSERT INTO TBL_ITENSCOMPRA "
                        + "(CODCOMPRA,CODPRODUTO,QUANTIDADE,SUBTOTAL)"
                        + "VALUES ("
                        //+ "'" + compra.getListaCompra().get(i).getProduto().getCodProduto() + "',"
                        //+ "'" + itemCompra.getCompra().getCodCompra()+ "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getCompra().getCodCompra() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getProduto().getCodProduto() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getQuantidade() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getSubtotal() + "'"
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
        
        public boolean excluirItensComprasDAO(int codigo){
            try {
                this.conectar();
                this.executarUpdateDeleteSQL(
                        "DELETE FROM TBL_ITENSCOMPRA WHERE CODCOMPRA = '" + codigo +"';"
                );
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } finally{
                this.fecharConexao();
            }
        }
        
        public boolean salvarItensComprasUpdateDAO(Item itemCompra) {
        try {
            this.conectar();
            int tamanhoLista = itemCompra.getListaItemCompra().size();
            for (int i = 0; i < tamanhoLista; i++) {    
                this.insertSQL(
                        "INSERT INTO TBL_ITENSCOMPRA "
                        + "(CODCOMPRA,CODPRODUTO,QUANTIDADE,SUBTOTAL)"
                        + "VALUES ("
                        //+ "'" + compra.getListaCompra().get(i).getProduto().getCodProduto() + "',"
                        //+ "'" + itemCompra.getCompra().getCodCompra()+ "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getCompra().getCodCompra() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getProduto().getCodProduto() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getQuantidade() + "',"
                        + "'" + itemCompra.getListaItemCompra().get(i).getSubtotal() + "'"
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
    
    
    public Compra getCompraDAO(int codigo) {
        Compra compra = new Compra();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_COMPRA.CODCOMPRA,"
                    + "TBL_COMPRA.TOTALCOMPRA,"
                    + "TBL_COMPRA.CODFORNECEDOR,"
                    + "TBL_COMPRA.DATACOMPRA,"
                    + "TBL_COMPRA.DESCONTO,"
                    + "TBL_COMPRA.CODSTATUSCOMPRA,"
                    + "TBL_COMPRA.CODTIPOPAGAMENTO,"
                    + "TBL_STATUSCOMPRA.DESCRICAO"
                    + " FROM"
                    + " TBL_COMPRA"
                    + " INNER JOIN TBL_STATUSCOMPRA"
                    + " ON TBL_COMPRA.CODSTATUSCOMPRA = TBL_STATUSCOMPRA.CODSTATUSCOMPRA"
                    + " WHERE"
                    + " TBL_COMPRA.CODCOMPRA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                compra.setCodCompra(this.getResultSet().getInt(1));
                compra.setValorTotal(this.getResultSet().getDouble(2));
                compra.setCodFornecedor(this.getResultSet().getInt(3));
                compra.setDataCompra(this.getResultSet().getString(4));
                compra.setValorDesconto(this.getResultSet().getDouble(5));
                compra.setCodStatusCompra(this.getResultSet().getInt(6));
                compra.setTipoPagamento(this.getResultSet().getInt(7));
                compra.setDescricaoStatus(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return compra;
    }

    public ArrayList<Compra> getListaCompraDAO() {
        ArrayList<Compra> listaCompra = new ArrayList();
        Compra compra = new Compra();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_COMPRA.CODCOMPRA,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL,"
                    + "TBL_COMPRA.TOTALCOMPRA,"
                    + "TBL_COMPRA.DATACOMPRA,"
                    + "TBL_STATUSCOMPRA.DESCRICAO"
                    + " FROM"
                    + " TBL_COMPRA"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_COMPRA.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSCOMPRA"
                    + " ON TBL_COMPRA.CODSTATUSCOMPRA = TBL_STATUSCOMPRA.CODSTATUSCOMPRA"
                    + " ORDER BY TBL_COMPRA.CODCOMPRA DESC;"
            );

            while (this.getResultSet().next()) {
                compra = new Compra();
                compra.setCodCompra(this.getResultSet().getInt(1));
                compra.setNomeRazaoSocial(this.getResultSet().getString(2));

                compra.setValorTotal(this.getResultSet().getDouble(3));

                String dataRetorno = (this.getResultSet().getString(4));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataCompraFormatada = localDate.format(formatter2);
                compra.setDataCompra(dataCompraFormatada);
                compra.setDescricaoStatus(this.getResultSet().getString(5));
                listaCompra.add(compra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCompra;
    }
    
        public ArrayList<Compra> getListaCompraStatusAguardandoDAO() {
        ArrayList<Compra> listaCompra = new ArrayList();
        Compra compra = new Compra();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_COMPRA.CODCOMPRA,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL,"
                    + "TBL_COMPRA.TOTALCOMPRA,"
                    + "TBL_COMPRA.DATACOMPRA,"
                    + "TBL_STATUSCOMPRA.DESCRICAO"
                    + " FROM"
                    + " TBL_COMPRA"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_COMPRA.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSCOMPRA"
                    + " ON TBL_COMPRA.CODSTATUSCOMPRA = TBL_STATUSCOMPRA.CODSTATUSCOMPRA"
                    + " WHERE TBL_COMPRA.CODSTATUSCOMPRA = 2 ORDER BY TBL_COMPRA.CODCOMPRA DESC;"
            );

            while (this.getResultSet().next()) {
                compra = new Compra();
                compra.setCodCompra(this.getResultSet().getInt(1));
                compra.setNomeRazaoSocial(this.getResultSet().getString(2));

                compra.setValorTotal(this.getResultSet().getDouble(3));

                String dataRetorno = (this.getResultSet().getString(4));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataCompraFormatada = localDate.format(formatter2);
                compra.setDataCompra(dataCompraFormatada);
                compra.setDescricaoStatus(this.getResultSet().getString(5));
                listaCompra.add(compra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaCompra;
    }
    

    public ArrayList<Item> getListaItensCompraDAO(int codigo) {
        ArrayList<Item> listaItensCompra = new ArrayList();
        
        
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    //+ "CODFORNECEDOR,"
                    + "TBL_ITENSCOMPRA.CODPRODUTO,"
                    + "TBL_PRODUTO.DESCRICAO,"
                    + "TBL_PRODUTO.VALOR,"
                    + "TBL_ITENSCOMPRA.QUANTIDADE,"
                    + "TBL_ITENSCOMPRA.SUBTOTAL "
                    + "FROM"
                    + " TBL_ITENSCOMPRA"
                    + " INNER JOIN TBL_COMPRA"
                    + " ON TBL_ITENSCOMPRA.CODCOMPRA = TBL_COMPRA.CODCOMPRA"
                    + " INNER JOIN TBL_PRODUTO"
                    + " ON TBL_ITENSCOMPRA.CODPRODUTO = TBL_PRODUTO.CODPRODUTO"
                    + "  WHERE TBL_ITENSCOMPRA.CODCOMPRA = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                //Compra compra = new Compra();
                Produto produto = new Produto();
                Item itemCompra = new Item();
                //compra.setCodCompra(this.getResultSet().getInt(1));
                //itemCompra.setCompra(compra);
                produto.setCodProduto(this.getResultSet().getInt(1));
                produto.setDescricao(this.getResultSet().getString(2));
                produto.setValor(this.getResultSet().getDouble(3));
                itemCompra.setQuantidade(this.getResultSet().getInt(4));
                itemCompra.setSubtotal(this.getResultSet().getDouble(5));
                itemCompra.setProduto(produto);
                
                listaItensCompra.add(itemCompra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaItensCompra;
    }

    public boolean atualizarCompraDAO(Compra compra) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_COMPRA SET "
                    + "TOTALCOMPRA = '" + compra.getValorTotal() + "',"
                    + "CODFORNECEDOR = '" + compra.getCodFornecedor() + "',"
                    + "DATACOMPRA =  '" + compra.getDataCompra()  + "',"
                    + "DESCONTO = '" + compra.getValorDesconto()+ "',"
                    + "CODSTATUSCOMPRA = '" + compra.getCodStatusCompra()+ "',"
                    + "OBSERVACAO = '" + compra.getObservavao()+ "'"
                   // + "CODTIPOPAGAMENTO = '" + compra.getTipoPagamento()+ "'"
                    + "WHERE "
                    + "CODCOMPRA = '" + compra.getCodCompra() + "'"
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
    
    public boolean atualizarCompraFaturamentoDAO(Compra compra) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_COMPRA SET "
                    + "CODSTATUSCOMPRA = '1'"
                    + "WHERE "
                    + "CODCOMPRA = '" + compra.getCodCompra() + "'"
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
    
    public boolean cancelarCompraDAO(Compra compra) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_COMPRA SET "
                    + "CODSTATUSCOMPRA = '3'"
                    + "WHERE "
                    + "CODCOMPRA = '" + compra.getCodCompra() + "'"
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
    
    public boolean excluirCompraDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_COMPRA WHERE CODCOMPRA = '" + codigo + "';"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public int getUltimaCompraDAO() {
        //Compra compra = new Compra();
        int codCompra = 0;
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT MAX(CODCOMPRA) CODCOMPRA FROM TBL_COMPRA"
            );

            while (this.getResultSet().next()) {
                Compra compra = new Compra();
                compra.setCodCompra(this.getResultSet().getInt(1));
                codCompra = compra.getCodCompra();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return codCompra;
    }

}
