/*
 * The E1_CalculateSum class implements the program
 * that illustrates to calculate the sum of odd and 
 * even numbers using function.
 */

package Functions;

import java.util.Scanner;

public class E1_CalculateSum {
	public static void calculateSum(int n) {
		int even = 0, odd = 0;
		for(int i=0; i<=n; i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("Sum of Even numbers: "+even);
		System.out.println("Sum of Odd numbers: "+odd);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		calculateSum(n);
		
	}

}
