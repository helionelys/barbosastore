package br.com.barbosasys.view;

import br.com.barbosasys.controller.FornecedorController;
import br.com.barbosasys.model.Fornecedor;
import br.com.barbosasys.model.Lancamento;
import br.com.barbosasys.controller.LancamentoController;
import br.com.barbosasys.controller.TipoPagamentoController;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.Pessoa;
import br.com.barbosasys.model.TipoPagamento;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author helionelys
 */
public class ContasReceberView extends javax.swing.JDialog {

    Lancamento lancamento = new Lancamento();
    Fornecedor fornecedor = new Fornecedor();
    FornecedorController fornecedorController = new FornecedorController();
    Pessoa pessoa = new Pessoa();
    ArrayList<Lancamento> listaLancamentoContaAReceber = new ArrayList<>();
    LancamentoController lancamentoController = new LancamentoController();
    TipoPagamentoController tipoPagamentoController = new TipoPagamentoController();
    ArrayList<TipoPagamento> listaTipoPagamentos = new ArrayList<>();
    String tipoCadastro = "cadastro";
    DecimalFormat valoresMonentarios = new DecimalFormat("#,##0.00");
    DetalheLancamentoRecebidoView telaDetalheLancamentoRecebido = new DetalheLancamentoRecebidoView(this, rootPaneCheckingEnabled);


    /**
     * Creates new form ContasPagarView
     */
    public ContasReceberView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DadosLimpeza();
        camposDesativados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPaneContaAPagar = new javax.swing.JTabbedPane();
        jpContasAPagar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLancamentoAReceberPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLancamentosAReceber = new javax.swing.JTable();
        btnContasAReceberExcluir = new javax.swing.JButton();
        btnContasARecebrCancelar = new javax.swing.JButton();
        btnContasAReceberIncluir = new javax.swing.JButton();
        btnContasAReceberEditar = new javax.swing.JButton();
        btnLancamentosAReceberImprimir = new javax.swing.JButton();
        btnLancamentosReceber = new javax.swing.JButton();
        jpContasPagas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtLancamentoRecebidosPesquisar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLancamentosRecebidos = new javax.swing.JTable();
        btnLancamentosRecebidosRevogar = new javax.swing.JButton();
        btnLancamentosRecebidosCancelar = new javax.swing.JButton();
        btnLancamentosRecebidosImprimir = new javax.swing.JButton();
        btnLancamentosRecebidosDetalhe = new javax.swing.JButton();
        jpLancamentosContasAPagar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLancamentoCodCliente = new javax.swing.JTextField();
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
        txtLancamentoDescricao = new javax.swing.JTextField();
        txtLancamentoDataVencimento = new javax.swing.JFormattedTextField();
        txtLancamentoDataInclusao = new javax.swing.JFormattedTextField();
        cbLancamentoTipoPagamento = new javax.swing.JComboBox<>();
        btnLancamentoCancelar = new javax.swing.JButton();
        btnLancamentoSalvar = new javax.swing.JButton();
        btnLancamentoBuscaCliente = new javax.swing.JButton();
        txtLancamentoNomeCliente = new javax.swing.JTextField();
        txtLancamentoValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Contas a receber");

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

        jLabel1.setText("Cliente:");

        txtLancamentoAReceberPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLancamentoAReceberPesquisarKeyReleased(evt);
            }
        });

        tblLancamentosAReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Cliente", "Data", "Vencimento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLancamentosAReceber);
        if (tblLancamentosAReceber.getColumnModel().getColumnCount() > 0) {
            tblLancamentosAReceber.getColumnModel().getColumn(0).setMinWidth(60);
            tblLancamentosAReceber.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblLancamentosAReceber.getColumnModel().getColumn(0).setMaxWidth(60);
            tblLancamentosAReceber.getColumnModel().getColumn(1).setMinWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(1).setPreferredWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(1).setMaxWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(2).setMinWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(2).setPreferredWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(2).setMaxWidth(220);
            tblLancamentosAReceber.getColumnModel().getColumn(3).setMinWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(3).setMaxWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(4).setMinWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(4).setMaxWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(5).setMinWidth(80);
            tblLancamentosAReceber.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        btnContasAReceberExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Delete.png"))); // NOI18N
        btnContasAReceberExcluir.setText("Excluir");
        btnContasAReceberExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasAReceberExcluirActionPerformed(evt);
            }
        });

        btnContasARecebrCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Exit.png"))); // NOI18N
        btnContasARecebrCancelar.setText("Cancelar");
        btnContasARecebrCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasARecebrCancelarActionPerformed(evt);
            }
        });

        btnContasAReceberIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Add.png"))); // NOI18N
        btnContasAReceberIncluir.setText("Incluir");
        btnContasAReceberIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasAReceberIncluirActionPerformed(evt);
            }
        });

        btnContasAReceberEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Modify.png"))); // NOI18N
        btnContasAReceberEditar.setText("Editar");
        btnContasAReceberEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasAReceberEditarActionPerformed(evt);
            }
        });

        btnLancamentosAReceberImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/print22.png"))); // NOI18N
        btnLancamentosAReceberImprimir.setText("Imprimir");

        btnLancamentosReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Dollar.png"))); // NOI18N
        btnLancamentosReceber.setText("Receber");
        btnLancamentosReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentosReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContasAPagarLayout = new javax.swing.GroupLayout(jpContasAPagar);
        jpContasAPagar.setLayout(jpContasAPagarLayout);
        jpContasAPagarLayout.setHorizontalGroup(
            jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jpContasAPagarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLancamentoAReceberPesquisar))
                    .addGroup(jpContasAPagarLayout.createSequentialGroup()
                        .addComponent(btnLancamentosReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLancamentosAReceberImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContasAReceberIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasAReceberEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasAReceberExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContasARecebrCancelar)))
                .addContainerGap())
        );

        jpContasAPagarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnContasAReceberEditar, btnContasAReceberExcluir, btnContasAReceberIncluir, btnContasARecebrCancelar});

        jpContasAPagarLayout.setVerticalGroup(
            jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLancamentoAReceberPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContasAReceberExcluir)
                    .addComponent(btnContasARecebrCancelar)
                    .addComponent(btnContasAReceberIncluir)
                    .addComponent(btnContasAReceberEditar)
                    .addComponent(btnLancamentosAReceberImprimir)
                    .addComponent(btnLancamentosReceber))
                .addContainerGap())
        );

        jpContasAPagarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnContasAReceberEditar, btnContasAReceberExcluir, btnContasAReceberIncluir, btnContasARecebrCancelar});

        jpContasAPagarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLancamentosAReceberImprimir, btnLancamentosReceber});

        jTabbedPaneContaAPagar.addTab("Contas a Receber", jpContasAPagar);

        jLabel6.setText("Cliente:");

        txtLancamentoRecebidosPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLancamentoRecebidosPesquisarKeyReleased(evt);
            }
        });

        tblLancamentosRecebidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Cliente", "Data", "Vencimento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblLancamentosRecebidos);
        if (tblLancamentosRecebidos.getColumnModel().getColumnCount() > 0) {
            tblLancamentosRecebidos.getColumnModel().getColumn(0).setMinWidth(60);
            tblLancamentosRecebidos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblLancamentosRecebidos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblLancamentosRecebidos.getColumnModel().getColumn(1).setMinWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(1).setPreferredWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(1).setMaxWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(2).setMinWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(2).setPreferredWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(2).setMaxWidth(220);
            tblLancamentosRecebidos.getColumnModel().getColumn(3).setMinWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(3).setMaxWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(4).setMinWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(4).setMaxWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(5).setMinWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblLancamentosRecebidos.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        btnLancamentosRecebidosRevogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Back.png"))); // NOI18N
        btnLancamentosRecebidosRevogar.setText("Revogar Recebimento");
        btnLancamentosRecebidosRevogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentosRecebidosRevogarActionPerformed(evt);
            }
        });

        btnLancamentosRecebidosCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Exit.png"))); // NOI18N
        btnLancamentosRecebidosCancelar.setText("Cancelar");
        btnLancamentosRecebidosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentosRecebidosCancelarActionPerformed(evt);
            }
        });

        btnLancamentosRecebidosImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/print22.png"))); // NOI18N
        btnLancamentosRecebidosImprimir.setText("Imprimir");

        btnLancamentosRecebidosDetalhe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Report.png"))); // NOI18N
        btnLancamentosRecebidosDetalhe.setText("Detalhe ");
        btnLancamentosRecebidosDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentosRecebidosDetalheActionPerformed(evt);
            }
        });

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
                        .addComponent(txtLancamentoRecebidosPesquisar))
                    .addGroup(jpContasPagasLayout.createSequentialGroup()
                        .addComponent(btnLancamentosRecebidosImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLancamentosRecebidosDetalhe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLancamentosRecebidosRevogar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLancamentosRecebidosCancelar)))
                .addContainerGap())
        );
        jpContasPagasLayout.setVerticalGroup(
            jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContasPagasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLancamentoRecebidosPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLancamentosRecebidosRevogar)
                        .addComponent(btnLancamentosRecebidosCancelar))
                    .addGroup(jpContasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLancamentosRecebidosImprimir)
                        .addComponent(btnLancamentosRecebidosDetalhe)))
                .addContainerGap())
        );

        jTabbedPaneContaAPagar.addTab("Contas Recebidas", jpContasPagas);

        jLabel3.setText("Clientes");

        txtLancamentoCodCliente.setEditable(false);
        txtLancamentoCodCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Laçamento:");

        txtLancamentoNumero.setEditable(false);
        txtLancamentoNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Descrição da Conta:");

        jLabel7.setText("Valor:");

        jLabel8.setText("Vencimento:");

        labelPagamento.setText("Data Lançamento:");

        jLabel10.setText("Tipo de pagamento:");

        jLabel11.setText("Observação:");

        txtLancamentoObservacao.setColumns(20);
        txtLancamentoObservacao.setRows(5);
        jScrollPane3.setViewportView(txtLancamentoObservacao);

        try {
            txtLancamentoDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLancamentoDataVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLancamentoDataInclusao.setEditable(false);
        try {
            txtLancamentoDataInclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLancamentoDataInclusao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnLancamentoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Exit.png"))); // NOI18N
        btnLancamentoCancelar.setText("Cancelar");
        btnLancamentoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentoCancelarActionPerformed(evt);
            }
        });

        btnLancamentoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Save.png"))); // NOI18N
        btnLancamentoSalvar.setText("Salvar");
        btnLancamentoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentoSalvarActionPerformed(evt);
            }
        });

        btnLancamentoBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnLancamentoBuscaCliente.setText("Buscar");
        btnLancamentoBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancamentoBuscaClienteActionPerformed(evt);
            }
        });

        txtLancamentoNomeCliente.setEditable(false);

        txtLancamentoValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

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
                    .addComponent(txtLancamentoDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                        .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                .addComponent(txtLancamentoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbLancamentoTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLancamentoDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLancamentoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLancamentoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLancamentosContasAPagarLayout.createSequentialGroup()
                                .addComponent(txtLancamentoCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLancamentoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLancamentoBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtLancamentoCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLancamentoBuscaCliente)
                    .addComponent(txtLancamentoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLancamentoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagamento)
                    .addComponent(txtLancamentoDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtLancamentoDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLancamentosContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbLancamentoTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtLancamentoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTabbedPaneContaAPagar.addTab("Lançamentos de Contas a Receber", jpLancamentosContasAPagar);

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

    private void btnLancamentoBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentoBuscaClienteActionPerformed
        // TODO add your handling code here:
        BuscarClientesAReceberView telaBuscaCliente = new BuscarClientesAReceberView(this, rootPaneCheckingEnabled);
        telaBuscaCliente.setVisible(true);

        txtLancamentoCodCliente.setText(String.valueOf(telaBuscaCliente.getCodigoCliente()));
        txtLancamentoNomeCliente.setText(String.valueOf(telaBuscaCliente.getNomeCliente()));
    }//GEN-LAST:event_btnLancamentoBuscaClienteActionPerformed

    private void btnContasAReceberIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasAReceberIncluirActionPerformed
        // TODO add your handling code here:
        this.DadosLimpeza();
        this.camposAtivados();
        jTabbedPaneContaAPagar.setSelectedIndex(2);
    }//GEN-LAST:event_btnContasAReceberIncluirActionPerformed

    private void btnLancamentoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentoSalvarActionPerformed
        // TODO add your handling code here:
        if (txtLancamentoDescricao.getText().equals("") || txtLancamentoDataVencimento.getText().equals("")
                || txtLancamentoDataVencimento.getText().equals("")) 
                //|| txtLancamentoDataPagamento.getText().equals(""))
                {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos corretamente", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else if (tipoCadastro.equals("cadastro")) {
            this.salvarLancamento();
            jTabbedPaneContaAPagar.setSelectedIndex(0);
            this.camposDesativados();
        } else {
            this.alterarLancamento();
            jTabbedPaneContaAPagar.setSelectedIndex(0);
            this.camposDesativados();
        }
    }//GEN-LAST:event_btnLancamentoSalvarActionPerformed

    private void btnContasAReceberEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasAReceberEditarActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
