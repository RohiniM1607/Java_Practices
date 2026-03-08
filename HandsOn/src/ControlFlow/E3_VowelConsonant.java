/*
 * The E3_VowelConsonant class implements the program that
 * illustrates to identify the entered character is vowel 
 * or consonant or symbol.
 */

package ControlFlow;

import java.util.Scanner;

public class E3_VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char c = sc.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is vowel");
			break;
		default:
				if(c>='a' && c<='z')
					System.out.println("It is consonant");
				else
					System.out.println("It is Symbol");
		}
	}

}
