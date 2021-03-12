package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Produto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.ItemDaVenda;
import model.Servico;
import model.ServicoDaVenda;
import model.Usuario;
import model.Veiculo;
import model.Venda;

public class JFrameOrdemServico extends javax.swing.JDialog {

    public JFrameOrdemServico() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        atualizaTabela();
        atualizaControles();
        limparCampos();
        lerLogin();
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Venda v where v.venValorTotal <> 0 and v.veiculo.veiPlaca <> '' order by v.venDataVenda Desc");
        listVenda = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVenda.getResultList());
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p where p.proEstoqueAtual > 0 order by p.proDescricao");
        listProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProduto.getResultList());
        queryItensVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ItemDaVenda i order by i.idItemVenda");
        listItensDaVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<ItemDaVenda>());
        ;
        queryServico = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Servico s order by s.serDescricao");
        listServico = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryServico.getResultList());
        queryServicosVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ServicoDaVenda s order by s.idServicosVenda");
        listServicosDaVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<model.ServicoDaVenda>());
        ;
        queryVeiculo = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Veiculo v order by v.idVeiculo");
        listVeiculo = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVeiculo.getResultList());
        buttonGroupOrcamentoOS = new javax.swing.ButtonGroup();
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
        jLabelLabelTituloOS = new javax.swing.JLabel();
        jLabelLabelDataEntrada = new javax.swing.JLabel();
        jFormattedTextFieldDataEntrada = new javax.swing.JFormattedTextField();
        jPanelDadosCliente = new javax.swing.JPanel();
        jLabelLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabelLabelCodCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jTabbedPaneDados = new javax.swing.JTabbedPane();
        jPanelMaoObraServicos = new javax.swing.JPanel();
        jPanelBuscas1 = new javax.swing.JPanel();
        jLabelLabelCodServico = new javax.swing.JLabel();
        jTextFieldCodServico = new javax.swing.JTextField();
        jTextFieldServico = new javax.swing.JTextField();
        jButtonBuscaServico = new javax.swing.JButton();
        jLabelLabelServico = new javax.swing.JLabel();
        jButtonRemoverSer = new javax.swing.JButton();
        jButtonAdicionarSer = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jFormattedTextFieldPrecoServico = new javax.swing.JFormattedTextField();
        jLabelLabelPrecoServicoPrazo = new javax.swing.JLabel();
        jLabelPrecoServico = new javax.swing.JLabel();
        jFormattedTextFieldPrecoServicoPrazo = new javax.swing.JFormattedTextField();
        jButtonLimparServico = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServicosDaOS = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListServicos = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelPecas = new javax.swing.JPanel();
        jPanelBuscas = new javax.swing.JPanel();
        jLabelLabelCodPeca = new javax.swing.JLabel();
        jTextFieldCodPeca = new javax.swing.JTextField();
        jTextFieldPeca = new javax.swing.JTextField();
        jButtonBuscaProduto = new javax.swing.JButton();
        jLabelLabelPeca = new javax.swing.JLabel();
        jButtonRemover = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPrecoPrazo = new javax.swing.JFormattedTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelLabelPrecoPrazo = new javax.swing.JLabel();
        jLabelLabelQuantidade = new javax.swing.JLabel();
        jLabelPrecoVista = new javax.swing.JLabel();
        jButtonLimparProduto = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItensDaOS = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelPesquisarOS = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanelBarraTitulo2 = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanelValores = new javax.swing.JPanel();
        jButtonFinalizarOS = new javax.swing.JButton();
        jPanelValoresOS = new javax.swing.JPanel();
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
        jButtonCancelarOS = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButtonOS = new javax.swing.JRadioButton();
        jRadioButtonOrcamento = new javax.swing.JRadioButton();
        jPanelDadosEntradaOS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlacaVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCorVeiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldModeloVeiculo = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonBuscarVeiculo = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ORDEM DE SERVIÇO");
        setMinimumSize(new java.awt.Dimension(980, 510));
        setModal(true);
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
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-novaordemdeservico.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar uma Ordem de Serviço");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(224, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(224, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(224, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-novaordemdeservico-over.png"))); // NOI18N
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonNovo);

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Gravar OS no banco de dados");
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
        jButtonAlterar.setToolTipText("Alterar dados da OS");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButtonExcluir.setToolTipText("Excluir a OS");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButtonImprimir.setToolTipText("Imprimir relatórios da OS");
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
        jButtonSair.setToolTipText("Sair da tela de Ordem de Serviço");
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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
            .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBarraTitulo1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo1.setMaximumSize(new java.awt.Dimension(617, 29));
        jPanelBarraTitulo1.setMinimumSize(new java.awt.Dimension(617, 29));

        jLabelLabelTituloOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelTituloOS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTituloOS.setText("ORDEM DE SERVIÇO / ORÇAMENTO");

        jLabelLabelDataEntrada.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelDataEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelDataEntrada.setText("Data de Entrada:");

        jFormattedTextFieldDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venDataVenda}"), jFormattedTextFieldDataEntrada, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanelBarraTitulo1Layout = new javax.swing.GroupLayout(jPanelBarraTitulo1);
        jPanelBarraTitulo1.setLayout(jPanelBarraTitulo1Layout);
        jPanelBarraTitulo1Layout.setHorizontalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelTituloOS, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelDataEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBarraTitulo1Layout.setVerticalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addGroup(jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelTituloOS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelDataEntrada)
                    .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDadosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDadosCliente.setMaximumSize(new java.awt.Dimension(559, 61));
        jPanelDadosCliente.setMinimumSize(new java.awt.Dimension(559, 61));
        jPanelDadosCliente.setPreferredSize(new java.awt.Dimension(559, 61));

        jLabelLabelCliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelCliente.setText("Cliente:");

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabelLabelCodCliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelCodCliente.setText("Cód.:");

        jTextFieldCodCliente.setEditable(false);
        jTextFieldCodCliente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextFieldCodCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodClienteCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosClienteLayout = new javax.swing.GroupLayout(jPanelDadosCliente);
        jPanelDadosCliente.setLayout(jPanelDadosClienteLayout);
        jPanelDadosClienteLayout.setHorizontalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCodCliente)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosClienteLayout.setVerticalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCodCliente)
                    .addComponent(jLabelLabelCliente))
                .addGap(1, 1, 1)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneDados.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPaneDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPaneDados.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTabbedPaneDados.setMaximumSize(new java.awt.Dimension(968, 280));
        jTabbedPaneDados.setMinimumSize(new java.awt.Dimension(968, 280));
        jTabbedPaneDados.setPreferredSize(new java.awt.Dimension(968, 280));

        jPanelMaoObraServicos.setBackground(new java.awt.Color(204, 204, 204));
        jPanelMaoObraServicos.setMaximumSize(new java.awt.Dimension(964, 221));
        jPanelMaoObraServicos.setMinimumSize(new java.awt.Dimension(964, 221));

        jPanelBuscas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscas1.setMaximumSize(new java.awt.Dimension(363, 232));
        jPanelBuscas1.setMinimumSize(new java.awt.Dimension(363, 232));
        jPanelBuscas1.setPreferredSize(new java.awt.Dimension(363, 232));
        jPanelBuscas1.setRequestFocusEnabled(false);

        jLabelLabelCodServico.setText("Cód. Serv.:");

        jTextFieldCodServico.setEditable(false);
        jTextFieldCodServico.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextFieldCodServico.setMaximumSize(new java.awt.Dimension(104, 31));
        jTextFieldCodServico.setMinimumSize(new java.awt.Dimension(104, 31));
        jTextFieldCodServico.setPreferredSize(new java.awt.Dimension(104, 31));
        jTextFieldCodServico.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodServicoCaretUpdate(evt);
            }
        });

        jTextFieldServico.setEditable(false);
        jTextFieldServico.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jButtonBuscaServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-16.png"))); // NOI18N
        jButtonBuscaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaServicoActionPerformed(evt);
            }
        });

        jLabelLabelServico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLabelServico.setText("Serviço:");

        jButtonRemoverSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-lef24red.png"))); // NOI18N
        jButtonRemoverSer.setText("Remover");
        jButtonRemoverSer.setEnabled(false);
        jButtonRemoverSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverSerActionPerformed(evt);
            }
        });

        jButtonAdicionarSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-dir24.png"))); // NOI18N
        jButtonAdicionarSer.setText("Adicionar");
        jButtonAdicionarSer.setEnabled(false);
        jButtonAdicionarSer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButtonAdicionarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarSerActionPerformed(evt);
            }
        });

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setMaximumSize(new java.awt.Dimension(200, 135));
        jPanel12.setMinimumSize(new java.awt.Dimension(200, 135));

        jFormattedTextFieldPrecoServico.setEditable(false);
        jFormattedTextFieldPrecoServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextFieldPrecoServico.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabelLabelPrecoServicoPrazo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelPrecoServicoPrazo.setText("Preço prazo:");

        jLabelPrecoServico.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelPrecoServico.setText("Preço vista:");

        jFormattedTextFieldPrecoServicoPrazo.setEditable(false);
        jFormattedTextFieldPrecoServicoPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextFieldPrecoServicoPrazo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPrecoServico)
                    .addComponent(jLabelLabelPrecoServicoPrazo))
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextFieldPrecoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldPrecoServicoPrazo))
                .addGap(15, 15, 15))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFormattedTextFieldPrecoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelPrecoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldPrecoServicoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelPrecoServicoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButtonLimparServico.setText("Limpar Seleção");
        jButtonLimparServico.setEnabled(false);
        jButtonLimparServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscas1Layout = new javax.swing.GroupLayout(jPanelBuscas1);
        jPanelBuscas1.setLayout(jPanelBuscas1Layout);
        jPanelBuscas1Layout.setHorizontalGroup(
            jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoverSer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdicionarSer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLimparServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabelLabelServico)
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldServico, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelLabelCodServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBuscas1Layout.setVerticalGroup(
            jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelLabelCodServico))
                            .addComponent(jButtonBuscaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldCodServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLabelServico))
                    .addComponent(jTextFieldServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBuscas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscas1Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionarSer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverSer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(new java.awt.Dimension(358, 232));
        jPanel4.setMinimumSize(new java.awt.Dimension(358, 232));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(358, 232));

        jTableServicosDaOS.setMaximumSize(new java.awt.Dimension(326, 175));
        jTableServicosDaOS.setMinimumSize(new java.awt.Dimension(326, 175));
        jTableServicosDaOS.setPreferredSize(new java.awt.Dimension(326, 175));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listServicosDaVenda, jTableServicosDaOS);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${servico}"));
        columnBinding.setColumnName("Serviço");
        columnBinding.setColumnClass(model.Servico.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sveValorServico}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableServicosDaOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableServicosDaOSMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTableServicosDaOS);
        if (jTableServicosDaOS.getColumnModel().getColumnCount() > 0) {
            jTableServicosDaOS.getColumnModel().getColumn(0).setResizable(false);
            jTableServicosDaOS.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableServicosDaOS.getColumnModel().getColumn(1).setResizable(false);
            jTableServicosDaOS.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(324, 29));
        jPanel3.setMinimumSize(new java.awt.Dimension(324, 29));
        jPanel3.setPreferredSize(new java.awt.Dimension(324, 29));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SERVIÇOS ADICIONADOS À O.S.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setMaximumSize(new java.awt.Dimension(219, 232));
        jPanel11.setMinimumSize(new java.awt.Dimension(219, 232));
        jPanel11.setPreferredSize(new java.awt.Dimension(219, 232));

        jScrollPane5.setMaximumSize(new java.awt.Dimension(277, 134));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(277, 134));

        jListServicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListServicos.setMaximumSize(new java.awt.Dimension(180, 185));
        jListServicos.setMinimumSize(new java.awt.Dimension(180, 185));
        jListServicos.setPreferredSize(new java.awt.Dimension(180, 185));
        jListServicos.setVisibleRowCount(6);

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listServico, jListServicos);
        bindingGroup.addBinding(jListBinding);

        jListServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListServicosMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jListServicos);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(185, 26));
        jPanel2.setMinimumSize(new java.awt.Dimension(185, 26));
        jPanel2.setPreferredSize(new java.awt.Dimension(185, 26));

        jLabel9.setBackground(new java.awt.Color(0, 102, 153));
        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SERVIÇOS CADASTRADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMaoObraServicosLayout = new javax.swing.GroupLayout(jPanelMaoObraServicos);
        jPanelMaoObraServicos.setLayout(jPanelMaoObraServicosLayout);
        jPanelMaoObraServicosLayout.setHorizontalGroup(
            jPanelMaoObraServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaoObraServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBuscas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMaoObraServicosLayout.setVerticalGroup(
            jPanelMaoObraServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaoObraServicosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelMaoObraServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaoObraServicosLayout.createSequentialGroup()
                        .addGroup(jPanelMaoObraServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelBuscas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jTabbedPaneDados.addTab("Mão de obra / Serviços", jPanelMaoObraServicos);

        jPanelPecas.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPecas.setMaximumSize(new java.awt.Dimension(964, 221));
        jPanelPecas.setMinimumSize(new java.awt.Dimension(964, 221));

        jPanelBuscas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscas.setMaximumSize(new java.awt.Dimension(363, 232));
        jPanelBuscas.setMinimumSize(new java.awt.Dimension(363, 232));
        jPanelBuscas.setPreferredSize(new java.awt.Dimension(363, 232));

        jLabelLabelCodPeca.setText("Cód. Peça:");

        jTextFieldCodPeca.setEditable(false);
        jTextFieldCodPeca.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextFieldCodPeca.setMaximumSize(new java.awt.Dimension(104, 31));
        jTextFieldCodPeca.setMinimumSize(new java.awt.Dimension(104, 31));
        jTextFieldCodPeca.setPreferredSize(new java.awt.Dimension(104, 31));
        jTextFieldCodPeca.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodPecaCaretUpdate(evt);
            }
        });

        jTextFieldPeca.setEditable(false);
        jTextFieldPeca.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTextFieldPeca.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPecaCaretUpdate(evt);
            }
        });

        jButtonBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-16.png"))); // NOI18N
        jButtonBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaProdutoActionPerformed(evt);
            }
        });

        jLabelLabelPeca.setText("Peça:");

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-lef24red.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-dir24.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setEnabled(false);
        jButtonAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 135));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 135));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 135));

        jFormattedTextFieldPreco.setEditable(false);
        jFormattedTextFieldPreco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jFormattedTextFieldPrecoPrazo.setEditable(false);
        jFormattedTextFieldPrecoPrazo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jTextFieldQuantidade.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
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

        jLabelLabelPrecoPrazo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelPrecoPrazo.setText("Preço prazo:");

        jLabelLabelQuantidade.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelQuantidade.setText("Quantidade:");

        jLabelPrecoVista.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelPrecoVista.setText("Preço vista:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelPrecoVista))
                    .addComponent(jLabelLabelPrecoPrazo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelLabelQuantidade)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextFieldPrecoPrazo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelPrecoVista)
                        .addGap(17, 17, 17)
                        .addComponent(jLabelLabelPrecoPrazo)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLabelQuantidade)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jFormattedTextFieldPrecoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButtonLimparProduto.setText("Limpar Seleção");
        jButtonLimparProduto.setEnabled(false);
        jButtonLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscasLayout = new javax.swing.GroupLayout(jPanelBuscas);
        jPanelBuscas.setLayout(jPanelBuscasLayout);
        jPanelBuscasLayout.setHorizontalGroup(
            jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscasLayout.createSequentialGroup()
                .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelLabelCodPeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelLabelPeca)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelBuscasLayout.setVerticalGroup(
            jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscasLayout.createSequentialGroup()
                .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBuscasLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelLabelCodPeca))
                            .addComponent(jButtonBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldCodPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLabelPeca))
                    .addComponent(jTextFieldPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBuscasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBuscasLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setMaximumSize(new java.awt.Dimension(358, 232));
        jPanel7.setMinimumSize(new java.awt.Dimension(358, 232));
        jPanel7.setPreferredSize(new java.awt.Dimension(358, 232));

        jTableItensDaOS.setMaximumSize(new java.awt.Dimension(326, 175));
        jTableItensDaOS.setMinimumSize(new java.awt.Dimension(326, 175));
        jTableItensDaOS.setPreferredSize(new java.awt.Dimension(326, 175));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItensDaVenda, jTableItensDaOS);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(model.Produto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvQuantidade}"));
        columnBinding.setColumnName("Qtd.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvValorTotal}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableItensDaOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableItensDaOSMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableItensDaOS);
        if (jTableItensDaOS.getColumnModel().getColumnCount() > 0) {
            jTableItensDaOS.getColumnModel().getColumn(0).setResizable(false);
            jTableItensDaOS.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableItensDaOS.getColumnModel().getColumn(1).setResizable(false);
            jTableItensDaOS.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTableItensDaOS.getColumnModel().getColumn(2).setResizable(false);
            jTableItensDaOS.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(324, 29));
        jPanel6.setMinimumSize(new java.awt.Dimension(324, 29));
        jPanel6.setPreferredSize(new java.awt.Dimension(324, 29));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PEÇAS / PRODUTOS ADICIONADOS À O.S.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setMaximumSize(new java.awt.Dimension(219, 232));
        jPanel10.setMinimumSize(new java.awt.Dimension(219, 232));
        jPanel10.setPreferredSize(new java.awt.Dimension(219, 232));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(277, 134));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(277, 134));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(277, 134));

        jListProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProdutos.setMaximumSize(new java.awt.Dimension(180, 185));
        jListProdutos.setMinimumSize(new java.awt.Dimension(180, 185));
        jListProdutos.setPreferredSize(new java.awt.Dimension(180, 185));
        jListProdutos.setVisibleRowCount(6);

        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jListProdutos);
        bindingGroup.addBinding(jListBinding);

        jListProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListProdutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListProdutos);

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMaximumSize(new java.awt.Dimension(185, 26));
        jPanel5.setMinimumSize(new java.awt.Dimension(185, 26));
        jPanel5.setPreferredSize(new java.awt.Dimension(185, 26));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PEÇAS DISPONÍVEIS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPecasLayout = new javax.swing.GroupLayout(jPanelPecas);
        jPanelPecas.setLayout(jPanelPecasLayout);
        jPanelPecasLayout.setHorizontalGroup(
            jPanelPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPecasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBuscas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPecasLayout.setVerticalGroup(
            jPanelPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPecasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPecasLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelBuscas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPaneDados.addTab("Peças / Produtos", jPanelPecas);

        jPanelPesquisarOS.setMaximumSize(new java.awt.Dimension(964, 221));
        jPanelPesquisarOS.setMinimumSize(new java.awt.Dimension(964, 221));
        jPanelPesquisarOS.setPreferredSize(new java.awt.Dimension(964, 221));

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMaximumSize(new java.awt.Dimension(460, 197));
        jPanel13.setMinimumSize(new java.awt.Dimension(460, 197));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVenda, jTableDados);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVenda}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente.cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venDataVenda}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venValorTotal}"));
        columnBinding.setColumnName("Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiculo.veiPlaca}"));
        columnBinding.setColumnName("Veiculo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario.usuLogin}"));
        columnBinding.setColumnName("Usuário");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venOrcamento}"));
        columnBinding.setColumnName("Orçamento");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableDadosMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableDados.getColumnModel().getColumn(4).setResizable(false);
            jTableDados.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableDados.getColumnModel().getColumn(5).setResizable(false);
            jTableDados.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTableDados.getColumnModel().getColumn(6).setResizable(false);
            jTableDados.getColumnModel().getColumn(6).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setMaximumSize(new java.awt.Dimension(274, 231));
        jPanel14.setMinimumSize(new java.awt.Dimension(274, 231));
        jPanel14.setPreferredSize(new java.awt.Dimension(274, 231));
        jPanel14.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelBarraTitulo2.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo2.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo2.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo2.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelPesquisa.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisa.setText("PESQUISAR O.S.");
        jLabelPesquisa.setFocusable(false);

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Cliente" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jButtonPesquisaOK.setText("OK");
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
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanelBarraTitulo2Layout.setVerticalGroup(
            jPanelBarraTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBarraTitulo2Layout.createSequentialGroup()
                .addComponent(jComboBoxTipoPesquisa)
                .addGap(1, 1, 1))
            .addGroup(jPanelBarraTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldCampoPesquisa)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPesquisarOSLayout = new javax.swing.GroupLayout(jPanelPesquisarOS);
        jPanelPesquisarOS.setLayout(jPanelPesquisarOSLayout);
        jPanelPesquisarOSLayout.setHorizontalGroup(
            jPanelPesquisarOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPesquisarOSLayout.setVerticalGroup(
            jPanelPesquisarOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisarOSLayout.createSequentialGroup()
                        .addComponent(jPanelBarraTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneDados.addTab("Pesquisar Ordem de Serviço", jPanelPesquisarOS);

        jPanelValores.setBackground(new java.awt.Color(204, 204, 204));
        jPanelValores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelValores.setMaximumSize(new java.awt.Dimension(339, 203));
        jPanelValores.setMinimumSize(new java.awt.Dimension(339, 203));
        jPanelValores.setPreferredSize(new java.awt.Dimension(339, 203));

        jButtonFinalizarOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonFinalizarOS.setText("Concluir");
        jButtonFinalizarOS.setEnabled(false);
        jButtonFinalizarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarOSActionPerformed(evt);
            }
        });

        jPanelValoresOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
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

        javax.swing.GroupLayout jPanelValoresOSLayout = new javax.swing.GroupLayout(jPanelValoresOS);
        jPanelValoresOS.setLayout(jPanelValoresOSLayout);
        jPanelValoresOSLayout.setHorizontalGroup(
            jPanelValoresOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelValoresOSLayout.setVerticalGroup(
            jPanelValoresOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancelarOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonCancelarOS.setText("Cancelar");
        jButtonCancelarOS.setEnabled(false);
        jButtonCancelarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarOSActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroupOrcamentoOS.add(jRadioButtonOS);
        jRadioButtonOS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jRadioButtonOS.setText("Ordem de Serviço");
        jRadioButtonOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButtonOSMouseReleased(evt);
            }
        });

        buttonGroupOrcamentoOS.add(jRadioButtonOrcamento);
        jRadioButtonOrcamento.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jRadioButtonOrcamento.setText("Orçamento");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venOrcamento}"), jRadioButtonOrcamento, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonOrcamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonOS)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOrcamento)
                    .addComponent(jRadioButtonOS))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelValoresLayout = new javax.swing.GroupLayout(jPanelValores);
        jPanelValores.setLayout(jPanelValoresLayout);
        jPanelValoresLayout.setHorizontalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelValoresOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelValoresLayout.createSequentialGroup()
                        .addComponent(jButtonCancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizarOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelValoresLayout.setVerticalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelValoresOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinalizarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jPanelDadosEntradaOS.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDadosEntradaOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDadosEntradaOS.setMaximumSize(new java.awt.Dimension(559, 56));
        jPanelDadosEntradaOS.setMinimumSize(new java.awt.Dimension(559, 56));
        jPanelDadosEntradaOS.setPreferredSize(new java.awt.Dimension(559, 56));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Cód. Veículo:");

        jTextFieldCodVeiculo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodVeiculoCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Placa:");

        jLabel3.setText("Cor:");

        jLabel4.setText("Modelo:");

        javax.swing.GroupLayout jPanelDadosEntradaOSLayout = new javax.swing.GroupLayout(jPanelDadosEntradaOS);
        jPanelDadosEntradaOS.setLayout(jPanelDadosEntradaOSLayout);
        jPanelDadosEntradaOSLayout.setHorizontalGroup(
            jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldCorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosEntradaOSLayout.setVerticalGroup(
            jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosEntradaOSLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(jPanelDadosEntradaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-24.png"))); // NOI18N
        jButtonBuscarCliente.setEnabled(false);
        jButtonBuscarCliente.setMaximumSize(new java.awt.Dimension(52, 61));
        jButtonBuscarCliente.setMinimumSize(new java.awt.Dimension(52, 61));
        jButtonBuscarCliente.setPreferredSize(new java.awt.Dimension(52, 61));
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jButtonBuscarVeiculo.setBackground(new java.awt.Color(153, 204, 255));
        jButtonBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-24.png"))); // NOI18N
        jButtonBuscarVeiculo.setMaximumSize(new java.awt.Dimension(52, 61));
        jButtonBuscarVeiculo.setMinimumSize(new java.awt.Dimension(52, 61));
        jButtonBuscarVeiculo.setPreferredSize(new java.awt.Dimension(52, 61));
        jButtonBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVeiculoActionPerformed(evt);
            }
        });

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setMaximumSize(new java.awt.Dimension(623, 39));
        jPanel17.setMinimumSize(new java.awt.Dimension(623, 39));
        jPanel17.setPreferredSize(new java.awt.Dimension(623, 39));
        jPanel17.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelDadosEntradaOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonBuscarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jPanelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDadosEntradaOS, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jButtonBuscarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jTabbedPaneDados, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(996, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Ordem de Serviço iniciada");
        listVenda.add(new Venda());
        int linha = listVenda.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        java.util.Date hoje = Date.from(Instant.now());
        jFormattedTextFieldDataEntrada.setValue(hoje);
        gerarVenda();
        jButtonBuscarVeiculo.setEnabled(true);
        calculaTotais();
        verificaTabelaItens();
        verificaTabelaServicos();
        
    }//GEN-LAST:event_jButtonNovoActionPerformed
    
    private void gerarVenda(){
        int linhaSelecionada = jTableDados.getSelectedRow();
        Venda ven = listVenda.get(linhaSelecionada);
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(ven);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, a Ordem de Serviço não foi cadastrada!\nErro: " + e);
            if(!entityManager.getTransaction().isActive())
                entityManager.getTransaction().begin();
            entityManager.getTransaction().rollback();
        }
    }
    
    private int validaCampos(){
        if(jTextFieldCodPeca.getText().equals("") || jFormattedTextFieldDataEntrada.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldCodPeca.requestFocus();
            jFormattedTextFieldDataEntrada.setBackground(Color.CYAN);
            jTextFieldCodPeca.setBackground(Color.CYAN);
            if(!jTextFieldCodPeca.getText().equals(""))
                jTextFieldCodPeca.setBackground(Color.WHITE);
            if(!jFormattedTextFieldDataEntrada.getText().equals(""))
                jFormattedTextFieldDataEntrada.setBackground(Color.WHITE);
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
        if(!jTextFieldCodPeca.getText().equals("") && (!jLabelEstado.equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if(cancelar == 0) {
                jButtonCancelarOSActionPerformed(evt);
            }
        } else {
            jButtonCancelarOSActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma OS para alterar!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldCodPeca.requestFocus();
            jButtonFinalizarOS.setEnabled(true);
            jButtonCancelarOS.setEnabled(true);
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando os dados da OS...");
            
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
            
            for(int i = 0 ; i < listServicosDaVenda.size() ; i++){       
                ServicoDaVenda ser = new ServicoDaVenda();
                ser.setIdServicosVenda(listServicosDaVenda.get(i).getIdServicosVenda());
                ser.setSveValorServico(listServicosDaVenda.get(i).getSveValorServico());
                entityManager.getTransaction().begin();
                ser = entityManager.merge(ser);
                entityManager.remove(ser);
                entityManager.getTransaction().commit();
            }            
            
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma OS para excluir!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse Orçamento? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0 ){
                int linhaSelecionada = jTableDados.getSelectedRow();
                Venda ven = listVenda.get(linhaSelecionada);
                removerVenda(ven);
            }
            jTableDados.clearSelection();
            limparCampos();
            atualizaTabela();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        if(!jLabelEstado.getText().equals("Início")){ //se tiver iniciado a OS
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar esta OS?\nOs dados serão perdidos!", "Atenção", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(confirma == 0){
                int linhaSelecionada = jTableDados.getSelectedRow();
                Venda ven = listVenda.get(linhaSelecionada);
                removerVenda(ven);
                jTableDados.clearSelection();
                jButtonNovo.setEnabled(true);
                dispose();
            }
        } else { //se não tiver iniciado a OS
            dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed
    
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
    
    
    
    private void jButtonBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProdutoActionPerformed
        JFrameBuscaProduto buscaProduto = new JFrameBuscaProduto();
        buscaProduto.setLocationRelativeTo(this);
        buscaProduto.setVisible(true);
        if(!buscaProduto.getProduto().equals("")){
            if(buscaProduto.getQuantidade() > 0){
                jTextFieldCodPeca.setText(buscaProduto.getCodProduto());
                jFormattedTextFieldPreco.setValue(buscaProduto.getPreco());
                jFormattedTextFieldPrecoPrazo.setValue(buscaProduto.getPreco());
                jTextFieldQuantidade.setText("1");
                int sel = buscaProduto.getIndice();
                jListProdutos.setSelectionInterval(sel, sel);
                if(sel > -1){
                    jButtonAdicionar.setEnabled(true);
                } else {
                    jTextFieldCodPeca.setText("");
                    jTextFieldPeca.setText("");
                    jTextFieldQuantidade.setText("");
                }
                jListProdutos.setSelectedIndex(0);
                jListProdutos.setEnabled(false);
                jButtonLimparProduto.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Produto esgotado!");
            }
        }        
    }//GEN-LAST:event_jButtonBuscaProdutoActionPerformed

    private void jButtonBuscaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaServicoActionPerformed
        JFrameBuscaServico buscaServico = new JFrameBuscaServico();
        buscaServico.setLocationRelativeTo(this);
        buscaServico.setVisible(true);
        if(!buscaServico.getDescricao().equals("")){
            jTextFieldCodServico.setText(String.valueOf(buscaServico.getIdServico()));
            jFormattedTextFieldPrecoServico.setValue(buscaServico.getValor());
            jFormattedTextFieldPrecoServicoPrazo.setValue(buscaServico.getValor());
            int sel = buscaServico.getIndice();
            jListServicos.setSelectionInterval(sel, sel);
            if(sel > -1){
                jButtonAdicionarSer.setEnabled(true);
            } else {
                jTextFieldCodServico.setText("");
                jTextFieldServico.setText("");
            }
            jListServicos.setSelectedIndex(0);
            jListServicos.setEnabled(false);
            jButtonLimparServico.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonBuscaServicoActionPerformed

    private void jTextFieldCodPecaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodPecaCaretUpdate
        if(!jTextFieldCodPeca.getText().equals("")){
            buscaProduto();
        }
    }//GEN-LAST:event_jTextFieldCodPecaCaretUpdate

    private int validaItem(){
        if((jFormattedTextFieldPreco.getText().equals("")) || jFormattedTextFieldPrecoPrazo.getText().equals("") ||
                jTextFieldQuantidade.getText().equals("") || jTextFieldCodPeca.getText().equals("")){
            jFormattedTextFieldPreco.setBackground(Color.CYAN);
            jFormattedTextFieldPrecoPrazo.setBackground(Color.CYAN);
            jTextFieldQuantidade.setBackground(Color.CYAN);
            jTextFieldCodPeca.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldQuantidade.requestFocus();
            if(!jFormattedTextFieldPreco.getText().equals(""))
                jFormattedTextFieldPreco.setBackground(Color.WHITE);
            if(!jFormattedTextFieldPrecoPrazo.getText().equals(""))
                jFormattedTextFieldPrecoPrazo.setBackground(Color.WHITE);
            if(!jTextFieldQuantidade.getText().equals(""))
                jTextFieldQuantidade.setBackground(Color.WHITE);
            if(!jTextFieldCodPeca.getText().equals(""))
                jTextFieldCodPeca.setBackground(Color.WHITE);
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
                - listItensDaVenda.indexOf(jListProdutos.getSelectedIndex())) > 1){
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
    
    private int validaServico(){
        if((jFormattedTextFieldPrecoServico.getText().equals("")) || jFormattedTextFieldPrecoServicoPrazo.getText().equals("") ||
                jTextFieldCodServico.getText().equals("")){
            jFormattedTextFieldPrecoServico.setBackground(Color.CYAN);
            jFormattedTextFieldPrecoServicoPrazo.setBackground(Color.CYAN);
            jTextFieldCodServico.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            if(!jFormattedTextFieldPrecoServico.getText().equals(""))
                jFormattedTextFieldPrecoServico.setBackground(Color.WHITE);
            if(!jFormattedTextFieldPrecoServicoPrazo.getText().equals(""))
                jFormattedTextFieldPrecoServicoPrazo.setBackground(Color.WHITE);
            if(!jTextFieldCodServico.getText().equals(""))
                jTextFieldCodServico.setBackground(Color.WHITE);
            return 0;
        }
        //verifica se o serviço já foi adicionado
        int selecionado = jListServicos.getSelectedValue().getIdServico();
        int i = 0;
        if(listServicosDaVenda.size() > 0){            
            for(i = 0; i < listServicosDaVenda.size(); i++){
                if(listServicosDaVenda.get(i).getServico().getIdServico() == selecionado){ 
                    JOptionPane.showMessageDialog(null, "Serviço já adicionado!");
                    return 0;
                }                 
            }
            
        }
        return 1000;
    }
    
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        int valida = validaItem();
        if(valida == 1000 && (Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) > 0)){
            Double preco = Double.parseDouble(String.valueOf(jFormattedTextFieldPreco.getValue()));
            int quant = Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText()));
            Double total = preco * quant;
            adicionaItem(preco, quant, total);
            jButtonLimparProduto.setEnabled(false);
        } else if(valida < 1000 && (Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())) > 0)){
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
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void adicionaItem(double preco, int quant, double total){
        ItemDaVenda itv = new ItemDaVenda(preco, quant, total, "vi", (Produto)jListProdutos.getSelectedValue());
        listItensDaVenda.add(itv);                      
        jListProdutos.setEnabled(true);
        listaTodosProdutos();
        //jTextFieldDesconto.setText("0.00");
        calculaTotais();
        limparItem();
        verificaTabelaItens();
    }
    
    private void adicionaServico(double preco){
        ServicoDaVenda sve = new ServicoDaVenda(preco, (Servico)jListServicos.getSelectedValue());
        listServicosDaVenda.add(sve);
        jListServicos.setEnabled(true);
        listaTodosServicos();
        calculaTotais();
        limparServico();
        verificaTabelaServicos();
    }
    
    private void verificaTabelaItens(){
        if(listItensDaVenda.size()>0){
            jTextFieldDesconto.setEnabled(true);
            jButtonFinalizarOS.setEnabled(true);
            jButtonCancelarOS.setEnabled(true);
        } else {
            jTextFieldDesconto.setEnabled(false);
            jButtonFinalizarOS.setEnabled(false);
            jButtonCancelarOS.setEnabled(false);
        }
    }
    
    private void verificaTabelaServicos(){
        if(listServicosDaVenda.size()>0){
            jTextFieldDesconto.setEnabled(true);
            jButtonCancelarOS.setEnabled(true);
            jButtonFinalizarOS.setEnabled(true);
        } else {
            jTextFieldDesconto.setEnabled(false);
            jButtonCancelarOS.setEnabled(false);
            jButtonFinalizarOS.setEnabled(false);
        }
    }

    private void limparItem(){ //limpa campos após adicionar um item à venda
        jButtonAdicionar.setEnabled(false);
        jTextFieldCodPeca.setText("");
        jTextFieldPeca.setText("");
        jTextFieldQuantidade.setText("");
        jFormattedTextFieldPreco.setText("");
        jFormattedTextFieldPrecoPrazo.setText("");
        //jLabelFoto.setIcon(null);        
        jFormattedTextFieldPreco.setBackground(Color.WHITE);            
        jFormattedTextFieldPrecoPrazo.setBackground(Color.WHITE);            
        jTextFieldQuantidade.setBackground(Color.WHITE);            
        jTextFieldCodPeca.setBackground(Color.WHITE);
    }
    
    private void limparServico(){
        jButtonAdicionarSer.setEnabled(false);
        jTextFieldCodServico.setText("");
        jTextFieldServico.setText("");
        jFormattedTextFieldPrecoServico.setText("");
        jFormattedTextFieldPrecoServicoPrazo.setText("");
        jFormattedTextFieldPrecoServico.setBackground(Color.WHITE);
        jFormattedTextFieldPrecoServicoPrazo.setBackground(Color.WHITE);
        jTextFieldCodServico.setBackground(Color.WHITE);
    }
    
     private void calculaTotais(){        
        //subtotal
        double subtotalitens = 0.00;
        double subtotalservs = 0.00;
        int tamanhoitens = listItensDaVenda.size();
        int tamanhoservs = listServicosDaVenda.size();
        for(int i = 0; i < tamanhoitens ; i++){
            subtotalitens += Double.parseDouble(String.valueOf(jTableItensDaOS.getValueAt(i, 2)));
        }
        for(int i = 0; i < tamanhoservs ; i++){
            subtotalservs += Double.parseDouble(String.valueOf(jTableServicosDaOS.getValueAt(i, 1)));
        }
        if(listItensDaVenda.isEmpty()){
            subtotalitens = 0.00;
        }
        if(listServicosDaVenda.isEmpty()){
            subtotalservs = 0.00;
        }
        jLabelSubtotal.setText(String.valueOf(subtotalitens + subtotalservs));
        double totalcompra = 0.00;
        totalcompra = subtotalitens + subtotalservs - Double.parseDouble(String.valueOf(jTextFieldDesconto.getText()));
        jLabelTotal.setText(String.valueOf(totalcompra));
    }
    
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
            int linha = jTableDados.getSelectedRow();
            int codvenda = Integer.parseInt(String.valueOf(jTableDados.getValueAt(linha, 0)));
            //carregar os itens da venda
            String ejbql = "from ItemDaVenda itv where itv.venda.idVenda = " + codvenda;
            queryItensVenda = entityManager.createQuery(ejbql);
            listItensDaVenda.clear();
            listItensDaVenda.addAll(queryItensVenda.getResultList());
            //carregar os serviços da venda
            ejbql = "from ServicoDaVenda sve where sve.venda.idVenda = " + codvenda;
            queryServicosVenda = entityManager.createQuery(ejbql);
            listServicosDaVenda.clear();
            listServicosDaVenda.addAll(queryServicosVenda.getResultList());
            //carregar o veículo
            ejbql = "from Veiculo v join Venda ve on ve.veiculo.idVeiculo = v.idVeiculo "
                    + "where ve.veiculo.veiPlaca = '" + String.valueOf(jTableDados.getValueAt(linha, 4)) + "'";
            queryVeiculo = entityManager.createQuery(ejbql);
            listVeiculo.clear();
            listVeiculo.addAll(queryVeiculo.getResultList());
            jTextFieldCodVeiculo.setText(String.valueOf(listVeiculo.get(0).getIdVeiculo()));
            //carregar o cliente
            ejbql = "from Cliente c join Venda v on v.cliente.idCliente = c.idCliente "
                    + "where v.cliente.cliNome = '" + String.valueOf(jTableDados.getValueAt(linha, 1)) + "'";
            queryCliente = entityManager.createQuery(ejbql);
            listCliente.clear();
            listCliente.addAll(queryCliente.getResultList());
            jTextFieldCodCliente.setText(String.valueOf(listCliente.get(0).getIdCliente()));
            //ativar os controles caso seja orçamento
            if(String.valueOf(jTableDados.getValueAt(linha, 6)).equals("true")){
                jButtonAlterar.setEnabled(true);
                jButtonExcluir.setEnabled(true);
            //desativar os controles caso seja ordem de serviço
            } else {
                jButtonAlterar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
            }
                
            
        }
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR a operação atual!");
    }//GEN-LAST:event_jTableDadosMouseReleased

    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Código")){
            String caracteres = "0987654321";
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

    private void jTextFieldPecaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPecaCaretUpdate
        if(!jTextFieldCodPeca.getText().equals("")){
            //jLabelFoto.setIcon(new ImageIcon(String.valueOf(listProduto.get(0).getProFoto())));
            //jLabelFoto.setPreferredSize(new Dimension(130, 130));
        }
    }//GEN-LAST:event_jTextFieldPecaCaretUpdate

    private void jButtonFinalizarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarOSActionPerformed
        if(!jRadioButtonOrcamento.isSelected() && (!jRadioButtonOS.isSelected())){
            JOptionPane.showMessageDialog(null, "Selecione Ordem de Serviço ou Orçamento para continuar!", "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            int linhaSelecionada = jTableDados.getSelectedRow();
            Venda ven = listVenda.get(linhaSelecionada);
            ven.setCliente((Cliente)listCliente.get(0));
            ven.setVeiculo((Veiculo)listVeiculo.get(0));
            ven.setUsuario((Usuario)listUsuario.get(0));
            //gravar ordem de serviço na tabela venda (independente de orçamento ou OS)
            //o campo ven_valortotal não é considerado em relatórios de movimento ou contas a receber
            try {
               entityManager.getTransaction().begin();
               ven = entityManager.merge(ven);
               entityManager.persist(ven);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Nova Ordem de Serviço cadastrada com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a Ordem de Serviço não foi concluída!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, a Ordem de Serviço não foi concluída!");
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
            }
            //persistir itens da ordem de serviço na tabela item_da_venda (independente de orçamento ou OS)
            //para relatório de vendas, no caso de orçamento, não devem ser computados os itens nem os valores
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

            //persistir serviços da ordem de serviço na tabela servico_da_venda (independente de orçamento ou OS)
            //para relatório de serviços, no caso de orçamento, não devem ser computados os serviços nem os valores
            tam = listServicosDaVenda.size();
            for(int i = 0 ; i < tam ; i++){
                ServicoDaVenda sve = new ServicoDaVenda();
                sve.adicionarVenda(ven);
                sve.setSveValorServico(listServicosDaVenda.get(i).getSveValorServico());
                sve.setServico(listServicosDaVenda.get(i).getServico());

                entityManager.getTransaction().begin();
                entityManager.persist(sve);
                entityManager.getTransaction().commit();
            }     

            jTableDados.setEnabled(true);
            jTextFieldCampoPesquisa.setEnabled(true);
            jLabelEstado.setText("Início");

            //só será finalizado caso seja OS
            int status = 0;
            if(jRadioButtonOS.isSelected()){ //caso seja OS
                JFrameFinalizaVenda finaliza = new JFrameFinalizaVenda(ven);
                finaliza.setLocationRelativeTo(this);
                finaliza.setVisible(true);
                status = finaliza.getStatus();
            } else { //caso seja orçamento
                JFrameFinalizaOrcamento finalizaorc = new JFrameFinalizaOrcamento(ven);
                finalizaorc.setLocationRelativeTo(this);
                finalizaorc.setVisible(true);
                status = finalizaorc.getStatus();
            }
            
            //RETORNO AQUI

            if(status == 1){ // concluiu o pagamento da venda/os
                //baixa no estoque   
                buttonGroupOrcamentoOS.setSelected(jRadioButtonOS.getModel(), true);                
                
                ven.setVenOrcamento(jRadioButtonOrcamento.isSelected());
                try {
                    entityManager.getTransaction().begin();
                    ven = entityManager.merge(ven);
                    entityManager.persist(ven);
                    entityManager.getTransaction().commit();
                } catch (Exception e) {
                    //
                }                
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
                int confirma = JOptionPane.showConfirmDialog(null, "Ordem de Serviço Concluída!\n Deseja abrir uma nova OS?", 
                        "O.S. Concluída", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
                if (confirma == 0){
                    jButtonNovoActionPerformed(evt);
                    listaTodosProdutos();
                } else {
                    dispose();
                }            
            } else if(status == 0) { //se a Ordem de Serviço não foi finalizada na tela FinalizaVenda
                JOptionPane.showMessageDialog(null, "A Ordem de Serviço não foi concluída!");
                removerVenda(ven);
                atualizaTabela();
                dispose();
            } else if(status == 2) { //se escolheu Salvar Orçamento // os itens não serão decrementados do estoque
                int confirma = JOptionPane.showConfirmDialog(null, "Orçamento Concluído!\n Deseja abrir uma nova OS ou Orçamento?", 
                        "Orçamento Concluído", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
                if (confirma == 0){
                    jButtonNovoActionPerformed(evt);
                    listaTodosProdutos();
                } else {
                    dispose();
                }
            } else if(status == 3){ //voltar / alterar
                jLabelEstado.setText("Inserção");
                removerItensServicos(ven);
            }
        }
    }//GEN-LAST:event_jButtonFinalizarOSActionPerformed

    private void removerItensServicos(Venda ven){
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
        
        String ejbql2 = "from ServicoDaVenda s where s.venda.idVenda = " + ven.getIdVenda();
        queryServicosVenda = entityManager.createQuery(ejbql2);
        listServicosDaVenda.clear();
        listServicosDaVenda.addAll(queryServicosVenda.getResultList());        
        for(int i = 0 ; i < listServicosDaVenda.size() ; i++){       
            ServicoDaVenda ser = new ServicoDaVenda();
            ser.setIdServicosVenda(listServicosDaVenda.get(i).getIdServicosVenda());
            ser.setSveValorServico(listServicosDaVenda.get(i).getSveValorServico());
            ser.setServico(listServicosDaVenda.get(i).getServico());
            entityManager.getTransaction().begin();
            ser = entityManager.merge(ser);
            entityManager.remove(ser);
            entityManager.getTransaction().commit();
        } 
    }
    
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
        
        String ejbql2 = "from ServicoDaVenda s where s.venda.idVenda = " + ven.getIdVenda();
        queryServicosVenda = entityManager.createQuery(ejbql2);
        listServicosDaVenda.clear();
        listServicosDaVenda.addAll(queryServicosVenda.getResultList());        
        for(int i = 0 ; i < listServicosDaVenda.size() ; i++){       
            ServicoDaVenda ser = new ServicoDaVenda();
            ser.setIdServicosVenda(listServicosDaVenda.get(i).getIdServicosVenda());
            ser.setSveValorServico(listServicosDaVenda.get(i).getSveValorServico());
            entityManager.getTransaction().begin();
            ser = entityManager.merge(ser);
            entityManager.remove(ser);
            entityManager.getTransaction().commit();
        } 
        
        entityManager.getTransaction().begin();
        ven = entityManager.merge(ven);
        entityManager.remove(ven);
        entityManager.getTransaction().commit();
    } 
    
    private void jListProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProdutosMouseReleased
        if(jListProdutos.isEnabled() && listProduto.size()>0){
            int prodselec = jListProdutos.getSelectedIndex();
            jTextFieldCodPeca.setText(String.valueOf(jListProdutos.getSelectedValue().getProCodigo()));
            if(prodselec > -1){
                jButtonAdicionar.setEnabled(true);
                jButtonLimparProduto.setEnabled(true);
            } else {
                jTextFieldCodPeca.setText("");
                jTextFieldPeca.setText("");
                jTextFieldQuantidade.setText("");
            }

            listaTodosProdutos();
            jListProdutos.setSelectionInterval(prodselec, prodselec);
            jFormattedTextFieldPreco.setValue(jListProdutos.getSelectedValue().getProPrecoVenda());
            jFormattedTextFieldPrecoPrazo.setValue(jListProdutos.getSelectedValue().getProPrecoVenda());
            jTextFieldQuantidade.setText("1");
        }
    }//GEN-LAST:event_jListProdutosMouseReleased

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        if(jTableItensDaOS.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um item ao lado para remover!");
            jButtonRemover.setEnabled(false);
        } else {
            listItensDaVenda.remove(jTableItensDaOS.getSelectedRow());
            jButtonRemover.setEnabled(false);
            calculaTotais();
            verificaTabelaItens();
            verificaTabelaServicos();
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jTableItensDaOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensDaOSMouseReleased
        if(jTableItensDaOS.getSelectedRow()>-1){
            if(jLabelEstado.getText().equals("Inserção"))
                jButtonRemover.setEnabled(true);
        } else {
            if(jLabelEstado.getText().equals("Inserção"))
                jButtonRemover.setEnabled(false);
        }
    }//GEN-LAST:event_jTableItensDaOSMouseReleased

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

    private void jTextFieldCodServicoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodServicoCaretUpdate
        if(!jTextFieldCodServico.getText().equals("")){
            buscaServico();
        }
    }//GEN-LAST:event_jTextFieldCodServicoCaretUpdate

    private void jListServicosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListServicosMouseReleased
        if(jListServicos.isEnabled() && listServico.size()>0){
            int servselec = jListServicos.getSelectedIndex();
            jTextFieldCodServico.setText(String.valueOf(jListServicos.getSelectedValue().getIdServico()));
            if(servselec > -1){
                jButtonAdicionarSer.setEnabled(true);
                jButtonLimparServico.setEnabled(true);
            } else {
                jTextFieldCodServico.setText("");
                jTextFieldServico.setText("");
            }            
            listaTodosServicos();
            jListServicos.setSelectionInterval(servselec, servselec);
            jFormattedTextFieldPrecoServico.setValue(jListServicos.getSelectedValue().getSerValor());
            jFormattedTextFieldPrecoServicoPrazo.setValue(jListServicos.getSelectedValue().getSerValor());
        }
    }//GEN-LAST:event_jListServicosMouseReleased

    private void jButtonAdicionarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarSerActionPerformed
        int valida = validaServico();
        if(valida == 1000){
            Double preco = Double.parseDouble(String.valueOf(jFormattedTextFieldPrecoServico.getValue()));
            int quant = 1;
            Double total = preco * quant;
            adicionaServico(total);
            jButtonLimparServico.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonAdicionarSerActionPerformed

    private void jTextFieldDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusGained
        if(jTextFieldDesconto.getText().equals("0.00") || jTextFieldDesconto.getText().equals("0"))
        jTextFieldDesconto.setText("");
    }//GEN-LAST:event_jTextFieldDescontoFocusGained

    private void jTextFieldDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusLost
        if(jTextFieldDesconto.getText().equals("") || jTextFieldDesconto.getText().equals("0"))
            jTextFieldDesconto.setText("0.00");
        calculaTotais();
    }//GEN-LAST:event_jTextFieldDescontoFocusLost

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

    private void jTableServicosDaOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServicosDaOSMouseReleased
        if(jTableServicosDaOS.getSelectedRow()>-1){
            if(jLabelEstado.getText().equals("Inserção"))
                jButtonRemoverSer.setEnabled(true);
        } else {
            if(jLabelEstado.getText().equals("Inserção"))
                jButtonRemoverSer.setEnabled(false);
        }
    }//GEN-LAST:event_jTableServicosDaOSMouseReleased

    private void jButtonRemoverSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverSerActionPerformed
        if(jTableServicosDaOS.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um item ao lado para remover!");
            jButtonRemoverSer.setEnabled(false);
        } else {
            listServicosDaVenda.remove(jTableServicosDaOS.getSelectedRow());
            jButtonRemoverSer.setEnabled(false);
            calculaTotais();
            verificaTabelaServicos();
            verificaTabelaItens();
        }
    }//GEN-LAST:event_jButtonRemoverSerActionPerformed

    private void jButtonBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVeiculoActionPerformed
        JFrameBuscaVeiculo buscaVeiculo = new JFrameBuscaVeiculo();
        buscaVeiculo.setLocationRelativeTo(this);
        buscaVeiculo.setVisible(true);
        if(!(String.valueOf(buscaVeiculo.getCodVeiculo()).equals("0"))){
            jTextFieldCodVeiculo.setText(String.valueOf(buscaVeiculo.getCodVeiculo()));
            jTextFieldCodCliente.setText(String.valueOf(buscaVeiculo.getCodCliente()));
            if(!jTextFieldCodVeiculo.getText().equals("")){
                statusInicial(false);
                jLabelEstado.setText("Inserção");
            }
        }
    }//GEN-LAST:event_jButtonBuscarVeiculoActionPerformed

    private void jTextFieldCodVeiculoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodVeiculoCaretUpdate
        if(!(jTextFieldCodVeiculo.getText().equals("")) && !(jTextFieldCodVeiculo.getText().isEmpty())){
            buscaVeiculo();
        }
    }//GEN-LAST:event_jTextFieldCodVeiculoCaretUpdate

    private void jButtonCancelarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarOSActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar esta O.S.?", "Atenção", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirma == 0){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Venda ven = listVenda.get(linhaSelecionada);
            removerVenda(ven);
            jTableDados.clearSelection();
            atualizaTabela();
            verificaTabelaItens();
            calculaTotais();
            statusInicial(true);
            atualizaControles();
            jButtonNovo.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonCancelarOSActionPerformed

    private void jRadioButtonOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOSMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOSMouseReleased

    private void jButtonLimparServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparServicoActionPerformed
        limparServico();
        jListServicos.setEnabled(true);
        listaTodosServicos();
        jButtonLimparServico.setEnabled(false);
        
    }//GEN-LAST:event_jButtonLimparServicoActionPerformed

    private void jButtonLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparProdutoActionPerformed
        limparItem();
        jListProdutos.setEnabled(true);
        listaTodosProdutos();
        jButtonLimparProduto.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparProdutoActionPerformed
    
    private void listaTodosProdutos(){
        entityManager.clear();
        String ejbql2 = "from Produto p where p.proEstoqueAtual > 0";
        ejbql2 +=" order by p.proDescricao";
        queryProduto = entityManager.createQuery(ejbql2);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());        
    }
    
    private void listaTodosServicos(){
        entityManager.clear();
        String ejbql3 = "from Servico s order by s.serDescricao";
        queryServico = entityManager.createQuery(ejbql3);
        listServico.clear();
        listServico.addAll(queryServico.getResultList());
    }
    
    private void buscaProduto(){
        entityManager.clear();
        String ejbql2 = "from Produto p ";
        String codigo = "";
        codigo = "p.proCodigo";
        String filtro = jTextFieldCodPeca.getText();
        if(!filtro.equals("")){
            ejbql2 += "where " + codigo + " = '" + filtro + "'";
        }
        ejbql2 +=" order by " + codigo;
        queryProduto = entityManager.createQuery(ejbql2);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());
        if(!jTextFieldCodPeca.getText().equals("") && listProduto.size() > 0){
            jTextFieldPeca.setText(listProduto.toString());
        } else {
            int confirma = JOptionPane.showConfirmDialog(null, "Produto não cadastrado! Deseja cadastrar agora? ");
            if(confirma == 0){
                JFrameProduto cadProduto = new JFrameProduto();
                cadProduto.setLocationRelativeTo(this);
                cadProduto.setVisible(true);
            }
        }
    }
    
    private void buscaServico(){
        entityManager.clear();
        String ejbql3 = "from Servico s ";
        String codigo = "";
        codigo = "s.idServico";
        String filtro = jTextFieldCodServico.getText();
        if(!filtro.equals("")){
            ejbql3 += "where " + codigo + " = '" + filtro + "'";
        }
        ejbql3 +=" order by " + codigo;
        queryServico = entityManager.createQuery(ejbql3);
        listServico.clear();
        listServico.addAll(queryServico.getResultList());
        if(!jTextFieldCodServico.getText().equals("") && listServico.size() > 0){
            jTextFieldServico.setText(listServico.toString());
        } else {
            int confirma = JOptionPane.showConfirmDialog(null, "Serviço não cadastrado! Deseja cadastrar agora? ");
            if(confirma == 0){
                JFrameServico cadServico = new JFrameServico();
                cadServico.setLocationRelativeTo(this);
                cadServico.setVisible(true);
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
    
    private void buscaVeiculo(){
        entityManager.clear();
        String ejbql4 = "from Veiculo v ";
        String codigo = "";
        codigo = "v.idVeiculo";
        String filtro = jTextFieldCodVeiculo.getText();
        if(!filtro.equals("")){
            ejbql4 += "where " + codigo + " = " + filtro;
        }
        ejbql4 += " order by " + codigo;
        queryVeiculo = entityManager.createQuery(ejbql4);
        listVeiculo.clear();
        listVeiculo.addAll(queryVeiculo.getResultList());
        if(!jTextFieldCodVeiculo.getText().equals("") && listVeiculo.size() > 0){
            jTextFieldPlacaVeiculo.setText(listVeiculo.get(0).getVeiPlaca().toString());
            jTextFieldCorVeiculo.setText(listVeiculo.get(0).getVeiCor().toString());
            jTextFieldModeloVeiculo.setText(listVeiculo.get(0).getModeloMoto().toString());
        } else { 
            int confirma = JOptionPane.showConfirmDialog(null, "Veículo não cadastrado! Deseja cadastrar agora? ");
            if(confirma == 0){
                JFrameVeiculo cadVeiculo = new JFrameVeiculo();
                cadVeiculo.setLocationRelativeTo(this);
                cadVeiculo.setVisible(true);
            }
        }
    }
    
    
    //função que controla o estado dos campos de entrada de texto 
    private void statusInicial(boolean status){
        jLabelEstado.setText("Início");
        jTextFieldCodCliente.setEnabled(!status);
        jTextFieldCliente.setEnabled(!status);
        jTextFieldCodPeca.setEnabled(!status);
        jTextFieldPeca.setEnabled(!status);
        jTextFieldCodServico.setEnabled(!status);
        jTextFieldServico.setEnabled(!status);
        jTextFieldCodVeiculo.setEnabled(!status);
        jTextFieldPlacaVeiculo.setEnabled(!status);
        jTextFieldCorVeiculo.setEnabled(!status);
        jTextFieldModeloVeiculo.setEnabled(!status);
        jFormattedTextFieldPreco.setEnabled(!status);
        jFormattedTextFieldPrecoPrazo.setEnabled(!status);
        jFormattedTextFieldPrecoServico.setEnabled(!status);
        jFormattedTextFieldPrecoServicoPrazo.setEnabled(!status);
        jTextFieldQuantidade.setEnabled(!status);
        jFormattedTextFieldDataEntrada.setEnabled(!status);
        //jButtonBuscarCliente.setEnabled(!status);
        jButtonBuscarVeiculo.setEnabled(!status);
        jButtonBuscaProduto.setEnabled(!status);
        jButtonBuscaServico.setEnabled(!status);
        jListProdutos.setEnabled(!status);
        jListServicos.setEnabled(!status);
        jTableServicosDaOS.setEnabled(!status);
        jTableItensDaOS.setEnabled(!status);
        jTableDados.setEnabled(status);
    }
    
    //função que apaga texto digitado nos campos de entrada de texto
    private void limparCampos(){
        jTextFieldCodCliente.setText("");
        jTextFieldCliente.setText("");
        jTextFieldCodPeca.setText("");
        jTextFieldPeca.setText("");
        jTextFieldCodServico.setText("");
        jTextFieldServico.setText("");
        jTextFieldCodVeiculo.setText("");
        jTextFieldPlacaVeiculo.setText("");
        jTextFieldCorVeiculo.setText("");
        jTextFieldModeloVeiculo.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldPreco.setValue(0.00);
        jTextFieldCodPeca.setBackground(Color.WHITE);
        jFormattedTextFieldDataEntrada.setBackground(Color.WHITE);
        listCliente.clear();
        //listItemSelecionado.clear();
        jTableDados.clearSelection();
        listItensDaVenda.clear();
        listServicosDaVenda.clear();
        buttonGroupOrcamentoOS.clearSelection();
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        //jComboBoxPesquisaStatus.setEnabled(status);
        jComboBoxTipoPesquisa.setEnabled(status);
        jButtonAlterar.setEnabled(status);
        jButtonExcluir.setEnabled(status);
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
            ejbql = "from Venda v WHERE v.venValorTotal <> 0 AND v.veiculo.veiPlaca <> '' order by v.cliente.cliNome asc";
            campoPesquisa = "v.cliente.cliNome";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql = "from Venda v join v.cliente c where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
                ejbql += " AND v.venValorTotal <> 0 AND v.veiculo.veiPlaca <> '' order by " + campoPesquisa + " asc";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            ejbql = "from Venda v WHERE v.venValorTotal <> AND v.veiculo.veiPlaca <> '' 0 order by v.idVenda asc";
            campoPesquisa = "v.idVenda";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql = "from Venda v WHERE v.venValorTotal <> 0 ";
                    ejbql += "AND " + campoPesquisa + " = " + filtro + " 0 AND v.veiculo.veiPlaca <> '' order by " + campoPesquisa + " asc";;
                }
            }
        }
        queryVenda = entityManager.createQuery(ejbql);
        listVenda.clear();
        listVenda.addAll(queryVenda.getResultList());
        int linha = listVenda.size() - 1;
        if(listVenda.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        } else {
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            if(!jLabelEstado.getText().equals("Início"))
                jLabelMensagem.setText("Dados solicitados não foram localizados!");
        }
        if(listVenda.size() == 1){
            //jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        } else
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            //jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            //jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOrcamentoOS;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAdicionarSer;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscaProduto;
    private javax.swing.JButton jButtonBuscaServico;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarVeiculo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarOS;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFinalizarOS;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonLimparProduto;
    private javax.swing.JButton jButtonLimparServico;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonRemoverSer;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoPrazo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoServico;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoServicoPrazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCliente;
    private javax.swing.JLabel jLabelLabelCodCliente;
    private javax.swing.JLabel jLabelLabelCodPeca;
    private javax.swing.JLabel jLabelLabelCodServico;
    private javax.swing.JLabel jLabelLabelDataEntrada;
    private javax.swing.JLabel jLabelLabelDesconto;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelLabelPeca;
    private javax.swing.JLabel jLabelLabelPrecoPrazo;
    private javax.swing.JLabel jLabelLabelPrecoServicoPrazo;
    private javax.swing.JLabel jLabelLabelQuantidade;
    private javax.swing.JLabel jLabelLabelServico;
    private javax.swing.JLabel jLabelLabelSubtotal;
    private javax.swing.JLabel jLabelLabelTituloOS;
    private javax.swing.JLabel jLabelLabelTotal;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelPrecoServico;
    private javax.swing.JLabel jLabelPrecoVista;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<Produto> jListProdutos;
    private javax.swing.JList<Servico> jListServicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
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
    private javax.swing.JPanel jPanelBuscas;
    private javax.swing.JPanel jPanelBuscas1;
    private javax.swing.JPanel jPanelDadosCliente;
    private javax.swing.JPanel jPanelDadosEntradaOS;
    private javax.swing.JPanel jPanelMaoObraServicos;
    private javax.swing.JPanel jPanelPecas;
    private javax.swing.JPanel jPanelPesquisarOS;
    private javax.swing.JPanel jPanelValores;
    private javax.swing.JPanel jPanelValoresOS;
    private javax.swing.JRadioButton jRadioButtonOS;
    private javax.swing.JRadioButton jRadioButtonOrcamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneDados;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTable jTableItensDaOS;
    private javax.swing.JTable jTableServicosDaOS;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldCodPeca;
    private javax.swing.JTextField jTextFieldCodServico;
    private javax.swing.JTextField jTextFieldCodVeiculo;
    private javax.swing.JTextField jTextFieldCorVeiculo;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldModeloVeiculo;
    private javax.swing.JTextField jTextFieldPeca;
    private javax.swing.JTextField jTextFieldPlacaVeiculo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldServico;
    private javax.swing.JToolBar jToolBarComandos;
    private java.util.List<Cliente> listCliente;
    private java.util.List<ItemDaVenda> listItensDaVenda;
    private java.util.List<Produto> listProduto;
    private java.util.List<Servico> listServico;
    private java.util.List<model.ServicoDaVenda> listServicosDaVenda;
    private java.util.List<Usuario> listUsuario;
    private java.util.List<Veiculo> listVeiculo;
    private java.util.List<Venda> listVenda;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryItensVenda;
    private javax.persistence.Query queryProduto;
    private javax.persistence.Query queryServico;
    private javax.persistence.Query queryServicosVenda;
    private javax.persistence.Query queryUsuario;
    private javax.persistence.Query queryVeiculo;
    private javax.persistence.Query queryVenda;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
