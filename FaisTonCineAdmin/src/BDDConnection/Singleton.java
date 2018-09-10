package BDDConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import RES.CONST_SENSITIVE;

public class Singleton {
	
	private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(CONST_SENSITIVE.URL_CONNECTION, CONST_SENSITIVE.USERNAME, CONST_SENSITIVE.MDP);
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
