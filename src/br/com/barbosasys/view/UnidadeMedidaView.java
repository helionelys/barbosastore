/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.UnidadeMedidaController;
import br.com.barbosasys.model.UnidadeMedida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Helionelys
 */
public class UnidadeMedidaView extends javax.swing.JDialog {

    UnidadeMedida unidadeMedida = new UnidadeMedida();
    UnidadeMedidaController unidadeMedidaController = new UnidadeMedidaController();
    ArrayList<UnidadeMedida> listaUnidadeMedida = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form BuscaClientes
     */
    public UnidadeMedidaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarUnidadeMedida();
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
        jTabbedPaneUnidadeMedida = new javax.swing.JTabbedPane();
        jpConsultarUnidadeMedida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarDescricaoUndMedida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnidadeMedida = new javax.swing.JTable();
        btnIncluirUndMedida = new javax.swing.JButton();
        btnAlterarUndMedida = new javax.swing.JButton();
        btnExcluirUndMedida = new javax.swing.JButton();
        btnSairUndMedida = new javax.swing.JButton();
        jpCadastrarUnidadeMedida = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoUnidadeMedida = new javax.swing.JTextField();
        txtCodUnidadeMedida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarUnidadeMedida = new javax.swing.JButton();
        btnFecharUnidadeMedida = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDescricaoLongaUnidadeMedida = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Unidade de Medida");

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

        jpConsultarUnidadeMedida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel1.setText("Descrição:");

        txtPesquisarDescricaoUndMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarDescricaoUndMedidaKeyReleased(evt);
            }
        });

        tblUnidadeMedida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUnidadeMedida);
        if (tblUnidadeMedida.getColumnModel().getColumnCount() > 0) {
            tblUnidadeMedida.getColumnModel().getColumn(0).setMinWidth(80);
            tblUnidadeMedida.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblUnidadeMedida.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        btnIncluirUndMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnIncluirUndMedida.setText("Incluir");
        btnIncluirUndMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirUndMedidaActionPerformed(evt);
            }
        });

        btnAlterarUndMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnAlterarUndMedida.setText("Alterar");
        btnAlterarUndMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUndMedidaActionPerformed(evt);
            }
        });

        btnExcluirUndMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        btnExcluirUndMedida.setText("Excluir");
        btnExcluirUndMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUndMedidaActionPerformed(evt);
            }
        });

        btnSairUndMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/sair.png"))); // NOI18N
        btnSairUndMedida.setText("Sair");
        btnSairUndMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairUndMedidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultarUnidadeMedidaLayout = new javax.swing.GroupLayout(jpConsultarUnidadeMedida);
        jpConsultarUnidadeMedida.setLayout(jpConsultarUnidadeMedidaLayout);
        jpConsultarUnidadeMedidaLayout.setHorizontalGroup(
            jpConsultarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarUnidadeMedidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConsultarUnidadeMedidaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarDescricaoUndMedida))
                    .addGroup(jpConsultarUnidadeMedidaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIncluirUndMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarUndMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirUndMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSairUndMedida)))
                .addContainerGap())
        );

        jpConsultarUnidadeMedidaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarUndMedida, btnExcluirUndMedida, btnIncluirUndMedida, btnSairUndMedida});

        jpConsultarUnidadeMedidaLayout.setVerticalGroup(
            jpConsultarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarUnidadeMedidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarDescricaoUndMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConsultarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairUndMedida)
                    .addComponent(btnExcluirUndMedida)
                    .addComponent(btnAlterarUndMedida)
                    .addComponent(btnIncluirUndMedida))
                .addContainerGap())
        );

        jTabbedPaneUnidadeMedida.addTab("Consultar", jpConsultarUnidadeMedida);

        jLabel2.setText("Código:");

        txtDescricaoUnidadeMedida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCodUnidadeMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodUnidadeMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Descrição Curta");

        btnSalvarUnidadeMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarUnidadeMedida.setText("Salvar");
        btnSalvarUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUnidadeMedidaActionPerformed(evt);
            }
        });

        btnFecharUnidadeMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnFecharUnidadeMedida.setText("Fechar");
        btnFecharUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharUnidadeMedidaActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição Longa");

        txtDescricaoLongaUnidadeMedida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpCadastrarUnidadeMedidaLayout = new javax.swing.GroupLayout(jpCadastrarUnidadeMedida);
        jpCadastrarUnidadeMedida.setLayout(jpCadastrarUnidadeMedidaLayout);
        jpCadastrarUnidadeMedidaLayout.setHorizontalGroup(
            jpCadastrarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarUnidadeMedidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastrarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarUnidadeMedidaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarUnidadeMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharUnidadeMedida))
                    .addComponent(txtDescricaoLongaUnidadeMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(jpCadastrarUnidadeMedidaLayout.createSequentialGroup()
                        .addGroup(jpCadastrarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescricaoUnidadeMedida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodUnidadeMedida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCadastrarUnidadeMedidaLayout.setVerticalGroup(
            jpCadastrarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarUnidadeMedidaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricaoLongaUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jpCadastrarUnidadeMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUnidadeMedida)
                    .addComponent(btnFecharUnidadeMedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPaneUnidadeMedida.addTab("Cadastrar", jpCadastrarUnidadeMedida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneUnidadeMedida)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnIncluirUndMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirUndMedidaActionPerformed
        // TODO add your handling code here:
        incluirUnidadeMedida();
        txtCodUnidadeMedida.setEditable(false);
    }//GEN-LAST:event_btnIncluirUndMedidaActionPerformed

    private void btnAlterarUndMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUndMedidaActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            recuperaUnidadeMedida();
            tipoCadastro = "alteracao";
            txtCodUnidadeMedida.setEditable(false);
        }
    }//GEN-LAST:event_btnAlterarUndMedidaActionPerformed

    private void btnExcluirUndMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUndMedidaActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linha = tblUnidadeMedida.getSelectedRow();
            String descricao = (String) tblUnidadeMedida.getValueAt(linha, 1);
            int codigo = (int) tblUnidadeMedida.getValueAt(linha, 0);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir o registro:\n" + descricao + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (unidadeMedidaController.excluirUnidadeMedidaController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                    incluirUnidadeMedida();
                    carregarUnidadeMedida();
                    jTabbedPaneUnidadeMedida.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnExcluirUndMedidaActionPerformed

    private void btnSairUndMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairUndMedidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairUndMedidaActionPerformed

    private void btnFecharUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharUnidadeMedidaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFecharUnidadeMedidaActionPerformed

    private void btnSalvarUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUnidadeMedidaActionPerformed
        // TODO add your handling code here:
        if (txtDescricaoUnidadeMedida.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário atribuir uma descricao a unidade de medida");
            txtDescricaoUnidadeMedida.grabFocus();
        } else if (tipoCadastro.equals("novo")) {
            salvarUnidadeMedida();

        } else if (tipoCadastro.equals("alteracao")) {
            alterarUnidadeMedida();
        }
    }//GEN-LAST:event_btnSalvarUnidadeMedidaActionPerformed

    private void txtPesquisarDescricaoUndMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarDescricaoUndMedidaKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dadosPesquisar = (DefaultTableModel) this.tblUnidadeMedida.getModel();
        final TableRowSorter<TableModel> pesquisa = new TableRowSorter<TableModel>(dadosPesquisar);
        this.tblUnidadeMedida.setRowSorter(pesquisa);
        String text = txtPesquisarDescricaoUndMedida.getText();
        pesquisa.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_txtPesquisarDescricaoUndMedidaKeyReleased

    private void carregarUnidadeMedida() {
        listaUnidadeMedida = unidadeMedidaController.getListaUnidadeMedidaController();
        DefaultTableModel modelo = (DefaultTableModel) tblUnidadeMedida.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaUnidadeMedida.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaUnidadeMedida.get(i).getCodigo(),
                listaUnidadeMedida.get(i).getDescricao()
                //listaUnidadeMedida.get(i).getDescricaoCompleta()
            });
        }
    }

    private boolean recuperaUnidadeMedida() {
        //Armazena a linha selecionada
        int linhaTabela = this.tblUnidadeMedida.getSelectedRow();
        //Captura valor código da unidade da linha selecionada
        int codigo = (Integer) tblUnidadeMedida.getValueAt(linhaTabela, 0);
        jTabbedPaneUnidadeMedida.setSelectedIndex(1);

        try {
            unidadeMedida = unidadeMedidaController.getUnidadeMedidaController(codigo);
            this.txtCodUnidadeMedida.setText(String.valueOf(unidadeMedida.getCodigo()));
            this.txtDescricaoUnidadeMedida.setText(unidadeMedida.getDescricao());
            this.txtDescricaoLongaUnidadeMedida.setText(unidadeMedida.getDescricaoCompleta());

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean testarSelecao() {
        int selecao = tblUnidadeMedida.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;
    }

    private void incluirUnidadeMedida() {
        jTabbedPaneUnidadeMedida.setSelectedIndex(1);
        txtCodUnidadeMedida.setText("novo");
        txtDescricaoUnidadeMedida.setText(null);
        txtDescricaoLongaUnidadeMedida.setText(null);
        tipoCadastro = "novo";
    }

    private boolean alterarUnidadeMedida() {
        unidadeMedida.setCodigo((Integer.parseInt(this.txtCodUnidadeMedida.getText())));
        unidadeMedida.setDescricao(this.txtDescricaoUnidadeMedida.getText());
        unidadeMedida.setDescricaoCompleta(this.txtDescricaoLongaUnidadeMedida.getText());
        

        if (unidadeMedidaController.atualizarUnidadeMedidaController(unidadeMedida)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.incluirUnidadeMedida();
            this.carregarUnidadeMedida();
            jTabbedPaneUnidadeMedida.setSelectedIndex(0);

            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean salvarUnidadeMedida() {
        unidadeMedida.setDescricao(this.txtDescricaoUnidadeMedida.getText());

        if (unidadeMedidaController.salvarUnidadeMedidaController(unidadeMedida) > 0) {
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            this.incluirUnidadeMedida();
            this.carregarUnidadeMedida();
            jTabbedPaneUnidadeMedida.setSelectedIndex(0);
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
    private javax.swing.JButton btnAlterarUndMedida;
    private javax.swing.JButton btnExcluirUndMedida;
    private javax.swing.JButton btnFecharUnidadeMedida;
    private javax.swing.JButton btnIncluirUndMedida;
    private javax.swing.JButton btnSairUndMedida;
    private javax.swing.JButton btnSalvarUnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneUnidadeMedida;
    private javax.swing.JPanel jpCadastrarUnidadeMedida;
    private javax.swing.JPanel jpConsultarUnidadeMedida;
    private javax.swing.JTable tblUnidadeMedida;
    private javax.swing.JTextField txtCodUnidadeMedida;
    private javax.swing.JTextField txtDescricaoLongaUnidadeMedida;
    private javax.swing.JTextField txtDescricaoUnidadeMedida;
    private javax.swing.JTextField txtPesquisarDescricaoUndMedida;
    // End of variables declaration//GEN-END:variables
}
