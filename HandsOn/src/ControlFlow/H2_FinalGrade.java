/*
 * The H2_FinalGrade class implement the program that
 * illustrate to check the average grade using all the 
 * given exercise and exam grade 
 */

package ControlFlow;

import java.util.Scanner;

public class H2_FinalGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double exercise, exam, finalGrade;
        double sum = 0;
        int count = 0;

        while(true) {

            System.out.print("Enter exercise grade: ");
            exercise = sc.nextDouble();

            System.out.print("Enter exam grade: ");
            exam = sc.nextDouble();

            if(exercise == -1 || exam == -1)
                break;

            if(exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
                System.out.println("Invalid grade! Enter values between 0 and 10.");
                continue;
            }

            if(exercise >= 5 && exam >= 5) {
                finalGrade = (0.3 * exercise) + (0.7 * exam);
            } 
            else {
                finalGrade = Math.min(exercise, exam);
            }

            System.out.println("Final Grade: " + finalGrade);

            sum += finalGrade;
            count++;
        }

        if(count > 0)
            System.out.println("Average Grade: " + (sum / count));
        else
            System.out.println("No students entered.");
	}

}
