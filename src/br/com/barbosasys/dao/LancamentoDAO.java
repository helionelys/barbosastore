/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.Lancamento;
import br.com.barbosasys.model.TipoPagamento;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class LancamentoDAO extends ConexaoBanco {

    // Inserir lancamento dentro banco de dados
    public int salvarLancamentoDAO(Lancamento lancamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_LANCAMENTO ("
                    + "CODCLIENTE,"
                    + "DESCRICAO,"
                    + "DATALANCAMENTO,"
                    + "DATAVENCIMENTO,"
                    + "DATAPAGAMENTO,"
                    + "VALOR,"
                    + "CODTIPOPAGAMENTO,"
                    + "OBSERVACAO,"
                    + "CODTIPOLANCAMENTO,"
                    + "CODSTATUSLANCAMENTO"
                    + ") VALUES ("
                    + "'" + lancamento.getCliente().getCodigo()+ "',"
                    + "'" + lancamento.getDescricaoLancamento() + "',"
                    + "'" + lancamento.getDataLancamento() + "',"
                    + "'" + lancamento.getDataVencimento() + "',"
                    + "'" + lancamento.getDataPagamento() + "',"
                    + "'" + lancamento.getValorLancamento() + "',"
                    + "'" + lancamento.getTipoPagamento().getCodTipoPagamento() + "',"
                    + "'" + lancamento.getObservacao() + "',"
                    + "'" + lancamento.getCodTipoLancamento() + "',"
                    + "'" + lancamento.getCodStatusLancamento() + "',"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    // Recupera lancamento através do codigo
    public Lancamento getLancamentoDAO(int codigo) {
        Lancamento lancamento = new Lancamento();
        Cliente cliente = new Cliente();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "CODLANCAMENTO,"
                    + "CODCLIENTE,"
                    + "DESCRICAO,"
                    + "DATALANCAMENTO,"
                    + "DATAVENCIMENTO,"
                    + "DATAPAGAMENTO,"
                    + "VALOR,"
                    + "CODTIPOPAGAMENTO,"
                    + "OBSERVACAO,"
                    + "CODTIPOLANCAMENTO,"
                    + "CODSTATUSLANCAMENTO"
                    + "FROM"
                    + " TBL_LANCAMENTO"
                    + " WHERE"
                    + " CODLANCAMENTO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                cliente.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                lancamento.setCliente(cliente);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(3));
                lancamento.setDataLancamento(this.getResultSet().getString(4));
                lancamento.setDataVencimento(this.getResultSet().getString(5));
                lancamento.setDataPagamento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                tipoPagamento.setCodTipoPagamento((this.getResultSet().getInt(8)));
                lancamento.setTipoPagamento(tipoPagamento);
                lancamento.setObservacao(this.getResultSet().getString(9));
                lancamento.setCodTipoLancamento(this.getResultSet().getInt(10));
                lancamento.setCodStatusLancamento(this.getResultSet().getInt(11));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return lancamento;
    }

    public Lancamento getLancamentoDAO(String nome) {
        Lancamento lancamento = new Lancamento();
        Cliente cliente = new Cliente();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.executarSQL(
                    "SELECT "
                    + "CODLANCAMENTO,"
                    + "CODCLIENTE,"
                    + "DESCRICAO,"
                    + "DATALANCAMENTO,"
                    + "DATAVENCIMENTO,"
                    + "DATAPAGAMENTO,"
                    + "VALOR,"
                    + "CODTIPOPAGAMENTO,"
                    + "OBSERVACAO,"
                    + "CODTIPOLANCAMENTO,"
                    + "CODSTATUSLANCAMENTO"
                    + "FROM"
                    + " TBL_LANCAMENTO"
                    + " WHERE"
                    + " DESCRICAO = '" + nome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                cliente.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                lancamento.setCliente(cliente);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(3));
                lancamento.setDataLancamento(this.getResultSet().getString(4));
                lancamento.setDataVencimento(this.getResultSet().getString(5));
                lancamento.setDataPagamento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                tipoPagamento.setCodTipoPagamento((this.getResultSet().getInt(8)));
                lancamento.setTipoPagamento(tipoPagamento);
                lancamento.setObservacao(this.getResultSet().getString(9));
                lancamento.setCodTipoLancamento(this.getResultSet().getInt(10));
                lancamento.setCodStatusLancamento(this.getResultSet().getInt(11));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return lancamento;
    }

    public ArrayList<Lancamento> getListaLancamentoAReceberAbertoDAO() {
        ArrayList<Lancamento> listaLancamentoAReceberAberto = new ArrayList();
        Lancamento lancamento = new Lancamento();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.VALOR"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " TBL_LANCAMENTO WHERE CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2 "
                    + ";"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Cliente cliente = new Cliente();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                cliente.setCodigo(this.getResultSet().getInt(3));
                cliente.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setCliente(cliente);
                lancamento.setDataLancamento(this.getResultSet().getString(5));
                lancamento.setDataVencimento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                listaLancamentoAReceberAberto.add(lancamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaLancamentoAReceberAberto;
    }
    
    public ArrayList<Lancamento> getListaLancamentoAReceberBaixadosDAO() {
        ArrayList<Lancamento> listaLancamentoAReceberBaixado = new ArrayList();
        Lancamento lancamento = new Lancamento();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL,"
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.VALOR"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 1 "
                    + ";"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Cliente cliente = new Cliente();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                cliente.setCodigo(this.getResultSet().getInt(3));
                cliente.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setCliente(cliente);
                lancamento.setDataLancamento(this.getResultSet().getString(5));
                lancamento.setDataVencimento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                listaLancamentoAReceberBaixado.add(lancamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaLancamentoAReceberBaixado;
    }

    public boolean atualizarLancamentoDAO(Lancamento lancamento) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_LANCAMENTO SET "
                    + "CODCLIENTE = '" + lancamento.getCliente().getCodigo()+ "',"
                    + "DESCRICAO = '" + lancamento.getDescricaoLancamento()+ "',"
                    + "DATALANCAMENTO = '" + lancamento.getDataLancamento()+ "',"
                    + "DATAVENCIMENTO = '" + lancamento.getDataVencimento()+ "',"
                    + "DATAPAGAMENTO = '" + lancamento.getDataPagamento()+ "',"
                    + "VALOR = '" + lancamento.getDataPagamento()+ "',"
                    + "CODTIPOPAGAMENTO = '" + lancamento.getTipoPagamento().getCodTipoPagamento()+ "',"
                    + "OBSERVACAO = '"+ lancamento.getObservacao()+ "'"
                    + "WHERE "
                    + "CODLANCAMENTO = '" + lancamento.getCodLancamento()+ "'"
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

    public boolean excluirLancamentoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_LANCAMENTO "
                    + "WHERE CODLANCAMENTO = '" + codigo + "'"
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
