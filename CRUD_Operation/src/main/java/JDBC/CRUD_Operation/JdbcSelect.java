package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelect {
	
	static String url = "jdbc:mysql://localhost:3306/TestDB";
    static String user = "root";
    static String pass = "Rohini_16";


	public static void view() {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            String sql = "SELECT * FROM Student";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("ID") + " | " +
                        rs.getString("Name") + " | " +
                        rs.getString("Course") + " | " +
                        rs.getString("Email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
