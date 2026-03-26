package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectStudent {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/TestDB";
		String username = "root";
		String password = "Rohini_16";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "SELECT * FROM Student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int count = 0;
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("Name");
				String course = rs.getString("Course");
				String email = rs.getString("Email");
				String output = "Student #%d: %d - %s - %s - %s";
				System.out.println(String.format(output, ++count, id, name, course, email));
			}
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
