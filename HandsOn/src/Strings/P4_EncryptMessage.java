/*
 * The class P4_EncryptMessage implements the program that illustrates
 * the method to encrypt a message using a simplified corporate cipher
 */
package Strings;

import java.util.Scanner;

public class P4_EncryptMessage {
	public static String encryptMessage(String str) {
		int n = str.length();
		String res = "";
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				ch = (char)((ch - 'a' + 3) % 26 + 'a');
	            res += ch;
	        }

	        else if(ch >= 'A' && ch <= 'Z') {
	            ch = (char)((ch - 'A' + 3) % 26 + 'A');
	            res += ch;
	        }
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
				res += str.charAt(i);
			else if(str.charAt(i)==' ')
				res += '_';
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String res = encryptMessage(str);
		System.out.println(res);
	}

}
