package br.com.barbosasys.controller;

import br.com.barbosasys.model.Caixa;
import br.com.barbosasys.dao.CaixaDAO;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class CaixaController {
    private CaixaDAO caixaDAO = new CaixaDAO();
    
    
    public int salvarCaixaController(Caixa caixa){
        return this.caixaDAO.salvarCaixaDAO(caixa);
    }
    
    public Caixa getCaixaController(int codigo){
        return this.caixaDAO.getCaixaDAO(codigo);
    }
    
    public ArrayList<Caixa> getListaCaixaController(){
        return this.caixaDAO.getListaCaixaDAO();
    }
    
    public boolean atualizarCaixaController(Caixa caixa){
        return this.caixaDAO.atualizarCaixaDAO(caixa);
    }
    
    public boolean excluirCaixaController(int codigo){
        return this.caixaDAO.excluirCaixaDAO(codigo);
    }
}
