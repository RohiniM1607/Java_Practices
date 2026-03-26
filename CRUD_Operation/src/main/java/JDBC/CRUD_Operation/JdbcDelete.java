package JDBC.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDelete {

	static String url = "jdbc:mysql://localhost:3306/TestDB";
    static String user = "root";
    static String pass = "Rohini_16";

    public static void delete(Scanner sc) {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            System.out.print("Enter Name to delete: ");
            String name = sc.nextLine();

            String sql = "DELETE FROM Student WHERE Name=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted!");
            else
                System.out.println("Not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
