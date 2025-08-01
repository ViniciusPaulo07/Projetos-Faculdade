import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/db_pessoas" +
            "?useSSL=false" +
            "&allowPublicKeyRetrieval=true" +
            "&serverTimezone=UTC" +
            "&autoReconnect=true" +
            "&socketTimeout=3000";
    private static final String USER = "root";
    private static final String PASSWORD = "@Vipp0703";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC não encontrado", e);
        }
    }

    public Connection obtemConexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

