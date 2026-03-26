package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCreateTable {
	
	static String url = "jdbc:mysql://localhost:3306/TestDB";
    static String user = "root";
    static String pass = "Rohini_16";

	public static void createTable() {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                    "ID INT PRIMARY KEY, Name VARCHAR(255), " +
                    "Course VARCHAR(255), Email VARCHAR(255))";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Table created!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
