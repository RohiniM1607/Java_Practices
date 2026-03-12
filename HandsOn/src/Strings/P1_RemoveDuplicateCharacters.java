/*
 * The class P1_RemoveDuplicateCharacters implements the program that illustrates
 * the method that removes all the duplicate characters from the given string.
 */
package Strings;

import java.util.Scanner;

public class P1_RemoveDuplicateCharacters {
	public static String removeDuplicate(String str) {
		int n = str.length();
		StringBuilder res = new StringBuilder();
		boolean []freq = new boolean[256];
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			if(freq[ch]==false) {
				res.append(str.charAt(i));
				freq[ch]=true;
			}
				
		}
		return res.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String s = str.toLowerCase();
		String res = removeDuplicate(s);
		System.out.println(res);
	}

}
