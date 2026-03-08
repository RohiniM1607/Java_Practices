/*
 * The E4_EvaluateTheSeries class implements the program that
 * illustrates to evaluate the number series
 */

package ControlFlow;

import java.util.Scanner;

public class E4_EvaluateTheSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of i: ");
		int i = sc.nextInt();
		int sum = 0, n=1;
		do {
			sum+=n;
			n++;
		}while(n<=i);
		System.out.println("Sum of the series from 1 to "+i+" is "+sum);
		
	}

}
