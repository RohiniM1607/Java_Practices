/*
 * The M1_FindSumOfOddAndEvenNumbers class implements the program
 * that illustrates to finding the sum of odd and even numbers and 
 * their absolute difference from lowerbound to upperbound using
 * functions
 */

package Functions;

import java.util.Scanner;

public class M1_FindSumOfOddAndEvenNumbers {
	public static int calculateEvenSum(int a, int b) {
		int even = 0;
		for(int i=a; i<=b; i++) {
			if(i%2==0)
				even+=i;
		}
		return even;
	}
	public static int calculateOddSum(int a, int b) {
		int odd = 0;
		for(int i=a; i<=b; i++) {
			if(i%2!=0)
				odd+=i;
		}
		return odd;
	}
	public static int absoluteDifference(int even, int odd) {
		int diff = Math.abs(odd-even);
		return diff;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lowerbound and upperbound value: ");
		int upperBound = sc.nextInt();
		int lowerBound = sc.nextInt();
		int evenSum = calculateEvenSum(upperBound, lowerBound);
		int oddSum = calculateOddSum(upperBound, lowerBound);
		int difference = absoluteDifference(evenSum, oddSum);
		System.out.println("Sum of even numbers: "+evenSum);
		System.out.println("Sum of odd numbers: "+oddSum);
		System.out.println("Absolute Difference: "+difference);
	}

}
