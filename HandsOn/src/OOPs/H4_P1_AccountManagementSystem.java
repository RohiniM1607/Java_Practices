/*
 * The program implements a simple bank account system.
 * The Account class stores id, name and balance and provides
 * credit, debit and transfer operations.
 * The P1_AccountManagementSystem class creates Account objects and
 * tests the account operations.
 */

package OOPs;

class Account{
	private String id;
	private String name;
	private int balance;
	
	Account(String id, String name){
		this.id = id;
		this.name = name;
		balance = 0;
	}
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	int credit(int amount){
		balance+=amount;
		return balance;
	}
	
	int debit(int amount) {
		if(amount<=balance) {
			return balance-=amount;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	
	int transferTo(Account another, int amount) {
		if(amount<=balance) {
			this.balance-=amount;
			another.balance+=amount;
			return balance;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	@Override
	public String toString() {
		return "Id:"+id+" Name: "+name+" ,Balance: "+balance;
	}
}

public class H4_P1_AccountManagementSystem {
	
	public static void main(String[] args) {
		Account a1 = new Account("A101","Rohini");        
        Account a2 = new Account("A102","Priya",5000);    
        a1.credit(20000);
        a1.debit(100);
        a1.transferTo(a2,1000);
        System.out.println(a1);
        System.out.println(a2);
	}

}
