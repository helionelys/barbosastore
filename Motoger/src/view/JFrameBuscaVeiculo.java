package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import javax.swing.JOptionPane;
import model.Veiculo;

public class JFrameBuscaVeiculo extends javax.swing.JDialog {

    private Integer idVeiculo = 0; //é necessário inicializar as variáveis para evitar erro de valor null.
    private String placa = ""; //é necessário inicializar as variáveis para evitar erro de valor null.
    private String cor = "";
    private String modelo = "";
    private Integer indice = 0;
    private Integer codCliente = 0;

    public Integer getIndice() {
        return indice;
    }
    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
    public Integer getCodVeiculo() {
        return idVeiculo;
    }
    public void setCodVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    public Integer getCodCliente(){
        return codCliente;
    }
    public void setCodCliente(Integer codcliente){
        this.codCliente = codcliente;
    }
    
    public String getPlaca() {
        return placa;    }

    public void setPlaca(String placa) {
        this.placa = placa;    
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public JFrameBuscaVeiculo() {
        initComponents();
        this.setModal(true);
        jTextFieldCampoPesquisa.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryVeiculo = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Veiculo v order by v.idVeiculo");
        listVeiculo = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVeiculo.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelPesquisaPor = new javax.swing.JLabel();
        jComboBoxPesquisarPor = new javax.swing.JComboBox<>();
        jLabelLabelPesquisa = new javax.swing.JLabel();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisarOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaVeiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 270));
        setMinimumSize(new java.awt.Dimension(750, 270));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelPesquisaPor.setText("Pesquisar por:");

        jComboBoxPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Placa" }));
        jComboBoxPesquisarPor.setSelectedIndex(1);
        jComboBoxPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarPorActionPerformed(evt);
            }
        });

        jLabelLabelPesquisa.setText("Pesquisa:");

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jButtonPesquisarOK.setText("OK");
        jButtonPesquisarOK.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarOKActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelPesquisaPor)
                    .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLabelPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldCampoPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLabelPesquisaPor)
                            .addComponent(jLabelLabelPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVeiculo, jTablePesquisaVeiculo);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVeiculo}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiPlaca}"));
        columnBinding.setColumnName("Placa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiCor}"));
        columnBinding.setColumnName("Cor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modeloMoto}"));
        columnBinding.setColumnName("Modelo Moto");
        columnBinding.setColumnClass(model.ModeloMoto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiAnoFabric}"));
        columnBinding.setColumnName("Ano Fabric.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente.cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePesquisaVeiculo);
        if (jTablePesquisaVeiculo.getColumnModel().getColumnCount() > 0) {
            jTablePesquisaVeiculo.getColumnModel().getColumn(0).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTablePesquisaVeiculo.getColumnModel().getColumn(1).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTablePesquisaVeiculo.getColumnModel().getColumn(2).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTablePesquisaVeiculo.getColumnModel().getColumn(3).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTablePesquisaVeiculo.getColumnModel().getColumn(4).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTablePesquisaVeiculo.getColumnModel().getColumn(5).setResizable(false);
            jTablePesquisaVeiculo.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        atualizaTabela();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased
    
    /**
     * Seta as variáveis locais com os dados resultantes no jTable.
     * As variáveis serão solicitadas pelos métodos Get nos jFrames que chamaram este jFrame de busca
     * @param evt 
     */
    private void jButtonPesquisarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarOKActionPerformed
        if(jTablePesquisaVeiculo.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um veículo!");
        }else{
            int linha = jTablePesquisaVeiculo.getSelectedRow();
            this.setIndice(jTablePesquisaVeiculo.getSelectedRow());
            this.setCodVeiculo(Integer.parseInt(String.valueOf(jTablePesquisaVeiculo.getValueAt(linha, 0))));
            this.setPlaca(String.valueOf(jTablePesquisaVeiculo.getValueAt(linha, 1)));
            this.setCor(String.valueOf(jTablePesquisaVeiculo.getValueAt(linha, 2)));
            this.setModelo(String.valueOf(jTablePesquisaVeiculo.getValueAt(linha, 3)));
            this.setCodCliente(listVeiculo.get(linha).getCliente().getIdCliente());
            dispose();
        }
    }//GEN-LAST:event_jButtonPesquisarOKActionPerformed

     /**
     * Limita a entrada neste campo para apenas números
     * @param evt 
     */
    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxPesquisarPor.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxPesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarPorActionPerformed
        if(jComboBoxPesquisarPor.getSelectedIndex() == 0){
            jTextFieldCampoPesquisa.setText("");
        }
    }//GEN-LAST:event_jComboBoxPesquisarPorActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Veiculo v join v.modeloMoto m ";
        String atributo = "";
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Placa")){
            atributo = "v.veiPlaca";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + atributo + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Código")){
            atributo = "v.idVeiculo";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + atributo + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + atributo;
        queryVeiculo = entityManager.createQuery(ejbql);
        listVeiculo.clear();
        listVeiculo.addAll(queryVeiculo.getResultList());
        int linha = listVeiculo.size() - 1;
        if(listVeiculo.size() > 0){
            jTablePesquisaVeiculo.scrollRectToVisible(jTablePesquisaVeiculo.getCellRect(linha, linha, true));
        }
        if(listVeiculo.size() == 1){
            jTablePesquisaVeiculo.setRowSelectionInterval(linha, linha);
            this.getRootPane().setDefaultButton(jButtonPesquisarOK);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisarOK;
    private javax.swing.JComboBox<String> jComboBoxPesquisarPor;
    private javax.swing.JLabel jLabelLabelPesquisa;
    private javax.swing.JLabel jLabelLabelPesquisaPor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisaVeiculo;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private java.util.List<Veiculo> listVeiculo;
    private javax.persistence.Query queryVeiculo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
