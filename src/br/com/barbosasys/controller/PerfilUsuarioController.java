package br.com.barbosasys.controller;

import br.com.barbosasys.dao.PerfilUsuarioDAO;
import br.com.barbosasys.model.PerfilUsuario;
import java.util.ArrayList;

public class PerfilUsuarioController {

    private PerfilUsuarioDAO perfilUsuarioDAO = new PerfilUsuarioDAO();

    public ArrayList<PerfilUsuario> getListaPerfilUsuarioController() {
        return this.perfilUsuarioDAO.getListaPerfilUsuarioDAO();
    }

}
