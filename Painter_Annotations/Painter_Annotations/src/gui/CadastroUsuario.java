package gui;

import dao.UsuarioDAO;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario(Usuario usuario) {
        initComponents();
        setExtendedState(CadastroUsuario.MAXIMIZED_BOTH);
        nomeLogin = usuario;
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grupoBotoes = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLNomeComp = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jTNomeComp = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLNomeUser = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTNomeUser = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jTTelefone = new javax.swing.JFormattedTextField();
        jPFSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        permissaoTotal = new javax.swing.JRadioButton();
        permissaoParcial = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("<html><b>Cadastro de Usuário</html></b>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("<html><b>Dados Pessoais</html></b>");

        jLNomeComp.setText("Nome completo:");

        jLEndereco.setText("Endereço:");

        jLTelefone.setText("Telefone:");

        jLEmail.setText("E-Mail:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("<html><b>Dados de Login</html></b>");

        jLNomeUser.setText("Nome de login:");

        jLSenha.setText("Senha:");

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        try {
            jTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de permissão:");

        grupoBotoes.add(permissaoTotal);
        permissaoTotal.setText("Total");

        grupoBotoes.add(permissaoParcial);
        permissaoParcial.setSelected(true);
        permissaoParcial.setText("Parcial");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNomeUser)
                    .addComponent(jLSenha)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNomeComp)
                                    .addComponent(jLTelefone)
                                    .addComponent(jLEndereco))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTNomeComp)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnVoltar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                .addComponent(btnLimpar)
                                                .addGap(44, 44, 44)
                                                .addComponent(jBSalvar)
                                                .addGap(6, 6, 6))
                                            .addComponent(jTNomeUser)
                                            .addComponent(jPFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                            .addComponent(jTTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(permissaoTotal)
                                                .addGap(30, 30, 30)
                                                .addComponent(permissaoParcial))
                                            .addComponent(jTEmail)))))
                            .addComponent(jLEmail)
                            .addComponent(jLabel3))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNomeComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(permissaoTotal)
                    .addComponent(permissaoParcial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeUser)
                    .addComponent(jTNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        try {
            onClickSalvar();

        } catch (Exception ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new Principal(nomeLogin).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        clearFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void onClickSalvar() throws Exception {
        Usuario usuario;
        
        if (jTNomeComp.getText().equals("") || jTEndereco.getText().equals("") || jTTelefone.getText().equals("(  )    -    ")  
                || jTEmail.getText().equals("") || jTNomeUser.getText().equals("") || jPFSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            
        } else {
            if (permissaoParcial.isSelected()){                   
                  usuario = new Usuario(jTNomeUser.getText(), jTNomeComp.getText(), jTEndereco.getText(), jTTelefone.getText(), jTEmail.getText(), jPFSenha.getText(), "0");
            
            }else{
                  usuario = new Usuario(jTNomeUser.getText(), jTNomeComp.getText(), jTEndereco.getText(), jTTelefone.getText(), jTEmail.getText(), jPFSenha.getText(), "1");
            
            }try {                
                  UsuarioDAO uDAO = new UsuarioDAO();
                
                  boolean cadastrou = uDAO.salvar(usuario);                     
                       
                  if (cadastrou)
                            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                  else                               
                            JOptionPane.showMessageDialog(this, "Erro no cadastro! \nVerifique se já existe um usuário com esse login.");
                                
            } catch (Exception e) {
            }
        }
    }

    public void clearFields() {
        jTNomeComp.setText("");
        jTEndereco.setText("");
        jTTelefone.setText("");
        jTEmail.setText("");
        jTNomeUser.setText("");
        jPFSenha.setText("");
        grupoBotoes.clearSelection();
    }

    public static void main(String[] args) {
        new CadastroUsuario(null).setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLNomeComp;
    private javax.swing.JLabel jLNomeUser;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTNomeComp;
    private javax.swing.JTextField jTNomeUser;
    private javax.swing.JFormattedTextField jTTelefone;
    private javax.swing.JRadioButton permissaoParcial;
    private javax.swing.JRadioButton permissaoTotal;
    // End of variables declaration//GEN-END:variables
    private Usuario nomeLogin;
}
