/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.CategoriaProdutoController;
import br.com.barbosasys.model.CategoriaProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helionelys
 */
public class CategoriaProdutoView extends javax.swing.JDialog {

    CategoriaProduto categoriaProduto = new CategoriaProduto();
    CategoriaProdutoController categoriaProdutoController = new CategoriaProdutoController();
    ArrayList<CategoriaProduto> listaCategoriaProduto = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form BuscaClientes
     */
    public CategoriaProdutoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarCategoriaProduto();
    }

//    BuscaCliente() {
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
        jTabbedPaneCategoriaProduto = new javax.swing.JTabbedPane();
        jpConsultarCategoriaProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarDescricaoCategoriaProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoriaProduto = new javax.swing.JTable();
        cbxInativosUndMedida = new javax.swing.JCheckBox();
        btnPesquisarDescricaoCategoriaProduto = new javax.swing.JButton();
        btnIncluirCategoriaProduto = new javax.swing.JButton();
        btnAlterarCategoriaProduto = new javax.swing.JButton();
        btnExcluirCategoriaProduto = new javax.swing.JButton();
        btnSairCategoriaProduto = new javax.swing.JButton();
        jpCadastrarCategoriaProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoCategoriaProduto = new javax.swing.JTextField();
        txtCodCategoriaProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarCategoriaProduto = new javax.swing.JButton();
        btnFecharCategoriaProduto = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Categoria de Produtos");

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

        jpConsultarCategoriaProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel1.setText("Descrição:");

        tblCategoriaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCategoriaProduto);
        if (tblCategoriaProduto.getColumnModel().getColumnCount() > 0) {
            tblCategoriaProduto.getColumnModel().getColumn(0).setMinWidth(80);
            tblCategoriaProduto.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblCategoriaProduto.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        cbxInativosUndMedida.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        cbxInativosUndMedida.setText("Exibir Inativos");

        btnPesquisarDescricaoCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnPesquisarDescricaoCategoriaProduto.setText("Buscar");

        btnIncluirCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnIncluirCategoriaProduto.setText("Incluir");
        btnIncluirCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCategoriaProdutoActionPerformed(evt);
            }
        });

        btnAlterarCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnAlterarCategoriaProduto.setText("Alterar");
        btnAlterarCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCategoriaProdutoActionPerformed(evt);
            }
        });

        btnExcluirCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        btnExcluirCategoriaProduto.setText("Excluir");
        btnExcluirCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCategoriaProdutoActionPerformed(evt);
            }
        });

        btnSairCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/sair.png"))); // NOI18N
        btnSairCategoriaProduto.setText("Sair");
        btnSairCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCategoriaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultarCategoriaProdutoLayout = new javax.swing.GroupLayout(jpConsultarCategoriaProduto);
        jpConsultarCategoriaProduto.setLayout(jpConsultarCategoriaProdutoLayout);
        jpConsultarCategoriaProdutoLayout.setHorizontalGroup(
            jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCategoriaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConsultarCategoriaProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarDescricaoCategoriaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarDescricaoCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultarCategoriaProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxInativosUndMedida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCategoriaProdutoLayout.createSequentialGroup()
                                .addComponent(btnIncluirCategoriaProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarCategoriaProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirCategoriaProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSairCategoriaProduto)))))
                .addContainerGap())
        );

        jpConsultarCategoriaProdutoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarCategoriaProduto, btnExcluirCategoriaProduto, btnIncluirCategoriaProduto, btnSairCategoriaProduto});

        jpConsultarCategoriaProdutoLayout.setVerticalGroup(
            jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarCategoriaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarDescricaoCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarDescricaoCategoriaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxInativosUndMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairCategoriaProduto)
                    .addComponent(btnExcluirCategoriaProduto)
                    .addComponent(btnAlterarCategoriaProduto)
                    .addComponent(btnIncluirCategoriaProduto))
                .addContainerGap())
        );

        jTabbedPaneCategoriaProduto.addTab("Consultar", jpConsultarCategoriaProduto);

        jLabel2.setText("Código:");

        txtDescricaoCategoriaProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCodCategoriaProduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodCategoriaProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Descrição");

        btnSalvarCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarCategoriaProduto.setText("Salvar");
        btnSalvarCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCategoriaProdutoActionPerformed(evt);
            }
        });

        btnFecharCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnFecharCategoriaProduto.setText("Fechar");
        btnFecharCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCategoriaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCadastrarCategoriaProdutoLayout = new javax.swing.GroupLayout(jpCadastrarCategoriaProduto);
        jpCadastrarCategoriaProduto.setLayout(jpCadastrarCategoriaProdutoLayout);
        jpCadastrarCategoriaProdutoLayout.setHorizontalGroup(
            jpCadastrarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCategoriaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastrarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricaoCategoriaProduto)
                    .addGroup(jpCadastrarCategoriaProdutoLayout.createSequentialGroup()
                        .addGroup(jpCadastrarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarCategoriaProdutoLayout.createSequentialGroup()
                        .addGap(0, 231, Short.MAX_VALUE)
                        .addComponent(btnSalvarCategoriaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecharCategoriaProduto)))
                .addContainerGap())
        );
        jpCadastrarCategoriaProdutoLayout.setVerticalGroup(
            jpCadastrarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCategoriaProdutoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jpCadastrarCategoriaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );

        jTabbedPaneCategoriaProduto.addTab("Cadastrar", jpCadastrarCategoriaProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCategoriaProduto)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        incluirCategoriaProduto();
        txtCodCategoriaProduto.setEditable(false);
    }//GEN-LAST:event_btnIncluirCategoriaProdutoActionPerformed

    private void btnExcluirCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linha = tblCategoriaProduto.getSelectedRow();
            String descricao = (String) tblCategoriaProduto.getValueAt(linha, 1);
            int codigo = (int) tblCategoriaProduto.getValueAt(linha, 0);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir o registro:\n" + descricao + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (categoriaProdutoController.excluirCategoriaProdutoController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                    incluirCategoriaProduto();
                    carregarCategoriaProduto();
                    jTabbedPaneCategoriaProduto.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnExcluirCategoriaProdutoActionPerformed

    private void btnSairCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairCategoriaProdutoActionPerformed

    private void btnFecharCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFecharCategoriaProdutoActionPerformed

    private void btnSalvarCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        if (txtDescricaoCategoriaProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário atribuir uma descricao a unidade de medida");
            txtDescricaoCategoriaProduto.grabFocus();
        } else if (tipoCadastro.equals("novo")) {
            salvarCategoriaProduto();

        } else if (tipoCadastro.equals("alteracao")) {
            alterarCategoriaProduto();
        }
    }//GEN-LAST:event_btnSalvarCategoriaProdutoActionPerformed

    private void btnAlterarCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCategoriaProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            recuperaCategoriaProduto();
            tipoCadastro = "alteracao";
            txtCodCategoriaProduto.setEditable(false);

        }
    }//GEN-LAST:event_btnAlterarCategoriaProdutoActionPerformed

    private void carregarCategoriaProduto() {
        listaCategoriaProduto = categoriaProdutoController.getListaCategoriaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) tblCategoriaProduto.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaCategoriaProduto.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaCategoriaProduto.get(i).getCodigo(),
                listaCategoriaProduto.get(i).getDescricao()
            });
        }
    }

    private boolean recuperaCategoriaProduto() {
        //Armazena a linha selecionada
        int linhaTabela = this.tblCategoriaProduto.getSelectedRow();
        //Captura valor código da unidade da linha selecionada
        int codigo = (Integer) tblCategoriaProduto.getValueAt(linhaTabela, 0);
        jTabbedPaneCategoriaProduto.setSelectedIndex(1);

        try {
            categoriaProduto = categoriaProdutoController.getCategoriaProdutoController(codigo);
            this.txtCodCategoriaProduto.setText(String.valueOf(categoriaProduto.getCodigo()));
            this.txtDescricaoCategoriaProduto.setText(categoriaProduto.getDescricao());

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean testarSelecao() {
        int selecao = tblCategoriaProduto.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;
    }

    private void incluirCategoriaProduto() {
        jTabbedPaneCategoriaProduto.setSelectedIndex(1);
        txtCodCategoriaProduto.setText("novo");
        txtDescricaoCategoriaProduto.setText(null);
        tipoCadastro = "novo";
    }

    private boolean alterarCategoriaProduto() {
        categoriaProduto.setCodigo((Integer.parseInt(this.txtCodCategoriaProduto.getText())));
        categoriaProduto.setDescricao(this.txtDescricaoCategoriaProduto.getText());

        if (categoriaProdutoController.atualizarCategoriaProdutoController(categoriaProduto)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCategoriaProduto.setSelectedIndex(0);

            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean salvarCategoriaProduto() {
        categoriaProduto.setDescricao(this.txtDescricaoCategoriaProduto.getText());

        if (categoriaProdutoController.salvarCategoriaProdutoController(categoriaProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCategoriaProduto.setSelectedIndex(0);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCategoriaProduto;
    private javax.swing.JButton btnExcluirCategoriaProduto;
    private javax.swing.JButton btnFecharCategoriaProduto;
    private javax.swing.JButton btnIncluirCategoriaProduto;
    private javax.swing.JButton btnPesquisarDescricaoCategoriaProduto;
    private javax.swing.JButton btnSairCategoriaProduto;
    private javax.swing.JButton btnSalvarCategoriaProduto;
    private javax.swing.JCheckBox cbxInativosUndMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneCategoriaProduto;
    private javax.swing.JPanel jpCadastrarCategoriaProduto;
    private javax.swing.JPanel jpConsultarCategoriaProduto;
    private javax.swing.JTable tblCategoriaProduto;
    private javax.swing.JTextField txtCodCategoriaProduto;
    private javax.swing.JTextField txtDescricaoCategoriaProduto;
    private javax.swing.JTextField txtPesquisarDescricaoCategoriaProduto;
    // End of variables declaration//GEN-END:variables
}
