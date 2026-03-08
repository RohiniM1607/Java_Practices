/*
 * The E4_VoteEligibility class implements the program that
 * illustrates to check whether the perso is eligible to vote 
 * or not using function
 */

package Functions;

import java.util.Scanner;

public class E4_VoteEligibility {
	public static boolean checkEligibility(int age) {
		if(age>=18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		boolean res = checkEligibility(age);
		if(res)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible to vote");
	}

}
