/*
 * The E8_CheckCharacter class implements the program that
 * illustrates to check whether the given character is alphabet
 * or digit or special symbol using if else-if statement
 */

package ControlFlow;

import java.util.Scanner;

public class E8_CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch))
			System.out.println("Alphabet");
		else if(Character.isDigit(ch))
			System.out.print("Digit");
		else
			System.out.println("Special symbol");
	}

}
