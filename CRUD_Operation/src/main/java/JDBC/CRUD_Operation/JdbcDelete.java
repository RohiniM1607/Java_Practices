package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDelete {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/TestDB";
		String username = "root";
		String password = "Rohini_16";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "DELETE FROM Student WHERE Name = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Bibin");
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Student record deleted successfully!");
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
