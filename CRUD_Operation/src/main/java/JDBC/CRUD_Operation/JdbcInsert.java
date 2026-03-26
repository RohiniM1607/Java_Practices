package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcInsert {
	
	static String url = "jdbc:mysql://localhost:3306/TestDB";
    static String user = "root";
    static String pass = "Rohini_16";


	public static void insert(Scanner sc) {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            String sql = "INSERT INTO Student VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setString(4, email);

            ps.executeUpdate();
            System.out.println("Inserted!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
