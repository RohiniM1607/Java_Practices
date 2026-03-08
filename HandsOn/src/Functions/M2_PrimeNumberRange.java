/*
 * The M2_PrimeNumberRange class implements the program
 * that illustrates to finding the prime numbers between
 * x to y range using functions
 */

package Functions;

import java.util.Scanner;

public class M2_PrimeNumberRange {

	public static void findPrime(int start, int end) {
		boolean found = false;
		for(int i=start; i<=end; i++) {
			int num = i;
			int count = 0;
			for(int j=1; j<num; j++) {
				if(num%j==0)
					count++;
			}
			if(count == 1) {
				System.out.print(num+" ");
				found = true;
			}
		}
		if(!found)
			System.out.println("Not available");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the interval value(x,y): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		findPrime(x,y);
	}

}
