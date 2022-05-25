package ludoteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static ludoteca.inscritos.res;
import main.Conexion;

public class NuevoEmpleado extends javax.swing.JFrame {

    public NuevoEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre1 = new javax.swing.JLabel();
        lbl_inscrito = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_inscrito4 = new javax.swing.JLabel();
        txt_rfc = new javax.swing.JTextField();
        lbl_inscrito5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_inscrito6 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_modifica = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 89, -1, -1));

        lbl_inscrito.setText("Nombre completo");
        getContentPane().add(lbl_inscrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        lbl_inscrito4.setText("RFC");
        getContentPane().add(lbl_inscrito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));
        getContentPane().add(txt_rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 90, -1));

        lbl_inscrito5.setText("Telefono");
        getContentPane().add(lbl_inscrito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 90, -1));

        lbl_inscrito6.setText("Correo");
        getContentPane().add(lbl_inscrito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 90, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Ingresa los datos personales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btn_modifica.setText("Dar de alta");
        btn_modifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));

        btn_salir.setText("Salir");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 80, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        inscritos in = new inscritos();
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_modificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificaMouseClicked

        try {
            PreparedStatement pps = Conexion.getConectar().prepareStatement(""
                    + "INSERT INTO empleados (nombre_empleado, rfc, telefono, correo)"
                    + "VALUES (?,?,?,?);");
            pps.setString(1, txt_nombre.getText());
            pps.setString(2, txt_rfc.getText());
            pps.setString(3, txt_telefono.getText());
            pps.setString(4, txt_correo.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(inscritos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_modificaMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_inscrito;
    private javax.swing.JLabel lbl_inscrito4;
    private javax.swing.JLabel lbl_inscrito5;
    private javax.swing.JLabel lbl_inscrito6;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rfc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
