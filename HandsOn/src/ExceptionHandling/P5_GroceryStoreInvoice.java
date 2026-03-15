/*
 * The class P5_GroceryStoreInvoice implements the program that illustrate to 
 * reads input from the user using Scanner,creates an Invoice object after 
 * validating the inputs, and handles possible exceptions like 
 * InputMismatchException and IllegalArgumentException.
 */

package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

class Invoice {
    int partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
        if (partNumber <= 0)
            throw new IllegalArgumentException("Part number must be greater than 0");

        if (partDescription == null || partDescription.trim().isEmpty())
            throw new IllegalArgumentException("Part description cannot be empty");

        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");

        if (pricePerItem <= 0)
            throw new IllegalArgumentException("Price per item must be greater than 0");

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Total Amount: " + (quantity * pricePerItem));
    }
}

public class P5_GroceryStoreInvoice {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try {

	            System.out.print("Enter Part Number: ");
	            int partNumber = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Part Description: ");
	            String partDescription = sc.nextLine();

	            System.out.print("Enter Quantity: ");
	            int quantity = sc.nextInt();

	            System.out.print("Enter Price per Item: ");
	            double pricePerItem = sc.nextDouble();

	            Invoice inv = new Invoice(partNumber, partDescription, quantity, pricePerItem);

	            System.out.println("\nInvoice Details:");
	            inv.displayInvoice();

	        } 
	        catch (InputMismatchException e) {
	            System.out.println("Invalid input type. Please enter correct data.");
	        } 
	        catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
