package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Produto;
import java.time.Instant;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import model.Cliente;
import model.ItemDaVenda;
import model.Usuario;
import model.Venda;

public class JFrameVenda extends javax.swing.JDialog {

    public JFrameVenda() {
        initComponents();
        this.setModal(true);
        limparCampos();
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        atualizaTabela();
        atualizaControles();
        lerLogin();
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Venda v where v.venValorTotal <> 0 and v.veiculo.veiPlaca = '' order by v.venDataVenda Desc");
        listVenda = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVenda.getResultList());
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p where p.proEstoqueAtual > 0 order by p.proDescricao");
        listProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProduto.getResultList());
        queryItensVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ItemDaVenda iv order by iv.idItemVenda");
        listItensVenda = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryItensVenda.getResultList());
        listItensDaVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<ItemDaVenda>());
        ;
        queryItemSelecionado = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p");
        listItemSelecionado = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryItemSelecionado.getResultList());
        listProdutoSelecionado = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<ItemDaVenda>());
        ;
        queryUsuario = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Usuario u");
        listUsuario = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryUsuario.getResultList());
        jToolBarComandos = new javax.swing.JToolBar();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jPanelBarraTitulo1 = new javax.swing.JPanel();
        jLabelLabelTituloVenda = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanelBarraTitulo2 = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelCodProduto = new javax.swing.JLabel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabelProduto = new javax.swing.JLabel();
        jPanelFoto = new javax.swing.JPanel();
        jPanelFotoProduto = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonAdicionarItem = new javax.swing.JButton();
        jButtonRemoverItem = new javax.swing.JButton();
        jLabelLabelPreco = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelLabelQuantidade = new javax.swing.JLabel();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();
        jButtonBuscaProduto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldPrecoPrazo = new javax.swing.JFormattedTextField();
        jButtonLimparProduto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabelLabelCodCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabelLabelDataVenda = new javax.swing.JLabel();
        jFormattedTextFieldDataVenda = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPaneItensDaVenda = new javax.swing.JScrollPane();
        jTableItensDaVenda = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabelLabelDesconto = new javax.swing.JLabel();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabelLabelSubtotal = new javax.swing.JLabel();
        jLabelSubtotal = new javax.swing.JLabel();
        jLabelLabelTotal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCancelarVenda = new javax.swing.JButton();
        jButtonFinalizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENDA DE PRODUTOS");
        setMaximumSize(new java.awt.Dimension(990, 625));
        setMinimumSize(new java.awt.Dimension(990, 625));
        setResizable(false);

        jToolBarComandos.setBackground(new java.awt.Color(0, 51, 102));
        jToolBarComandos.setFloatable(false);
        jToolBarComandos.setForeground(new java.awt.Color(0, 51, 102));
        jToolBarComandos.setRollover(true);
        jToolBarComandos.setBorderPainted(false);
        jToolBarComandos.setMaximumSize(new java.awt.Dimension(692, 38));
        jToolBarComandos.setMinimumSize(new java.awt.Dimension(692, 38));
        jToolBarComandos.setPreferredSize(new java.awt.Dimension(692, 38));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-iniciarvenda.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar uma nova venda");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(152, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(152, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(152, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-iniciarvenda-over2.png"))); // NOI18N
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonNovo);

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Gravar a venda no banco de dados");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar-over2.png"))); // NOI18N
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonSalvar);

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar a operação atual");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar-over2.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonCancelar);

        jButtonAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar dados da venda");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.setFocusPainted(false);
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setMaximumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar-over2.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonAlterar);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir a venda");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir-over2.png"))); // NOI18N
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonExcluir);

        jButtonImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir relatórios da venda");
        jButtonImprimir.setBorderPainted(false);
        jButtonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonImprimir.setEnabled(false);
        jButtonImprimir.setFocusPainted(false);
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimir.setMaximumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setMinimumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setPreferredSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir-over2.png"))); // NOI18N
        jToolBarComandos.add(jButtonImprimir);

        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da tela de Vendas");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setMinimumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setPreferredSize(new java.awt.Dimension(78, 37));
        jButtonSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair-over2.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonSair);

        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(269, 19));
        jPanelBarraEstado.setMinimumSize(new java.awt.Dimension(269, 19));

        jLabelLabelEstado.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelEstado.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("sansserif", 1, 11)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("---");

        javax.swing.GroupLayout jPanelBarraEstadoLayout = new javax.swing.GroupLayout(jPanelBarraEstado);
        jPanelBarraEstado.setLayout(jPanelBarraEstadoLayout);
        jPanelBarraEstadoLayout.setHorizontalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(417, 19));
        jPanelBarraMensagem.setMinimumSize(new java.awt.Dimension(417, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(417, 19));

        jLabelLabelMensagem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelMensagem.setText("Mensagem:");

        jLabelMensagem.setFont(new java.awt.Font("sansserif", 1, 11)); // NOI18N
        jLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMensagem.setText("---");

        javax.swing.GroupLayout jPanelBarraMensagemLayout = new javax.swing.GroupLayout(jPanelBarraMensagem);
        jPanelBarraMensagem.setLayout(jPanelBarraMensagemLayout);
        jPanelBarraMensagemLayout.setHorizontalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
            .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBarraTitulo1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo1.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo1.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelLabelTituloVenda.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelTituloVenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTituloVenda.setText("VENDA DE PRODUTOS");

        javax.swing.GroupLayout jPanelBarraTitulo1Layout = new javax.swing.GroupLayout(jPanelBarraTitulo1);
        jPanelBarraTitulo1.setLayout(jPanelBarraTitulo1Layout);
        jPanelBarraTitulo1Layout.setHorizontalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelTituloVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelBarraTitulo1Layout.setVerticalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelTituloVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanelDados.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDados.setMaximumSize(new java.awt.Dimension(646, 120));
        jPanelDados.setMinimumSize(new java.awt.Dimension(646, 120));
        jPanelDados.setPreferredSize(new java.awt.Dimension(646, 120));

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVenda, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVenda}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente.cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venDataVenda}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venValorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario.usuLogin}"));
        columnBinding.setColumnName("Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableDadosMouseReleased(evt);
            }
        });
        jScrollPaneTabela.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableDados.getColumnModel().getColumn(4).setResizable(false);
            jTableDados.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jPanelBarraTitulo2.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo2.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo2.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo2.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelPesquisa.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisa.setText("PESQUISAR VENDAS:");
        jLabelPesquisa.setFocusable(false);

        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboBoxPesquisaStatus.setFocusable(false);

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Cliente" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.setFocusable(false);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisaOK.setText("OK");
        jButtonPesquisaOK.setFocusable(false);
        jButtonPesquisaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraTitulo2Layout = new javax.swing.GroupLayout(jPanelBarraTitulo2);
        jPanelBarraTitulo2.setLayout(jPanelBarraTitulo2Layout);
        jPanelBarraTitulo2Layout.setHorizontalGroup(
            jPanelBarraTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBarraTitulo2Layout.setVerticalGroup(
            jPanelBarraTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelPesquisa)
                .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCodProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCodProduto.setText("Cód. Produto:");

        jTextFieldCodProduto.setEditable(false);
        jTextFieldCodProduto.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTextFieldCodProduto.setToolTipText("Troca de óleo, alinhamento...");
        jTextFieldCodProduto.setMaximumSize(new java.awt.Dimension(12, 30));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto.proCodigo}"), jTextFieldCodProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldCodProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodProdutoCaretUpdate(evt);
            }
        });
        jTextFieldCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodProdutoKeyPressed(evt);
            }
        });

        jTextFieldProduto.setEditable(false);
        jTextFieldProduto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextFieldProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldProduto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto.proDescricao}"), jTextFieldProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldProdutoCaretUpdate(evt);
            }
        });

        jLabelProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProduto.setText("Produto:");

        jPanelFoto.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFoto.setMaximumSize(new java.awt.Dimension(150, 200));
        jPanelFoto.setMinimumSize(new java.awt.Dimension(150, 200));
        jPanelFoto.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanelFoto.setRequestFocusEnabled(false);

        jPanelFotoProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFotoProduto.setMaximumSize(new java.awt.Dimension(243, 146));
        jPanelFotoProduto.setMinimumSize(new java.awt.Dimension(243, 146));
        jPanelFotoProduto.setPreferredSize(new java.awt.Dimension(243, 146));

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelFotoProdutoLayout = new javax.swing.GroupLayout(jPanelFotoProduto);
        jPanelFotoProduto.setLayout(jPanelFotoProdutoLayout);
        jPanelFotoProdutoLayout.setHorizontalGroup(
            jPanelFotoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoProdutoLayout.createSequentialGroup()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelFotoProdutoLayout.setVerticalGroup(
            jPanelFotoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAdicionarItem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-dir24.png"))); // NOI18N
        jButtonAdicionarItem.setText("Adicionar");
        jButtonAdicionarItem.setEnabled(false);
        jButtonAdicionarItem.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarItemActionPerformed(evt);
            }
        });

        jButtonRemoverItem.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButtonRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-lef24red.png"))); // NOI18N
        jButtonRemoverItem.setText("Remover");
        jButtonRemoverItem.setEnabled(false);
        jButtonRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverItemActionPerformed(evt);
            }
        });

        jLabelLabelPreco.setText("Preço à vista:");

        jTextFieldQuantidade.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTextFieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldQuantidadeFocusLost(evt);
            }
        });
        jTextFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeKeyTyped(evt);
            }
        });

        jLabelLabelQuantidade.setText("Quant.:");

        jFormattedTextFieldPreco.setEditable(false);
        jFormattedTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jButtonBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-24.png"))); // NOI18N
        jButtonBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço a prazo:");

        jFormattedTextFieldPrecoPrazo.setEditable(false);
        jFormattedTextFieldPrecoPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextFieldPrecoPrazo.setEnabled(false);

        jButtonLimparProduto.setText("Limpar Seleção");
        jButtonLimparProduto.setEnabled(false);
        jButtonLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProduto)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonLimparProduto)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabelLabelQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldQuantidade))
                                    .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodProduto)
                                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jButtonBuscaProduto)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabelLabelPreco))
                                    .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFormattedTextFieldPrecoPrazo))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelCodProduto)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButtonBuscaProduto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelLabelPreco)
                        .addGap(6, 6, 6)
                        .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jFormattedTextFieldPrecoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jLabelProduto)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelLabelQuantidade))
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonRemoverItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(new java.awt.Dimension(646, 66));
        jPanel4.setMinimumSize(new java.awt.Dimension(646, 66));
        jPanel4.setPreferredSize(new java.awt.Dimension(646, 66));

        jLabelLabelCliente.setText("Cliente:");

        jTextFieldCliente.setEditable(false);

        jLabelLabelCodCliente.setText("Cód. Cliente");

        jTextFieldCodCliente.setEditable(false);
        jTextFieldCodCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodClienteCaretUpdate(evt);
            }
        });

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-24.png"))); // NOI18N
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabelLabelDataVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLabelDataVenda.setText("Data da venda:");

        jFormattedTextFieldDataVenda.setEditable(false);
        jFormattedTextFieldDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venDataVenda}"), jFormattedTextFieldDataVenda, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodCliente)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelLabelCodCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelDataVenda)
                    .addComponent(jFormattedTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLabelCliente)
                            .addComponent(jLabelLabelCodCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelLabelDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(264, 241));
        jPanel2.setMinimumSize(new java.awt.Dimension(264, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(264, 241));

        jListProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProdutos.setMaximumSize(new java.awt.Dimension(200, 295));
        jListProdutos.setMinimumSize(new java.awt.Dimension(200, 295));
        jListProdutos.setPreferredSize(new java.awt.Dimension(190, 285));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jListProdutos);
        bindingGroup.addBinding(jListBinding);

        jListProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListProdutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUTOS ADICIONADOS À VENDA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(267, 35));
        jPanel6.setMinimumSize(new java.awt.Dimension(267, 35));
        jPanel6.setPreferredSize(new java.awt.Dimension(267, 35));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUTOS DISPONÍVEIS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPaneItensDaVenda.setBackground(new java.awt.Color(255, 255, 255));

        jTableItensDaVenda.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTableItensDaVenda.setForeground(new java.awt.Color(0, 0, 0));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItensDaVenda, jTableItensDaVenda);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.proDescricao}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvQuantidade}"));
        columnBinding.setColumnName("Quant.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvValorTotal}"));
        columnBinding.setColumnName("Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableItensDaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableItensDaVendaMouseReleased(evt);
            }
        });
        jScrollPaneItensDaVenda.setViewportView(jTableItensDaVenda);
        if (jTableItensDaVenda.getColumnModel().getColumnCount() > 0) {
            jTableItensDaVenda.getColumnModel().getColumn(0).setResizable(false);
            jTableItensDaVenda.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableItensDaVenda.getColumnModel().getColumn(1).setResizable(false);
            jTableItensDaVenda.getColumnModel().getColumn(1).setPreferredWidth(2);
            jTableItensDaVenda.getColumnModel().getColumn(2).setResizable(false);
            jTableItensDaVenda.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneItensDaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneItensDaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelDesconto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelLabelDesconto.setText("Desconto:");

        jTextFieldDesconto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextFieldDesconto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venDesconto}"), jTextFieldDesconto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescontoFocusLost(evt);
            }
        });
        jTextFieldDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescontoKeyTyped(evt);
            }
        });

        jLabelLabelSubtotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelLabelSubtotal.setText("Sub:");

        jLabelSubtotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelSubtotal.setText("---");

        jLabelLabelTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelLabelTotal.setText("Total:");

        jPanel9.setBackground(new java.awt.Color(0, 102, 153));

        jLabelTotal.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venValorTotal}"), jLabelTotal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("R$");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLabelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLabelDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelSubtotal)
                    .addComponent(jLabelSubtotal)
                    .addComponent(jLabel6)
                    .addComponent(jLabelLabelDesconto)
                    .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancelarVenda.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonCancelarVenda.setText("Cancelar Venda");
        jButtonCancelarVenda.setEnabled(false);
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jButtonFinalizarVenda.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonFinalizarVenda.setText("Finalizar Venda");
        jButtonFinalizarVenda.setEnabled(false);
        jButtonFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarVenda)
                    .addComponent(jButtonFinalizarVenda))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelBarraTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBarraTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(1006, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Lê o usuário logado (no arquivo de texto) para ser vinculado à venda
     */
    private void lerLogin(){
        String ejbql = "";
        try {
            BufferedReader ler = new BufferedReader(new FileReader("logado.txt"));
            String usuario = ler.readLine();
            ejbql = "from Usuario u where u.usuLogin = '" + usuario + "'";
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        queryUsuario = entityManager.createQuery(ejbql);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
    }
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        //statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Venda iniciada.");
        jTextFieldCliente.requestFocus();
        listVenda.add(new Venda());
        int linha = listVenda.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        java.util.Date hoje = Date.from(Instant.now());
        jFormattedTextFieldDataVenda.setValue(hoje);
        listItensVenda.clear();
        gerarVenda();
        jTextFieldCliente.setEnabled(true);
        jButtonBuscarCliente.setEnabled(true);
        calculaTotais();
        verificaTabelaItens();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void gerarVenda(){
        int linhaSelecionada = jTableDados.getSelectedRow();
        Venda ven = listVenda.get(linhaSelecionada);
        try {
           entityManager.getTransaction().begin();
           entityManager.persist(ven);
           entityManager.getTransaction().commit();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, a venda não foi concluída!\nErro: " + e);
            if(!entityManager.getTransaction().isActive())
                entityManager.getTransaction().begin();
            entityManager.getTransaction().rollback();
        }
    }
    
    private int validaCampos(){
        if(jTextFieldCodProduto.getText().equals("") || jFormattedTextFieldDataVenda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldCodProduto.requestFocus();
            jFormattedTextFieldDataVenda.setBackground(Color.CYAN);
            jTextFieldCodProduto.setBackground(Color.CYAN);
            if(!jTextFieldCodProduto.getText().equals(""))
                jTextFieldCodProduto.setBackground(Color.WHITE);
            if(!jFormattedTextFieldDataVenda.getText().equals(""))
                jFormattedTextFieldDataVenda.setBackground(Color.WHITE);
            return 0;
        }
        return 1;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void Cancelar(){
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        jTableDados.clearSelection();
        atualizaTabela();
        controlePesquisa(true);
        atualizaControles();
        jTableDados.setEnabled(true);
        jTextFieldCampoPesquisa.setEnabled(true);
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldCodProduto.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                jButtonCancelarVendaActionPerformed(evt);
            }
        } else {
            jButtonCancelarVendaActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma venda para alterar!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldCodProduto.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados da venda...");
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma venda para excluir!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta venda? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Venda ven = listVenda.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    ven = entityManager.merge(ven);
                    entityManager.remove(ven);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Venda excluída com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, a venda não foi excluída!\nErro: " + e);
                    jLabelMensagem.setText("Ocorreu um erro, a venda não foi excluída!");
                    if(!entityManager.getTransaction().isActive())
                        entityManager.getTransaction().begin();
                    entityManager.getTransaction().rollback();
                }
            }
            jTableDados.clearSelection();
            limparCampos();
            atualizaTabela();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        if(!jLabelEstado.getText().equals("Início") || !jTextFieldCodCliente.getText().equals("")){ //se tiver iniciado a venda
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar esta venda?\nOs dados serão perdidos!", "Atenção", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(confirma == 0){
                int linhaSelecionada = jTableDados.getSelectedRow();
                Venda ven = listVenda.get(linhaSelecionada);
                removerVenda(ven);
                jTableDados.clearSelection();
                jButtonNovo.setEnabled(true);
                dispose();
            }
        } else { //se não tiver iniciado a venda
            dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        controlePesquisa(true);
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased

    private void jButtonPesquisaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaOKActionPerformed
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jButtonPesquisaOKActionPerformed

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && (!jLabelEstado.getText().equals("Inserção"))))){
            //jButtonAlterar.setEnabled(true);
            //jButtonExcluir.setEnabled(true);
        }
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR a operação atual!");
    }//GEN-LAST:event_jTableDadosMouseReleased

    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaActionPerformed
        if(jComboBoxTipoPesquisa.getSelectedIndex() == 0){
            jTextFieldCampoPesquisa.setText("");
        }
        atualizaTabela();
    }//GEN-LAST:event_jComboBoxTipoPesquisaActionPerformed

    private void jTextFieldCodProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoCaretUpdate
        if(!jTextFieldCodProduto.getText().equals("")){
            buscaProduto();
        }
    }//GEN-LAST:event_jTextFieldCodProdutoCaretUpdate

    private void jTextFieldProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldProdutoCaretUpdate
        if(!jTextFieldCodProduto.getText().equals("")){
            jLabelFoto.setIcon(new ImageIcon(String.valueOf(listProduto.get(0).getProFoto())));
            jLabelFoto.setPreferredSize(new Dimension(130, 130));
        }
        
    }//GEN-LAST:event_jTextFieldProdutoCaretUpdate

    private int validaItem(){
        if((jFormattedTextFieldPreco.getText().equals("")) || jFormattedTextFieldPrecoPrazo.getText().equals("") ||
                jTextFieldQuantidade.getText().equals("") || jTextFieldCodProduto.getText().equals("")){
            jFormattedTextFieldPreco.setBackground(Color.CYAN);
            jFormattedTextFieldPrecoPrazo.setBackground(Color.CYAN);
            jTextFieldQuantidade.setBackground(Color.CYAN);
            jTextFieldCodProduto.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldQuantidade.requestFocus();
            if(!jFormattedTextFieldPreco.getText().equals(""))
                jFormattedTextFieldPreco.setBackground(Color.WHITE);
            if(!jFormattedTextFieldPrecoPrazo.getText().equals(""))
                jFormattedTextFieldPrecoPrazo.setBackground(Color.WHITE);
            if(!jTextFieldQuantidade.getText().equals(""))
                jTextFieldQuantidade.setBackground(Color.WHITE);
            if(!jTextFieldCodProduto.getText().equals(""))
                jTextFieldCodProduto.setBackground(Color.WHITE);
            return 0;
        }
        //teste de estoque suficiente
        
        if((jListProdutos.getSelectedValue().getProEstoqueAtual())
                < Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()))){
            JOptionPane.showMessageDialog(null, "Quantidade informada é maior que o estoque atual!", 
                    "Alerta de Estoque", JOptionPane.ERROR_MESSAGE );
            
            int selecionado = jListProdutos.getSelectedValue().getIdProduto();
            int estoque = jListProdutos.getSelectedValue().getProEstoqueAtual();;
            int vendido = 0;
            
            if(listItensDaVenda.size() > 0){            
                for(int i = 0; i < listItensDaVenda.size(); i++){
                    if(listItensDaVenda.get(i).getProduto().getIdProduto() == selecionado){ 
                        vendido += listItensDaVenda.get(i).getItvQuantidade();
                    }                 
                }
            }                      
            jTextFieldQuantidade.setText(String.valueOf(jListProdutos.getSelectedValue().getProEstoqueAtual() - vendido));
            return 0;
        }
        //teste de estoque mínimo
        if((jListProdutos.getSelectedValue().getProEstoqueAtual()) 
                - Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) 
                == jListProdutos.getSelectedValue().getProEstoqueMinimo()){
            JOptionPane.showMessageDialog(null, "Este produto atingiu o Estoque Mínimo!","Alerta de Estoque", JOptionPane.WARNING_MESSAGE);
            
        } else if ((((jListProdutos.getSelectedValue().getProEstoqueAtual()) - Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()))) 
                < jListProdutos.getSelectedValue().getProEstoqueMinimo()) 
                && (jListProdutos.getSelectedValue().getProEstoqueAtual() - Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) 
                - listItensDaVenda.indexOf(jListProdutos.getSelectedIndex())) != 1){
            JOptionPane.showMessageDialog(null, "Este produto está abaixo do Estoque Mínimo!","Alerta de Estoque", JOptionPane.WARNING_MESSAGE);
        }  else if ((((jListProdutos.getSelectedValue().getProEstoqueAtual()) - Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()))) 
                < jListProdutos.getSelectedValue().getProEstoqueMinimo()) 
                && (jListProdutos.getSelectedValue().getProEstoqueAtual() - Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) 
                - listItensDaVenda.indexOf(jListProdutos.getSelectedIndex())) == 1){
            JOptionPane.showMessageDialog(null, "Estoque zerado, providenciar reposição!","Alerta de Estoque", JOptionPane.WARNING_MESSAGE);   
        }
        
        //verifica se o produto adicionado ao listItensDaVenda tem estoque disponível quando se insere mais de uma vez o mesmo produto
        int selecionado = jListProdutos.getSelectedValue().getIdProduto();
        int estoque = jListProdutos.getSelectedValue().getProEstoqueAtual();;
        int vendido = 0;
        int i = 0;
         
        if(listItensDaVenda.size() > 0){            
            for(i = 0; i < listItensDaVenda.size(); i++){
                if(listItensDaVenda.get(i).getProduto().getIdProduto() == selecionado){ 
                    vendido += listItensDaVenda.get(i).getItvQuantidade();
                    if((estoque - (vendido + Integer.parseInt(jTextFieldQuantidade.getText()))) < 0){
                        if(((jListProdutos.getSelectedValue().getProEstoqueAtual())-vendido) < Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()))){
                            JOptionPane.showMessageDialog(null, "Quantidade informada é maior que o estoque atual!", 
                            "Alerta de Estoque", JOptionPane.ERROR_MESSAGE );
                        }
                        jTextFieldQuantidade.setText(String.valueOf(jListProdutos.getSelectedValue().getProEstoqueAtual() - vendido));
                        return 1001;
                    } else return i;
                }                 
            }            
        }         
        return 1000;
    }
    
    private void jButtonAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItemActionPerformed
        int valida = validaItem();
        if(valida == 1000 && (Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) > 0)){
            Double preco = Double.parseDouble(String.valueOf(jFormattedTextFieldPreco.getValue()));
            int quant = Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()));
            Double total = preco * quant;
            adicionaItem(preco, quant, total);
            jButtonLimparProduto.setEnabled(false);
        } 
        if(valida < 1000 && (Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) > 0)){
            listItensDaVenda.get(valida);
            Double preco = 0.0;//Double.parseDouble(String.valueOf(listItensDaVenda.get(valida).getItvPrecoUnitario()));
            int quant = Integer.parseInt(String.valueOf(listItensDaVenda.get(valida).getItvQuantidade()));
            preco = preco + Double.parseDouble(String.valueOf(jFormattedTextFieldPreco.getValue()));
            quant = quant + Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()));
            Double total = preco * quant;
            listItensDaVenda.remove(valida);
            calculaTotais();
            verificaTabelaItens();
            adicionaItem(preco, quant, total);
            jButtonLimparProduto.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonAdicionarItemActionPerformed

    private void adicionaItem(double preco, int quant, double total){
        ItemDaVenda itv = new ItemDaVenda(preco, quant, total, "vd", (Produto)jListProdutos.getSelectedValue());
            listItensDaVenda.add(itv);                      
            jListProdutos.setEnabled(true);
            listaTodosProdutos();
            jTextFieldDesconto.setText("0.00");
            calculaTotais();
            limparItem();
            verificaTabelaItens();
    }
    
    private void verificaTabelaItens(){
        if(listItensDaVenda.size()>0){
            jButtonFinalizarVenda.setEnabled(true);
            jButtonCancelarVenda.setEnabled(true);
            jTextFieldDesconto.setEnabled(true);
        } else {
            jButtonFinalizarVenda.setEnabled(false);
            jButtonCancelarVenda.setEnabled(false);
            jTextFieldDesconto.setEnabled(false);
        }
    }
    
    private void limparItem(){ //limpa campos após adicionar um item à venda
        jButtonAdicionarItem.setEnabled(false);
        jTextFieldCodProduto.setText("");
        jTextFieldProduto.setText("");
        jTextFieldQuantidade.setText("");
        jFormattedTextFieldPreco.setText("");
        jFormattedTextFieldPrecoPrazo.setText("");
        jLabelFoto.setIcon(null);        
        jFormattedTextFieldPreco.setBackground(Color.WHITE);            
        jFormattedTextFieldPrecoPrazo.setBackground(Color.WHITE);            
        jTextFieldQuantidade.setBackground(Color.WHITE);            
        jTextFieldCodProduto.setBackground(Color.WHITE);
    }
    
    private void calculaTotais(){
        //subtotal
        double subtotal = 0.00;
        int tamanho = listItensDaVenda.size();
        for(int i = 0; i < tamanho ; i++){
            subtotal += Double.parseDouble(String.valueOf(jTableItensDaVenda.getValueAt(i, 2)));
            jLabelSubtotal.setText(String.valueOf(subtotal));
        }
         //total
        double totalcompra = 0.00;
        totalcompra = subtotal - Double.parseDouble(String.valueOf(jTextFieldDesconto.getText()));
        jLabelTotal.setText(String.valueOf(totalcompra));
        if(listItensDaVenda.isEmpty()){
            subtotal = 0.00;
            jLabelSubtotal.setText(String.valueOf(subtotal));
        }
    }
    
    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        JFrameBuscaCliente buscaCliente = new JFrameBuscaCliente();
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
        jTextFieldCodCliente.setText(buscaCliente.getCodCliente());
        if(!jTextFieldCodCliente.getText().equals(""))
            statusInicial(false);
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jTextFieldCodClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteCaretUpdate
        if(!jTextFieldCodCliente.getText().equals("")){
            buscaCliente();
        }
    }//GEN-LAST:event_jTextFieldCodClienteCaretUpdate

    private void jButtonFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVendaActionPerformed
        int linhaSelecionada = jTableDados.getSelectedRow();
        Venda ven = listVenda.get(linhaSelecionada);
        ven.setCliente((Cliente)listCliente.get(0));
        ven.setUsuario((Usuario)listUsuario.get(0));
        try {
           entityManager.getTransaction().begin();
           ven = entityManager.merge(ven);
           entityManager.persist(ven);
           entityManager.getTransaction().commit();
            if (jLabelEstado.getText().equals("Alteração")) {
                jLabelMensagem.setText("Dados alterados com sucesso!");
            } else {
                jLabelMensagem.setText("Nova venda cadastrada com sucesso!");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, a venda não foi concluída!\nErro: " + e);
            jLabelMensagem.setText("Ocorreu um erro, a venda não foi concluída!");
            if(!entityManager.getTransaction().isActive())
                entityManager.getTransaction().begin();
            entityManager.getTransaction().rollback();
        }
        //persistir itens da venda (fazer um laço for)
        int tam = listItensDaVenda.size();
        for(int i = 0 ; i < tam ; i++){       

            ItemDaVenda itv = new ItemDaVenda();
            itv.adicionarVenda(ven);
            itv.setItvPrecoUnitario(listItensDaVenda.get(i).getItvPrecoUnitario());
            itv.setItvQuantidade(listItensDaVenda.get(i).getItvQuantidade());
            itv.setItvValorTotal(listItensDaVenda.get(i).getItvValorTotal());
            itv.setProduto(listItensDaVenda.get(i).getProduto());

            entityManager.getTransaction().begin();
            entityManager.persist(itv);
            entityManager.getTransaction().commit();
        }            

        jTableDados.setEnabled(true);
        jTextFieldCampoPesquisa.setEnabled(true);
        jLabelEstado.setText("Início");
        
        JFrameFinalizaVenda finaliza = new JFrameFinalizaVenda(ven);
        finaliza.setLocationRelativeTo(this);
        finaliza.setVisible(true);  
        int status = finaliza.getStatus();
        if(status == 1){
            //baixa no estoque
            
            int quant = listItensDaVenda.size();
            for(int j = 0 ; j < quant ; j++){
                entityManager.clear();
                Produto pro = new Produto(listItensDaVenda.get(j).getProduto().getIdProduto(),
                                          listItensDaVenda.get(j).getProduto().getProCodigo(),                                          
                                          listItensDaVenda.get(j).getProduto().getProDescricao(),
                                          listItensDaVenda.get(j).getProduto().getProPrecoVenda(),
                                          listItensDaVenda.get(j).getProduto().getProEstoqueInicial(),
                                          listItensDaVenda.get(j).getProduto().getProEstoqueAtual()-listItensDaVenda.get(j).getItvQuantidade(),
                                          listItensDaVenda.get(j).getProduto().getProEstoqueMinimo(),
                                          listItensDaVenda.get(j).getProduto().getProFoto(),
                                          listItensDaVenda.get(j).getProduto().getCategoria(),
                                          listItensDaVenda.get(j).getProduto().getMarcaProduto(),
                                          listItensDaVenda.get(j).getProduto().getGrupo());            
                
                try {
                    entityManager.getTransaction().begin();
                    pro = entityManager.merge(pro);
                    entityManager.persist(pro);
                    entityManager.getTransaction().commit();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao dar baixa no estoque");
                }         
            }
            int confirma = JOptionPane.showConfirmDialog(null, "Venda Concluída!\n Deseja efetuar nova venda?", 
                    "Venda Concluída", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
            if (confirma == 0){
                jButtonNovoActionPerformed(evt);
                listaTodosProdutos();
            } else {
                dispose();
            }            
        } else {
            JOptionPane.showMessageDialog(null, "A venda não foi concluída!");
            removerVenda(ven);
            atualizaTabela();
            dispose();
        }
    }//GEN-LAST:event_jButtonFinalizarVendaActionPerformed
    
    private void removerVenda(Venda ven){
        String ejbql = "from ItemDaVenda i where i.venda.idVenda = " + ven.getIdVenda();
        queryItensVenda = entityManager.createQuery(ejbql);
        listItensDaVenda.clear();
        listItensDaVenda.addAll(queryItensVenda.getResultList());
        
        for(int i = 0 ; i < listItensDaVenda.size() ; i++){       
            ItemDaVenda itv = new ItemDaVenda();
            itv.setIdItemVenda(listItensDaVenda.get(i).getIdItemVenda());
            itv.setItvPrecoUnitario(listItensDaVenda.get(i).getItvPrecoUnitario());
            itv.setItvQuantidade(listItensDaVenda.get(i).getItvQuantidade());
            itv.setItvValorTotal(listItensDaVenda.get(i).getItvValorTotal());
            itv.setProduto(listItensDaVenda.get(i).getProduto());
            entityManager.getTransaction().begin();
            itv = entityManager.merge(itv);
            entityManager.remove(itv);
            entityManager.getTransaction().commit();
        } 
        entityManager.getTransaction().begin();
        ven = entityManager.merge(ven);
        entityManager.remove(ven);
        entityManager.getTransaction().commit();
    }   
    
    
    private void jButtonBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProdutoActionPerformed
        JFrameBuscaProduto buscaProduto = new JFrameBuscaProduto();
        buscaProduto.setLocationRelativeTo(this);
        buscaProduto.setVisible(true);
        //jTextFieldCodProduto.requestFocus();
        if(!(buscaProduto.getProduto().equals(""))){
            if(buscaProduto.getQuantidade() > 0){
                jTextFieldCodProduto.setText(buscaProduto.getCodProduto());
                jFormattedTextFieldPreco.setValue(buscaProduto.getPreco());
                jFormattedTextFieldPrecoPrazo.setValue(buscaProduto.getPreco());
                jTextFieldQuantidade.setText("1");
                int sel = buscaProduto.getIndice();
                jListProdutos.setSelectionInterval(sel, sel);
                if(sel > -1){
                    jButtonAdicionarItem.setEnabled(true);
                } else {
                    jTextFieldCodProduto.setText("");
                    jTextFieldProduto.setText("");
                    jTextFieldQuantidade.setText("");
                }
                jListProdutos.setSelectedIndex(0);
                jListProdutos.setEnabled(false);
                jButtonLimparProduto.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Produto esgotado!");
            } 
        }
    }//GEN-LAST:event_jButtonBuscaProdutoActionPerformed

    private void jListProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProdutosMouseReleased
        if(jListProdutos.isEnabled() && listProduto.size()>0){
            int sel = jListProdutos.getSelectedIndex();
            jTextFieldCodProduto.setText(String.valueOf(jListProdutos.getSelectedValue().getProCodigo()));
            if(sel > -1){
                jButtonAdicionarItem.setEnabled(true);
                jButtonLimparProduto.setEnabled(true);
            } else {
                jTextFieldCodProduto.setText("");
                jTextFieldProduto.setText("");
                jTextFieldQuantidade.setText("");
            }

            listaTodosProdutos();
            jListProdutos.setSelectionInterval(sel, sel);
            jFormattedTextFieldPreco.setValue(jListProdutos.getSelectedValue().getProPrecoVenda());
            jFormattedTextFieldPrecoPrazo.setValue(jListProdutos.getSelectedValue().getProPrecoVenda());
            jTextFieldQuantidade.setText("1");
        }
    }//GEN-LAST:event_jListProdutosMouseReleased

    private void jButtonRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverItemActionPerformed
        if(jTableItensDaVenda.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um item ao lado para remover!");
            jButtonRemoverItem.setEnabled(false);
        } else {
            listItensDaVenda.remove(jTableItensDaVenda.getSelectedRow());
            jButtonRemoverItem.setEnabled(false);
            calculaTotais();
            verificaTabelaItens();
        }
    }//GEN-LAST:event_jButtonRemoverItemActionPerformed

    private void jTextFieldDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusLost
        if(jTextFieldDesconto.getText().equals("") || jTextFieldDesconto.getText().equals("0"))
            jTextFieldDesconto.setText("0.00");
        calculaTotais();
    }//GEN-LAST:event_jTextFieldDescontoFocusLost

    private void jTextFieldDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusGained
        if(jTextFieldDesconto.getText().equals("0.00") || jTextFieldDesconto.getText().equals("0"))
            jTextFieldDesconto.setText("");
    }//GEN-LAST:event_jTextFieldDescontoFocusGained

    private void jTableItensDaVendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensDaVendaMouseReleased
        if(jTableItensDaVenda.getSelectedRow()>-1){
            jButtonRemoverItem.setEnabled(true);
        } else {
            jButtonRemoverItem.setEnabled(false);
        }
    }//GEN-LAST:event_jTableItensDaVendaMouseReleased

    private void jTextFieldDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescontoKeyTyped
        String caracteres=",";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldDesconto.setText(jTextFieldDesconto.getText() + ".");
        }
        String caracteres2="0123456789,.";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDescontoKeyTyped

    private void jTextFieldQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeKeyTyped
        String caracteres2="0123456789";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldQuantidadeKeyTyped

    private void jTextFieldQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeFocusLost
        if(jTextFieldQuantidade.getText().equals("")){
            jTextFieldQuantidade.setText("0");
        }
    }//GEN-LAST:event_jTextFieldQuantidadeFocusLost

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar esta venda?", "Atenção", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirma == 0){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Venda ven = listVenda.get(linhaSelecionada);
            removerVenda(ven);
            jTableDados.clearSelection();
            atualizaTabela();
            verificaTabelaItens();
            calculaTotais(); 
            limparCampos();
            statusInicial(true);
            atualizaControles();
            jButtonNovo.setEnabled(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jButtonLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparProdutoActionPerformed
        limparItem();
        jListProdutos.setEnabled(true);
        listaTodosProdutos();
        jButtonLimparProduto.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparProdutoActionPerformed

    private void jTextFieldCodProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!jTextFieldCodProduto.getText().equals("")){
                //buscaProduto();
            }
        }
    }//GEN-LAST:event_jTextFieldCodProdutoKeyPressed
    
    
    
    private void listaTodosProdutos(){
        entityManager.clear();
        String ejbql2 = "from Produto p where p.proEstoqueAtual > 0";
        ejbql2 +=" order by p.proDescricao";
        queryProduto = entityManager.createQuery(ejbql2);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());        
    }
    
    private void buscaProduto(){
        entityManager.clear();
        String ejbql2 = "from Produto p ";
        String codigo = "";        
            codigo = "p.proCodigo";
            String filtro = jTextFieldCodProduto.getText();
            if(!filtro.equals("")){
                ejbql2 += "where " + codigo + " = '" + filtro + "'";
            }
        ejbql2 +=" order by " + codigo;
        queryProduto = entityManager.createQuery(ejbql2);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());  
        if(!jTextFieldCodProduto.getText().equals("") && listProduto.size() > 0){
            jTextFieldProduto.setText(listProduto.toString());
        }else{
            int confirma = JOptionPane.showConfirmDialog(null, "Produto não cadastrado! Deseja cadastrar agora? ");
            if(confirma == 0){
                JFrameProduto cadProduto = new JFrameProduto();
                cadProduto.setLocationRelativeTo(this);
                cadProduto.setVisible(true);
            }
        }
    }
    
    private void buscaCliente(){
        entityManager.clear();
        String ejbql3 = "from Cliente c ";
        String codigo = "";
            codigo = "c.idCliente";
            String filtro = jTextFieldCodCliente.getText();
            if(!filtro.equals("")){
                ejbql3 += "where " + codigo + " = " + filtro;
            }
        ejbql3 += " order by " + codigo;
        queryCliente = entityManager.createQuery(ejbql3);
        listCliente.clear();
        listCliente.addAll(queryCliente.getResultList());
        if(!jTextFieldCodCliente.getText().equals("") && listCliente.size() > 0){
            jTextFieldCliente.setText(listCliente.toString());
        }else{
            int confirma = JOptionPane.showConfirmDialog(null, "Cliente não cadastrado! Deseja cadastrar agora? ");
            if(confirma == 0){
                JFrameCliente cadCliente = new JFrameCliente();
                cadCliente.setLocationRelativeTo(this);
                cadCliente.setVisible(true);
            }
        }
    }
    
    
    //função que controla o estado dos campos de entrada de texto 
    private void statusInicial(boolean status){
        jLabelEstado.setText("Início");
        jTextFieldCodCliente.setEnabled(!status);
        jTextFieldCliente.setEnabled(!status);
        jTextFieldCodProduto.setEnabled(!status);
        jTextFieldProduto.setEnabled(!status);
        jFormattedTextFieldPreco.setEnabled(!status);
        jTextFieldQuantidade.setEnabled(!status);
        jFormattedTextFieldDataVenda.setEnabled(!status);
        jButtonBuscarCliente.setEnabled(!status);
        jButtonBuscaProduto.setEnabled(!status);
        jListProdutos.setEnabled(!status);
        jTableDados.setEnabled(status);
    }
    
    //função que apaga texto digitado nos campos de entrada de texto
    private void limparCampos(){
        jTextFieldCodCliente.setText("");
        jTextFieldCliente.setText("");
        jTextFieldCodProduto.setText("");
        jTextFieldProduto.setText("");
        jFormattedTextFieldDataVenda.setText("");
        jFormattedTextFieldPreco.setValue(0.00);
        jFormattedTextFieldPrecoPrazo.setValue(0.00);
        jTextFieldDesconto.setText("0.00");
        jTextFieldCodProduto.setBackground(Color.WHITE);
        jFormattedTextFieldDataVenda.setBackground(Color.WHITE);
        listCliente.clear();
        listItemSelecionado.clear();
        listItensDaVenda.clear();
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        jComboBoxPesquisaStatus.setEnabled(status);
        jComboBoxTipoPesquisa.setEnabled(status);
        //jButtonAlterar.setEnabled(status);
        //jButtonExcluir.setEnabled(status);
    }
    
    /**
     * função que atualiza a tabela dados conforme as operações são efetuadas no 
     * formulário de cadastro
     */
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Cliente")){
            ejbql = "from Venda v WHERE v.venValorTotal <> 0 and v.veiculo is null order by v.cliente.cliNome asc";
            campoPesquisa = "v.cliente.cliNome";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql = "from Venda v join v.cliente c where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
                ejbql += " AND v.venValorTotal <> 0 AND v.veiculo.veiPlaca = '' order by " + campoPesquisa + " asc";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            ejbql = "from Venda v WHERE v.venValorTotal <> 0 AND v.veiculo.veiPlaca = '' order by v.idVenda asc";
            campoPesquisa = "v.idVenda";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql = "from Venda v WHERE v.venValorTotal <> 0 ";
                    ejbql += "AND " + campoPesquisa + " = " + filtro + " AND v.veiculo.veiPlaca = '' order by " + campoPesquisa + " asc";;
                }
            }
        }      
        queryVenda = entityManager.createQuery(ejbql);
        listVenda.clear();
        listVenda.addAll(queryVenda.getResultList());
        int linha = listVenda.size() - 1;
        if(listVenda.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            //jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Dados solicitados não foram localizados!");
        }
        if(listVenda.size() == 1){
            //jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        }else
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            //jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            //jButtonAlterar.setEnabled(false);
            //jButtonExcluir.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            //jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            //jButtonAlterar.setEnabled(false);
            //jButtonExcluir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAdicionarItem;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscaProduto;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFinalizarVenda;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonLimparProduto;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonRemoverItem;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVenda;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoPrazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCodProduto;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelLabelCliente;
    private javax.swing.JLabel jLabelLabelCodCliente;
    private javax.swing.JLabel jLabelLabelDataVenda;
    private javax.swing.JLabel jLabelLabelDesconto;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelLabelPreco;
    private javax.swing.JLabel jLabelLabelQuantidade;
    private javax.swing.JLabel jLabelLabelSubtotal;
    private javax.swing.JLabel jLabelLabelTituloVenda;
    private javax.swing.JLabel jLabelLabelTotal;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<Produto> jListProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelBarraTitulo1;
    private javax.swing.JPanel jPanelBarraTitulo2;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JPanel jPanelFotoProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneItensDaVenda;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTable jTableItensDaVenda;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JToolBar jToolBarComandos;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Produto> listItemSelecionado;
    private java.util.List<ItemDaVenda> listItensDaVenda;
    private java.util.List<ItemDaVenda> listItensVenda;
    private java.util.List<Produto> listProduto;
    private java.util.List<ItemDaVenda> listProdutoSelecionado;
    private java.util.List<Usuario> listUsuario;
    private java.util.List<Venda> listVenda;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryItemSelecionado;
    private javax.persistence.Query queryItensVenda;
    private javax.persistence.Query queryProduto;
    private javax.persistence.Query queryUsuario;
    private javax.persistence.Query queryVenda;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
