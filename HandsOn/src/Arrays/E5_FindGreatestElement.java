/*
 * The E5_FindGreatestElement class implements the program
 * that illustrates to finding the greatest element of the 
 * array using for loop
 */

package Arrays;

import java.util.Scanner;

public class E5_FindGreatestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
 		}
		int max = arr[0];
		for(int i=1; i<n; i++) {    //Finding the maximum element
			if(max<arr[i])
				max = arr[i];
		}
		System.out.println("The greatest element in the array is "+max);
	}

}
