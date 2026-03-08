/*The M6_SearchNumberFrequency class implements the program
 * that illustrates to display the number of times the element 
 * appears in the array using for loop
 */
package Arrays;

import java.util.Scanner;

public class M6_SearchNumberFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 25;
		System.out.print("Enter 25 elements of array: ");
		int []arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter the target element: ");
		int count = 0;
		int target = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(arr[i]==target)
				count++;
		}
		if(count>0)
			System.out.println(target+" occurs "+count+" times");
	}

}
