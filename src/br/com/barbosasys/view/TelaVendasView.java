package br.com.barbosasys.view;

import br.com.barbosasys.controller.ClienteController;
import br.com.barbosasys.controller.ProdutoController;
import br.com.barbosasys.model.Cliente;
import br.com.barbosasys.model.Produto;
import br.com.barbosasys.model.Venda;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author helionelys
 */
public class TelaVendasView extends javax.swing.JFrame {

    //Classe Modelos
    Cliente cliente = new Cliente();
    Produto produto = new Produto();
    String precoFormatado, subTotalValorFormatado, totalValorFormatado;
    double preco, subTotal, total;
    int quantidade, codigoCliente, quantidadeProduto;
    DefaultTableModel carrinhos, itensDaVenda;
    DecimalFormat valoresMonentarios = new DecimalFormat("#,##0.00");

    //Classe Controller
    //ProdutoController produtoController = new ProdutoController();
    /**
     * Creates new form TelaVendasView
     */
    public TelaVendasView() {
        initComponents();
        this.txtPrecoProdutoVendaOculto.setVisible(false);
        this.txtCodigoCliente.setVisible(false);
        this.lblSatusOperacao.setText("Livre");
        this.carregamentoInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupClientes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/barbosasys/images/telafundomenu.jpg"));
        Image image = icon.getImage();
        jDesktop_Vendas = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }

        };
        jPanel3 = new javax.swing.JPanel();
        rbTipoPFisicaCliente = new javax.swing.JRadioButton();
        rbTipoPJuridicaCliente = new javax.swing.JRadioButton();
        rbTipoNaoIdentificado = new javax.swing.JRadioButton();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtCnpjCliente = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeRazaoSocialCliente = new javax.swing.JTextField();
        btnCpfCnpjPesquisarTelaVendas = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarProdutosVendas = new javax.swing.JButton();
        txtQuantidadeProdutoVenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescricaoProdutoVenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrecoProdutoVendaOculto = new javax.swing.JTextField();
        btnAdicionarProdutoVenda = new javax.swing.JButton();
        txtCodigoProdutoVenda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrecoProdutoVenda = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaItensVendas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblSatusOperacao = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalVendaPVD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQtdItensTotal = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuComandoItNovoVenda = new javax.swing.JMenuItem();
        MenuComandoItCancelarVenda = new javax.swing.JMenuItem();
        MenuComandoItFinalizarVenda = new javax.swing.JMenuItem();
        AtalhoRemoverProduto = new javax.swing.JMenuItem();
        MenuComandoItSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(995, 700));

        jDesktop_Vendas.setPreferredSize(new java.awt.Dimension(995, 600));

        rbGroupClientes.add(rbTipoPFisicaCliente);
        rbTipoPFisicaCliente.setText("Pessoa Física");
        rbTipoPFisicaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipoPFisicaClienteActionPerformed(evt);
            }
        });

        rbGroupClientes.add(rbTipoPJuridicaCliente);
        rbTipoPJuridicaCliente.setText("Pessoa Jurídica");
        rbTipoPJuridicaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipoPJuridicaClienteActionPerformed(evt);
            }
        });

        rbGroupClientes.add(rbTipoNaoIdentificado);
        rbTipoNaoIdentificado.setText("Não Identificado");
        rbTipoNaoIdentificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipoNaoIdentificadoActionPerformed(evt);
            }
        });

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCpfCliente.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        try {
            txtCnpjCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCnpjCliente.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        txtCnpjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel5.setText("CNPJ:");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel7.setText("Nome / Razão Social");

        txtNomeRazaoSocialCliente.setEditable(false);
        txtNomeRazaoSocialCliente.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        txtNomeRazaoSocialCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCpfCnpjPesquisarTelaVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnCpfCnpjPesquisarTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCpfCnpjPesquisarTelaVendasActionPerformed(evt);
            }
        });

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setText("jTextField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeRazaoSocialCliente)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbTipoPFisicaCliente))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCpfCnpjPesquisarTelaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbTipoPJuridicaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbTipoNaoIdentificado)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTipoPFisicaCliente)
                    .addComponent(rbTipoPJuridicaCliente)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTipoNaoIdentificado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCpfCnpjPesquisarTelaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeRazaoSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel3.setText("Código:");

        btnBuscarProdutosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/pesquisar.png"))); // NOI18N
        btnBuscarProdutosVendas.setText("Buscar");
        btnBuscarProdutosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutosVendasActionPerformed(evt);
            }
        });

        txtQuantidadeProdutoVenda.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtQuantidadeProdutoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoVendaActionPerformed(evt);
            }
        });
        txtQuantidadeProdutoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeProdutoVendaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel11.setText("Preço Unitário:");

        txtDescricaoProdutoVenda.setEditable(false);
        txtDescricaoProdutoVenda.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtDescricaoProdutoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel12.setText("Produto:");

        txtPrecoProdutoVendaOculto.setEditable(false);
        txtPrecoProdutoVendaOculto.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtPrecoProdutoVendaOculto.setForeground(new java.awt.Color(0, 102, 0));
        txtPrecoProdutoVendaOculto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoProdutoVendaOculto.setEnabled(false);

        btnAdicionarProdutoVenda.setText("Adicionar");
        btnAdicionarProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoVendaActionPerformed(evt);
            }
        });

        txtCodigoProdutoVenda.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtCodigoProdutoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoVendaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel17.setText("Quantidade:");

        txtPrecoProdutoVenda.setEditable(false);
        txtPrecoProdutoVenda.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtPrecoProdutoVenda.setForeground(new java.awt.Color(0, 102, 0));
        txtPrecoProdutoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCodigoProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarProdutosVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecoProdutoVendaOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPrecoProdutoVenda, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdicionarProdutoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                        .addComponent(txtQuantidadeProdutoVenda, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDescricaoProdutoVenda, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarProdutosVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoProdutoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(3, 3, 3)
                .addComponent(txtDescricaoProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPrecoProdutoVendaOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecoProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidadeProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblListaItensVendas.setAutoCreateRowSorter(true);
        tblListaItensVendas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tblListaItensVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Codigo", "Descrição", "Quantidade", "Preço Unitário", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaItensVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblListaItensVendas.setMinimumSize(new java.awt.Dimension(360, 0));
        tblListaItensVendas.setRowSelectionAllowed(false);
        tblListaItensVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblListaItensVendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblListaItensVendas);
        if (tblListaItensVendas.getColumnModel().getColumnCount() > 0) {
            tblListaItensVendas.getColumnModel().getColumn(0).setMinWidth(40);
            tblListaItensVendas.getColumnModel().getColumn(0).setMaxWidth(40);
            tblListaItensVendas.getColumnModel().getColumn(1).setMinWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(1).setMaxWidth(80);
            tblListaItensVendas.getColumnModel().getColumn(2).setMinWidth(250);
            //jTable1.getColumnModel().getColumn(2).setMaxWidth(250);
            tblListaItensVendas.getColumnModel().getColumn(3).setMinWidth(90);
            tblListaItensVendas.getColumnModel().getColumn(3).setMaxWidth(90);
            tblListaItensVendas.getColumnModel().getColumn(4).setMinWidth(110);
            tblListaItensVendas.getColumnModel().getColumn(4).setMaxWidth(110);
            tblListaItensVendas.getColumnModel().getColumn(5).setMinWidth(100);
            tblListaItensVendas.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setToolTipText("");

        lblSatusOperacao.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        lblSatusOperacao.setText("StatusCaixa");

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel14.setText("Status:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSatusOperacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSatusOperacao)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel10.setText("TOTAL");

        txtTotalVendaPVD.setEditable(false);
        txtTotalVendaPVD.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtTotalVendaPVD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalVendaPVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendaPVDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 28)); // NOI18N
        jLabel13.setText("QTD Itens");

        txtQtdItensTotal.setEditable(false);
        txtQtdItensTotal.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtQtdItensTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtdItensTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdItensTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtdItensTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalVendaPVD, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotalVendaPVD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtQtdItensTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jDesktop_Vendas.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop_Vendas.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop_Vendas.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop_Vendas.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop_Vendas.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktop_VendasLayout = new javax.swing.GroupLayout(jDesktop_Vendas);
        jDesktop_Vendas.setLayout(jDesktop_VendasLayout);
        jDesktop_VendasLayout.setHorizontalGroup(
            jDesktop_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktop_VendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktop_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktop_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktop_VendasLayout.setVerticalGroup(
            jDesktop_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktop_VendasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDesktop_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktop_VendasLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktop_VendasLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel18.setText("Opções");

        jLabel19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel19.setText("F2 - Nova Venda  F3 - Cancelar Venda  F4 - Finalizar Venda  F6 - Cancelar Produto  F7 - Sair");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setText("BARBOSA STORE");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Comércio e Serviços");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(17, 17, 17))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel18))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop_Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktop_Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Comandos");

        MenuComandoItNovoVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuComandoItNovoVenda.setText("F2 - Nova Venda");
        MenuComandoItNovoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuComandoItNovoVendaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuComandoItNovoVenda);

        MenuComandoItCancelarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuComandoItCancelarVenda.setText("F3 - Cancelar Venda");
        MenuComandoItCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuComandoItCancelarVendaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuComandoItCancelarVenda);

        MenuComandoItFinalizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuComandoItFinalizarVenda.setText("F4 - Finalizar Venda");
        MenuComandoItFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuComandoItFinalizarVendaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuComandoItFinalizarVenda);

        AtalhoRemoverProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        AtalhoRemoverProduto.setText("F6 - Remover Produto");
        AtalhoRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtalhoRemoverProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(AtalhoRemoverProduto);

        MenuComandoItSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        MenuComandoItSair.setText("F7 - Sair");
        MenuComandoItSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuComandoItSairActionPerformed(evt);
            }
        });
        jMenu1.add(MenuComandoItSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(995, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbTipoPJuridicaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipoPJuridicaClienteActionPerformed
        // TODO add your handling code here:
        txtCnpjCliente.setEnabled(true);
        txtCpfCliente.setEnabled(false);
        txtCpfCliente.setText(null);
        btnCpfCnpjPesquisarTelaVendas.setEnabled(true);

    }//GEN-LAST:event_rbTipoPJuridicaClienteActionPerformed

    private void rbTipoPFisicaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipoPFisicaClienteActionPerformed
        // TODO add your handling code here:
        txtCnpjCliente.setEnabled(false);
        txtCnpjCliente.setText(null);
        txtCpfCliente.setEnabled(true);
        btnCpfCnpjPesquisarTelaVendas.setEnabled(true);
    }//GEN-LAST:event_rbTipoPFisicaClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
        //        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        //        JFrame frame = new JFrame();
        //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //        frame.setUndecorated(true);
        //        frame.setSize(r.width, r.height);
        //        frame.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void btnCpfCnpjPesquisarTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCpfCnpjPesquisarTelaVendasActionPerformed
        // TODO add your handling code here:

        ClienteController clienteDados = new ClienteController();
        if (rbTipoPFisicaCliente.isSelected()) {
            cliente = clienteDados.getClienteControllerCpfCnpj(txtCpfCliente.getText());
            txtNomeRazaoSocialCliente.setText(cliente.getNomeRazaoSocial());
            txtCodigoProdutoVenda.grabFocus();
            txtCodigoCliente.setText(String.valueOf(cliente.getCodigo()));
        } else {
            cliente = clienteDados.getClienteControllerCpfCnpj(txtCnpjCliente.getText());
            txtNomeRazaoSocialCliente.setText(cliente.getNomeRazaoSocial());
            txtCodigoProdutoVenda.grabFocus();
            txtCodigoCliente.setText(String.valueOf(cliente.getCodigo()));
        }


    }//GEN-LAST:event_btnCpfCnpjPesquisarTelaVendasActionPerformed

    private void btnBuscarProdutosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutosVendasActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoCodProduto() == true) {

            ProdutoController produtosDados = new ProdutoController();
            produto = produtosDados.getProdutoControllerCodigoVenda(Integer.parseInt(this.txtCodigoProdutoVenda.getText()));
            txtDescricaoProdutoVenda.setText(produto.getDescricao());
            txtPrecoProdutoVendaOculto.setText(String.valueOf(produto.getValor()));
            Double valorRetorno = produto.getValor();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String valorTela = df.format(valorRetorno);
            this.txtPrecoProdutoVenda.setText(valorTela);
            this.txtQuantidadeProdutoVenda.grabFocus();
        } else {

        }
    }//GEN-LAST:event_btnBuscarProdutosVendasActionPerformed

    private void rbTipoNaoIdentificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipoNaoIdentificadoActionPerformed
        // TODO add your handling code here:
        txtCpfCliente.setEnabled(false);
        txtCnpjCliente.setEnabled(false);
        txtCpfCliente.setText(null);
        txtCnpjCliente.setText(null);
        btnCpfCnpjPesquisarTelaVendas.setEnabled(false);
        txtNomeRazaoSocialCliente.setText("VENDA BALCAO PDV");
        txtCodigoCliente.setText("11");
        txtCodigoProdutoVenda.grabFocus();
    }//GEN-LAST:event_rbTipoNaoIdentificadoActionPerformed

    private void txtTotalVendaPVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendaPVDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVendaPVDActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        // TODO add your handling code here:
        btnCpfCnpjPesquisarTelaVendasActionPerformed(evt);
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void txtCnpjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjClienteActionPerformed
        // TODO add your handling code here:
        btnCpfCnpjPesquisarTelaVendasActionPerformed(evt);
    }//GEN-LAST:event_txtCnpjClienteActionPerformed

    private void txtQtdItensTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdItensTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdItensTotalActionPerformed

    private void txtQuantidadeProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoVendaActionPerformed
        // TODO add your handling code here:
        btnAdicionarProdutoVendaActionPerformed(evt);

    }//GEN-LAST:event_txtQuantidadeProdutoVendaActionPerformed

    private void txtQuantidadeProdutoVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoVendaKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeProdutoVendaKeyTyped

    private void btnAdicionarProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoVendaActionPerformed
        // TODO add your handling code here:
        if (testarSelecaoCodProduto() == true && testarSelecaoQuantidade() == true) {
            this.incluirProduto();

            Double valorTotalRetorno = (this.atualizarValorTotal());
            DecimalFormat dfNovo = new DecimalFormat("#,##0.00");
            String valorTotalTela = dfNovo.format(valorTotalRetorno);
            this.totalValorFormatado = valorTotalTela;
            this.txtTotalVendaPVD.setText(totalValorFormatado);

            this.txtQtdItensTotal.setText(String.valueOf(this.atualizarQuantidadeItens()));

            this.txtPrecoProdutoVendaOculto.setText("");
            this.txtCodigoProdutoVenda.grabFocus();
        } else {

        }
    }//GEN-LAST:event_btnAdicionarProdutoVendaActionPerformed

    private void txtCodigoProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoVendaActionPerformed
        // TODO add your handling code here:
        btnBuscarProdutosVendasActionPerformed(evt);
    }//GEN-LAST:event_txtCodigoProdutoVendaActionPerformed

    private void MenuComandoItSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuComandoItSairActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja finalizar modulo PDV ?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirma == 0) {
            MenuPrincipalView telaprincipal = new MenuPrincipalView();
            this.dispose();
            telaprincipal.setLocationRelativeTo(this);
            telaprincipal.setVisible(true);
        }

    }//GEN-LAST:event_MenuComandoItSairActionPerformed

    private void AtalhoRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtalhoRemoverProdutoActionPerformed
        // TODO add your handling code here:
        this.removerProduto();
    }//GEN-LAST:event_AtalhoRemoverProdutoActionPerformed

    private void MenuComandoItFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuComandoItFinalizarVendaActionPerformed
        // TODO add your handling code here:
        if (txtCodigoCliente.getText().equals("") || tblListaItensVendas.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "É necessário informar um cliente e selecionar um produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

        } else {
            Cliente objCliente = new Cliente();

            //Dados do cliente
            objCliente.setCodigo(Integer.parseInt(this.txtCodigoCliente.getText()));

            PagamentosView telaPagamento = new PagamentosView(this, rootPaneCheckingEnabled);
            telaPagamento.setLocationRelativeTo(this);
            telaPagamento.setLblValorTotal(totalValorFormatado);
            telaPagamento.setLblValorTotalAReceber(totalValorFormatado);

            telaPagamento.objClientesPagamentos = objCliente;
            telaPagamento.itensDaVenda = this.itensDaVenda;
            telaPagamento.setVisible(rootPaneCheckingEnabled);

            if (telaPagamento.getStatusRetorno() == 1) {
                finalizarVenda();
            }
        }
    }//GEN-LAST:event_MenuComandoItFinalizarVendaActionPerformed

    private void MenuComandoItNovoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuComandoItNovoVendaActionPerformed
        // TODO add your handling code here:
        this.novaVenda();
    }//GEN-LAST:event_MenuComandoItNovoVendaActionPerformed

    private void MenuComandoItCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuComandoItCancelarVendaActionPerformed
        // TODO add your handling code here:
        finalizarVenda();
    }//GEN-LAST:event_MenuComandoItCancelarVendaActionPerformed

    private void incluirProduto() {
        quantidade = Integer.parseInt(this.txtQuantidadeProdutoVenda.getText());
        preco = Double.parseDouble(this.txtPrecoProdutoVendaOculto.getText());
        subTotal = quantidade * preco;

        precoFormatado = valoresMonentarios.format(preco);
        Double valorSubTotalRetorno = (subTotal);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorSubTotalTela = df.format(valorSubTotalRetorno);
        this.subTotalValorFormatado = valorSubTotalTela;

        total += subTotal;

        Double valorTotalRetorno = (total);
        DecimalFormat dfNovo = new DecimalFormat("#,##0.00");
        String valorTotalTela = dfNovo.format(valorTotalRetorno);
        this.totalValorFormatado = valorTotalTela;

        this.txtTotalVendaPVD.setText(totalValorFormatado);

        carrinhos = (DefaultTableModel) tblListaItensVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            carrinhos.setNumRows(0);
        }

        carrinhos.addRow(new Object[]{
            this.tblListaItensVendas.getRowCount() + 1,
            this.txtCodigoProdutoVenda.getText(),
            this.txtDescricaoProdutoVenda.getText(),
            this.txtQuantidadeProdutoVenda.getText(),
            this.precoFormatado,
            this.subTotalValorFormatado,
            this.subTotal
        });

        this.itensDaVenda = carrinhos;

        this.txtCodigoProdutoVenda.setText(null);
        this.txtDescricaoProdutoVenda.setText(null);
        this.txtPrecoProdutoVenda.setText(null);
        this.txtPrecoProdutoVendaOculto.setText(null);
        this.txtQuantidadeProdutoVenda.setText(null);
    }

    private boolean testarSelecaoCodProduto() {
        if (txtCodigoProdutoVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um produto.");
            return false;
        }
        return true;
    }

    private boolean testarSelecaoProduto() {
        int selecao = tblListaItensVendas.getSelectedRow();
        if (selecao == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;
    }

    private boolean testarSelecaoQuantidade() {
        if (txtQuantidadeProdutoVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "É necessário informar a quantidade");
            return false;
        }
        return true;
    }

    private Double atualizarValorTotal() {
        Double operacaoSoma = 0.00;
        Double valor;
        int contador = tblListaItensVendas.getRowCount();
        for (int i = 0; i < contador; i++) {
            //valor = Double.parseDouble(String.valueOf(tblListaItensVendas.getValueAt(i, 3)));
            String valorOriginal = String.valueOf(tblListaItensVendas.getValueAt(i, 5));
            String valorOriginalFormatado = valorOriginal.replace(".", "");
            String valorOriginalFormatado2 = valorOriginalFormatado.replace(",", ".");
            valor = Double.parseDouble(valorOriginalFormatado2);
            operacaoSoma = valor + operacaoSoma;
        }

        return operacaoSoma;
    }

    private int atualizarQuantidadeItens() {
        int operacaoSomaItens = 0;
        int valor;
        int contador = tblListaItensVendas.getRowCount();
        for (int i = 0; i < contador; i++) {
            //valor = Double.parseDouble(String.valueOf(tblListaItensVendas.getValueAt(i, 3)));
            String valorOriginal = String.valueOf(tblListaItensVendas.getValueAt(i, 3));
            valor = Integer.parseInt(valorOriginal);
            operacaoSomaItens = valor + operacaoSomaItens;
        }

        return operacaoSomaItens;
    }

    private void removerProduto() {
        if (testarSelecaoProduto() == true) {
            int linhaSelecionada = tblListaItensVendas.getSelectedRow();
            String descricaoProduto = (String) tblListaItensVendas.getValueAt(linhaSelecionada, 2);

            // Questiona a exclusão
            int opcao = JOptionPane.showConfirmDialog(this, "Confirma a remoção do item: \n"
                    + descricaoProduto + " ?", "Confirme", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada    
            if (opcao == JOptionPane.OK_OPTION) {
                DefaultTableModel modelo = (DefaultTableModel) tblListaItensVendas.getModel();
                // Remove a linha
                modelo.removeRow(linhaSelecionada);
                Double valorTotalRetorno = (this.atualizarValorTotal());
                DecimalFormat df = new DecimalFormat("#,##0.00");
                String valorTotalTela = df.format(valorTotalRetorno);
                this.txtTotalVendaPVD.setText(valorTotalTela);
                this.txtQtdItensTotal.setText(String.valueOf(atualizarQuantidadeItens()));
            }

        }
    }

    private void novaVenda() {
        lblSatusOperacao.setText("Ocupado");
        rbTipoNaoIdentificado.setSelected(true);
        txtNomeRazaoSocialCliente.setText("VENDA BALCAO PDV");
        txtCodigoCliente.setText("11");
        camposBotoesAtivados();
        MenuComandoItNovoVenda.setEnabled(false);

    }

    private void carregamentoInicial() {
        lblSatusOperacao.setText("Fechado");
        camposBotoesDesativados();
    }

    public void finalizarVenda() {
        lblSatusOperacao.setText("Livre");
        camposBotoesDesativados();
        limparCampos();
        limparTabela();
    }

    public void camposBotoesDesativados() {
        rbTipoPFisicaCliente.setEnabled(false);
        rbTipoPJuridicaCliente.setEnabled(false);
        rbTipoNaoIdentificado.setEnabled(false);
        txtCnpjCliente.setEnabled(false);
        txtCpfCliente.setEnabled(false);
        btnCpfCnpjPesquisarTelaVendas.setEnabled(false);
        txtNomeRazaoSocialCliente.setEnabled(false);
        txtNomeRazaoSocialCliente.setEnabled(false);
        txtCodigoProdutoVenda.setEnabled(false);
        btnBuscarProdutosVendas.setEnabled(false);
        txtDescricaoProdutoVenda.setEnabled(false);
        txtQuantidadeProdutoVenda.setEnabled(false);
        txtPrecoProdutoVenda.setEnabled(false);
        txtQuantidadeProdutoVenda.setEnabled(false);
        btnAdicionarProdutoVenda.setEnabled(false);
        MenuComandoItNovoVenda.setEnabled(true);
        MenuComandoItFinalizarVenda.setEnabled(false);
        MenuComandoItCancelarVenda.setEnabled(false);
        AtalhoRemoverProduto.setEnabled(false);
    }

    public void camposBotoesAtivados() {
        rbTipoPFisicaCliente.setEnabled(true);
        rbTipoPJuridicaCliente.setEnabled(true);
        rbTipoNaoIdentificado.setEnabled(true);
        btnCpfCnpjPesquisarTelaVendas.setEnabled(true);
        txtNomeRazaoSocialCliente.setEnabled(true);
        txtNomeRazaoSocialCliente.setEnabled(true);
        txtCodigoProdutoVenda.setEnabled(true);
        btnBuscarProdutosVendas.setEnabled(true);
        txtDescricaoProdutoVenda.setEnabled(true);
        txtQuantidadeProdutoVenda.setEnabled(true);
        txtPrecoProdutoVenda.setEnabled(true);
        txtQuantidadeProdutoVenda.setEnabled(true);
        btnAdicionarProdutoVenda.setEnabled(true);
        MenuComandoItFinalizarVenda.setEnabled(true);
        MenuComandoItCancelarVenda.setEnabled(true);
        AtalhoRemoverProduto.setEnabled(true);
    }

    public void limparCampos() {
        txtCnpjCliente.setText("");
        txtCpfCliente.setText("");
        txtNomeRazaoSocialCliente.setText("");
        txtNomeRazaoSocialCliente.setText("");
        txtCodigoProdutoVenda.setText("");
        txtDescricaoProdutoVenda.setText("");
        txtQuantidadeProdutoVenda.setText("");
        txtPrecoProdutoVenda.setText("");
        txtQuantidadeProdutoVenda.setText("");
        txtTotalVendaPVD.setText("");
        txtQtdItensTotal.setText("");

    }

    private void limparTabela() {
        carrinhos = (DefaultTableModel) tblListaItensVendas.getModel();
        carrinhos.setNumRows(0);
        //tfCodigoProduto.grabFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AtalhoRemoverProduto;
    private javax.swing.JMenuItem MenuComandoItCancelarVenda;
    private javax.swing.JMenuItem MenuComandoItFinalizarVenda;
    private javax.swing.JMenuItem MenuComandoItNovoVenda;
    private javax.swing.JMenuItem MenuComandoItSair;
    private javax.swing.JButton btnAdicionarProdutoVenda;
    private javax.swing.JButton btnBuscarProdutosVendas;
    private javax.swing.JButton btnCpfCnpjPesquisarTelaVendas;
    private javax.swing.JDesktopPane jDesktop_Vendas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSatusOperacao;
    private javax.swing.ButtonGroup rbGroupClientes;
    protected javax.swing.JRadioButton rbTipoNaoIdentificado;
    protected javax.swing.JRadioButton rbTipoPFisicaCliente;
    protected javax.swing.JRadioButton rbTipoPJuridicaCliente;
    private javax.swing.JTable tblListaItensVendas;
    protected javax.swing.JFormattedTextField txtCnpjCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoProdutoVenda;
    protected javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JTextField txtDescricaoProdutoVenda;
    protected javax.swing.JTextField txtNomeRazaoSocialCliente;
    private javax.swing.JTextField txtPrecoProdutoVenda;
    private javax.swing.JTextField txtPrecoProdutoVendaOculto;
    private javax.swing.JTextField txtQtdItensTotal;
    private javax.swing.JTextField txtQuantidadeProdutoVenda;
    private javax.swing.JTextField txtTotalVendaPVD;
    // End of variables declaration//GEN-END:variables
}
