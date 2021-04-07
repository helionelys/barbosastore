/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.DadosEmpresaController;
import br.com.barbosasys.model.DadosEmpresa;
import javax.swing.JOptionPane;

/**
 *
 * @author helionelys
 */
public class DadosEmpresaView extends javax.swing.JDialog {
    
    DadosEmpresa dadosEmpresa = new DadosEmpresa();
    DadosEmpresaController dadosEmpresController= new DadosEmpresaController();
    String tipoCadastro;
    
    /**
     * Creates new form DadosEmpresaView
     */
    public DadosEmpresaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarDadosEmpresa();
        carregarCamposDesativados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoDadosEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNomeFantasiaDadosEmpresa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRazaoSocialDadosEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txTCnpjDadosEmpresa = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefoneDadosEmpresa = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmailDadosEmpresa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblLogoDadosEmpresa = new javax.swing.JLabel();
        btnInserirLogoDadosEmpresa = new javax.swing.JButton();
        btnAlterarDadosEmpresa = new javax.swing.JButton();
        btnSalvarDadosEmpresa = new javax.swing.JButton();
        btnSairDadosEmpresa = new javax.swing.JButton();
        txtInscricaoEstadualDadosEmpresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BarbosaStore - Dados Administrativos");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jLabel7.setText("Codigo:");

        txtCodigoDadosEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Nome Fantasia:");

        jLabel10.setText("R:azão Social");

        jLabel11.setText("CPF/CNPJ:");

