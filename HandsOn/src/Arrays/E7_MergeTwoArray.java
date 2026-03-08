/*The E7_MergeTwoArray class implements the program
 * that illustrates to merge two array using for loop 
 */

package Arrays;

import java.util.Scanner;

public class E7_MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the size of second array: ");
		int n2 = sc.nextInt();
		int []arr1 = new int[n1];
		int []arr2 = new int[n2];
		System.out.print("Enter the elements of first array: ");
		for(int i=0; i<n1; i++)
			arr1[i] = sc.nextInt();
		System.out.print("Enter the elements of second array: ");
		for(int i=0; i<n2; i++)
			arr2[i]= sc.nextInt();
		int []res = new int[n1+n2];     //Merging two array 
		for(int i=0; i<n1; i++)
			res[i] = arr1[i];
		for(int i=0; i<n2; i++)
			res[i+n1] = arr2[i];
		for(int i=0; i<n1+n2; i++)
			System.out.print(res[i]+" ");
	}

}
