package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection  {
    private static final String URL = "jdbc:mysql://localhost:3306/Game_Character";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private  static  DBConnection INSTANCE = new DBConnection();

    private  Connection connection;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return INSTANCE;
    }


    public Connection getConnection() throws SQLException{

            INSTANCE.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection successful!");

        return connection;




    }

	


}
