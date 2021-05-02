/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.controller;

import br.com.barbosasys.dao.CompraDAO;
import br.com.barbosasys.model.Item;
import br.com.barbosasys.model.Compra;
import java.util.ArrayList;

/**
 *
 * @author helionelys
 */
public class CompraController {
    
    private CompraDAO compraDAO = new CompraDAO();
    
    public int SalvarCompraController(Compra compra){
        return this.compraDAO.salvarComprasDAO(compra);
    }
    
    public Compra getCompraController(int codigo){
        return this.compraDAO.getCompraDAO(codigo);
    }
    
    public ArrayList<Compra> getListaCompraController(){
        return this.compraDAO.getListaCompraDAO();
    }
    
    public ArrayList<Compra> getListaCompraStatusAguardandoController(){
        return this.compraDAO.getListaCompraStatusAguardandoDAO();
    }
    
    public ArrayList<Item> getListaItensCompraController(int codigo){
        return this.compraDAO.getListaItensCompraDAO(codigo);
    }
    
    public boolean atualizarComprasController(Compra compra){
        return this.compraDAO.atualizarCompraDAO(compra);
    }
    
    public boolean atualizarItensComprasController(Item itemCompra){
        return this.compraDAO.salvarItensComprasUpdateDAO(itemCompra);
    }
    
    public boolean atualizarComprasAutorizacaoController(Compra compra){
        return this.compraDAO.atualizarCompraAprovacaoDAO(compra);
    }
    
    public boolean excluirCompraController(int codigo){
        return this.compraDAO.excluirCompraDAO(codigo);
    }
    
    public boolean excluirItensCompraController(int codigo){
        return this.compraDAO.excluirItensComprasDAO(codigo);
    }
    
    public boolean salvarItensCompraController(Item itemCompra){
        return this.compraDAO.salvarItensComprasDAO(itemCompra);
    }
    
    public int getUltimaCompraDAO(){
        return this.compraDAO.getUltimaCompraDAO();
    }
}
