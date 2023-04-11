/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import static funcoesUteis.FuncoesDate.strToDate;
import java.awt.Color;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import task_manager.InterfaceManager;

/**
 *
 * @author gugag
 */
public class tela_cadastroVenda extends javax.swing.JDialog {

    private InterfaceManager ger;
    public tela_cadastroVenda(java.awt.Frame parent, boolean modal, InterfaceManager ger) {
        super(parent, modal);
        this.ger = ger;
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

        jpMain2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        botaoCadastrar2 = new javax.swing.JButton();
        iconeVoltar = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campoCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        botaoPesquisarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoLista = new javax.swing.JList<>();
        botaoPesquisarProduto = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        campoDesconto = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        campoPagamento = new javax.swing.JComboBox<>();
        labelParcelas = new javax.swing.JLabel();
        campoParcelas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        botaoCadastrar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpMain2.setBackground(new java.awt.Color(46, 0, 71));
        jpMain2.setForeground(new java.awt.Color(0, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(0, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 255, 255));

        botaoCadastrar2.setBackground(new java.awt.Color(0, 255, 255));
        botaoCadastrar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoCadastrar2.setForeground(new java.awt.Color(46, 0, 71));
        botaoCadastrar2.setText("Cadastrar");
        botaoCadastrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar2ActionPerformed(evt);
            }
        });

        iconeVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/icons8_logout_rounded_left_32px.png"))); // NOI18N
        iconeVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconeVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeVoltarMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 255, 255));
        jLabel25.setText("Cadastro de Venda");

        jPanel1.setBackground(new java.awt.Color(46, 0, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(147, 0, 255), 2, true), "Dados Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 255, 255))); // NOI18N

        campoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoCliente.setForeground(new java.awt.Color(46, 0, 71));
        campoCliente.setCaretColor(new java.awt.Color(46, 0, 71));
        campoCliente.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(147, 0, 255));
        jLabel9.setText("Nome do Cliente:");

        botaoPesquisarCliente.setBackground(new java.awt.Color(0, 255, 255));
        botaoPesquisarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoPesquisarCliente.setForeground(new java.awt.Color(46, 0, 71));
        botaoPesquisarCliente.setText("Pesquisar");
        botaoPesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisarCliente)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarCliente))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(46, 0, 71));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(147, 0, 255), 2, true), "Conteúdo da Venda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 255, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(147, 0, 255));
        jLabel11.setText("Produto(os):");

        campoLista.setForeground(new java.awt.Color(46, 0, 71));
        campoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        campoLista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoListaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(campoLista);

        botaoPesquisarProduto.setBackground(new java.awt.Color(0, 255, 255));
        botaoPesquisarProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisarProduto.setForeground(new java.awt.Color(46, 0, 71));
        botaoPesquisarProduto.setText("Pesquisar");
        botaoPesquisarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarProdutoActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(0, 255, 255));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(46, 0, 71));
        botaoLimpar.setText("Limpar");
        botaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(147, 0, 255));
        jLabel14.setText("Data do Pedido:");

        campoData.setForeground(new java.awt.Color(46, 0, 71));
        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoPesquisarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(46, 0, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(147, 0, 255), 2, true), "Dados de Pagamento", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 255, 255))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(147, 0, 255));
        jLabel12.setText("Desconto aplicado:");

        campoDesconto.setForeground(new java.awt.Color(46, 0, 71));
        try {
            campoDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescontoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(147, 0, 255));
        jLabel13.setText("Forma de Pagamento:");

        campoPagamento.setForeground(new java.awt.Color(46, 0, 71));
        campoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Boleto", "TED", "Depósito" }));
        campoPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPagamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPagamentoFocusLost(evt);
            }
        });

        labelParcelas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelParcelas.setForeground(new java.awt.Color(147, 0, 255));
        labelParcelas.setText("Parcelas:");

        campoParcelas.setForeground(new java.awt.Color(46, 0, 71));
        campoParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x", "6x" }));
        campoParcelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoParcelas.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(147, 0, 255));
        jLabel10.setText("Valor Total:");

        campoValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoValor.setForeground(new java.awt.Color(46, 0, 71));
        campoValor.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelParcelas)))
                            .addComponent(jLabel12)
                            .addComponent(campoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(campoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(campoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelParcelas)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(campoParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        botaoCadastrar3.setBackground(new java.awt.Color(0, 255, 255));
        botaoCadastrar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoCadastrar3.setForeground(new java.awt.Color(46, 0, 71));
        botaoCadastrar3.setText("Limpar Campos");
        botaoCadastrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMain2Layout = new javax.swing.GroupLayout(jpMain2);
        jpMain2.setLayout(jpMain2Layout);
        jpMain2Layout.setHorizontalGroup(
            jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jpMain2Layout.createSequentialGroup()
                .addGroup(jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMain2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpMain2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(iconeVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25))
                    .addGroup(jpMain2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(botaoCadastrar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpMain2Layout.setVerticalGroup(
            jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMain2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconeVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jpMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar2ActionPerformed

        //preciso transformar isso em função util
        String msgErro = "";
        msgErro = validarCampos(msgErro);

        if(msgErro.isEmpty()){

            String cliente = campoCliente.getText();
            String data = campoData.getText();
            List<String> produtos = campoLista.getSelectedValuesList();
            String desc = campoDesconto.getText();

            desc = desc.replace(",", "");
            for (int i = 0; i < desc.length(); i++) {
                desc = desc.replace(" ", "");
            }

            if (desc.isEmpty())
            desc = "0.00";

            Double desconto = Double.parseDouble(desc);

            String pagamento = campoPagamento.getSelectedItem().toString();

        }else
        JOptionPane.showMessageDialog(this, msgErro, "Erro de Cadastro - Cliente", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_botaoCadastrar2ActionPerformed

    private void iconeVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeVoltarMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_iconeVoltarMouseClicked

    private void botaoPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarClienteActionPerformed

        ger.abrirTelaBuscarCliente();
    }//GEN-LAST:event_botaoPesquisarClienteActionPerformed

    private void campoListaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoListaFocusLost

        //Inserir valor no campo valor total
    }//GEN-LAST:event_campoListaFocusLost

    private void botaoPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarProdutoActionPerformed

        ger.abrirTelaBuscarProduto();
    }//GEN-LAST:event_botaoPesquisarProdutoActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed

        int[] indices = {};
        campoLista.setSelectedIndices(indices);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescontoActionPerformed

    private void campoPagamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPagamentoFocusGained

        if(campoPagamento.getSelectedItem().equals("Cartão"))
        campoParcelas.setEnabled(true);
        else
        campoParcelas.setEnabled(false);
    }//GEN-LAST:event_campoPagamentoFocusGained

    private void campoPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPagamentoFocusLost

        if(campoPagamento.getSelectedItem().equals("Cartão"))
        campoParcelas.setEnabled(true);
        else
        campoParcelas.setEnabled(false);
    }//GEN-LAST:event_campoPagamentoFocusLost

    private void botaoCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar3ActionPerformed

        campoCliente.setText("");
        int[] indices = {};
        campoLista.setSelectedIndices(indices);
        campoData.setText("");
        campoDesconto.setText("");
        campoPagamento.setSelectedIndex(0);
        campoParcelas.setSelectedIndex(0);
        campoParcelas.setEnabled(false);
        labelParcelas.setEnabled(false);
        campoValor.setText("");
    }//GEN-LAST:event_botaoCadastrar3ActionPerformed

    public String validarCampos(String msgErro){
        
        if(campoCliente.getText().isEmpty()){
            msgErro = msgErro + "Nome inválido!\n";
            campoCliente.setForeground(Color.red);
            campoCliente.setText("");
        }else
            campoCliente.setForeground(new Color(46,0,71));
        
        if(campoLista.getSelectedValuesList().isEmpty()){
            msgErro = msgErro + "Selecione pelo menos 1 produto!\n";
            campoLista.setForeground(Color.red);
        }else
            campoLista.setForeground(new Color(46,0,71));
        
        try {
            
            //Preciso transformar isso em exceção
            
                String dataLida = campoData.getText();

                dataLida = dataLida.replace("/", "");
                dataLida = dataLida.replace("/", "");
                
                for(int i=0;i<dataLida.length();i++)
                    dataLida = dataLida.replace(" ", "");
                
                if(dataLida.isEmpty()){
                    msgErro = msgErro + "Data vazia.\n";
                    campoData.setForeground(Color.red);
                }else{
                    

                    int contador = 0, indiceAtual=0, indiceAnterior=0;

                    for(int i=0;i<dataLida.length();i++){

                        char ind = dataLida.charAt(i);
                        if(i > 0){
                            if(ind == dataLida.charAt(i-1))
                                contador++;
                        }

                        if(i==5){
                                indiceAtual = Character.digit(dataLida.charAt(i), 10);
                                indiceAnterior = Character.digit(dataLida.charAt(i - 1), 10);
                                if (indiceAnterior <= 1 && indiceAtual >= 9) {
                                    msgErro = msgErro + "Data inválida.\n"
                                            + "Não aceita-se anos anteriores aos anos 2000.\n";
                                    campoData.setForeground(Color.red);
                                }
                        }    

                    }

                    if(contador >= 5){
                        msgErro = msgErro + "Data com excesso de Números repetidos.\n";
                        campoData.setForeground(Color.red);
                    }
                }
            //=================================================
            
            Date data = strToDate(campoData.getText());
        }
        catch (ParseException ex) {
            msgErro = msgErro + "Data inválida.\n";
            campoData.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            campoData.setForeground(Color.red); 
        }

        return msgErro;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar2;
    private javax.swing.JButton botaoCadastrar3;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisarCliente;
    private javax.swing.JButton botaoPesquisarProduto;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoDesconto;
    private javax.swing.JList<String> campoLista;
    private javax.swing.JComboBox<String> campoPagamento;
    private javax.swing.JComboBox<String> campoParcelas;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel iconeVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpMain2;
    private javax.swing.JLabel labelParcelas;
    // End of variables declaration//GEN-END:variables
}
