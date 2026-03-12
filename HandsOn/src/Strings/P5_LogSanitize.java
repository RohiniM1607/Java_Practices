/*
 * The class P5_LogSanitize implements the program that illustrates 
 * to sanitize the log entry according to the rules.
 */
package Strings;

import java.util.Scanner;

public class P5_LogSanitize {
	public static String passwordSanitize(String password, Scanner sc) {
		int n = password.length();
		System.out.print("Choose the masking type(1.Fixed 2.Dynamic): ");
		int m = sc.nextInt();
		String res = "";
		if(m==1)
			res = "***********";
		else {
			
			for(int i=0; i<n; i++)
				res+="*";
		}
		return res;
	}
	
	public static String ipSanitize(String str) {
		return "xxx.xxx.xxx.xxx";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the User: ");
		String user = sc.nextLine();
		System.out.print("Enter the Password: ");
		String password = sc.nextLine();
		System.out.print("Enter the IP: ");
		String ip = sc.nextLine();
		System.out.print("Enter the status: ");
		String status = sc.nextLine();
		
		
		System.out.println("User: "+user);
		System.out.println("Password: "+passwordSanitize(password, sc));
		System.out.println("IP: "+ipSanitize(ip));
		System.out.println("Status: "+status);
	}

}
