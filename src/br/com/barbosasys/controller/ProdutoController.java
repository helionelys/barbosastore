package br.com.barbosasys.controller;

import br.com.barbosasys.dao.ProdutoDAO;
import br.com.barbosasys.dao.RelatoriosDAO;
import br.com.barbosasys.model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private RelatoriosDAO relatoriosDAO = new RelatoriosDAO();

    public int salvarProdutoController(Produto produto) {
        return this.produtoDAO.salvarProdutoDAO(produto);
    }

    public Produto getProdutoController(int codigo) {
        return this.produtoDAO.getProdutoDAO(codigo);
    }

    public Produto getProdutoControllerCodigoVenda(int codigo) {
        return this.produtoDAO.getProdutoDAO(codigo);
    }

    public Produto getProdutoControllerSimples(int codigo) {
        return this.produtoDAO.getProdutoSimplesDAO(codigo);
    }

    public int getProdutoControllerVendaQuantidadeEstoque(int codigo) {
        return this.produtoDAO.getProdutoVendaQuantidadeEstoqueDAO(codigo);
    }

    public Produto getProdutoControllerCompraSimples(int codigo) {
        return this.produtoDAO.getProdutoCompraSimplesDAO(codigo);
    }

    public Produto getProdutoController(String nome) {
        return this.produtoDAO.getProdutoDAO(nome);
    }

    public ArrayList<Produto> getListaProdutoController() {
        return this.produtoDAO.getListaProdutoDAO();
    }

    public ArrayList<Produto> getListaProdutoControllerSimples() {
        return this.produtoDAO.getListaProdutoSimplesDAO();
    }

    public ArrayList<Produto> getListaProdutoControllerCompraSimples() {
        return this.produtoDAO.getListaProdutoSimplesComprasDAO();
    }

    public boolean atualizarProdutoController(Produto produto) {
        return this.produtoDAO.atualizarProdutoDAO(produto);
    }

    public boolean atualizarProdutoEstoqueController(Produto produto) {
        return this.produtoDAO.atualizarEstoqueProduto(produto);
    }

    public boolean atualizarProdutoCompraVendaEstoqueController(Produto produto) {
        return this.produtoDAO.atualizarCompraVendaEstoqueProduto(produto);
    }

    public boolean excluirProdutoController(int codigo) {
        return this.produtoDAO.excluirProdutoDAO(codigo);
    }

    public boolean gerarRelatorioProduto() {
        return this.relatoriosDAO.gerarRelatorioProduto();
    }
    
    public boolean gerarRelatorioProdutoSaldoEstoque(){
        return this.relatoriosDAO.gerarRelatorioProdutoSaldoEstoque();
    }
}
