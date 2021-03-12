/**
 * JDialog Autenticação.
 * 
 */
package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

public class JFrameAutenticacao extends javax.swing.JDialog {

    public JFrameAutenticacao() {
        initComponents();
        this.setModal(true);
        verificaLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryUsuario = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Usuario u order by u.idUsuario");
        listUsuario = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryUsuario.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelUsuario = new javax.swing.JLabel();
        jLabelLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPanelIconeCadeado = new javax.swing.JPanel();
        jLabelIconeCadeado = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelLogo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelMensagem = new javax.swing.JPanel();
        jLabelMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(378, 315));
        setMinimumSize(new java.awt.Dimension(378, 315));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLabelUsuario.setForeground(new java.awt.Color(0, 102, 153));
        jLabelLabelUsuario.setText("USUÁRIO");

        jLabelLabelSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLabelSenha.setForeground(new java.awt.Color(0, 102, 153));
        jLabelLabelSenha.setText("SENHA");

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(102, 102, 102));

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(102, 102, 102));

        jLabelIconeCadeado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconeCadeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadeado-lock-128.png"))); // NOI18N
        jLabelIconeCadeado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadeado-unlock-128.png"))); // NOI18N
        jLabelIconeCadeado.setEnabled(false);

        javax.swing.GroupLayout jPanelIconeCadeadoLayout = new javax.swing.GroupLayout(jPanelIconeCadeado);
        jPanelIconeCadeado.setLayout(jPanelIconeCadeadoLayout);
        jPanelIconeCadeadoLayout.setHorizontalGroup(
            jPanelIconeCadeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIconeCadeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconeCadeado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelIconeCadeadoLayout.setVerticalGroup(
            jPanelIconeCadeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIconeCadeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconeCadeado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIconeCadeado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLabelUsuario)
                    .addComponent(jLabelLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelIconeCadeado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLabelUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLabelSenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonEntrar.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(0, 204, 51));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonEntrarFocusGained(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(204, 0, 0));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLogo.setBackground(new java.awt.Color(0, 102, 153));
        jPanelLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLogo.setBackground(new java.awt.Color(0, 102, 204));
        jLabelLogo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setText(" MOTOGER 1.0");

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelMensagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelMensagem.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelMensagem.setForeground(new java.awt.Color(0, 153, 204));
        jLabelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensagem.setText("Bem Vindo! Entre com seu nome de Usuário e Senha");

        javax.swing.GroupLayout jPanelMensagemLayout = new javax.swing.GroupLayout(jPanelMensagem);
        jPanelMensagem.setLayout(jPanelMensagemLayout);
        jPanelMensagemLayout.setHorizontalGroup(
            jPanelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMensagemLayout.setVerticalGroup(
            jPanelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(477, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void verificaLogin(){
        String inicial = "from Usuario u";
        queryUsuario = entityManager.createQuery(inicial);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size() < 1){ //não há usuários cadastrados
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jLabelMensagem.setText("Não há usuários cadastrados");
        }
    }
    
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String inicial = "from Usuario u";
        queryUsuario = entityManager.createQuery(inicial);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size() < 1){ //não há usuários cadastrados
            int confirma = JOptionPane.showConfirmDialog(null, "Cadastrar Usuário? ");
            if(confirma == 0){ //confirma cadastrar
                JFramePrincipal principal = new JFramePrincipal();
                dispose();
                principal.setLocationRelativeTo(this);
                principal.setVisible(true);
                JFrameUsuario cadUsuario = new JFrameUsuario();
                cadUsuario.setLocationRelativeTo(this);
                cadUsuario.setVisible(true);
                
            }else
                System.exit(0);
        }else{ //há usuário
            String senha = new String(jPasswordFieldSenha.getPassword());
            String ejbql = "from Usuario u where u.usuLogin = '"
                    + jTextFieldUsuario.getText() + "' and u.usuSenha = '"
                    + senha + "'";
            queryUsuario = entityManager.createQuery(ejbql);
            listUsuario.clear();
            listUsuario.addAll(queryUsuario.getResultList());
            if(listUsuario.size() > 0){ // Login Válido
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter("logado.txt"));
                    writer.println(jTextFieldUsuario.getText());
                    writer.println(senha);                    
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrameAutenticacao.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabelIconeCadeado.setEnabled(false);
                JFramePrincipal principal = new JFramePrincipal();
                principal.setLocationRelativeTo(this);
                principal.setVisible(true);
                dispose();
            }else{ // Login Inválido
                jLabelMensagem.setForeground(Color.red);
                jLabelMensagem.setText("Usuário ou Senha Inválidos!");
                jTextFieldUsuario.requestFocus();
                jLabelIconeCadeado.setEnabled(true);
            }   
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed
    
    /**
     * Permite que o jButton que recebe Focus seja acionado via tecla Enter
     * @param evt 
     */
    private void jButtonEntrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonEntrarFocusGained
        this.getRootPane().setDefaultButton(jButtonEntrar);
    }//GEN-LAST:event_jButtonEntrarFocusGained

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAutenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelIconeCadeado;
    private javax.swing.JLabel jLabelLabelSenha;
    private javax.swing.JLabel jLabelLabelUsuario;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelIconeCadeado;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelMensagem;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private java.util.List<Usuario> listUsuario;
    private javax.persistence.Query queryUsuario;
    // End of variables declaration//GEN-END:variables
}
