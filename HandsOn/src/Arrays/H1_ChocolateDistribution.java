/*
 * The H1_ChocolateDistribution class implements the program
 * that illustrates to check each one of person have equal number
 * of chocolates using array.
 */

package Arrays;

import java.util.Scanner;

public class H1_ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of friends: ");
		int n = sc.nextInt();
		System.out.print("Enter each count: ");
		int []arr = new int[n];
		int total = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			total+=arr[i];
		}
		if(total%n==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	
		
	}

}
