package ludoteca;

import javax.swing.ImageIcon;


public class menuEmp extends javax.swing.JFrame {

    public menuEmp() {
        initComponents();
        this.setSize(616,538);
        setLocationRelativeTo(null);
        this.setResizable(false); 
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_inscritos = new javax.swing.JLabel();
        lbl_inscritos1 = new javax.swing.JLabel();
        lbl_act = new javax.swing.JLabel();
        lbl_stu = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_inscritos.setText("Inscritos");
        getContentPane().add(lbl_inscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        lbl_inscritos1.setText("Actividades");
        getContentPane().add(lbl_inscritos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        lbl_act.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono actividades.png"))); // NOI18N
        lbl_act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_actMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, -1));

        lbl_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono inscritos.png"))); // NOI18N
        lbl_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_stuMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));

        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono exit.png"))); // NOI18N
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 100, 100));

        lbl_salir.setText("Salir");
        getContentPane().add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_v2.jpg"))); // NOI18N
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_stuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_stuMouseClicked
        this.dispose();
        inscritos stu = new inscritos();
        stu.setVisible(true);
    }//GEN-LAST:event_lbl_stuMouseClicked

    private void lbl_actMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_actMouseClicked
        this.dispose();
        actividades act = new actividades();
        act.setVisible(true);
    }//GEN-LAST:event_lbl_actMouseClicked

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        this.dispose();
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_lbl_exitMouseClicked

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
            java.util.logging.Logger.getLogger(menuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_act;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_inscritos;
    private javax.swing.JLabel lbl_inscritos1;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel lbl_stu;
    // End of variables declaration//GEN-END:variables
}
