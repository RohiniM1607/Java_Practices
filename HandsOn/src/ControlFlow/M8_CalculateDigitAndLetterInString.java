package ControlFlow;

import java.util.Scanner;

public class M8_CalculateDigitAndLetterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		int len = str.length();
		int digit = 0, letter = 0, others = 0;
		for(int i=0; i<len; i++) {
			if(Character.isDigit(str.charAt(i)))
				digit++;
			else if(Character.isAlphabetic(str.charAt(i)))
				letter++;
			else
				others++;
		}
		System.out.println("Number of Digits: "+digit);
		System.out.println("Number of Letters: "+letter);
		System.out.println("Number of Other symbols: "+others);
	}

}
