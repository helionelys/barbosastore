package br.com.barbosasys.controller;

import br.com.barbosasys.dao.UsuarioDAO;
import br.com.barbosasys.model.Usuario;
import java.util.ArrayList;

public class UsuarioController {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    //1
    public int salvarUsuarioController(Usuario usuario) {
        return this.usuarioDAO.salvarUsuarioDAO(usuario);
    }
    
    //2
    public Usuario getUsuarioController(int codigo){
        return this.usuarioDAO.getUsuarioDAO(codigo);
    }
    
    //3
    public Usuario getUsuarioController(String login){
        return this.usuarioDAO.getUsuarioDAO(login);
    } 
    
    //4
    public boolean getUsuarioController(Usuario usuario){
        return this.usuarioDAO.getUsuarioDAO(usuario);
    }
    
    public ArrayList<Usuario> getListaUsuarioController(){
        return this.usuarioDAO.getListaUsuarioDAO();
    }
    
    public boolean atualizarUsuarioController(Usuario usuario){
        return this.usuarioDAO.atualizarUsuarioDAO(usuario);
    }
    
    public boolean excluirUsuarioController(int codigo){
        return this.usuarioDAO.excluirUsuarioDAO(codigo);
    }
}
