/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.CategoriaProdutoController;
import br.com.barbosasys.controller.ProdutoController;
import br.com.barbosasys.controller.UnidadeMedidaController;
import br.com.barbosasys.model.CategoriaProduto;
import br.com.barbosasys.model.Produto;
import br.com.barbosasys.model.UnidadeMedida;
import java.text.DecimalFormat;

/**
 *
 * @author helionelys
 */
public class EstoqueView extends javax.swing.JDialog {
    
    Produto produto = new Produto();
    CategoriaProduto categoriaProduto = new CategoriaProduto();
    UnidadeMedida unidadeMedida = new UnidadeMedida();
    
    ProdutoController produtoController = new ProdutoController();
    CategoriaProdutoController categoriaProdutoController = new CategoriaProdutoController();
    UnidadeMedidaController unidadeMedidaController = new UnidadeMedidaController();
    
    /**
     * Creates new form EstoqueView
     */
    public EstoqueView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        btnBuscaProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescricaoCategoria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidadeAtual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNovaQuantidade = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDescricaoUniMedida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setText("Código:");

        txtCodProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        btnBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnBuscaProduto.setText("Pesquisar");
        btnBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descricão");

        txtDescricaoProduto.setEditable(false);
        txtDescricaoProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setText("Categoria:");

        txtDescricaoCategoria.setEditable(false);
        txtDescricaoCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Quantidade Atual");

        txtQuantidadeAtual.setEditable(false);
        txtQuantidadeAtual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtQuantidadeAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Atualizar Quantidade");

        txtNovaQuantidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNovaQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        jButton2.setText("Atualizar Saldo");

        jLabel5.setText("Un Medida:");

        txtDescricaoUniMedida.setEditable(false);
        txtDescricaoUniMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("V. Compra:");

        txtValorCompra.setEditable(false);
        txtValorCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setText("Vl. Venda:");

        txtValorVenda.setEditable(false);
        txtValorVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricaoCategoria)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscaProduto))
                            .addComponent(txtDescricaoProduto)
                            .addComponent(txtDescricaoUniMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidadeAtual)
                            .addComponent(txtNovaQuantidade))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescricaoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescricaoUniMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNovaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        // TODO add your handling code here:
        int codigoProduto = Integer.parseInt(this.txtCodProduto.getText());
        produto=produtoController.getProdutoController(codigoProduto);
        
        this.txtDescricaoProduto.setText(produto.getDescricao());
        this.txtDescricaoCategoria.setText(categoriaProdutoController.getCategoriaProdutoController(produto.getCodCategoriaProduto()).getDescricao());
        this.txtDescricaoUniMedida.setText((unidadeMedidaController.getUnidadeMedidaController(produto.getCodUnidadeMedida()).getDescricao()));
        
        Double valorRetorno2 = produto.getValorCompra();
        DecimalFormat df2 = new DecimalFormat("#,##0.00");
        String valorCompraTela = df2.format(valorRetorno2);
        this.txtValorCompra.setText(valorCompraTela);
        
        Double valorRetorno = produto.getValor();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorTela = df.format(valorRetorno);
        this.txtValorVenda.setText(valorTela);
        
        this.txtQuantidadeAtual.setText(String.valueOf(produto.getQuantidade()));
        
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDescricaoCategoria;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtDescricaoUniMedida;
    private javax.swing.JTextField txtNovaQuantidade;
    private javax.swing.JTextField txtQuantidadeAtual;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
