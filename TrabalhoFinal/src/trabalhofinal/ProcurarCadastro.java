package trabalhofinal;

import Main.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55899
 */
public class ProcurarCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProcurarCadastro
     */
    public ProcurarCadastro() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        procuraCpf = new javax.swing.JFormattedTextField();
        buttonExcluirCliente = new javax.swing.JButton();
        nomeApresenta = new javax.swing.JLabel();
        buttonProcurarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProcura = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PROCURAR CADASTRO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar Cadastro"));

        jLabel1.setText("CPF");

        try {
            procuraCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        procuraCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraCpfActionPerformed(evt);
            }
        });

        buttonExcluirCliente.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirCliente.setText("Excluir");
        buttonExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirClienteActionPerformed(evt);
            }
        });

        nomeApresenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nomeApresenta.setText("Name");

        buttonProcurarCliente.setBackground(new java.awt.Color(102, 255, 153));
        buttonProcurarCliente.setText("Procurar");
        buttonProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcurarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeApresenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(procuraCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonProcurarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(buttonExcluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(procuraCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(nomeApresenta, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonExcluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonProcurarCliente)))
                .addGap(18, 18, 18))
        );

        tabelaProcura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Titulo", "Genero", "Autor", "Edição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProcura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirClienteActionPerformed
        // TODO add your handling code here:
        String passeWord = JOptionPane.showInputDialog("Insira a senha de admintrador");

        if (tabelaProcura.getSelectedRow() != -1) {
            if (passeWord.equals("adm123")) {

                DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaProcura.getModel();
                tabelaProcura.getSelectedRow();
                //Pegando o titulo do livro na tabela
                Object tituloLivro = dtmProdutos.getValueAt(tabelaProcura.getSelectedRow(), 0);
                //Procurando o indice o meu cliente dentro do arryList
                int indiceCliente = Cliente.procuraCliente(procuraCpf.getText());
                //Pegando o indice do livro que eu desejo remover
                int indiceLivro = Cliente.cliente.get(indiceCliente).procuraClienteLivro(tituloLivro.toString(), indiceCliente);
       
                //Removendo do arrayList do meu arry list
                Cliente.cliente.get(indiceCliente).livros.remove(indiceLivro);

                //Limpando a tabela
                if (dtmProdutos.getRowCount() > 0) {
                //Estou limpando a tabela para a próxima procura
                for (int i = 0; i < dtmProdutos.getRowCount(); i++) {
                    dtmProdutos.removeRow(i);
                }
            }
                
                JOptionPane.showMessageDialog(null, "Item excluido com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir!");
        }


    }//GEN-LAST:event_buttonExcluirClienteActionPerformed

    private void procuraCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraCpfActionPerformed

    }//GEN-LAST:event_procuraCpfActionPerformed

    private void buttonProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcurarClienteActionPerformed
        // TODO add your handling code here:
        int indiceCliente = Cliente.procuraCliente(procuraCpf.getText());
        DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaProcura.getModel();

        //criando tabela-------------------------------------------------------
        if (indiceCliente == -1) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            if (dtmProdutos.getRowCount() > 0) {
                //Estou limpando a tabela para a próxima procura
                for (int i = 0; i < dtmProdutos.getRowCount(); i++) {
                    dtmProdutos.removeRow(i);
                }
            }

        } else {

            nomeApresenta.setText(Cliente.cliente.get(indiceCliente).getNome());

            if (dtmProdutos.getRowCount() > 0) {

                //Se minha tabela estiver com algum contéudo, ele não me mostra nada. caso Contrario
                //Eu preencho a tabela com o conteúdo que necessito
            } else {

                for (int i = 0; i < Cliente.cliente.get(indiceCliente).livros.size(); i++) {

                    Object[] dados = {Cliente.cliente.get(indiceCliente).livros.get(i).getTitulo(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getGenero(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getAutor(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getEdicao(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getEditora(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getQuantidade(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getValor(),
                        Cliente.cliente.get(indiceCliente).livros.get(i).getData()};

                    dtmProdutos.addRow(dados);

                }
            }

        }
    }//GEN-LAST:event_buttonProcurarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluirCliente;
    private javax.swing.JButton buttonProcurarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeApresenta;
    private javax.swing.JFormattedTextField procuraCpf;
    private javax.swing.JTable tabelaProcura;
    // End of variables declaration//GEN-END:variables
}
