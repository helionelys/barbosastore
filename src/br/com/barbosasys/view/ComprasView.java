/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import br.com.barbosasys.controller.CaixaController;
import br.com.barbosasys.controller.ClienteController;
import br.com.barbosasys.controller.ProdutoController;
import br.com.barbosasys.controller.TipoPagamentoController;
import br.com.barbosasys.controller.VendaController;
import br.com.barbosasys.model.Caixa;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.ItemVenda;
import br.com.barbosasys.model.Produto;
import br.com.barbosasys.model.TipoPagamento;
import br.com.barbosasys.model.Venda;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author helionelys
 */
public class ComprasView extends javax.swing.JDialog {

    VendaController vendasController = new VendaController();
    Venda venda = new Venda();
    Produto produto = new Produto();
    ItemVenda itemVenda = new ItemVenda();
    ArrayList<Venda> listaVendas = new ArrayList<>();
    ArrayList<ItemVenda> listaItensVendas = new ArrayList<>();
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    ArrayList<Produto> listaProduto = new ArrayList<>();
    ProdutoController produtoController = new ProdutoController();
    ClienteController clienteController = new ClienteController();
    Caixa caixa = new Caixa();
    CaixaController caixaController = new CaixaController();
    TipoPagamento tipoPagamento = new TipoPagamento();
    TipoPagamentoController tipoPagamentoController = new TipoPagamentoController();
    ArrayList<TipoPagamento> listaTipoPagamento = new ArrayList<>();
    FaturamentoComprasView telaFaturamento = new FaturamentoComprasView(this, rootPaneCheckingEnabled);

    DecimalFormat valoresMonentarios = new DecimalFormat("#,##0.00");

    float valorCartao, valorCheque, valorDinheiro, valorVale;
    boolean alteracao = false;

    String precoFormatado, subTotalValorFormatado, totalValorFormatado;
    double preco, subtotal, total;
    int quantidade;
    DefaultTableModel carrinhos, itensDaVenda;

