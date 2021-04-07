package br.com.barbosasys.controller;

import br.com.barbosasys.dao.DadosEmpresaDAO;
import br.com.barbosasys.model.DadosEmpresa;
import java.util.ArrayList;

public class DadosEmpresaController {

    private DadosEmpresaDAO dadosEmpresaDAO = new DadosEmpresaDAO();
    
    
    public DadosEmpresa getDadosEmpresaController(int codigos){
        return this.dadosEmpresaDAO.getDadosEmpresaDAO(codigos);
    }
    
    public boolean atualizarDadosEmpresaController(DadosEmpresa fornecedor){
        return this.dadosEmpresaDAO.atualizarDadosEmpresaDAO(fornecedor);
    }
    
}
