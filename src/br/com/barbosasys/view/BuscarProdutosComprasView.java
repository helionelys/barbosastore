/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.ProdutoController;
import br.com.barbosasys.model.Produto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helionelys
 */
public class BuscarProdutosComprasView extends javax.swing.JDialog {
    
     //Variavel para armazemar Código e Nome do perfil do usuario
    private int codigoProduto;
    private String descricaoProduto;
    private String valorProdutoFormatado;
    private Double valorProdutoCompra;
    
    Produto produto = new Produto();
    ProdutoController produtoController = new ProdutoController();
    ArrayList<Produto> listProduto = new ArrayList<>();
    DecimalFormat valoresMonentarios = new DecimalFormat("#,##0.00");
    String tipoCadastro;

    /**
     * Creates new form BuscaProdutos
     */
    public BuscarProdutosComprasView(ComprasView owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.carregarProdutos();
    }

//    BuscaProduto() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarProdutos = new javax.swing.JTextField();
        btnProdutoSelecionar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store -  Produto Compras");

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor de Compra", "Valor de Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setMinWidth(60);
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(1).setMinWidth(240);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(240);
            tblProdutos.getColumnModel().getColumn(1).setMaxWidth(240);
            tblProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            tblProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel1.setText("Descrição:");

        btnProdutoSelecionar.setText("Selecionar");
        btnProdutoSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProdutoSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutoSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoSelecionarActionPerformed
        // TODO add your handling code here:
        recuperarProduto();
        this.dispose();
    }//GEN-LAST:event_btnProdutoSelecionarActionPerformed
    
    private boolean recuperarProduto(){
        
       //Armazena a linha selecionada
       int linhaTabela = this.tblProdutos.getSelectedRow();
       
       //Captura valor código do funcionário da linha selecionada
       int codigo = (Integer) tblProdutos.getValueAt(linhaTabela, 0);
       
        try {
        //retorna os dados do banco de dados
        produto = produtoController.getProdutoControllerCompraSimples(codigo);
        this.codigoProduto = Integer.valueOf(produto.getCodProduto());
        this.descricaoProduto = (produto.getDescricao());
        this.valorProdutoCompra = Double.valueOf(produto.getValorCompra());
        Double valorRetorno = (produto.getValorCompra());
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorTela = df.format(valorRetorno);
        this.valorProdutoFormatado = valorTela;
        
        return true;
        } catch (Exception e) {
            return false;
        }
    }    
    
    private void carregarProdutos() {
        listProduto = produtoController.getListaProdutoControllerCompraSimples();
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listProduto.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listProduto.get(i).getCodProduto(),
                listProduto.get(i).getDescricao(),
                valoresMonentarios.format(listProduto.get(i).getValorCompra()),
                valoresMonentarios.format(listProduto.get(i).getValor()),
            });
        }
    }
    
    


    /**
     * @param args the command line arguments
     */

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public Double getValorProdutoCompra(){
        return valorProdutoCompra;
    }
    
    public void setValorProduto(Double valorProdutoCompra){
        this.valorProdutoCompra = valorProdutoCompra;
    }
    
    public String getValorProdutoFormatado(){
        return valorProdutoFormatado;
    }
    
    public void valorProdutoFormatado(String valorProdutoCompra){
        this.valorProdutoFormatado = valorProdutoFormatado;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProdutoSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisarProdutos;
    // End of variables declaration//GEN-END:variables
}
