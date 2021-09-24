/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.dao;

import br.com.barbosasys.jdbc.ConexaoBanco;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.Lancamento;
import br.com.barbosasys.model.Pessoa;
import br.com.barbosasys.model.TipoPagamento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author hbarbosa
 */
public class LancamentoDAO extends ConexaoBanco {

    // Inserir lancamento dentro banco de dados
    public int salvarLancamentoAPagarDAO(Lancamento lancamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_LANCAMENTO ("
                    + "CODFORNECEDOR,"
                    + "DESCRICAO,"
                    + "DATALANCAMENTO,"
                    + "DATAVENCIMENTO,"
                    //+ "DATAPAGAMENTO,"
                    + "VALOR,"
                    + "CODTIPOPAGAMENTO,"
                    + "OBSERVACAO,"
                    + "CODTIPOLANCAMENTO,"
                    + "CODSTATUSLANCAMENTO"
                    + ") VALUES ("
                    + "'" + lancamento.getPessoa().getCodigo()+ "',"
                    + "'" + lancamento.getDescricaoLancamento() + "',"
                    + "'" + lancamento.getDataLancamento() + "',"
                    + "'" + lancamento.getDataVencimento() + "',"
                    //+ "'" + lancamento.getDataPagamento() + "',"
                    + "'" + lancamento.getValorLancamento() + "',"
                    + "'" + lancamento.getCodTipoPagamento() + "',"
                    + "'" + lancamento.getObservacao() + "',"
                    + "'" + lancamento.getCodTipoLancamento() + "',"
                    + "'" + lancamento.getCodStatusLancamento() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    public int salvarLancamentoAReceberDAO(Lancamento lancamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO TBL_LANCAMENTO ("
                    + "CODCLIENTE,"
                    + "DESCRICAO,"
                    + "DATALANCAMENTO,"
                    + "DATAVENCIMENTO,"
                   // + "DATAPAGAMENTO,"
                    + "VALOR,"
                    + "CODTIPOPAGAMENTO,"
                    + "OBSERVACAO,"
                    + "CODTIPOLANCAMENTO,"
                    + "CODSTATUSLANCAMENTO"
                    + ") VALUES ("
                    + "'" + lancamento.getPessoa().getCodigo()+ "',"
                    + "'" + lancamento.getDescricaoLancamento() + "',"
                    + "'" + lancamento.getDataLancamento() + "',"
                    + "'" + lancamento.getDataVencimento() + "',"
                    //+ "'" + lancamento.getDataPagamento() + "',"
                    + "'" + lancamento.getValorLancamento() + "',"
                    + "'" + lancamento.getCodTipoPagamento() + "',"
                    + "'" + lancamento.getObservacao() + "',"
                    + "'" + lancamento.getCodTipoLancamento() + "',"
                    + "'" + lancamento.getCodStatusLancamento() + "'"
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
    public Lancamento getLancamentoaAPagarDAO(int codigo) {
        Lancamento lancamento = new Lancamento();
        Pessoa pessoa = new Pessoa();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    //+ "CODCLIENTE,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL,"        
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.DATAPAGAMENTO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_LANCAMENTO.CODTIPOPAGAMENTO,"
                    + "TBL_LANCAMENTO.OBSERVACAO,"
                    + "TBL_LANCAMENTO.CODTIPOLANCAMENTO,"
                    + "TBL_LANCAMENTO.CODSTATUSLANCAMENTO"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"        
                    + " WHERE"
                    + " TBL_LANCAMENTO.CODLANCAMENTO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                pessoa.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(3));
                lancamento.setPessoa(pessoa);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(4));
                lancamento.setDataLancamento(this.getResultSet().getString(5));
                lancamento.setDataVencimento(this.getResultSet().getString(6));
                lancamento.setDataPagamento(this.getResultSet().getString(7));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(8)));
                lancamento.setCodTipoPagamento((this.getResultSet().getInt(9)));
                lancamento.setObservacao(this.getResultSet().getString(10));
                lancamento.setCodTipoLancamento(this.getResultSet().getInt(11));
                lancamento.setCodStatusLancamento(this.getResultSet().getInt(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return lancamento;
    }

    public Lancamento getLancamentoaAReceberDAO(int codigo) {
        Lancamento lancamento = new Lancamento();
        Pessoa pessoa = new Pessoa();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    //+ "CODCLIENTE,"
                    + "TBL_LANCAMENTO.CODCLIENTE,"
                    + "TBL_CLIENTE.NOME_RAZAOSOCIAL,"  
                    + "TBL_LANCAMENTO.DESCRICAO,"        
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.DATAPAGAMENTO,"
                    + "TBL_LANCAMENTO.VALOR,"
                    + "TBL_LANCAMENTO.CODTIPOPAGAMENTO,"
                    + "TBL_LANCAMENTO.OBSERVACAO,"
                    + "TBL_LANCAMENTO.CODTIPOLANCAMENTO,"
                    + "TBL_LANCAMENTO.CODSTATUSLANCAMENTO"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"        
                    + " WHERE"
                    + " TBL_LANCAMENTO.CODLANCAMENTO = '" + codigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {

                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                pessoa.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(3));
                lancamento.setPessoa(pessoa);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(4));
                lancamento.setDataLancamento(this.getResultSet().getString(5));
                lancamento.setDataVencimento(this.getResultSet().getString(6));
                lancamento.setDataPagamento(this.getResultSet().getString(7));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(8)));
                lancamento.setCodTipoPagamento((this.getResultSet().getInt(9)));
                lancamento.setObservacao(this.getResultSet().getString(10));
                lancamento.setCodTipoLancamento(this.getResultSet().getInt(11));
                lancamento.setCodStatusLancamento(this.getResultSet().getInt(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return lancamento;
    }
    
    public Lancamento getLancamentoAPagarDAO(String nome) {
        Lancamento lancamento = new Lancamento();
        Pessoa pessoa = new Pessoa();
        TipoPagamento tipoPagamento = new TipoPagamento();
        try {
            this.executarSQL(
                    "SELECT "
                    + "CODLANCAMENTO,"
                    + "CODFORNECEDOR,"
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
                pessoa.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                lancamento.setPessoa(pessoa);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(3));
                lancamento.setDataLancamento(this.getResultSet().getString(4));
                lancamento.setDataVencimento(this.getResultSet().getString(5));
                lancamento.setDataPagamento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                lancamento.setCodTipoPagamento((this.getResultSet().getInt(8)));
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
    
    public Lancamento getLancamentoAReceberDAO(String nome) {
        Lancamento lancamento = new Lancamento();
        Pessoa pessoa = new Pessoa();
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
                pessoa.setCodigo(Integer.parseInt(this.getResultSet().getString(2)));
                lancamento.setPessoa(pessoa);
                lancamento.setDescricaoLancamento(this.getResultSet().getString(3));
                lancamento.setDataLancamento(this.getResultSet().getString(4));
                lancamento.setDataVencimento(this.getResultSet().getString(5));
                lancamento.setDataPagamento(this.getResultSet().getString(6));
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                lancamento.setCodTipoPagamento((this.getResultSet().getInt(8)));
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
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 1 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2 "
                    + "ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Pessoa pessoa = new Pessoa();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                pessoa.setCodigo(this.getResultSet().getInt(3));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setPessoa(pessoa);
                String dataRetorno = (this.getResultSet().getString(5));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataLancamentoFormatada = localDate.format(formatter2);
                lancamento.setDataLancamento(dataLancamentoFormatada);
                
                String dataRetorno2 = (this.getResultSet().getString(6));
                DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
                String dataLancamentoFormatada2 = localDate2.format(formatter4);
                lancamento.setDataVencimento(dataLancamentoFormatada2);
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
                    + "ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Pessoa pessoa = new Pessoa();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                pessoa.setCodigo(this.getResultSet().getInt(3));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setPessoa(pessoa);
                String dataRetorno = (this.getResultSet().getString(5));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataLancamentoFormatada = localDate.format(formatter2);
                lancamento.setDataLancamento(dataLancamentoFormatada);
                
                String dataRetorno2 = (this.getResultSet().getString(6));
                DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
                String dataLancamentoFormatada2 = localDate2.format(formatter4);
                lancamento.setDataVencimento(dataLancamentoFormatada2);
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

    public boolean atualizarLancamentoAPagarDAO(Lancamento lancamento) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_LANCAMENTO SET "
                    + "CODFORNECEDOR = '" + lancamento.getPessoa().getCodigo()+ "',"
                    + "DESCRICAO = '" + lancamento.getDescricaoLancamento()+ "',"
                    //+ "DATALANCAMENTO = '" + lancamento.getDataLancamento()+ "',"
                    + "DATAVENCIMENTO = '" + lancamento.getDataVencimento()+ "',"
                    //+ "DATAPAGAMENTO = '" + lancamento.getDataPagamento()+ "',"
                    + "VALOR = '" + lancamento.getValorLancamento()+ "',"
                    + "CODTIPOPAGAMENTO = '" + lancamento.getCodTipoPagamento()+ "',"
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
    
        public boolean atualizarLancamentoAReceberDAO(Lancamento lancamento) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_LANCAMENTO SET "
                    + "CODCLIENTE = '" + lancamento.getPessoa().getCodigo()+ "',"
                    + "DESCRICAO = '" + lancamento.getDescricaoLancamento()+ "',"
                   // + "DATALANCAMENTO = '" + lancamento.getDataLancamento()+ "',"
                    + "DATAVENCIMENTO = '" + lancamento.getDataVencimento()+ "',"
                    //+ "DATAPAGAMENTO = '" + lancamento.getDataPagamento()+ "',"
                    + "VALOR = '" + lancamento.getValorLancamento()+ "',"
                    + "CODTIPOPAGAMENTO = '" + lancamento.getCodTipoPagamento()+ "',"
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
    
    public ArrayList<Lancamento> getListaLancamentoAPagarBaixadosDAO() {
        ArrayList<Lancamento> listaLancamentoAPagarBaixado = new ArrayList();
        Lancamento lancamento = new Lancamento();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL,"
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.VALOR"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 2 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 1 "
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Pessoa pessoa = new Pessoa();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                pessoa.setCodigo(this.getResultSet().getInt(3));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setPessoa(pessoa);
                
                String dataRetorno = (this.getResultSet().getString(5));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataLancamentoFormatada = localDate.format(formatter2);
                lancamento.setDataLancamento(dataLancamentoFormatada);
                
                String dataRetorno2 = (this.getResultSet().getString(6));
                DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
                String dataLancamentoFormatada2 = localDate2.format(formatter4);
                lancamento.setDataVencimento(dataLancamentoFormatada2);
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                listaLancamentoAPagarBaixado.add(lancamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaLancamentoAPagarBaixado;
    }
    
    public ArrayList<Lancamento> getListaLancamentoAbertosDAO() {
        ArrayList<Lancamento> listaLancamentoAPagarBaixado = new ArrayList();
        Lancamento lancamento = new Lancamento();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO," //1
                    + "TBL_LANCAMENTO.DESCRICAO," //2
                    + "COALESCE(TBL_LANCAMENTO.CODCLIENTE,TBL_LANCAMENTO.CODFORNECEDOR) AS CODCLIFOR," //3
                    + "COALESCE(TBL_FORNECEDOR.NOME_RAZAOSOCIAL,TBL_CLIENTE.NOME_RAZAOSOCIAL) AS CLIENTEFORNECEDOR," //4
                    + "TBL_LANCAMENTO.DATALANCAMENTO," //5
                    + "TBL_LANCAMENTO.DATAVENCIMENTO," //6
                    + "TBL_LANCAMENTO.VALOR," //7
                    + "TBL_LANCAMENTOTIPO.DESCRICAO" // 8
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " LEFT JOIN TBL_CLIENTE"
                    + " ON TBL_LANCAMENTO.CODCLIENTE = TBL_CLIENTE.CODCLIENTE"
                    + " LEFT JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_LANCAMENTOTIPO"
                    + " ON TBL_LANCAMENTO.CODTIPOLANCAMENTO = TBL_LANCAMENTOTIPO.CODTIPOLANCAMENTO"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 1 "
                    + " ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Pessoa pessoa = new Pessoa();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                pessoa.setCodigo(this.getResultSet().getInt(3));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setPessoa(pessoa);
                
                String dataRetorno = (this.getResultSet().getString(5));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataLancamentoFormatada = localDate.format(formatter2);
                lancamento.setDataLancamento(dataLancamentoFormatada);
                
                String dataRetorno2 = (this.getResultSet().getString(6));
                DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
                String dataLancamentoFormatada2 = localDate2.format(formatter4);
                lancamento.setDataVencimento(dataLancamentoFormatada2);
                
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                lancamento.setDescricaoTipoLancamento(this.getResultSet().getString(8));
                listaLancamentoAPagarBaixado.add(lancamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaLancamentoAPagarBaixado;
    }
    
    public ArrayList<Lancamento> getListaLancamentoAPagarAbertoDAO() {
        ArrayList<Lancamento> listaLancamentoAPagarAberto = new ArrayList();
        Lancamento lancamento = new Lancamento();

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "TBL_LANCAMENTO.CODLANCAMENTO,"
                    + "TBL_LANCAMENTO.DESCRICAO,"
                    + "TBL_LANCAMENTO.CODFORNECEDOR,"
                    + "TBL_FORNECEDOR.NOME_RAZAOSOCIAL,"
                    + "TBL_LANCAMENTO.DATALANCAMENTO,"
                    + "TBL_LANCAMENTO.DATAVENCIMENTO,"
                    + "TBL_LANCAMENTO.VALOR"
                    + " FROM"
                    + " TBL_LANCAMENTO"
                    + " INNER JOIN TBL_FORNECEDOR"
                    + " ON TBL_LANCAMENTO.CODFORNECEDOR = TBL_FORNECEDOR.CODFORNECEDOR"
                    + " INNER JOIN TBL_STATUSLANCAMENTO"
                    + " ON TBL_LANCAMENTO.CODSTATUSLANCAMENTO = TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO"
                    + " WHERE TBL_LANCAMENTO.CODTIPOLANCAMENTO = 2 AND TBL_STATUSLANCAMENTO.CODSTATUSLANCAMENTO = 2 "
                    + "ORDER BY TBL_LANCAMENTO.CODLANCAMENTO DESC;"
            );

            while (this.getResultSet().next()) {
                lancamento = new Lancamento();
                Pessoa pessoa = new Pessoa();
                lancamento.setCodLancamento(this.getResultSet().getInt(1));
                lancamento.setDescricaoLancamento(this.getResultSet().getString(2));
                pessoa.setCodigo(this.getResultSet().getInt(3));
                pessoa.setNomeRazaoSocial(this.getResultSet().getString(4));
                lancamento.setPessoa(pessoa);
                
                String dataRetorno = (this.getResultSet().getString(5));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
                String dataLancamentoFormatada = localDate.format(formatter2);
                lancamento.setDataLancamento(dataLancamentoFormatada);
                
                String dataRetorno2 = (this.getResultSet().getString(6));
                DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
                String dataLancamentoFormatada2 = localDate2.format(formatter4);
                lancamento.setDataVencimento(dataLancamentoFormatada2);
                
                lancamento.setValorLancamento(Double.parseDouble(this.getResultSet().getString(7)));
                listaLancamentoAPagarAberto.add(lancamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaLancamentoAPagarAberto;
    }

    public boolean excluirLancamentoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "DELETE FROM TBL_LANCAMENTO "
                    + "WHERE CODSTATUSLANCAMENTO = 2 AND CODLANCAMENTO = '" + codigo + "'"
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
    
        public boolean baixarLancamentoAbertoDAO(Lancamento lancamento) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_LANCAMENTO SET "
                    + "CODSTATUSLANCAMENTO = '1',"
                    + "DATAPAGAMENTO = '" + lancamento.getDataPagamento()+ "'"
                    + " WHERE CODLANCAMENTO = '" + lancamento.getCodLancamento() + "'"
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
        
        public boolean revogarLancamentoBaixadoDAO(int codigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE TBL_LANCAMENTO SET "
                    + "CODSTATUSLANCAMENTO = '2'"
                    + " WHERE CODLANCAMENTO = '" + codigo + "'"
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
