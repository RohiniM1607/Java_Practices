/*
 * The E10_PrinttingPattern class implements the program
 * that illustrates to print the specified number pattern
 */

package ControlFlow;
import java.util.Scanner;

public class E10_PrinttingPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
