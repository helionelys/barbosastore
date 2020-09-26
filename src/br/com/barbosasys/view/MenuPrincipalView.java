/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.view;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Helionelys
 */
public class MenuPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalView
     */
    public MenuPrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/barbosasys/images/telafundomenu.jpg"));
        Image image = icon.getImage();
        Painel_desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnServico = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroCliente = new javax.swing.JMenuItem();
        MenuCadastroFornecedor = new javax.swing.JMenuItem();
        MenuCadastroFuncionario = new javax.swing.JMenuItem();
        MenuCadastroProduto = new javax.swing.JMenuItem();
        MenuCadastroServico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        MenuCadastroCadAuxCatProduto = new javax.swing.JMenuItem();
        MenuCadastroCadAuxCatServico = new javax.swing.JMenuItem();
        MenuCadastroCadAuxUniMedida = new javax.swing.JMenuItem();
        MenuMovimento = new javax.swing.JMenu();
        MenuMovimentoOrcamento = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuMovimentoServicos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        MenuMovimentoVendaConsulta = new javax.swing.JMenuItem();
        MenuMovimentoVendaRegistrar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MenuMovimentoAjusteEstoque = new javax.swing.JMenuItem();
        MenuFinanceiro = new javax.swing.JMenu();
        MenuFinanceiroContaPagar = new javax.swing.JMenuItem();
        MenuFinanceiroContaReceber = new javax.swing.JMenuItem();
        MenuFinanceiroFluxoCaixa = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuSeguranca = new javax.swing.JMenu();
        MenuSegurancaUsuarios = new javax.swing.JMenuItem();
        MenuSegurancaPerfis = new javax.swing.JMenuItem();
        MenuSegurancaDadosEmpresas = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        MenuOpcoesLogff = new javax.swing.JMenuItem();
        MenuOpcoesSair = new javax.swing.JMenuItem();
        MenuOpcoesSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbosa Store - Comércio e Serviços");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Funcionário:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 606, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/People-32.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setDefaultCapable(false);
        btnClientes.setFocusable(false);
        btnClientes.setHideActionText(true);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/produtos2.png"))); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdutos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Cart-32.png"))); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Tools-32.png"))); // NOI18N
        btnServico.setText("Serviços");
        btnServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServico.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicoActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Money_Calculator_32.png"))); // NOI18N
        jButton16.setText("Orçamentos");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Exit-32_1.png"))); // NOI18N
        jButton15.setText("Sair");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClientes, btnProdutos, btnServico, btnVendas, jButton15, jButton16});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes)
            .addComponent(btnProdutos)
            .addComponent(btnVendas)
            .addComponent(btnServico)
            .addComponent(jButton16)
            .addComponent(jButton15)
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClientes, btnProdutos});

        Painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Painel_desktop.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Painel_desktopLayout = new javax.swing.GroupLayout(Painel_desktop);
        Painel_desktop.setLayout(Painel_desktopLayout);
        Painel_desktopLayout.setHorizontalGroup(
            Painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Painel_desktopLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Painel_desktopLayout.setVerticalGroup(
            Painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_desktopLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_desktop)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_desktop)
        );

        MenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Create.png"))); // NOI18N
        MenuCadastro.setText("Cadastros");

        MenuCadastroCliente.setText("Clientes");
        MenuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroCliente);

        MenuCadastroFornecedor.setText("Fornecedores");
        MenuCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroFornecedorActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroFornecedor);

        MenuCadastroFuncionario.setText("Funcionários");
        MenuCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroFuncionario);

        MenuCadastroProduto.setText("Produtos");
        MenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroProdutoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroProduto);

        MenuCadastroServico.setText("Serviços");
        MenuCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroServicoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroServico);
        MenuCadastro.add(jSeparator1);

        jMenu7.setText("Cadastros Auxiliares");

        MenuCadastroCadAuxCatProduto.setText("Categoria de Produto");
        MenuCadastroCadAuxCatProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroCadAuxCatProdutoActionPerformed(evt);
            }
        });
        jMenu7.add(MenuCadastroCadAuxCatProduto);

        MenuCadastroCadAuxCatServico.setText("Categoria de Serviço");
        MenuCadastroCadAuxCatServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroCadAuxCatServicoActionPerformed(evt);
            }
        });
        jMenu7.add(MenuCadastroCadAuxCatServico);

        MenuCadastroCadAuxUniMedida.setText("Unidade de Medida");
        MenuCadastroCadAuxUniMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroCadAuxUniMedidaActionPerformed(evt);
            }
        });
        jMenu7.add(MenuCadastroCadAuxUniMedida);

        MenuCadastro.add(jMenu7);

        jMenuBar1.add(MenuCadastro);

        MenuMovimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Shopping cart.png"))); // NOI18N
        MenuMovimento.setText("Movimento");

        MenuMovimentoOrcamento.setText("Orçamento");
        MenuMovimento.add(MenuMovimentoOrcamento);
        MenuMovimento.add(jSeparator2);

        MenuMovimentoServicos.setText("Serviços");
        MenuMovimento.add(MenuMovimentoServicos);
        MenuMovimento.add(jSeparator3);

        jMenu8.setText("Vendas");

        MenuMovimentoVendaConsulta.setText("Consultar Vendas");
        jMenu8.add(MenuMovimentoVendaConsulta);

        MenuMovimentoVendaRegistrar.setText("Registrar Venda");
        MenuMovimentoVendaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMovimentoVendaRegistrarActionPerformed(evt);
            }
        });
        jMenu8.add(MenuMovimentoVendaRegistrar);

        MenuMovimento.add(jMenu8);
        MenuMovimento.add(jSeparator4);

        MenuMovimentoAjusteEstoque.setText("Ajuste de Estoque de Produto");
        MenuMovimento.add(MenuMovimentoAjusteEstoque);

        jMenuBar1.add(MenuMovimento);

        MenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Dollar.png"))); // NOI18N
        MenuFinanceiro.setText("Financeiro");

        MenuFinanceiroContaPagar.setText("Contas a Pagar");
        MenuFinanceiro.add(MenuFinanceiroContaPagar);

        MenuFinanceiroContaReceber.setText("Contas a Receber");
        MenuFinanceiro.add(MenuFinanceiroContaReceber);

        MenuFinanceiroFluxoCaixa.setText("Fluxo de Caixa");
        MenuFinanceiroFluxoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFinanceiroFluxoCaixaActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuFinanceiroFluxoCaixa);

        jMenuBar1.add(MenuFinanceiro);

        MenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Report.png"))); // NOI18N
        MenuRelatorio.setText("Relatorios");
        jMenuBar1.add(MenuRelatorio);

        MenuSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Lock.png"))); // NOI18N
        MenuSeguranca.setText("Segurança");

        MenuSegurancaUsuarios.setText("Usuários");
        MenuSeguranca.add(MenuSegurancaUsuarios);

        MenuSegurancaPerfis.setText("Perfils");
        MenuSeguranca.add(MenuSegurancaPerfis);

        MenuSegurancaDadosEmpresas.setText("Dados da Empresa");
        MenuSeguranca.add(MenuSegurancaDadosEmpresas);

        jMenuBar1.add(MenuSeguranca);

        MenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/barbosasys/images/Application.png"))); // NOI18N
        MenuOpcoes.setText("Opções");

        MenuOpcoesLogff.setText("Logoff");
        MenuOpcoes.add(MenuOpcoesLogff);

        MenuOpcoesSair.setText("Sair");
        MenuOpcoes.add(MenuOpcoesSair);

        MenuOpcoesSobre.setText("Sobre");
        MenuOpcoes.add(MenuOpcoesSobre);

        jMenuBar1.add(MenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuFinanceiroFluxoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFinanceiroFluxoCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuFinanceiroFluxoCaixaActionPerformed

    private void MenuCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        FuncionarioView telafuncionario = new FuncionarioView(this, rootPaneCheckingEnabled);
        telafuncionario.setLocationRelativeTo(this);
        telafuncionario.setVisible(true);
    }//GEN-LAST:event_MenuCadastroFuncionarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);    
    }//GEN-LAST:event_formWindowActivated

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        MenuCadastroClienteActionPerformed(evt);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void MenuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroClienteActionPerformed
        // TODO add your handling code here:
        ClienteView telacliente = new ClienteView(this, rootPaneCheckingEnabled);
        telacliente.setLocationRelativeTo(this);
        telacliente.setVisible(true);
    }//GEN-LAST:event_MenuCadastroClienteActionPerformed

    private void MenuCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroFornecedorActionPerformed
        // TODO add your handling code here:
        FornecedorView telafornecedor = new FornecedorView(this, rootPaneCheckingEnabled);
        telafornecedor.setLocationRelativeTo(this);
        telafornecedor.setVisible(true);
    }//GEN-LAST:event_MenuCadastroFornecedorActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
        MenuCadastroProdutoActionPerformed(evt);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void MenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        ProdutoView telaproduto = new ProdutoView(this, rootPaneCheckingEnabled);
        telaproduto.setLocationRelativeTo(this);
        telaproduto.setVisible(true);
    }//GEN-LAST:event_MenuCadastroProdutoActionPerformed

    private void MenuCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroServicoActionPerformed
        // TODO add your handling code here:
        ServicoView telaservico = new ServicoView(this, rootPaneCheckingEnabled);
        telaservico.setLocationRelativeTo(this);
        telaservico.setVisible(true);
    }//GEN-LAST:event_MenuCadastroServicoActionPerformed

    private void btnServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicoActionPerformed
        // TODO add your handling code here:
        MenuCadastroServicoActionPerformed(evt);
    }//GEN-LAST:event_btnServicoActionPerformed

    private void MenuCadastroCadAuxCatProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroCadAuxCatProdutoActionPerformed
        // TODO add your handling code here:
        CategoriaProdutoView telacategoriaproduto = new CategoriaProdutoView(this, rootPaneCheckingEnabled);
        telacategoriaproduto.setLocationRelativeTo(this);
        telacategoriaproduto.setVisible(true);
    }//GEN-LAST:event_MenuCadastroCadAuxCatProdutoActionPerformed

    private void MenuCadastroCadAuxCatServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroCadAuxCatServicoActionPerformed
        // TODO add your handling code here:
        CategoriaServicoView telacategoriaservico = new CategoriaServicoView(this, rootPaneCheckingEnabled);
        telacategoriaservico.setLocationRelativeTo(this);
        telacategoriaservico.setVisible(true);
    }//GEN-LAST:event_MenuCadastroCadAuxCatServicoActionPerformed

    private void MenuCadastroCadAuxUniMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroCadAuxUniMedidaActionPerformed
        // TODO add your handling code here:
        UnidadeMedidaView telaunidademedida = new UnidadeMedidaView(this, rootPaneCheckingEnabled);
        telaunidademedida.setLocationRelativeTo(this);
        telaunidademedida.setVisible(true);
    }//GEN-LAST:event_MenuCadastroCadAuxUniMedidaActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        // TODO add your handling code here:
        MenuMovimentoVendaRegistrarActionPerformed(evt);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void MenuMovimentoVendaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMovimentoVendaRegistrarActionPerformed
        // TODO add your handling code here:
        TelaVendasView2 telaVendas = new TelaVendasView2(this, rootPaneCheckingEnabled);
