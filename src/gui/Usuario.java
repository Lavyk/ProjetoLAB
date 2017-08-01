/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import locadora.ConectarDB;

/**
 *
 * @author lavyk
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form CriarUsuario
     */
    private String nome;
    private char[] senha;

    public Usuario() {
        initComponents();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    char[] pass1, pass2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passForm = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        passFormConfirm = new javax.swing.JPasswordField();
        panelBotoes = new javax.swing.JPanel();
        confirmSenha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar usuário");
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add-user.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelTitulo.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Criar usuário");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 40));

        panelForm.setBackground(new java.awt.Color(102, 102, 102));
        panelForm.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nome de usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelForm.add(jLabel2, gridBagConstraints);

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelForm.add(txtNome, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelForm.add(jLabel3, gridBagConstraints);

        passForm.setText("password123");
        passForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFormFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelForm.add(passForm, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Repita a senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelForm.add(jLabel4, gridBagConstraints);

        passFormConfirm.setText("password123");
        passFormConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFormConfirmFocusGained(evt);
            }
        });
        passFormConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFormConfirmKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFormConfirmKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelForm.add(passFormConfirm, gridBagConstraints);

        jPanel3.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        panelBotoes.setBackground(new java.awt.Color(30, 40, 45));
        panelBotoes.setLayout(new java.awt.GridBagLayout());
        jPanel3.add(panelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 266, -1, -1));

        confirmSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmSenha.setForeground(new java.awt.Color(255, 0, 0));
        confirmSenha.setText("Senhas correspondem");
        jPanel3.add(confirmSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/close.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/confirm.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passFormFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFormFocusGained
        String pass = passForm.getText();
        passForm.setText("");
        pass1 = passForm.getPassword();
        pass2 = passFormConfirm.getPassword();
        if (verificarPasswords(pass1, pass2) == true) {
            confirmSenha.setForeground(Color.green);
        } else {
            confirmSenha.setForeground(Color.red);
        }

    }//GEN-LAST:event_passFormFocusGained

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFocusGained

    private void passFormConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFormConfirmFocusGained

        passFormConfirm.setText("");
        pass1 = passForm.getPassword();
        pass2 = passFormConfirm.getPassword();
        if (verificarPasswords(pass1, pass2) == true) {
            confirmSenha.setForeground(Color.green);
        } else {
            confirmSenha.setForeground(Color.red);
        }

    }//GEN-LAST:event_passFormConfirmFocusGained

    private void passFormConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFormConfirmKeyTyped

    }//GEN-LAST:event_passFormConfirmKeyTyped

    private void passFormConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFormConfirmKeyReleased
        pass1 = passForm.getPassword();
        pass2 = passFormConfirm.getPassword();
        if (verificarPasswords(pass1, pass2) == true) {
            confirmSenha.setForeground(Color.green);
        } else {
            confirmSenha.setForeground(Color.red);
        }
    }//GEN-LAST:event_passFormConfirmKeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        ConectarDB conn = new ConectarDB();
        String nome = txtNome.getText();
        pass1 = passForm.getPassword();
        pass2 = passFormConfirm.getPassword();
        String strPass = passForm.getText();
        if (verificarPasswords(pass1, pass2) && verificarNome() == true) {
            this.setNome(nome);
            this.setSenha(pass1);
            dispose();
            conn.createTableUser();
            conn.insert("Users", "nome", nome);
            conn.update("Users", "senha", strPass, 1);
            new Teste().setVisible(true);
        } else if (passForm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A senha não pode ficar em branco!");
        } else if (!verificarPasswords(pass1, pass2)) {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem!");
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    public boolean verificarPasswords(char[] pass1, char[] pass2) {
        if (passForm.getText().isEmpty() || passFormConfirm.getText().isEmpty()) {
            return false;
        } else if (Arrays.equals(pass1, pass2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarNome() {
        String nome = txtNome.getText();
        if (nome.isEmpty() || nome.contains(" ")) {
            JOptionPane.showMessageDialog(null, "O nome do usuário não pode ficar em branco ou ter espaços!");
            return false;
        } else {
            return true;
        }
    }

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPasswordField passForm;
    private javax.swing.JPasswordField passFormConfirm;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
