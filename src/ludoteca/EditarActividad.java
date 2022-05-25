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

public class EditarActividad extends javax.swing.JFrame {

    public EditarActividad() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        Cargar_tutores();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }
    public void Cargar_tutores(){
        cmb_profesor.removeAllItems();
        res = Conexion.Consulta("SELECT * FROM empleados  ");
        try {
            while (res.next()) {
                cmb_profesor.addItem(res.getString(2));
            }
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        btn_mostrar = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_nombre3 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        lbl_nombre4 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        cmb_profesor = new javax.swing.JComboBox<>();
        btn_modifica = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 31, 40, -1));

        jLabel1.setText("Id de la acividad a  modificar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 11, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 118, -1));

        lbl_nombre.setText("Nombre");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        btn_mostrar.setText("Mostrar");
        btn_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mostrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 28, -1, -1));

        txt_total.setEnabled(false);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 89, -1, -1));

        lbl_nombre3.setText("Profesor");
        getContentPane().add(lbl_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        lbl_nombre4.setText("Total de inscritos");
        getContentPane().add(lbl_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        btn_reset.setText("Reiniciar Actividad");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        getContentPane().add(cmb_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 110, -1));

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
        res = Conexion.Consulta("SELECT * FROM actividades where id_actividad = " + txt_id.getText() + "");
        try {
            while (res.next()) {
                txt_nombre.setText(res.getString(2));
                txt_total.setText(res.getString(3));
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btn_mostrarMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        inscritos in = new inscritos();
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_modificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificaMouseClicked
        String profe = (String )cmb_profesor.getSelectedItem();
        try {
            PreparedStatement pps = Conexion.getConectar().prepareStatement("Update actividades set nombre_actividad='"
                    + txt_nombre.getText() + "', profesor_asignado='" + profe + "' where id_actividad ='" + txt_id.getText() + "'");
            pps.executeUpdate();
            
            PreparedStatement pps2 = Conexion.getConectar().prepareStatement("Update empleados set actividades_asignadas='"
                    + txt_nombre.getText() + "' where nombre_empleado ='" + profe + "'");
            pps2.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Los datos se modificaron");
            txt_id.setText("");
            txt_nombre.setText("");
            txt_total.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(EditarActividad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_modificaMouseClicked

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        try {
            PreparedStatement pps = Conexion.getConectar().prepareStatement("Update actividades set total_inscritos ='"
                    + "0" + "' where id_actividad ='" + txt_id.getText() + "'");
            pps.executeUpdate();
            //Lo siguiente es quitarle la asignación de la actividad a cada inscrito

            JOptionPane.showMessageDialog(null, "Los datos se modificaron");
            //Lo siguiente refresca los campos donde se edito
            res = Conexion.Consulta("SELECT * FROM actividades where id_actividad = " + txt_id.getText() + "");
            try {
                while (res.next()) {
                    txt_nombre.setText(res.getString(2));
                    txt_total.setText(res.getString(3));
                }

            } catch (SQLException e) {
            }
            PreparedStatement pps2 = Conexion.getConectar().prepareStatement("UPDATE inscritos set actividades_inscritas = null WHERE actividades_inscritas = " + "'" +txt_nombre.getText() + "';");
            pps2.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(EditarActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_resetMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        int opc = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar un registro?", "¡¡AVISO!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String eliminar;

        if (opc == JOptionPane.YES_OPTION) {

            try {
                eliminar = JOptionPane.showInputDialog("Ingresa ID de la actividad que deseas eliminar");
                PreparedStatement pps = Conexion.getConectar().prepareStatement(""
                        + "DELETE FROM actividades WHERE id_actividad = " + eliminar + "");
                pps.executeUpdate();

            } catch (SQLException e) {

            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(EditarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_profesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_nombre3;
    private javax.swing.JLabel lbl_nombre4;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
