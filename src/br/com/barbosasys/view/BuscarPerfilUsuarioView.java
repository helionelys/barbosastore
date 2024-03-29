/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.PerfilUsuarioController;
import br.com.barbosasys.model.PerfilUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helionelys
 */
public class BuscarPerfilUsuarioView extends javax.swing.JDialog {
    
     //Variavel para armazemar Código e Nome do perfil do usuario
    private int codigoPerfilUsuario;
    private String nomePerfilUsuario;
    
    PerfilUsuario perfilUsuario = new PerfilUsuario();
    PerfilUsuarioController perfilUsuarioController = new PerfilUsuarioController();
    ArrayList<PerfilUsuario> listaPerfilUsuario = new ArrayList<>();
    String tipoCadastro;

    /**
     * Creates new form BuscaClientes
     */
    public BuscarPerfilUsuarioView(UsuariosView owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.carregarPerfilUsuarios();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerfilUsuario = new javax.swing.JTable();
        btnPerfilSelecionar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Perfil Usuários");

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

        tblPerfilUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerfilUsuario);

        btnPerfilSelecionar.setText("Selecionar");
        btnPerfilSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(btnPerfilSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnPerfilSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
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

    private void btnPerfilSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilSelecionarActionPerformed
        // TODO add your handling code here:
        recuperarPerfilUsuario();
        this.dispose();
    }//GEN-LAST:event_btnPerfilSelecionarActionPerformed
    
    private boolean recuperarPerfilUsuario(){
        
       //Armazena a linha selecionada
       int linhaTabela = this.tblPerfilUsuario.getSelectedRow();
       
       //Captura valor código do funcionário da linha selecionada
       int codigo = (Integer) tblPerfilUsuario.getValueAt(linhaTabela, 0);
       
        try {
        //retorna os dados do banco de dados
        perfilUsuario = perfilUsuarioController.getPerfilUsuarioControllerSimples(codigo);
        this.codigoPerfilUsuario = Integer.valueOf(perfilUsuario.getCodPerfil());
        this.nomePerfilUsuario = (perfilUsuario.getNome());
        return true;
        } catch (Exception e) {
            return false;
        }
    }    
    
    private void carregarPerfilUsuarios() {
        listaPerfilUsuario = perfilUsuarioController.getListaPerfilUsuarioController();
        DefaultTableModel modelo = (DefaultTableModel) tblPerfilUsuario.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaPerfilUsuario.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaPerfilUsuario.get(i).getCodPerfil(),
                listaPerfilUsuario.get(i).getNome(),
            });
        }
    }
    
    


    /**
     * @param args the command line arguments
     */

    public int getCodigoPerfilUsuario() {
        return codigoPerfilUsuario;
    }

    public void setCodigoPerfilUsuario(int codigoPerfilUsuario) {
        this.codigoPerfilUsuario = codigoPerfilUsuario;
    }

    public String getNomePerfilUsuario() {
        return nomePerfilUsuario;
    }

    public void setNomePerfilUsuario(String nomePerfilUsuario) {
        this.nomePerfilUsuario = nomePerfilUsuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPerfilSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerfilUsuario;
    // End of variables declaration//GEN-END:variables
}
