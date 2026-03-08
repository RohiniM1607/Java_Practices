/*The M1_SearchElement class implements the program
 * that illustrates to finding the missing number in
 * a given array using for loop.
 */

package Arrays;

import java.util.Scanner;

public class M1_SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter the target element: ");
		int key = sc.nextInt();
		boolean found = false;
		for(int i=0; i<n; i++) {
			if(arr[i]==key)         //Check the array element with target element
				found = true;
		}
		if(found)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
