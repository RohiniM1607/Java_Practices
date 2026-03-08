package ControlFlow;

import java.util.Scanner;

public class M6_SaleAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double price, purchaseAmount, discount, paidAmount;
        int quantity;

        System.out.print("Enter price of item: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        purchaseAmount = price * quantity;

        if(purchaseAmount > 1000) {
            discount = purchaseAmount * 0.10;
        } 
        else {
            discount = purchaseAmount * 0.05;
        }

        paidAmount = purchaseAmount - discount;

        System.out.println("Purchase Amount = " + purchaseAmount);
        System.out.println("Discount = " + discount);
        System.out.println("Paid Amount = " + paidAmount);
	}

}
