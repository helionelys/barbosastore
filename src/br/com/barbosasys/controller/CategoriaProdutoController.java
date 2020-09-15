package br.com.barbosasys.controller;

import br.com.barbosasys.dao.CategoriaProdutoDAO;
import br.com.barbosasys.model.CategoriaProduto;
import java.util.ArrayList;

public class CategoriaProdutoController {

    private CategoriaProdutoDAO categoriaProdutoDAO = new CategoriaProdutoDAO();

    public int salvarCategoriaProdutoController(CategoriaProduto categoriaProduto) {
        return this.categoriaProdutoDAO.salvarCategoriaProdutoDAO(categoriaProduto);
    }
    
    public CategoriaProduto getCategoriaProdutoController(int codigo){
        return this.categoriaProdutoDAO.getCategoriaProdutoDAO(codigo);
    }
    
    public CategoriaProduto getCategoriaProdutoController(String nome){
        return this.categoriaProdutoDAO.getCategoriaProdutoDAO(nome);
    }
    
    public ArrayList<CategoriaProduto> getListaCategoriaProdutoController(){
        return this.categoriaProdutoDAO.getListaCategoriaProdutoDAO();
    }
    
    public boolean atualizarCategoriaProdutoController(CategoriaProduto categoriaProduto){
        return this.categoriaProdutoDAO.atualizarCategoriaProdutoDAO(categoriaProduto);
    }
    
    public boolean excluirCategoriaProdutoController(int codigo){
        return this.categoriaProdutoDAO.excluirCategoriaProdutoDAO(codigo);
    }
}
