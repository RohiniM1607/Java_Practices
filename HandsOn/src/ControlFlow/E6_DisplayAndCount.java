/*
 * The E6_DisplayAndCount class implements a program that
 * prints "Hello" for each entered integer and stops on a
 * negative number, then displays the total count.
 */


package ControlFlow;

import java.util.Scanner;

public class E6_DisplayAndCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n;
		do {
			System.out.print("Enter the number: ");
			n = sc.nextInt();
			if(n>=0) {
				System.out.println("Hello");
				sum++;
			}
			else
				break;
		}while(n>=0);
		System.out.println("Count: "+sum);
	}

}
