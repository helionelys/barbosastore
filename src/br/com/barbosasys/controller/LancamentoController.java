package br.com.barbosasys.controller;

import br.com.barbosasys.dao.LancamentoDAO;
import br.com.barbosasys.model.Lancamento;
import java.util.ArrayList;

public class LancamentoController {

    private LancamentoDAO lancamentoDAO = new LancamentoDAO();

    public int salvarLancamentoController(Lancamento Lancamento) {
        return this.lancamentoDAO.salvarLancamentoDAO(Lancamento);
    }

    public Lancamento getLancamentoController(int codigo) {
        return this.lancamentoDAO.getLancamentoDAO(codigo);
    }

    public Lancamento getLancamentoController(String nome) {
        return this.lancamentoDAO.getLancamentoDAO(nome);
    }

    public ArrayList<Lancamento> getListaLancamentoAReceberAbertoController() {
        return this.lancamentoDAO.getListaLancamentoAReceberAbertoDAO();
    }

    public ArrayList<Lancamento> getListaLancamentoAReceberBaixadoController() {
        return this.lancamentoDAO.getListaLancamentoAReceberBaixadosDAO();
    }

    public boolean atualizarLancamentoController(Lancamento Lancamento) {
        return this.lancamentoDAO.atualizarLancamentoDAO(Lancamento);
    }

    public boolean excluirLancamentoController(int codigo) {
        return this.lancamentoDAO.excluirLancamentoDAO(codigo);
    }
}
