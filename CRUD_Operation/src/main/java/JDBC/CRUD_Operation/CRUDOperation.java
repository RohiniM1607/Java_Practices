package JDBC.CRUD_Operation;

import java.util.Scanner;

public class CRUDOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create Table");
            System.out.println("2. Insert");
            System.out.println("3. View");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    JdbcCreateTable.createTable();
                    break;

                case 2:
                    JdbcInsert.insert(sc);
                    break;

                case 3:
                    JdbcSelect.view();
                    break;

                case 4:
                    JdbcUpdate.update(sc);
                    break;

                case 5:
                    JdbcDelete.delete(sc);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
	}

}
