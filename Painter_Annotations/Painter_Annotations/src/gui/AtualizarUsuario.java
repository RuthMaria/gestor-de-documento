package gui;

import dao.UsuarioDAO;
import modelo.Usuario;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class AtualizarUsuario extends javax.swing.JFrame {

    public AtualizarUsuario(Usuario usuario) {
        initComponents();

        setExtendedState(AtualizarUsuario.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");

        desabilitarCampos();

        this.usuario = usuario;
    }

    public AtualizarUsuario() {
        initComponents();

        setExtendedState(AtualizarUsuario.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");

        desabilitarCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLCelular = new javax.swing.JLabel();
        buttonGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLNomeComp = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JTextField();
        jLEndereco = new javax.swing.JLabel();
        txtNomecompleto = new javax.swing.JTextField();
        jLCelular1 = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        NomeLogin = new javax.swing.JLabel();
        txtNomeLogin = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnMudarSenha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSenhaAtual = new javax.swing.JPasswordField();
        txtNovaSenha = new javax.swing.JPasswordField();
        txtConfirmaNovaSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        permissaoTotal = new javax.swing.JRadioButton();
        permissaoParcial = new javax.swing.JRadioButton();

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

        jLCelular.setText("Celular:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Atualizar dados de usuário");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/localizar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Dados do usuário:");

        jLNomeComp.setText("Nome completo:");

        jLEndereco.setText("Endereço:");

        jLCelular1.setText("Celular:");

        jLEmail.setText("E-mail:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        NomeLogin.setText("Nome de login:");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/atualizar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnMudarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/mudarSenha.png"))); // NOI18N
        btnMudarSenha.setText("Mudar senha");
        btnMudarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudarSenhaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Dados de login");

        jLabel6.setText("Senha atual:");

        jLabel7.setText("Nova senha:");

        jLabel8.setText("Confirmar nova senha:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Pesquisar por login:");

        jLabel3.setText("Permissão do Usuário:");

        buttonGroup.add(permissaoTotal);
        permissaoTotal.setText("Total");

        buttonGroup.add(permissaoParcial);
        permissaoParcial.setSelected(true);
        permissaoParcial.setText("Parcial");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLEndereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(NomeLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLNomeComp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPesquisar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtConfirmaNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel5)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(btnVoltar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnMudarSenha)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnLimpar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnAlterar)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(permissaoTotal)
                                            .addGap(32, 32, 32)
                                            .addComponent(permissaoParcial))
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLNomeComp)
                        .addGap(18, 18, 18)
                        .addComponent(NomeLogin))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txtNomecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLEndereco)
                        .addGap(12, 12, 12)
                        .addComponent(jLCelular1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(permissaoTotal)
                            .addComponent(permissaoParcial))))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmaNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnMudarSenha)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar))
                .addGap(46, 46, 46))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
            new Principal(usuario).setVisible(true);
            this.dispose();
	}//GEN-LAST:event_btnVoltarActionPerformed

	private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            try {

                usuarioProcurado = (Usuario) new UsuarioDAO().recuperarPeloLogin(txtBusca.getText());
                
                if (usuarioProcurado == null) {
                    JOptionPane.showMessageDialog(this, "Login inválido\n");
                    
                } else {
                    dadosUsuario(usuarioProcurado);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }

	}//GEN-LAST:event_btnPesquisarActionPerformed

	private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            
            txtCelular.setText("");
            txtEmail.setText("");
            txtEndereço.setText("");
            txtNomeLogin.setText("");
            txtNomecompleto.setText("");
            txtBusca.setText("");
            desabilitarCampos();
	}//GEN-LAST:event_btnLimparActionPerformed

        private void desabilitarCampos() {
            txtConfirmaNovaSenha.setEnabled(false);
            txtNovaSenha.setEnabled(false);
            txtSenhaAtual.setEnabled(false);
            txtConfirmaNovaSenha.setText("");
            txtNovaSenha.setText("");
            txtSenhaAtual.setText("");
        }

	private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja alterar os dados deste usuário?", null, 0);
            if (opcao == 0) {
                try {
                    onClickSalvar();
                } catch (Exception ex) {
                    Logger.getLogger(AtualizarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}//GEN-LAST:event_btnAlterarActionPerformed

	private void btnMudarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudarSenhaActionPerformed
            mudarSenha();
	}//GEN-LAST:event_btnMudarSenhaActionPerformed

        private void onClickSalvar() throws Exception {
            
            usuarioProcurado.setNome(txtNomecompleto.getText());
            usuarioProcurado.setLogin(txtNomeLogin.getText());
            usuarioProcurado.setEndereco(txtEndereço.getText());
            usuarioProcurado.setTelefone(txtCelular.getText());
            usuarioProcurado.setEmail(txtEmail.getText());

            String permissao = "0";
                if (permissaoTotal.isSelected()) {
                    permissao = "1";
                }

            usuarioProcurado.setPermissao(permissao);

            try {
                UsuarioDAO uDAO = new UsuarioDAO();

                if(txtSenhaAtual.getText().equals("") && txtNovaSenha.getText().equals("") &&
                       txtConfirmaNovaSenha.getText().equals("")){
                            uDAO.atualizar(usuarioProcurado); 
                            JOptionPane.showMessageDialog(this, "Usuário atualizado!");

                }else if (usuarioProcurado.getSenha().equals(txtSenhaAtual.getText()) && 
                              txtNovaSenha.getText().equals(txtConfirmaNovaSenha.getText())){
                              usuarioProcurado.setSenha(txtNovaSenha.getText());
                              uDAO.atualizar(usuarioProcurado);                           
                              JOptionPane.showMessageDialog(this, "Senha alterada!");
                }
                
                else{
                       JOptionPane.showMessageDialog(this, "Senhas não conferem!");                   
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar usuário");
            }
        }

        public void mudarSenha() {
            txtNovaSenha.setEnabled(true);
            txtSenhaAtual.setEnabled(true);
            txtConfirmaNovaSenha.setEnabled(true);

        }

        private void dadosUsuario(Usuario usuarioProcurado) {
            
            txtNomeLogin.setText(usuarioProcurado.getLogin());
            txtCelular.setText(usuarioProcurado.getTelefone());
            txtEmail.setText(usuarioProcurado.getEmail());
            txtEndereço.setText(usuarioProcurado.getEndereco());
            txtNomecompleto.setText(usuarioProcurado.getNome());

            if (usuarioProcurado.getPermissao().equals("0"))
                permissaoParcial.setSelected(true);

            else
                permissaoTotal.setSelected(true);

        }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeLogin;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMudarSenha;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCelular1;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLNomeComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton permissaoParcial;
    private javax.swing.JRadioButton permissaoTotal;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JPasswordField txtConfirmaNovaSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNomeLogin;
    private javax.swing.JTextField txtNomecompleto;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables
    private Usuario usuarioProcurado;
    private Usuario usuario;
}
