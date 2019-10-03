/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Toolkit;
import javax.swing.*;
import modelo.Usuario;

/* @author Ruth */

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */

     public Principal(Usuario usuario) {
        initComponents();
        setExtendedState(Principal.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Alagoas Histórica Digital");

        this.usuario = usuario;

        if (this.usuario.getPermissao().equals("0")){
              jBRemoverUsuario.setEnabled(false);
              jBAdicionarUsuario.setEnabled(false);
              jBAlterarUsuario.setEnabled(false);
              jBAlterarUsuario.setEnabled(false);
        }
    }


    public Principal() {
        initComponents();
        setExtendedState(Principal.MAXIMIZED_BOTH);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/InterfaceGUI/imagens/logo-ufal.jpg")));
        this.setTitle("Painter");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFuncionalidades = new javax.swing.JPanel();
        jBCadastrarDocumento = new javax.swing.JButton();
        jBRemoverDocumento = new javax.swing.JButton();
        jBAtualizarDocumento = new javax.swing.JButton();
        jBBuscarDocumento = new javax.swing.JButton();
        jBAdicionarUsuario = new javax.swing.JButton();
        jBRemoverUsuario = new javax.swing.JButton();
        jBAlterarUsuario = new javax.swing.JButton();
        jBBuscarUsuario = new javax.swing.JButton();
        jBPalavrasChaves = new javax.swing.JButton();
        jBDesenvolvedores = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        uJPanelImagem3 = new componentes.UJPanelImagem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPFuncionalidades.setBackground(new java.awt.Color(255, 255, 255));
        jPFuncionalidades.setPreferredSize(new java.awt.Dimension(1083, 150));
        jPFuncionalidades.setLayout(new java.awt.GridBagLayout());

        jBCadastrarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/adicionar-documento.png"))); // NOI18N
        jBCadastrarDocumento.setToolTipText("Cadastrar documento");
        jBCadastrarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarDocumentoActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBCadastrarDocumento, new java.awt.GridBagConstraints());

        jBRemoverDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/remover-documento.png"))); // NOI18N
        jBRemoverDocumento.setToolTipText("Remover documento");
        jBRemoverDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverDocumentoActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBRemoverDocumento, new java.awt.GridBagConstraints());

        jBAtualizarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/alterar-documento.png"))); // NOI18N
        jBAtualizarDocumento.setToolTipText("Alterar documento");
        jBAtualizarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarDocumentoActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBAtualizarDocumento, new java.awt.GridBagConstraints());

        jBBuscarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/buscar-documento.png"))); // NOI18N
        jBBuscarDocumento.setToolTipText("Buscar documento");
        jBBuscarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarDocumentoActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBBuscarDocumento, new java.awt.GridBagConstraints());

        jBAdicionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/adicionar-usuario.png"))); // NOI18N
        jBAdicionarUsuario.setToolTipText("Adicionar usuário");
        jBAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarUsuarioActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBAdicionarUsuario, new java.awt.GridBagConstraints());

        jBRemoverUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/remover-usuario.png"))); // NOI18N
        jBRemoverUsuario.setToolTipText("Remover usuário");
        jBRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverUsuarioActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBRemoverUsuario, new java.awt.GridBagConstraints());

        jBAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/alterar-usuario.png"))); // NOI18N
        jBAlterarUsuario.setToolTipText("Alterar usuáro");
        jBAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarUsuarioActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBAlterarUsuario, new java.awt.GridBagConstraints());

        jBBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/buscar-usuario.png"))); // NOI18N
        jBBuscarUsuario.setToolTipText("Buscar usuário");
        jBBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarUsuarioActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBBuscarUsuario, new java.awt.GridBagConstraints());

        jBPalavrasChaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/chave.png"))); // NOI18N
        jBPalavrasChaves.setToolTipText("Palavras chaves");
        jBPalavrasChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPalavrasChavesActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBPalavrasChaves, new java.awt.GridBagConstraints());

        jBDesenvolvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/desenvolvedores.png"))); // NOI18N
        jBDesenvolvedores.setToolTipText("Desenvolvedores");
        jBDesenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesenvolvedoresActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(jBDesenvolvedores, new java.awt.GridBagConstraints());
        jBDesenvolvedores.getAccessibleContext().setAccessibleDescription("Desenvolvedores");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGUI/imagens/System-Logout-icon.png"))); // NOI18N
        logout.setToolTipText("Sair do sistema");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPFuncionalidades.add(logout, new java.awt.GridBagConstraints());

        getContentPane().add(jPFuncionalidades, java.awt.BorderLayout.PAGE_START);

        uJPanelImagem1.setImagem(new java.io.File("D:\\UFAL\\Painter\\projeto\\Painter\\src\\InterfaceGUI\\imagens\\fundo.jpg"));

        uJPanelImagem3.setImagem(new java.io.File("D:\\UFAL\\Painter\\Painter\\src\\InterfaceGUI\\imagens\\fundo.jpg"));

        javax.swing.GroupLayout uJPanelImagem3Layout = new javax.swing.GroupLayout(uJPanelImagem3);
        uJPanelImagem3.setLayout(uJPanelImagem3Layout);
        uJPanelImagem3Layout.setHorizontalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1071, Short.MAX_VALUE)
        );
        uJPanelImagem3Layout.setVerticalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(uJPanelImagem1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarDocumentoActionPerformed
        new CadastrarDocumento(usuario).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBCadastrarDocumentoActionPerformed

    private void jBAtualizarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarDocumentoActionPerformed
        new AtualizarDocumento(usuario).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jBAtualizarDocumentoActionPerformed

    private void jBAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarUsuarioActionPerformed
        new CadastroUsuario(usuario).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBAdicionarUsuarioActionPerformed

    private void jBBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarUsuarioActionPerformed
        new BuscarUsuario(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBBuscarUsuarioActionPerformed

    private void jBRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverUsuarioActionPerformed
        new RemoverUsuario(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRemoverUsuarioActionPerformed

    private void jBRemoverDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverDocumentoActionPerformed
    	new RemoverDocumento(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRemoverDocumentoActionPerformed

    private void jBAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarUsuarioActionPerformed
       new AtualizarUsuario(usuario).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jBAlterarUsuarioActionPerformed

    private void jBBuscarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarDocumentoActionPerformed
        new BuscarDocumento(usuario).setVisible(true);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarDocumentoActionPerformed

    private void jBPalavrasChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPalavrasChavesActionPerformed
       new CadastrarPalavrasChave(usuario).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jBPalavrasChavesActionPerformed

    private void jBDesenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesenvolvedoresActionPerformed
        new Desenvolvedores().setVisible(true);
        
    }//GEN-LAST:event_jBDesenvolvedoresActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionarUsuario;
    private javax.swing.JButton jBAlterarUsuario;
    private javax.swing.JButton jBAtualizarDocumento;
    private javax.swing.JButton jBBuscarDocumento;
    private javax.swing.JButton jBBuscarUsuario;
    private javax.swing.JButton jBCadastrarDocumento;
    private javax.swing.JButton jBDesenvolvedores;
    private javax.swing.JButton jBPalavrasChaves;
    private javax.swing.JButton jBRemoverDocumento;
    private javax.swing.JButton jBRemoverUsuario;
    private javax.swing.JPanel jPFuncionalidades;
    private javax.swing.JButton logout;
    private componentes.UJPanelImagem uJPanelImagem1;
    private componentes.UJPanelImagem uJPanelImagem3;
    // End of variables declaration//GEN-END:variables
    private String nomeLogin;
    private Usuario usuario;
}
