/*
 * The H2_DiceGame class implements the program
 * that illustrates to identify winner of the dice
 * playing game using arrays.
 */

package Arrays;

import java.util.Scanner;

public class H2_DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 scores of Arun dice choice: ");
		int []arun = new int[10];
		for(int i=0; i<10; i++)
			arun[i] = sc.nextInt();
		System.out.print("Enter 10 scores of Naveen dice choice: ");
		int []naveen = new int[10];
		for(int i=0; i<10; i++)
			naveen[i] = sc.nextInt();
		int a=0, n=0;
		for(int i=0; i<10; i++) {
			if(arun[i]>naveen[i])
				a++;
			else if(arun[i]<naveen[i])
				n++;
			else {
				a++;
				n++;
			}
		}
		if(a>n)
			System.out.println("Arun wins!!!");
		else
			System.out.println("Naveen wins!!!");
	}

}
