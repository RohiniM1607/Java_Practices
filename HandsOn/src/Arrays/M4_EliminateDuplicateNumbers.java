/*
 * The M4_EliminateDuplicateNumbers class implements the program
 * that illustrates to eliminating the duplicate numbers from the list
 * using for loop
 */
package Arrays;

import java.util.Scanner;

public class M4_EliminateDuplicateNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int unique[] = new int[n];
        int k = 0;   

        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < k; j++) {
                if(arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                unique[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
	}

}
