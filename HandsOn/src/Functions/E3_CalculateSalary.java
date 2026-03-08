/*
 * The E3_CalculateSalary class implements the program
 * that illustrates to calculating the new salary with hike
 * using functions.
 */

package Functions;

import java.util.Scanner;

public class E3_CalculateSalary {
	public static int calculateSalary(int salary, int hike) {
		int newSalary = salary+(salary*hike/100);
		return newSalary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary per month: ");
		int salary = sc.nextInt();
		System.out.print("Enter the hike: ");
		int hike = sc.nextInt();
		int newSalary = calculateSalary(salary, hike);
		System.out.println(newSalary);
	}

}