//       TelaVendasView telaVendas = new TelaVendasView();
        telaVendas.setLocationRelativeTo(this);
        telaVendas.setVisible(true);
        
//        TelaVendasView telaVenda = new TelaVendasView();
//         telaVenda.setLocationRelativeTo(this);
//         telaVenda.setVisible(true);
//         this.dispose();
    }//GEN-LAST:event_MenuMovimentoVendaRegistrarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCadastroCadAuxCatProduto;
    private javax.swing.JMenuItem MenuCadastroCadAuxCatServico;
    private javax.swing.JMenuItem MenuCadastroCadAuxUniMedida;
    private javax.swing.JMenuItem MenuCadastroCliente;
    private javax.swing.JMenuItem MenuCadastroFornecedor;
    private javax.swing.JMenuItem MenuCadastroFuncionario;
    private javax.swing.JMenuItem MenuCadastroProduto;
    private javax.swing.JMenuItem MenuCadastroServico;
    private javax.swing.JMenu MenuFinanceiro;
    private javax.swing.JMenuItem MenuFinanceiroContaPagar;
    private javax.swing.JMenuItem MenuFinanceiroContaReceber;
    private javax.swing.JMenuItem MenuFinanceiroFluxoCaixa;
    private javax.swing.JMenu MenuMovimento;
    private javax.swing.JMenuItem MenuMovimentoAjusteEstoque;
    private javax.swing.JMenuItem MenuMovimentoOrcamento;
    private javax.swing.JMenuItem MenuMovimentoServicos;
    private javax.swing.JMenuItem MenuMovimentoVendaConsulta;
    private javax.swing.JMenuItem MenuMovimentoVendaRegistrar;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JMenuItem MenuOpcoesLogff;
    private javax.swing.JMenuItem MenuOpcoesSair;
    private javax.swing.JMenuItem MenuOpcoesSobre;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenu MenuSeguranca;
    private javax.swing.JMenuItem MenuSegurancaDadosEmpresas;
    private javax.swing.JMenuItem MenuSegurancaPerfis;
    private javax.swing.JMenuItem MenuSegurancaUsuarios;
    private javax.swing.JDesktopPane Painel_desktop;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnServico;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
