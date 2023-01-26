/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package trabalhofinal;

import Main.Implementos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55899
 */
public class CadastrarItem extends javax.swing.JInternalFrame {

    private static int linha = 0;

    /**
     * Creates new form CadastrarItem
     */
    public CadastrarItem() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtEdicao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edtLingua = new javax.swing.JTextField();
        buttonCadastro = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        buttonAtualizar = new javax.swing.JButton();
        edtEditora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CADASTRAR ITENS");

        jLabel1.setText("Titulo");

        jLabel2.setText("Quantidade");

        edtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQuantidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        edtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPrecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Genero");

        edtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtGeneroActionPerformed(evt);
            }
        });

        jLabel5.setText("Edição");

        jLabel6.setText("Autor");

        edtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAutorActionPerformed(evt);
            }
        });

        jLabel7.setText("Editora");

        buttonCadastro.setBackground(new java.awt.Color(0, 255, 51));
        buttonCadastro.setText("Cadastrar");
        buttonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroActionPerformed(evt);
            }
        });

        buttonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Genero", "Edição", "Editora", "Lingua", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setColumnSelectionAllowed(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        buttonAtualizar.setBackground(new java.awt.Color(153, 255, 255));
        buttonAtualizar.setText("Atualizar ");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });

        jLabel8.setText("Lingua");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtLingua, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(edtGenero, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(207, 207, 207)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(edtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(157, 157, 157)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCadastro)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(221, 221, 221))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAtualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtLingua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExcluir)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtQuantidadeActionPerformed

    private void edtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPrecoActionPerformed

    private void edtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtGeneroActionPerformed

    private void buttonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroActionPerformed
        DefaultTableModel dtmProdutos = (DefaultTableModel) tabela.getModel();

        boolean verifica = Implementos.cadastrar(edtTitulo.getText(), edtAutor.getText(), edtEdicao.getText(), edtGenero.getText(), edtLingua.getText(), edtEditora.getText(), Double.parseDouble(edtPreco.getText()), Integer.parseInt(edtQuantidade.getText()));

        if (verifica == true) {

            Object dados[] = {edtTitulo.getText(), edtAutor.getText(), edtGenero.getText(), edtEdicao.getText(), edtEditora.getText(), edtLingua.getText(), edtQuantidade.getText(), edtPreco.getText()};

            dtmProdutos.addRow(dados);

            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso");

            edtTitulo.setText("");
            edtPreco.setText("");
            edtAutor.setText("");
            edtEdicao.setText("");
            edtLingua.setText("");
            edtGenero.setText("");
            edtQuantidade.setText("");
            edtLingua.setText("");
            edtEditora.setText("");

        } else {

            JOptionPane.showMessageDialog(null, "Item Não pode ser Cadastrado, verifique os dados e tente novamente");

        }

    }//GEN-LAST:event_buttonCadastroActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:

        if (tabela.getSelectedRow() != -1) {
            Object nome = tabela.getValueAt(linha, 0);

            if (Implementos.excluirLivro(nome.toString()) == true) {
                JOptionPane.showMessageDialog(null, "Livro removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível remover o livro");
            }

            DefaultTableModel dtmProdutos = (DefaultTableModel) tabela.getModel();
            dtmProdutos.removeRow(tabela.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Item excluido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir!");
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        // TODO add your handling code here:

        if (tabela.getSelectedRow() != -1) {

            String livro = tabela.getValueAt(linha, 0).toString();
            String autor = tabela.getValueAt(linha, 1).toString();
            String genero = tabela.getValueAt(linha, 2).toString();
            String edicao = tabela.getValueAt(linha, 3).toString();
            String editora = tabela.getValueAt(linha, 4).toString();
            String lingua = tabela.getValueAt(linha, 5).toString();
            String quantidade = tabela.getValueAt(linha, 6).toString();
            String valor = tabela.getValueAt(linha, 7).toString();

            boolean verifica = Implementos.atualizar(livro, autor, genero, edicao, editora, lingua, Integer.parseInt(quantidade), Double.parseDouble(valor));

            if (verifica == true) {
                JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Dados inválidos");
            }

            tabela.setValueAt(valor, linha, 6);
            tabela.setValueAt(quantidade, linha, 5);

//            tabela.setValueAt(edtTitulo.getText(), tabela.getSelectedRow(), 0);
//            tabela.setValueAt(edtAutor.getText(), tabela.getSelectedRow(), 1);
//            tabela.setValueAt(edtGenero.getText(), tabela.getSelectedRow(), 2);
//            tabela.setValueAt(edtEdicao.getText(), tabela.getSelectedRow(), 3);
//            tabela.setValueAt(edtLingua.getText(), tabela.getSelectedRow(), 4);
//            tabela.setValueAt(edtQuantidade.getText(), tabela.getSelectedRow(), 5);
//            tabela.setValueAt(edtPreco.getText(), tabela.getSelectedRow(), 6);
//            JOptionPane.showMessageDialog(null, "Item atualizado com sucesso");
        }
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        CadastrarItem.linha = tabela.getSelectedRow();

//            edtTitulo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
//            edtAutor.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
//            edtGenero.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
//            edtEdicao.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
//            edtEditora.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
//            edtLingua.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
//            edtQuantidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
//           edtPreco.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void edtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCadastro;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JTextField edtAutor;
    private javax.swing.JTextField edtEdicao;
    private javax.swing.JTextField edtEditora;
    private javax.swing.JTextField edtGenero;
    private javax.swing.JTextField edtLingua;
    private javax.swing.JTextField edtPreco;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
