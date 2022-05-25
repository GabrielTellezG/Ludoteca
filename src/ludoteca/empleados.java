package ludoteca;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ludoteca.inscritos.res;
import main.Conexion;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

public class empleados extends javax.swing.JFrame {

    public empleados() {
        initComponents();
        this.setSize(616,538);
        setLocationRelativeTo(null);
        this.setResizable(false); 
        
        Cargar_empleados();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    public void Cargar_empleados() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_empleados.getModel();
        modelo.setRowCount(0);
        res = Conexion.Consulta("SELECT * FROM empleados");
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                modelo.addRow(v);
                tbl_empleados.setModel(modelo);

            }

        } catch (SQLException e) {
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_buscar = new javax.swing.JTextField();
        LBL_BUSCAR = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, -1));

        LBL_BUSCAR.setText("BUSCAR");
        getContentPane().add(LBL_BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btn_refresh.setText("Refrescar Tabla");
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 200, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        btn_editar.setText("Editar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        btn_volver.setText("Volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 80, -1));

        tbl_empleados.setBackground(new java.awt.Color(204, 255, 255));
        tbl_empleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Jotaro Kuyo", "Danza", "VECJ880326", "558339725", "hola@yahoo.com"},
                {"2", "Benito Juarez", "Musica", "ADCF880326", "55382354956", "adios@yahoo.com"},
                {"3", "Ignacio Zaragoza", "Ajedrez", "DECR880326", "5524785469", "sayonara@yahoo.com"},
                {"4", "Enrique Peña", "Ingles", "ZECJ880326", "5512476321", "hola@yahoo.com"}
            },
            new String [] {
                "id_empleado", "Nombre", "Actividades_asignadas", "RFC", "Telefono", "Correo electronico"
            }
        ));
        jScrollPane1.setViewportView(tbl_empleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 550, 90));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.jpg"))); // NOI18N
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        NuevoEmpleado emp = new NuevoEmpleado();
        emp.setVisible(true);
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        Cargar_empleados();
    }//GEN-LAST:event_btn_refreshMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        int opc = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar un registro?", "¡¡AVISO!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String eliminar;

        if (opc == JOptionPane.YES_OPTION) {

            try {
                eliminar = JOptionPane.showInputDialog("Ingresa ID del empleado que deseas eliminar");
                PreparedStatement pps = Conexion.getConectar().prepareStatement(""
                    + "DELETE FROM empleados WHERE id_empleado = " + eliminar + "");
                pps.executeUpdate();
                Cargar_empleados();

            } catch (SQLException e) {

            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        EditarEmpleado ee = new EditarEmpleado();
        ee.setVisible(true);
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

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
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_BUSCAR;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
