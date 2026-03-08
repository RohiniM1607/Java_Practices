/*
 * The E3_MaxAndMinValue class implements the program
 * that illustrates finding the maximum and minumum value
 * in the array using for loop
 */

package Arrays;

import java.util.Scanner;

public class E3_MaxAndMinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {   
			if(arr[i]>max)
				max = arr[i];   //Storing the maximum value
			if(arr[i]<min)
				min = arr[i];    //Storing the minimum value
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
