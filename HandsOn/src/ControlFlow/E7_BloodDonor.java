/*
 *The E7_BloodDonor class implements the program that
 *illustrates to check whether the person is eligible 
 *to donate blood based on the condition
 */

package ControlFlow;

import java.util.Scanner;

public class E7_BloodDonor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		System.out.print("Enter the weight: ");
		float weight = sc.nextFloat();
		if((age>18 && age<55)&&(weight>45.0))
			System.out.println("Eligible for donating blood");
		else
			System.out.println("Not eligible for donating blood");
	}

}
