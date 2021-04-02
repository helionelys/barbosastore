package br.com.barbosasys.controller;

import br.com.barbosasys.dao.UsuarioDAO;
import br.com.barbosasys.model.Usuario;
import java.util.ArrayList;

public class UsuarioController {

    private UsuarioDAO categoriaProdutoDAO = new UsuarioDAO();

    public int salvarUsuarioController(Usuario categoriaProduto) {
        return this.categoriaProdutoDAO.salvarUsuarioDAO(categoriaProduto);
    }
    
    public Usuario getUsuarioController(int codigo){
        return this.categoriaProdutoDAO.getUsuarioDAO(codigo);
    }
    
    public Usuario getUsuarioController(String nome){
        return this.categoriaProdutoDAO.getUsuarioDAO(nome);
    }
    
    public ArrayList<Usuario> getListaUsuarioController(){
        return this.categoriaProdutoDAO.getListaUsuarioDAO();
    }
    
    public boolean atualizarUsuarioController(Usuario categoriaProduto){
        return this.categoriaProdutoDAO.atualizarUsuarioDAO(categoriaProduto);
    }
    
    public boolean excluirUsuarioController(int codigo){
        return this.categoriaProdutoDAO.excluirUsuarioDAO(codigo);
    }
}
