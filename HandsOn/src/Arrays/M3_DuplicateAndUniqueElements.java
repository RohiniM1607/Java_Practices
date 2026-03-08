/*
 * The M3_DuplicateAndUniqueElements class implements the program
 * that illustrate to count the total number of duplicate and
 * unique elements in the array using for loop.
 */
package Arrays;

import java.util.*;

public class M3_DuplicateAndUniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        boolean visited[] = new boolean[n];

        System.out.print("Array elements are: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicateCount = 0;
        int uniqueCount = 0;

        for(int i = 0; i < n; i++) {

            if(visited[i] == true)
                continue;

            int count = 1;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if(count > 1)    //Repeated element
                duplicateCount++;
            else
                uniqueCount++;
        }

        System.out.println("No of duplicate element: " + duplicateCount);
        System.out.println("No of unique elements: " + uniqueCount);
	}
		
	

}
