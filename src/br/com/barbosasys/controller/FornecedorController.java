package br.com.barbosasys.controller;

import br.com.barbosasys.dao.FornecedorDAO;
import br.com.barbosasys.model.Fornecedor;
import java.util.ArrayList;

public class FornecedorController {

    private FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public int salvarFornecedorController(Fornecedor fornecedor) {
        return this.fornecedorDAO.salvarFornecedorDAO(fornecedor);
    }
    
    public Fornecedor getFornecedorController(int codigo){
        return this.fornecedorDAO.getFornecedorDAO(codigo);
    }
    
    public Fornecedor getFornecedorController(String nome){
        return this.fornecedorDAO.getFornecedorDAO(nome);
    }
    
    public ArrayList<Fornecedor> getListaFornecedorController(){
        return this.fornecedorDAO.getListaFornecedorDAO();
    }
    
    public Fornecedor getFornecedorControllerSimples(int codigo){
        return this.fornecedorDAO.getFornecedorSimplesDAO(codigo);
    }
    
    public boolean atualizarFornecedorController(Fornecedor fornecedor){
        return this.fornecedorDAO.atualizarFornecedorDAO(fornecedor);
    }
    
    public boolean excluirFornecedorController(int codigo){
        return this.fornecedorDAO.excluirFornecedorDAO(codigo);
    }
}
