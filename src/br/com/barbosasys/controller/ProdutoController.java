package br.com.barbosasys.controller;

import br.com.barbosasys.dao.ProdutoDAO;
import br.com.barbosasys.model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public int salvarProdutoController(Produto produto) {
        return this.produtoDAO.salvarProdutoDAO(produto);
    }
    
    public Produto getProdutoController(int codigo){
        return this.produtoDAO.getProdutoDAO(codigo);
    }
    
    public Produto getProdutoController(String nome){
        return this.produtoDAO.getProdutoDAO(nome);
    }
    
    public ArrayList<Produto> getListaProdutoController(){
        return this.produtoDAO.getListaProdutoDAO();
    }
    
    public boolean atualizarProdutoController(Produto produto){
        return this.produtoDAO.atualizarProdutoDAO(produto);
    }
    
    public boolean excluirProdutoController(int codigo){
        return this.produtoDAO.excluirProdutoDAO(codigo);
    }
}
