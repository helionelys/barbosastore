package view;
/**
 *
 * @author Paulo Dinis Lima
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ItemDaVenda;
import model.ServicoDaVenda;
import model.Venda;

public class JFrameFinalizaOrcamento extends javax.swing.JDialog {

    private int status = 0;
    private Venda ven;

    public int getStatus() {
        return status;
    }  
    
    public JFrameFinalizaOrcamento(Venda ven) {
        initComponents();  
        this.setModal(true);
        carregaItens(ven);
        carregaServicos(ven);
        carregaDadosVenda(ven);
        somaTotal();
        this.ven = ven;
    }

    
    private void carregaItens(Venda ven){
        String ejbql = "from ItemDaVenda itv where itv.venda.idVenda = " + ven.getIdVenda();
        queryItensDoOrcamento = entityManager.createQuery(ejbql);
        listItensDoOrcamento.clear();
        listItensDoOrcamento.addAll(queryItensDoOrcamento.getResultList());
        int tam = listItensDoOrcamento.size();
        double totalitem = 0.00;
        for(int i = 0; i < tam; i++){
            totalitem += Double.parseDouble(String.valueOf(jTableProdutos.getValueAt(i, 3)));
        }
        jLabelTotalProdutos.setText(String.valueOf(totalitem));
    }
    
    private void carregaServicos(Venda ven){
        String ejbql = "from ServicoDaVenda sve where sve.venda.idVenda = " + ven.getIdVenda();
        queryServicosDoOrcamento = entityManager.createQuery(ejbql);
        listServicosDoOrcamento.clear();
        listServicosDoOrcamento.addAll(queryServicosDoOrcamento.getResultList());
        int tam = listServicosDoOrcamento.size();
        double totalserv = 0.00;
        for(int i = 0; i < tam; i++){
            totalserv += Double.parseDouble(String.valueOf(jTableServicos.getValueAt(i, 1)));
        }
        jLabelTotalServicos.setText(String.valueOf(totalserv));
    }
    
    private void somaTotal(){
        double produtos = Double.parseDouble(String.valueOf(jLabelTotalProdutos.getText()));
        double servicos = Double.parseDouble(String.valueOf(jLabelTotalServicos.getText()));
        jLabelTotalOrcamento.setText(String.valueOf(produtos + servicos));
    }
    
    private void carregaDadosVenda(Venda ven){
        jLabelCodVenda.setText(ven.getIdVenda().toString());
        jLabelCliente.setText(ven.getCliente().getCliNome().toString());
        jLabelVeiculo.setText(ven.getVeiculo().getModeloMoto().getModModelo());
        jLabelPlaca.setText(ven.getVeiculo().getVeiPlaca());
        jFormattedTextFieldData.setValue(ven.getVenDataVenda());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        listVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Venda>());
        ;
        queryItensDoOrcamento = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ItemDaVenda itv order by itv.idItemVenda");
        listItensDoOrcamento = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryItensDoOrcamento.getResultList());
        queryServicosDoOrcamento = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from ServicoDaVenda sve order by sve.idServicosVenda");
        listServicosDoOrcamento = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryServicosDoOrcamento.getResultList());
        jPanelFormaPagamento = new javax.swing.JPanel();
        jPanelVeiculo = new javax.swing.JPanel();
        jLabelLabelVeiculoPlaca = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelVeiculo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelLabelCliente = new javax.swing.JLabel();
        jPanelVenda = new javax.swing.JPanel();
        jLabelCodVenda = new javax.swing.JLabel();
        jLabelLabelCodVenda = new javax.swing.JLabel();
        jPanelBarraTitulo1 = new javax.swing.JPanel();
        jLabelLabelTituloFinalizarOrcamento = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelLabelData = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonSalvarOrcamento = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAprovarOrcamento = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jPanelTotalOrcamento = new javax.swing.JPanel();
        jLabelLabelTotalOrcamento = new javax.swing.JLabel();
        jLabelTotalOrcamento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelServicos = new javax.swing.JPanel();
        jPanelTotalServicos = new javax.swing.JPanel();
        jLabelLabelTotalServicos = new javax.swing.JLabel();
        jLabelTotalServicos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelTituloServicos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPaneParcelas = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanelTituloProdutos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelTotalProdutos = new javax.swing.JPanel();
        jLabelLabelTotalProdutos = new javax.swing.JLabel();
        jLabelTotalProdutos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FINALIZAR ORÇAMENTO");
        setMinimumSize(new java.awt.Dimension(383, 478));

        jPanelFormaPagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFormaPagamento.setMaximumSize(new java.awt.Dimension(855, 50));
        jPanelFormaPagamento.setMinimumSize(new java.awt.Dimension(855, 50));
        jPanelFormaPagamento.setPreferredSize(new java.awt.Dimension(855, 50));

        jPanelVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelVeiculo.setMaximumSize(new java.awt.Dimension(411, 35));
        jPanelVeiculo.setMinimumSize(new java.awt.Dimension(411, 35));
        jPanelVeiculo.setPreferredSize(new java.awt.Dimension(411, 35));

        jLabelLabelVeiculoPlaca.setText("Moto (Modelo):");

        jLabelPlaca.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPlaca.setText("---");

        jLabelVeiculo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelVeiculo.setText("---");

        jLabel1.setText("Placa:");

        javax.swing.GroupLayout jPanelVeiculoLayout = new javax.swing.GroupLayout(jPanelVeiculo);
        jPanelVeiculo.setLayout(jPanelVeiculoLayout);
        jPanelVeiculoLayout.setHorizontalGroup(
            jPanelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelVeiculoPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelVeiculoLayout.setVerticalGroup(
            jPanelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVeiculoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelLabelVeiculoPlaca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCliente.setMaximumSize(new java.awt.Dimension(313, 35));
        jPanelCliente.setMinimumSize(new java.awt.Dimension(313, 35));
        jPanelCliente.setPreferredSize(new java.awt.Dimension(313, 35));

        jLabelCliente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelCliente.setText("---");

        jLabelLabelCliente.setText("Cliente:");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelVenda.setMaximumSize(new java.awt.Dimension(103, 35));
        jPanelVenda.setMinimumSize(new java.awt.Dimension(103, 35));

        jLabelCodVenda.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelCodVenda.setForeground(new java.awt.Color(0, 51, 102));
        jLabelCodVenda.setText("---");

        jLabelLabelCodVenda.setText("Nº");

        javax.swing.GroupLayout jPanelVendaLayout = new javax.swing.GroupLayout(jPanelVenda);
        jPanelVenda.setLayout(jPanelVendaLayout);
        jPanelVendaLayout.setHorizontalGroup(
            jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelCodVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCodVenda)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelVendaLayout.setVerticalGroup(
            jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelCodVenda)
                    .addComponent(jLabelCodVenda))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFormaPagamentoLayout = new javax.swing.GroupLayout(jPanelFormaPagamento);
        jPanelFormaPagamento.setLayout(jPanelFormaPagamentoLayout);
        jPanelFormaPagamentoLayout.setHorizontalGroup(
            jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFormaPagamentoLayout.setVerticalGroup(
            jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBarraTitulo1.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBarraTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraTitulo1.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanelBarraTitulo1.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabelLabelTituloFinalizarOrcamento.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelLabelTituloFinalizarOrcamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTituloFinalizarOrcamento.setText("FINALIZAR ORÇAMENTO");

        jFormattedTextFieldData.setEditable(false);
        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabelLabelData.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelData.setText("Data:");

        javax.swing.GroupLayout jPanelBarraTitulo1Layout = new javax.swing.GroupLayout(jPanelBarraTitulo1);
        jPanelBarraTitulo1.setLayout(jPanelBarraTitulo1Layout);
        jPanelBarraTitulo1Layout.setHorizontalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelTituloFinalizarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBarraTitulo1Layout.setVerticalGroup(
            jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelTituloFinalizarOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelLabelData))
        );

        jPanelBotoes.setBackground(new java.awt.Color(0, 102, 153));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBotoes.setMaximumSize(new java.awt.Dimension(367, 47));
        jPanelBotoes.setMinimumSize(new java.awt.Dimension(367, 47));

        jButtonSalvarOrcamento.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonSalvarOrcamento.setText("SALVAR ORÇAMENTO");
        jButtonSalvarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarOrcamentoActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonCancelar.setText("CANCELAR ORÇAMENTO");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAprovarOrcamento.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonAprovarOrcamento.setText("APROVAR E GERAR O.S.");
        jButtonAprovarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAprovarOrcamentoActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonVoltar.setText("VOLTAR / ALTERAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAprovarOrcamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSalvarOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonAprovarOrcamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelTotalOrcamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTotalOrcamento.setMaximumSize(new java.awt.Dimension(855, 44));
        jPanelTotalOrcamento.setMinimumSize(new java.awt.Dimension(855, 44));
        jPanelTotalOrcamento.setPreferredSize(new java.awt.Dimension(855, 44));

        jLabelLabelTotalOrcamento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelLabelTotalOrcamento.setText("TOTAL:");

        jLabelTotalOrcamento.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelTotalOrcamento.setText("---");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("R$");

        javax.swing.GroupLayout jPanelTotalOrcamentoLayout = new javax.swing.GroupLayout(jPanelTotalOrcamento);
        jPanelTotalOrcamento.setLayout(jPanelTotalOrcamentoLayout);
        jPanelTotalOrcamentoLayout.setHorizontalGroup(
            jPanelTotalOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalOrcamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTotalOrcamentoLayout.setVerticalGroup(
            jPanelTotalOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelTotalOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanelServicos.setBackground(new java.awt.Color(204, 204, 204));
        jPanelServicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelServicos.setMaximumSize(new java.awt.Dimension(324, 268));
        jPanelServicos.setMinimumSize(new java.awt.Dimension(324, 268));

        jPanelTotalServicos.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTotalServicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTotalServicos.setMaximumSize(new java.awt.Dimension(320, 32));
        jPanelTotalServicos.setMinimumSize(new java.awt.Dimension(320, 32));

        jLabelLabelTotalServicos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTotalServicos.setText("TOTAL SERVIÇOS:");

        jLabelTotalServicos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelTotalServicos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalServicos.setText("---");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");

        javax.swing.GroupLayout jPanelTotalServicosLayout = new javax.swing.GroupLayout(jPanelTotalServicos);
        jPanelTotalServicos.setLayout(jPanelTotalServicosLayout);
        jPanelTotalServicosLayout.setHorizontalGroup(
            jPanelTotalServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalServicosLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalServicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTotalServicosLayout.setVerticalGroup(
            jPanelTotalServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelTotalServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanelTituloServicos.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTituloServicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SERVIÇOS");

        javax.swing.GroupLayout jPanelTituloServicosLayout = new javax.swing.GroupLayout(jPanelTituloServicos);
        jPanelTituloServicos.setLayout(jPanelTituloServicosLayout);
        jPanelTituloServicosLayout.setHorizontalGroup(
            jPanelTituloServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloServicosLayout.setVerticalGroup(
            jPanelTituloServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableServicos.setEnabled(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listServicosDoOrcamento, jTableServicos);
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
        jScrollPane1.setViewportView(jTableServicos);
        if (jTableServicos.getColumnModel().getColumnCount() > 0) {
            jTableServicos.getColumnModel().getColumn(0).setResizable(false);
            jTableServicos.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableServicos.getColumnModel().getColumn(1).setResizable(false);
            jTableServicos.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanelServicosLayout = new javax.swing.GroupLayout(jPanelServicos);
        jPanelServicos.setLayout(jPanelServicosLayout);
        jPanelServicosLayout.setHorizontalGroup(
            jPanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanelTotalServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelServicosLayout.setVerticalGroup(
            jPanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServicosLayout.createSequentialGroup()
                .addComponent(jPanelTituloServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTotalServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMaximumSize(new java.awt.Dimension(525, 268));
        jPanel8.setMinimumSize(new java.awt.Dimension(525, 268));
        jPanel8.setPreferredSize(new java.awt.Dimension(525, 268));

        jTableProdutos.setEnabled(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItensDoOrcamento, jTableProdutos);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto.proDescricao}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvQuantidade}"));
        columnBinding.setColumnName("Quant.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvPrecoUnitario}"));
        columnBinding.setColumnName("Preço Unit.");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itvValorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneParcelas.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(160);
            jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jPanelTituloProdutos.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTituloProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUTOS");

        javax.swing.GroupLayout jPanelTituloProdutosLayout = new javax.swing.GroupLayout(jPanelTituloProdutos);
        jPanelTituloProdutos.setLayout(jPanelTituloProdutosLayout);
        jPanelTituloProdutosLayout.setHorizontalGroup(
            jPanelTituloProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloProdutosLayout.setVerticalGroup(
            jPanelTituloProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelTotalProdutos.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTotalProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTotalProdutos.setMaximumSize(new java.awt.Dimension(521, 32));
        jPanelTotalProdutos.setMinimumSize(new java.awt.Dimension(521, 32));
        jPanelTotalProdutos.setPreferredSize(new java.awt.Dimension(521, 32));

        jLabelLabelTotalProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelTotalProdutos.setText("TOTAL PRODUTOS:");

        jLabelTotalProdutos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelTotalProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalProdutos.setText("---");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("R$");

        javax.swing.GroupLayout jPanelTotalProdutosLayout = new javax.swing.GroupLayout(jPanelTotalProdutos);
        jPanelTotalProdutos.setLayout(jPanelTotalProdutosLayout);
        jPanelTotalProdutosLayout.setHorizontalGroup(
            jPanelTotalProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTotalProdutosLayout.setVerticalGroup(
            jPanelTotalProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelTotalProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(jLabelLabelTotalProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneParcelas, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addComponent(jPanelTotalProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanelTituloProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTotalOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addComponent(jPanelFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBarraTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTotalOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonSalvarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarOrcamentoActionPerformed
        int salvar = JOptionPane.showConfirmDialog(null, "Ao salvar o Orçamento, os itens inclusos não serão abatidos no estoque.\nVocê poderá acessar "
                + "este Orçamento a qualquer momento para Aprovação.\nDeseja realmente salvar?","Atenção", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (salvar == 0) {
            status = 2; //ao retornar para o JFrameOrdemServico, os itens não serão decrementados do estoque atual.
            dispose();
        } 
    }//GEN-LAST:event_jButtonSalvarOrcamentoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!","Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (cancelar == 0) { //sim
            status = 0; //ao retornar para o JFrameOrdemServico, os itens, serviços e venda são removidos.
            dispose();
        }        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAprovarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAprovarOrcamentoActionPerformed
        int aprovar = JOptionPane.showConfirmDialog(null, "Ao aprovar o orçamento, será gerado uma Ordem de Serviço.\nVocê será direcionado para "
                + "a tela de Pagamento.","Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (aprovar == 0) { //sim
            JFrameFinalizaVenda finalizaVenda = new JFrameFinalizaVenda(ven);
            finalizaVenda.setLocationRelativeTo(this);
            finalizaVenda.setVisible(true);
            //RETORNA AQUI
            status = finalizaVenda.getStatus();
            if(status == 0){
                int salvar = JOptionPane.showConfirmDialog(null, "Deseja manter o Orçamento Salvo? Se escolher NÃO, "
                        + "o Orçamento será excluído do banco de dados!", "Atenção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (salvar == 0){ 
                    status = 2;
                    dispose();
                } else {
                    dispose();
                }
            } else if(status == 1){
                dispose();
            }
        }  
    }//GEN-LAST:event_jButtonAprovarOrcamentoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        status = 3;
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAprovarOrcamento;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvarOrcamento;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCodVenda;
    private javax.swing.JLabel jLabelLabelCliente;
    private javax.swing.JLabel jLabelLabelCodVenda;
    private javax.swing.JLabel jLabelLabelData;
    private javax.swing.JLabel jLabelLabelTituloFinalizarOrcamento;
    private javax.swing.JLabel jLabelLabelTotalOrcamento;
    private javax.swing.JLabel jLabelLabelTotalProdutos;
    private javax.swing.JLabel jLabelLabelTotalServicos;
    private javax.swing.JLabel jLabelLabelVeiculoPlaca;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTotalOrcamento;
    private javax.swing.JLabel jLabelTotalProdutos;
    private javax.swing.JLabel jLabelTotalServicos;
    private javax.swing.JLabel jLabelVeiculo;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelBarraTitulo1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelFormaPagamento;
    private javax.swing.JPanel jPanelServicos;
    private javax.swing.JPanel jPanelTituloProdutos;
    private javax.swing.JPanel jPanelTituloServicos;
    private javax.swing.JPanel jPanelTotalOrcamento;
    private javax.swing.JPanel jPanelTotalProdutos;
    private javax.swing.JPanel jPanelTotalServicos;
    private javax.swing.JPanel jPanelVeiculo;
    private javax.swing.JPanel jPanelVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneParcelas;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTable jTableServicos;
    private java.util.List<ItemDaVenda> listItensDoOrcamento;
    private java.util.List<ServicoDaVenda> listServicosDoOrcamento;
    private java.util.List<Venda> listVenda;
    private javax.persistence.Query queryItensDoOrcamento;
    private javax.persistence.Query queryServicosDoOrcamento;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
