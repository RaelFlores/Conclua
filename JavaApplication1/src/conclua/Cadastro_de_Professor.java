package conclua;

import classes_p_add_db.professor;
import classes_p_add_db.conexao_prof;

public class Cadastro_de_Professor extends javax.swing.JFrame {

    public Cadastro_de_Professor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_cadastrar_prof = new javax.swing.JButton();
        botao_fechar_login1 = new javax.swing.JButton();
        formacao_prof = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nome_professor1 = new javax.swing.JTextField();
        celular_professor = new javax.swing.JFormattedTextField();
        matricula_professor1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        disponibilidade = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        email_professor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        area_professor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sub_area_professor1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        botao_cadastrar_prof.setBackground(new java.awt.Color(0, 204, 51));
        botao_cadastrar_prof.setFont(new java.awt.Font("Barlow ExtraBold", 0, 14)); // NOI18N
        botao_cadastrar_prof.setForeground(new java.awt.Color(255, 255, 255));
        botao_cadastrar_prof.setText("CADASTRAR");
        botao_cadastrar_prof.setBorder(null);
        botao_cadastrar_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_profActionPerformed(evt);
            }
        });
        getContentPane().add(botao_cadastrar_prof);
        botao_cadastrar_prof.setBounds(320, 660, 240, 30);

        botao_fechar_login1.setBackground(new java.awt.Color(255, 0, 0));
        botao_fechar_login1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao_fechar_login1.setForeground(new java.awt.Color(255, 255, 255));
        botao_fechar_login1.setText("X");
        botao_fechar_login1.setBorder(null);
        botao_fechar_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fechar_login1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_fechar_login1);
        botao_fechar_login1.setBounds(1040, 0, 40, 30);

        formacao_prof.setFont(new java.awt.Font("Barlow Medium", 0, 18)); // NOI18N
        formacao_prof.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        formacao_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formacao_profActionPerformed(evt);
            }
        });
        getContentPane().add(formacao_prof);
        formacao_prof.setBounds(320, 590, 500, 40);

        jLabel6.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 80, 70, 22);

        jLabel10.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 240, 100, 22);

        jLabel11.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Formação:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 560, 100, 22);

        nome_professor1.setFont(new java.awt.Font("Barlow Medium", 0, 18)); // NOI18N
        nome_professor1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome_professor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_professor1ActionPerformed(evt);
            }
        });
        getContentPane().add(nome_professor1);
        nome_professor1.setBounds(320, 110, 500, 40);

        try {
            celular_professor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celular_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celular_professorActionPerformed(evt);
            }
        });
        getContentPane().add(celular_professor);
        celular_professor.setBounds(320, 350, 220, 40);

        try {
            matricula_professor1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        matricula_professor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricula_professor1ActionPerformed(evt);
            }
        });
        getContentPane().add(matricula_professor1);
        matricula_professor1.setBounds(320, 190, 220, 40);

        jLabel12.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Matricula:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 160, 100, 22);

        jLabel13.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Celular:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 320, 100, 22);

        try {
            disponibilidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        disponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibilidadeActionPerformed(evt);
            }
        });
        getContentPane().add(disponibilidade);
        disponibilidade.setBounds(610, 350, 50, 40);

        jLabel14.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Disponibilidade:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(610, 320, 140, 22);

        email_professor.setFont(new java.awt.Font("Barlow Medium", 0, 18)); // NOI18N
        email_professor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_professorActionPerformed(evt);
            }
        });
        getContentPane().add(email_professor);
        email_professor.setBounds(320, 270, 500, 40);

        jLabel15.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Área:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 400, 100, 22);

        area_professor.setFont(new java.awt.Font("Barlow Medium", 0, 18)); // NOI18N
        area_professor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        area_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_professorActionPerformed(evt);
            }
        });
        getContentPane().add(area_professor);
        area_professor.setBounds(320, 430, 500, 40);

        jLabel16.setFont(new java.awt.Font("Barlow ExtraBold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sub área:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(320, 480, 100, 22);

        sub_area_professor1.setFont(new java.awt.Font("Barlow Medium", 0, 18)); // NOI18N
        sub_area_professor1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sub_area_professor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_area_professor1ActionPerformed(evt);
            }
        });
        getContentPane().add(sub_area_professor1);
        sub_area_professor1.setBounds(320, 510, 500, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_cadastro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 720);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cadastrar_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_profActionPerformed
        
        professor prof = new professor();
        
        System.out.println(nome_professor1.getText());       
        System.out.println(matricula_professor1.getText());
        System.out.println(celular_professor.getText());
        System.out.println(disponibilidade.getText());
        System.out.println(area_professor.getText());
        System.out.println(email_professor.getText());
        System.out.println(formacao_prof.getText());
        System.out.println(sub_area_professor1.getText());
        
        
        
        int matricula = Integer.parseInt(matricula_professor1.getText());
        prof.setmatricula(matricula);
        prof.setnome(nome_professor1.getText());
        prof.setemail(email_professor.getText());
        prof.setcelular(celular_professor.getText());
        prof.setformacao(formacao_prof.getText());       
        prof.setarea(area_professor.getText());
        prof.setsub_area(sub_area_professor1.getText());
        int dispon = Integer.parseInt(disponibilidade.getText());
        prof.setdisponibilidade(dispon);

        conexao_prof conect = new conexao_prof();
        conect.inserir(prof);
        
    }//GEN-LAST:event_botao_cadastrar_profActionPerformed

    private void formacao_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formacao_profActionPerformed

    }//GEN-LAST:event_formacao_profActionPerformed

    private void botao_fechar_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fechar_login1ActionPerformed
      dispose();
    }//GEN-LAST:event_botao_fechar_login1ActionPerformed

    private void matricula_professor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricula_professor1ActionPerformed
    
    }//GEN-LAST:event_matricula_professor1ActionPerformed

    private void disponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponibilidadeActionPerformed

    private void celular_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celular_professorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celular_professorActionPerformed

    private void nome_professor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_professor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_professor1ActionPerformed

    private void email_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_professorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_professorActionPerformed

    private void area_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_professorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_professorActionPerformed

    private void sub_area_professor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_area_professor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_area_professor1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_de_Professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area_professor;
    private javax.swing.JButton botao_cadastrar_prof;
    private javax.swing.JButton botao_fechar_login1;
    private javax.swing.JFormattedTextField celular_professor;
    private javax.swing.JFormattedTextField disponibilidade;
    private javax.swing.JTextField email_professor;
    private javax.swing.JTextField formacao_prof;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFormattedTextField matricula_professor1;
    private javax.swing.JTextField nome_professor1;
    private javax.swing.JTextField sub_area_professor1;
    // End of variables declaration//GEN-END:variables
}
