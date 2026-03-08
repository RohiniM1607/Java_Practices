/*
 * The E2_SortingArray class implements the program
 * that illustrates sorting the element in array using 
 * for loop
 */

package Arrays;

import java.util.Scanner;

public class E2_SortingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++)    //User Input
			arr[i] = sc.nextInt();
		for(int i=0; i<n; i++) {    //Sort the array
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
