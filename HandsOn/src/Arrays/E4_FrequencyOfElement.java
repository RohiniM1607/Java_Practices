/*
 * The E4_FrequencyOfElement class implements the program
 * that illustrates to finding the frequency of each element
 * in the array using for loop
 */

package Arrays;

import java.util.Scanner;

public class E4_FrequencyOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
	    boolean []res = new boolean[n];
		for(int i=0; i<n; i++) {
			if(res[i]==true)    //Skip already viewed number
				continue;
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;     //Count the number of times occured
					res[j] = true;
				}
				
			}
			System.out.println(arr[i]+" occurs "+count+" times");
		}
	}

}
