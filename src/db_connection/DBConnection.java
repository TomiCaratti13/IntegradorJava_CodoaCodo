
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    Connection conexion;
    String url = "jdbc:mysql://localhost:3306/integrador_db";
    String user = "root";
    String password = "admin123";
    String driver="com.mysql.cj.jdbc.Driver";

    public DBConnection() {
        try {
            Class.forName(driver);
            conexion=(Connection)DriverManager.getConnection(url,user,password);
            System.out.println("Conexion Exitosa");

            //con.close();
            //System.out.println("Conexion Terminada");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Falló la conexion, error: "+e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conexion;
    }
}