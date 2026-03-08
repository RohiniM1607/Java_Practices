/**
 * P2_DigitalOnlinePaymentSystem
 * This program simulates a digital payment system supporting multiple
 * payment methods such as Credit Card, UPI, and NetBanking. It uses
 * abstraction to maintain a common payment workflow while allowing
 * specific implementations for each payment type.
 */
package OOPs;

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

public class P2_DigitalOnlinePaymentSystem {

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment("TXN01", 5000, "Rohini", "1234567812345678", "123", "12/26");
		Payment p2 = new UPIPayment("TXN02", 1500, "Rahul", "rahul@upi", "4321");
		Payment p3 = new NetBankingPayment("TXN03", 3000, "Anita", "SBI", "9876543210", "SBIN0001234");
		Payment p4 = new CreditCardPayment("TXN04", 2500, "Kiran", "12345", "12", "1/2");
		p1.executeTransaction();
		System.out.println();
		p2.executeTransaction();
		System.out.println();
		p3.executeTransaction();
		System.out.println();
		p4.executeTransaction();
	}

}
