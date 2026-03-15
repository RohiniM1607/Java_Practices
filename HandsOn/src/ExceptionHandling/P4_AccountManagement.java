/*
 * The class P4_AccountManagement implements the program 
 * that illustrates to reads the withdrawal amount from the user,
 * calls the withdrawAmount method, and handles any PayOurOfBoundExceptions
 * that occur during the transaction process.
 */
package ExceptionHandling;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

public class P4_AccountManagement {
	static int balance = 8000; 

    public static void checkForDebit(int amount) throws PayOutOfBoundsException {

        if (amount > 30000) {
            throw new PayOutOfBoundsException("Transaction limit exceeded (Max 30000)");
        }

        if (amount > balance) {
            throw new PayOutOfBoundsException("Insufficient balance");
        }
    }

    public static void withdrawAmount(int amount) throws PayOutOfBoundsException {
        checkForDebit(amount);
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        try {
            withdrawAmount(amount);

        } 
        catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
	}

}
