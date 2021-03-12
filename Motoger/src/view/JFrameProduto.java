package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Grupo;
import model.MarcaProduto;
import model.Produto;

public class JFrameProduto extends javax.swing.JDialog {

    public JFrameProduto() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaTabela();
        atualizaControles();
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p order by p.proDescricao");
        listProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProduto.getResultList());
        queryCategoria = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Categoria c order by c.idCategoria");
        listCategoria = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCategoria.getResultList());
        queryGrupo = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Grupo g order by g.gruDescricao");
        listGrupo = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryGrupo.getResultList());
        queryMarcaProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from MarcaProduto mp order by mp.idMarcaProduto");
        listMarcaProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryMarcaProduto.getResultList());
        listCategoriaDoProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new Vector<Categoria>())
        ;
        listMarcaProdutoDoProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new Vector<MarcaProduto>())
        ;
        listGrupoDoProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new Vector<Grupo>())
        ;
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jTabbedPaneDadosPessoais = new javax.swing.JTabbedPane();
        jPanelDados = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelLabelCodigo = new javax.swing.JLabel();
        jLabelLabelStatus = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jPanelMeio = new javax.swing.JPanel();
        jPanelIdentificacao = new javax.swing.JPanel();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabelMarca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabelGrupo = new javax.swing.JLabel();
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        jButtonAddCategoria = new javax.swing.JButton();
        jButtonAddGrupo = new javax.swing.JButton();
        jButtonAddMarca = new javax.swing.JButton();
        jButtonRefreshCategoria = new javax.swing.JButton();
        jButtonRefreshMarca = new javax.swing.JButton();
        jButtonRefreshGrupo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelPrecoVenda = new javax.swing.JLabel();
        jLabelEstoqueInicial = new javax.swing.JLabel();
        jLabelEstoqueAtual = new javax.swing.JLabel();
        jTextFieldEstoqueAtual = new javax.swing.JTextField();
        jTextFieldEstoqueInicial = new javax.swing.JTextField();
        jTextFieldPrecoVenda = new javax.swing.JTextField();
        jLabelEstoqueMinimo = new javax.swing.JLabel();
        jTextFieldEstoqueMinimo = new javax.swing.JTextField();
        jPanelFoto = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelPatch = new javax.swing.JLabel();
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
        setTitle("CADASTRO DE PRODUTOS");
        setMaximumSize(new java.awt.Dimension(748, 527));
        setMinimumSize(new java.awt.Dimension(748, 527));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDados.setFocusable(false);
        jTableDados.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proCodigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proDescricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proPrecoVenda}"));
        columnBinding.setColumnName("Preço");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proEstoqueAtual}"));
        columnBinding.setColumnName("Estoque");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(model.Categoria.class);
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
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(290);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTableDados.getColumnModel().getColumn(4).setResizable(false);
            jTableDados.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanelDados.setMaximumSize(new java.awt.Dimension(740, 323));
        jPanelDados.setMinimumSize(new java.awt.Dimension(740, 323));

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLabelCodigo.setText("Código:");

        jLabelLabelStatus.setText("Status:");

        jLabelStatus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelStatus.setText("---");

        jTextFieldDescricao.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proDescricao}"), jTextFieldDescricao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelDescricao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelDescricao.setText("DESCRIÇÃO:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proCodigo}"), jTextFieldCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLabelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStatus)
                .addGap(72, 72, 72))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelCodigo)
                    .addComponent(jLabelLabelStatus)
                    .addComponent(jLabelStatus)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelMeio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMeio.setMaximumSize(new java.awt.Dimension(466, 162));
        jPanelMeio.setMinimumSize(new java.awt.Dimension(466, 162));

        jPanelIdentificacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelIdentificacao.setMaximumSize(new java.awt.Dimension(229, 151));
        jPanelIdentificacao.setMinimumSize(new java.awt.Dimension(229, 151));

        jLabelCategoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelCategoria.setText("CATEGORIA:");

        jComboBoxCategoria.setNextFocusableComponent(jComboBoxGrupo);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCategoria, jComboBoxCategoria);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabelMarca.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelMarca.setText("MARCA:");

        jComboBoxMarca.setNextFocusableComponent(jTextFieldPrecoVenda);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listMarcaProduto, jComboBoxMarca);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabelGrupo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelGrupo.setText("GRUPO:");

        jComboBoxGrupo.setNextFocusableComponent(jComboBoxMarca);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listGrupo, jComboBoxGrupo);
        bindingGroup.addBinding(jComboBoxBinding);

        jButtonAddCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-16.png"))); // NOI18N
        jButtonAddCategoria.setToolTipText("Adicionar Nova Categoria");
        jButtonAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCategoriaActionPerformed(evt);
            }
        });

        jButtonAddGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-16.png"))); // NOI18N
        jButtonAddGrupo.setToolTipText("Adicionar Novo Grupo");
        jButtonAddGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddGrupoActionPerformed(evt);
            }
        });

        jButtonAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-16.png"))); // NOI18N
        jButtonAddMarca.setToolTipText("Adicionar Nova Marca");
        jButtonAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMarcaActionPerformed(evt);
            }
        });

        jButtonRefreshCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizar-16.png"))); // NOI18N
        jButtonRefreshCategoria.setToolTipText("Atualizar Categorias");
        jButtonRefreshCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshCategoriaActionPerformed(evt);
            }
        });

        jButtonRefreshMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizar-16.png"))); // NOI18N
        jButtonRefreshMarca.setToolTipText("Atualizar Marcas");
        jButtonRefreshMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshMarcaActionPerformed(evt);
            }
        });

        jButtonRefreshGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizar-16.png"))); // NOI18N
        jButtonRefreshGrupo.setToolTipText("Atualizar Grupos");
        jButtonRefreshGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIdentificacaoLayout = new javax.swing.GroupLayout(jPanelIdentificacao);
        jPanelIdentificacao.setLayout(jPanelIdentificacaoLayout);
        jPanelIdentificacaoLayout.setHorizontalGroup(
            jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonRefreshCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelGrupo))
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonAddGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonRefreshGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelMarca))
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonRefreshMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelIdentificacaoLayout.setVerticalGroup(
            jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelCategoria)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddCategoria)
                    .addComponent(jButtonRefreshCategoria))
                .addGap(2, 2, 2)
                .addComponent(jLabelGrupo)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddGrupo)
                    .addComponent(jButtonRefreshGrupo))
                .addGap(4, 4, 4)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jLabelMarca)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddMarca)
                            .addComponent(jButtonRefreshMarca)))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(215, 146));
        jPanel1.setMinimumSize(new java.awt.Dimension(215, 146));

        jLabelPrecoVenda.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelPrecoVenda.setText("PREÇO DE VENDA:");

        jLabelEstoqueInicial.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelEstoqueInicial.setText("ESTOQUE INICIAL:");

        jLabelEstoqueAtual.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelEstoqueAtual.setText("ESTOQUE ATUAL:");

        jTextFieldEstoqueAtual.setEditable(false);
        jTextFieldEstoqueAtual.setBackground(java.awt.SystemColor.controlHighlight);
        jTextFieldEstoqueAtual.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proEstoqueAtual}"), jTextFieldEstoqueAtual, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldEstoqueInicial.setNextFocusableComponent(jTextFieldEstoqueMinimo);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proEstoqueInicial}"), jTextFieldEstoqueInicial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldEstoqueInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEstoqueInicialFocusLost(evt);
            }
        });
        jTextFieldEstoqueInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEstoqueInicialKeyTyped(evt);
            }
        });

        jTextFieldPrecoVenda.setNextFocusableComponent(jTextFieldEstoqueInicial);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proPrecoVenda}"), jTextFieldPrecoVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPrecoVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPrecoVendaFocusLost(evt);
            }
        });
        jTextFieldPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecoVendaKeyTyped(evt);
            }
        });

        jLabelEstoqueMinimo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelEstoqueMinimo.setText("ESTOQUE MÍNIMO:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proEstoqueMinimo}"), jTextFieldEstoqueMinimo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldEstoqueMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEstoqueMinimoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEstoqueMinimo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEstoqueInicial)
                                .addComponent(jLabelEstoqueAtual)))
                        .addComponent(jLabelPrecoVenda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrecoVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jTextFieldEstoqueInicial)
                    .addComponent(jTextFieldEstoqueAtual)
                    .addComponent(jTextFieldEstoqueMinimo))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecoVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstoqueInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstoqueInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstoqueAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstoqueMinimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFoto.setMaximumSize(new java.awt.Dimension(243, 146));
        jPanelFoto.setMinimumSize(new java.awt.Dimension(243, 146));
        jPanelFoto.setPreferredSize(new java.awt.Dimension(243, 146));

        jLabelFoto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelFoto.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelPatch.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.proFoto}"), jLabelPatch, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelPatch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabelPatchPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jPanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPatch)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
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
                .addGap(0, 152, Short.MAX_VALUE)
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
        jButtonNovo.setToolTipText("Adicionar um novo produto");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButtonSalvar.setToolTipText("Gravar o novo produto no banco de dados");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButtonAlterar.setToolTipText("Alterar dados do cadastro do produto");
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
        jButtonExcluir.setToolTipText("Excluir o cadastro do produto");
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
        jButtonImprimir.setToolTipText("Imprimir relatórios de produtos cadastrados");
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
        jButtonSair.setToolTipText("Sair da tela de Cadastro de Produtos");
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

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição" }));
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

        jButtonAdicionarFoto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonAdicionarFoto.setText("Adicionar Foto");
        jButtonAdicionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFotoActionPerformed(evt);
            }
        });

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
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBarComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdicionarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(764, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Produto...");
        jTextFieldCodigo.requestFocus();
        listProduto.add(new Produto());
        int linha = listProduto.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        atualizaComboBox();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * Função para carregar os elementos do jComboBoxCategoria
     */
    private void categoriaDoProduto(){
        String ejbqlCat = "from Categoria c where c.catCategoria = '" 
                + jComboBoxCategoria.getSelectedItem() + "'";
        queryCategoria = entityManager.createQuery(ejbqlCat);
        listCategoriaDoProduto.clear();
        listCategoriaDoProduto.addAll(queryCategoria.getResultList());
    }
    
    /**
     * Função para carregar os elementos do jComboBoxGrupo
    */
    private void grupoDoProduto(){
        String ejbqlGru = "from Grupo g where g.gruDescricao = '" 
                + jComboBoxGrupo.getSelectedItem() + "'";
        queryGrupo = entityManager.createQuery(ejbqlGru);
        listGrupoDoProduto.clear();
        listGrupoDoProduto.addAll(queryGrupo.getResultList());
    }
    
    /**
     * Função para carregar os elementos do jComboBoxMarca
    */
    private void marcaProdutoDoProduto(){
        String ejbqlMar = "from MarcaProduto mp where mp.mapMarcaProduto = '" 
                + jComboBoxMarca.getSelectedItem() + "'";
        queryMarcaProduto = entityManager.createQuery(ejbqlMar);
        listMarcaProdutoDoProduto.clear();
        listMarcaProdutoDoProduto.addAll(queryMarcaProduto.getResultList());
    }
    
    /**
     * Função que atualiza o jComboBoxCategoria para mostrar apenas a Categoria 
     * setada para o Produto
     */
    private void atualizaCategoria(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            Produto pro = listProduto.get(linha);
            listCategoria.clear();
            listCategoria.add(pro.getCategoria());
        }
    }
    /**
     * Função que atualiza o jComboBoxGrupo para mostrar apenas o Grupo setado 
     * para o Produto
     */
    private void atualizaGrupo(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            Produto pro = listProduto.get(linha);
            listGrupo.clear();
            listGrupo.add(pro.getGrupo());
        }
    }
    
    /**
     * Função que atualiza o jComboBoxMarcaProduto para mostrar apenas a Marca 
     * setada para o Produto
     */
    private void atualizaMarcaProduto(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            Produto pro = listProduto.get(linha);
            listMarcaProduto.clear();
            listMarcaProduto.add(pro.getMarcaProduto());
        }
    }
    
    /**
     * Função que atualiza os ComboBoxes para mostrar todas as Categorias, 
     * Grupos e Marcas
     */
    private void atualizaComboBox(){
        int linha = jTableDados.getSelectedRow();
        if(linha > -1){
            //pegar a categoria atual para selecionar a mesma quando carregar 
            //todas as categorias
            Produto pro = listProduto.get(linha);
            listCategoriaDoProduto.clear();
            listCategoriaDoProduto.add(pro.getCategoria());
            listGrupoDoProduto.clear();
            listGrupoDoProduto.add(pro.getGrupo());
            listMarcaProdutoDoProduto.clear();
            listMarcaProdutoDoProduto.add(pro.getMarcaProduto());
        }
        String cat = "from Categoria c order by c.catCategoria";
        queryCategoria = entityManager.createQuery(cat);
        listCategoria.clear();
        listCategoria.addAll(queryCategoria.getResultList());
        jComboBoxCategoria.setSelectedItem(listCategoriaDoProduto.get(0));
        String gru = "from Grupo g order by g.gruDescricao";
        queryGrupo = entityManager.createQuery(gru);
        listGrupo.clear();
        listGrupo.addAll(queryGrupo.getResultList());
        jComboBoxGrupo.setSelectedItem(listGrupoDoProduto.get(0));
        String map = "from MarcaProduto mp order by mp.mapMarcaProduto";
        queryMarcaProduto = entityManager.createQuery(map);
        listMarcaProduto.clear();
        listMarcaProduto.addAll(queryMarcaProduto.getResultList());
        jComboBoxMarca.setSelectedItem(listMarcaProdutoDoProduto.get(0));
    }
    
    /**
     * Função que retorna 0 se houverem campos obrigatórios não preenchidos
     * e retorna 1 caso todos estejam preenchidos
     * @return 
     */
    private int validaCampos(){
        if(jTextFieldCodigo.getText().equals("") || 
                jTextFieldDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos "
                    + "obrigatórios em azul");
            jTextFieldCodigo.requestFocus();
            jTextFieldCodigo.setBackground(Color.CYAN);
            jTextFieldDescricao.setBackground(Color.CYAN);
            if(!jTextFieldCodigo.getText().equals(""))
                jTextFieldCodigo.setBackground(Color.WHITE);
            if(!jTextFieldDescricao.getText().equals(""))
                jTextFieldDescricao.setBackground(Color.WHITE);
            return 0;
        }
        if(jComboBoxCategoria.getSelectedIndex() == -1 ||
                jComboBoxGrupo.getSelectedIndex() == -1 ||
                jComboBoxMarca.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione 'CATEGORIA', 'GRUPO' E 'MARCA'");
            return 0;
        }
        return 1;
    }
        
    private void copiaFoto(String nome) throws IOException {
        InputStream in = new FileInputStream(jLabelPatch.getText());
        OutputStream out = new FileOutputStream("\\Motoger\\src\\images\\fotos\\"+nome);
        //OutputStream out = new FileOutputStream("\\ADS6\\TCC2\\Motoger\\src\\images\\fotos\\"+nome);
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0){
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        jLabelPatch.setText("\\Motoger\\src\\images\\fotos\\"+nome);
        //jLabelPatch.setText("\\ADS6\\TCC2\\Motoger\\src\\images\\fotos\\"+nome);
        JLabel jLabelFoto = new JLabel();
        jLabelFoto.repaint();
        jLabelFoto.setIcon(new ImageIcon(jLabelPatch.getText()));
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Produto pro = listProduto.get(linhaSelecionada);
            categoriaDoProduto();
            grupoDoProduto();
            marcaProdutoDoProduto();
            //Envia o List com a Categoria selecionada para o model.Produto
            pro.adicionaCategoria(listCategoriaDoProduto.get(0));
            //Envia o List com o Grupo selecionado para o model.Grupo
            pro.adicionarGrupo(listGrupoDoProduto.get(0));
            //Envia o List com a Marca selecionada para o model.Marca
            pro.adicionarMarcaProduto(listMarcaProdutoDoProduto.get(0));
            try {
               entityManager.getTransaction().begin();
               entityManager.persist(pro);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados do Produto alterados!");
                } else {
                    jLabelMensagem.setText("Produto cadastrado!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, o produto"
                        + " não foi cadastrado!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, o produto não foi "
                        + "cadastrado!");
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

    private void Cancelar(){
        jTableDados.clearSelection();
        limparCampos();
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        atualizaTabela();
        statusInicial(true);
        controlePesquisa(true);
        atualizaControles();
        jTableDados.setEnabled(true);
        jTextFieldCampoPesquisa.setEnabled(true);
        atualizaComboBox();
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldDescricao.getText().equals("") && 
                (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que"
                    + " deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                Cancelar();
            }
        } else {
            Cancelar();
        }        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldDescricao.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados do produto...");
            statusInicial(false);
            controlePesquisa(false);
            controleAlteracao(true);
            atualizaComboBox();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem "
                    + "certeza que deseja excluir o produto? Essa operação não "
                    + "poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Produto pro = listProduto.get(linhaSelecionada);
                try  {
                    entityManager.getTransaction().begin();
                    entityManager.remove(pro);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Produto excluído com sucesso!");
                } catch (Exception e) {
                    if (e.getMessage().contains("chave estrangeira")){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "produto não foi excluído!\nErro: Produto está associado a uma ou mais vendas");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "produto não foi excluído!\nErro: " + e);
                    }                   
                    jLabelMensagem.setText("Ocorreu um erro, o produto não foi "
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
        if(!jTextFieldDescricao.getText().equals("") && 
                (!jLabelEstado.getText().equals("Início"))){
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Tem "
                    + "certeza que deseja fechar o programa? Os dados não "
                    + "salvos serão perdidos!");
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

    private void jTextFieldEstoqueInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueInicialFocusLost
        if(jTextFieldEstoqueAtual.getText().equals(""))
            jTextFieldEstoqueAtual.setText(jTextFieldEstoqueInicial.getText());
    }//GEN-LAST:event_jTextFieldEstoqueInicialFocusLost

    private void jTextFieldPrecoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPrecoVendaFocusGained
        if(jTextFieldPrecoVenda.getText().equals("0.0"))
            jTextFieldPrecoVenda.setText("");
    }//GEN-LAST:event_jTextFieldPrecoVendaFocusGained

    private void jTextFieldPrecoVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecoVendaKeyTyped
        String virgula=",";
        if(virgula.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldPrecoVenda.setText(jTextFieldPrecoVenda.getText() + ".");
        }
        String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPrecoVendaKeyTyped

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && 
                (!jLabelEstado.getText().equals("Inserção"))))){
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
        if(!jLabelEstado.getText().equals("Alteração")){
            atualizaCategoria();
            atualizaGrupo();
            atualizaMarcaProduto();
        }
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR "
                    + "a operação atual!");
    }//GEN-LAST:event_jTableDadosMouseReleased

    /**
     * Função seta o jLabelPatch com o caminho absoluto do arquivo de imagem selecionado.
     * @param evt 
     */
    private void jButtonAdicionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String caminho = f.getAbsolutePath();
        jLabelPatch.setText(caminho);
        String filename = f.getName();
        try {
            copiaFoto(filename);
        } catch (IOException ex) {
            Logger.getLogger(JFrameProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdicionarFotoActionPerformed

    private void jLabelPatchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabelPatchPropertyChange
        jLabelFoto.setIcon(new ImageIcon(jLabelPatch.getText()));
    }//GEN-LAST:event_jLabelPatchPropertyChange

    private void jTextFieldPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPrecoVendaFocusLost
        if(jTextFieldPrecoVenda.getText().equals(""))
            jTextFieldPrecoVenda.setText("0.0");
    }//GEN-LAST:event_jTextFieldPrecoVendaFocusLost

    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        //
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaActionPerformed
        atualizaTabela();
    }//GEN-LAST:event_jComboBoxTipoPesquisaActionPerformed

    /**
     * Abre o jFrameCategoria para cadastrar uma nova categoria sem a necessidade
     * de fechar ou cancelar o cadastro de produto em andamento
     * @param evt 
     */
    private void jButtonAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCategoriaActionPerformed
        JFrameCategoria cadCategoria = new JFrameCategoria();
        cadCategoria.setLocationRelativeTo(this);
        cadCategoria.setVisible(true);
        jButtonRefreshCategoriaActionPerformed(evt);
    }//GEN-LAST:event_jButtonAddCategoriaActionPerformed

    /**
     * Abre o jFrameGrupo para cadastrar um novo grupo sem a necessidade de fechar
     * ou cancelar o cadastro de produto em andamento
     * @param evt 
     */
    private void jButtonAddGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddGrupoActionPerformed
        JFrameGrupo cadGrupo = new JFrameGrupo();
        cadGrupo.setLocationRelativeTo(this);
        cadGrupo.setVisible(true);
        jButtonRefreshGrupoActionPerformed(evt);
    }//GEN-LAST:event_jButtonAddGrupoActionPerformed

    /**
     * Abre o jFrameMarca para cadastrar uma nova marca sem a necessidade de fechar
     * ou cancelar o cadastro de produto em andamento
     * @param evt 
     */
    private void jButtonAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMarcaActionPerformed
        JFrameMarcaProduto cadMarca = new JFrameMarcaProduto();
        cadMarca.setLocationRelativeTo(this);
        cadMarca.setVisible(true);
        jButtonRefreshMarcaActionPerformed(evt);
    }//GEN-LAST:event_jButtonAddMarcaActionPerformed

    /**
     * Atualiza o jComboBoxCategoria
     * @param evt 
     */
    private void jButtonRefreshCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshCategoriaActionPerformed
        String cat = "from Categoria c order by c.catCategoria";
        queryCategoria = entityManager.createQuery(cat);
        listCategoria.clear();
        listCategoria.addAll(queryCategoria.getResultList());
    }//GEN-LAST:event_jButtonRefreshCategoriaActionPerformed

    /**
     * Atualiza o jComboBoxMarca
     * @param evt 
     */
    private void jButtonRefreshMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshMarcaActionPerformed
        String map = "from MarcaProduto mp order by mp.mapMarcaProduto";
        queryMarcaProduto = entityManager.createQuery(map);
        listMarcaProduto.clear();
        listMarcaProduto.addAll(queryMarcaProduto.getResultList());
    }//GEN-LAST:event_jButtonRefreshMarcaActionPerformed

    /**
     * Atualiza o jComboBoxGrupo
     * @param evt 
     */
    private void jButtonRefreshGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshGrupoActionPerformed
        String gru = "from Grupo g order by g.gruDescricao";
        queryGrupo = entityManager.createQuery(gru);
        listGrupo.clear();
        listGrupo.addAll(queryGrupo.getResultList());
    }//GEN-LAST:event_jButtonRefreshGrupoActionPerformed

    private void jTextFieldEstoqueInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueInicialKeyTyped
        String virgula=",";
        if(virgula.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldEstoqueInicial.setText(jTextFieldEstoqueInicial.getText() + ".");
        }
        String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEstoqueInicialKeyTyped

    private void jTextFieldEstoqueMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueMinimoKeyTyped
        String virgula=",";
        if(virgula.contains(evt.getKeyChar()+"")){
            evt.consume();
            jTextFieldEstoqueMinimo.setText(jTextFieldEstoqueMinimo.getText() + ".");
        }
        String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEstoqueMinimoKeyTyped
        
    //função que controle o estado dos campos de entrada de texto 
    private void statusInicial(boolean status){
        jTextFieldCodigo.setEditable(!status);
        jTextFieldCodigo.setEnabled(!status);
        jTextFieldDescricao.setEnabled(!status);
        jTextFieldEstoqueInicial.setEditable(!status);
        jTextFieldEstoqueInicial.setEnabled(!status);
        jTextFieldEstoqueAtual.setEnabled(!status);
        jTextFieldEstoqueMinimo.setEnabled(!status);
        jTextFieldPrecoVenda.setEnabled(!status);
        jTextFieldPrecoVenda.setEnabled(!status);
        jTextAreaObservacoes.setEnabled(!status);
        jLabelStatus.setEnabled(!status); 
        jButtonAddCategoria.setEnabled(!status);
        jButtonAddGrupo.setEnabled(!status);
        jButtonAddMarca.setEnabled(!status);
        jButtonRefreshCategoria.setEnabled(!status);
        jButtonRefreshGrupo.setEnabled(!status);
        jButtonRefreshMarca.setEnabled(!status);
        jButtonAdicionarFoto.setEnabled(!status);
    }
    
    //função que apaga texto digitado nos campos de entrada de texto
    private void limparCampos(){
        jTextFieldCodigo.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldEstoqueInicial.setText("");
        jTextFieldEstoqueAtual.setText("");
        jTextFieldEstoqueMinimo.setText("");
        jTextFieldPrecoVenda.setText("");
        jTextFieldPrecoVenda.setText("");
        jTextAreaObservacoes.setText("");
        jLabelStatus.setText("---");
        jTextFieldCodigo.setBackground(Color.WHITE);
        jTextFieldDescricao.setBackground(Color.WHITE);
        jTextFieldEstoqueInicial.setBackground(Color.WHITE);
    }
       
    private void controleAlteracao(boolean status){
        jTextFieldCodigo.setEditable(!status);
        jTextFieldCodigo.setBackground(Color.LIGHT_GRAY);
        jTextFieldEstoqueInicial.setEditable(!status);
        jTextFieldEstoqueInicial.setBackground(Color.LIGHT_GRAY);
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
        String ejbql = "from Produto p ";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Descrição")){
            campoPesquisa = "p.proDescricao";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "p.proCodigo";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + 
                        filtro.toUpperCase() + "%'";
            }
        }
        ejbql += " order by " + campoPesquisa;
        queryProduto = entityManager.createQuery(ejbql);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());
        int linha = listProduto.size() - 1;
        if(listProduto.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Produto não cadastrado no sistema!");
        }
        if(listProduto.size() == 1){
            jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
            atualizaCategoria();
            atualizaGrupo();
            atualizaMarcaProduto();
        }else
            limparCampos();
    }
    
    /**
     * Função que atualiza o estado dos botões da barra de ferramentas
     */
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
    private javax.swing.JButton jButtonAddCategoria;
    private javax.swing.JButton jButtonAddGrupo;
    private javax.swing.JButton jButtonAddMarca;
    private javax.swing.JButton jButtonAdicionarFoto;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonRefreshCategoria;
    private javax.swing.JButton jButtonRefreshGrupo;
    private javax.swing.JButton jButtonRefreshMarca;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxGrupo;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstoqueAtual;
    private javax.swing.JLabel jLabelEstoqueInicial;
    private javax.swing.JLabel jLabelEstoqueMinimo;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelLabelCodigo;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelLabelStatus;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelPatch;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelPrecoVenda;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelDadosComplem;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JPanel jPanelIdentificacao;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPaneObservacoes;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTabbedPane jTabbedPaneDadosPessoais;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEstoqueAtual;
    private javax.swing.JTextField jTextFieldEstoqueInicial;
    private javax.swing.JTextField jTextFieldEstoqueMinimo;
    private javax.swing.JTextField jTextFieldPrecoVenda;
    private javax.swing.JToolBar jToolBarComandos;
    private java.util.List<Categoria> listCategoria;
    private java.util.List<Categoria> listCategoriaDoProduto;
    private java.util.List<Grupo> listGrupo;
    private java.util.List<Grupo> listGrupoDoProduto;
    private java.util.List<MarcaProduto> listMarcaProduto;
    private java.util.List<MarcaProduto> listMarcaProdutoDoProduto;
    private java.util.List<Produto> listProduto;
    private javax.persistence.Query queryCategoria;
    private javax.persistence.Query queryGrupo;
    private javax.persistence.Query queryMarcaProduto;
    private javax.persistence.Query queryProduto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
