package ControlFlow;

import java.util.Scanner;

public class H4_PaidAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bill amount: ");
		int bill = sc.nextInt();
		float dis;
		if(bill<2000) {
			dis =(float)0.15 * bill;
			System.out.println("Total amount to pay: "+(bill-dis));
		}
		else if(bill>=2000 && bill<5000) {
			dis = (float)0.25 * bill;
			System.out.println("Total amount to pay: "+(bill-dis));
		}
		else if(bill>=5000 && bill<10000) {
			dis = (float)0.35 * bill;
			System.out.println("Total amount to pay: "+(bill-dis));
		}
		else if(bill>=10000) {
			dis = (float)0.50 * bill;
			System.out.println("Total amount to pay: "+(bill-dis));
		}
	}

}
