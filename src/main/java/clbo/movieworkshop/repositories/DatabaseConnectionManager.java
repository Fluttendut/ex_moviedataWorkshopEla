package clbo.movieworkshop.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    //variabler
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    //Metoder

    public static Connection getConnection(){
        hostname = "jdbc:mysql://mysqlproject.mysql.database.azure.com/imdb";
        username = "Fluttendut";
        password = "Machoyuna92";

        try {
            conn = DriverManager.getConnection(hostname, username, password);
            System.out.println("forbindelsen er ok");
        } catch (SQLException e) {
            System.out.println("forbindelsen er ikke ok");
            throw new RuntimeException(e);
        }
        return conn;

    }
}
