package ludoteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import main.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class inscritos extends javax.swing.JFrame {

    static ResultSet res;
    DefaultTableModel model = new DefaultTableModel();
    int cont;
    Statement st = null;

    public inscritos() {
        initComponents();
        this.setSize(616, 538);
        setLocationRelativeTo(null);
        this.setResizable(false);

        Cargar_inscritos();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/inscritos.jpg")).getImage());
    }

    public void Cargar_inscritos() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_inscritos.getModel();
        modelo.setRowCount(0);
        res = Conexion.Consulta("SELECT * FROM inscritos");
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                modelo.addRow(v);
                tbl_inscritos.setModel(modelo);

            }

        } catch (SQLException e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_refresh = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_inscribir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        LBL_BUSCAR = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inscritos = new javax.swing.JTable();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_refresh.setText("Refrescar Tabla");
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 200, -1));

        btn_volver.setText("Volver");
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 70, -1));

        btn_inscribir.setText("Inscribir");
        btn_inscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inscribirMouseClicked(evt);
            }
        });
        getContentPane().add(btn_inscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        btn_editar.setText("Editar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        LBL_BUSCAR.setText("BUSCAR");
        getContentPane().add(LBL_BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, -1));

        tbl_inscritos.setBackground(new java.awt.Color(204, 255, 255));
        tbl_inscritos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_inscritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Gabriel Tellez Gomez", "19/10/20", "Danza", "Angel Diaz", "558339725", "hola@yahoo.com"},
                {null, "Alan Betancourt Ortiz", "12/10/20", "Musica", "Bruno Diaz", "55382354956", "adios@yahoo.com"},
                {null, "Alan Roman Vallejo Martinez", "11/11/20", "Ajedrez", "Elias Hernandes", "5524785469", "sayonara@yahoo.com"},
                {null, "Marco Antonio Rodriguez", "02/12/21", "Ingles", "Santiago Gimenez", "5512476321", "hola@yahoo.com"}
            },
            new String [] {
                "id", "Nombre", "Fecha_inscripcion", "Actividades_inscritas", "Tutor", "Telefono_tutor", "Correo_tutor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_inscritos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 550, 90));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inscritos.jpg"))); // NOI18N
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inscribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inscribirMouseClicked
        Inscribir Ins = new Inscribir();
        Ins.setVisible(true);

    }//GEN-LAST:event_btn_inscribirMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverMouseClicked

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        String[] titulos = {"Id", "Nombre", "Fecha_inscripcion", "Actividades_inscritas", "Tutor", "Telefono_tutor", "Correo_tutor"};
        String[] registros = new String[50];
        String sql = "SELECT * FROM inscritos WHERE id_usuario LIKE '%" + txt_buscar.getText() + "%' "
                + "OR nombre_usuario LIKE '%" + txt_buscar.getText() + "%'"
                + "OR f_inscripcion LIKE '%" + txt_buscar.getText() + "%'"
                + "OR actividades_inscritas LIKE '%" + txt_buscar.getText() + "%'"
                + "OR nombre_tutor LIKE '%" + txt_buscar.getText() + "%'"
                + "OR telefono_tutor LIKE '%" + txt_buscar.getText() + "%'"
                + "OR correo_tutor LIKE '%" + txt_buscar.getText() + "%'";

        model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConectar();

        try {
            st = (Statement) con.createStatement();
            res = st.executeQuery(sql);
            while (res.next()) {
                registros[0] = res.getString("id_usuario");
                registros[1] = res.getString("nombre_usuario");
                registros[2] = res.getString("f_inscripcion");
                registros[3] = res.getString("actividades_inscritas");
                registros[4] = res.getString("nombre_tutor");
                registros[5] = res.getString("telefono_tutor");
                registros[6] = res.getString("correo_tutor");

                model.addRow(registros);
            }
            tbl_inscritos.setModel(model);
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }

    }//GEN-LAST:event_txt_buscarKeyPressed

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        int row = tbl_inscritos.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar un registro?", "¡¡AVISO!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String eliminar;

        if (opc == JOptionPane.YES_OPTION) {

            try {
                eliminar = JOptionPane.showInputDialog("Ingresa ID del usuario que deseas eliminar");
                PreparedStatement pps = Conexion.getConectar().prepareStatement(""
                        + "DELETE FROM inscritos WHERE id_usuario = " + eliminar + "");
                pps.executeUpdate();
                Cargar_inscritos();

            } catch (SQLException e) {

            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        EditarInscrito edit = new EditarInscrito();
        edit.setVisible(true);
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        Cargar_inscritos();
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
            java.util.logging.Logger.getLogger(inscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inscritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_BUSCAR;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_inscribir;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JTable tbl_inscritos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
