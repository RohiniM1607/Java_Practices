/*
 * The H4_MergeAndSortArray class implements the program
 * that illustrates to merge and sort the array 
 */

package Arrays;

import java.util.Scanner;

public class H4_MergeAndSortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Indian people: ");
		int x = sc.nextInt();
		int []arr1 = new int[x];
		System.out.print("Enter the height of Indian People: ");
		for(int i=0; i<x; i++)
			arr1[i] = sc.nextInt();
		
		System.out.print("Enter the number of NRI people: ");
		int y = sc.nextInt();
		int []arr2 = new int[y];
		System.out.print("Enter the height of NRI People: ");
		for(int i=0; i<y; i++)
			arr2[i] = sc.nextInt();
		
		System.out.print("Enter the number of Foreign people: ");
		int z = sc.nextInt();
		int []arr3 = new int[z];
		System.out.print("Enter the height of Foreign People: ");
		for(int i=0; i<z; i++)
			arr3[i] = sc.nextInt();
		int n = x+y+z;
		int []arr = new int[n];
		for(int i=0; i<x; i++)
			arr[i] = arr1[i];
		for(int i=0; i<y; i++)
			arr[i+x]=arr2[i];
		for(int i=0; i<z; i++)
			arr[i+x+y] = arr3[i];
		//for(int i=0; i<n; i++)
			//System.out.print(arr[i]+" ");
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println();
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
