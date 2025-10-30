package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseManager {
    private static final String url = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String user = "admin";
    private static final String password = "admin";


    public Connection connectionManager() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}


