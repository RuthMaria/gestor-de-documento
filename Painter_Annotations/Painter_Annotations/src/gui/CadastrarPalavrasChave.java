package gui;

import dao.PalavraChaveDAO;
import modelo.PalavraChave;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class CadastrarPalavrasChave extends javax.swing.JFrame {

    public CadastrarPalavrasChave(Usuario usuario) {
        initComponents();
        setExtendedState(CadastrarPalavrasChave.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");
        this.usuario = usuario;
    }

    public CadastrarPalavrasChave() {
        initComponents();
        setExtendedState(CadastrarPalavrasChave.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Palavras chaves");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 99, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Palavra chave:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(89, 19, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 365;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 30, 0, 0);
        jPanel3.add(txtPalavra, gridBagConstraints);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 19, 159, 0);
        jPanel3.add(btnVoltar, gridBagConstraints);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 39, 159, 0);
        jPanel3.add(btnSalvar, gridBagConstraints);

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/deletar.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 37, 159, 0);
        jPanel3.add(btRemover, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 509;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 7);
        jPanel3.add(jSeparator1, gridBagConstraints);

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/visualizar.png"))); // NOI18N
        btnVisualizar.setText("visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 40, 159, 0);
        jPanel3.add(btnVisualizar, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        PalavraChave palavra1;
        PalavraChave palavra2 = new PalavraChave();

        if (!txtPalavra.getText().equals("")) {
            palavra1 = new PalavraChaveDAO().recuperarPeloId(txtPalavra.getText());

            if (palavra1 == null) {
                palavra2.setNome(txtPalavra.getText());
                new PalavraChaveDAO().salvar(palavra2);
                txtPalavra.setText("");
                JOptionPane.showMessageDialog(this, "Palavra Chave Cadastrada");
                
            } else {
                JOptionPane.showMessageDialog(this, "A palavra já está cadastrada");
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Preencha o campo palavra chave");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Principal(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        PalavraChave palavra;

        if (!txtPalavra.getText().equals("")) {
            palavra = new PalavraChaveDAO().recuperarPeloId(txtPalavra.getText());

            if (palavra == null) {
                JOptionPane.showMessageDialog(this, "A palavra não está cadastrada");
                
            } else {
                    boolean removido = new PalavraChaveDAO().remover(palavra);
                    
                    if(removido){
                        txtPalavra.setText("");
                        JOptionPane.showMessageDialog(this, "Palavra chave removida");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Não pode ser removida porque está sendo usada em algum documento!");
                    }
              }
            
        } else {
            JOptionPane.showMessageDialog(this, "Preencha o campo palavra chave");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        new VisualizarPalavraChave().setVisible(true);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPalavra;
    // End of variables declaration//GEN-END:variables
    private Usuario usuario;
}