        try {
            txTCnpjDadosEmpresa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txTCnpjDadosEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Telefone:");

        try {
            txtTelefoneDadosEmpresa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("Email:");

        jLabel14.setText("Inscrição Estadual");

        lblLogoDadosEmpresa.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblLogoDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoDadosEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        btnInserirLogoDadosEmpresa.setText("Imagem");

        btnAlterarDadosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnAlterarDadosEmpresa.setText("Alterar");
        btnAlterarDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosEmpresaActionPerformed(evt);
            }
        });

        btnSalvarDadosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnSalvarDadosEmpresa.setText("Salvar");
        btnSalvarDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosEmpresaActionPerformed(evt);
            }
        });

        btnSairDadosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/sair.png"))); // NOI18N
        btnSairDadosEmpresa.setText("Sair");
        btnSairDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairDadosEmpresaActionPerformed(evt);
            }
        });

        txtInscricaoEstadualDadosEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeFantasiaDadosEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnInserirLogoDadosEmpresa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefoneDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailDadosEmpresa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txTCnpjDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInscricaoEstadualDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRazaoSocialDadosEmpresa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterarDadosEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarDadosEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSairDadosEmpresa)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarDadosEmpresa, btnSairDadosEmpresa, btnSalvarDadosEmpresa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCodigoDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNomeFantasiaDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtRazaoSocialDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txTCnpjDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtInscricaoEstadualDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtTelefoneDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtEmailDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInserirLogoDadosEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarDadosEmpresa)
                    .addComponent(btnSalvarDadosEmpresa)
                    .addComponent(btnSairDadosEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txTCnpjDadosEmpresa, txtRazaoSocialDadosEmpresa});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterarDadosEmpresa, btnSairDadosEmpresa, btnSalvarDadosEmpresa});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosEmpresaActionPerformed
        // TODO add your handling code here:
        ativarCamposParaEdicao();
        this.btnAlterarDadosEmpresa.setEnabled(false);
    }//GEN-LAST:event_btnAlterarDadosEmpresaActionPerformed

    private void btnSalvarDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosEmpresaActionPerformed
        // TODO add your handling code here:
        this.atualizarDadosEmpresa();
        this.btnAlterarDadosEmpresa.setEnabled(true);
    }//GEN-LAST:event_btnSalvarDadosEmpresaActionPerformed

    private void btnSairDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairDadosEmpresaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairDadosEmpresaActionPerformed

    private boolean atualizarDadosEmpresa(){
        dadosEmpresa.setCodigo((Integer.parseInt(this.txtCodigoDadosEmpresa.getText())));
        dadosEmpresa.setApelidoNomeFantasia(this.txtNomeFantasiaDadosEmpresa.getText());
        dadosEmpresa.setNomeRazaoSocial(this.txtRazaoSocialDadosEmpresa.getText());
        dadosEmpresa.setCpfCnpj(this.txTCnpjDadosEmpresa.getText());
        dadosEmpresa.setRgInscricaoEstadual(this.txtInscricaoEstadualDadosEmpresa.getText());
        dadosEmpresa.setTelefone(this.txtTelefoneDadosEmpresa.getText());
        dadosEmpresa.setEmail(this.txtEmailDadosEmpresa.getText());
        
        if(dadosEmpresController.atualizarDadosEmpresaController(dadosEmpresa)){
            JOptionPane.showMessageDialog(this, "Dados da Empresa atualiazado!");
            this.carregarDadosEmpresa();
            this.carregarCamposDesativados();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    private void carregarDadosEmpresa(){
        int codigoFixo = 1;
        dadosEmpresa = dadosEmpresController.getDadosEmpresaController(codigoFixo);
        this.txtCodigoDadosEmpresa.setText(String.valueOf(dadosEmpresa.getCodigo()));
        this.txtNomeFantasiaDadosEmpresa.setText(dadosEmpresa.getApelidoNomeFantasia());
        this.txtRazaoSocialDadosEmpresa.setText(dadosEmpresa.getNomeRazaoSocial());
        this.txTCnpjDadosEmpresa.setText(dadosEmpresa.getCpfCnpj());
        this.txtInscricaoEstadualDadosEmpresa.setText(dadosEmpresa.getRgInscricaoEstadual());
        this.txtTelefoneDadosEmpresa.setText(dadosEmpresa.getTelefone());
        this.txtEmailDadosEmpresa.setText(dadosEmpresa.getEmail());
    }
    
    private void carregarCamposDesativados(){
        this.txtCodigoDadosEmpresa.setEnabled(false);
        this.txtNomeFantasiaDadosEmpresa.setEnabled(false);
        this.txtRazaoSocialDadosEmpresa.setEnabled(false);
        this.txTCnpjDadosEmpresa.setEnabled(false);
        this.txtInscricaoEstadualDadosEmpresa.setEnabled(false);
        this.txtTelefoneDadosEmpresa.setEnabled(false);
        this.txtEmailDadosEmpresa.setEnabled(false);
        this.btnSalvarDadosEmpresa.setEnabled(false);
    }
    
        private void ativarCamposParaEdicao(){
        
        this.txtNomeFantasiaDadosEmpresa.setEnabled(true);
        this.txtRazaoSocialDadosEmpresa.setEnabled(true);
        this.txTCnpjDadosEmpresa.setEnabled(true);
        this.txtInscricaoEstadualDadosEmpresa.setEnabled(true);
        this.txtTelefoneDadosEmpresa.setEnabled(true);
        this.txtEmailDadosEmpresa.setEnabled(true);
        this.btnSalvarDadosEmpresa.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDadosEmpresa;
    private javax.swing.JButton btnInserirLogoDadosEmpresa;
    private javax.swing.JButton btnSairDadosEmpresa;
    private javax.swing.JButton btnSalvarDadosEmpresa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblLogoDadosEmpresa;
    private javax.swing.JFormattedTextField txTCnpjDadosEmpresa;
    private javax.swing.JTextField txtCodigoDadosEmpresa;
    private javax.swing.JTextField txtEmailDadosEmpresa;
    private javax.swing.JTextField txtInscricaoEstadualDadosEmpresa;
    private javax.swing.JTextField txtNomeFantasiaDadosEmpresa;
    private javax.swing.JTextField txtRazaoSocialDadosEmpresa;
    private javax.swing.JFormattedTextField txtTelefoneDadosEmpresa;
    // End of variables declaration//GEN-END:variables
}
