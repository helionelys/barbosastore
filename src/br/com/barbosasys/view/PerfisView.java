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
public class PerfisView extends javax.swing.JDialog {

    CategoriaProduto categoriaProduto = new CategoriaProduto();
    CategoriaProdutoController categoriaProdutoController = new CategoriaProdutoController();
    ArrayList<CategoriaProduto> listaCategoriaProduto = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form BuscaClientes
     */
    public PerfisView(java.awt.Frame parent, boolean modal) {
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
        jTabbedPaneCadPerfisUsuarios = new javax.swing.JTabbedPane();
        jpConsultarCadPerfisUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarLoginCadUsuarios = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadUsuarios = new javax.swing.JTable();
        cbxInativosUndMedida = new javax.swing.JCheckBox();
        btnPesquisarLoginCadUsuarios = new javax.swing.JButton();
        btnIncluirCadUsuarios = new javax.swing.JButton();
        btnAlterarCadUsuarios = new javax.swing.JButton();
        btnExcluirCadUsuarios = new javax.swing.JButton();
        btnSairCadUsuarios = new javax.swing.JButton();
        jpCadastrarCadPerfisUsuarios = new javax.swing.JPanel();
        txtNomePerfisUsuarios = new javax.swing.JTextField();
        txtCodigoCadPerfisUsuarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarCadPerfisUsuarios = new javax.swing.JButton();
        btnFecharCadPerfisUsuarios = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDescricaoCadPerfisUsuarios = new javax.swing.JTextField();
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

        jpConsultarCadPerfisUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel1.setText("Descrição:");

        tblCadUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Login", "Funcionário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCadUsuarios);

        cbxInativosUndMedida.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        cbxInativosUndMedida.setText("Exibir Inativos");

        btnPesquisarLoginCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnPesquisarLoginCadUsuarios.setText("Buscar");

        btnIncluirCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnIncluirCadUsuarios.setText("Incluir");
        btnIncluirCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCadUsuariosActionPerformed(evt);
            }
        });

        btnAlterarCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnAlterarCadUsuarios.setText("Alterar");
        btnAlterarCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCadUsuariosActionPerformed(evt);
            }
        });

        btnExcluirCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        btnExcluirCadUsuarios.setText("Excluir");
        btnExcluirCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadUsuariosActionPerformed(evt);
            }
        });

        btnSairCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/sair.png"))); // NOI18N
        btnSairCadUsuarios.setText("Sair");
        btnSairCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultarCadPerfisUsuariosLayout = new javax.swing.GroupLayout(jpConsultarCadPerfisUsuarios);
        jpConsultarCadPerfisUsuarios.setLayout(jpConsultarCadPerfisUsuariosLayout);
        jpConsultarCadPerfisUsuariosLayout.setHorizontalGroup(
            jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCadPerfisUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConsultarCadPerfisUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarLoginCadUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultarCadPerfisUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxInativosUndMedida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCadPerfisUsuariosLayout.createSequentialGroup()
                                .addComponent(btnIncluirCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSairCadUsuarios)))))
                .addContainerGap())
        );

        jpConsultarCadPerfisUsuariosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarCadUsuarios, btnExcluirCadUsuarios, btnIncluirCadUsuarios, btnSairCadUsuarios});

        jpConsultarCadPerfisUsuariosLayout.setVerticalGroup(
            jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarCadPerfisUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarLoginCadUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxInativosUndMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairCadUsuarios)
                    .addComponent(btnExcluirCadUsuarios)
                    .addComponent(btnAlterarCadUsuarios)
                    .addComponent(btnIncluirCadUsuarios))
                .addContainerGap())
        );

        jTabbedPaneCadPerfisUsuarios.addTab("Consultar", jpConsultarCadPerfisUsuarios);

        txtNomePerfisUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCodigoCadPerfisUsuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigoCadPerfisUsuarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Nome:");

        btnSalvarCadPerfisUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarCadPerfisUsuarios.setText("Salvar");
        btnSalvarCadPerfisUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadPerfisUsuariosActionPerformed(evt);
            }
        });

        btnFecharCadPerfisUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnFecharCadPerfisUsuarios.setText("Cancelar");
        btnFecharCadPerfisUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadPerfisUsuariosActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo:");

        jLabel9.setText("Descrição:");

        javax.swing.GroupLayout jpCadastrarCadPerfisUsuariosLayout = new javax.swing.GroupLayout(jpCadastrarCadPerfisUsuarios);
        jpCadastrarCadPerfisUsuarios.setLayout(jpCadastrarCadPerfisUsuariosLayout);
        jpCadastrarCadPerfisUsuariosLayout.setHorizontalGroup(
            jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCadPerfisUsuariosLayout.createSequentialGroup()
                .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarCadPerfisUsuariosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePerfisUsuarios)
                            .addGroup(jpCadastrarCadPerfisUsuariosLayout.createSequentialGroup()
                                .addComponent(txtCodigoCadPerfisUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDescricaoCadPerfisUsuarios)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarCadPerfisUsuariosLayout.createSequentialGroup()
                        .addGap(0, 264, Short.MAX_VALUE)
                        .addComponent(btnSalvarCadPerfisUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharCadPerfisUsuarios)))
                .addContainerGap())
        );
        jpCadastrarCadPerfisUsuariosLayout.setVerticalGroup(
            jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCadPerfisUsuariosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCadPerfisUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePerfisUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDescricaoCadPerfisUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jpCadastrarCadPerfisUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadPerfisUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFecharCadPerfisUsuarios))
                .addGap(403, 403, 403))
        );

        jTabbedPaneCadPerfisUsuarios.addTab("Cadastrar", jpCadastrarCadPerfisUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCadPerfisUsuarios)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCadPerfisUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnIncluirCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCadUsuariosActionPerformed
        // TODO add your handling code here:
        incluirCategoriaProduto();
        txtCodigoCadPerfisUsuarios.setEditable(false);
    }//GEN-LAST:event_btnIncluirCadUsuariosActionPerformed

    private void btnExcluirCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadUsuariosActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linha = tblCadUsuarios.getSelectedRow();
            String descricao = (String) tblCadUsuarios.getValueAt(linha, 1);
            int codigo = (int) tblCadUsuarios.getValueAt(linha, 0);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir o registro:\n" + descricao + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (categoriaProdutoController.excluirCategoriaProdutoController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                    incluirCategoriaProduto();
                    carregarCategoriaProduto();
                    jTabbedPaneCadPerfisUsuarios.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnExcluirCadUsuariosActionPerformed

    private void btnSairCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadUsuariosActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairCadUsuariosActionPerformed

    private void btnFecharCadPerfisUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadPerfisUsuariosActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFecharCadPerfisUsuariosActionPerformed

    private void btnSalvarCadPerfisUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadPerfisUsuariosActionPerformed
        // TODO add your handling code here:
        if (txtNomePerfisUsuarios.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário atribuir uma descricao a unidade de medida");
            txtNomePerfisUsuarios.grabFocus();
        } else if (tipoCadastro.equals("novo")) {
            salvarCategoriaProduto();

        } else if (tipoCadastro.equals("alteracao")) {
            alterarCategoriaProduto();
        }
    }//GEN-LAST:event_btnSalvarCadPerfisUsuariosActionPerformed

    private void btnAlterarCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCadUsuariosActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            recuperaCategoriaProduto();
            tipoCadastro = "alteracao";
            txtCodigoCadPerfisUsuarios.setEditable(false);

        }
    }//GEN-LAST:event_btnAlterarCadUsuariosActionPerformed

    private void carregarCategoriaProduto() {
        listaCategoriaProduto = categoriaProdutoController.getListaCategoriaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) tblCadUsuarios.getModel();
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
        int linhaTabela = this.tblCadUsuarios.getSelectedRow();
        //Captura valor código da unidade da linha selecionada
        int codigo = (Integer) tblCadUsuarios.getValueAt(linhaTabela, 0);
        jTabbedPaneCadPerfisUsuarios.setSelectedIndex(1);

        try {
            categoriaProduto = categoriaProdutoController.getCategoriaProdutoController(codigo);
            this.txtCodigoCadPerfisUsuarios.setText(String.valueOf(categoriaProduto.getCodigo()));
            this.txtNomePerfisUsuarios.setText(categoriaProduto.getDescricao());

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean testarSelecao() {
        int selecao = tblCadUsuarios.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;
    }

    private void incluirCategoriaProduto() {
        jTabbedPaneCadPerfisUsuarios.setSelectedIndex(1);
        txtCodigoCadPerfisUsuarios.setText("novo");
        txtNomePerfisUsuarios.setText(null);
        tipoCadastro = "novo";
    }

    private boolean alterarCategoriaProduto() {
        categoriaProduto.setCodigo((Integer.parseInt(this.txtCodigoCadPerfisUsuarios.getText())));
        categoriaProduto.setDescricao(this.txtNomePerfisUsuarios.getText());

        if (categoriaProdutoController.atualizarCategoriaProdutoController(categoriaProduto)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCadPerfisUsuarios.setSelectedIndex(0);

            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean salvarCategoriaProduto() {
        categoriaProduto.setDescricao(this.txtNomePerfisUsuarios.getText());

        if (categoriaProdutoController.salvarCategoriaProdutoController(categoriaProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCadPerfisUsuarios.setSelectedIndex(0);
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
    private javax.swing.JButton btnAlterarCadUsuarios;
    private javax.swing.JButton btnExcluirCadUsuarios;
    private javax.swing.JButton btnFecharCadPerfisUsuarios;
    private javax.swing.JButton btnIncluirCadUsuarios;
    private javax.swing.JButton btnPesquisarLoginCadUsuarios;
    private javax.swing.JButton btnSairCadUsuarios;
    private javax.swing.JButton btnSalvarCadPerfisUsuarios;
    private javax.swing.JCheckBox cbxInativosUndMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneCadPerfisUsuarios;
    private javax.swing.JPanel jpCadastrarCadPerfisUsuarios;
    private javax.swing.JPanel jpConsultarCadPerfisUsuarios;
    private javax.swing.JTable tblCadUsuarios;
    private javax.swing.JTextField txtCodigoCadPerfisUsuarios;
    private javax.swing.JTextField txtDescricaoCadPerfisUsuarios;
    private javax.swing.JTextField txtNomePerfisUsuarios;
    private javax.swing.JTextField txtPesquisarLoginCadUsuarios;
    // End of variables declaration//GEN-END:variables
}
