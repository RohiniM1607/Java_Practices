/*
 * The E5_PrintAlphabets class implements the program that
 * illustrates to print the alphabet in the specified order.
 */

package ControlFlow;

import java.util.Scanner;

public class E5_PrintAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char start = 'a', end = 'z';
		for(int i=0; i<26; i++) {
			System.out.print((char)(start+i));
			System.out.print((char)(end-i)+" ");
		}
	}

}