    /**
     * Creates new form VendasView
     */
    public ComprasView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarTipoPagamento();
        this.txtVendaPrecoOculto.setVisible(false);
        this.carregarVendas();
        this.carregamentoInicial();

    }

    private void carregarClientes() {

    }

    private void carregarTipoPagamento() {
        listaTipoPagamento = tipoPagamentoController.getListaTipoPagamentoController();
        cbCompraTipoPagamento.removeAllItems();
        for (int i = 0; i < listaTipoPagamento.size(); i++) {
            cbCompraTipoPagamento.addItem(listaTipoPagamento.get(i).getDescricao());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupStatusVenda = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelVendas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCompraCodFornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCompraNomeFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCompraNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCompraQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRemoverProduto = new javax.swing.JButton();
        btnIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaItensCompras = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cbCompraTipoPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCompraTotal = new javax.swing.JTextField();
        txtVendaDescricaoProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        btnBuscarFornecedor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCompraData = new javax.swing.JFormattedTextField();
        txtVendaCodProduto = new javax.swing.JTextField();
        txtVendaProdutoValorUnitario = new javax.swing.JTextField();
        txtVendaPrecoOculto = new javax.swing.JTextField();
        btnCompraCalculaDesconto = new javax.swing.JButton();
        txtCompraDesconto = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCompraObservacao = new javax.swing.JTextField();
        txtCompraStatus = new javax.swing.JTextField();
        btnCompraIncluir = new javax.swing.JButton();
        btnCompraSalvar = new javax.swing.JButton();
        btnCompraCancelar = new javax.swing.JButton();
        jPanelConsultarVendas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtConsultaVenda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComprasRealizadas = new javax.swing.JTable();
        btnConsultaCompraImprimir = new javax.swing.JButton();
        btnConsultaComprasPesquisar = new javax.swing.JButton();
        btnConsultaCompraExcluir = new javax.swing.JButton();
        btnConsultaCompraAlterar = new javax.swing.JButton();
        btnConsultaCompraCancelar = new javax.swing.JButton();
        btnCompraReprovar = new javax.swing.JButton();
        btnCompraFaturar = new javax.swing.JButton();
        rbCompraStatusAprovacaoTodos = new javax.swing.JRadioButton();
        rbCompraStatusAprovacaoAguardando = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Compras");

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

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

        txtCompraCodFornecedor.setEditable(false);
        txtCompraCodFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Fornecedor:");

        txtCompraNomeFornecedor.setEditable(false);
        txtCompraNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompraNomeFornecedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Nº da Compra");

        txtCompraNumero.setEditable(false);
        txtCompraNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCompraNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Produto:");

        txtCompraQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCompraQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompraQuantidadeActionPerformed(evt);
            }
        });
        txtCompraQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompraQuantidadeKeyTyped(evt);
            }
        });

        jLabel5.setText("QTD:");

        btnRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Close-16.png"))); // NOI18N
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnIncluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Add-16.png"))); // NOI18N
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });

        tblListaItensCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Valor", "Quantidade", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaItensCompras);

        jLabel6.setText("Tipo de Pagamento:");

        cbCompraTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Valor Desconto:");

        jLabel8.setText("Total:");

        txtCompraTotal.setEditable(false);
        txtCompraTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCompraTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtCompraTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtVendaDescricaoProduto.setEditable(false);
        txtVendaDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaDescricaoProdutoActionPerformed(evt);
            }
        });

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnBuscarProduto.setText("...");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        btnBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnBuscarFornecedor.setText("...");
        btnBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFornecedorActionPerformed(evt);
            }
        });

        jLabel10.setText("Data:");

        try {
            txtCompraData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCompraData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCompraData.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N

        txtVendaCodProduto.setEditable(false);
        txtVendaCodProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaCodProduto.setToolTipText("");

        txtVendaProdutoValorUnitario.setEditable(false);
        txtVendaProdutoValorUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtVendaProdutoValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtVendaPrecoOculto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCompraCalculaDesconto.setText("$");
        btnCompraCalculaDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraCalculaDescontoActionPerformed(evt);
            }
        });

        txtCompraDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtCompraDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCompraDesconto.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N

        jLabel11.setText("Observação:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompraCodFornecedor)
                            .addComponent(txtVendaCodProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtVendaDescricaoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaPrecoOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncluirProduto)
                                .addGap(5, 5, 5)
                                .addComponent(btnRemoverProduto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCompraNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCompraTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCompraCalculaDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompraCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCompraNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCompraNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFornecedor))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtCompraQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendaDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto)
                    .addComponent(txtVendaCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluirProduto)
                    .addComponent(btnRemoverProduto)
                    .addComponent(txtVendaProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendaPrecoOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCompraTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtCompraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCompraData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompraCalculaDesconto)
                    .addComponent(txtCompraDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCompraObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCompraDesconto, txtCompraTotal});

        txtCompraStatus.setEditable(false);
        txtCompraStatus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCompraStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCompraStatus.setText("STATUS");

        btnCompraIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnCompraIncluir.setText("Incluir");
        btnCompraIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraIncluirActionPerformed(evt);
            }
        });

        btnCompraSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnCompraSalvar.setText("Salvar");
        btnCompraSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalvarActionPerformed(evt);
            }
        });

        btnCompraCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/inativar.png"))); // NOI18N
        btnCompraCancelar.setText("Cancelar");
        btnCompraCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCompraStatus)
                .addGap(253, 253, 253)
                .addComponent(btnCompraIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompraSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompraCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVendasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCompraCancelar, btnCompraIncluir, btnCompraSalvar});

        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompraStatus)
                    .addComponent(btnCompraIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnCompraSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompraCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelVendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCompraCancelar, btnCompraIncluir, btnCompraSalvar});

        jTabbedPane1.addTab("Operacão Compras", jPanelVendas);

        jLabel9.setText("Codigo:");

        tblComprasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº da Venda", "Cliente", "Valor", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblComprasRealizadas);

        btnConsultaCompraImprimir.setText("Imprimir");

        btnConsultaComprasPesquisar.setText("Pesquisar");

        btnConsultaCompraExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        btnConsultaCompraExcluir.setText("Excluir");
        btnConsultaCompraExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCompraExcluirActionPerformed(evt);
            }
        });

        btnConsultaCompraAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnConsultaCompraAlterar.setText("Alterar");
        btnConsultaCompraAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCompraAlterarActionPerformed(evt);
            }
        });

        btnConsultaCompraCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnConsultaCompraCancelar.setText("Cancelar");
        btnConsultaCompraCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCompraCancelarActionPerformed(evt);
            }
        });

        btnCompraReprovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnCompraReprovar.setText("Reprovar");

        btnCompraFaturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/aceitar.png"))); // NOI18N
        btnCompraFaturar.setText("Fatuirar");
        btnCompraFaturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraFaturarActionPerformed(evt);
            }
        });

        rbGroupStatusVenda.add(rbCompraStatusAprovacaoTodos);
        rbCompraStatusAprovacaoTodos.setText("Todos");
        rbCompraStatusAprovacaoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompraStatusAprovacaoTodosActionPerformed(evt);
            }
        });

        rbGroupStatusVenda.add(rbCompraStatusAprovacaoAguardando);
        rbCompraStatusAprovacaoAguardando.setText("Aguardando");
        rbCompraStatusAprovacaoAguardando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompraStatusAprovacaoAguardandoActionPerformed(evt);
            }
        });

        jLabel1.setText("Status:");

        javax.swing.GroupLayout jPanelConsultarVendasLayout = new javax.swing.GroupLayout(jPanelConsultarVendas);
        jPanelConsultarVendas.setLayout(jPanelConsultarVendasLayout);
        jPanelConsultarVendasLayout.setHorizontalGroup(
            jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelConsultarVendasLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(txtConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaComprasPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaCompraImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarVendasLayout.createSequentialGroup()
                        .addComponent(btnCompraFaturar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompraReprovar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultaCompraExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaCompraAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaCompraCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarVendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCompraStatusAprovacaoTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCompraStatusAprovacaoAguardando)))
                .addContainerGap())
        );

        jPanelConsultarVendasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConsultaCompraAlterar, btnConsultaCompraCancelar, btnConsultaCompraExcluir});

        jPanelConsultarVendasLayout.setVerticalGroup(
            jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaCompraImprimir)
                    .addComponent(btnConsultaComprasPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCompraStatusAprovacaoAguardando)
                    .addComponent(rbCompraStatusAprovacaoTodos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaCompraExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaCompraAlterar)
                    .addComponent(btnConsultaCompraCancelar)
                    .addComponent(btnCompraFaturar)
                    .addComponent(btnCompraReprovar))
                .addContainerGap())
        );

        jPanelConsultarVendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConsultaCompraAlterar, btnConsultaCompraCancelar, btnConsultaCompraExcluir});

        jTabbedPane1.addTab("Consultar Compras", jPanelConsultarVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompraNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompraNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompraNomeFornecedorActionPerformed

    private void btnConsultaCompraExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCompraExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaCompraExcluirActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        // TODO add your handling code here:
        BuscarProdutosComprasView telaBuscaProduto = new BuscarProdutosComprasView(this, rootPaneCheckingEnabled);
        telaBuscaProduto.setVisible(true);

        txtVendaCodProduto.setText(String.valueOf(telaBuscaProduto.getCodigoProduto()));
        txtVendaDescricaoProduto.setText(telaBuscaProduto.getDescricaoProduto());
        txtVendaProdutoValorUnitario.setText(telaBuscaProduto.getValorProdutoFormatado());
        txtVendaPrecoOculto.setText(String.valueOf(telaBuscaProduto.getValorProduto()));
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFornecedorActionPerformed
        // TODO add your handling code here:
        BuscarFornecedorView telaBuscaFornecedor = new BuscarFornecedorView(this, rootPaneCheckingEnabled);
        telaBuscaFornecedor.setVisible(true);

        txtCompraCodFornecedor.setText(String.valueOf(telaBuscaFornecedor.getCodigoFornecedor()));
        txtCompraNomeFornecedor.setText(telaBuscaFornecedor.getnomeRazaoSocialFornecedor());
    }//GEN-LAST:event_btnBuscarFornecedorActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoProduto() == true && testarSelecaoQuantidade() == true) {
            this.InclurProduto();

            Double valorTotalRetorno = (this.atualizarValorTotal());
            DecimalFormat dfNovo = new DecimalFormat("#,##0.00");
            String valorTotalTela = dfNovo.format(valorTotalRetorno);
            this.totalValorFormatado = valorTotalTela;
            this.txtCompraTotal.setText(String.valueOf(totalValorFormatado));

            this.txtVendaProdutoValorUnitario.setText("");
        } else {
            //JOptionPane.showMessageDialog(this, "É preciso um produto selecionado.");
        }

    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void carregamentoInicial() {
        this.txtCompraCodFornecedor.setEnabled(false);
        this.txtCompraNomeFornecedor.setEnabled(false);
        this.btnBuscarFornecedor.setEnabled(false);
        this.txtCompraNumero.setEnabled(false);
        this.txtVendaCodProduto.setEnabled(false);
        this.txtVendaDescricaoProduto.setEnabled(false);
        this.btnBuscarProduto.setEnabled(false);
        this.txtVendaProdutoValorUnitario.setEnabled(false);
        this.txtCompraQuantidade.setEnabled(false);
        this.btnIncluirProduto.setEnabled(false);
        this.btnRemoverProduto.setEnabled(false);
        this.txtCompraData.setEnabled(false);
        this.cbCompraTipoPagamento.setEnabled(false);
        this.txtCompraDesconto.setEnabled(false);
        this.btnCompraCalculaDesconto.setEnabled(false);
        this.txtCompraObservacao.setEnabled(false);
        this.btnCompraIncluir.setEnabled(true);
        this.btnCompraSalvar.setEnabled(false);
        this.btnCompraCancelar.setEnabled(true);
    }

    private void liberaCampos() {
        this.txtCompraCodFornecedor.setEnabled(true);
        this.txtCompraNomeFornecedor.setEnabled(true);
        this.btnBuscarFornecedor.setEnabled(true);
        this.txtCompraNumero.setEnabled(true);
        this.txtVendaCodProduto.setEnabled(true);
        this.txtVendaDescricaoProduto.setEnabled(true);
        this.btnBuscarProduto.setEnabled(true);
        this.txtVendaProdutoValorUnitario.setEnabled(true);
        this.txtCompraQuantidade.setEnabled(true);
        this.btnIncluirProduto.setEnabled(true);
        this.btnRemoverProduto.setEnabled(true);
        this.txtCompraData.setEnabled(true);
        this.txtCompraData.setEditable(false);
        this.cbCompraTipoPagamento.setEnabled(true);
        this.txtCompraDesconto.setEnabled(true);
        this.btnCompraCalculaDesconto.setEnabled(true);
        this.txtCompraObservacao.setEnabled(true);
        this.btnCompraIncluir.setEnabled(false);
        this.btnCompraSalvar.setEnabled(true);
        this.btnCompraCancelar.setEnabled(true);
    }

    private void InclurProduto() {
        quantidade = Integer.parseInt(this.txtCompraQuantidade.getText());
        preco = Double.parseDouble(this.txtVendaPrecoOculto.getText());

        subtotal = quantidade * preco;

        Double valorSubTotalRetorno = (subtotal);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorSubTotalTela = df.format(valorSubTotalRetorno);
        this.subTotalValorFormatado = valorSubTotalTela;

        total += subtotal;

        Double valorTotalRetorno = (total);
        DecimalFormat dfNovo = new DecimalFormat("#,##0.00");
        String valorTotalTela = dfNovo.format(valorTotalRetorno);
        this.totalValorFormatado = valorTotalTela;

        this.txtCompraTotal.setText(String.valueOf(totalValorFormatado));

        carrinhos = (DefaultTableModel) tblListaItensCompras.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            carrinhos.setNumRows(0);
        }
        carrinhos.addRow(new Object[]{
            this.txtVendaCodProduto.getText(),//0
            this.txtVendaDescricaoProduto.getText(),//1
            this.txtVendaProdutoValorUnitario.getText(),//2
            this.txtCompraQuantidade.getText(),//3
            this.subTotalValorFormatado,//4
            this.subtotal//5

        });

        this.itensDaVenda = carrinhos;

        this.txtVendaCodProduto.setText(null);
        this.txtVendaDescricaoProduto.setText(null);
        this.txtVendaProdutoValorUnitario.setText(null);
        this.txtCompraQuantidade.setText(null);
    }

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linhaSelecionada = tblListaItensCompras.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) tblListaItensCompras.getModel();
            // Remove a linha
            modelo.removeRow(linhaSelecionada);

            Double valorTotalRetorno = (this.atualizarValorTotal());
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String valorTotalTela = df.format(valorTotalRetorno);

            this.txtCompraTotal.setText(valorTotalTela);
            //this.txtVendaTotal.setText(String.valueOf(this.atualizarValorTotal()));
        }
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void txtVendaDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaDescricaoProdutoActionPerformed

    private void txtCompraQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompraQuantidadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCompraQuantidadeKeyTyped

    private void txtCompraQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompraQuantidadeActionPerformed
        // TODO add your handling code here:
        btnIncluirProdutoActionPerformed(evt);
    }//GEN-LAST:event_txtCompraQuantidadeActionPerformed

    private void btnCompraCalculaDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraCalculaDescontoActionPerformed
        // TODO add your handling code here:
        this.calcularDesconto();