//          int linha = tblLancamentosAPagar.getSelectedRow();
//          int codigoLancamento = (int) tblLancamentosAPagar.getValueAt(linha, 0);
            //this.DadosLimpeza();
            tipoCadastro = "alteracao";
            this.recuperarLancamento();
            jTabbedPaneContaAPagar.setSelectedIndex(2);
            this.camposAtivados();
        }
    }//GEN-LAST:event_btnContasAReceberEditarActionPerformed

    private void btnContasARecebrCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasARecebrCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnContasARecebrCancelarActionPerformed

    private void btnLancamentosRecebidosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentosRecebidosCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnLancamentosRecebidosCancelarActionPerformed

    private void btnLancamentoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentoCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnLancamentoCancelarActionPerformed

    private void btnContasAReceberExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasAReceberExcluirActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linha = tblLancamentosAReceber.getSelectedRow();
            int codLancamento = (int) tblLancamentosAReceber.getValueAt(linha, 0);
            String nomeFornecedor = (String) tblLancamentosAReceber.getValueAt(linha, 2);
            String valor = (String) tblLancamentosAReceber.getValueAt(linha, 5);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o lancamento"
                    + "?\n" + "Codigo: " + codLancamento + "\n" + "Fornecedor: " + nomeFornecedor + "\n" + "Valor: R$ " + valor, "Atenção", JOptionPane.YES_NO_OPTION);

            ////se sim exclui, se não, faz nada3
            if (opcao == JOptionPane.OK_OPTION) {
                if (lancamentoController.excluirLancamentoController(codLancamento)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                    carregarLancamentosAReceberAberto();
                    carregarLancamentosAReceberBaixados();
                    jTabbedPaneContaAPagar.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnContasAReceberExcluirActionPerformed

    private void btnLancamentosReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentosReceberActionPerformed
        // TODO add your handling code here: if (testarSelecao() == true) {
        if (testarSelecao() == true) {
            int linha = tblLancamentosAReceber.getSelectedRow();
            int codLancamento = (int) tblLancamentosAReceber.getValueAt(linha, 0);
            String nomeFornecedor = (String) tblLancamentosAReceber.getValueAt(linha, 2);
            String valor = (String) tblLancamentosAReceber.getValueAt(linha, 5);
            
            Date dataPagamentoLancamento = new Date();
            String formatoDataMysql = ("yyyy-MM-dd");
            SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
            String dataMysql = formatarData.format(dataPagamentoLancamento);
            lancamento.setCodLancamento(codLancamento);
            lancamento.setDataPagamento(dataMysql);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Efetuar recebimento  do lancamento"
                    + "?\n" + "Codigo: " + codLancamento + "\n" + "Fornecedor: " + nomeFornecedor + "\n" + "Valor: R$ " + valor, "Atenção", JOptionPane.YES_NO_OPTION);

            ////se sim exclui, se não, faz nada3
            if (opcao == JOptionPane.OK_OPTION) {
                if (lancamentoController.baixarLancamentoController(lancamento)) {
                    JOptionPane.showMessageDialog(this, "Lancamento recebido com sucesso!");
                    carregarLancamentosAReceberAberto();
                    carregarLancamentosAReceberBaixados();
                    jTabbedPaneContaAPagar.setSelectedIndex(1);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnLancamentosReceberActionPerformed

    private void btnLancamentosRecebidosRevogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentosRecebidosRevogarActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoLancamentosBaixados()== true) {
            int linha = tblLancamentosRecebidos.getSelectedRow();
            int codLancamento = (int) tblLancamentosRecebidos.getValueAt(linha, 0);
            String nomeFornecedor = (String) tblLancamentosRecebidos.getValueAt(linha, 2);
            String valor = (String) tblLancamentosRecebidos.getValueAt(linha, 5);

            // Questiona se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Efetuar revogação de recebimento"
                    + "?\n" + "Codigo: " + codLancamento + "\n" + "Fornecedor: " + nomeFornecedor + "\n" + "Valor: R$ " + valor, "Atenção", JOptionPane.YES_NO_OPTION);

            ////se sim exclui, se não, faz nada3
            if (opcao == JOptionPane.OK_OPTION) {
                if (lancamentoController.revogarLancamentoController(codLancamento)) {
                    JOptionPane.showMessageDialog(this, "Lancamento revogado com sucesso!");
                    carregarLancamentosAReceberAberto();
                    carregarLancamentosAReceberBaixados();
                    jTabbedPaneContaAPagar.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnLancamentosRecebidosRevogarActionPerformed

    private void txtLancamentoAReceberPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLancamentoAReceberPesquisarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dadosPesquisar = (DefaultTableModel) this.tblLancamentosAReceber.getModel();
        final TableRowSorter<TableModel> pesquisa = new TableRowSorter<TableModel>(dadosPesquisar);
        this.tblLancamentosAReceber.setRowSorter(pesquisa);
        String text = txtLancamentoAReceberPesquisar.getText();
        pesquisa.setRowFilter(RowFilter.regexFilter(text, 2));
    }//GEN-LAST:event_txtLancamentoAReceberPesquisarKeyReleased

    private void txtLancamentoRecebidosPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLancamentoRecebidosPesquisarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dadosPesquisar = (DefaultTableModel) this.tblLancamentosRecebidos.getModel();
        final TableRowSorter<TableModel> pesquisa = new TableRowSorter<TableModel>(dadosPesquisar);
        this.tblLancamentosRecebidos.setRowSorter(pesquisa);
        String text = txtLancamentoRecebidosPesquisar.getText();
        pesquisa.setRowFilter(RowFilter.regexFilter(text, 2));
    }//GEN-LAST:event_txtLancamentoRecebidosPesquisarKeyReleased

    private void btnLancamentosRecebidosDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancamentosRecebidosDetalheActionPerformed
        // TODO add your handling code here:
        //        if (testarSelecaoLancamentosBaixados()== true) {
            //            int linha = tblLancamentosPagos.getSelectedRow();
            //            int codLancamento = (Integer) tblLancamentosPagos.getValueAt(linha, 0);
            //            System.out.println(codLancamento);
            //            DetalheLancamentoPagoView telaDetalheLancamentoPago = new DetalheLancamentoPagoView(this, rootPaneCheckingEnabled);
            //            telaDetalheLancamentoPago.setLblCodLancamento(codLancamento);
            //        telaDetalheLancamentoPago.setVisible(true);
            if (testarSelecaoLancamentosBaixados() == true) {
                recuperarLancamentoBaixadoDetalhe();
            }
    }//GEN-LAST:event_btnLancamentosRecebidosDetalheActionPerformed

    private void DadosLimpeza() {
        listaTiposPagamento();
        carregarLancamentosAReceberAberto();
        carregarLancamentosAReceberBaixados();
        this.txtLancamentoNumero.setText("Novo Lancamento");
        this.txtLancamentoCodCliente.setText(null);
        this.txtLancamentoNomeCliente.setText(null);
        this.txtLancamentoDescricao.setText(null);
        this.txtLancamentoDataInclusao.setText(null);
        this.txtLancamentoDataVencimento.setText(null);
        this.txtLancamentoValor.setText(null);
        this.txtLancamentoObservacao.setText(null);
    }

    private void listaTiposPagamento() {
        listaTipoPagamentos = tipoPagamentoController.getListaTipoPagamentoController();
        cbLancamentoTipoPagamento.removeAllItems();
        for (int i = 0; i < listaTipoPagamentos.size(); i++) {
            cbLancamentoTipoPagamento.addItem(listaTipoPagamentos.get(i).getDescricao());
        }
    }

    private boolean testarSelecao() {
        int linhaSelecionada = tblLancamentosAReceber.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para operação");
            return false;
        }
        return true;
    }
    
    private boolean testarSelecaoLancamentosBaixados() {
        int linhaSelecionada = tblLancamentosRecebidos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para operação");
            return false;
        }
        return true;
    }

    private void camposDesativados() {
        this.txtLancamentoNumero.setEnabled(false);
        this.txtLancamentoCodCliente.setEnabled(false);
        this.txtLancamentoNomeCliente.setEnabled(false);
        this.btnLancamentoBuscaCliente.setEnabled(false);
        this.txtLancamentoDescricao.setEnabled(false);
        this.txtLancamentoDataInclusao.setEnabled(false);
        this.txtLancamentoDataVencimento.setEnabled(false);
        this.txtLancamentoValor.setEnabled(false);
        this.cbLancamentoTipoPagamento.setEnabled(false);
        this.txtLancamentoObservacao.setEnabled(false);
        this.btnLancamentoSalvar.setEnabled(false);
    }

    private void camposAtivados() {
        this.txtLancamentoNumero.setEnabled(true);
        this.txtLancamentoCodCliente.setEnabled(true);
        this.txtLancamentoNomeCliente.setEnabled(true);
        this.btnLancamentoBuscaCliente.setEnabled(true);
        this.txtLancamentoDescricao.setEnabled(true);
        this.txtLancamentoDataInclusao.setEnabled(true);
        this.txtLancamentoDataVencimento.setEnabled(true);
        this.txtLancamentoValor.setEnabled(true);
        this.cbLancamentoTipoPagamento.setEnabled(true);
        this.txtLancamentoObservacao.setEnabled(true);
        this.btnLancamentoSalvar.setEnabled(true);
    }

    private void carregarLancamentosAReceberAberto() {
        listaLancamentoContaAReceber = lancamentoController.getListaLancamentoAReceberAbertoController();
        DefaultTableModel modelo = (DefaultTableModel) tblLancamentosAReceber.getModel();
        modelo.setNumRows(0);
        int cont = listaLancamentoContaAReceber.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaLancamentoContaAReceber.get(i).getCodLancamento(),
                listaLancamentoContaAReceber.get(i).getDescricaoLancamento(),
                //listaLancamentoContaAPagar.get(i).getCliente().getCodigo(),
                listaLancamentoContaAReceber.get(i).getPessoa().getNomeRazaoSocial(),
                listaLancamentoContaAReceber.get(i).getDataLancamento(),
                listaLancamentoContaAReceber.get(i).getDataVencimento(),
                valoresMonentarios.format(listaLancamentoContaAReceber.get(i).getValorLancamento())

            });
        }
    }

    private void carregarLancamentosAReceberBaixados() {
        listaLancamentoContaAReceber = lancamentoController.getListaLancamentoAReceberBaixadoController();
        DefaultTableModel modelo = (DefaultTableModel) tblLancamentosRecebidos.getModel();
        modelo.setNumRows(0);
        int cont = listaLancamentoContaAReceber.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaLancamentoContaAReceber.get(i).getCodLancamento(),
                listaLancamentoContaAReceber.get(i).getDescricaoLancamento(),
                //listaLancamentoContaAPagar.get(i).getCliente().getCodigo(),
                listaLancamentoContaAReceber.get(i).getPessoa().getNomeRazaoSocial(),
                listaLancamentoContaAReceber.get(i).getDataLancamento(),
                listaLancamentoContaAReceber.get(i).getDataVencimento(),
                valoresMonentarios.format(listaLancamentoContaAReceber.get(i).getValorLancamento())

            });
        }
    }
    

    private boolean recuperarLancamento() {

        int linha = this.tblLancamentosAReceber.getSelectedRow();
        int codLancamento = (Integer) tblLancamentosAReceber.getValueAt(linha, 0);

        try {
            lancamento = lancamentoController.getLancamentoControllerAReceber(codLancamento);
            //Recupera os dados no banco de dados
            this.txtLancamentoNumero.setText(String.valueOf(lancamento.getCodLancamento()));
            this.txtLancamentoCodCliente.setText(String.valueOf(lancamento.getPessoa().getCodigo()));
            this.txtLancamentoNomeCliente.setText(String.valueOf(lancamento.getPessoa().getNomeRazaoSocial()));
            this.txtLancamentoDescricao.setText(lancamento.getDescricaoLancamento());

            String dataRetorno = lancamento.getDataLancamento();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataLancamentoInclusao = localDate.format(formatter2);
            this.txtLancamentoDataInclusao.setText(dataLancamentoInclusao);

            String dataRetorno2 = lancamento.getDataLancamento();
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate2 = LocalDate.parse(dataRetorno2, formatter3);
            String dataLancamentoVencimento = localDate2.format(formatter4);
            this.txtLancamentoDataVencimento.setText(dataLancamentoVencimento);

//            String dataRetorno3 = lancamento.getDataLancamento();
//            DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate localDate3 = LocalDate.parse(dataRetorno3, formatter5);
//            String dataLancamentoPagamento = localDate3.format(formatter6);
//            this.txtLancamentoDataPagamento.setText(dataLancamentoPagamento);

            Double valorLancamentoRetorno = lancamento.getValorLancamento();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String valorLancamentoTela = df.format(valorLancamentoRetorno);
            this.txtLancamentoValor.setText(valorLancamentoTela);

            this.cbLancamentoTipoPagamento.setSelectedItem(tipoPagamentoController.getTipoPagamentController(lancamento.getCodTipoPagamento()).getDescricao());
            this.txtLancamentoObservacao.setText(lancamento.getObservacao());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    private boolean salvarLancamento() {

        pessoa.setCodigo(Integer.parseInt(this.txtLancamentoCodCliente.getText()));
        lancamento.setPessoa(pessoa);
        lancamento.setDescricaoLancamento(this.txtLancamentoDescricao.getText());

        Date dataCadastramentoLancamento = new Date();
        String formatoDataMysql = ("yyyy-MM-dd");
        SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
        String dataLancamentoBanco = formatarData.format(dataCadastramentoLancamento);
        lancamento.setDataLancamento(dataLancamentoBanco);

        String dataLancamentoVencimento = this.txtLancamentoDataVencimento.getText();
        DateTimeFormatter dataRecebida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dataLancamentoVencimento, dataRecebida);
        String dataLacamentoVencimentoBanco = localDate.format(dataFormatada);
        lancamento.setDataVencimento(dataLacamentoVencimentoBanco);

//        String dataLancamentoPagamento = this.txtLancamentoDataVencimento.getText();
//        DateTimeFormatter dataRecebida2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter dataFormatada2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDate2 = LocalDate.parse(dataLancamentoPagamento, dataRecebida2);
//        String dataLacamentoPagamentoBanco = localDate.format(dataFormatada2);
//        lancamento.setDataPagamento(dataLacamentoPagamentoBanco);

        String valorLancamentoOriginal = txtLancamentoValor.getText();
        String valorLancamentoFormatado = valorLancamentoOriginal.replace(".", "");
        String valorLancamentoFormatado2 = valorLancamentoFormatado.replace(",", ".");
        Double valorBanco = Double.parseDouble(valorLancamentoFormatado2);
        lancamento.setValorLancamento(valorBanco);

        lancamento.setCodTipoPagamento(tipoPagamentoController.getTipoPagamentoController(this.cbLancamentoTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento());
        lancamento.setObservacao(this.txtLancamentoObservacao.getText());
        lancamento.setCodTipoLancamento(1);
        lancamento.setCodStatusLancamento(2);

        //Salvar
        if (lancamentoController.salvarLancamentoControllerAReceber(lancamento) > 0) {
            JOptionPane.showMessageDialog(this, "Lancamento incluído com sucesso!");
            this.DadosLimpeza();
            this.carregarLancamentosAReceberAberto();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean alterarLancamento() {
        pessoa.setCodigo(Integer.parseInt(this.txtLancamentoCodCliente.getText()));
        lancamento.setPessoa(pessoa);
        lancamento.setDescricaoLancamento(this.txtLancamentoDescricao.getText());

//        String dataLancamentoInclusao = this.txtLancamentoDataInclusao.getText();
//        DateTimeFormatter dataInRecebida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter dataInFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDateIn = LocalDate.parse(dataLancamentoInclusao, dataInRecebida);
//        String dataLacamentoInclusaoBanco = localDateIn.format(dataInFormatada);
//        lancamento.setDataVencimento(dataLacamentoInclusaoBanco);
        String dataLancamentoVencimento = this.txtLancamentoDataVencimento.getText();
        DateTimeFormatter dataRecebida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dataLancamentoVencimento, dataRecebida);
        String dataLacamentoVencimentoBanco = localDate.format(dataFormatada);
        lancamento.setDataVencimento(dataLacamentoVencimentoBanco);

//        String dataLancamentoPagamento = this.txtLancamentoDataVencimento.getText();
//        DateTimeFormatter dataRecebida2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter dataFormatada2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDate2 = LocalDate.parse(dataLancamentoPagamento, dataRecebida2);
//        String dataLacamentoPagamentoBanco = localDate.format(dataFormatada2);
//        lancamento.setDataPagamento(dataLacamentoPagamentoBanco);

        String valorLancamentoOriginal = txtLancamentoValor.getText();
        String valorLancamentoFormatado = valorLancamentoOriginal.replace(".", "");
        String valorLancamentoFormatado2 = valorLancamentoFormatado.replace(",", ".");
        Double valorBanco = Double.parseDouble(valorLancamentoFormatado2);
        lancamento.setValorLancamento(valorBanco);

        lancamento.setCodTipoPagamento(tipoPagamentoController.getTipoPagamentoController(this.cbLancamentoTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento());
        lancamento.setObservacao(this.txtLancamentoObservacao.getText());
        lancamento.setCodTipoLancamento(1);
        lancamento.setCodStatusLancamento(2);

        //Salvar
        if (lancamentoController.atualizarLancamentoControllerAPagar(lancamento)) {
            JOptionPane.showMessageDialog(this, "Lancamento Alterado com sucesso!");
            this.DadosLimpeza();
            this.carregarLancamentosAReceberAberto();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean recuperarLancamentoBaixadoDetalhe() {
        telaDetalheLancamentoRecebido = new DetalheLancamentoRecebidoView(this, rootPaneCheckingEnabled);
        try {
            int linha = this.tblLancamentosRecebidos.getSelectedRow();
            String nomeFornecedor = (String) tblLancamentosRecebidos.getValueAt(linha, 2);
            int codigoLancamento = (Integer) tblLancamentosRecebidos.getValueAt(linha, 0);
            //Recupera os dados no banco de dados
            lancamento = (lancamentoController.getLancamentoControllerAPagar(codigoLancamento));
            telaDetalheLancamentoRecebido.setLblCodLancamento(codigoLancamento);
            telaDetalheLancamentoRecebido.setTxtCodFornecedor(lancamento.getPessoa().getCodigo());
            telaDetalheLancamentoRecebido.setTxtNomeFornecedor(nomeFornecedor);
            telaDetalheLancamentoRecebido.setTxtDescricaoLancamento(lancamento.getDescricaoLancamento());

            String dataLancamento = lancamento.getDataLancamento();
            DateTimeFormatter dataLancamentoRecebida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter dataLancamentoFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataLancamento, dataLancamentoRecebida);
            String dataLacamentoTela = localDate.format(dataLancamentoFormatada);
            telaDetalheLancamentoRecebido.setTextDataLancamento(dataLacamentoTela);

            String dataLancamentoVencimento = lancamento.getDataVencimento();
            DateTimeFormatter dataRecebida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate2 = LocalDate.parse(dataLancamentoVencimento, dataRecebida);
            String dataLacamentoVencimentoTela = localDate2.format(dataFormatada);
            telaDetalheLancamentoRecebido.setTxtDataVencimento(dataLacamentoVencimentoTela);

            String dataLancamentoPagamento = lancamento.getDataPagamento();
            DateTimeFormatter dataRecebida2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate3 = LocalDate.parse(dataLancamentoPagamento, dataRecebida2);
            String dataLacamentoPagamentoTela = localDate3.format(dataFormatada2);
            telaDetalheLancamentoRecebido.setTxtDataPagamento(dataLacamentoPagamentoTela);

            Double valorLancamentoRetorno = lancamento.getValorLancamento();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String valorLancamentoTela = df.format(valorLancamentoRetorno);
            telaDetalheLancamentoRecebido.setTxtValorLancamento(valorLancamentoTela);

            telaDetalheLancamentoRecebido.setTxtTipoPagamento(String.valueOf(tipoPagamentoController.getTipoPagamentController(lancamento.getCodTipoPagamento()).getDescricao()));
            telaDetalheLancamentoRecebido.setTxtObservacao(lancamento.getObservacao());
            telaDetalheLancamentoRecebido.setVisible(true);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContasAReceberEditar;
    private javax.swing.JButton btnContasAReceberExcluir;
    private javax.swing.JButton btnContasAReceberIncluir;
    private javax.swing.JButton btnContasARecebrCancelar;
    private javax.swing.JButton btnLancamentoBuscaCliente;
    private javax.swing.JButton btnLancamentoCancelar;
    private javax.swing.JButton btnLancamentoSalvar;
    private javax.swing.JButton btnLancamentosAReceberImprimir;
    private javax.swing.JButton btnLancamentosReceber;
    private javax.swing.JButton btnLancamentosRecebidosCancelar;
    private javax.swing.JButton btnLancamentosRecebidosDetalhe;
    private javax.swing.JButton btnLancamentosRecebidosImprimir;
    private javax.swing.JButton btnLancamentosRecebidosRevogar;
    private javax.swing.JComboBox<String> cbLancamentoTipoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneContaAPagar;
    private javax.swing.JPanel jpContasAPagar;
    private javax.swing.JPanel jpContasPagas;
    private javax.swing.JPanel jpLancamentosContasAPagar;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JTable tblLancamentosAReceber;
    private javax.swing.JTable tblLancamentosRecebidos;
    private javax.swing.JTextField txtLancamentoAReceberPesquisar;
    private javax.swing.JTextField txtLancamentoCodCliente;
    private javax.swing.JFormattedTextField txtLancamentoDataInclusao;
    private javax.swing.JFormattedTextField txtLancamentoDataVencimento;
    private javax.swing.JTextField txtLancamentoDescricao;
    private javax.swing.JTextField txtLancamentoNomeCliente;
    private javax.swing.JTextField txtLancamentoNumero;
    private javax.swing.JTextArea txtLancamentoObservacao;
    private javax.swing.JTextField txtLancamentoRecebidosPesquisar;
    private javax.swing.JFormattedTextField txtLancamentoValor;
    // End of variables declaration//GEN-END:variables
}
