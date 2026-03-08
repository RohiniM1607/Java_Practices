/*
 * The M5_BloodDonor class implements the program
 * that illustrates to check whether the person is 
 * eligible to donate blood based on their age and 
 * weight using function.
 */

package Functions;

import java.util.Scanner;

public class M5_BloodDonor {
	public static boolean bloodDonor(int age, float weight) {
		if((age>18 && age<=55)&&(weight>45))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		System.out.print("Enter the weight: ");
		float weight = sc.nextFloat();
		boolean eligible = bloodDonor(age, weight);
		if(eligible)
			System.out.println("The person is eligible to donate blood.");
		else
			System.out.println("The person is not eligible to donate blood.");
	}

}
