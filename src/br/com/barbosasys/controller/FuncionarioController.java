package br.com.barbosasys.controller;

import br.com.barbosasys.dao.FuncionarioDAO;
import br.com.barbosasys.model.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {

    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public int salvarFuncionarioController(Funcionario funcionario) {
        return this.funcionarioDAO.salvarFuncionarioDAO(funcionario);
    }
    
    public Funcionario getFuncionarioController(int codigo){
        return this.funcionarioDAO.getFuncionarioDAO(codigo);
    }
    
    public Funcionario getFuncionarioControllerSimples(int codigo){
        return this.funcionarioDAO.getFuncionarioSimplesDAO(codigo);
    }
    
    public Funcionario getFuncionarioController(String nome){
        return this.funcionarioDAO.getFuncionarioDAO(nome);
    }
    
    public ArrayList<Funcionario> getListaFuncionarioController(){
        return this.funcionarioDAO.getListaFuncionarioDAO();
    }
    
    public boolean atualizarFuncionarioController(Funcionario funcionario){
        return this.funcionarioDAO.atualizarFuncionarioDAO(funcionario);
    }
    
    public boolean excluirFuncionarioController(int codigo){
        return this.funcionarioDAO.excluirFuncionarioDAO(codigo);
    }
}
