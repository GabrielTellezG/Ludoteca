package main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    static Connection conexion = null;

    public static java.sql.Connection getConectar() {
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/ludoteca";
        Statement stmt = null;
        ResultSet res;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //linea basica que sirve para crear el puente entre java y sql
            conexion = DriverManager.getConnection(url, usuario, clave); //maneja solicitudes de controladores adecuados y bd o servidores de bd
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        //JOptionPane.showMessageDialog(null, "Conexion correcta");
        return conexion;
    }

    public static ResultSet Consulta(String consulta) { //guarda y muestra la info contenida en el proceso de conecction 
        Connection con = getConectar(); //llamada del metodo connection  para obtner los datos
        Statement declara; //procesa sentencias

        try { //
            declara = con.createStatement(); //especifica caractaeristicas de resulset
            ResultSet respuesta = declara.executeQuery(consulta); //devuelve resultados desde consultas sql
            return respuesta; //devuelve valor a resul set por ser metodo declarado
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage(), "ERROR DE CONEXION", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public static void EliminarInscritos(int a) throws SQLException {
        CallableStatement entrada = getConectar().prepareCall("{call EliminarInscritos(?)}");
        entrada.setInt(1, a);
        entrada.execute();

    }
}
