package br.com.barbosasys.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helionelys
 */
public class ContasPagarView extends javax.swing.JDialog {

    /**
     * Creates new form ContasPagarView
     */
    public ContasPagarView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPaneContaAPagar = new javax.swing.JTabbedPane();
        jpContasAPagar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLancamentoPagoPesquisar = new javax.swing.JTextField();
        btnLancamentoPagoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLancamentosAPagar = new javax.swing.JTable();
        btnContasAPagarExcluir = new javax.swing.JButton();
        btnContasAPagarCancelar = new javax.swing.JButton();
        btnContasAPagarIncluir = new javax.swing.JButton();
        btnContasAPagarEditar = new javax.swing.JButton();
        btnLancamentosAPagarImprimir = new javax.swing.JButton();
        jpContasPagas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLancamentosPagos = new javax.swing.JTable();
        btnLancamentosPagosRevogar = new javax.swing.JButton();
        btnLancamentosPagosCancelar = new javax.swing.JButton();
        btnLancamentosPagosImprimir = new javax.swing.JButton();
        jpLancamentosContasAPagar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLancamentoCodFornecedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLancamentoNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLancamentoObservacao = new javax.swing.JTextArea();
        txtLancamentoValorTotal = new javax.swing.JTextField();
        txtLancamentosDescricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLancamentoDataPagamento = new javax.swing.JFormattedTextField();
        txtLancamentoDataVencimento = new javax.swing.JFormattedTextField();
        txtLancamentoDataInclusao = new javax.swing.JFormattedTextField();
        cbLancamentoTipoPagamento = new javax.swing.JComboBox<>();
        btnLancamentoCancelar = new javax.swing.JButton();
        btnLancamentoSalvar = new javax.swing.JButton();
        btnLancamentoBuscaFornecedor = new javax.swing.JButton();
        txtLancamentoNomeFornecedor1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Contas a pagar");

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

        jLabel1.setText("Descrição:");

        btnLancamentoPagoPesquisar.setText("Buscar");

        tblLancamentosAPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Fornecedor", "Data", "Vencimento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLancamentosAPagar);

        btnContasAPagarExcluir.setText("Excluir");

        btnContasAPagarCancelar.setText("Cancelar");

        btnContasAPagarIncluir.setText("Incluir");

        btnContasAPagarEditar.setText("Editar");

        btnLancamentosAPagarImprimir.setText("Imprimir");

        javax.swing.GroupLayout jpContasAPagarLayout = new javax.swing.GroupLayout(jpContasAPagar);
        jpContasAPagar.setLayout(jpContasAPagarLayout);
        jpContasAPagarLayout.setHorizontalGroup(
            jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpContasAPagarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLancamentoPagoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLancamentoPagoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContasAPagarLayout.createSequentialGroup()
                        .addComponent(btnLancamentosAPagarImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(btnContasAPagarIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasAPagarEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasAPagarExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasAPagarCancelar)))
                .addContainerGap())
        );

        jpContasAPagarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnContasAPagarCancelar, btnContasAPagarEditar, btnContasAPagarExcluir, btnContasAPagarIncluir});

        jpContasAPagarLayout.setVerticalGroup(
            jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLancamentoPagoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLancamentoPagoPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnContasAPagarExcluir)
                        .addComponent(btnContasAPagarCancelar)
                        .addComponent(btnContasAPagarIncluir)
                        .addComponent(btnContasAPagarEditar))
                    .addComponent(btnLancamentosAPagarImprimir))
                .addContainerGap())
        );

        jpContasAPagarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnContasAPagarCancelar, btnContasAPagarEditar, btnContasAPagarExcluir, btnContasAPagarIncluir});

        jTabbedPaneContaAPagar.addTab("Contas a Pagar", jpContasAPagar);

        jLabel6.setText("Descrição:");

        jButton14.setText("Buscar");

        tblLancamentosPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Fornecedor", "Data", "Vencimento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblLancamentosPagos);

        btnLancamentosPagosRevogar.setText("Revogar Pagamento");

        btnLancamentosPagosCancelar.setText("Cancelar");

        btnLancamentosPagosImprimir.setText("Imprimir");

        javax.swing.GroupLayout jpContasPagasLayout = new javax.swing.GroupLayout(jpContasPagas);
        jpContasPagas.setLayout(jpContasPagasLayout);
        jpContasPagasLayout.setHorizontalGroup(
            jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasPagasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jpContasPagasLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpContasPagasLayout.createSequentialGroup()
                        .addComponent(btnLancamentosPagosImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLancamentosPagosRevogar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLancamentosPagosCancelar)))
                .addContainerGap())
        );
        jpContasPagasLayout.setVerticalGroup(
            jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasPagasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLancamentosPagosRevogar)
                        .addComponent(btnLancamentosPagosCancelar))
                    .addComponent(btnLancamentosPagosImprimir))
                .addContainerGap())
        );

        jTabbedPaneContaAPagar.addTab("Contas Pagas", jpContasPagas);

        jLabel3.setText("Cliente/Fornecedor:");

        jLabel4.setText("Laçamento:");

        jLabel5.setText("Descrição da Conta:");

        jLabel7.setText("Valor:");

        jLabel8.setText("Vencimento:");

        labelPagamento.setText("Data Pagamento:");

        jLabel10.setText("Tipo de pagamento:");

        jLabel11.setText("Observação:");

        txtLancamentoObservacao.setColumns(20);
        txtLancamentoObservacao.setRows(5);
        jScrollPane3.setViewportView(txtLancamentoObservacao);

        jLabel9.setText("Data Pagamento");

        try {
            txtLancamentoDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLancamentoDataPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtLancamentoDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLancamentoDataVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtLancamentoDataInclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLancamentoDataInclusao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnLancamentoCancelar.setText("Cancelar");

        btnLancamentoSalvar.setText("Salvar");

        btnLancamentoBuscaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnLancamentoBuscaFornecedor.setText("Buscar");

        javax.swing.GroupLayout jpLancamentosContasAPagarLayout = new javax.swing.GroupLayout(jpLancamentosContasAPagar);
        jpLancamentosContasAPagar.setLayout(jpLancamentosContasAPagarLayout);
        jpLancamentosContasAPagarLayout.setHorizontalGroup(
            jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLancamentosContasAPagarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLancamentoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLancamentoCancelar)
                .addGap(12, 12, 12))
            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(labelPagamento)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(15, 18, Short.MAX_VALUE)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLancamentosDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                        .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                .addComponent(txtLancamentoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbLancamentoTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                    .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                            .addGap(151, 151, 151)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLancamentoDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtLancamentoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLancamentoDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtLancamentoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                .addComponent(txtLancamentoCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLancamentoNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLancamentoBuscaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpLancamentosContasAPagarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLancamentoCancelar, btnLancamentoSalvar});

        jpLancamentosContasAPagarLayout.setVerticalGroup(
            jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLancamentoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLancamentoCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLancamentoBuscaFornecedor)
                    .addComponent(txtLancamentoNomeFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLancamentosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagamento)
                    .addComponent(txtLancamentoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtLancamentoDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtLancamentoDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbLancamentoTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLancamentoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLancamentoSalvar)
                    .addComponent(btnLancamentoCancelar))
                .addContainerGap())
        );

        jTabbedPaneContaAPagar.addTab("Lançamentos de Contas a Pagar", jpLancamentosContasAPagar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneContaAPagar)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneContaAPagar)
                .addGap(5, 5, 5)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContasAPagarCancelar;
    private javax.swing.JButton btnContasAPagarEditar;
    private javax.swing.JButton btnContasAPagarExcluir;
    private javax.swing.JButton btnContasAPagarIncluir;
    private javax.swing.JButton btnLancamentoBuscaFornecedor;
    private javax.swing.JButton btnLancamentoCancelar;
    private javax.swing.JButton btnLancamentoPagoPesquisar;
    private javax.swing.JButton btnLancamentoSalvar;
    private javax.swing.JButton btnLancamentosAPagarImprimir;
    private javax.swing.JButton btnLancamentosPagosCancelar;
    private javax.swing.JButton btnLancamentosPagosImprimir;
    private javax.swing.JButton btnLancamentosPagosRevogar;
    private javax.swing.JComboBox<String> cbLancamentoTipoPagamento;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneContaAPagar;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel jpContasAPagar;
    private javax.swing.JPanel jpContasPagas;
    private javax.swing.JPanel jpLancamentosContasAPagar;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JTable tblLancamentosAPagar;
    private javax.swing.JTable tblLancamentosPagos;
    private javax.swing.JTextField txtLancamentoCodFornecedor;
    private javax.swing.JFormattedTextField txtLancamentoDataInclusao;
    private javax.swing.JFormattedTextField txtLancamentoDataPagamento;
    private javax.swing.JFormattedTextField txtLancamentoDataVencimento;
    private javax.swing.JTextField txtLancamentoNomeFornecedor1;
    private javax.swing.JTextField txtLancamentoNumero;
    private javax.swing.JTextArea txtLancamentoObservacao;
    private javax.swing.JTextField txtLancamentoPagoPesquisar;
    private javax.swing.JTextField txtLancamentoValorTotal;
    private javax.swing.JTextField txtLancamentosDescricao;
    // End of variables declaration//GEN-END:variables
}
