package ControlFlow;

import java.util.Scanner;

public class M9_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		if(!(num>99 && num<1000)) {
			System.out.println("Invalid Number.");
		}
		else {
			while(num>0) {
				int rem = num%10;
				sum += Math.pow(rem, 3);
				num/=10;
			}
			if(sum == temp)
				System.out.println(temp+" is Armstrong Number");
			else
				System.out.println(temp+" is Not Armstrong Number");
		}
		
	}

}
