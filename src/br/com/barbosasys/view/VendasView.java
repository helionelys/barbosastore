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
import br.com.barbosasys.model.Item;
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author helionelys
 */
public class VendasView extends javax.swing.JDialog {

    VendaController vendasController = new VendaController();
    Venda venda = new Venda();
    Produto produto = new Produto();
    Item itemVenda = new Item();
    ArrayList<Venda> listaVendas = new ArrayList<>();
    ArrayList<Item> listaItensVendas = new ArrayList<>();
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    ArrayList<Produto> listaProduto = new ArrayList<>();
    ProdutoController produtoController = new ProdutoController();
    ClienteController clienteController = new ClienteController();
    Caixa caixa = new Caixa();
    CaixaController caixaController = new CaixaController();
    TipoPagamento tipoPagamento = new TipoPagamento();
    TipoPagamentoController tipoPagamentoController = new TipoPagamentoController();
    ArrayList<TipoPagamento> listaTipoPagamento = new ArrayList<>();
    FaturamentoVendaView telaFaturamento = new FaturamentoVendaView(this, rootPaneCheckingEnabled);

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
    public VendasView(java.awt.Frame parent, boolean modal) {
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
        cbVendaTipoPagamento.removeAllItems();
        for (int i = 0; i < listaTipoPagamento.size(); i++) {
            cbVendaTipoPagamento.addItem(listaTipoPagamento.get(i).getDescricao());
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
        txtVendaCodCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVendaNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVendaNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVendaQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRemoverProduto = new javax.swing.JButton();
        btnIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaItensVendas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cbVendaTipoPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtVendaTotal = new javax.swing.JTextField();
        txtVendaDescricaoProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtVendaData = new javax.swing.JFormattedTextField();
        txtVendaCodProduto = new javax.swing.JTextField();
        txtVendaProdutoValorUnitario = new javax.swing.JTextField();
        txtVendaPrecoOculto = new javax.swing.JTextField();
        btnVendaCalculaDesconto = new javax.swing.JButton();
        txtVendaDesconto = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVendaObservacao = new javax.swing.JTextField();
        txtVendaStatus = new javax.swing.JTextField();
        btnVendaIncluir = new javax.swing.JButton();
        btnVendaSalvar = new javax.swing.JButton();
        btnVendaCancelar = new javax.swing.JButton();
        jPanelConsultarVendas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtConsultaVenda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendasRealizadas = new javax.swing.JTable();
        btnConsultaVendaImprimir = new javax.swing.JButton();
        btnConsultaVendaPesquisar = new javax.swing.JButton();
        btnConsultaVendaExcluir = new javax.swing.JButton();
        btnConsultaVendaAlterar = new javax.swing.JButton();
        btnConsultaVendaCancelar = new javax.swing.JButton();
        btnCompraReprovar1 = new javax.swing.JButton();
        btnCompraAprovar1 = new javax.swing.JButton();
        rbVendaStatusAprovacaoTodos = new javax.swing.JRadioButton();
        rbVendaStatusAprovacaoAguardando = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barbosa Store - Vendas");

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

        txtVendaCodCliente.setEditable(false);
        txtVendaCodCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Cliente:");

        txtVendaNomeCliente.setEditable(false);
        txtVendaNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaNomeClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Nº da Venda");

        txtVendaNumero.setEditable(false);
        txtVendaNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVendaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Produto:");

        txtVendaQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaQuantidadeActionPerformed(evt);
            }
        });
        txtVendaQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVendaQuantidadeKeyTyped(evt);
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

        tblListaItensVendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblListaItensVendas);
        if (tblListaItensVendas.getColumnModel().getColumnCount() > 0) {
            tblListaItensVendas.getColumnModel().getColumn(0).setMinWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(0).setMaxWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(1).setMinWidth(350);
            tblListaItensVendas.getColumnModel().getColumn(1).setPreferredWidth(350);
            tblListaItensVendas.getColumnModel().getColumn(1).setMaxWidth(350);
            tblListaItensVendas.getColumnModel().getColumn(2).setMinWidth(100);
            tblListaItensVendas.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblListaItensVendas.getColumnModel().getColumn(2).setMaxWidth(100);
            tblListaItensVendas.getColumnModel().getColumn(3).setMinWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(3).setMaxWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(4).setMinWidth(100);
            tblListaItensVendas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLabel6.setText("Tipo de Pagamento:");

        jLabel7.setText("Valor Desconto:");

        jLabel8.setText("Total:");

        txtVendaTotal.setEditable(false);
        txtVendaTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVendaTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnBuscarCliente.setText("...");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Data:");

        try {
            txtVendaData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtVendaData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaData.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N

        txtVendaCodProduto.setEditable(false);
        txtVendaCodProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaCodProduto.setToolTipText("");

        txtVendaProdutoValorUnitario.setEditable(false);
        txtVendaProdutoValorUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtVendaProdutoValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtVendaPrecoOculto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnVendaCalculaDesconto.setText("$");
        btnVendaCalculaDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaCalculaDescontoActionPerformed(evt);
            }
        });

        txtVendaDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtVendaDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaDesconto.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N

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
                            .addComponent(txtVendaCodCliente)
                            .addComponent(txtVendaCodProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtVendaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtVendaDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaProdutoValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaPrecoOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncluirProduto)
                                .addGap(5, 5, 5)
                                .addComponent(btnRemoverProduto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVendaTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVendaCalculaDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendaCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtVendaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVendaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtVendaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cbVendaTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtVendaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtVendaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendaCalculaDesconto)
                    .addComponent(txtVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtVendaObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtVendaDesconto, txtVendaTotal});

        txtVendaStatus.setEditable(false);
        txtVendaStatus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtVendaStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendaStatus.setText("STATUS");

        btnVendaIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_incluir.png"))); // NOI18N
        btnVendaIncluir.setText("Incluir");
        btnVendaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaIncluirActionPerformed(evt);
            }
        });

        btnVendaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/salvar.png"))); // NOI18N
        btnVendaSalvar.setText("Salvar");
        btnVendaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaSalvarActionPerformed(evt);
            }
        });

        btnVendaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/inativar.png"))); // NOI18N
        btnVendaCancelar.setText("Cancelar");
        btnVendaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVendaStatus)
                .addGap(253, 253, 253)
                .addComponent(btnVendaIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendaSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendaCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVendasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnVendaCancelar, btnVendaIncluir, btnVendaSalvar});

        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendaStatus)
                    .addComponent(btnVendaIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnVendaSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVendaCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelVendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnVendaCancelar, btnVendaIncluir, btnVendaSalvar});

        jTabbedPane1.addTab("Operacão Vendas", jPanelVendas);

        jLabel9.setText("Nº da Venda");

        txtConsultaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaVendaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaVendaKeyTyped(evt);
            }
        });

        tblVendasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblVendasRealizadas);
        if (tblVendasRealizadas.getColumnModel().getColumnCount() > 0) {
            tblVendasRealizadas.getColumnModel().getColumn(0).setMinWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(0).setMaxWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(1).setMinWidth(350);
            tblVendasRealizadas.getColumnModel().getColumn(1).setPreferredWidth(350);
            tblVendasRealizadas.getColumnModel().getColumn(1).setMaxWidth(350);
            tblVendasRealizadas.getColumnModel().getColumn(2).setMinWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(2).setMaxWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(3).setMinWidth(80);
            tblVendasRealizadas.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblVendasRealizadas.getColumnModel().getColumn(3).setMaxWidth(80);
            tblVendasRealizadas.getColumnModel().getColumn(4).setMinWidth(100);
            tblVendasRealizadas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        btnConsultaVendaImprimir.setText("Imprimir");

        btnConsultaVendaPesquisar.setText("Pesquisar");

        btnConsultaVendaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_excluir.png"))); // NOI18N
        btnConsultaVendaExcluir.setText("Excluir");
        btnConsultaVendaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVendaExcluirActionPerformed(evt);
            }
        });

        btnConsultaVendaAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produto_editar.png"))); // NOI18N
        btnConsultaVendaAlterar.setText("Alterar");
        btnConsultaVendaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVendaAlterarActionPerformed(evt);
            }
        });

        btnConsultaVendaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnConsultaVendaCancelar.setText("Cancelar");
        btnConsultaVendaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVendaCancelarActionPerformed(evt);
            }
        });

        btnCompraReprovar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/cancelar.png"))); // NOI18N
        btnCompraReprovar1.setText("Reprovar");
        btnCompraReprovar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraReprovar1ActionPerformed(evt);
            }
        });

        btnCompraAprovar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/aceitar.png"))); // NOI18N
        btnCompraAprovar1.setText("Faturar");
        btnCompraAprovar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraAprovar1ActionPerformed(evt);
            }
        });

        rbGroupStatusVenda.add(rbVendaStatusAprovacaoTodos);
        rbVendaStatusAprovacaoTodos.setText("Todos");
        rbVendaStatusAprovacaoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVendaStatusAprovacaoTodosActionPerformed(evt);
            }
        });

        rbGroupStatusVenda.add(rbVendaStatusAprovacaoAguardando);
        rbVendaStatusAprovacaoAguardando.setText("Pendentes");
        rbVendaStatusAprovacaoAguardando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVendaStatusAprovacaoAguardandoActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaVendaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaVendaImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarVendasLayout.createSequentialGroup()
                        .addComponent(btnCompraAprovar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompraReprovar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultaVendaExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaVendaAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultaVendaCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarVendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbVendaStatusAprovacaoTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbVendaStatusAprovacaoAguardando)))
                .addContainerGap())
        );

        jPanelConsultarVendasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConsultaVendaAlterar, btnConsultaVendaCancelar, btnConsultaVendaExcluir});

        jPanelConsultarVendasLayout.setVerticalGroup(
            jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaVendaImprimir)
                    .addComponent(btnConsultaVendaPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVendaStatusAprovacaoAguardando)
                    .addComponent(rbVendaStatusAprovacaoTodos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaVendaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaVendaAlterar)
                    .addComponent(btnConsultaVendaCancelar)
                    .addComponent(btnCompraAprovar1)
                    .addComponent(btnCompraReprovar1))
                .addContainerGap())
        );

        jPanelConsultarVendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConsultaVendaAlterar, btnConsultaVendaCancelar, btnConsultaVendaExcluir});

        jTabbedPane1.addTab("Consultar Vendas", jPanelConsultarVendas);

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

    private void txtVendaNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaNomeClienteActionPerformed

    private void btnConsultaVendaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVendaExcluirActionPerformed
        // TODO add your handling code here:
        if(testarSelecaoVendas() == true){
            this.excluirVenda();
        }
    }//GEN-LAST:event_btnConsultaVendaExcluirActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        // TODO add your handling code here:
        BuscarProdutosView telaBuscaProduto = new BuscarProdutosView(this, rootPaneCheckingEnabled);
        telaBuscaProduto.setVisible(true);

        txtVendaCodProduto.setText(String.valueOf(telaBuscaProduto.getCodigoProduto()));
        txtVendaDescricaoProduto.setText(telaBuscaProduto.getDescricaoProduto());
        txtVendaProdutoValorUnitario.setText(telaBuscaProduto.getValorProdutoFormatado());
        txtVendaPrecoOculto.setText(String.valueOf(telaBuscaProduto.getValorProduto()));
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        BuscarClientesView telaBuscaCliente = new BuscarClientesView(this, rootPaneCheckingEnabled);
        telaBuscaCliente.setVisible(true);

        txtVendaCodCliente.setText(String.valueOf(telaBuscaCliente.getCodigoCliente()));
        txtVendaNomeCliente.setText(telaBuscaCliente.getNomeCliente());
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoProduto() == true && testarSelecaoQuantidade() == true) {
            this.InclurProduto();

            Double valorTotalRetorno = (this.atualizarValorTotal());
            DecimalFormat dfNovo = new DecimalFormat("#,##0.00");
            String valorTotalTela = dfNovo.format(valorTotalRetorno);
            this.totalValorFormatado = valorTotalTela;
            this.txtVendaTotal.setText(String.valueOf(totalValorFormatado));

            this.txtVendaProdutoValorUnitario.setText("");
        } else {
            //JOptionPane.showMessageDialog(this, "É preciso um produto selecionado.");
        }

    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void carregamentoInicial() {
        this.txtVendaCodCliente.setEnabled(false);
        this.txtVendaNomeCliente.setEnabled(false);
        this.btnBuscarCliente.setEnabled(false);
        this.txtVendaNumero.setEnabled(false);
        this.txtVendaCodProduto.setEnabled(false);
        this.txtVendaDescricaoProduto.setEnabled(false);
        this.btnBuscarProduto.setEnabled(false);
        this.txtVendaProdutoValorUnitario.setEnabled(false);
        this.txtVendaQuantidade.setEnabled(false);
        this.btnIncluirProduto.setEnabled(false);
        this.btnRemoverProduto.setEnabled(false);
        this.txtVendaData.setEnabled(false);
        this.cbVendaTipoPagamento.setEnabled(false);
        this.txtVendaDesconto.setEnabled(false);
        this.btnVendaCalculaDesconto.setEnabled(false);
        this.txtVendaObservacao.setEnabled(false);
        this.btnVendaIncluir.setEnabled(true);
        this.btnVendaSalvar.setEnabled(false);
        this.btnVendaCancelar.setEnabled(true);
    }

    private void liberaCampos() {
        this.txtVendaCodCliente.setEnabled(true);
        this.txtVendaNomeCliente.setEnabled(true);
        this.btnBuscarCliente.setEnabled(true);
        this.txtVendaNumero.setEnabled(true);
        this.txtVendaCodProduto.setEnabled(true);
        this.txtVendaDescricaoProduto.setEnabled(true);
        this.btnBuscarProduto.setEnabled(true);
        this.txtVendaProdutoValorUnitario.setEnabled(true);
        this.txtVendaQuantidade.setEnabled(true);
        this.btnIncluirProduto.setEnabled(true);
        this.btnRemoverProduto.setEnabled(true);
        this.txtVendaData.setEnabled(true);
        this.txtVendaData.setEditable(false);
        this.cbVendaTipoPagamento.setEnabled(true);
        this.txtVendaDesconto.setEnabled(true);
        this.btnVendaCalculaDesconto.setEnabled(true);
        this.txtVendaObservacao.setEnabled(true);
        this.btnVendaIncluir.setEnabled(false);
        this.btnVendaSalvar.setEnabled(true);
        this.btnVendaCancelar.setEnabled(true);
    }

    private void InclurProduto() {
        quantidade = Integer.parseInt(this.txtVendaQuantidade.getText());
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

        this.txtVendaTotal.setText(String.valueOf(totalValorFormatado));

        carrinhos = (DefaultTableModel) tblListaItensVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            carrinhos.setNumRows(0);
        }
        carrinhos.addRow(new Object[]{
            this.txtVendaCodProduto.getText(),//0
            this.txtVendaDescricaoProduto.getText(),//1
            this.txtVendaProdutoValorUnitario.getText(),//2
            this.txtVendaQuantidade.getText(),//3
            this.subTotalValorFormatado,//4
            this.subtotal//5

        });

        this.itensDaVenda = carrinhos;

        this.txtVendaCodProduto.setText(null);
        this.txtVendaDescricaoProduto.setText(null);
        this.txtVendaProdutoValorUnitario.setText(null);
        this.txtVendaQuantidade.setText(null);
    }

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        // TODO add your handling code here:
        if (testarSelecao() == true) {
            int linhaSelecionada = tblListaItensVendas.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) tblListaItensVendas.getModel();
            // Remove a linha
            modelo.removeRow(linhaSelecionada);

            Double valorTotalRetorno = (this.atualizarValorTotal());
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String valorTotalTela = df.format(valorTotalRetorno);

            this.txtVendaTotal.setText(valorTotalTela);
            //this.txtVendaTotal.setText(String.valueOf(this.atualizarValorTotal()));
        }
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void txtVendaDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaDescricaoProdutoActionPerformed

    private void txtVendaQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendaQuantidadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVendaQuantidadeKeyTyped

    private void txtVendaQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaQuantidadeActionPerformed
        // TODO add your handling code here:
        btnIncluirProdutoActionPerformed(evt);
    }//GEN-LAST:event_txtVendaQuantidadeActionPerformed

    private void btnVendaCalculaDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaCalculaDescontoActionPerformed
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
    }//GEN-LAST:event_btnVendaCalculaDescontoActionPerformed

    private void btnVendaIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaIncluirActionPerformed
        // TODO add your handling code here:
        this.liberaCampos();
        this.novoVenda();
        this.carregarTipoPagamento();
    }//GEN-LAST:event_btnVendaIncluirActionPerformed

    private void btnVendaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaSalvarActionPerformed
        // TODO add your handling code here:
        if (alteracao == false) {
            salvarVenda();
            this.novoVenda();
            carregarVendas();
        } else {
            atualizarVenda();
            //this.novoVenda();
            //this.carregamentoInicial();
        }
    }//GEN-LAST:event_btnVendaSalvarActionPerformed

    private void btnVendaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVendaCancelarActionPerformed

    private void btnConsultaVendaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVendaCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnConsultaVendaCancelarActionPerformed

    private void btnConsultaVendaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVendaAlterarActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoVendas() == true) {
            recuperarVenda();
            this.liberaCampos();
            alteracao = true;
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnConsultaVendaAlterarActionPerformed

    private void rbVendaStatusAprovacaoAguardandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVendaStatusAprovacaoAguardandoActionPerformed
        // TODO add your handling code here:
        this.carregarVendasAguardando();
    }//GEN-LAST:event_rbVendaStatusAprovacaoAguardandoActionPerformed

    private void rbVendaStatusAprovacaoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVendaStatusAprovacaoTodosActionPerformed
        // TODO add your handling code here:
        this.carregarVendas();
    }//GEN-LAST:event_rbVendaStatusAprovacaoTodosActionPerformed

    private void btnCompraAprovar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraAprovar1ActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoVendas() == true) {
            recuperarVendaFaturameto();
            carregarVendas();
        }
    }//GEN-LAST:event_btnCompraAprovar1ActionPerformed

    private void txtConsultaVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaVendaKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dadosPesquisar = (DefaultTableModel) this.tblVendasRealizadas.getModel();
        final TableRowSorter<TableModel> pesquisa = new TableRowSorter<TableModel>(dadosPesquisar);
        this.tblVendasRealizadas.setRowSorter(pesquisa);
        String text = txtConsultaVenda.getText();
        pesquisa.setRowFilter(RowFilter.regexFilter(text, 0));
    }//GEN-LAST:event_txtConsultaVendaKeyReleased

    private void txtConsultaVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaVendaKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConsultaVendaKeyTyped

    private void btnCompraReprovar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraReprovar1ActionPerformed
        // TODO add your handling code here:
        if(testarSelecaoVendas() == true){
            reprovarVenda();
            carregarVendas();
        }
    }//GEN-LAST:event_btnCompraReprovar1ActionPerformed

    private void reprovarVenda(){
        int linha = this.tblVendasRealizadas.getSelectedRow();
        String nomeCliente = (String) tblVendasRealizadas.getValueAt(linha, 1);
        int codigoVenda = (Integer) tblVendasRealizadas.getValueAt(linha, 0);
        venda.setCodVenda(codigoVenda);
        // Questiona a reprovação
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " reprova a compra \nNumero: "
                + codigoVenda + " \nFornecedor: " + nomeCliente + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (vendasController.cancelarVendasController(venda)) {
                JOptionPane.showMessageDialog(this, "Registro venda reprovada com suscesso!");
                carregarVendas();
                //incluirProduto();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }    

    private void carregarVendasAguardando() {
        listaVendas = vendasController.getListaVendaStatusAguardandoController();
        DefaultTableModel modelo = (DefaultTableModel) tblVendasRealizadas.getModel();
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
        DefaultTableModel modelo = (DefaultTableModel) tblVendasRealizadas.getModel();
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
        String valorDesconto = this.txtVendaDesconto.getText();
        String resultadoFormatado = valorDesconto.replace(".", "");
        String resultadoFormatado2 = resultadoFormatado.replace(",", ".");
        Double valorDescontoFormatado = Double.parseDouble(resultadoFormatado2);

        Double valorTotalRetorno = (this.atualizarValorTotal());
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorTotalTela = df.format(valorTotalRetorno);
        this.txtVendaTotal.setText(valorTotalTela);
//        }
    }

    private void salvarVenda() {
        if (txtVendaCodCliente.getText().equals("") || tblListaItensVendas.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "É necessário informar um cliente e selecionar um produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            Venda objVenda = new Venda();

            //Dados do cliente
            objVenda.setCodCliente(Integer.parseInt(this.txtVendaCodCliente.getText()));

            // Data da venda
            Date dataCadastramentoCliente = new Date();
            String formatoDataMysql = ("yyyy-MM-dd");
            SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
            String dataMysql = formatarData.format(dataCadastramentoCliente);
            objVenda.setDataVenda(dataMysql);
            
            objVenda.setTipoPagamento((tipoPagamentoController.getTipoPagamentoController(this.cbVendaTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento()));

            // valor do Desconto da venda
            String desconto = this.txtVendaDesconto.getText();
            String descontoFormatado = desconto.replace(".", "");
            String descontoFormatado2 = descontoFormatado.replace(",", ".");
            Double descontoBanco = Double.parseDouble(descontoFormatado2);
            objVenda.setValorDesconto(descontoBanco);

            // valor Total da Venda
            String valorTotal = this.txtVendaTotal.getText();
            String totalFormatado = valorTotal.replace(".", "");
            String totalFormatado2 = totalFormatado.replace(",", ".");
            Double totalBanco = Double.parseDouble(totalFormatado2);
            objVenda.setValorTotal(totalBanco);

            objVenda.setCodStatusVenda(2);
            objVenda.setObservacao(this.txtVendaObservacao.getText());

            int codigoVenda = vendasController.SalvarVendaController(objVenda);

            // Captura o código da ultima venda salva no Banco
            venda.setCodVenda(vendasController.getUltimaVendaDAO());

            // Cadastrando os produtos na tabela ItemVendas
            for (int i = 0; i < tblListaItensVendas.getRowCount(); i++) {
                Item objItemVenda = new Item();
                Produto objProdutoVenda = new Produto();
                objItemVenda.setVenda(venda);
                objProdutoVenda.setCodProduto(Integer.parseInt(tblListaItensVendas.getValueAt(i, 0).toString()));
                objItemVenda.setProduto(objProdutoVenda);
                objItemVenda.setQuantidade(Integer.parseInt(tblListaItensVendas.getValueAt(i, 3).toString()));
                //objItemVenda.setSubtotal(Double.parseDouble(tblListaItensVendas.getValueAt(i, 5).toString()));
                String valorItemProduto = String.valueOf(tblListaItensVendas.getValueAt(i, 4).toString());
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

        
            int linha = this.tblVendasRealizadas.getSelectedRow();
            String nomeCliente = (String) tblVendasRealizadas.getValueAt(linha, 1);

            int codigoVenda = (Integer) tblVendasRealizadas.getValueAt(linha, 0);
            int codigoProduto;
            venda.setCodVenda(codigoVenda);
            try {
            //Recupera os dados no banco de dados
            venda = vendasController.getVendaController(codigoVenda);
            this.txtVendaCodCliente.setText(String.valueOf(venda.getCodCliente()));
            this.txtVendaNomeCliente.setText(nomeCliente);
            this.txtVendaNumero.setText(String.valueOf(venda.getCodVenda()));
                        
            String dataRetorno = venda.getDataVenda();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataCadastramentoTela = localDate.format(formatter2);
            this.txtVendaData.setText(dataCadastramentoTela);
            
            this.txtVendaStatus.setText(String.valueOf(venda.getDescricaStatus()));
            this.cbVendaTipoPagamento.setSelectedItem(tipoPagamentoController.getTipoPagamentController(venda.getTipoPagamento()).getDescricao());
            
            Double valorDesconto = venda.getValorDesconto();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String DescontoTela = df.format(valorDesconto);
            this.txtVendaDesconto.setText(DescontoTela);

            //(String.valueOf(venda.getValorDesconto()));
            Double valorRetornoTotal = venda.getValorTotal();
            DecimalFormat dfs = new DecimalFormat("#,##0.00");
            String ValorTotalTela = df.format(valorRetornoTotal);
            this.txtVendaTotal.setText(ValorTotalTela);
            //this.txtVendaTotal.setText(String.valueOf(venda.getValorTotal()));

            listaItensVendas = vendasController.getListaItensVendaController(codigoVenda);

            DefaultTableModel dados = (DefaultTableModel) tblListaItensVendas.getModel();
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
        telaFaturamento = new FaturamentoVendaView(this, rootPaneCheckingEnabled);
        try {
            int linha = this.tblVendasRealizadas.getSelectedRow();
            String nomeCliente = (String) tblVendasRealizadas.getValueAt(linha, 1);
            int codigoVenda = (Integer) tblVendasRealizadas.getValueAt(linha, 0);
            System.out.println(codigoVenda);
            venda.setCodVenda(codigoVenda);
            //Recupera os dados no banco de dados
            venda = (vendasController.getVendaController(codigoVenda));
            telaFaturamento.setLblNumeroVenda(codigoVenda);
            telaFaturamento.setLblCodCliente(venda.getCodCliente());
            telaFaturamento.setLblNomeCliente(nomeCliente);
            
            String dataRetorno = venda.getDataVenda();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataRetorno, formatter);
            String dataVendaInclusao = localDate.format(formatter2);
            telaFaturamento.setLblDataVenda(dataVendaInclusao);

            telaFaturamento.setLblCodTipoPagamento(tipoPagamentoController.getTipoPagamentController(venda.getTipoPagamento()).getCodTipoPagamento());
            telaFaturamento.setLblTipoPagamentoDescricao((tipoPagamentoController.getTipoPagamentoController(this.cbVendaTipoPagamento.getSelectedItem().toString()).getDescricao()));
            Double valorDesconto = venda.getValorDesconto();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String DescontoTela = df.format(valorDesconto);
            telaFaturamento.setLblValorDesconto(DescontoTela);
            
            Double valorRetornoTotal = venda.getValorTotal();
            DecimalFormat dfs = new DecimalFormat("#,##0.00");
            String ValorTotalTela = dfs.format(valorRetornoTotal);
            telaFaturamento.setLblValorTotal(ValorTotalTela);
            telaFaturamento.setVisible(true);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void excluirVenda(){
        int linha = tblVendasRealizadas.getSelectedRow();
        String cliente = (String) tblVendasRealizadas.getValueAt(linha, 1);
        int codigo = (Integer) tblVendasRealizadas.getValueAt(linha, 0);
        
        //Questiona Exclusão
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir a venda \nNúmero: "+ codigo + " ?\n"
                    + "Fornecedor: " + cliente, "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (vendasController.excluirVendaController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Venda excluída com suscesso!");
                    carregarVendas();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao processar operação!", "ERRO", JOptionPane.ERROR_MESSAGE);

                }
            }
    }
    
    private void atualizarVenda() {
        listaItensVendas = new ArrayList<>();

        if (tblListaItensVendas.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar os produtos!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {

//        if (this.txtVendaDesconto.getText().equals("")) {
//            txtVendaDesconto.setText("0,00");
//        }
            Venda objVenda = new Venda();

            //Dados da Venda
            objVenda.setCodVenda(Integer.parseInt(this.txtVendaNumero.getText()));

            //Dados do cliente
            objVenda.setCodCliente(Integer.parseInt(this.txtVendaCodCliente.getText()));

            // Data da venda
            Date dataCadastramentoCliente = new Date();
            String formatoDataMysql = ("yyyy-MM-dd");
            SimpleDateFormat formatarData = new SimpleDateFormat(formatoDataMysql);
            String dataMysql = formatarData.format(dataCadastramentoCliente);
            objVenda.setDataVenda(dataMysql);
            objVenda.setTipoPagamento((tipoPagamentoController.getTipoPagamentoController(this.cbVendaTipoPagamento.getSelectedItem().toString()).getCodTipoPagamento()));
            // valor do Desconto da venda
            String desconto = this.txtVendaDesconto.getText();
            String descontoFormatado = desconto.replace(".", "");
            String descontoFormatado2 = descontoFormatado.replace(",", ".");
            Double descontoBanco = Double.parseDouble(descontoFormatado2);
            objVenda.setValorDesconto(descontoBanco);

            // valor Total da Venda
            String valorTotal = this.txtVendaTotal.getText();
            String totalFormatado = valorTotal.replace(".", "");
            String totalFormatado2 = totalFormatado.replace(",", ".");
            Double totalBanco = Double.parseDouble(totalFormatado2);
            objVenda.setValorTotal(totalBanco);

            objVenda.setCodStatusVenda(2);
            objVenda.setObservacao(this.txtVendaObservacao.getText());

            boolean statusRetornoVenda = vendasController.atualizarVendasController(objVenda);

            for (int i = 0; i < tblListaItensVendas.getRowCount(); i++) {
                Item objItemVenda = new Item();
                Produto objProdutoVenda = new Produto();
                objVenda.setCodVenda(Integer.parseInt(this.txtVendaNumero.getText()));
                objItemVenda.setVenda(objVenda);
                objProdutoVenda.setCodProduto(Integer.parseInt(tblListaItensVendas.getValueAt(i, 0).toString()));
                objItemVenda.setProduto(objProdutoVenda);
                objItemVenda.setQuantidade(Integer.parseInt(tblListaItensVendas.getValueAt(i, 3).toString()));
                //objItemVenda.setSubtotal(Double.parseDouble(tblListaItensVendas.getValueAt(i, 5).toString()));
                String valorItemProduto = String.valueOf(tblListaItensVendas.getValueAt(i, 4).toString());
                String vlItemFormatado = valorItemProduto.replace(".", "");
                String vlItemFormatado2 = vlItemFormatado.replace(",", ".");
                Double subTotalBanco = Double.parseDouble(vlItemFormatado2);
                objItemVenda.setSubtotal(subTotalBanco);
                listaItensVendas.add(objItemVenda);
            }

            itemVenda.setListaItemVenda(listaItensVendas);

            if (statusRetornoVenda == true) {
                vendasController.excluirItensVendaController(Integer.parseInt(this.txtVendaNumero.getText()));
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
        int selecao = tblListaItensVendas.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoVendas() {
        int selecao = tblVendasRealizadas.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        String status = (String) tblVendasRealizadas.getValueAt(selecao, 4);
        if (!status.equals("PENDENTE")) {
            JOptionPane.showMessageDialog(this, "Operação impossivel!\n Compra já 'FATURADA' ou 'CANCELADA' !");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoProduto() {
        if (txtVendaCodCliente.getText().equals("") && txtVendaDescricaoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um produto.");
            return false;
        }
        return true;

    }

    private boolean testarSelecaoQuantidade() {
        if (txtVendaQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário informar a quantidade");
            return false;
        }
        return true;
    }

    private void limparCampos() {
        this.txtVendaCodCliente.setText(null);
        this.txtVendaNomeCliente.setText(null);
        this.txtVendaNumero.setText(null);
        this.txtVendaCodProduto.setText(null);
        this.txtVendaDescricaoProduto.setText(null);
        this.txtVendaDesconto.setText(null);
        this.txtVendaTotal.setText(null);
        this.txtVendaObservacao.setText(null);
        DefaultTableModel modelo = (DefaultTableModel) tblListaItensVendas.getModel();
        modelo.setNumRows(0);
    }

    private void novoVenda() {
        txtVendaNumero.setText("Novo");
        txtVendaQuantidade.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblListaItensVendas.getModel();
        modelo.setNumRows(0);
        txtVendaDesconto.setText("0,00");
        txtVendaTotal.setText("0,00");
    }

    private Double atualizarValorTotal() {
        Double operacaoSoma = 0.00;
        Double valor;
        int contador = tblListaItensVendas.getRowCount();
        for (int i = 0; i < contador; i++) {
            //valor = Double.parseDouble(String.valueOf(tblListaItensVendas.getValueAt(i, 3)));
            String valorOriginal = String.valueOf(tblListaItensVendas.getValueAt(i, 4));
            String valorOriginalFormatado = valorOriginal.replace(".", "");
            String valorOriginalFormatado2 = valorOriginalFormatado.replace(",", ".");
            valor = Double.parseDouble(valorOriginalFormatado2);
            operacaoSoma = valor + operacaoSoma;
        }

        if (!txtVendaDesconto.getText().equals("")) {
            String valorDesconto = this.txtVendaDesconto.getText();
            String resultadoFormatado = valorDesconto.replace(".", "");
            String resultadoFormatado2 = resultadoFormatado.replace(",", ".");
            Double valorDescontoFormatado = Double.parseDouble(resultadoFormatado2);

            //operacaoSoma = operacaoSoma - Double.valueOf(txtVendaDesconto.getText());
            operacaoSoma = operacaoSoma - valorDescontoFormatado;
        }
        return operacaoSoma;
    }
    
    public void setTelaConsultaVendas(){
        jTabbedPane1.setSelectedIndex(1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCompraAprovar1;
    private javax.swing.JButton btnCompraReprovar1;
    private javax.swing.JButton btnConsultaVendaAlterar;
    private javax.swing.JButton btnConsultaVendaCancelar;
    private javax.swing.JButton btnConsultaVendaExcluir;
    private javax.swing.JButton btnConsultaVendaImprimir;
    private javax.swing.JButton btnConsultaVendaPesquisar;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnVendaCalculaDesconto;
    private javax.swing.JButton btnVendaCancelar;
    private javax.swing.JButton btnVendaIncluir;
    private javax.swing.JButton btnVendaSalvar;
    private javax.swing.JComboBox<String> cbVendaTipoPagamento;
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
    private javax.swing.ButtonGroup rbGroupStatusVenda;
    protected javax.swing.JRadioButton rbVendaStatusAprovacaoAguardando;
    protected javax.swing.JRadioButton rbVendaStatusAprovacaoTodos;
    private javax.swing.JTable tblListaItensVendas;
    private javax.swing.JTable tblVendasRealizadas;
    private javax.swing.JTextField txtConsultaVenda;
    private javax.swing.JTextField txtVendaCodCliente;
    private javax.swing.JTextField txtVendaCodProduto;
    protected javax.swing.JFormattedTextField txtVendaData;
    private javax.swing.JFormattedTextField txtVendaDesconto;
    private javax.swing.JTextField txtVendaDescricaoProduto;
    private javax.swing.JTextField txtVendaNomeCliente;
    private javax.swing.JTextField txtVendaNumero;
    private javax.swing.JTextField txtVendaObservacao;
    private javax.swing.JTextField txtVendaPrecoOculto;
    private javax.swing.JTextField txtVendaProdutoValorUnitario;
    private javax.swing.JTextField txtVendaQuantidade;
    private javax.swing.JTextField txtVendaStatus;
    private javax.swing.JTextField txtVendaTotal;
    // End of variables declaration//GEN-END:variables
}