//        String valorDesconto = this.txtVendaDesconto.getText();
//        String resultadoFormatado = valorDesconto.replace(".", "");
//        String resultadoFormatado2 = resultadoFormatado.replace(",", ".");
//        Double valorDescontoFormatado = Double.parseDouble(resultadoFormatado2);
//
//        Double valorTotalRetorno = (this.atualizarValorTotal());
//        DecimalFormat df = new DecimalFormat("#,##0.00");
//        String valorTotalTela = df.format(valorTotalRetorno);
//        this.txtVendaTotal.setText(valorTotalTela);
    }//GEN-LAST:event_btnCompraCalculaDescontoActionPerformed

    private void btnCompraIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraIncluirActionPerformed
        // TODO add your handling code here:
        this.liberaCampos();
        this.novoVenda();
    }//GEN-LAST:event_btnCompraIncluirActionPerformed

    private void btnCompraSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraSalvarActionPerformed
        // TODO add your handling code here:
        if (alteracao == false) {
            salvarVenda();
            this.novoVenda();
        } else {
            atualizarVenda();
            //this.novoVenda();
            //this.carregamentoInicial();
        }
    }//GEN-LAST:event_btnCompraSalvarActionPerformed

    private void btnCompraCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCompraCancelarActionPerformed

    private void btnConsultaCompraCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCompraCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnConsultaCompraCancelarActionPerformed

    private void btnConsultaCompraAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCompraAlterarActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoVendas() == true) {
            recuperarVenda();
            this.liberaCampos();
            alteracao = true;
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnConsultaCompraAlterarActionPerformed

    private void rbCompraStatusAprovacaoAguardandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraStatusAprovacaoAguardandoActionPerformed
        // TODO add your handling code here:
        this.carregarVendasAguardando();
    }//GEN-LAST:event_rbCompraStatusAprovacaoAguardandoActionPerformed

    private void rbCompraStatusAprovacaoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraStatusAprovacaoTodosActionPerformed
        // TODO add your handling code here:
        this.carregarVendas();
    }//GEN-LAST:event_rbCompraStatusAprovacaoTodosActionPerformed

    private void btnCompraFaturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraFaturarActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoVendas() == true) {
            recuperarVendaFaturameto();
    }//GEN-LAST:event_btnCompraFaturarActionPerformed

    }    

    private void carregarVendasAguardando() {
        listaVendas = vendasController.getListaVendaStatusAguardandoController();
        DefaultTableModel modelo = (DefaultTableModel) tblComprasRealizadas.getModel();
        modelo.setNumRows(0);
        // Carrega dados da lista na tabela
        int cont = listaVendas.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaVendas.get(i).getCodVenda(),
                listaVendas.get(i).getNomeRazaoSocial(),
                valoresMonentarios.format(listaVendas.get(i).getValorTotal()),
                listaVendas.get(i).getDataVenda(),
                listaVendas.get(i).getDescricaStatus()

            });
        }
    }

    private void carregarVendas() {
        listaVendas = vendasController.getListaVendaController();
        DefaultTableModel modelo = (DefaultTableModel) tblComprasRealizadas.getModel();
        modelo.setNumRows(0);
        // Carrega dados da lista na tabela
        int cont = listaVendas.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaVendas.get(i).getCodVenda(),
                listaVendas.get(i).getNomeRazaoSocial(),
                valoresMonentarios.format(listaVendas.get(i).getValorTotal()),
                listaVendas.get(i).getDataVenda(),
                listaVendas.get(i).getDescricaStatus()

            });
        }
    }

    private void calcularDesconto() {
//        if (alteracao = true) {
//            this.btnVendaCalculaDesconto.setEnabled(false);
//        } else {
        String valorDesconto = this.txtCompraDesconto.getText();
        String resultadoFormatado = valorDesconto.replace(".", "");
        String resultadoFormatado2 = resultadoFormatado.replace(",", ".");
        Double valorDescontoFormatado = Double.parseDouble(resultadoFormatado2);

        Double valorTotalRetorno = (this.atualizarValorTotal());
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorTotalTela = df.format(valorTotalRetorno);
        this.txtCompraTotal.setText(valorTotalTela);
//        }
    }

    private void salvarVenda() {
        if (txtCompraCodFornecedor.getText().equals("") || tblListaItensCompras.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "É necessário informar um cliente e selecionar um produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            Venda objVenda = new Venda();

            //Dados do cliente
            objVenda.setCodCliente(Integer.parseInt(this.txtCompraCodFornecedor.getText()));

            // Data da venda
            Date dataCadastramentoCliente = new Date();
            String formatoDataMysql = ("yyyy-MM-dd");
            SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
            String dataMysql = formatarData.format(dataCadastramentoCliente);
            objVenda.setDataVenda(dataMysql);
            
            objVenda.setTipoPagamento((tipoPagamentoController.getTipoPagamentoController(this.cbCompraTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento()));

            // valor do Desconto da venda
            String desconto = this.txtCompraDesconto.getText();
            String descontoFormatado = desconto.replace(".", "");
            String descontoFormatado2 = descontoFormatado.replace(",", ".");
            Double descontoBanco = Double.parseDouble(descontoFormatado2);
            objVenda.setValorDesconto(descontoBanco);

            // valor Total da Venda
            String valorTotal = this.txtCompraTotal.getText();
            String totalFormatado = valorTotal.replace(".", "");
            String totalFormatado2 = totalFormatado.replace(",", ".");
            Double totalBanco = Double.parseDouble(totalFormatado2);
            objVenda.setValorTotal(totalBanco);

            objVenda.setCodStatusVenda(2);
            objVenda.setObservacao(this.txtCompraObservacao.getText());

            int codigoVenda = vendasController.SalvarVendaController(objVenda);

            // Captura o código da ultima venda salva no Banco
            venda.setCodVenda(vendasController.getUltimaVendaDAO());

            // Cadastrando os produtos na tabela ItemVendas
            for (int i = 0; i < tblListaItensCompras.getRowCount(); i++) {
                ItemVenda objItemVenda = new ItemVenda();
                Produto objProdutoVenda = new Produto();
                objItemVenda.setVenda(venda);
                objProdutoVenda.setCodProduto(Integer.parseInt(tblListaItensCompras.getValueAt(i, 0).toString()));
                objItemVenda.setProduto(objProdutoVenda);
                objItemVenda.setQuantidade(Integer.parseInt(tblListaItensCompras.getValueAt(i, 3).toString()));
                //objItemVenda.setSubtotal(Double.parseDouble(tblListaItensVendas.getValueAt(i, 5).toString()));
                String valorItemProduto = String.valueOf(tblListaItensCompras.getValueAt(i, 4).toString());
                String vlItemFormatado = valorItemProduto.replace(".", "");
                String vlItemFormatado2 = vlItemFormatado.replace(",", ".");
                Double subTotalBanco = Double.parseDouble(vlItemFormatado2);
                objItemVenda.setSubtotal(subTotalBanco);
                listaItensVendas.add(objItemVenda);
            }

            itemVenda.setListaItemVenda(listaItensVendas);
            if (codigoVenda > 0) {
                vendasController.salvarItensVendaController(itemVenda);
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            this.limparCampos();
            this.carregamentoInicial();
        }
    }

    private boolean recuperarVenda() {

        try {
            int linha = this.tblComprasRealizadas.getSelectedRow();
            String nomeCliente = (String) tblComprasRealizadas.getValueAt(linha, 1);

            int codigoVenda = (Integer) tblComprasRealizadas.getValueAt(linha, 0);
            int codigoProduto;
            venda.setCodVenda(codigoVenda);
            //Recupera os dados no banco de dados
            venda = vendasController.getVendaController(codigoVenda);
            this.txtCompraCodFornecedor.setText(String.valueOf(venda.getCodCliente()));
            this.txtCompraNomeFornecedor.setText(nomeCliente);
            this.txtCompraNumero.setText(String.valueOf(venda.getCodVenda()));
                        
            String dataRetorno = venda.getDataVenda();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataCadastramentoTela = localDate.format(formatter2);
            this.txtCompraData.setText(dataCadastramentoTela);
            
            this.txtCompraStatus.setText(String.valueOf(venda.getDescricaStatus()));
            this.cbCompraTipoPagamento.setSelectedItem(tipoPagamentoController.getTipoPagamentController(venda.getTipoPagamento()).getDescricao());
            
            Double valorDesconto = venda.getValorDesconto();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String DescontoTela = df.format(valorDesconto);
            this.txtCompraDesconto.setText(DescontoTela);

            //(String.valueOf(venda.getValorDesconto()));
            Double valorRetornoTotal = venda.getValorTotal();
            DecimalFormat dfs = new DecimalFormat("#,##0.00");
            String ValorTotalTela = df.format(valorRetornoTotal);
            this.txtCompraTotal.setText(ValorTotalTela);
            //this.txtVendaTotal.setText(String.valueOf(venda.getValorTotal()));

            listaItensVendas = vendasController.getListaItensVendaController(codigoVenda);

            DefaultTableModel dados = (DefaultTableModel) tblListaItensCompras.getModel();
            dados.setNumRows(0);

            int cont = listaItensVendas.size();
            for (int i = 0; i < cont; i++) {
                //codigoProduto = listaItensVendas.get(i).getProduto().getCodProduto();
                //produto = produtoController.getProdutoController(codigoProduto);
                dados.addRow(new Object[]{
                    listaItensVendas.get(i).getProduto().getCodProduto(),
                    listaItensVendas.get(i).getProduto().getDescricao(),
                    valoresMonentarios.format(listaItensVendas.get(i).getProduto().getValor()),
                    listaItensVendas.get(i).getQuantidade(),
                    valoresMonentarios.format(listaItensVendas.get(i).getSubtotal()) //* produto.getValor()
                });
                //System.out.println(i);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean recuperarVendaFaturameto() {
        telaFaturamento = new FaturamentoComprasView(this, rootPaneCheckingEnabled);
        try {
            int linha = this.tblComprasRealizadas.getSelectedRow();
            String nomeCliente = (String) tblComprasRealizadas.getValueAt(linha, 1);
            int codigoVenda = (Integer) tblComprasRealizadas.getValueAt(linha, 0);
            System.out.println(codigoVenda);
            venda.setCodVenda(codigoVenda);
            //Recupera os dados no banco de dados
            venda = (vendasController.getVendaController(codigoVenda));
            telaFaturamento.setLblNumeroVenda(codigoVenda);
            telaFaturamento.setLblNomeCliente(nomeCliente);
            
            String dataRetorno = venda.getDataVenda();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataVendaInclusao = localDate.format(formatter2);
            telaFaturamento.setLblDataVenda(dataVendaInclusao);

            telaFaturamento.setLblCodTipoPagamento(tipoPagamentoController.getTipoPagamentController(venda.getTipoPagamento()).getCodTipoPagamento());
            telaFaturamento.setLblTipoPagamentoDescricao(tipoPagamentoController.getTipoPagamentController(venda.getTipoPagamento()).getDescricao());
            Double valorDesconto = venda.getValorDesconto();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String DescontoTela = df.format(valorDesconto);
            telaFaturamento.setLblValorDesconto(DescontoTela);
            
            Double valorRetornoTotal = venda.getValorTotal();
            DecimalFormat dfs = new DecimalFormat("#,##0.00");
            String ValorTotalTela = df.format(valorRetornoTotal);
            telaFaturamento.setLblValorTotal(ValorTotalTela);
            telaFaturamento.setVisible(true);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void atualizarVenda() {
        listaItensVendas = new ArrayList<>();

        if (tblListaItensCompras.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar os produtos!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {

//        if (this.txtVendaDesconto.getText().equals("")) {
//            txtVendaDesconto.setText("0,00");
//        }
            Venda objVenda = new Venda();

            //Dados da Venda
            objVenda.setCodVenda(Integer.parseInt(this.txtCompraNumero.getText()));

            //Dados do cliente
            objVenda.setCodCliente(Integer.parseInt(this.txtCompraCodFornecedor.getText()));

            // Data da venda
            Date dataCadastramentoCliente = new Date();
            String formatoDataMysql = ("yyyy-MM-dd");
            SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
            String dataMysql = formatarData.format(dataCadastramentoCliente);
            objVenda.setDataVenda(dataMysql);
            objVenda.setTipoPagamento((tipoPagamentoController.getTipoPagamentoController(this.cbCompraTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento()));
            // valor do Desconto da venda
            String desconto = this.txtCompraDesconto.getText();
            String descontoFormatado = desconto.replace(".", "");
            String descontoFormatado2 = descontoFormatado.replace(",", ".");
            Double descontoBanco = Double.parseDouble(descontoFormatado2);
            objVenda.setValorDesconto(descontoBanco);

            // valor Total da Venda
            String valorTotal = this.txtCompraTotal.getText();
            String totalFormatado = valorTotal.replace(".", "");
            String totalFormatado2 = totalFormatado.replace(",", ".");
            Double totalBanco = Double.parseDouble(totalFormatado2);
            objVenda.setValorTotal(totalBanco);

            objVenda.setCodStatusVenda(2);
            objVenda.setObservacao(this.txtCompraObservacao.getText());

            boolean statusRetornoVenda = vendasController.atualizarVendasController(objVenda);

            for (int i = 0; i < tblListaItensCompras.getRowCount(); i++) {
                ItemVenda objItemVenda = new ItemVenda();
                Produto objProdutoVenda = new Produto();
                objVenda.setCodVenda(Integer.parseInt(this.txtCompraNumero.getText()));
                objItemVenda.setVenda(objVenda);
                objProdutoVenda.setCodProduto(Integer.parseInt(tblListaItensCompras.getValueAt(i, 0).toString()));
                objItemVenda.setProduto(objProdutoVenda);
                objItemVenda.setQuantidade(Integer.parseInt(tblListaItensCompras.getValueAt(i, 3).toString()));
                //objItemVenda.setSubtotal(Double.parseDouble(tblListaItensVendas.getValueAt(i, 5).toString()));
                String valorItemProduto = String.valueOf(tblListaItensCompras.getValueAt(i, 4).toString());
                String vlItemFormatado = valorItemProduto.replace(".", "");
                String vlItemFormatado2 = vlItemFormatado.replace(",", ".");
                Double subTotalBanco = Double.parseDouble(vlItemFormatado2);
                objItemVenda.setSubtotal(subTotalBanco);
                listaItensVendas.add(objItemVenda);
            }

            itemVenda.setListaItemVenda(listaItensVendas);

            if (statusRetornoVenda == true) {
                vendasController.excluirItensVendaController(Integer.parseInt(this.txtCompraNumero.getText()));
                vendasController.atualizarItensVendasController(itemVenda);
                this.carregarVendas();
                JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 1);

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            this.limparCampos();
            this.carregamentoInicial();

        }
    }

    private boolean testarSelecao() {
        int selecao = tblListaItensCompras.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoVendas() {
        int selecao = tblComprasRealizadas.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoProduto() {
        if (txtCompraCodFornecedor.getText().equals("") && txtVendaDescricaoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um produto.");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoQuantidade() {
        if (txtCompraQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário informar a quantidade");
            return false;
        }
        return true;
    }

    private void limparCampos() {
        this.txtCompraCodFornecedor.setText(null);
        this.txtCompraNomeFornecedor.setText(null);
        this.txtCompraNumero.setText(null);
        this.txtVendaCodProduto.setText(null);
        this.txtVendaDescricaoProduto.setText(null);
        this.txtCompraDesconto.setText(null);
        this.txtCompraTotal.setText(null);
        this.txtCompraObservacao.setText(null);
        DefaultTableModel modelo = (DefaultTableModel) tblListaItensCompras.getModel();
        modelo.setNumRows(0);
    }

    private void novoVenda() {
        txtCompraNumero.setText("Novo");
        txtCompraQuantidade.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblListaItensCompras.getModel();
        modelo.setNumRows(0);
        txtCompraDesconto.setText("0,00");
        txtCompraTotal.setText("0,00");
    }

    private Double atualizarValorTotal() {
        Double operacaoSoma = 0.00;
        Double valor;
        int contador = tblListaItensCompras.getRowCount();
        for (int i = 0; i < contador; i++) {
            //valor = Double.parseDouble(String.valueOf(tblListaItensVendas.getValueAt(i, 3)));
            String valorOriginal = String.valueOf(tblListaItensCompras.getValueAt(i, 4));
            String valorOriginalFormatado = valorOriginal.replace(".", "");
            String valorOriginalFormatado2 = valorOriginalFormatado.replace(",", ".");
            valor = Double.parseDouble(valorOriginalFormatado2);
            operacaoSoma = valor + operacaoSoma;
        }

        if (!txtCompraDesconto.getText().equals("")) {
            String valorDesconto = this.txtCompraDesconto.getText();
            String resultadoFormatado = valorDesconto.replace(".", "");
            String resultadoFormatado2 = resultadoFormatado.replace(",", ".");
            Double valorDescontoFormatado = Double.parseDouble(resultadoFormatado2);

            //operacaoSoma = operacaoSoma - Double.valueOf(txtVendaDesconto.getText());
            operacaoSoma = operacaoSoma - valorDescontoFormatado;
        }
        return operacaoSoma;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFornecedor;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCompraCalculaDesconto;
    private javax.swing.JButton btnCompraCancelar;
    private javax.swing.JButton btnCompraFaturar;
    private javax.swing.JButton btnCompraIncluir;
    private javax.swing.JButton btnCompraReprovar;
    private javax.swing.JButton btnCompraSalvar;
    private javax.swing.JButton btnConsultaCompraAlterar;
    private javax.swing.JButton btnConsultaCompraCancelar;
    private javax.swing.JButton btnConsultaCompraExcluir;
    private javax.swing.JButton btnConsultaCompraImprimir;
    private javax.swing.JButton btnConsultaComprasPesquisar;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JComboBox<String> cbCompraTipoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelConsultarVendas;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    protected javax.swing.JRadioButton rbCompraStatusAprovacaoAguardando;
    protected javax.swing.JRadioButton rbCompraStatusAprovacaoTodos;
    private javax.swing.ButtonGroup rbGroupStatusVenda;
    private javax.swing.JTable tblComprasRealizadas;
    private javax.swing.JTable tblListaItensCompras;
    private javax.swing.JTextField txtCompraCodFornecedor;
    protected javax.swing.JFormattedTextField txtCompraData;
    private javax.swing.JFormattedTextField txtCompraDesconto;
    private javax.swing.JTextField txtCompraNomeFornecedor;
    private javax.swing.JTextField txtCompraNumero;
    private javax.swing.JTextField txtCompraObservacao;
    private javax.swing.JTextField txtCompraQuantidade;
    private javax.swing.JTextField txtCompraStatus;
    private javax.swing.JTextField txtCompraTotal;
    private javax.swing.JTextField txtConsultaVenda;
    private javax.swing.JTextField txtVendaCodProduto;
    private javax.swing.JTextField txtVendaDescricaoProduto;
    private javax.swing.JTextField txtVendaPrecoOculto;
    private javax.swing.JTextField txtVendaProdutoValorUnitario;
    // End of variables declaration//GEN-END:variables
}
