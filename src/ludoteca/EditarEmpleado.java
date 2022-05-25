package ludoteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static ludoteca.inscritos.res;
import main.Conexion;

public class EditarEmpleado extends javax.swing.JFrame {

    public EditarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        btn_mostrar = new javax.swing.JButton();
        txt_rfc = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_nombre3 = new javax.swing.JLabel();
        lbl_nombre4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_nombre5 = new javax.swing.JLabel();
        btn_modifica = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 31, 40, -1));

        jLabel1.setText("Id del empleado a  modificar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        lbl_nombre.setText("Nombre");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btn_mostrar.setText("Mostrar");
        btn_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mostrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 28, -1, -1));
        getContentPane().add(txt_rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, -1));
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 89, -1, -1));

        lbl_nombre3.setText("Correo");
        getContentPane().add(lbl_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        lbl_nombre4.setText("RFC");
        getContentPane().add(lbl_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, -1));

        lbl_nombre5.setText("Telefono");
        getContentPane().add(lbl_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        btn_modifica.setText("Aceptar cambios");
        btn_modifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 75, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarMouseClicked
        res = Conexion.Consulta("SELECT * FROM empleados where id_empleado = " + txt_id.getText() + "");
        try {
            while (res.next()) {
                txt_nombre.setText(res.getString(2));
                txt_rfc.setText(res.getString(4));
                txt_telefono.setText(res.getString(5));
                txt_correo.setText(res.getString(6));
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btn_mostrarMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        inscritos in = new inscritos();
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_modificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificaMouseClicked
        try {
            PreparedStatement pps = Conexion.getConectar().prepareStatement("Update empleados set nombre_empleado='"
                    + txt_nombre.getText() + "', rfc='" + txt_rfc.getText() + "', telefono='" + txt_telefono.getText() + "', correo='" + txt_correo.getText() + "' where id_empleado ='" + txt_id.getText() + "'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos se modificaron");
            txt_id.setText("");
            txt_nombre.setText("");
            txt_rfc.setText("");
            txt_correo.setText("");
            txt_telefono.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(EditarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_modificaMouseClicked

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
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_nombre3;
    private javax.swing.JLabel lbl_nombre4;
    private javax.swing.JLabel lbl_nombre5;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rfc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
