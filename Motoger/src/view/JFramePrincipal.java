package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

public class JFramePrincipal extends javax.swing.JFrame {

    int testa = 0;
    
    public JFramePrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jPanelLogoff.setVisible(false);
        File file = new File("logado.txt");
        if(file.exists()){
            lerLogin();
            lerUsuario();
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryUsuario = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Usuario u order by u.idUsuario");
        listUsuario = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryUsuario.getResultList());
        jPanelToolBarPrincipal = new javax.swing.JPanel();
        jToolBarPrincipal = new javax.swing.JToolBar();
        jButtonProdutos = new javax.swing.JButton();
        jButtonServicos = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonVeiculo = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButtonOrdemServico = new javax.swing.JButton();
        jButtonVenda = new javax.swing.JButton();
        jButtonReceber = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButtonLogoff = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelStatusBarPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDataHora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelLogoff = new javax.swing.JPanel();
        jLabelLabelLogin = new javax.swing.JLabel();
        jLabelLabelSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonLogoffOk = new javax.swing.JButton();
        jButtonLogoffCancelar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadVeiculo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemCadServico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadEmpresa = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuTabelasAuxiliares = new javax.swing.JMenu();
        jMenuItemMarcaProduto = new javax.swing.JMenuItem();
        jMenuItemGrupoProduto = new javax.swing.JMenuItem();
        jMenuItemCategoriaProduto = new javax.swing.JMenuItem();
        jMenuItemMarcaMoto = new javax.swing.JMenuItem();
        jMenuItemModeloMoto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMovimento = new javax.swing.JMenu();
        jMenuItemMovOrdemServico = new javax.swing.JMenuItem();
        jMenuItemMovVenda = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEntradaProduto = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemFinReceber = new javax.swing.JMenuItem();
        jMenuRelatórios = new javax.swing.JMenu();
        jMenuItemRelFinan = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MOTOGER v1.0 - SISTEMA DE GERENCIAMENTO PARA OFICINAS DE MOTOS");
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanelToolBarPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jToolBarPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        jToolBarPrincipal.setFloatable(false);
        jToolBarPrincipal.setRollover(true);

