package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.Cliente;
import model.ItemDaVenda;
import model.Movimento;
import model.Parcela;
import model.Produto;

public class JFrameRelatoriosGerais extends javax.swing.JDialog {

    public JFrameRelatoriosGerais() {
        initComponents();
        this.setModal(true);
        java.util.Date hoje = Date.from(Instant.now());
        jDateChooserDataInicial.setDate(hoje);
        jDateChooserDataFinal.setDate(hoje);
        jDateChooserDataInicial1.setDate(hoje);
        jDateChooserDataFinal1.setDate(hoje);
        jDateChooserDataInicial2.setDate(hoje);
        jDateChooserDataFinal2.setDate(hoje);
        listSituacaoCliente.clear();
        listAReceber.clear();
        listRecebimentos.clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryRecebimentos = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Movimento m order by m.idMovimento");
        listRecebimentos = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryRecebimentos.getResultList());
        querySituacaoCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Parcela p order by p.venda.idVenda");
        listSituacaoCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(querySituacaoCliente.getResultList());
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        queryAReceber = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Parcela p order by p.idParcela");
        listAReceber = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryAReceber.getResultList());
        queryProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p order by p.proDescricao");
        listProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProduto.getResultList());
        buttonGroupPreco = new javax.swing.ButtonGroup();
        queryVendas = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ItemDaVenda itv join Produto p on p.idProduto = itv.produto.idProduto where itv.venda.venOrcamento = 'FALSE'");
        listVendas = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryVendas.getResultList());
        jTabbedPaneRelatorios = new javax.swing.JTabbedPane();
        jPanelClientes = new javax.swing.JPanel();
        jPanelRelatoriosClientes = new javax.swing.JPanel();
        jPanelFiltrosClientes = new javax.swing.JPanel();
        jButtonListarClientes = new javax.swing.JButton();
        jLabelDataInicial = new javax.swing.JLabel();
        jLabelDataFinal = new javax.swing.JLabel();
        jDateChooserDataInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jLabelLabelSituacao = new javax.swing.JLabel();
        jTextFieldBuscarPor = new javax.swing.JTextField();
        jLabelLabelBuscaPor = new javax.swing.JLabel();
        jComboBoxBuscarEm = new javax.swing.JComboBox<>();
        jLabelLabelBuscaEm = new javax.swing.JLabel();
        jLabelLabelStatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanelPanelRecebimentos = new javax.swing.JPanel();
        jLabelLabelRecebimentos = new javax.swing.JLabel();
        jPanelTabelaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanelProdutos = new javax.swing.JPanel();
        jPanelRelatoriosProdutos = new javax.swing.JPanel();
        jPanelFiltrosProdutos = new javax.swing.JPanel();
        jButtonListarProdutos = new javax.swing.JButton();
        jLabelDataInicial1 = new javax.swing.JLabel();
        jLabelDataFinal1 = new javax.swing.JLabel();
        jDateChooserDataInicial1 = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal1 = new com.toedter.calendar.JDateChooser();
        jTextFieldBuscarPor1 = new javax.swing.JTextField();
        jLabelLabelBuscaPor1 = new javax.swing.JLabel();
        jComboBoxBuscarEm1 = new javax.swing.JComboBox<>();
        jLabelLabelBuscarEm1 = new javax.swing.JLabel();
        jPanelOrdenarPreco = new javax.swing.JPanel();
        jRadioButtonMaior = new javax.swing.JRadioButton();
        jRadioButtonMenor = new javax.swing.JRadioButton();
        jLabelLabelOrdenar = new javax.swing.JLabel();
        jPanelPanelRecebimentos1 = new javax.swing.JPanel();
        jLabelLabelRecebimentos1 = new javax.swing.JLabel();
        jPanelTabelaProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanelVendas = new javax.swing.JPanel();
        jPanelMenuRelatorioVendas = new javax.swing.JPanel();
        jPanelFiltrosVenda = new javax.swing.JPanel();
        jButtonListarVendas = new javax.swing.JButton();
        jLabelDataInicial2 = new javax.swing.JLabel();
        jLabelDataFinal2 = new javax.swing.JLabel();
        jDateChooserDataInicial2 = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal2 = new com.toedter.calendar.JDateChooser();
        jTextFieldBuscarPor2 = new javax.swing.JTextField();
        jLabelBuscaPor1 = new javax.swing.JLabel();
        jComboBoxBuscarEm2 = new javax.swing.JComboBox<>();
        jLabelBuscarEm1 = new javax.swing.JLabel();
        jPanelOrdenarPreco1 = new javax.swing.JPanel();
        jRadioButtonMaior1 = new javax.swing.JRadioButton();
        jRadioButtonMenor1 = new javax.swing.JRadioButton();
        jLabelLabelOrdenar1 = new javax.swing.JLabel();
        jPanelPanelRecebimentos2 = new javax.swing.JPanel();
        jLabelLabelRecebimentos2 = new javax.swing.JLabel();
        jPanelTabelaVendas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIOS");
        setMaximumSize(new java.awt.Dimension(960, 477));
        setMinimumSize(new java.awt.Dimension(960, 477));

        jTabbedPaneRelatorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPaneRelatorios.setMaximumSize(new java.awt.Dimension(846, 465));
        jTabbedPaneRelatorios.setMinimumSize(new java.awt.Dimension(846, 465));
        jTabbedPaneRelatorios.setPreferredSize(new java.awt.Dimension(846, 465));

        jPanelClientes.setMaximumSize(new java.awt.Dimension(960, 477));
        jPanelClientes.setMinimumSize(new java.awt.Dimension(960, 477));
        jPanelClientes.setPreferredSize(new java.awt.Dimension(960, 477));
        jPanelClientes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelClientesComponentShown(evt);
            }
        });

        jPanelRelatoriosClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRelatoriosClientes.setMaximumSize(new java.awt.Dimension(255, 419));
        jPanelRelatoriosClientes.setMinimumSize(new java.awt.Dimension(255, 419));
        jPanelRelatoriosClientes.setPreferredSize(new java.awt.Dimension(255, 419));

        jPanelFiltrosClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFiltrosClientes.setMaximumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosClientes.setMinimumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosClientes.setPreferredSize(new java.awt.Dimension(922, 56));

        jButtonListarClientes.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonListarClientes.setText("Listar");
        jButtonListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarClientesActionPerformed(evt);
            }
        });

        jLabelDataInicial.setText("Data Inicial");

        jLabelDataFinal.setText("Data Final");

        jDateChooserDataInicial.setEnabled(false);

        jDateChooserDataFinal.setEnabled(false);

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Aniversariantes", "Inadimplentes" }));
        jComboBoxSituacao.setEnabled(false);

        jLabelLabelSituacao.setText("Situação");

        jTextFieldBuscarPor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPorKeyTyped(evt);
            }
        });

        jLabelLabelBuscaPor.setText("Busca por:");

        jComboBoxBuscarEm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Endereço", "E-mail", "Celular", "Telefone" }));

        jLabelLabelBuscaEm.setText("Buscar em:");

        jLabelLabelStatus.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativos", "Inativos" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltrosClientesLayout = new javax.swing.GroupLayout(jPanelFiltrosClientes);
        jPanelFiltrosClientes.setLayout(jPanelFiltrosClientesLayout);
        jPanelFiltrosClientesLayout.setHorizontalGroup(
            jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelDataInicial))
                    .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelSituacao)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxBuscarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLabelBuscaEm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLabelBuscaPor)
                    .addComponent(jTextFieldBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFiltrosClientesLayout.setVerticalGroup(
            jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBuscarEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                                .addComponent(jLabelDataInicial)
                                .addGap(2, 2, 2)
                                .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                                .addGroup(jPanelFiltrosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDataFinal)
                                    .addComponent(jLabelLabelSituacao)
                                    .addComponent(jLabelLabelBuscaPor)
                                    .addComponent(jLabelLabelBuscaEm)
                                    .addComponent(jLabelLabelStatus))
                                .addGap(2, 2, 2)
                                .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(4, 4, Short.MAX_VALUE))
            .addGroup(jPanelFiltrosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonListarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPanelRecebimentos.setBackground(new java.awt.Color(0, 102, 153));
        jPanelPanelRecebimentos.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLabelRecebimentos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLabelRecebimentos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRecebimentos.setText("RELATÓRIO DE CLIENTES");

        javax.swing.GroupLayout jPanelPanelRecebimentosLayout = new javax.swing.GroupLayout(jPanelPanelRecebimentos);
        jPanelPanelRecebimentos.setLayout(jPanelPanelRecebimentosLayout);
        jPanelPanelRecebimentosLayout.setHorizontalGroup(
            jPanelPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelRecebimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanelRecebimentosLayout.setVerticalGroup(
            jPanelPanelRecebimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelRecebimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRelatoriosClientesLayout = new javax.swing.GroupLayout(jPanelRelatoriosClientes);
        jPanelRelatoriosClientes.setLayout(jPanelRelatoriosClientesLayout);
        jPanelRelatoriosClientesLayout.setHorizontalGroup(
            jPanelRelatoriosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPanelRecebimentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRelatoriosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltrosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRelatoriosClientesLayout.setVerticalGroup(
            jPanelRelatoriosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatoriosClientesLayout.createSequentialGroup()
                .addComponent(jPanelPanelRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFiltrosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabelaClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTabelaClientes.setMaximumSize(new java.awt.Dimension(938, 322));
        jPanelTabelaClientes.setMinimumSize(new java.awt.Dimension(938, 322));
        jPanelTabelaClientes.setPreferredSize(new java.awt.Dimension(938, 322));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, jTableClientes);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEndereco}"));
        columnBinding.setColumnName("Endereço");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNumero}"));
        columnBinding.setColumnName("Nº");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("E-mail");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCelular}"));
        columnBinding.setColumnName("Celular");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTelefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliStatus}"));
        columnBinding.setColumnName("Ativo");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setResizable(false);
            jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableClientes.getColumnModel().getColumn(1).setResizable(false);
            jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableClientes.getColumnModel().getColumn(2).setResizable(false);
            jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTableClientes.getColumnModel().getColumn(3).setResizable(false);
            jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableClientes.getColumnModel().getColumn(4).setResizable(false);
            jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableClientes.getColumnModel().getColumn(5).setResizable(false);
            jTableClientes.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTableClientes.getColumnModel().getColumn(6).setResizable(false);
            jTableClientes.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanelTabelaClientesLayout = new javax.swing.GroupLayout(jPanelTabelaClientes);
        jPanelTabelaClientes.setLayout(jPanelTabelaClientesLayout);
        jPanelTabelaClientesLayout.setHorizontalGroup(
            jPanelTabelaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTabelaClientesLayout.setVerticalGroup(
            jPanelTabelaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaClientesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRelatoriosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                    .addComponent(jPanelTabelaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRelatoriosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabelaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("Relatório de Clientes", jPanelClientes);

        jPanelProdutos.setMaximumSize(new java.awt.Dimension(843, 431));
        jPanelProdutos.setMinimumSize(new java.awt.Dimension(843, 431));
        jPanelProdutos.setPreferredSize(new java.awt.Dimension(843, 431));

        jPanelRelatoriosProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRelatoriosProdutos.setMaximumSize(new java.awt.Dimension(255, 419));
        jPanelRelatoriosProdutos.setMinimumSize(new java.awt.Dimension(255, 419));

        jPanelFiltrosProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFiltrosProdutos.setMaximumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosProdutos.setMinimumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosProdutos.setPreferredSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosProdutos.setLayout(new java.awt.GridBagLayout());

        jButtonListarProdutos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonListarProdutos.setText("Listar");
        jButtonListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarProdutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 8);
        jPanelFiltrosProdutos.add(jButtonListarProdutos, gridBagConstraints);

        jLabelDataInicial1.setText("Data Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        jPanelFiltrosProdutos.add(jLabelDataInicial1, gridBagConstraints);

        jLabelDataFinal1.setText("Data Final");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosProdutos.add(jLabelDataFinal1, gridBagConstraints);

        jDateChooserDataInicial1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 0, 0);
        jPanelFiltrosProdutos.add(jDateChooserDataInicial1, gridBagConstraints);

        jDateChooserDataFinal1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 0, 0);
        jPanelFiltrosProdutos.add(jDateChooserDataFinal1, gridBagConstraints);

        jTextFieldBuscarPor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPor1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 204;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 2, 0);
        jPanelFiltrosProdutos.add(jTextFieldBuscarPor1, gridBagConstraints);

        jLabelLabelBuscaPor1.setText("Busca por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosProdutos.add(jLabelLabelBuscaPor1, gridBagConstraints);

        jComboBoxBuscarEm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição", "Marca", "Categoria", "Grupo" }));
        jComboBoxBuscarEm1.setSelectedIndex(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosProdutos.add(jComboBoxBuscarEm1, gridBagConstraints);

        jLabelLabelBuscarEm1.setText("Buscar em:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosProdutos.add(jLabelLabelBuscarEm1, gridBagConstraints);

        jPanelOrdenarPreco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelOrdenarPreco.setLayout(new java.awt.GridBagLayout());

        buttonGroupPreco.add(jRadioButtonMaior);
        jRadioButtonMaior.setText("Maior Preço");
        jRadioButtonMaior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButtonMaiorMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 0);
        jPanelOrdenarPreco.add(jRadioButtonMaior, gridBagConstraints);

        buttonGroupPreco.add(jRadioButtonMenor);
        jRadioButtonMenor.setText("Menor Preço");
        jRadioButtonMenor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButtonMenorMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 2, 8);
        jPanelOrdenarPreco.add(jRadioButtonMenor, gridBagConstraints);

        jLabelLabelOrdenar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelOrdenar.setText("Ordenar Por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 0, 0);
        jPanelOrdenarPreco.add(jLabelLabelOrdenar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 0);
        jPanelFiltrosProdutos.add(jPanelOrdenarPreco, gridBagConstraints);

        jPanelPanelRecebimentos1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelPanelRecebimentos1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLabelRecebimentos1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLabelRecebimentos1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRecebimentos1.setText("RELATÓRIO DE PRODUTOS");

        javax.swing.GroupLayout jPanelPanelRecebimentos1Layout = new javax.swing.GroupLayout(jPanelPanelRecebimentos1);
        jPanelPanelRecebimentos1.setLayout(jPanelPanelRecebimentos1Layout);
        jPanelPanelRecebimentos1Layout.setHorizontalGroup(
            jPanelPanelRecebimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelRecebimentos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelRecebimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanelRecebimentos1Layout.setVerticalGroup(
            jPanelPanelRecebimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelRecebimentos1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRelatoriosProdutosLayout = new javax.swing.GroupLayout(jPanelRelatoriosProdutos);
        jPanelRelatoriosProdutos.setLayout(jPanelRelatoriosProdutosLayout);
        jPanelRelatoriosProdutosLayout.setHorizontalGroup(
            jPanelRelatoriosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPanelRecebimentos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRelatoriosProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltrosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRelatoriosProdutosLayout.setVerticalGroup(
            jPanelRelatoriosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatoriosProdutosLayout.createSequentialGroup()
                .addComponent(jPanelPanelRecebimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFiltrosProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabelaProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTabelaProdutos.setMaximumSize(new java.awt.Dimension(938, 322));
        jPanelTabelaProdutos.setMinimumSize(new java.awt.Dimension(938, 322));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jTableProdutos);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proCodigo}"));
        columnBinding.setColumnName("Cód. Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proDescricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proEstoqueAtual}"));
        columnBinding.setColumnName("Estoque");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${marcaProduto}"));
        columnBinding.setColumnName("Marca");
        columnBinding.setColumnClass(model.MarcaProduto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(model.Categoria.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${grupo}"));
        columnBinding.setColumnName("Grupo");
        columnBinding.setColumnClass(model.Grupo.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proPrecoVenda}"));
        columnBinding.setColumnName("Preço");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableProdutos.getColumnModel().getColumn(4).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableProdutos.getColumnModel().getColumn(5).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTableProdutos.getColumnModel().getColumn(6).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanelTabelaProdutosLayout = new javax.swing.GroupLayout(jPanelTabelaProdutos);
        jPanelTabelaProdutos.setLayout(jPanelTabelaProdutosLayout);
        jPanelTabelaProdutosLayout.setHorizontalGroup(
            jPanelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanelTabelaProdutosLayout.setVerticalGroup(
            jPanelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaProdutosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRelatoriosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRelatoriosProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("Relatório de Produtos", jPanelProdutos);

        jPanelVendas.setMaximumSize(new java.awt.Dimension(843, 431));
        jPanelVendas.setMinimumSize(new java.awt.Dimension(843, 431));
        jPanelVendas.setPreferredSize(new java.awt.Dimension(843, 431));

        jPanelMenuRelatorioVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMenuRelatorioVendas.setMaximumSize(new java.awt.Dimension(255, 419));
        jPanelMenuRelatorioVendas.setMinimumSize(new java.awt.Dimension(255, 419));

        jPanelFiltrosVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFiltrosVenda.setMaximumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosVenda.setMinimumSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosVenda.setPreferredSize(new java.awt.Dimension(922, 56));
        jPanelFiltrosVenda.setLayout(new java.awt.GridBagLayout());

        jButtonListarVendas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonListarVendas.setText("Listar");
        jButtonListarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarVendasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 8);
        jPanelFiltrosVenda.add(jButtonListarVendas, gridBagConstraints);

        jLabelDataInicial2.setText("Data Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        jPanelFiltrosVenda.add(jLabelDataInicial2, gridBagConstraints);

        jLabelDataFinal2.setText("Data Final");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosVenda.add(jLabelDataFinal2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 0, 0);
        jPanelFiltrosVenda.add(jDateChooserDataInicial2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 0, 0);
        jPanelFiltrosVenda.add(jDateChooserDataFinal2, gridBagConstraints);

        jTextFieldBuscarPor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPor2KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 204;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 2, 0);
        jPanelFiltrosVenda.add(jTextFieldBuscarPor2, gridBagConstraints);

        jLabelBuscaPor1.setText("Busca por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosVenda.add(jLabelBuscaPor1, gridBagConstraints);

        jComboBoxBuscarEm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição", "Marca", "Categoria", "Grupo" }));
        jComboBoxBuscarEm2.setSelectedIndex(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosVenda.add(jComboBoxBuscarEm2, gridBagConstraints);

        jLabelBuscarEm1.setText("Buscar em:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 0);
        jPanelFiltrosVenda.add(jLabelBuscarEm1, gridBagConstraints);

        jPanelOrdenarPreco1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelOrdenarPreco1.setLayout(new java.awt.GridBagLayout());

        buttonGroupPreco.add(jRadioButtonMaior1);
        jRadioButtonMaior1.setText("Maior Preço");
        jRadioButtonMaior1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButtonMaior1MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 0);
        jPanelOrdenarPreco1.add(jRadioButtonMaior1, gridBagConstraints);

        buttonGroupPreco.add(jRadioButtonMenor1);
        jRadioButtonMenor1.setText("Menor Preço");
        jRadioButtonMenor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButtonMenor1MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 2, 8);
        jPanelOrdenarPreco1.add(jRadioButtonMenor1, gridBagConstraints);

        jLabelLabelOrdenar1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelOrdenar1.setText("Ordenar Por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 0, 0);
        jPanelOrdenarPreco1.add(jLabelLabelOrdenar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 0);
        jPanelFiltrosVenda.add(jPanelOrdenarPreco1, gridBagConstraints);

        jPanelPanelRecebimentos2.setBackground(new java.awt.Color(0, 102, 153));
        jPanelPanelRecebimentos2.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLabelRecebimentos2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLabelRecebimentos2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelRecebimentos2.setText("RELATÓRIO DE VENDAS");

        javax.swing.GroupLayout jPanelPanelRecebimentos2Layout = new javax.swing.GroupLayout(jPanelPanelRecebimentos2);
        jPanelPanelRecebimentos2.setLayout(jPanelPanelRecebimentos2Layout);
        jPanelPanelRecebimentos2Layout.setHorizontalGroup(
            jPanelPanelRecebimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelRecebimentos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelRecebimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanelRecebimentos2Layout.setVerticalGroup(
            jPanelPanelRecebimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelRecebimentos2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuRelatorioVendasLayout = new javax.swing.GroupLayout(jPanelMenuRelatorioVendas);
        jPanelMenuRelatorioVendas.setLayout(jPanelMenuRelatorioVendasLayout);
        jPanelMenuRelatorioVendasLayout.setHorizontalGroup(
            jPanelMenuRelatorioVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPanelRecebimentos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuRelatorioVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltrosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuRelatorioVendasLayout.setVerticalGroup(
            jPanelMenuRelatorioVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuRelatorioVendasLayout.createSequentialGroup()
                .addComponent(jPanelPanelRecebimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFiltrosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabelaVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTabelaVendas.setMaximumSize(new java.awt.Dimension(938, 322));
        jPanelTabelaVendas.setMinimumSize(new java.awt.Dimension(938, 322));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVendas, jTableVendas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.proCodigo}"));
        columnBinding.setColumnName("Cód. Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.proDescricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.categoria.catCategoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.grupo.gruDescricao}"));
        columnBinding.setColumnName("Grupo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.marcaProduto.mapMarcaProduto}"));
        columnBinding.setColumnName("Marca");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvQuantidade}"));
        columnBinding.setColumnName("Quant.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda.venDataVenda}"));
        columnBinding.setColumnName("Data Venda");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvValorTotal}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTableVendas);
        if (jTableVendas.getColumnModel().getColumnCount() > 0) {
            jTableVendas.getColumnModel().getColumn(0).setResizable(false);
            jTableVendas.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableVendas.getColumnModel().getColumn(1).setResizable(false);
            jTableVendas.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableVendas.getColumnModel().getColumn(2).setResizable(false);
            jTableVendas.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableVendas.getColumnModel().getColumn(3).setResizable(false);
            jTableVendas.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTableVendas.getColumnModel().getColumn(4).setResizable(false);
            jTableVendas.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableVendas.getColumnModel().getColumn(5).setResizable(false);
            jTableVendas.getColumnModel().getColumn(5).setPreferredWidth(2);
            jTableVendas.getColumnModel().getColumn(6).setResizable(false);
            jTableVendas.getColumnModel().getColumn(6).setPreferredWidth(40);
            jTableVendas.getColumnModel().getColumn(7).setResizable(false);
            jTableVendas.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanelTabelaVendasLayout = new javax.swing.GroupLayout(jPanelTabelaVendas);
        jPanelTabelaVendas.setLayout(jPanelTabelaVendasLayout);
        jPanelTabelaVendasLayout.setHorizontalGroup(
            jPanelTabelaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanelTabelaVendasLayout.setVerticalGroup(
            jPanelTabelaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaVendasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenuRelatorioVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabelaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabelaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneRelatorios.addTab("Relatório de Vendas", jPanelVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelClientesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelClientesComponentShown

    }//GEN-LAST:event_jPanelClientesComponentShown

    private void jTextFieldBuscarPorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPorKeyTyped
        if(jComboBoxBuscarEm.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldBuscarPorKeyTyped

    private void jTextFieldBuscarPorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPorKeyReleased
        atualizaTabelaCliente();
    }//GEN-LAST:event_jTextFieldBuscarPorKeyReleased

    private void jTextFieldBuscarPor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPor1KeyReleased
        atualizaTabelaProduto();
    }//GEN-LAST:event_jTextFieldBuscarPor1KeyReleased

    private void jRadioButtonMaiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMaiorMouseReleased
        atualizaTabelaProduto();
    }//GEN-LAST:event_jRadioButtonMaiorMouseReleased

    private void jRadioButtonMenorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenorMouseReleased
        atualizaTabelaProduto();
    }//GEN-LAST:event_jRadioButtonMenorMouseReleased

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        atualizaTabelaCliente();
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jTextFieldBuscarPor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPor2KeyReleased
        atualizaTabelaVendas();
    }//GEN-LAST:event_jTextFieldBuscarPor2KeyReleased

    private void jRadioButtonMaior1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMaior1MouseReleased
        atualizaTabelaVendas();
    }//GEN-LAST:event_jRadioButtonMaior1MouseReleased

    private void jRadioButtonMenor1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenor1MouseReleased
        atualizaTabelaVendas();
    }//GEN-LAST:event_jRadioButtonMenor1MouseReleased

    private void jButtonListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarClientesActionPerformed
        atualizaTabelaCliente();
    }//GEN-LAST:event_jButtonListarClientesActionPerformed

    private void jButtonListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarProdutosActionPerformed
        atualizaTabelaProduto();
    }//GEN-LAST:event_jButtonListarProdutosActionPerformed

    private void jButtonListarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarVendasActionPerformed
        atualizaTabelaVendas();
    }//GEN-LAST:event_jButtonListarVendasActionPerformed
        
    public void imprimirRelatorio(){
        String arquivo = "relatorios/Clientes.jasper";
        java.io.InputStream file = getClass().getClassLoader().getResourceAsStream(arquivo);
        Map parametros = new HashMap();
        
    }
    
    private void atualizaTabelaCliente(){
        entityManager.clear();
        String ejbql = "from Cliente c ";
        String status = jComboBoxStatus.getSelectedItem().toString().equals("Ativos") ? "TRUE" : "FALSE";
        String campoPesquisa = "";
        if(jComboBoxBuscarEm.getSelectedItem().toString().equals("Nome")){
            campoPesquisa = "c.cliNome";
            String filtro = jTextFieldBuscarPor.getText();
            if(filtro.length() > 0 && !jComboBoxStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = '" + status + "'";
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }else if(jComboBoxBuscarEm.getSelectedItem().toString().equals("Endereço")){
            campoPesquisa = "c.cliEndereco";
            String filtro = jTextFieldBuscarPor.getText();
            if(filtro.length() > 0 && !jComboBoxStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = " + status;
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }else if(jComboBoxBuscarEm.getSelectedItem().toString().equals("E-mail")){
            campoPesquisa = "c.cliEmail";
            String filtro = jTextFieldBuscarPor.getText();
            if(filtro.length() > 0 && !jComboBoxStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = " + status;
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }else if(jComboBoxBuscarEm.getSelectedItem().toString().equals("Celular")){
            campoPesquisa = "c.cliCelular";
            String filtro = jTextFieldBuscarPor.getText();
            if(filtro.length() > 0 && !jComboBoxStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = " + status;
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }else if(jComboBoxBuscarEm.getSelectedItem().toString().equals("Telefone")){
            campoPesquisa = "c.cliTelefone";
            String filtro = jTextFieldBuscarPor.getText();
            if(filtro.length() > 0 && !jComboBoxStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = " + status;
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }
        ejbql += " order by " + campoPesquisa;
        queryCliente = entityManager.createQuery(ejbql);
        listCliente.clear();
        listCliente.addAll(queryCliente.getResultList());
        int linha = listCliente.size() - 1;
        if(listCliente.size() > 0){
            jTableClientes.scrollRectToVisible(jTableClientes.getCellRect(linha, linha, true));
        }else{
            //jLabelMensagem.setText("Cliente não cadastrado no sistema!");
        }
        if(listCliente.size() == 1){
            jTableClientes.setRowSelectionInterval(linha, linha);
        }
    } 
    
    private void atualizaTabelaProduto(){
        entityManager.clear();
        String ejbql = "from Produto p ";
        String campoPesquisa = "";
        if(jComboBoxBuscarEm1.getSelectedItem().toString().equals("Descrição")){
            campoPesquisa = "p.proDescricao";
            String filtro = jTextFieldBuscarPor1.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%'";
            }
        }else if(jComboBoxBuscarEm1.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "p.proCodigo";
            String filtro = jTextFieldBuscarPor1.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%'";
            }
        }else if(jComboBoxBuscarEm1.getSelectedItem().toString().equals("Marca")){
            campoPesquisa = "p.marcaProduto.mapMarcaProduto";
            String filtro = jTextFieldBuscarPor1.getText();
            if(filtro.length() > 0){
                ejbql = "from Produto p join MarcaProduto m on p.marcaProduto.idMarcaProduto = m.idMarcaProduto "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }else if(jComboBoxBuscarEm1.getSelectedItem().toString().equals("Grupo")){
            campoPesquisa = "p.grupo.gruDescricao";
            String filtro = jTextFieldBuscarPor1.getText();
            if(filtro.length() > 0){
                ejbql = "from Produto p join Grupo g on p.grupo.idGrupo = g.idGrupo "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }else if(jComboBoxBuscarEm1.getSelectedItem().toString().equals("Categoria")){
            campoPesquisa = "p.categoria.catCategoria";
            String filtro = jTextFieldBuscarPor1.getText();
            if(filtro.length() > 0){
                ejbql = "from Produto p join Categoria c on p.categoria.idCategoria = c.idCategoria "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jRadioButtonMaior.isSelected())
            ejbql += " order by p.proPrecoVenda desc";
        else if (jRadioButtonMenor.isSelected())
            ejbql += " order by p.proPrecoVenda asc";
        else
            ejbql += " order by " + campoPesquisa;
        queryProduto = entityManager.createQuery(ejbql);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());
        int linha = listProduto.size() - 1;
        if(listProduto.size() > 0){
            jTableProdutos.scrollRectToVisible(jTableProdutos.getCellRect(linha, linha, true));
        }else{
            //
        }
        if(listProduto.size() == 1){
            jTableProdutos.setRowSelectionInterval(linha, linha);
        }
    }
    
    private void atualizaTabelaVendas(){
        java.util.Date dataInicial2 = (java.util.Date)jDateChooserDataInicial2.getDate();
        java.util.Date dataFinal2 = (java.util.Date)jDateChooserDataFinal2.getDate();
        
        SimpleDateFormat dtFormato = new SimpleDateFormat("yyyy-MM-dd");
        
        entityManager.clear();
        String ejbql = "from ItemDaVenda itv where itv.idItemVenda > 0 ";
        String campoPesquisa = "";
        if(jComboBoxBuscarEm2.getSelectedItem().toString().equals("Descrição")){
            campoPesquisa = "itv.produto.proDescricao";
            String filtro = jTextFieldBuscarPor2.getText();
            if(filtro.length() > 0){
                ejbql = "from ItemDaVenda itv where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%' AND itv.venda.venOrcamento = 'FALSE'";
            }
        }else if(jComboBoxBuscarEm2.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "itv.produto.proCodigo";
            String filtro = jTextFieldBuscarPor2.getText();
            if(filtro.length() > 0){
                ejbql = "from ItemDaVenda itv where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%' AND itv.venda.venOrcamento = 'FALSE'";
            }
        }else if(jComboBoxBuscarEm2.getSelectedItem().toString().equals("Marca")){
            campoPesquisa = "itv.produto.marcaProduto.mapMarcaProduto";
            String filtro = jTextFieldBuscarPor2.getText();
            if(filtro.length() > 0){
                ejbql = "from ItemDaVenda itv join MarcaProduto m on itv.produto.marcaProduto.idMarcaProduto = m.idMarcaProduto "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%' AND itv.venda.venOrcamento = 'FALSE'";
            }
        }else if(jComboBoxBuscarEm2.getSelectedItem().toString().equals("Grupo")){
            campoPesquisa = "itv.produto.grupo.gruDescricao";
            String filtro = jTextFieldBuscarPor2.getText();
            if(filtro.length() > 0){
                ejbql = "from ItemDaVenda itv join Grupo g on itv.produto.grupo.idGrupo = g.idGrupo "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%' AND itv.venda.venOrcamento = 'FALSE'";
            }
        }else if(jComboBoxBuscarEm2.getSelectedItem().toString().equals("Categoria")){
            campoPesquisa = "itv.produto.categoria.catCategoria";
            String filtro = jTextFieldBuscarPor2.getText();
            if(filtro.length() > 0){
                ejbql = "from ItemDaVenda itv join Categoria c on itv.produto.categoria.idCategoria = c.idCategoria "
                        + "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%' AND itv.venda.venOrcamento = 'FALSE'";
            }
        }
        if(!jDateChooserDataInicial1.equals("") && (!jDateChooserDataFinal2.equals(""))){
            ejbql += " AND itv.venda.venDataVenda BETWEEN '" + dtFormato.format(dataInicial2) + "' AND '" + dtFormato.format(dataFinal2) + "'";
        }
        if(jRadioButtonMaior1.isSelected())
            ejbql += " order by itv.itvPrecoUnitario desc";
        else if (jRadioButtonMenor1.isSelected())
            ejbql += " order by itv.itvPrecoUnitario asc";
        else
            ejbql += " order by " + campoPesquisa;
        queryVendas = entityManager.createQuery(ejbql);
        listVendas.clear();
        listVendas.addAll(queryVendas.getResultList());
        int linha = listVendas.size() - 1;
        if(listVendas.size() > 0){
            jTableVendas.scrollRectToVisible(jTableVendas.getCellRect(linha, linha, true));
        }else{
            //
        }
        if(listVendas.size() == 1){
            jTableVendas.setRowSelectionInterval(linha, linha);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPreco;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonListarClientes;
    private javax.swing.JButton jButtonListarProdutos;
    private javax.swing.JButton jButtonListarVendas;
    private javax.swing.JComboBox<String> jComboBoxBuscarEm;
    private javax.swing.JComboBox<String> jComboBoxBuscarEm1;
    private javax.swing.JComboBox<String> jComboBoxBuscarEm2;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal1;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal2;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial1;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial2;
    private javax.swing.JLabel jLabelBuscaPor1;
    private javax.swing.JLabel jLabelBuscarEm1;
    private javax.swing.JLabel jLabelDataFinal;
    private javax.swing.JLabel jLabelDataFinal1;
    private javax.swing.JLabel jLabelDataFinal2;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelDataInicial1;
    private javax.swing.JLabel jLabelDataInicial2;
    private javax.swing.JLabel jLabelLabelBuscaEm;
    private javax.swing.JLabel jLabelLabelBuscaPor;
    private javax.swing.JLabel jLabelLabelBuscaPor1;
    private javax.swing.JLabel jLabelLabelBuscarEm1;
    private javax.swing.JLabel jLabelLabelOrdenar;
    private javax.swing.JLabel jLabelLabelOrdenar1;
    private javax.swing.JLabel jLabelLabelRecebimentos;
    private javax.swing.JLabel jLabelLabelRecebimentos1;
    private javax.swing.JLabel jLabelLabelRecebimentos2;
    private javax.swing.JLabel jLabelLabelSituacao;
    private javax.swing.JLabel jLabelLabelStatus;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelFiltrosClientes;
    private javax.swing.JPanel jPanelFiltrosProdutos;
    private javax.swing.JPanel jPanelFiltrosVenda;
    private javax.swing.JPanel jPanelMenuRelatorioVendas;
    private javax.swing.JPanel jPanelOrdenarPreco;
    private javax.swing.JPanel jPanelOrdenarPreco1;
    private javax.swing.JPanel jPanelPanelRecebimentos;
    private javax.swing.JPanel jPanelPanelRecebimentos1;
    private javax.swing.JPanel jPanelPanelRecebimentos2;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JPanel jPanelRelatoriosClientes;
    private javax.swing.JPanel jPanelRelatoriosProdutos;
    private javax.swing.JPanel jPanelTabelaClientes;
    private javax.swing.JPanel jPanelTabelaProdutos;
    private javax.swing.JPanel jPanelTabelaVendas;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JRadioButton jRadioButtonMaior;
    private javax.swing.JRadioButton jRadioButtonMaior1;
    private javax.swing.JRadioButton jRadioButtonMenor;
    private javax.swing.JRadioButton jRadioButtonMenor1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneRelatorios;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldBuscarPor;
    private javax.swing.JTextField jTextFieldBuscarPor1;
    private javax.swing.JTextField jTextFieldBuscarPor2;
    private java.util.List<Parcela> listAReceber;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Produto> listProduto;
    private java.util.List<Movimento> listRecebimentos;
    private java.util.List<Parcela> listSituacaoCliente;
    private java.util.List<ItemDaVenda> listVendas;
    private javax.persistence.Query queryAReceber;
    private javax.persistence.Query queryCliente;
    private javax.persistence.Query queryProduto;
    private javax.persistence.Query queryRecebimentos;
    private javax.persistence.Query querySituacaoCliente;
    private javax.persistence.Query queryVendas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
