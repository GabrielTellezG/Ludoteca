package ludoteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ludoteca.inscritos.res;
import main.Conexion;

public class actividades extends javax.swing.JFrame {

    public actividades() {
        initComponents();
        this.setSize(616, 538);
        setLocationRelativeTo(null);
        this.setResizable(false);

        Cargar_actividades();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    public void Cargar_actividades() {
        cmb_actividad.removeAllItems();
        cmb_inscritos.removeAllItems();

        DefaultTableModel modelo = (DefaultTableModel) tbl_actividades.getModel();
        modelo.setRowCount(0);
        res = Conexion.Consulta("SELECT * FROM actividades  ");
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                modelo.addRow(v);
                tbl_actividades.setModel(modelo);
            }
        } catch (SQLException e) {
        }

        res = Conexion.Consulta("SELECT * FROM actividades  ");
        try {
            while (res.next()) {
                cmb_actividad.addItem(res.getString(2));
            }
        } catch (SQLException e) {
        }

        res = Conexion.Consulta("SELECT * FROM inscritos");
        try {
            while (res.next()) {
                cmb_inscritos.addItem(res.getString(2));
            }
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_asignar1 = new javax.swing.JLabel();
        cmb_actividad = new javax.swing.JComboBox<>();
        cmb_inscritos = new javax.swing.JComboBox<>();
        btn_volver = new javax.swing.JButton();
        lbl_asignar2 = new javax.swing.JLabel();
        btn_nA = new javax.swing.JButton();
        lbl_asignar = new javax.swing.JLabel();
        btn_asignarA = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        LBL_BUSCAR = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_actividades = new javax.swing.JTable();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_asignar1.setText("Actividad");
        getContentPane().add(lbl_asignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        cmb_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_actividadActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 160, -1));

        cmb_inscritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_inscritosActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_inscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 160, -1));

        btn_volver.setText("Volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 90, -1));

        lbl_asignar2.setText("Inscrito");
        getContentPane().add(lbl_asignar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        btn_nA.setText("Nueva actividad");
        btn_nA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nAMouseClicked(evt);
            }
        });
        getContentPane().add(btn_nA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        lbl_asignar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_asignar.setText("Asignar a niño actividad:");
        getContentPane().add(lbl_asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        btn_asignarA.setText("Inscribir");
        btn_asignarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_asignarAMouseClicked(evt);
            }
        });
        getContentPane().add(btn_asignarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btn_refresh.setText("Refrescar Tabla");
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, -1));

        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        LBL_BUSCAR.setText("BUSCAR");
        getContentPane().add(LBL_BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));

        tbl_actividades.setBackground(new java.awt.Color(204, 255, 255));
        tbl_actividades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Danza", "5", "Josue Santiago"},
                {"2", "Musica", "1", "Emiliano Zapata"},
                {"3", "Ajedrez", "6", "Ernesto Araujo"},
                {"4", "Ingles", "8", "5512476321"}
            },
            new String [] {
                "id_actividad", "Actividad", "Total de inscritos", "Profesor asignado"
            }
        ));
        tbl_actividades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_actividades.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_actividades.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tbl_actividades.setSelectionForeground(new java.awt.Color(102, 255, 51));
        jScrollPane1.setViewportView(tbl_actividades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 550, 90));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actividades.jpg"))); // NOI18N
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_actividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_actividadActionPerformed

    private void cmb_inscritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_inscritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_inscritosActionPerformed

    private void btn_asignarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_asignarAMouseClicked
        if (cmb_actividad.getItemCount() > 0) {

            String inscrito = (String) cmb_inscritos.getSelectedItem();
            String actividad = (String) cmb_actividad.getSelectedItem();
            //Para Alumnos
            try {
                PreparedStatement pps = Conexion.getConectar().prepareStatement("Update inscritos set actividades_inscritas='"
                        + actividad + "' where nombre_usuario ='" + inscrito + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego actividad a: " + inscrito);

            } catch (SQLException ex) {
                Logger.getLogger(EditarInscrito.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            try {
                PreparedStatement pps = Conexion.getConectar().prepareStatement("Update actividades set total_inscritos = total_inscritos + 1 where nombre_actividad = '" + actividad + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego actividad a: " + inscrito);

            } catch (SQLException ex) {
                Logger.getLogger(EditarInscrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Cargar_actividades();
    }//GEN-LAST:event_btn_asignarAMouseClicked

    private void btn_nAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nAMouseClicked
        NuevaActividad nA = new NuevaActividad();
        nA.setVisible(true);
    }//GEN-LAST:event_btn_nAMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        EditarActividad edit = new EditarActividad();
        edit.setVisible(true);
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        Cargar_actividades();
    }//GEN-LAST:event_btn_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_BUSCAR;
    private javax.swing.JButton btn_asignarA;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nA;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmb_actividad;
    private javax.swing.JComboBox<String> cmb_inscritos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_asignar;
    private javax.swing.JLabel lbl_asignar1;
    private javax.swing.JLabel lbl_asignar2;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JTable tbl_actividades;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
