/*
 * The class P2_CustomTrimMethod implements the program that illustrates
 * the custom method myTrim(String s) that removes leading and trailing spaces 
 * from a string.
 */
package Strings;

import java.util.Scanner;

public class P2_CustomTrimMethod {
	public static String myTrim(String str) {
		int end = str.length()-1;
		int start = 0;
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ')
			end--;
		
		String res = "";
		for(int i=start; i<=end; i++)
			res+=str.charAt(i);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String res = myTrim(str);
		System.out.println(res);
	}

}
