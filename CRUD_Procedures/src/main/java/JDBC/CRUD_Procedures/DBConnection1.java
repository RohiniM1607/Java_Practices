package JDBC.CRUD_Procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {

	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/TestDB";
		String user = "root";
		String password = "Rohini_16";
		
		return DriverManager.getConnection(url, user, password);
	}

}
