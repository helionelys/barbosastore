package br.com.barbosasys.controller;

import br.com.barbosasys.dao.ServicoDAO;
import br.com.barbosasys.model.Servico;
import java.util.ArrayList;

public class ServicoController {

    private ServicoDAO servicoDAO = new ServicoDAO();

    public int salvarServicoController(Servico servico) {
        return this.servicoDAO.salvarServicoDAO(servico);
    }
    
    public Servico getServicoController(int codigo){
        return this.servicoDAO.getServicoDAO(codigo);
    }
    
    public Servico getServicoController(String nome){
        return this.servicoDAO.getServicoDAO(nome);
    }
    
    public ArrayList<Servico> getListaServicoController(){
        return this.servicoDAO.getListaServicoDAO();
    }
    
    public boolean atualizarServicoController(Servico servico){
        return this.servicoDAO.atualizarServicoDAO(servico);
    }
    
    public boolean excluirServicoController(int codigo){
        return this.servicoDAO.excluirServicoDAO(codigo);
    }
}
