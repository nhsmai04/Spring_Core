import java.sql.*;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Properties props = new Properties();
        InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties");
        props.load(input);

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}
