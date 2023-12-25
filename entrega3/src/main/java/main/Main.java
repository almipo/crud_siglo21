

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Main {

    private Connection conectar = null;
    private final String contrasena = "root";
    private final String usuario = "root";
    private final String db = "entrega3";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;

    public Connection establecerConexion() {
        try {
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
             JOptionPane.showMessageDialog(null, "se conecto correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo conectar" + e.toString());
        }
        return conectar;
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.establecerConexion();
    }

    public Connection obtenerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}