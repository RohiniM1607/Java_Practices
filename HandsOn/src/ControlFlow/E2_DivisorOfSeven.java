/*
 * The E2_DivisorOfSeven class that implements the program that
 * illustrates to checking whether the given number is divisor of
 * 7 using simple if statement.
 */

package ControlFlow;

import java.util.Scanner;

public class E2_DivisorOfSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num%7 == 0)
			System.out.println(num+" is divisor of 7");
		else
			System.out.println(num+" is not a divisor of 7");
	}

}
