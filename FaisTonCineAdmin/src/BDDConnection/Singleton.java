package BDDConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {
	
	private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/cine", "postgres", "ynov");
            if (connection.equals(true)) {
                System.out.println("connection etablie");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
