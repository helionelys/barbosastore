package br.com.barbosasys.controller;

import br.com.barbosasys.dao.UnidadeMedidaDAO;
import br.com.barbosasys.model.UnidadeMedida;
import java.util.ArrayList;

public class UnidadeMedidaController {

    private UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();

    public int salvarUnidadeMedidaController(UnidadeMedida unidadeMedida) {
        return this.unidadeMedidaDAO.salvarUnidadeMedidaDAO(unidadeMedida);
    }
    
    public UnidadeMedida getUnidadeMedidaController(int codigo){
        return this.unidadeMedidaDAO.getUnidadeMedidaDAO(codigo);
    }
    
    public UnidadeMedida getUnidadeMedidaController(String nome){
        return this.unidadeMedidaDAO.getUnidadeMedidaDAO(nome);
    }
    
    public ArrayList<UnidadeMedida> getListaUnidadeMedidaController(){
        return this.unidadeMedidaDAO.getListaUnidadeMedidaDAO();
    }
    
    public boolean atualizarUnidadeMedidaController(UnidadeMedida unidadeMedida){
        return this.unidadeMedidaDAO.atualizarUnidadeMedidaDAO(unidadeMedida);
    }
    
    public boolean excluirUnidadeMedidaController(int codigo){
        return this.unidadeMedidaDAO.excluirUnidadeMedidaDAO(codigo);
    }
}
