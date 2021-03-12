package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Movimento;
import model.Parcela;
import model.Venda;

public class JFrameFinalizaVenda extends javax.swing.JDialog {

    private double valor;
    private int status = 0;

    public int getStatus() {
        return status;
    }  
    
    public JFrameFinalizaVenda(Venda ven) {
        initComponents();  
        this.setModal(true);
        jLabelCodVenda.setText(ven.getIdVenda().toString());
        listVenda.add(ven);
        jFormattedTextFieldTotal.setValue(ven.getVenValorTotal());
        jFormattedTextFieldEntrada.setText("0.00");
        jFormattedTextFieldValorParcelado.setValue(ven.getVenValorTotal());
        jFormattedTextFieldData.setValue(Date.from(Instant.now()));
        jFormattedTextFieldParcelas.setText("0");
        jFormattedTextFieldJuros.setText("0");
        if(jComboBoxFormaPagto.getSelectedIndex()==0){
            jFormattedTextFieldJuros.setEnabled(false);
            jFormattedTextFieldParcelas.setEnabled(false);
            jFormattedTextFieldEntrada.setEnabled(false);
            jFormattedTextFieldValorParcelado.setEnabled(false);
            jFormattedTextFieldValorFinal.setEnabled(false);
            jButtonVerParcelas.setEnabled(false);            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        listParcelas = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Parcela>());
        ;
        listVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Venda>());
        ;
        jPanelFormaPagamento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxFormaPagto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTipoPagto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelLabelCodVenda = new javax.swing.JLabel();
        jLabelCodVenda = new javax.swing.JLabel();
        jPanelValores = new javax.swing.JPanel();
        jLabelValorEntrada = new javax.swing.JLabel();
        jFormattedTextFieldEntrada = new javax.swing.JFormattedTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jFormattedTextFieldTotal = new javax.swing.JFormattedTextField();
        jLabelValorParcelado = new javax.swing.JLabel();
        jFormattedTextFieldValorParcelado = new javax.swing.JFormattedTextField();
        jLabelParcelas = new javax.swing.JLabel();
        jLabelJuros = new javax.swing.JLabel();
        jLabelLabelValorFinal = new javax.swing.JLabel();
        jButtonVerParcelas = new javax.swing.JButton();
        jFormattedTextFieldJuros = new javax.swing.JFormattedTextField();
        jFormattedTextFieldParcelas = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldValorFinal = new javax.swing.JFormattedTextField();
        jScrollPaneParcelas = new javax.swing.JScrollPane();
        jTableParcelas = new javax.swing.JTable();
        jPanelBarraTitulo1 = new javax.swing.JPanel();
        jLabelLabelTituloFinalizarVenda = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonConcluirVenda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FINALIZAR VENDA - PAGAMENTO");
        setMaximumSize(new java.awt.Dimension(383, 478));
        setMinimumSize(new java.awt.Dimension(383, 478));

        jPanelFormaPagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFormaPagamento.setMaximumSize(new java.awt.Dimension(293, 55));
        jPanelFormaPagamento.setMinimumSize(new java.awt.Dimension(293, 55));

        jLabel3.setText("Forma de Pagamento:");

        jComboBoxFormaPagto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vista", "Prazo" }));
        jComboBoxFormaPagto.setToolTipText("");
        jComboBoxFormaPagto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagtoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Pagamento:");

        jComboBoxTipoPagto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro" }));

        jLabel1.setText("Data:");