        jButtonProdutos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produto.png"))); // NOI18N
        jButtonProdutos.setText("Produtos");
        jButtonProdutos.setToolTipText("Abrir tela de gerenciamento de produtos");
        jButtonProdutos.setFocusable(false);
        jButtonProdutos.setHideActionText(true);
        jButtonProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProdutos.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonProdutos);

        jButtonServicos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/servico.png"))); // NOI18N
        jButtonServicos.setText("Serviços");
        jButtonServicos.setToolTipText("Abrir tela de gerenciamento de serviços");
        jButtonServicos.setFocusable(false);
        jButtonServicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonServicos.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicosActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonServicos);

        jButtonCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente-48.png"))); // NOI18N
        jButtonCliente.setText("Clientes (F3)");
        jButtonCliente.setToolTipText("Abrir tela de gerenciamento de clientes");
        jButtonCliente.setFocusable(false);
        jButtonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCliente.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonCliente);

        jButtonVeiculo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veiculo.png"))); // NOI18N
        jButtonVeiculo.setText("Veículos (F4)");
        jButtonVeiculo.setToolTipText("Abrir tela de gerenciamento de veículos");
        jButtonVeiculo.setFocusable(false);
        jButtonVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeiculo.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeiculoActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonVeiculo);
        jToolBarPrincipal.add(jSeparator5);
        jToolBarPrincipal.add(jSeparator7);

        jButtonOrdemServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ordem-servico-48.png"))); // NOI18N
        jButtonOrdemServico.setText("ORÇ. / O.S. (F6)");
        jButtonOrdemServico.setToolTipText("Abrir Ordem de Serviço");
        jButtonOrdemServico.setFocusable(false);
        jButtonOrdemServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOrdemServico.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdemServicoActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonOrdemServico);

        jButtonVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venda-48.png"))); // NOI18N
        jButtonVenda.setText("Venda (F7)");
        jButtonVenda.setToolTipText("Venda de Produtos");
        jButtonVenda.setFocusable(false);
        jButtonVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVenda.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendaActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonVenda);

        jButtonReceber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber-48.png"))); // NOI18N
        jButtonReceber.setText("Receber (F9)");
        jButtonReceber.setToolTipText("Efetuar recebimento de contas");
        jButtonReceber.setFocusable(false);
        jButtonReceber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonReceber.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceberActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonReceber);
        jToolBarPrincipal.add(jSeparator6);
        jToolBarPrincipal.add(jSeparator8);

        jButtonLogoff.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jButtonLogoff.setText("Logoff (F12)");
        jButtonLogoff.setToolTipText("Trocar o usuário do sistema");
        jButtonLogoff.setFocusable(false);
        jButtonLogoff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogoff.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonLogoff);

        jButtonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair-48.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("Sair do programa");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSair.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSair.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(jButtonSair);

        javax.swing.GroupLayout jPanelToolBarPrincipalLayout = new javax.swing.GroupLayout(jPanelToolBarPrincipal);
        jPanelToolBarPrincipal.setLayout(jPanelToolBarPrincipalLayout);
        jPanelToolBarPrincipalLayout.setHorizontalGroup(
            jPanelToolBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelToolBarPrincipalLayout.setVerticalGroup(
            jPanelToolBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelStatusBarPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(150, 25));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabelLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelUsuario.setText("Usuário:");

        jLabelUsuario.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuario.setText("---");

        jLabelTipo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 25));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabelDataHora.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDataHora.setText("---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelStatusBarPrincipalLayout = new javax.swing.GroupLayout(jPanelStatusBarPrincipal);
        jPanelStatusBarPrincipal.setLayout(jPanelStatusBarPrincipalLayout);
        jPanelStatusBarPrincipalLayout.setHorizontalGroup(
            jPanelStatusBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusBarPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelStatusBarPrincipalLayout.setVerticalGroup(
            jPanelStatusBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logomotoger.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanelLogoff.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelLogin.setText("Login:");

        jLabelLabelSenha.setText("Senha:");

        jButtonLogoffOk.setText("OK");
        jButtonLogoffOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffOkActionPerformed(evt);
            }
        });

        jButtonLogoffCancelar.setText("Cancelar");
        jButtonLogoffCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoffLayout = new javax.swing.GroupLayout(jPanelLogoff);
        jPanelLogoff.setLayout(jPanelLogoffLayout);
        jPanelLogoffLayout.setHorizontalGroup(
            jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelSenha)
                    .addComponent(jLabelLabelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogoffLayout.createSequentialGroup()
                        .addComponent(jButtonLogoffCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogoffOk, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addComponent(jTextFieldLogin)
                    .addComponent(jPasswordFieldSenha))
                .addContainerGap())
        );
        jPanelLogoffLayout.setVerticalGroup(
            jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoffLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelLogin)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogoffOk)
                    .addComponent(jButtonLogoffCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jMenu1.setText("---");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem2.setText("Logoff");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBarPrincipal.add(jMenu1);

        jMenuCadastro.setText("Gerenciamento");

        jMenuItemCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente-16.png"))); // NOI18N
        jMenuItemCadCliente.setText("Cliente");
        jMenuItemCadCliente.setPreferredSize(new java.awt.Dimension(143, 25));
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCliente);

        jMenuItemCadVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemCadVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veiculo16.png"))); // NOI18N
        jMenuItemCadVeiculo.setText("Veículo");
        jMenuItemCadVeiculo.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadVeiculo);
        jMenuCadastro.add(jSeparator2);

        jMenuItemCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produto16.png"))); // NOI18N
        jMenuItemCadProduto.setText("Produto");
        jMenuItemCadProduto.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadProduto);

        jMenuItemCadServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/servico16.png"))); // NOI18N
        jMenuItemCadServico.setText("Serviço");
        jMenuItemCadServico.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadServicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadServico);
        jMenuCadastro.add(jSeparator1);

        jMenuItemCadFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedor-16.png"))); // NOI18N
        jMenuItemCadFornecedor.setText("Fornecedor");
        jMenuItemCadFornecedor.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFornecedor);
        jMenuCadastro.add(jSeparator3);

        jMenuItemCadEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empresa-16.png"))); // NOI18N
        jMenuItemCadEmpresa.setText("Empresa");
        jMenuItemCadEmpresa.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEmpresaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEmpresa);

        jMenuItemCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario16.png"))); // NOI18N
        jMenuItemCadUsuario.setText("Usuário");
        jMenuItemCadUsuario.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuario);
        jMenuCadastro.add(jSeparator10);

        jMenuTabelasAuxiliares.setText("Cadastros Auxiliares");

        jMenuItemMarcaProduto.setText("Marcas de Produtos");
        jMenuItemMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemMarcaProduto);

        jMenuItemGrupoProduto.setText("Grupos de Produtos");
        jMenuItemGrupoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGrupoProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemGrupoProduto);

        jMenuItemCategoriaProduto.setText("Categorias de Produtos");
        jMenuItemCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemCategoriaProduto);

        jMenuItemMarcaMoto.setText("Marcas de Motos");
        jMenuItemMarcaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaMotoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemMarcaMoto);

        jMenuItemModeloMoto.setText("Modelos de Motos");
        jMenuItemModeloMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModeloMotoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemModeloMoto);

        jMenuCadastro.add(jMenuTabelasAuxiliares);
        jMenuCadastro.add(jSeparator4);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair-16.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setPreferredSize(new java.awt.Dimension(169, 25));
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuMovimento.setText("Movimento");

        jMenuItemMovOrdemServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItemMovOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ordem-servico-16.png"))); // NOI18N
        jMenuItemMovOrdemServico.setText("Orçamento / O.S.");
        jMenuItemMovOrdemServico.setPreferredSize(new java.awt.Dimension(205, 25));
        jMenuItemMovOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovOrdemServicoActionPerformed(evt);
            }
        });
        jMenuMovimento.add(jMenuItemMovOrdemServico);

        jMenuItemMovVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItemMovVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venda-16.png"))); // NOI18N
        jMenuItemMovVenda.setText("Venda");
        jMenuItemMovVenda.setPreferredSize(new java.awt.Dimension(205, 25));
        jMenuItemMovVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovVendaActionPerformed(evt);
            }
        });
        jMenuMovimento.add(jMenuItemMovVenda);
        jMenuMovimento.add(jSeparator11);

        jMenuItemEntradaProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEntradaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedor-16.png"))); // NOI18N
        jMenuItemEntradaProduto.setText("Ajuste de Estoque de Produto");
        jMenuItemEntradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradaProdutoActionPerformed(evt);
            }
        });
        jMenuMovimento.add(jMenuItemEntradaProduto);

        jMenuBarPrincipal.add(jMenuMovimento);

        jMenuFinanceiro.setText("Financeiro");

        jMenuItemFinReceber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItemFinReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber-16.png"))); // NOI18N
        jMenuItemFinReceber.setText("Receber");
        jMenuItemFinReceber.setPreferredSize(new java.awt.Dimension(131, 25));
        jMenuItemFinReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinReceberActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemFinReceber);

        jMenuBarPrincipal.add(jMenuFinanceiro);

        jMenuRelatórios.setText("Relatórios");

        jMenuItemRelFinan.setText("Relatório Financeiro");
        jMenuItemRelFinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelFinanActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(jMenuItemRelFinan);

        jMenuItem1.setText("Relatórios Gerais");
        jMenuItem1.setToolTipText("Relatórios de Clientes, Produtos e Vendas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuRelatórios.add(jMenuItem1);

        jMenuBarPrincipal.add(jMenuRelatórios);

        jMenuAjuda.setText("Ajuda");

        jMenuItemAjudaSobre.setText("Sobre");
        jMenuItemAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemAjudaSobre);

        jMenuBarPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatusBarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(832, 832, 832)
                .addComponent(jPanelLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatusBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1100, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lerUsuario(){
        String ejbql = "from Usuario u where u.usuLogin = '" + jLabelUsuario.getText() + "'";
        queryUsuario = entityManager.createQuery(ejbql);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size()>0)
            jLabelTipo.setText(listUsuario.get(0).getUsuPermissao());
    }
    
    private void lerLogin(){
        try {
            BufferedReader ler = new BufferedReader(new FileReader("logado.txt"));
            jLabelUsuario.setText(ler.readLine());
            if(listUsuario.size()>0)
                jLabelTipo.setText(listUsuario.get(0).getUsuPermissao());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameCliente cliente = new JFrameCliente();
            cliente.setLocationRelativeTo(this);
            cliente.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        jMenuItemCadClienteActionPerformed(evt);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jMenuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameProduto produto = new JFrameProduto();
            produto.setLocationRelativeTo(this);
            produto.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadProdutoActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        jMenuItemCadProdutoActionPerformed(evt);
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void logar(){
        JFrameAutenticacao autentica = new JFrameAutenticacao();
        autentica.setLocationRelativeTo(this);
        autentica.setVisible(true);
        dispose();
    }
    
    private void jMenuItemCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameCategoria cadCategoria = new JFrameCategoria();
            cadCategoria.setLocationRelativeTo(this);
            cadCategoria.setVisible(true);
        }else{
            logar();
        }    
    }//GEN-LAST:event_jMenuItemCategoriaProdutoActionPerformed

    private void jMenuItemGrupoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGrupoProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameGrupo cadGrupo = new JFrameGrupo();
            cadGrupo.setLocationRelativeTo(this);
            cadGrupo.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemGrupoProdutoActionPerformed

    private void jMenuItemMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameMarcaProduto cadMarcaProduto = new JFrameMarcaProduto();
            cadMarcaProduto.setLocationRelativeTo(this);
            cadMarcaProduto.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemMarcaProdutoActionPerformed

    private void jMenuItemCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadServicoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){    
            JFrameServico cadServico = new JFrameServico();
            cadServico.setLocationRelativeTo(this);
            cadServico.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadServicoActionPerformed

    private void jMenuItemCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFornecedorActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!(jLabelTipo.getText().equals("Administrador"))){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado! Contate o administrador.");
            }else{
                JFrameFornecedor cadFornecedor = new JFrameFornecedor();
                cadFornecedor.setLocationRelativeTo(this);
                cadFornecedor.setVisible(true);
            }
         }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadFornecedorActionPerformed

    private void jButtonServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicosActionPerformed
        jMenuItemCadServicoActionPerformed(evt);
    }//GEN-LAST:event_jButtonServicosActionPerformed

    private void jMenuItemMarcaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaMotoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){ 
            JFrameMarcaMoto cadMarcaMoto = new JFrameMarcaMoto();
            cadMarcaMoto.setLocationRelativeTo(this);
            cadMarcaMoto.setVisible(true);
        }else{
            logar();
        }    
    }//GEN-LAST:event_jMenuItemMarcaMotoActionPerformed

    private void jMenuItemModeloMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModeloMotoActionPerformed
        JFrameModeloMoto cadModeloMoto = new JFrameModeloMoto();
        cadModeloMoto.setLocationRelativeTo(this);
        cadModeloMoto.setVisible(true);
    }//GEN-LAST:event_jMenuItemModeloMotoActionPerformed

    private void jMenuItemCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadVeiculoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameVeiculo cadVeiculo = new JFrameVeiculo();
            cadVeiculo.setLocationRelativeTo(this);
            cadVeiculo.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadVeiculoActionPerformed

    private void jButtonVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeiculoActionPerformed
        jMenuItemCadVeiculoActionPerformed(evt);
    }//GEN-LAST:event_jButtonVeiculoActionPerformed

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!jLabelTipo.getText().equals("Administrador")){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado! Contate o administrador.");
            }else{
                JFrameUsuario cadUsuario = new JFrameUsuario();
                cadUsuario.setLocationRelativeTo(this);
                cadUsuario.setVisible(true);
            }
        }else{
            logar();
        }
        
            
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jMenuItemAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaSobreActionPerformed
        JDialogSobre sobre = new JDialogSobre(this, true);
        sobre.setLocationRelativeTo(this);
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemAjudaSobreActionPerformed

    private void jMenuItemCadEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEmpresaActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!jLabelTipo.getText().equals("Administrador")){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado! Contate o administrador.");
            }else{
                JFrameEmpresa cadEmpresa = new JFrameEmpresa();
                cadEmpresa.setLocationRelativeTo(this);
                cadEmpresa.setVisible(true);
            }
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemCadEmpresaActionPerformed

    private void jButtonLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            jPanelLogoff.setVisible(true);
            jTextFieldLogin.requestFocus();
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonLogoffActionPerformed

    private void jButtonLogoffOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffOkActionPerformed
            String senha = new String(jPasswordFieldSenha.getPassword());
            String ejbql = "from Usuario u where u.usuLogin = '"
                    + jTextFieldLogin.getText() + "' and u.usuSenha = '"
                    + senha + "'";
            queryUsuario = entityManager.createQuery(ejbql);
            listUsuario.clear();
            listUsuario.addAll(queryUsuario.getResultList());
            if(listUsuario.size() > 0){
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter("logado.txt"));
                    writer.println(jTextFieldLogin.getText());
                    writer.println(senha);
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrameAutenticacao.class.getName()).log(Level.SEVERE, null, ex);
                }

                File file = new File("logado.txt");
                if(file.exists()){
                    lerLogin();
                    lerUsuario();
                }
                jTextFieldLogin.setText("");
                jPasswordFieldSenha.setText("");
                jPanelLogoff.setVisible(false);
            }
    }//GEN-LAST:event_jButtonLogoffOkActionPerformed

    private void jButtonLogoffCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffCancelarActionPerformed
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jPanelLogoff.setVisible(false);
    }//GEN-LAST:event_jButtonLogoffCancelarActionPerformed

    private void jMenuItemEntradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradaProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameEstoque cadEstoque = new JFrameEstoque();
            cadEstoque.setLocationRelativeTo(this);
            cadEstoque.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemEntradaProdutoActionPerformed

    private void jMenuItemMovVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovVendaActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameVenda venda = new JFrameVenda();
            venda.setLocationRelativeTo(this);
            venda.setVisible(true);
        }else{
            logar();
        }        
    }//GEN-LAST:event_jMenuItemMovVendaActionPerformed

    private void jButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendaActionPerformed
        jMenuItemMovVendaActionPerformed(evt);
    }//GEN-LAST:event_jButtonVendaActionPerformed

    private void jMenuItemMovOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovOrdemServicoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameOrdemServico ordserv = new JFrameOrdemServico();
            ordserv.setLocationRelativeTo(this);
            ordserv.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemMovOrdemServicoActionPerformed

    private void jButtonOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdemServicoActionPerformed
        jMenuItemMovOrdemServicoActionPerformed(evt);
    }//GEN-LAST:event_jButtonOrdemServicoActionPerformed

    private void jMenuItemFinReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinReceberActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameReceber receber = new JFrameReceber();
            receber.setLocationRelativeTo(this);
            receber.setVisible(true);
        } else {
            logar();
        }
    }//GEN-LAST:event_jMenuItemFinReceberActionPerformed

    private void jButtonReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceberActionPerformed
        jMenuItemFinReceberActionPerformed(evt);
    }//GEN-LAST:event_jButtonReceberActionPerformed

    private void jMenuItemRelFinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelFinanActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameRelatorios relatorios = new JFrameRelatorios();
            relatorios.setLocationRelativeTo(this);
            relatorios.setVisible(true);
        } else {
            logar();
        }
    }//GEN-LAST:event_jMenuItemRelFinanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameRelatoriosGerais relcli = new JFrameRelatoriosGerais();
            relcli.setLocationRelativeTo(this);
            relcli.setVisible(true);
        } else {
            logar();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jButtonLogoffActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonLogoff;
    private javax.swing.JButton jButtonLogoffCancelar;
    private javax.swing.JButton jButtonLogoffOk;
    private javax.swing.JButton jButtonOrdemServico;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonReceber;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonServicos;
    private javax.swing.JButton jButtonVeiculo;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelLabelLogin;
    private javax.swing.JLabel jLabelLabelSenha;
    private javax.swing.JLabel jLabelLabelUsuario;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAjudaSobre;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadEmpresa;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemCadServico;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemCadVeiculo;
    private javax.swing.JMenuItem jMenuItemCategoriaProduto;
    private javax.swing.JMenuItem jMenuItemEntradaProduto;
    private javax.swing.JMenuItem jMenuItemFinReceber;
    private javax.swing.JMenuItem jMenuItemGrupoProduto;
    private javax.swing.JMenuItem jMenuItemMarcaMoto;
    private javax.swing.JMenuItem jMenuItemMarcaProduto;
    private javax.swing.JMenuItem jMenuItemModeloMoto;
    private javax.swing.JMenuItem jMenuItemMovOrdemServico;
    private javax.swing.JMenuItem jMenuItemMovVenda;
    private javax.swing.JMenuItem jMenuItemRelFinan;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuMovimento;
    private javax.swing.JMenu jMenuRelatórios;
    private javax.swing.JMenu jMenuTabelasAuxiliares;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelLogoff;
    private javax.swing.JPanel jPanelStatusBarPrincipal;
    private javax.swing.JPanel jPanelToolBarPrincipal;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JToolBar jToolBarPrincipal;
    private java.util.List<Usuario> listUsuario;
    private javax.persistence.Query queryUsuario;
    // End of variables declaration//GEN-END:variables
}
