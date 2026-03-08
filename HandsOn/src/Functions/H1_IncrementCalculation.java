/*
 * The H1_IncrementCalculation class implements the program
 * that illustrates to calculate the increment based on their
 * salary and their perfomance rating using function.
 */

package Functions;

import java.util.Scanner;

public class H1_IncrementCalculation {
	public static float calculateIncrement(float salary, float rating) {
		
		if(rating>=1 && rating<=4) {
			return (float) (salary+(0.10*salary));
		}
		else if(rating>=4.1 && rating<=7) {
			return (float) (salary+(0.25*salary));
		}
		else if(rating>=7.1 && rating<=10) {
			return (float) (salary+(0.30*salary));
		}
			
		
		else
			return (float) -1.0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		float salary = sc.nextFloat();
		System.out.print("Enter the appraisal rating: ");
		float rating = sc.nextFloat();
		float totalSal = calculateIncrement(salary, rating);
		if(totalSal>0)
			System.out.println(totalSal);
		else
			System.out.println("Invalid Input");
	}

}
