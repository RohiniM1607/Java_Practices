/*
 * E1_FindTotalSalary class implements the program that
 * illustrates to finding the total salary using control
 * flow statement.
 */

package ControlFlow;

import java.util.Scanner;

public class E1_FindTotalSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int empID = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String empName = sc.nextLine();
		System.out.print("Enter Wages per day: ");
		int wage = sc.nextInt();
		System.out.print("Enter Number of days worked: ");
		int days = sc.nextInt();
		int salary = days*wage;
		System.out.println("Total Salary: "+salary);
	}

}
