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
public class UsuariosView extends javax.swing.JDialog {

    CategoriaProduto categoriaProduto = new CategoriaProduto();
    CategoriaProdutoController categoriaProdutoController = new CategoriaProdutoController();
    ArrayList<CategoriaProduto> listaCategoriaProduto = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form BuscaClientes
     */
    public UsuariosView(java.awt.Frame parent, boolean modal) {
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
        jTabbedPaneCadUsuarios = new javax.swing.JTabbedPane();
        jpConsultarCadUsuarios = new javax.swing.JPanel();
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
        jpCadastrarCadUsuarios = new javax.swing.JPanel();
        txtNomeFuncionarioCadUsuarios = new javax.swing.JTextField();
        txtCodigoCadUsuarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarCadUsuarios = new javax.swing.JButton();
        btnFecharCadUsuarios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtLoginCadUsuarios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenhaCadUsuarios = new javax.swing.JTextField();
        btnBucarNomeFuncionarioCadUsuarios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtConfirmarSenhaCadUsuarios = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbPerfilCadUsuarios = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Usuários");

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

        jpConsultarCadUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jpConsultarCadUsuariosLayout = new javax.swing.GroupLayout(jpConsultarCadUsuarios);
        jpConsultarCadUsuarios.setLayout(jpConsultarCadUsuariosLayout);
        jpConsultarCadUsuariosLayout.setHorizontalGroup(
            jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCadUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConsultarCadUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarLoginCadUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultarCadUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxInativosUndMedida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarCadUsuariosLayout.createSequentialGroup()
                                .addComponent(btnIncluirCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSairCadUsuarios)))))
                .addContainerGap())
        );

        jpConsultarCadUsuariosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarCadUsuarios, btnExcluirCadUsuarios, btnIncluirCadUsuarios, btnSairCadUsuarios});

        jpConsultarCadUsuariosLayout.setVerticalGroup(
            jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarCadUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarLoginCadUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxInativosUndMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairCadUsuarios)
                    .addComponent(btnExcluirCadUsuarios)
                    .addComponent(btnAlterarCadUsuarios)
                    .addComponent(btnIncluirCadUsuarios))
                .addContainerGap())
        );

        jTabbedPaneCadUsuarios.addTab("Consultar", jpConsultarCadUsuarios);

        txtNomeFuncionarioCadUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCodigoCadUsuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigoCadUsuarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Funcionario:");

        btnSalvarCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarCadUsuarios.setText("Salvar");
        btnSalvarCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadUsuariosActionPerformed(evt);
            }
        });

        btnFecharCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnFecharCadUsuarios.setText("Cancelar");
        btnFecharCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadUsuariosActionPerformed(evt);
            }
        });

        jLabel4.setText("Login:");

        txtLoginCadUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setText("Senha:");

        txtSenhaCadUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnBucarNomeFuncionarioCadUsuarios.setText("Buscar");

        jLabel6.setText("Confirme Senha:");

        txtConfirmarSenhaCadUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setText("Codigo:");

        jLabel8.setText("Perfil de Segurança:");

        cbPerfilCadUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jpCadastrarCadUsuariosLayout = new javax.swing.GroupLayout(jpCadastrarCadUsuarios);
        jpCadastrarCadUsuarios.setLayout(jpCadastrarCadUsuariosLayout);
        jpCadastrarCadUsuariosLayout.setHorizontalGroup(
            jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))
                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                        .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeFuncionarioCadUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBucarNomeFuncionarioCadUsuarios))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenhaCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtConfirmarSenhaCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPerfilCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(129, 129, 129)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastrarCadUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarCadUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCadUsuarios)
                .addContainerGap())
        );
        jpCadastrarCadUsuariosLayout.setVerticalGroup(
            jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarCadUsuariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBucarNomeFuncionarioCadUsuarios)
                    .addComponent(txtNomeFuncionarioCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtConfirmarSenhaCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbPerfilCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpCadastrarCadUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFecharCadUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(460, 460, 460))
        );

        jTabbedPaneCadUsuarios.addTab("Cadastrar", jpCadastrarCadUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCadUsuarios)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        txtCodigoCadUsuarios.setEditable(false);
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
                    jTabbedPaneCadUsuarios.setSelectedIndex(0);

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

    private void btnFecharCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadUsuariosActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFecharCadUsuariosActionPerformed

    private void btnSalvarCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadUsuariosActionPerformed
        // TODO add your handling code here:
        if (txtNomeFuncionarioCadUsuarios.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário atribuir uma descricao a unidade de medida");
            txtNomeFuncionarioCadUsuarios.grabFocus();
        } else if (tipoCadastro.equals("novo")) {
            salvarCategoriaProduto();

        } else if (tipoCadastro.equals("alteracao")) {
            alterarCategoriaProduto();
        }
    }//GEN-LAST:event_btnSalvarCadUsuariosActionPerformed

    private void btnAlterarCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCadUsuariosActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            recuperaCategoriaProduto();
            tipoCadastro = "alteracao";
            txtCodigoCadUsuarios.setEditable(false);

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
        jTabbedPaneCadUsuarios.setSelectedIndex(1);

        try {
            categoriaProduto = categoriaProdutoController.getCategoriaProdutoController(codigo);
            this.txtCodigoCadUsuarios.setText(String.valueOf(categoriaProduto.getCodigo()));
            this.txtNomeFuncionarioCadUsuarios.setText(categoriaProduto.getDescricao());

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
        jTabbedPaneCadUsuarios.setSelectedIndex(1);
        txtCodigoCadUsuarios.setText("novo");
        txtNomeFuncionarioCadUsuarios.setText(null);
        tipoCadastro = "novo";
    }

    private boolean alterarCategoriaProduto() {
        categoriaProduto.setCodigo((Integer.parseInt(this.txtCodigoCadUsuarios.getText())));
        categoriaProduto.setDescricao(this.txtNomeFuncionarioCadUsuarios.getText());

        if (categoriaProdutoController.atualizarCategoriaProdutoController(categoriaProduto)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCadUsuarios.setSelectedIndex(0);

            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean salvarCategoriaProduto() {
        categoriaProduto.setDescricao(this.txtNomeFuncionarioCadUsuarios.getText());

        if (categoriaProdutoController.salvarCategoriaProdutoController(categoriaProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            this.incluirCategoriaProduto();
            this.carregarCategoriaProduto();
            jTabbedPaneCadUsuarios.setSelectedIndex(0);
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
    private javax.swing.JButton btnBucarNomeFuncionarioCadUsuarios;
    private javax.swing.JButton btnExcluirCadUsuarios;
    private javax.swing.JButton btnFecharCadUsuarios;
    private javax.swing.JButton btnIncluirCadUsuarios;
    private javax.swing.JButton btnPesquisarLoginCadUsuarios;
    private javax.swing.JButton btnSairCadUsuarios;
    private javax.swing.JButton btnSalvarCadUsuarios;
    private javax.swing.JComboBox<String> cbPerfilCadUsuarios;
    private javax.swing.JCheckBox cbxInativosUndMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneCadUsuarios;
    private javax.swing.JPanel jpCadastrarCadUsuarios;
    private javax.swing.JPanel jpConsultarCadUsuarios;
    private javax.swing.JTable tblCadUsuarios;
    private javax.swing.JTextField txtCodigoCadUsuarios;
    private javax.swing.JTextField txtConfirmarSenhaCadUsuarios;
    private javax.swing.JTextField txtLoginCadUsuarios;
    private javax.swing.JTextField txtNomeFuncionarioCadUsuarios;
    private javax.swing.JTextField txtPesquisarLoginCadUsuarios;
    private javax.swing.JTextField txtSenhaCadUsuarios;
    // End of variables declaration//GEN-END:variables
}