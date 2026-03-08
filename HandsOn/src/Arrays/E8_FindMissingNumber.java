/*The E8_FindMissingNumber class implements the program
 * that illustrates to finding the missing number in a 
 * given array using for loop.
 */

package Arrays;

import java.util.Scanner;

public class E8_FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int []arr = new int[n-1];
		System.out.println("Enter " + (n - 1) + " elements(1 to "+n+"):");
		for(int i=0; i<n-1; i++) {
			arr[i] = sc.nextInt();
		}
		int expected = (n*(n+1))/2;      //Overall total
		int total = 0;                   //Array total
		for(int i=0; i<n-1; i++)
			total+=arr[i];
		int missing = expected - total;     //Find missing element
		System.out.println(missing);
	}

}
