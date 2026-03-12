/*
 * The H6_P4_BankTest class implements the program that illustrates
 * to implement bank functionality and demonstrate the dynamic
 * polymorphism concept.
 */
package OOPs;

import java.util.Scanner;

class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }
}

class Account2 {
    int accNo;
    double balance;

    Account2(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class RBI {
    Customer c;
    Account2 a;

    RBI(Customer c, Account2 a) {
        this.c = c;
        this.a = a;
    }

    public double getInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 25000;
    }

    void display() {
        c.displayCustomer();
        a.displayAccount();
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + getWithdrawalLimit());
    }
}

class SBI extends RBI {

    SBI(Customer c, Account2 a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 5.0;
    }

    public double getWithdrawalLimit() {
        return 40000;
    }
}

class ICICI extends RBI {

    ICICI(Customer c, Account2 a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 4.5;
    }

    public double getWithdrawalLimit() {
        return 35000;
    }
}

class PNB extends RBI {

    PNB(Customer c, Account2 a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 4.25;
    }

    public double getWithdrawalLimit() {
        return 30000;
    }
}

public class H6_P4_BankTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        Customer c = new Customer(name, age);
        Account2 a = new Account2(accNo, balance);

        System.out.println("\nChoose Bank:");
        System.out.println("1. SBI");
        System.out.println("2. ICICI");
        System.out.println("3. PNB");

        int choice = sc.nextInt();

        RBI bank = null;

        if (choice == 1) 
            bank = new SBI(c, a);
        else if (choice == 2) 
            bank = new ICICI(c, a);
        else if (choice == 3) 
            bank = new PNB(c, a);
        else {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        System.out.println("\nBank Details:");
        bank.display();
	}

}
