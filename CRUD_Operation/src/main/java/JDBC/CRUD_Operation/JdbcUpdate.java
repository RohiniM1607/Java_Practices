package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdate {
	
	static String url = "jdbc:mysql://localhost:3306/TestDB";
    static String user = "root";
    static String pass = "Rohini_16";

	public static void update(Scanner sc) {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("New Course: ");
            String course = sc.nextLine();

            System.out.print("New Email: ");
            String email = sc.nextLine();

            String sql = "UPDATE Student SET Course=?, Email=? WHERE Name=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, course);
            ps.setString(2, email);
            ps.setString(3, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated!");
            else
                System.out.println("Not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