        jFormattedTextFieldData.setEditable(false);
        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanelFormaPagamentoLayout = new javax.swing.GroupLayout(jPanelFormaPagamento);
        jPanelFormaPagamento.setLayout(jPanelFormaPagamentoLayout);
        jPanelFormaPagamentoLayout.setHorizontalGroup(
            jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jComboBoxFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormaPagamentoLayout.setVerticalGroup(
            jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addComponent(jComboBoxTipoPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabelLabelCodVenda.setText("Código da Venda / O.S.:");

        jLabelCodVenda.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelCodVenda.setForeground(new java.awt.Color(0, 51, 102));
        jLabelCodVenda.setText("---");

        jPanelValores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelValores.setMaximumSize(new java.awt.Dimension(303, 126));
        jPanelValores.setMinimumSize(new java.awt.Dimension(303, 126));

        jLabelValorEntrada.setText("Valor da Entrada:");

        jFormattedTextFieldEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldEntrada.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jFormattedTextFieldEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldEntradaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldEntradaFocusLost(evt);
            }
        });
        jFormattedTextFieldEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldEntradaKeyTyped(evt);
            }
        });

        jLabelValorTotal.setText("Valor Total:");

        jFormattedTextFieldTotal.setEditable(false);
        jFormattedTextFieldTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldTotal.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        jLabelValorParcelado.setText("Valor Parcelado:");

        jFormattedTextFieldValorParcelado.setEditable(false);
        jFormattedTextFieldValorParcelado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldValorParcelado.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        jLabelParcelas.setText("Parcelas:");

        jLabelJuros.setText("Juros:");

        jLabelLabelValorFinal.setText("Valor Final:");

        jButtonVerParcelas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonVerParcelas.setText("Visualizar");
        jButtonVerParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerParcelasActionPerformed(evt);
            }
        });

        jFormattedTextFieldJuros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldJuros.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jFormattedTextFieldJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldJurosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldJurosFocusLost(evt);
            }
        });
        jFormattedTextFieldJuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldJurosKeyTyped(evt);
            }
        });

        jFormattedTextFieldParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldParcelas.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jFormattedTextFieldParcelas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldParcelasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldParcelasFocusLost(evt);
            }
        });
        jFormattedTextFieldParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldParcelasKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("%");

        jFormattedTextFieldValorFinal.setEditable(false);
        jFormattedTextFieldValorFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextFieldValorFinal.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanelValoresLayout = new javax.swing.GroupLayout(jPanelValores);
        jPanelValores.setLayout(jPanelValoresLayout);
        jPanelValoresLayout.setHorizontalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresLayout.createSequentialGroup()
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelValorTotal)
                        .addGap(41, 41, 41)
                        .addComponent(jLabelValorEntrada)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelParcelas)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jFormattedTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jFormattedTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jFormattedTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jFormattedTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelValoresLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelValorParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldValorParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jButtonVerParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelValoresLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelLabelValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelValoresLayout.setVerticalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jLabelValorEntrada)
                    .addComponent(jLabelParcelas)
                    .addComponent(jLabelJuros)
                    .addComponent(jLabel2))
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addComponent(jLabelValorParcelado)
                        .addGap(1, 1, 1)
                        .addComponent(jFormattedTextFieldValorParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonVerParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addComponent(jLabelLabelValorFinal)
                        .addGap(0, 0, 0)
                        .addComponent(jFormattedTextFieldValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTableParcelas.setEnabled(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listParcelas, jTableParcelas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parParcela}"));
        columnBinding.setColumnName("Parcela");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parValorInicial}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataVenc}"));
        columnBinding.setColumnName("Data Vencto.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneParcelas.setViewportView(jTableParcelas);
        if (jTableParcelas.getColumnModel().getColumnCount() > 0) {
            jTableParcelas.getColumnModel().getColumn(0).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableParcelas.getColumnModel().getColumn(1).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableParcelas.getColumnModel().getColumn(2).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jPanelBarraTitulo1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo1.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo1.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelLabelTituloFinalizarVenda.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelTituloFinalizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTituloFinalizarVenda.setText("FINALIZAR VENDA / O.S. - PAGAMENTO");

        javax.swing.GroupLayout jPanelBarraTitulo1Layout = new javax.swing.GroupLayout(jPanelBarraTitulo1);
        jPanelBarraTitulo1.setLayout(jPanelBarraTitulo1Layout);
        jPanelBarraTitulo1Layout.setHorizontalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelTituloFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraTitulo1Layout.setVerticalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelTituloFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(367, 47));
        jPanel3.setMinimumSize(new java.awt.Dimension(367, 47));

        jButtonConcluirVenda.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonConcluirVenda.setText("CONCLUIR VENDA");
        jButtonConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirVendaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setText("CANCELAR VENDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConcluirVenda))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonConcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelLabelCodVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCodVenda))
                    .addComponent(jPanelFormaPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelValores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneParcelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodVenda)
                    .addComponent(jLabelLabelCodVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelValores, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldEntradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEntradaFocusGained
        NumberFormat nf = NumberFormat.getInstance();
        try {
            valor = nf.parse(String.valueOf(jFormattedTextFieldEntrada.getText())).doubleValue();
        } catch (ParseException ex) {
            //
        }
        if(jFormattedTextFieldEntrada.getText().equals("0.00") || jFormattedTextFieldEntrada.getText().equals("0"))
            jFormattedTextFieldEntrada.setText("");
    }//GEN-LAST:event_jFormattedTextFieldEntradaFocusGained

    private void jFormattedTextFieldEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEntradaFocusLost
        NumberFormat nf = NumberFormat.getInstance();
        if(jFormattedTextFieldEntrada.getText().equals("") || jFormattedTextFieldEntrada.getText().equals("0")){
            jFormattedTextFieldEntrada.setText("0.00");
        } try {
            if(!(valor == nf.parse(String.valueOf(jFormattedTextFieldEntrada.getText())).doubleValue())){
                if((nf.parse(String.valueOf(jFormattedTextFieldEntrada.getText())).doubleValue()) > 
                        nf.parse(String.valueOf(jFormattedTextFieldTotal.getText())).doubleValue()){
                    JOptionPane.showMessageDialog(null, "Valor de entrada inválida\nValor MAIOR que o total da compra!");
                    jFormattedTextFieldEntrada.setText("0");
                    jFormattedTextFieldEntrada.requestFocus();
                } else {
                    calculaTotais();
                }
                jFormattedTextFieldValorFinal.setText("");
                jFormattedTextFieldValorFinal.setEnabled(false);
                listParcelas.clear();
            }
        } catch (ParseException ex) {
            Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jFormattedTextFieldEntradaFocusLost

    private void jFormattedTextFieldEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEntradaKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jFormattedTextFieldEntrada.setText(jFormattedTextFieldEntrada.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextFieldEntradaKeyTyped

    private void jButtonVerParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerParcelasActionPerformed
        int valida = validaItem(0);
        if(valida == 1){
            try {
                calculaTotais();
            } catch (ParseException ex) {
                //
            }
            NumberFormat nf = NumberFormat.getInstance();
            jTableParcelas.clearSelection();
            listParcelas.clear();
            try {
                double valorparcelado = nf.parse(String.valueOf(jFormattedTextFieldValorParcelado.getText())).doubleValue();
                Integer parcelas = Integer.parseInt(jFormattedTextFieldParcelas.getText());
                double taxa = nf.parse(String.valueOf(jFormattedTextFieldJuros.getText())).doubleValue();
                Double valorParcela = valorparcelado / parcelas;
                Double valorFinal = 0.00;
                for(int i=0;i<parcelas;i++){
                    valorParcela += (valorParcela * (taxa / 100));
                    valorFinal += valorParcela;
                }
                valorParcela = valorFinal / parcelas;
                //jLabelValorFinal.setText("R$ " + nf.parse(String.format("%.8f", String.valueOf(valorParcela * parcelas))));
                jFormattedTextFieldValorFinal.setEnabled(true);
                jFormattedTextFieldValorFinal.setValue(Double.parseDouble(String.valueOf(valorParcela * parcelas)));
                java.util.Date dataInicial = (java.util.Date)jFormattedTextFieldData.getValue();
                Calendar calendarInicial = Calendar.getInstance();
                calendarInicial.setTime(dataInicial);

                int i;
                for(i=0;i<parcelas;i++){
                    calendarInicial.add(Calendar.MONTH, 1);
                    listParcelas.add(new Parcela((i+1), calendarInicial.getTime(), valorParcela, "Ativo","venda"));
                }
            } catch (ParseException ex) {
                Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_jButtonVerParcelasActionPerformed

    private void jComboBoxFormaPagtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagtoActionPerformed
        if(jComboBoxFormaPagto.getSelectedIndex()==1){
            jFormattedTextFieldJuros.setEnabled(true);
            jFormattedTextFieldParcelas.setEnabled(true);
            jFormattedTextFieldEntrada.setEnabled(true);
            jFormattedTextFieldValorParcelado.setEnabled(true);
            jButtonVerParcelas.setEnabled(true);
            jFormattedTextFieldEntrada.requestFocus();
        } else {
            jFormattedTextFieldJuros.setText("0");
            jFormattedTextFieldParcelas.setText("0");
            jFormattedTextFieldEntrada.setText("0");
            jFormattedTextFieldValorFinal.setText("");
            jButtonVerParcelas.setEnabled(false);
            jFormattedTextFieldJuros.setEnabled(false);
            jFormattedTextFieldParcelas.setEnabled(false);
            jFormattedTextFieldEntrada.setEnabled(false);
            jFormattedTextFieldValorParcelado.setEnabled(false);            
            jFormattedTextFieldValorFinal.setEnabled(false);
            listParcelas.clear();
            jTableParcelas.clearSelection();
            jTableParcelas.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxFormaPagtoActionPerformed

    private int validaItem(int tipo){
        if(jComboBoxFormaPagto.getSelectedIndex() == 1){
            if((jFormattedTextFieldTotal.getText().equals("")) ||
                    jFormattedTextFieldEntrada.getText().equals("") ||
                    jFormattedTextFieldParcelas.getText().equals("") ||
                    jFormattedTextFieldParcelas.getText().equals("0") ||                    
                    jFormattedTextFieldJuros.getText().equals("") ||                    
                    jFormattedTextFieldValorParcelado.getText().equals("")){               
                jFormattedTextFieldTotal.setBackground(Color.CYAN);
                jFormattedTextFieldEntrada.setBackground(Color.CYAN);
                jFormattedTextFieldParcelas.setBackground(Color.CYAN);
                jFormattedTextFieldJuros.setText("0");
                jFormattedTextFieldValorParcelado.setBackground(Color.CYAN);
                jFormattedTextFieldValorFinal.setBackground(Color.CYAN);
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
                jFormattedTextFieldTotal.requestFocus();
                if(!jFormattedTextFieldTotal.getText().equals("")){
                    jFormattedTextFieldTotal.setBackground(Color.WHITE);
                    jFormattedTextFieldEntrada.requestFocus();
                }
                if(!jFormattedTextFieldEntrada.getText().equals("")){
                    jFormattedTextFieldEntrada.setBackground(Color.WHITE);
                    jFormattedTextFieldParcelas.requestFocus();
                }
                if((!jFormattedTextFieldParcelas.getText().equals("")) && (!jFormattedTextFieldParcelas.getText().equals("0"))){
                    jFormattedTextFieldParcelas.setBackground(Color.WHITE);
                    jFormattedTextFieldJuros.requestFocus();
                }
                if(!jFormattedTextFieldJuros.getText().equals("")){
                    jFormattedTextFieldValorParcelado.requestFocus();
                }
                if(!jFormattedTextFieldValorParcelado.getText().equals("")){
                    jFormattedTextFieldValorParcelado.setBackground(Color.WHITE);
                    jFormattedTextFieldValorFinal.requestFocus();
                } 
                if(!jFormattedTextFieldValorFinal.getText().equals("")){
                    jFormattedTextFieldValorFinal.setBackground(Color.WHITE);
                } 
                return 0;
            }
            jFormattedTextFieldTotal.setBackground(Color.WHITE);
            jFormattedTextFieldEntrada.setBackground(Color.WHITE);
            jFormattedTextFieldParcelas.setBackground(Color.WHITE);
            jFormattedTextFieldValorParcelado.setBackground(Color.WHITE);
            jFormattedTextFieldValorFinal.setBackground(Color.WHITE);
            if(tipo == 1){ //1 = concluir / 0 = ver
                if(jFormattedTextFieldValorFinal.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Clique em Visualizar para gerar as Parcelas!");                
                    return 0;
                }
            }
        }
        return 1;
    }
    
    private void gravarVendaAVista(){
        //gravar o valor pago a vista na tabela movimento
        NumberFormat nf = NumberFormat.getInstance();
        java.util.Date dataPagto = new Date();
        Calendar calendarPagto = Calendar.getInstance();
        calendarPagto.setTime(dataPagto);
        Movimento mov = new Movimento();
        if(jComboBoxFormaPagto.getSelectedIndex()==0){                
            try {
                mov = new Movimento("entrada", "entrada", calendarPagto.getTime(), 
                        nf.parse(jFormattedTextFieldTotal.getText()).doubleValue());
            } catch (ParseException ex) {
                Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                mov = new Movimento("entrada", "entrada", calendarPagto.getTime(),
                        nf.parse(jFormattedTextFieldEntrada.getText()).doubleValue());
            } catch (ParseException ex) {
                Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mov.adicionarVenda(listVenda.get(0));
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(mov);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, a entrada não foi cadastrada!\nErro:" + e);
            if(!entityManager.getTransaction().isActive())
                entityManager.getTransaction().begin();
            entityManager.getTransaction().rollback();
        }

        //gravar taxa de juros na tabela venda
        if(!jFormattedTextFieldJuros.getText().equals("0")){
            Venda ven = new Venda(listVenda.get(0).getIdVenda(),
                                  listVenda.get(0).getVenDataVenda(),
                                  listVenda.get(0).getVenDesconto(),
                                  listVenda.get(0).getVenStatus(),
                                  listVenda.get(0).getVenValorTotal(),
                                  listVenda.get(0).getVenTaxaJuros() + 
                                          Double.parseDouble(String.valueOf(jFormattedTextFieldJuros.getValue())),
                                  listVenda.get(0).isVenOrcamento(),
                                  listVenda.get(0).getUsuario(),
                                  listVenda.get(0).getCliente(),
                                  listVenda.get(0).getVeiculo());

            try {
                entityManager.getTransaction().begin();
                ven = entityManager.merge(ven);
                entityManager.persist(ven);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar taxa de juros");
            }
        }
    }
    
    private void gravarVendaAPrazo(){
        //gravar o valor pago a vista na tabela movimento
        NumberFormat nf = NumberFormat.getInstance();
        java.util.Date dataPagto = new Date();
        Calendar calendarPagto = Calendar.getInstance();
        calendarPagto.setTime(dataPagto);
        //gerar parcelas
        double valorparcelado = 0.00;
        try {
            valorparcelado = nf.parse(String.valueOf(jFormattedTextFieldValorParcelado.getText())).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer parcelas = Integer.parseInt(jFormattedTextFieldParcelas.getText());
        double taxa = 0.00;
        try {
            taxa = nf.parse(String.valueOf(jFormattedTextFieldJuros.getText())).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        Double valorParcela = valorparcelado / parcelas;
        Double valorFinal = 0.00;
        for(int i=0;i<parcelas;i++){
            valorParcela += (valorParcela * (taxa / 100));
            valorFinal += valorParcela;
        }
        valorParcela = valorFinal / parcelas;
        //jLabelValorFinal.setText("R$ " + nf.parse(String.format("%.8f", String.valueOf(valorParcela * parcelas))));
        jFormattedTextFieldValorFinal.setValue(Double.parseDouble(String.valueOf(valorParcela * parcelas)));
        java.util.Date dataInicial = (java.util.Date)jFormattedTextFieldData.getValue();
        Calendar calendarInicial = Calendar.getInstance();
        calendarInicial.setTime(dataInicial);

        int i;
        for(i=0;i<parcelas;i++){
            calendarInicial.add(Calendar.MONTH, 1);
            listParcelas.add(new Parcela((i+1), calendarInicial.getTime(), valorParcela, "Ativo", "venda"));

            //gravar as parcelas da venda na tabela parcela
            int linha = listParcelas.size() - 1;
            jTableParcelas.setRowSelectionInterval(linha, linha);
            int linhaSelecionada = jTableParcelas.getSelectedRow();
            Parcela par = listParcelas.get(linhaSelecionada);
            par.adicionarVenda(listVenda.get(0));
            try {
                entityManager.getTransaction().begin();
                entityManager.persist(par);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar as "
                        + "parcelas da venda!\nErro: " + e);
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
            }
        }
    }
    
    private void jButtonConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirVendaActionPerformed
        int valida = validaItem(1);
        if(valida == 1){
            NumberFormat nf = NumberFormat.getInstance();
            jTableParcelas.clearSelection();
            listParcelas.clear();
            if(jComboBoxFormaPagto.getSelectedIndex() == 0){
                int confirma;
                confirma = JOptionPane.showConfirmDialog(null, "Confirma pagamento do "
                        + "valor total à vista?","Atenção",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(confirma == 0){ //venda a vista
                    gravarVendaAVista();
                    limparCampos();
                    listParcelas.clear();
                    jTableParcelas.clearSelection();
                    status = 1;
                    dispose();
                }
            } else if(jComboBoxFormaPagto.getSelectedIndex() == 1){
                gravarVendaAVista();
                gravarVendaAPrazo();
                limparCampos();
                listParcelas.clear();
                jTableParcelas.clearSelection();
                status = 1;
                dispose();
            }
        }
    }//GEN-LAST:event_jButtonConcluirVendaActionPerformed

    private void jFormattedTextFieldParcelasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldParcelasFocusGained
        NumberFormat nf = NumberFormat.getInstance();
        try {
            valor = nf.parse(String.valueOf(jFormattedTextFieldParcelas.getText())).doubleValue();
        } catch (ParseException ex) {
            //
        }
        if(jFormattedTextFieldParcelas.getText().equals("0.00") || jFormattedTextFieldParcelas.getText().equals("0"))
            jFormattedTextFieldParcelas.setText("");
    }//GEN-LAST:event_jFormattedTextFieldParcelasFocusGained

    private void jFormattedTextFieldParcelasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldParcelasFocusLost
        NumberFormat nf = NumberFormat.getInstance();
        if(jFormattedTextFieldParcelas.getText().equals("") || jFormattedTextFieldParcelas.getText().equals("0")){
            jFormattedTextFieldParcelas.setText("0.00");
        } try {
            if(!(valor == nf.parse(String.valueOf(jFormattedTextFieldParcelas.getText())).doubleValue())){
                calculaTotais();
                jFormattedTextFieldValorFinal.setText("");
                jFormattedTextFieldValorFinal.setEnabled(false);
                listParcelas.clear();
            }
        } catch (ParseException ex) {
            Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jFormattedTextFieldParcelasFocusLost

    private void jFormattedTextFieldJurosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldJurosFocusGained
        NumberFormat nf = NumberFormat.getInstance();
        try {
            valor = nf.parse(String.valueOf(jFormattedTextFieldJuros.getText())).doubleValue();
        } catch (ParseException ex) {
            //
        }
        if(jFormattedTextFieldJuros.getText().equals("0.00") || jFormattedTextFieldJuros.getText().equals("0"))
            jFormattedTextFieldJuros.setText("");
    }//GEN-LAST:event_jFormattedTextFieldJurosFocusGained

    private void jFormattedTextFieldJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldJurosFocusLost
        NumberFormat nf = NumberFormat.getInstance();
        if(jFormattedTextFieldJuros.getText().equals("") || jFormattedTextFieldJuros.getText().equals("0")){
            jFormattedTextFieldJuros.setText("0.00");
        } try {
            if(!(valor == nf.parse(String.valueOf(jFormattedTextFieldJuros.getText())).doubleValue())){
                calculaTotais();
                jFormattedTextFieldValorFinal.setText("");
                jFormattedTextFieldValorFinal.setEnabled(false);
                listParcelas.clear();
            }
        } catch (ParseException ex) {
            Logger.getLogger(JFrameFinalizaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jFormattedTextFieldJurosFocusLost

    private void jFormattedTextFieldParcelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldParcelasKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jFormattedTextFieldParcelas.setText(jFormattedTextFieldParcelas.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextFieldParcelasKeyTyped

    private void jFormattedTextFieldJurosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldJurosKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jFormattedTextFieldJuros.setText(jFormattedTextFieldJuros.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }   
    }//GEN-LAST:event_jFormattedTextFieldJurosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
        if (cancelar == 0) { //sim
            this.status = 0;
            dispose();
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculaTotais() throws ParseException{
        NumberFormat nf = NumberFormat.getInstance();
        double valorvenda = nf.parse(String.valueOf(jFormattedTextFieldTotal.getText())).doubleValue();
        double valorentrada = nf.parse(String.valueOf(jFormattedTextFieldEntrada.getText())).doubleValue();
        Double valorparcelado = Double.parseDouble(String.valueOf(valorvenda)) - Double.parseDouble(String.valueOf(valorentrada));
        jFormattedTextFieldEntrada.setValue(Double.parseDouble(String.valueOf(valorentrada)));
        jFormattedTextFieldValorParcelado.setValue(Double.parseDouble(String.valueOf(valorparcelado)));
    }
    
    private void limparCampos(){
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldEntrada.setText("");
        jFormattedTextFieldJuros.setText("");
        jFormattedTextFieldParcelas.setText("");
        jFormattedTextFieldTotal.setText("");
        jFormattedTextFieldValorFinal.setText("");
        jFormattedTextFieldValorParcelado.setText("");        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConcluirVenda;
    private javax.swing.JButton jButtonVerParcelas;
    private javax.swing.JComboBox<String> jComboBoxFormaPagto;
    private javax.swing.JComboBox<String> jComboBoxTipoPagto;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldJuros;
    private javax.swing.JFormattedTextField jFormattedTextFieldParcelas;
    private javax.swing.JFormattedTextField jFormattedTextFieldTotal;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorParcelado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodVenda;
    private javax.swing.JLabel jLabelJuros;
    private javax.swing.JLabel jLabelLabelCodVenda;
    private javax.swing.JLabel jLabelLabelTituloFinalizarVenda;
    private javax.swing.JLabel jLabelLabelValorFinal;
    private javax.swing.JLabel jLabelParcelas;
    private javax.swing.JLabel jLabelValorEntrada;
    private javax.swing.JLabel jLabelValorParcelado;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarraTitulo1;
    private javax.swing.JPanel jPanelFormaPagamento;
    private javax.swing.JPanel jPanelValores;
    private javax.swing.JScrollPane jScrollPaneParcelas;
    private javax.swing.JTable jTableParcelas;
    private java.util.List<Parcela> listParcelas;
    private java.util.List<Venda> listVenda;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
