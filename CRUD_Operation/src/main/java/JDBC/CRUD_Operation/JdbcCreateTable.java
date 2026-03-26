package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCreateTable {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/TestDB";
		String username = "root";
		String password = "Rohini_16";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "CREATE TABLE Student " + "(ID INT NOT NULL, " +
				"Name VARCHAR(255), " + "Course VARCHAR(255), " +
				"Email VARCHAR(255), " + "PRIMARY KEY (ID))";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Table created successfully using PreparedStatement!");
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
