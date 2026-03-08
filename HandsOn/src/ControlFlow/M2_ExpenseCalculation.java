/*
 * The M2_ExpenseCalculation class implements the program that
 * illustrates to calculate the total expenses by subtracting with
 * discount pecentage.
 */

package ControlFlow;

import java.util.Scanner;

public class M2_ExpenseCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bill amount: ");
		float amount = sc.nextFloat();
		if(amount>500) {
			amount=(float) (amount-(0.15*amount));
		}
		System.out.println("Total expenses: "+amount);
	}

}
