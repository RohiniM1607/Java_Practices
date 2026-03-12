/**
 * P2_DigitalOnlinePaymentSystem
 * This program simulates a digital payment system supporting multiple
 * payment methods such as Credit Card, UPI, and NetBanking. It uses
 * abstraction to maintain a common payment workflow while allowing
 * specific implementations for each payment type.
 */
package OOPs;

import java.util.*;

abstract class Payment {

	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus = "Pending";

	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
	}

	abstract boolean validatePayment();

	abstract boolean processPayment();

	void executeTransaction() {
		if (validatePayment()) {
			if (processPayment()) {
				setPaymentStatus("Success");
			} else {
				setPaymentStatus("Failed");
			}
		} else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();
	}

	void generateReceipt() {
		System.out.println("Transation details");
		System.out.println("Transation Id: " + transactionId);
		System.out.println("Amount: " + amount);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Payment Status: " + paymentStatus);
	}

	String getTransactionId() {
		return transactionId;
	}

	double getAmount() {
		return amount;
	}

	String getPaymentStatus() {
		return paymentStatus;
	}

	void setPaymentStatus(String status) {
		paymentStatus = status;
	}

}

class CreditCardPayment extends Payment {
	String cardNumber;
	String cvv;
	String expiryDate;

	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public boolean validatePayment() {
		return (cardNumber.length() >= 13 && cardNumber.length() <= 16) && (cvv.length() == 3)
				&& (expiryDate.length() == 5);
	}

	public boolean processPayment() {
		System.out.println("Processing Credit card payment...");
		return true;
	}
}

class UPIPayment extends Payment {
	String upiId;
	String upiPin;

	UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	public boolean validatePayment() {
		return (upiId.length() >= 6 && upiId.length() <= 30 && upiId.contains("@"))
				&& (upiPin.length() == 4 || upiPin.length() == 6);
	}

	public boolean processPayment() {
		System.out.println("Processing UPI payment...");
		return true;
	}
}

class NetBankingPayment extends Payment {
	String bankName;
	String accountNumber;
	String ifscCode;

	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName,
			String accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	public boolean validatePayment() {
		return (accountNumber.length() >= 9 && accountNumber.length() <= 18) && (ifscCode.length() == 11);
	}

	public boolean processPayment() {
		System.out.println("Processing Net Banking Payment...");
		return true;
	}
}

public class H5_P2_DigitalOnlinePaymentSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {

			System.out.println("\n*** Digital Online Payment System ***");
			System.out.println("1. Credit Card Payment");
			System.out.println("2. UPI Payment");
			System.out.println("3. Net Banking Payment");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			String transactionId;
			double amount;
			String customerName;

			Payment payment;

			switch (choice) {

			case 1:
				System.out.print("Enter Transaction ID: ");
				transactionId = sc.next();

				System.out.print("Enter Customer Name: ");
				customerName = sc.next();

				System.out.print("Enter Amount: ");
				amount = sc.nextDouble();

				System.out.print("Enter Card Number: ");
				String cardNumber = sc.next();

				System.out.print("Enter CVV: ");
				String cvv = sc.next();

				System.out.print("Enter Expiry Date (MM/YY): ");
				String expiryDate = sc.next();

				payment = new CreditCardPayment(transactionId, amount, customerName, cardNumber, cvv, expiryDate);
				payment.executeTransaction();
				break;

			case 2:
				System.out.print("Enter Transaction ID: ");
				transactionId = sc.next();

				System.out.print("Enter Customer Name: ");
				customerName = sc.next();

				System.out.print("Enter Amount: ");
				amount = sc.nextDouble();

				System.out.print("Enter UPI ID: ");
				String upiId = sc.next();

				System.out.print("Enter UPI PIN: ");
				String upiPin = sc.next();

				payment = new UPIPayment(transactionId, amount, customerName, upiId, upiPin);
				payment.executeTransaction();
				break;

			case 3:
				System.out.print("Enter Transaction ID: ");
				transactionId = sc.next();

				System.out.print("Enter Customer Name: ");
				customerName = sc.next();

				System.out.print("Enter Amount: ");
				amount = sc.nextDouble();

				System.out.print("Enter Bank Name: ");
				String bankName = sc.next();

				System.out.print("Enter Account Number: ");
				String accountNumber = sc.next();

				System.out.print("Enter IFSC Code: ");
				String ifscCode = sc.next();

				payment = new NetBankingPayment(transactionId, amount, customerName, bankName, accountNumber, ifscCode);
				payment.executeTransaction();
				break;

			case 4:
				System.out.println("Exiting from the application...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 4);

	}

}
