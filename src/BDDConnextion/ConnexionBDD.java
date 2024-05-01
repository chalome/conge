
package BDDConnextion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
    private static Connection connection;
    private static final String username="root";
    private static final String url="jdbc:mysql://localhost/gestion_conge";
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String password="";
    public static Connection getConnection(){
        try {
          Class.forName(driver);
          connection=DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
