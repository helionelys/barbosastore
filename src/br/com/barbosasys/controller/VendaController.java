/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.controller;

import br.com.barbosasys.dao.VendaDAO;
import br.com.barbosasys.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class VendaController {
    
    private VendaDAO vendaDAO = new VendaDAO();
    
    public int SalvarVendaController(Venda venda){
        return this.vendaDAO.salvarVendasDAO(venda);
    }
    
    public Venda getVendaController(int codigo){
        return this.vendaDAO.getVendaDAO(codigo);
    }
    
    public ArrayList<Venda> getListaVendaController(){
        return this.vendaDAO.getListaVendaDAO();
    }
    
    public ArrayList<Venda> getListaVendaController(int codigo){
        return this.vendaDAO.getListaVendaDAO(codigo);
    }
    
    public boolean atualizarVendasController(Venda venda){
        return this.vendaDAO.atualizarVendaDAO(venda);
    }
    
    public boolean excluirVendaController(int codigo){
        return this.vendaDAO.excluirVendaDAO(codigo);
    }
    
    public boolean salvarItensVendaController(Venda venda){
        return this.vendaDAO.salvarItensVendasDAO(venda);
    }
}
