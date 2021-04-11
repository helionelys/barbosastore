
package br.com.barbosasys.controller;

import br.com.barbosasys.model.TipoPagamento;
import br.com.barbosasys.dao.TipoPagamentoDAO;
import java.util.ArrayList;
/**
 *
 * @author helionelys
 */
public class TipoPagamentoController {
    private TipoPagamentoDAO tipoPagamentoDAO = new TipoPagamentoDAO();
    
    public int salvarTipoPagamentoController(TipoPagamento tipoPagamento){
        return this.tipoPagamentoDAO.salvarTipoPagamentoDAO(tipoPagamento);
    }
    
    public TipoPagamento getTipoPagamentController(int codigo){
        return this.tipoPagamentoDAO.getTipoPagamentoDAO(codigo);
    }
    
     public TipoPagamento getTipoPagamentoController(String nome){
        return this.tipoPagamentoDAO.getTipoPagamentoDAO(nome);
    }
     
    public ArrayList<TipoPagamento> getListaTipoPagamentoController(){
        return this.tipoPagamentoDAO.getListaTipoPagamentoDAO();
    }
    
    public boolean atualizarTipoPagamentoController(TipoPagamento tipoPagamento){
        return this.tipoPagamentoDAO.atualizarTipoPagamentoDAO(tipoPagamento);
    }
    
    public boolean excluirTipoPagamentoController(int codigo){
        return this.tipoPagamentoDAO.excluirTipoPagamentoDAO(codigo);
    }
}
