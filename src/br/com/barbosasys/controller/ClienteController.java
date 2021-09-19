package br.com.barbosasys.controller;

import br.com.barbosasys.dao.ClienteDAO;
import br.com.barbosasys.model.Cliente;
import java.util.ArrayList;
import br.com.barbosasys.dao.RelatoriosDAO;

public class ClienteController {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private RelatoriosDAO relatoriosDAO = new RelatoriosDAO();

    public int salvarClienteController(Cliente cliente) {
        return this.clienteDAO.salvarClienteDAO(cliente);
    }
    
    public Cliente getClienteController(int codigo){
        return this.clienteDAO.getClienteDAO(codigo);
    }
    
    public Cliente getClienteControllerSimples(int codigo){
        return this.clienteDAO.getClienteSimplesDAO(codigo);
    }
    
    public Cliente getClienteControllerCpfCnpj(String cpfCnpj){
        return this.clienteDAO.getClienteDAONomeRazaoSocial(cpfCnpj);
    }
    public Cliente getClienteController(String nome){
        return this.clienteDAO.getClienteDAO(nome);
    }
    public boolean getClienteCpfCnpjontroller(String cpfCnpj){
        return this.clienteDAO.getClienteBuscarCfpCnpjDAO(cpfCnpj);
    }
    
    public ArrayList<Cliente> getListaClienteController(){
        return this.clienteDAO.getListaClienteDAO();
    }
    
    public boolean atualizarClienteController(Cliente cliente){
        return this.clienteDAO.atualizarClienteDAO(cliente);
    }
    
    public boolean excluirClienteController(int codigo){
        return this.clienteDAO.excluirClienteDAO(codigo);
    }
    
    public boolean gerarRelatorioCliente(){
        return this.relatoriosDAO.gerarRelatorioCliente();
    }
}
