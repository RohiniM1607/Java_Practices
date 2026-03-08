/*
 * H3_BlackWhiteNumber class implements the program that 
 * illustrates to modify the array elements based on 
 * specified condition.
 */

package Arrays;

import java.util.Scanner;

public class H3_BlackWhiteNumber {
	public static void processArray(int arr[], int size) {

        for(int i = 0; i < size; i++) {
            if(arr[i] % 7 == 0 && arr[i] % 8 == 0) {
                arr[i] = -6;
            }

            else if(arr[i] % 7 == 0) {
                arr[i] = -2;
            }

            else if(arr[i] % 8 == 0) {
                arr[i] = -9;
            }
        }
    }


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int arr[] = new int[100];
	        int n = 0;

	        while(true) {
	            int num = sc.nextInt();

	            if(num < 0)
	                break;

	            arr[n++] = num;
	        }
	        processArray(arr, n);
	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i]+" ");
	        }
	}

}
