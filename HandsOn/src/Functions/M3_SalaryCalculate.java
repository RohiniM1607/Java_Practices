/*
 * The M3_SalaryCalculate class implements the program
 * that illustrates to calculating the overtime salary 
 * for the employees using function.
 */

package Functions;

import java.util.Scanner;

public class M3_SalaryCalculate {
	public static float calculatePay(int hour) {
		int h = hour-40;
		float sal =((float) h*15.00f);
		return sal;
	}

	public static void main(String[] args) {
		int n = 5;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			float salary = 0.0f;
			System.out.print("Enter the working hours of employee: ");
			int hour = sc.nextInt();
			if(hour>40) {
				salary = calculatePay(hour);
				System.out.println("Overtime hours: "+(hour-40));
				System.out.println("Overtime salary: "+salary);
			}
			else {
				System.out.println("No overtime work");
			}
			System.out.println();
		}
	}

}
