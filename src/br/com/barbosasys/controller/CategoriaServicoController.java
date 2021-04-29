package br.com.barbosasys.controller;

import br.com.barbosasys.dao.CategoriaServicoDAO;
import br.com.barbosasys.model.CategoriaServico;
import java.util.ArrayList;

public class CategoriaServicoController {

    private CategoriaServicoDAO categoriaServicoDAO = new CategoriaServicoDAO();

    public int salvarCategoriaServicoController(CategoriaServico categoriaServico) {
        return this.categoriaServicoDAO.salvarCategoriaServicoDAO(categoriaServico);
    }
    
    public CategoriaServico getCategoriaServicoController(int codigo){
        return this.categoriaServicoDAO.getCategoriaServicoDAO(codigo);
    }
    
    public CategoriaServico getCategoriaServicoController(String nome){
        return this.categoriaServicoDAO.getCategoriaServicoDAO(nome);
    }
    
    public ArrayList<CategoriaServico> getListaCategoriaServicoController(){
        return this.categoriaServicoDAO.getListaCategoriaServicoDAO();
    }
    
    public boolean atualizarCategoriaServicoController(CategoriaServico categoriaServico){
        return this.categoriaServicoDAO.atualizarCategoriaServicoDAO(categoriaServico);
    }
    
    public boolean excluirCategoriaServicoController(int codigo){
        return this.categoriaServicoDAO.excluirCategoriaServicoDAO(codigo);
    }
}
