/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conclua;

import conclua.conexao;
import javax.swing.JOptionPane;
import classes_p_add_db.professor;

/**
 *
 * @author Rael Flores
 */
public class Tela_Login extends javax.swing.JFrame {

    professor teste = new professor();
    
    
    public Tela_Login() {
        initComponents();
        conexao c = new conexao();
        c.getConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        usuario_tela_login = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        senha_tela_login = new javax.swing.JPasswordField();
        botao_entrar_login = new javax.swing.JButton();
        botao_fechar_login = new javax.swing.JButton();
        botao_fechar_login1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 410));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 210, 60, 22);

        usuario_tela_login.setFont(new java.awt.Font("Barlow Medium", 0, 24)); // NOI18N
        usuario_tela_login.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuario_tela_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_tela_loginActionPerformed(evt);
            }
        });
        getContentPane().add(usuario_tela_login);
        usuario_tela_login.setBounds(20, 160, 280, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuário");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 70, 22);

        senha_tela_login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        senha_tela_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_tela_loginActionPerformed(evt);
            }
        });
        getContentPane().add(senha_tela_login);
        senha_tela_login.setBounds(20, 240, 280, 40);

        botao_entrar_login.setBackground(new java.awt.Color(0, 255, 51));
        botao_entrar_login.setFont(new java.awt.Font("Barlow ExtraBold", 0, 14)); // NOI18N
        botao_entrar_login.setForeground(new java.awt.Color(255, 255, 255));
        botao_entrar_login.setText("ENTRAR");
        botao_entrar_login.setBorder(null);
        botao_entrar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_entrar_loginActionPerformed(evt);
            }
        });
        getContentPane().add(botao_entrar_login);
        botao_entrar_login.setBounds(20, 300, 130, 30);

        botao_fechar_login.setBackground(new java.awt.Color(0, 149, 119));
        botao_fechar_login.setFont(new java.awt.Font("Barlow", 0, 12)); // NOI18N
        botao_fechar_login.setForeground(new java.awt.Color(255, 255, 255));
        botao_fechar_login.setText("Esqueceu a senha?");
        botao_fechar_login.setBorder(null);
        botao_fechar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fechar_loginActionPerformed(evt);
            }
        });
        getContentPane().add(botao_fechar_login);
        botao_fechar_login.setBounds(20, 340, 280, 20);

        botao_fechar_login1.setBackground(new java.awt.Color(255, 0, 0));
        botao_fechar_login1.setFont(new java.awt.Font("Barlow ExtraBold", 0, 14)); // NOI18N
        botao_fechar_login1.setForeground(new java.awt.Color(255, 255, 255));
        botao_fechar_login1.setText("SAIR");
        botao_fechar_login1.setBorder(null);
        botao_fechar_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fechar_login1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_fechar_login1);
        botao_fechar_login1.setBounds(170, 300, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoconclua.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 120, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conclua tela_1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Rotas
    private void senha_tela_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_tela_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_tela_loginActionPerformed

    private void botao_fechar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fechar_loginActionPerformed
    }//GEN-LAST:event_botao_fechar_loginActionPerformed

    private void usuario_tela_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_tela_loginActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_usuario_tela_loginActionPerformed

    private void botao_entrar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_entrar_loginActionPerformed
       if(usuario_tela_login.getText().equals("admin") && senha_tela_login.getText().equals("admin")){
        Tela_ADM_Sistema tela_de_adm = new Tela_ADM_Sistema();
        tela_de_adm.show();
        dispose();
    }else{
           JOptionPane.showMessageDialog(null,"Senha ou Usuário incorretos");
       }
    }//GEN-LAST:event_botao_entrar_loginActionPerformed

    private void botao_fechar_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fechar_login1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_botao_fechar_login1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_entrar_login;
    private javax.swing.JButton botao_fechar_login;
    private javax.swing.JButton botao_fechar_login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField senha_tela_login;
    private javax.swing.JTextField usuario_tela_login;
    // End of variables declaration//GEN-END:variables
}
