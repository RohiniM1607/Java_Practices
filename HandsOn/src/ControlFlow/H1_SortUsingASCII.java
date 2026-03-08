/*
 * The H2_SortUsingASCII class implement the program that
 * illustrate to sort the character using ASCII value.
 */

package ControlFlow;

import java.util.Scanner;

public class H1_SortUsingASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        char arr[] = new char[n];

        System.out.println("Enter characters:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().charAt(0);
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {

                if(arr[j] > arr[j+1]) { 
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted characters:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
