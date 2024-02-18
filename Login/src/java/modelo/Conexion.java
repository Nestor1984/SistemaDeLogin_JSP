package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root", "");
        } catch (Exception e) {
        }
        return con;
    }

}
