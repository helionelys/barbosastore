package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.MarcaMoto;
import model.ModeloMoto;
import model.Veiculo;

public class JFrameVeiculo extends javax.swing.JDialog {

    public JFrameVeiculo() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaTabela();
        atualizaControles();
        jComboBoxMarca.setSelectedIndex(-1);
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryVeiculo = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Veiculo v order by v.idVeiculo");
        listVeiculo = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVeiculo.getResultList());
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryMarcaMoto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from MarcaMoto m order by m.idMarcaMoto");
        listMarcaMoto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryMarcaMoto.getResultList());
        queryModeloMoto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ModeloMoto mm order by mm.idModeloMoto");
        listModeloMoto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryModeloMoto.getResultList());
        listModeloDaMoto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<ModeloMoto>())
        ;
        listMarcaDaMoto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<MarcaMoto>())
        ;
        jPanelTabela = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jTabbedPaneDadosPessoais = new javax.swing.JTabbedPane();
        jPanelDados = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelLabelPlaca = new javax.swing.JLabel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jFormattedDataCadastro = new javax.swing.JFormattedTextField();
        jLabelLabelCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonBuscaCliente = new javax.swing.JButton();
        jPanelMeio = new javax.swing.JPanel();
        jPanelMarcaModelo = new javax.swing.JPanel();
        jLabelLabelAnoFabricacao = new javax.swing.JLabel();
        jLabelLabelCor = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jTextFieldAnoModelo = new javax.swing.JTextField();
        jTextFieldAnoFabricacao = new javax.swing.JTextField();
        jLabelLabelMarca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jButtonAddMarca = new javax.swing.JButton();
        jButtonRefreshMarca = new javax.swing.JButton();
        jLabelLabelAnoModelo = new javax.swing.JLabel();
        jLabelLabelModelo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListModeloMoto = new javax.swing.JList<>();
        jTextFieldPesquisaModelo = new javax.swing.JTextField();
        jLabelLabelPesquisarModelo = new javax.swing.JLabel();
        jButtonPesquisaModeloOK = new javax.swing.JButton();
        jButtonAddModelo = new javax.swing.JButton();
        jButtonRefreshModelo = new javax.swing.JButton();
        jPanelDadosComplem = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabelObservacoes = new javax.swing.JLabel();
        jScrollPaneObservacoes = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jToolBarComandos = new javax.swing.JToolBar();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jButtonAdicionarFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE VEÍCULOS");
        setMinimumSize(new java.awt.Dimension(748, 527));
        setResizable(false);

        jPanelTabela.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVeiculo, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVeiculo}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiPlaca}"));
        columnBinding.setColumnName("Placa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modeloMoto}"));
        columnBinding.setColumnName("Modelo");
        columnBinding.setColumnClass(model.ModeloMoto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiAnoFabric}"));
        columnBinding.setColumnName("Fabric.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiAnoModelo}"));
        columnBinding.setColumnName("Modelo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${veiDataCad}"));
        columnBinding.setColumnName("Dt Cad.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(model.Cliente.class);
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
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(15);
            jTableDados.getColumnModel().getColumn(4).setResizable(false);
            jTableDados.getColumnModel().getColumn(4).setPreferredWidth(15);
            jTableDados.getColumnModel().getColumn(5).setResizable(false);
            jTableDados.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTableDados.getColumnModel().getColumn(6).setResizable(false);
            jTableDados.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela)
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldPlaca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldPlaca.setNextFocusableComponent(jTextFieldCodCliente);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.veiPlaca}"), jTextFieldPlaca, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelLabelPlaca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLabelPlaca.setText("PLACA:*");

        jLabelDataCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDataCadastro.setText("DATA:*");

        jFormattedDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedDataCadastro.setNextFocusableComponent(jComboBoxMarca);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.veiDataCad}"), jFormattedDataCadastro, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelLabelCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLabelCliente.setText("CLIENTE:*");

        jTextFieldCodCliente.setEditable(false);
        jTextFieldCodCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldCodCliente.setNextFocusableComponent(jFormattedDataCadastro);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliente.idCliente}"), jTextFieldCodCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldCodCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodClienteCaretUpdate(evt);
            }
        });
        jTextFieldCodCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldCodClienteMouseReleased(evt);
            }
        });
        jTextFieldCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodClienteKeyTyped(evt);
            }
        });

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldCliente.setEnabled(false);

        jButtonBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-16.png"))); // NOI18N
        jButtonBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLabelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDataCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscaCliente)
                            .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDataCadastro)
                                .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelLabelPlaca)
                                    .addComponent(jLabelLabelCliente)
                                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelMeio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMeio.setMaximumSize(new java.awt.Dimension(728, 159));
        jPanelMeio.setMinimumSize(new java.awt.Dimension(728, 159));

        jPanelMarcaModelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelAnoFabricacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLabelAnoFabricacao.setText("ANO FABRICAÇÃO");

        jLabelLabelCor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelLabelCor.setText("COR:");

        jTextFieldCor.setNextFocusableComponent(jListModeloMoto);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.veiCor}"), jTextFieldCor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldAnoModelo.setNextFocusableComponent(jTextFieldCor);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.veiAnoModelo}"), jTextFieldAnoModelo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldAnoFabricacao.setNextFocusableComponent(jTextFieldAnoModelo);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.veiAnoFabric}"), jTextFieldAnoFabricacao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldAnoFabricacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAnoFabricacaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAnoFabricacaoFocusLost(evt);
            }
        });
        jTextFieldAnoFabricacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoFabricacaoKeyTyped(evt);
            }
        });

        jLabelLabelMarca.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelMarca.setText("MARCA:*");

        jComboBoxMarca.setNextFocusableComponent(jTextFieldAnoFabricacao);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listMarcaMoto, jComboBoxMarca);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });

        jButtonAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-16.png"))); // NOI18N
        jButtonAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMarcaActionPerformed(evt);
            }
        });

        jButtonRefreshMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizar-16.png"))); // NOI18N
        jButtonRefreshMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshMarcaActionPerformed(evt);
            }
        });

        jLabelLabelAnoModelo.setText("ANO MODELO");

        javax.swing.GroupLayout jPanelMarcaModeloLayout = new javax.swing.GroupLayout(jPanelMarcaModelo);
        jPanelMarcaModelo.setLayout(jPanelMarcaModeloLayout);
        jPanelMarcaModeloLayout.setHorizontalGroup(
            jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                .addGroup(jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelLabelMarca))
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonRefreshMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelLabelAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLabelAnoModelo))
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTextFieldAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelLabelCor)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMarcaModeloLayout.setVerticalGroup(
            jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                .addComponent(jLabelLabelMarca)
                .addGap(1, 1, 1)
                .addGroup(jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddMarca)
                    .addComponent(jButtonRefreshMarca))
                .addGap(7, 7, 7)
                .addGroup(jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelLabelAnoFabricacao))
                    .addComponent(jLabelLabelAnoModelo))
                .addGap(1, 1, 1)
                .addGroup(jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanelMarcaModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMarcaModeloLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelLabelCor))
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelLabelModelo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelModelo.setText("MODELO:*");

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listModeloMoto, jListModeloMoto);
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(jListModeloMoto);

        jTextFieldPesquisaModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaModeloKeyTyped(evt);
            }
        });

        jLabelLabelPesquisarModelo.setText("Pesquisar Modelo:");

        jButtonPesquisaModeloOK.setText("OK");

        jButtonAddModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-16.png"))); // NOI18N
        jButtonAddModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddModeloActionPerformed(evt);
            }
        });

        jButtonRefreshModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizar-16.png"))); // NOI18N
        jButtonRefreshModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanelMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jButtonAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonRefreshModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelLabelPesquisarModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisaModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaModeloOK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jPanelMarcaModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMeioLayout.createSequentialGroup()
                                .addComponent(jLabelLabelModelo)
                                .addGap(4, 4, 4)
                                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAddModelo)
                                    .addComponent(jButtonRefreshModelo))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMeioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelLabelPesquisarModelo))
                            .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPesquisaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonPesquisaModeloOK))))))
        );

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 728, Short.MAX_VALUE)
                    .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jTabbedPaneDadosPessoais.addTab("DADOS PRINCIPAIS", jPanelDados);

        jPanelDadosComplem.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelObservacoes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelObservacoes.setText("OBSERVAÇÕES:");

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliObs}"), jTextAreaObservacoes, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPaneObservacoes.setViewportView(jTextAreaObservacoes);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(jLabelObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObservacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDadosComplemLayout = new javax.swing.GroupLayout(jPanelDadosComplem);
        jPanelDadosComplem.setLayout(jPanelDadosComplemLayout);
        jPanelDadosComplemLayout.setHorizontalGroup(
            jPanelDadosComplemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDadosComplemLayout.setVerticalGroup(
            jPanelDadosComplemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosComplemLayout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneDadosPessoais.addTab("DADOS COMPLEMENTARES", jPanelDadosComplem);

        jToolBarComandos.setFloatable(false);
        jToolBarComandos.setRollover(true);
        jToolBarComandos.setBorderPainted(false);
        jToolBarComandos.setMaximumSize(new java.awt.Dimension(693, 41));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar um novo veículo");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo-over2.png"))); // NOI18N
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jToolBarComandos.add(jButtonNovo);

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Gravar o novo veículo no banco de dados");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonAlterar.setToolTipText("Alterar dados do cadastro do veículo");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonExcluir.setToolTipText("Excluir o cadastro do veículo");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonImprimir.setToolTipText("Imprimir relatórios de veículos cadastrados");
        jButtonImprimir.setBorderPainted(false);
        jButtonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonSair.setToolTipText("Sair da tela de Cadastro de Veículos");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-vazio.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(48, 37));
        jButton1.setMinimumSize(new java.awt.Dimension(48, 37));
        jButton1.setPreferredSize(new java.awt.Dimension(48, 37));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarComandos.add(jButton1);

        jPanelPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setMaximumSize(new java.awt.Dimension(210, 94));
        jPanelPesquisa.setMinimumSize(new java.awt.Dimension(210, 94));
        jPanelPesquisa.setPreferredSize(new java.awt.Dimension(210, 94));

        jLabelPesquisa.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPesquisa.setText("PESQUISA");
        jLabelPesquisa.setFocusable(false);

        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Todos" }));
        jComboBoxPesquisaStatus.setSelectedIndex(2);
        jComboBoxPesquisaStatus.setFocusable(false);

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Placa", "Modelo", "Cliente" }));
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

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisa)
                    .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(310, 19));

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
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEstado))
        );

        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(375, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(375, 19));

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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelMensagem))
        );

        jButtonAdicionarFoto.setText("Adicionar Foto");
        jButtonAdicionarFoto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                    .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdicionarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(2, 2, 2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(764, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Veículo...");
        jTextFieldPlaca.requestFocus();
        listVeiculo.add(new Veiculo());
        int linha = listVeiculo.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        marcasMoto();
        modelosMoto();
        jComboBoxMarcaActionPerformed(evt);
        
        //pega a data atual
        java.util.Date hoje = Date.from(Instant.now());
        jFormattedDataCadastro.setValue(hoje);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * Função que carrega todas as Marcas para o jComboBox Marcas
     */
    private void marcasMoto(){
        String mar = "from MarcaMoto mm order by mm.marMarca";
        queryMarcaMoto = entityManager.createQuery(mar);
        listMarcaMoto.clear();
        listMarcaMoto.addAll(queryMarcaMoto.getResultList());
    }
    
    /**
     * Função que carrega todos os Modelos para o jListModelos
     */
    private void modelosMoto(){
        String mod = "from ModeloMoto mm order by mm.modModelo";
        queryModeloMoto = entityManager.createQuery(mod);
        listModeloMoto.clear();
        listModeloMoto.addAll(queryModeloMoto.getResultList());
    }
    
    /**
     * Função que atualiza o listModeloMoto para mostrar apenas o Modelo setado
     * para a moto selecionada
     */
    private void atualizaModelo(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            Veiculo vei = listVeiculo.get(linha);
            listModeloMoto.clear();
            listModeloMoto.add(vei.getModeloMoto());
            jListModeloMoto.setSelectedIndex(0);
            marcaDoVeiculo();
        }
    }
   
    /**
     * Função que atualiza o jComboBoxMarcaMoto para mostrar apenas a Marca 
     * setada para a moto selecionada
     */
    private void marcaDoVeiculo(){
        String ejbqlMar = "select ma.marMarca from ModeloMoto mo "
                + "join mo.marcaMoto ma where mo.modModelo = '"
                + String.valueOf(jListModeloMoto.getSelectedValue()) + "'";
        queryMarcaMoto = entityManager.createQuery(ejbqlMar);
        listMarcaMoto.clear();
        listMarcaMoto.addAll(queryMarcaMoto.getResultList());
    }
    
    
     /**
     * Função que atualiza o jComboBoxMarcaMoto para mostrar todas as marcas
     * mantendo a marca da moto selecionada
     */
    private void atualizaComboBox(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            
            String marca = "from MarcaMoto m order by m.idMarcaMoto";
            queryMarcaMoto = entityManager.createQuery(marca);
            listMarcaMoto.clear();
            listMarcaMoto.addAll(queryMarcaMoto.getResultList());

        }
    }
    
    /**
     * Função para listar todos os modelos no JListModeloMoto mantendo o modelo
     * da moto selecionado 
     */
    private void atualizaJList(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            Veiculo vei = listVeiculo.get(linha);
            listModeloDaMoto.clear();
            listModeloDaMoto.add(vei.getModeloMoto());
        }
        String mod = "from ModeloMoto mm order by mm.modModelo";
        queryModeloMoto = entityManager.createQuery(mod);
        listModeloMoto.clear();
        listModeloMoto.addAll(queryModeloMoto.getResultList());
        jListModeloMoto.setSelectedIndex(listModeloMoto.indexOf(listModeloDaMoto.get(0)));
    }
    
    /**
     * Função que verifica se os campos obrigatórios estão preenchidos
     * @return 0 se falso e 1 se verdadeiro
     */    
    private int validaCampos(){
        if(jTextFieldPlaca.getText().equals("") || jTextFieldCodCliente.getText().equals("") ||
                jFormattedDataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldPlaca.requestFocus();
            jTextFieldPlaca.setBackground(Color.CYAN);
            jTextFieldCodCliente.setBackground(Color.CYAN);
            jFormattedDataCadastro.setBackground(Color.CYAN); 
            if(!jTextFieldPlaca.getText().equals(""))
                jTextFieldPlaca.setBackground(Color.WHITE);
            if(!jTextFieldCodCliente.getText().equals(""))
                jTextFieldCodCliente.setBackground(Color.WHITE);
            if(!jFormattedDataCadastro.getText().equals(""))
                jFormattedDataCadastro.setBackground(Color.WHITE);
            return 0;
        }
        if(jComboBoxMarca.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma Marca!");
            return 0;
        }
        if(jListModeloMoto.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Modelo!");
            return 0;
        }
        return 1;
    }
    
    /**
     * Função que persiste os dados do veículo no banco de dados
     * @param evt 
     */
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Veiculo vei = listVeiculo.get(linhaSelecionada);
                        
            int linha = jListModeloMoto.getSelectedIndex();
            vei.adicionarModeloMoto((ModeloMoto)listModeloMoto.get(linha));
            vei.adicionarCliente((Cliente)listCliente.get(0));
            try {
               entityManager.getTransaction().begin();
               vei = entityManager.merge(vei);
               entityManager.persist(vei);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados do Veículo alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Veículo cadastrado com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, o veículo não foi cadastrado!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, o veículo não foi cadastrado!");
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
            }
            jTableDados.setEnabled(true);
            jTextFieldCampoPesquisa.setEnabled(true);
            jLabelEstado.setText("Início");
            limparCampos();
            atualizaTabela();
            statusInicial(true);
            controlePesquisa(true);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * Função que cancela qualquer operação em andamento e coloca o sistema
     * em estado inicial
     */
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
        atualizaJList();
        atualizaComboBox();
    }
    
    /**
     * Executa a função cancelar mas verifica se tem operação de cadastro ou 
     * alteração em andamento
     * @param evt 
     */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldPlaca.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                Cancelar();
            }
        } else {
            Cancelar();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um veículo!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados do veículo...");
            statusInicial(false);
            controlePesquisa(false);
            //atualizaJList();
            atualizaComboBox();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um veículoo!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o veículo? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Veiculo vei = listVeiculo.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    vei = entityManager.merge(vei);
                    entityManager.remove(vei);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Veículo excluído com sucesso!");
                } catch (Exception e) {
                    if (e.getMessage().contains("chave estrangeira")){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "veículo não foi excluído!\nErro: Veículo está associado a uma venda ou cliente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "veículo não foi excluído!\nErro: " + e);
                    }                   
                    jLabelMensagem.setText("Ocorreu um erro, o veículo não foi "
                            + "excluído!");
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
        if(!jTextFieldPlaca.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o programa? Os dados não salvos serão perdidos!");
            if (confirmaSaida == 0) //sim
                dispose();
        }else
            dispose();
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

    private void jTextFieldAnoFabricacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAnoFabricacaoFocusGained
        if(jTextFieldAnoFabricacao.getText().equals("0"))
            jTextFieldAnoFabricacao.setText("");
    }//GEN-LAST:event_jTextFieldAnoFabricacaoFocusGained

    private void jTextFieldAnoFabricacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoFabricacaoKeyTyped
        String caracteres=",";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldAnoFabricacao.setText(jTextFieldAnoFabricacao.getText() + ".");
        }
    }//GEN-LAST:event_jTextFieldAnoFabricacaoKeyTyped

    private void jTextFieldAnoFabricacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAnoFabricacaoFocusLost
        if(jTextFieldAnoFabricacao.getText().equals(""))
            jTextFieldAnoFabricacao.setText("0");
        jTextFieldAnoModelo.setText(jTextFieldAnoFabricacao.getText());
    }//GEN-LAST:event_jTextFieldAnoFabricacaoFocusLost

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && 
                (!jLabelEstado.getText().equals("Inserção"))))){
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
        if(!jLabelEstado.getText().equals("Alteração"))
            atualizaModelo();
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR a operação atual!");     
    }//GEN-LAST:event_jTableDadosMouseReleased

    private void jButtonBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteActionPerformed
        JFrameBuscaCliente buscaCliente = new JFrameBuscaCliente();
        buscaCliente.setLocationRelativeTo(this);
        buscaCliente.setVisible(true);
        jTextFieldCodCliente.setText(buscaCliente.getCodCliente());
    }//GEN-LAST:event_jButtonBuscaClienteActionPerformed

    private void jTextFieldCodClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteCaretUpdate
        if(!jTextFieldCodCliente.getText().equals("")){
            buscaCliente();
        }
    }//GEN-LAST:event_jTextFieldCodClienteCaretUpdate

    private void jTextFieldCodClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCodClienteKeyTyped

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // filtrar as motos dessa marca e mostrar no jListModeloMoto
        String ejbql = "from ModeloMoto mo join mo.marcaMoto ma where"
                + " ma.marMarca = '" + jComboBoxMarca.getSelectedItem() + "'";
        queryModeloMoto = entityManager.createQuery(ejbql);
        listModeloMoto.clear();
        listModeloMoto.addAll(queryModeloMoto.getResultList());
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

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

    private void jButtonAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMarcaActionPerformed
        JFrameMarcaMoto cadMarca = new JFrameMarcaMoto();
        cadMarca.setLocationRelativeTo(this);
        cadMarca.setVisible(true);
    }//GEN-LAST:event_jButtonAddMarcaActionPerformed

    private void jButtonRefreshMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshMarcaActionPerformed
        String marca = "from MarcaMoto m order by m.idMarcaMoto";
        queryMarcaMoto = entityManager.createQuery(marca);
        listMarcaMoto.clear();
        listMarcaMoto.addAll(queryMarcaMoto.getResultList());
    }//GEN-LAST:event_jButtonRefreshMarcaActionPerformed

    private void jTextFieldCodClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteMouseReleased
        JOptionPane.showMessageDialog(null, "Clique no botão de busca ao lado\npara adicionar um cliente.");
    }//GEN-LAST:event_jTextFieldCodClienteMouseReleased

    private void jButtonAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddModeloActionPerformed
        JFrameModeloMoto cadModelo = new JFrameModeloMoto();
        cadModelo.setLocationRelativeTo(this);
        cadModelo.setVisible(true);
    }//GEN-LAST:event_jButtonAddModeloActionPerformed

    private void jButtonRefreshModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshModeloActionPerformed
        jComboBoxMarcaActionPerformed(evt);
    }//GEN-LAST:event_jButtonRefreshModeloActionPerformed

    private void jTextFieldPesquisaModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaModeloKeyTyped
        // filtrar as motos dessa marca e mostrar no jListModeloMoto
        String ejbql = "from ModeloMoto mo join mo.marcaMoto ma where"
                + " (ma.marMarca = '" + jComboBoxMarca.getSelectedItem() + "' and"
                + " mo.modModelo = '" + jTextFieldPesquisaModelo.getText() + "')";
        queryModeloMoto = entityManager.createQuery(ejbql);
        listModeloMoto.clear();
        listModeloMoto.addAll(queryModeloMoto.getResultList());
    }//GEN-LAST:event_jTextFieldPesquisaModeloKeyTyped
   
    private void buscaCliente(){
        entityManager.clear();
        String ejbql2 = "from Cliente c ";
        String codigo = "";        
            codigo = "c.idCliente";
            int filtro = Integer.parseInt(jTextFieldCodCliente.getText());
            if(filtro > -1){
                ejbql2 += "where " + codigo + " = " + filtro;
            }
        ejbql2 +=" order by " + codigo;
        queryCliente = entityManager.createQuery(ejbql2);
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
        jTextFieldPlaca.setEnabled(!status);
        jTextFieldAnoModelo.setEnabled(!status);
        jTextFieldCor.setEnabled(!status);
        jTextFieldAnoFabricacao.setEnabled(!status);
        jTextFieldAnoFabricacao.setEnabled(!status);
        jTextFieldCodCliente.setEnabled(!status);
        jTextFieldPesquisaModelo.setEnabled(!status);
        jFormattedDataCadastro.setEnabled(!status);
        jListModeloMoto.setEnabled(!status);
        jComboBoxMarca.setEnabled(!status);
        jTextAreaObservacoes.setEnabled(!status);
        jButtonPesquisaModeloOK.setEnabled(!status);
        jButtonAddMarca.setEnabled(!status);
        jButtonRefreshMarca.setEnabled(!status);
        jButtonAddModelo.setEnabled(!status);
        jButtonRefreshModelo.setEnabled(!status);
    }
    
    //função que apaga texto digitado nos campos de entrada de texto
    private void limparCampos(){
        jTextFieldPlaca.setText("");
        jTextFieldAnoModelo.setText("");
        jTextFieldCor.setText("");
        jTextFieldAnoFabricacao.setText("");
        jTextFieldAnoFabricacao.setText("");
        jTextAreaObservacoes.setText("");
        jTextFieldCodCliente.setText("");
        jTextFieldCliente.setText("");
        jTextFieldPesquisaModelo.setText("");
        jTextFieldPlaca.setBackground(Color.WHITE);
        jTextFieldCodCliente.setBackground(Color.WHITE);
        jFormattedDataCadastro.setBackground(Color.WHITE);
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        jComboBoxPesquisaStatus.setEnabled(status);
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
        String ejbql = "from Veiculo v ";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Placa")){
            campoPesquisa = "v.veiPlaca";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Modelo")){
            campoPesquisa = "mo.modModelo";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "join v.modeloMoto mo where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Cliente")){
            campoPesquisa = "c.cliNome";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "join v.cliente c where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "v.idVeiculo";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + campoPesquisa + " = " + filtro;
                }
            }
        }
        //ejbql += " order by " + campoPesquisa;
        queryVeiculo = entityManager.createQuery(ejbql);
        listVeiculo.clear();
        listVeiculo.addAll(queryVeiculo.getResultList());
        int linha = listVeiculo.size() - 1;
        if(listVeiculo.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Veículo não cadastrado no sistema!");
        }
        if(listVeiculo.size() == 1){
            jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        }else if(listVeiculo.size() > 1)
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddMarca;
    private javax.swing.JButton jButtonAddModelo;
    private javax.swing.JButton jButtonAdicionarFoto;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscaCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaModeloOK;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonRefreshMarca;
    private javax.swing.JButton jButtonRefreshModelo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedDataCadastro;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelAnoFabricacao;
    private javax.swing.JLabel jLabelLabelAnoModelo;
    private javax.swing.JLabel jLabelLabelCliente;
    private javax.swing.JLabel jLabelLabelCor;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMarca;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelLabelModelo;
    private javax.swing.JLabel jLabelLabelPesquisarModelo;
    private javax.swing.JLabel jLabelLabelPlaca;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JList<String> jListModeloMoto;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelDadosComplem;
    private javax.swing.JPanel jPanelMarcaModelo;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneObservacoes;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTabbedPane jTabbedPaneDadosPessoais;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldAnoFabricacao;
    private javax.swing.JTextField jTextFieldAnoModelo;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldPesquisaModelo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JToolBar jToolBarComandos;
    private java.util.List<Cliente> listCliente;
    private java.util.List<MarcaMoto> listMarcaDaMoto;
    private java.util.List<MarcaMoto> listMarcaMoto;
    private java.util.List<ModeloMoto> listModeloDaMoto;
    private java.util.List<ModeloMoto> listModeloMoto;
    private java.util.List<Veiculo> listVeiculo;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryMarcaMoto;
    private javax.persistence.Query queryModeloMoto;
    private javax.persistence.Query queryVeiculo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
