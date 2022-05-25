package ludoteca;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    private final String userAdmin = "admin_ludo_2077";
    private final String publicUser = "emp_ludo_1100";
    private final String pssw = "ludo2021";
    private final String psswA = "dixon@71";

    public login() {
        initComponents();
        this.setSize(610, 530);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_password = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        btn_join = new javax.swing.JButton();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 140, -1));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, -1));

        btn_join.setText("Ingresar");
        btn_join.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_joinMouseClicked(evt);
            }
        });
        getContentPane().add(btn_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.jpg"))); // NOI18N
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_joinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_joinMouseClicked
        if (txt_user.getText().equals(this.publicUser) && txt_password.getText().equals(this.pssw)) {
            this.setVisible(false);
            menuEmp mE = new menuEmp();
            mE.setVisible(true);
        } else {
            if (txt_user.getText().equals(this.userAdmin) && txt_password.getText().equals(this.psswA)) {
                this.setVisible(false);
                menu m = new menu();
                m.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Contraseña/Usuario Incorrecto");
            }
        }


    }//GEN-LAST:event_btn_joinMouseClicked

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_join;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

}
