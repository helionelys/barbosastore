package br.com.barbosasys.controller;

import br.com.barbosasys.dao.LancamentoDAO;
import br.com.barbosasys.model.Lancamento;
import java.util.ArrayList;

public class LancamentoController {

    private LancamentoDAO lancamentoDAO = new LancamentoDAO();

    public int salvarLancamentoControllerAPagar(Lancamento Lancamento) {
        return this.lancamentoDAO.salvarLancamentoAPagarDAO(Lancamento);
    }
    
    public int salvarLancamentoControllerAReceber(Lancamento Lancamento) {
        return this.lancamentoDAO.salvarLancamentoAReceberDAO(Lancamento);
    }

    public Lancamento getLancamentoControllerAPagar(int codigo) {
        return this.lancamentoDAO.getLancamentoaAPagarDAO(codigo);
    }
    
    public Lancamento getLancamentoControllerAReceber(int codigo) {
        return this.lancamentoDAO.getLancamentoaAReceberDAO(codigo);
    }

    public Lancamento getLancamentoControllerAPagar(String nome) {
        return this.lancamentoDAO.getLancamentoAPagarDAO(nome);
    }
    
    public Lancamento getLancamentoControllerAReceber(String nome) {
        return this.lancamentoDAO.getLancamentoAReceberDAO(nome);
    }

    public ArrayList<Lancamento> getListaLancamentoAReceberAbertoController() {
        return this.lancamentoDAO.getListaLancamentoAReceberAbertoDAO();
    }

    public ArrayList<Lancamento> getListaLancamentoAReceberBaixadoController() {
        return this.lancamentoDAO.getListaLancamentoAReceberBaixadosDAO();
    }
    
    public ArrayList<Lancamento> getListaLancamentoAPagarAbertoController() {
        return this.lancamentoDAO.getListaLancamentoAPagarAbertoDAO();
    }

    public ArrayList<Lancamento> getListaLancamentoAPagarBaixadoController() {
        return this.lancamentoDAO.getListaLancamentoAPagarBaixadosDAO();
    }
    
    public ArrayList<Lancamento> getListaLancamentosAbertos() {
        return this.lancamentoDAO.getListaLancamentoAbertosDAO();
    }

    public boolean atualizarLancamentoControllerAPagar(Lancamento Lancamento) {
        return this.lancamentoDAO.atualizarLancamentoAPagarDAO(Lancamento);
    }
    
    public boolean atualizarLancamentoControllerAReceber(Lancamento Lancamento) {
        return this.lancamentoDAO.atualizarLancamentoAReceberDAO(Lancamento);
    }
    
    public boolean baixarLancamentoController(Lancamento Lancamento) {
        return this.lancamentoDAO.baixarLancamentoAbertoDAO(Lancamento);
    }
    
    public boolean revogarLancamentoController(int codigo) {
        return this.lancamentoDAO.revogarLancamentoBaixadoDAO(codigo);
    }

    public boolean excluirLancamentoController(int codigo) {
        return this.lancamentoDAO.excluirLancamentoDAO(codigo);
    }
}
