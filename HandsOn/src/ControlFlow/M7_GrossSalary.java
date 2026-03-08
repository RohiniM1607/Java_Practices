package ControlFlow;

import java.util.Scanner;

public class M7_GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double basic, hra = 0, da = 0, gross;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        if(basic <= 10000) {
            hra = basic * 0.20;
            da = basic * 0.80;
        }
        else if(basic <= 20000) {
            hra = basic * 0.25;
            da = basic * 0.90;
        }
        else {
            hra = basic * 0.30;
            da = basic * 0.95;
        }

        gross = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
	}

}
