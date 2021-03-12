package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Movimento;
import model.Parcela;
import model.Venda;

public class JFrameReceber extends javax.swing.JDialog {
    
    double valorParcela = 0.0;
    double subtotal = 0.0;
    double juros = 0.0;
    double valorJuros = 0.0;
    double descontos = 0.0;
    double valorDescontos = 0.0;
    double valor = 0.0;

    public JFrameReceber() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaTabelas();
        atualizaControles();        
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryVendas = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Venda v order by v.idVenda");
        listVendas = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVendas.getResultList());
        queryParcelasDaVenda = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Parcela p order by p.parParcela");
        listParcelasDaVenda = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryParcelasDaVenda.getResultList());
        queryVendaSelecionada = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Venda v order by v.idVenda");
        listVendaSelecionada = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVendaSelecionada.getResultList());
        queryVendasDoCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Venda v order by v.idVenda");
        listVendasDoCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVendasDoCliente.getResultList());
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
        jLabelLabelTituloReceber = new javax.swing.JLabel();
        jPanelValores = new javax.swing.JPanel();
        jButtonReceber = new javax.swing.JButton();
        jButtonCancelarRecebimento = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabelLabelSubtotal = new javax.swing.JLabel();
        jLabelSubtotal = new javax.swing.JLabel();
        jLabelLabelTotal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldTotal = new javax.swing.JFormattedTextField();
        jLabelRS = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldValorJuros = new javax.swing.JTextField();
        jLabelLabelJuros = new javax.swing.JLabel();
        jTextFieldJuros = new javax.swing.JTextField();
        jLabelLabelPercJuros = new javax.swing.JLabel();
        jButtonAplicarJuros = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelLabelDesconto = new javax.swing.JLabel();
        jTextFieldValorDesconto = new javax.swing.JTextField();
        jLabelLabelPercDesc = new javax.swing.JLabel();
        jTextFieldDesconto = new javax.swing.JTextField();
        jButtonAplicarDesconto = new javax.swing.JButton();
        jComboBoxAlterarStatus = new javax.swing.JComboBox<>();
        jFormattedTextFieldDataPagto = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendasDoCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanelDadosCliente = new javax.swing.JPanel();
        jLabelLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabelLabelCodCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableParcelas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ORDEM DE SERVIÇO");
        setMaximumSize(new java.awt.Dimension(883, 474));
        setMinimumSize(new java.awt.Dimension(883, 474));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(883, 474));
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
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-iniciarrecebimento.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar uma Ordem de Serviço");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(224, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(224, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(196, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-iniciarrecebimento-over.png"))); // NOI18N
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
        jToolBarComandos.add(jButtonSalvar);

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar a operação atual");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar-over2.png"))); // NOI18N
        jToolBarComandos.add(jButtonCancelar);

        jButtonAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar dados da OS");
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
        jToolBarComandos.add(jButtonAlterar);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir a OS");
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
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
            .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBarraTitulo1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo1.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo1.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelLabelTituloReceber.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelTituloReceber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTituloReceber.setText("RECEBIMENTO DE CONTAS / PARCELAS");

        javax.swing.GroupLayout jPanelBarraTitulo1Layout = new javax.swing.GroupLayout(jPanelBarraTitulo1);
        jPanelBarraTitulo1.setLayout(jPanelBarraTitulo1Layout);
        jPanelBarraTitulo1Layout.setHorizontalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelTituloReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraTitulo1Layout.setVerticalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarraTitulo1Layout.createSequentialGroup()
                .addComponent(jLabelLabelTituloReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelValores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelValores.setMaximumSize(new java.awt.Dimension(279, 288));
        jPanelValores.setMinimumSize(new java.awt.Dimension(279, 288));
        jPanelValores.setPreferredSize(new java.awt.Dimension(279, 288));

        jButtonReceber.setText("Receber");
        jButtonReceber.setEnabled(false);
        jButtonReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceberActionPerformed(evt);
            }
        });

        jButtonCancelarRecebimento.setText("Cancelar");
        jButtonCancelarRecebimento.setEnabled(false);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelSubtotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelLabelSubtotal.setText("Valor da parcela:");

        jLabelSubtotal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelSubtotal.setText("---");

        jLabelLabelTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelLabelTotal.setText("Total:");

        jPanel9.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");

        jFormattedTextFieldTotal.setEditable(false);
        jFormattedTextFieldTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldTotal.setEnabled(false);
        jFormattedTextFieldTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableParcelas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.parValorInicial}"), jFormattedTextFieldTotal, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextFieldTotal)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelRS.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelRS.setText("R$");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldValorJuros.setEnabled(false);
        jTextFieldValorJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldValorJurosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorJurosFocusLost(evt);
            }
        });
        jTextFieldValorJuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorJurosKeyTyped(evt);
            }
        });

        jLabelLabelJuros.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelJuros.setText("Juros:");

        jTextFieldJuros.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextFieldJuros.setEnabled(false);
        jTextFieldJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldJurosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldJurosFocusLost(evt);
            }
        });
        jTextFieldJuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldJurosKeyTyped(evt);
            }
        });

        jLabelLabelPercJuros.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelPercJuros.setText("% ao mês");

        jButtonAplicarJuros.setText("aplicar");
        jButtonAplicarJuros.setEnabled(false);
        jButtonAplicarJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarJurosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelLabelJuros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldValorJuros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelPercJuros)
                    .addComponent(jButtonAplicarJuros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelJuros)
                    .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelPercJuros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAplicarJuros))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelDesconto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelDesconto.setText("Desconto:");

        jTextFieldValorDesconto.setEnabled(false);
        jTextFieldValorDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldValorDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorDescontoFocusLost(evt);
            }
        });
        jTextFieldValorDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorDescontoKeyTyped(evt);
            }
        });

        jLabelLabelPercDesc.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelPercDesc.setText("% ao mês");

        jTextFieldDesconto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextFieldDesconto.setEnabled(false);
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

        jButtonAplicarDesconto.setText("aplicar");
        jButtonAplicarDesconto.setEnabled(false);
        jButtonAplicarDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarDescontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelLabelDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelPercDesc)
                    .addComponent(jButtonAplicarDesconto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelDesconto)
                    .addComponent(jLabelLabelPercDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAplicarDesconto))
                .addContainerGap())
        );

        jComboBoxAlterarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Recebido" }));
        jComboBoxAlterarStatus.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableParcelas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.parStatus}"), jComboBoxAlterarStatus, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jFormattedTextFieldDataPagto.setEditable(false);
        jFormattedTextFieldDataPagto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableParcelas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.parDataPagto}"), jFormattedTextFieldDataPagto, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel6.setText("Status da Parcela");

        jLabel7.setText("Data Pagamento");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelLabelSubtotal)
                        .addGap(8, 8, 8)
                        .addComponent(jLabelRS)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jFormattedTextFieldDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAlterarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabelLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelSubtotal)
                    .addComponent(jLabelRS)
                    .addComponent(jLabelSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlterarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanelValoresLayout = new javax.swing.GroupLayout(jPanelValores);
        jPanelValores.setLayout(jPanelValoresLayout);
        jPanelValoresLayout.setHorizontalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelValoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelValoresLayout.setVerticalGroup(
            jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelDescricao.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelDescricao.setText("Descrição");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVendasDoCliente, jTableVendasDoCliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVenda}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venDataVenda}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venValorTotal}"));
        columnBinding.setColumnName("Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venStatus}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableVendasDoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableVendasDoClienteMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendasDoCliente);
        if (jTableVendasDoCliente.getColumnModel().getColumnCount() > 0) {
            jTableVendasDoCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableVendasDoCliente.getColumnModel().getColumn(0).setPreferredWidth(4);
            jTableVendasDoCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableVendasDoCliente.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableVendasDoCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableVendasDoCliente.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTableVendasDoCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableVendasDoCliente.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("da Venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLabelDescricao)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanelDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDadosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDadosCliente.setMaximumSize(new java.awt.Dimension(605, 67));
        jPanelDadosCliente.setMinimumSize(new java.awt.Dimension(605, 67));

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

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-24.png"))); // NOI18N
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosClienteLayout = new javax.swing.GroupLayout(jPanelDadosCliente);
        jPanelDadosCliente.setLayout(jPanelDadosClienteLayout);
        jPanelDadosClienteLayout.setHorizontalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCodCliente)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanelDadosClienteLayout.setVerticalGroup(
            jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLabelCodCliente)
                            .addComponent(jLabelLabelCliente))
                        .addGap(1, 1, 1)
                        .addGroup(jPanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCliente)
                            .addComponent(jTextFieldCodCliente)))
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listParcelasDaVenda, jTableParcelas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parParcela}"));
        columnBinding.setColumnName("Parcela");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parValorInicial}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataVenc}"));
        columnBinding.setColumnName("Data Venc.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parDataPagto}"));
        columnBinding.setColumnName("Data Pagto.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${parStatus}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableParcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableParcelasMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableParcelas);
        if (jTableParcelas.getColumnModel().getColumnCount() > 0) {
            jTableParcelas.getColumnModel().getColumn(0).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(0).setPreferredWidth(4);
            jTableParcelas.getColumnModel().getColumn(1).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableParcelas.getColumnModel().getColumn(2).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableParcelas.getColumnModel().getColumn(3).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableParcelas.getColumnModel().getColumn(4).setResizable(false);
            jTableParcelas.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Parcelas");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("da Venda");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Selecionada");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBarComandos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelValores, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(899, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jButtonBuscarCliente.setEnabled(true);
        jTextFieldCodCliente.setEnabled(true);
        jTextFieldCliente.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed
        
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed
    
    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        statusControlesRecebimento(false);
        JFrameBuscaCliente buscaCliente = new JFrameBuscaCliente();
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
        jTextFieldCodCliente.setText(buscaCliente.getCodCliente());
        jTextFieldCliente.setText(buscaCliente.getNomeCliente());
        jTextFieldDesconto.setText("1");
        jTextFieldJuros.setText("1");
        if(!(jTextFieldCodCliente.getText().equals("")))
            statusInicial(false);
        atualizaTabelas();
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jTextFieldCodClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteCaretUpdate
        if(!jTextFieldCodCliente.getText().equals("")){
            entityManager.clear();
            String ejbql2 = "from Venda v where v.cliente.idCliente = " + jTextFieldCodCliente.getText();
            queryVendasDoCliente = entityManager.createQuery(ejbql2);
            listVendasDoCliente.clear();
            listVendasDoCliente.addAll(queryVendasDoCliente.getResultList());
        }
    }//GEN-LAST:event_jTextFieldCodClienteCaretUpdate
      
    private void jButtonReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceberActionPerformed
        if(jTableParcelas.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma parcela!");
        } else {
            int linha = jTableParcelas.getSelectedRow();            
            //if(listParcelasDaVenda.get(linha).getParStatus().equals("Ativo"))
            //    jFormattedTextFieldDataPagto.setValue(Date.from(Instant.now()));
            int confirmaReceber = JOptionPane.showConfirmDialog(null, "Confirma o RECEBIMENTO desta Parcela?", "Atenção", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(confirmaReceber == 0){                
                Parcela par = listParcelasDaVenda.get(linha);
                jComboBoxAlterarStatus.setSelectedItem("Recebido");
                
                java.util.Date dataPagto = new Date();
                Calendar calendarPagto = Calendar.getInstance();
                calendarPagto.setTime(dataPagto);
                jFormattedTextFieldDataPagto.setValue(dataPagto);
                valor = Double.parseDouble(String.valueOf(jFormattedTextFieldTotal.getValue()));
                par.setParValorInicial(valor);
                try {
                    entityManager.getTransaction().begin();
                    par = entityManager.merge(par);
                    entityManager.persist(par);
                    entityManager.getTransaction().commit();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, a parcela não foi recebida!\nErro: " + e);
                    if(!entityManager.getTransaction().isActive())
                        entityManager.getTransaction().begin();
                    entityManager.getTransaction().rollback();
                }
                //salvar os dados da parcela paga na tabela movimento
                int linhaselec = jTableVendasDoCliente.getSelectedRow();
                int codVenda = Integer.parseInt(String.valueOf(jTableVendasDoCliente.getValueAt(linhaselec, 0)));
                String ejbql4 = "from Venda v where v.idVenda = " + codVenda;
                queryVendas = entityManager.createQuery(ejbql4);
                listVendas.clear();
                listVendas.addAll(queryVendas.getResultList());
                
                Movimento mov = new Movimento("parcela", "entrada", calendarPagto.getTime(), valor);
                mov.adicionarVenda((Venda)listVendas.get(0));
                try {
                    entityManager.getTransaction().begin();
                    entityManager.persist(mov);
                    entityManager.getTransaction().commit();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, o movimento não foi gravado!\nErro: " + e);
                    if(!entityManager.getTransaction().isActive())
                        entityManager.getTransaction().begin();
                    entityManager.getTransaction().rollback();
                }
            } else {
                entityManager.clear();
                jTableParcelas.clearSelection();                
                listParcelasDaVenda.clear();
                limparCampos();
            }
        }        
        statusControlesRecebimento(false);
        atualizaParcelasDaVenda();
        valorParcela = 0.0;
        limparCampos();
    }//GEN-LAST:event_jButtonReceberActionPerformed

    private void atualizaParcelasDaVenda(){
        int linha = jTableVendasDoCliente.getSelectedRow();
        String ejbql = "from Parcela p where p.venda.idVenda = " + jTableVendasDoCliente.getValueAt(linha, 0);
        ejbql += " order by p.parParcela";
        queryParcelasDaVenda = entityManager.createQuery(ejbql);
        listParcelasDaVenda.clear();
        listParcelasDaVenda.addAll(queryParcelasDaVenda.getResultList());
    }
    
    private void jTextFieldDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusGained
        if(jTextFieldDesconto.getText().equals("0.00") || jTextFieldDesconto.getText().equals("0"))
        jTextFieldDesconto.setText("");
    }//GEN-LAST:event_jTextFieldDescontoFocusGained

    private void jTextFieldDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescontoFocusLost
        if(jTextFieldDesconto.getText().equals("") || jTextFieldDesconto.getText().equals("0"))
        jTextFieldDesconto.setText("0.00");
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

    private void atualizaTotal(){
        NumberFormat nf = NumberFormat.getInstance();
        try {
            subtotal = nf.parse(String.valueOf(jLabelSubtotal.getText())).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameReceber.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(!jTextFieldValorJuros.getText().equals("")){
                juros = valorJuros;
        } else
            jTextFieldValorJuros.setText("0.00");
        if(!jTextFieldValorDesconto.getText().equals("")){
                descontos = valorDescontos;
        } else
            jTextFieldValorDesconto.setText("0.00");
        jFormattedTextFieldTotal.setValue(subtotal + juros - descontos);
    }
    
    private void jTableParcelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParcelasMouseReleased
        DecimalFormat df = new DecimalFormat("#.00");
        int linha = jTableParcelas.getSelectedRow();
        if(listParcelasDaVenda.get(linha).getParStatus().equals("Ativo"))
                jFormattedTextFieldDataPagto.setValue(Date.from(Instant.now()));
        jLabelSubtotal.setText(String.valueOf(df.format(jTableParcelas.getValueAt(linha, 1))));         
        
        double taxaDesc;
        double meses;
        int variacaoAnual;
        int anoAtual;
        int anoFuturo;
        SimpleDateFormat dtFormato = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");        
        
        int linhaSelecionada = jTableParcelas.getSelectedRow();
        
        if(String.valueOf(jTableParcelas.getValueAt(linhaSelecionada, 4)).equals("Ativo")){
            java.util.Date dataVen = (Date)jTableParcelas.getValueAt(linhaSelecionada, 2);
            java.util.Date dataPag = Date.from(Instant.now());
            dtFormato.format(dataVen);
            dtFormato.format(dataPag);
            
            anoAtual = Integer.parseInt(ano.format(dataPag));
            anoFuturo = Integer.parseInt(ano.format(dataVen));
            variacaoAnual = anoFuturo - anoAtual;
            
            meses = (Integer.parseInt(dtFormato.format(dataVen)) - Integer.parseInt(dtFormato.format(dataPag)));
            meses = (meses - (variacaoAnual * 8800))/100;
            
            if(meses > 0){ //desconto
                taxaDesc = meses * Double.parseDouble(String.valueOf(jTextFieldDesconto.getText()));
                valorParcela = 0.0;
                valorDescontos = (Double.parseDouble(String.valueOf(jTableParcelas.getValueAt(linhaSelecionada,1))) * (taxaDesc/100));
                jTextFieldValorDesconto.setText(String.valueOf(df.format(valorDescontos)));
                jTextFieldValorJuros.setText("0.00");
            } else { //acréscimo
                taxaDesc = meses * Double.parseDouble(String.valueOf(jTextFieldJuros.getText()));
                valorParcela = 0.0;
                valorJuros = (Double.parseDouble(String.valueOf(jTableParcelas.getValueAt(linhaSelecionada,1))) * (taxaDesc/100));
                jTextFieldValorJuros.setText(String.valueOf(df.format(valorJuros)));
                jTextFieldValorDesconto.setText("0.00");
            }         
        }
        if(listParcelasDaVenda.get(linha).getParStatus().equals("Ativo")){
            statusControlesRecebimento(true);
        } else {
            statusControlesRecebimento(false);
        }
        
    }//GEN-LAST:event_jTableParcelasMouseReleased

    private void jTableVendasDoClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasDoClienteMouseReleased
        if(jTableVendasDoCliente.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma Venda ou O.S.");
        }else{
            int linha = jTableVendasDoCliente.getSelectedRow();
            jTextFieldJuros.setText(String.valueOf(listVendasDoCliente.get(linha).getVenTaxaJuros()));
            jTextFieldDesconto.setText(String.valueOf(listVendasDoCliente.get(linha).getVenTaxaJuros()));
            String ejbql3 = "from Parcela p where p.venda.idVenda = " + jTableVendasDoCliente.getValueAt(linha, 0);
            ejbql3 += " order by p.parParcela";
            queryParcelasDaVenda = entityManager.createQuery(ejbql3);
            listParcelasDaVenda.clear();
            listParcelasDaVenda.addAll(queryParcelasDaVenda.getResultList()); 
            statusControlesRecebimento(false);
        }
    }//GEN-LAST:event_jTableVendasDoClienteMouseReleased

    private void jButtonAplicarDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarDescontoActionPerformed
        NumberFormat nf = NumberFormat.getInstance();
        try {
            valorDescontos = nf.parse(String.valueOf(jTextFieldValorDesconto.getText())).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameReceber.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTotal();
        jButtonAplicarDesconto.setEnabled(false);
    }//GEN-LAST:event_jButtonAplicarDescontoActionPerformed

    private void jButtonAplicarJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarJurosActionPerformed
        NumberFormat nf = NumberFormat.getInstance();
        try {
            valorJuros = nf.parse(String.valueOf(jTextFieldValorJuros.getText())).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameReceber.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTotal();
    }//GEN-LAST:event_jButtonAplicarJurosActionPerformed

    private void jTextFieldJurosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldJurosKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldJuros.setText(jTextFieldJuros.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldJurosKeyTyped

    private void jTextFieldValorDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorDescontoKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldValorDesconto.setText(jTextFieldValorDesconto.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldValorDescontoKeyTyped

    private void jTextFieldValorJurosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorJurosKeyTyped
        String caracteres=".";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldValorJuros.setText(jTextFieldValorJuros.getText() + ",");
        }
        String caracteres2="0123456789,";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldValorJurosKeyTyped

    private void jTextFieldJurosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldJurosFocusGained
        if(jTextFieldJuros.getText().equals("0.00") || jTextFieldJuros.getText().equals("0"))
            jTextFieldJuros.setText("");
    }//GEN-LAST:event_jTextFieldJurosFocusGained

    private void jTextFieldJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldJurosFocusLost
        if(jTextFieldJuros.getText().equals("") || jTextFieldJuros.getText().equals("0"))
            jTextFieldJuros.setText("0.00");
    }//GEN-LAST:event_jTextFieldJurosFocusLost

    private void jTextFieldValorJurosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorJurosFocusGained
       if(jTextFieldValorJuros.getText().equals("0.00") || jTextFieldValorJuros.getText().equals("0"))
            jTextFieldValorJuros.setText("");
    }//GEN-LAST:event_jTextFieldValorJurosFocusGained

    private void jTextFieldValorJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorJurosFocusLost
        if(jTextFieldValorJuros.getText().equals("") || jTextFieldValorJuros.getText().equals("0"))
            jTextFieldValorJuros.setText("0.00");
    }//GEN-LAST:event_jTextFieldValorJurosFocusLost

    private void jTextFieldValorDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorDescontoFocusGained
        if(jTextFieldValorDesconto.getText().equals("0.00") || jTextFieldValorDesconto.getText().equals("0"))
            jTextFieldValorDesconto.setText("");
    }//GEN-LAST:event_jTextFieldValorDescontoFocusGained

    private void jTextFieldValorDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorDescontoFocusLost
        if(jTextFieldValorDesconto.getText().equals("") || jTextFieldValorDesconto.getText().equals("0"))
            jTextFieldValorDesconto.setText("0.00");
    }//GEN-LAST:event_jTextFieldValorDescontoFocusLost
      
    //função que controla o estado dos campos de entrada de texto 
    private void statusInicial(boolean status){
        jTextFieldCodCliente.setEnabled(!status);
        jTextFieldCliente.setEnabled(!status);
        jButtonBuscarCliente.setEnabled(!status);
    }
    
    private void statusControlesRecebimento(boolean status){
        jButtonAplicarJuros.setEnabled(status);
        jButtonAplicarDesconto.setEnabled(status);
        jButtonReceber.setEnabled(status);
        jFormattedTextFieldTotal.setEnabled(status);
        jFormattedTextFieldDataPagto.setEnabled(status);
        jTextFieldDesconto.setEnabled(status);
        jTextFieldJuros.setEnabled(status);
        jTextFieldValorDesconto.setEnabled(status);
        jTextFieldValorJuros.setEnabled(status);
    }
    
    //função que apaga texto digitado nos campos de entrada de texto
    private void limparCampos(){
        jTextFieldCodCliente.setText("");
        jTextFieldCliente.setText("");
        jFormattedTextFieldTotal.setText("0.00");
        jFormattedTextFieldDataPagto.setText("");
        jTextFieldValorDesconto.setText("0.00");
        jTextFieldValorJuros.setText("0.00");
        jLabelSubtotal.setText("0.00");
    }   
        
    /**
     * função que atualiza a tabela dados conforme as operações são efetuadas no 
     * formulário de cadastro
     */
    private void atualizaTabelas(){
        if(jTextFieldCodCliente.getText().equals("")){
            listVendasDoCliente.clear();
        }
        if(jTableVendasDoCliente.getSelectedRow() < 0){
            listParcelasDaVenda.clear();
        }
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);            
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAplicarDesconto;
    private javax.swing.JButton jButtonAplicarJuros;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarRecebimento;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonReceber;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxAlterarStatus;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataPagto;
    private javax.swing.JFormattedTextField jFormattedTextFieldTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCliente;
    private javax.swing.JLabel jLabelLabelCodCliente;
    private javax.swing.JLabel jLabelLabelDesconto;
    private javax.swing.JLabel jLabelLabelDescricao;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelJuros;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelLabelPercDesc;
    private javax.swing.JLabel jLabelLabelPercJuros;
    private javax.swing.JLabel jLabelLabelSubtotal;
    private javax.swing.JLabel jLabelLabelTituloReceber;
    private javax.swing.JLabel jLabelLabelTotal;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelRS;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelBarraTitulo1;
    private javax.swing.JPanel jPanelDadosCliente;
    private javax.swing.JPanel jPanelValores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableParcelas;
    private javax.swing.JTable jTableVendasDoCliente;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldJuros;
    private javax.swing.JTextField jTextFieldValorDesconto;
    private javax.swing.JTextField jTextFieldValorJuros;
    private javax.swing.JToolBar jToolBarComandos;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Parcela> listParcelasDaVenda;
    private java.util.List<Venda> listVendaSelecionada;
    private java.util.List<Venda> listVendas;
    private java.util.List<Venda> listVendasDoCliente;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryParcelasDaVenda;
    private javax.persistence.Query queryVendaSelecionada;
    private javax.persistence.Query queryVendas;
    private javax.persistence.Query queryVendasDoCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
