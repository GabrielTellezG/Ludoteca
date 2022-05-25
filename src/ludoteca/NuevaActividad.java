package ludoteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Conexion;
import static ludoteca.inscritos.res;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

public class NuevaActividad extends javax.swing.JFrame {
    public NuevaActividad() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        Cargar_tutores();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }
    public void Cargar_tutores(){
        cmb_tutores.removeAllItems();
        res = Conexion.Consulta("SELECT * FROM empleados  ");
        try {
            while (res.next()) {
                cmb_tutores.addItem(res.getString(2));
            }
        } catch (SQLException e) {
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_actividad = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_nombre3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nueva = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        cmb_tutores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 118, -1));

        lbl_nombre.setText("Actividad");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 89, -1, -1));

        lbl_nombre3.setText("Tutor que la imparte");
        getContentPane().add(lbl_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Ingresa los datos de la nueva actividad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btn_nueva.setText("Nueva");
        btn_nueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 80, -1));

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
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, -1));

        getContentPane().add(cmb_tutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 120, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_nuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaMouseClicked
        String tutor = (String )cmb_tutores.getSelectedItem();
        try {
            PreparedStatement pps = Conexion.getConectar().prepareStatement(""
                    + "INSERT INTO actividades (nombre_actividad, total_inscritos, profesor_asignado) "
                    + "VALUES (?,?,?);");
            pps.setString(1, txt_actividad.getText());
            pps.setInt(2, 0);
            pps.setString(3, tutor);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(inscritos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Para profesores
            try {
                PreparedStatement pps = Conexion.getConectar().prepareStatement("Update empleados set actividades_asignadas='"
                        + txt_actividad.getText() + "' where nombre_empleado ='" + tutor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego actividad a: " + tutor);

            } catch (SQLException ex) {
                Logger.getLogger(EditarInscrito.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btn_nuevaMouseClicked

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
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nueva;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_tutores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_nombre3;
    private javax.swing.JTextField txt_actividad;
    // End of variables declaration//GEN-END:variables
}
