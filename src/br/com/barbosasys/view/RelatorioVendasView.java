package br.com.barbosasys.view;

import br.com.barbosasys.controller.ClienteController;
import br.com.barbosasys.model.Cliente;
import java.util.ArrayList;

public class RelatorioVendasView extends javax.swing.JDialog {

    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ClienteController clienteController = new ClienteController();

    /**
     * Creates new form RelatorioVendasView
     */
    public RelatorioVendasView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarCliente();
        setLocationRelativeTo(null);
        btnGerarRelatorio.setEnabled(false);
        jdcRelatorioData.setEnabled(false);
        cbRelatorioVendaListaClientes.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupTipoBuscaVenda = new javax.swing.ButtonGroup();
        rbRelatorioVendasPorData = new javax.swing.JRadioButton();
        rbRelatorioVendasPorCliente = new javax.swing.JRadioButton();
        jdcRelatorioData = new com.toedter.calendar.JDateChooser();
        cbRelatorioVendaListaClientes = new javax.swing.JComboBox<>();
        btnGerarRelatorio = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbRelatorioVendasGeral = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Relatórios Vendas");

        rbGroupTipoBuscaVenda.add(rbRelatorioVendasPorData);
        rbRelatorioVendasPorData.setText("Buscar Data");
        rbRelatorioVendasPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRelatorioVendasPorDataActionPerformed(evt);
            }
        });

        rbGroupTipoBuscaVenda.add(rbRelatorioVendasPorCliente);
        rbRelatorioVendasPorCliente.setText("Buscar Cliente");
        rbRelatorioVendasPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRelatorioVendasPorClienteActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Report.png"))); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatório");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        rbGroupTipoBuscaVenda.add(rbRelatorioVendasGeral);
        rbRelatorioVendasGeral.setText("Geral");
        rbRelatorioVendasGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRelatorioVendasGeralActionPerformed(evt);
            }
        });

        jLabel1.setText("Geral Relatório com todas vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbRelatorioVendasPorCliente)
                            .addGap(27, 27, 27)
                            .addComponent(cbRelatorioVendaListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGerarRelatorio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbRelatorioVendasPorData)
                            .addComponent(rbRelatorioVendasGeral))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jdcRelatorioData, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnGerarRelatorio});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRelatorioVendasGeral)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbRelatorioVendasPorData)
                    .addComponent(jdcRelatorioData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRelatorioVendasPorCliente)
                    .addComponent(cbRelatorioVendaListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarRelatorio)
                    .addComponent(btnCancelar))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnGerarRelatorio});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbRelatorioVendasPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRelatorioVendasPorDataActionPerformed
        // TODO add your handling code here:
        btnGerarRelatorio.setEnabled(true);
        jdcRelatorioData.setEnabled(true);
        jdcRelatorioData.grabFocus();
        cbRelatorioVendaListaClientes.setEnabled(false);
    }//GEN-LAST:event_rbRelatorioVendasPorDataActionPerformed

    private void rbRelatorioVendasPorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRelatorioVendasPorClienteActionPerformed
        // TODO add your handling code here:
        btnGerarRelatorio.setEnabled(true);
        jdcRelatorioData.setEnabled(false);
        cbRelatorioVendaListaClientes.setEnabled(true);

    }//GEN-LAST:event_rbRelatorioVendasPorClienteActionPerformed

    private void rbRelatorioVendasGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRelatorioVendasGeralActionPerformed
        // TODO add your handling code here:
        btnGerarRelatorio.setEnabled(true);
        jdcRelatorioData.setEnabled(false);
        cbRelatorioVendaListaClientes.setEnabled(false);
    }//GEN-LAST:event_rbRelatorioVendasGeralActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void carregarCliente() {
        listaClientes = clienteController.getListaClienteController();
        cbRelatorioVendaListaClientes.removeAllItems();
        for (int i = 0; i < listaClientes.size(); i++) {
            cbRelatorioVendaListaClientes.addItem(listaClientes.get(i).getNomeRazaoSocial());

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JComboBox<String> cbRelatorioVendaListaClientes;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdcRelatorioData;
    private javax.swing.ButtonGroup rbGroupTipoBuscaVenda;
    protected javax.swing.JRadioButton rbRelatorioVendasGeral;
    protected javax.swing.JRadioButton rbRelatorioVendasPorCliente;
    protected javax.swing.JRadioButton rbRelatorioVendasPorData;
    // End of variables declaration//GEN-END:variables
}
