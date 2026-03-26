package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdate {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/TestDB";
		String username = "root";
		String password = "Rohini_16";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "UPDATE Student SET Course = ?, Email = ? WHERE Name = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Physics");
			statement.setString(2, "bibin6420@gmail.com");
			statement.setString(3, "Bibin");
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("Student record updated successfully!");
			} 
			else {
				System.out.println("No matching student found!");
			}
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
