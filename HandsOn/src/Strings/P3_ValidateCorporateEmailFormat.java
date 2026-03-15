/*
 * The class P3_ValidateCorporateEmailFormat validates whether
 * the entered email follows the required corporate email format
 * using regular expressions.
 */
package Strings;

import java.util.Scanner;

public class P3_ValidateCorporateEmailFormat {
	public static boolean Validatemail(String mail) {
		String regex = "^[a-z][a-z0-9._-]*@[a-z0-9-]+(\\.[a-z0-9-]+)+$";
		return mail.matches(regex);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mail Id: ");
		String mail = sc.nextLine();
		if(Validatemail(mail)) {
			System.out.println("Valid email");
		}
		else {
		System.out.println("Invalid email");
		}
	}

}
