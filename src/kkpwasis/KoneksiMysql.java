package kkpwasis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class KoneksiMysql {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/wasis", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class koneksi {
        Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
    }
}
