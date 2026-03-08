/*
 * The E9_SumOfDigits class implements the program that 
 * illustrates to print the sum of digit of the given
 * number.
 */

package ControlFlow;

import java.util.Scanner;

public class E9_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
	}

}
