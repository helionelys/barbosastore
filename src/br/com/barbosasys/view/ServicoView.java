/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.CategoriaServicoController;
import br.com.barbosasys.controller.ServicoController;
import br.com.barbosasys.model.CategoriaServico;
import br.com.barbosasys.model.Servico;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hbarbosa
 */
public class ServicoView extends javax.swing.JDialog {

    Servico servico = new Servico();
    CategoriaServico categoriaServico = new CategoriaServico();

    ServicoController servicoController = new ServicoController();
    CategoriaServicoController categoriaServicoController = new CategoriaServicoController();
    ArrayList<Servico> listaServico = new ArrayList<>();
    ArrayList<CategoriaServico> listaCategoriaServico = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form FuncionarioView
     */
    public ServicoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setModal(true);
        this.carregarCategoriaServico();
        this.carregarServicos();
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
        jTabbedPaneServico = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicos = new javax.swing.JTable();
        btnIncluirServico = new javax.swing.JButton();
        btnAlterarServico = new javax.swing.JButton();
        bntExcluirServico = new javax.swing.JButton();
        btnCancelarServicos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoServico = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cbStatusServico = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDataCadastroServico = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        txtDescricaoServico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbCategoriaServico = new javax.swing.JComboBox<>();
        btnSalvarServico = new javax.swing.JButton();
        btnCancelarServico = new javax.swing.JButton();
        txtObservacaoServico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Serviços");
        setBackground(new java.awt.Color(254, 254, 254));

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

        tblServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicos);
        if (tblServicos.getColumnModel().getColumnCount() > 0) {
            tblServicos.getColumnModel().getColumn(0).setMinWidth(80);
            tblServicos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblServicos.getColumnModel().getColumn(0).setMaxWidth(80);
            tblServicos.getColumnModel().getColumn(1).setMinWidth(400);
            tblServicos.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblServicos.getColumnModel().getColumn(1).setMaxWidth(400);
        }

        btnIncluirServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnIncluirServico.setText("Incluir");
        btnIncluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirServicoActionPerformed(evt);
            }
        });

        btnAlterarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnAlterarServico.setText("Alterar");
        btnAlterarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarServicoActionPerformed(evt);
            }
        });

        bntExcluirServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        bntExcluirServico.setText("Excluir");
        bntExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirServicoActionPerformed(evt);
            }
        });

        btnCancelarServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnCancelarServicos.setText("Cancelar");
        btnCancelarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarServicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(btnIncluirServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntExcluirServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarServicos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntExcluirServico, btnAlterarServico, btnCancelarServicos, btnIncluirServico});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirServico)
                    .addComponent(btnAlterarServico)
                    .addComponent(bntExcluirServico)
                    .addComponent(btnCancelarServicos))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jTabbedPaneServico.addTab("Busca de Serviços", jPanel1);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel2.setText("Codigo:");

        txtCodigoServico.setEditable(false);
        txtCodigoServico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel23.setText("Status:");

        cbStatusServico.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        cbStatusServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção", "1- Ativo", "2- Desativado" }));
        cbStatusServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusServicoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel10.setText("Data do Cadastro:");

        txtDataCadastroServico.setEditable(false);
        try {
            txtDataCadastroServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadastroServico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataCadastroServico.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel1.setText("Descrição:");

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel12.setText("Categoria:");

        cbCategoriaServico.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        btnSalvarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarServico.setText("Salvar");
        btnSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarServicoActionPerformed(evt);
            }
        });

        btnCancelarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnCancelarServico.setText("Cancelar");
        btnCancelarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarServicoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel13.setText("Observação:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnSalvarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarServico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoServico)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbCategoriaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtObservacaoServico, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelarServico, btnSalvarServico});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoriaServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarServico)
                    .addComponent(btnCancelarServico))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatusServico, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusServico)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneServico.addTab("Cadastro de Serviços", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneServico)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneServico, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbStatusServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusServicoActionPerformed

    private void btnIncluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirServicoActionPerformed
        // TODO add your handling code here:
        incluirServico();
    }//GEN-LAST:event_btnIncluirServicoActionPerformed

    private void btnAlterarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarServicoActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            recuperarServico();
            tipoCadastro = "alteracao";
        }
    }//GEN-LAST:event_btnAlterarServicoActionPerformed

    private void bntExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirServicoActionPerformed
        // TODO add your handling code here:
         if (testarSelecao() == true) {
            int linha = tblServicos.getSelectedRow();
             String nome = (String) tblServicos.getValueAt(linha, 1);
              int codigo = (Integer) tblServicos.getValueAt(linha, 0);
              
              // Questiona a exclusão
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir o registro \nNome: "
                    + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada    
            if (opcao == JOptionPane.OK_OPTION) {
                if (servicoController.excluirServicoController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com suscesso!");
                    carregarServicos();
                    //incluirProduto();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
        
    }//GEN-LAST:event_bntExcluirServicoActionPerformed

    private void btnCancelarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarServicosActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarServicosActionPerformed

    private void btnSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarServicoActionPerformed
        // TODO add your handling code here:
        if(txtDescricaoServico.getText().trim().equals("")){
             JOptionPane.showMessageDialog(this, "É necessário atribuir uma descrição ao servico");
            txtDescricaoServico.grabFocus();
        }  else if (tipoCadastro.equals("novo")) {
            salvarServico();
        } else if (tipoCadastro.equals("alteracao")) {
            alterarServico();
        }
    }//GEN-LAST:event_btnSalvarServicoActionPerformed

    private void btnCancelarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarServicoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarServicoActionPerformed

    private void carregarServicos() {
        listaServico = servicoController.getListaServicoController();
        DefaultTableModel modelo = (DefaultTableModel) tblServicos.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaServico.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaServico.get(i).getCodServico(),
                listaServico.get(i).getDescricao(),
                listaServico.get(i).getDescricaoCategoria()
            });
        }
    }

    private boolean recuperarServico() {
        //Armazena a linha selecionada
        int linhaTabela = this.tblServicos.getSelectedRow();
        
        //Captura valor código do cliente da linha selecionada
        int codigo = (Integer) tblServicos.getValueAt(linhaTabela, 0);
        jTabbedPaneServico.setSelectedIndex(1);
        try {
            servico = servicoController.getServicoController(codigo);
            this.txtCodigoServico.setText(String.valueOf(servico.getCodServico()));
            
            String dataRetorno = servico.getDataCadastramento();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataCadastramentoTela = localDate.format(formatter2);
            this.txtDataCadastroServico.setText(dataCadastramentoTela);
            
            this.txtDescricaoServico.setText(servico.getDescricao());
            this.cbCategoriaServico.setSelectedItem(categoriaServicoController.getCategoriaServicoController(servico.getCodCategoria()).getDescricao());
            this.txtObservacaoServico.setText(servico.getObservacao());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private void incluirServico(){
        jTabbedPaneServico.setSelectedIndex(1);
        txtCodigoServico.setText("novo");
        txtDataCadastroServico.setText(null);
        txtDescricaoServico.setText(null);
        cbCategoriaServico.setSelectedItem(null);
        txtObservacaoServico.setText(null);
        tipoCadastro = "novo";
        
    }
    
    private boolean alterarServico(){
        servico.setCodServico((Integer.parseInt(this.txtCodigoServico.getText())));
        servico.setDescricao(this.txtDescricaoServico.getText());
        servico.setCodCategoria(categoriaServicoController.getCategoriaServicoController(this.cbCategoriaServico.getSelectedItem().toString()).getCodigo());
        servico.setObservacao(this.txtObservacaoServico.getText());
        
        if(servicoController.atualizarServicoController(servico)){
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.incluirServico();
            this.carregarServicos();
            return true;
        }
        else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean salvarServico(){
        Date dataCadastramentoCliente = new Date();
        String formatoDataMysql = ("yyyy-MM-dd");
        SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
        String dataMysql = formatarData.format(dataCadastramentoCliente);
        servico.setDataCadastramento(dataMysql);
        servico.setDescricao(this.txtDescricaoServico.getText());
        
        servico.setCodCategoria(categoriaServicoController.getCategoriaServicoController(this.cbCategoriaServico.getSelectedItem().toString()).getCodigo());
        servico.setObservacao(this.txtObservacaoServico.getText());
        
        if(servicoController.salvarServicoController(servico) > 0 ){
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            //this.incluirProduto();
            this.carregarServicos();
            return true;
        } else{
             JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    private void carregarCategoriaServico(){
        listaCategoriaServico = categoriaServicoController.getListaCategoriaServicoController();
        cbCategoriaServico.removeAllItems();
        for (int i = 0; i < listaCategoriaServico.size(); i++){
            cbCategoriaServico.addItem(listaCategoriaServico.get(i).getDescricao());
        }
    }
    
    private boolean testarSelecao(){
        int selecao = tblServicos.getSelectedRow();
        if(selecao == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        } 
            return true;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FuncionarioView dialog = new FuncionarioView(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExcluirServico;
    private javax.swing.JButton btnAlterarServico;
    private javax.swing.JButton btnCancelarServico;
    private javax.swing.JButton btnCancelarServicos;
    private javax.swing.JButton btnIncluirServico;
    private javax.swing.JButton btnSalvarServico;
    private javax.swing.JComboBox<String> cbCategoriaServico;
    private javax.swing.JComboBox<String> cbStatusServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneServico;
    private javax.swing.JTable tblServicos;
    private javax.swing.JTextField txtCodigoServico;
    private javax.swing.JFormattedTextField txtDataCadastroServico;
    private javax.swing.JTextField txtDescricaoServico;
    private javax.swing.JTextField txtObservacaoServico;
    // End of variables declaration//GEN-END:variables

}
