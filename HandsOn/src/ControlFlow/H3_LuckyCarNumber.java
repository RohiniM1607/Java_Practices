package ControlFlow;

import java.util.Scanner;

public class H3_LuckyCarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int count =0;
		while(num>0) {
			count++;
			int rem = num%10;
			sum+=rem;
			num/=10;
		}
		if(count==4) {
			if(sum%3==0 || sum%5==0 || sum%7==0)
				System.out.println("Lucky Number");
			else
				System.out.println("Sorry it's not my lucky number");
		}
		else
			System.out.println(temp+" is not a valid car number");
	}

}
