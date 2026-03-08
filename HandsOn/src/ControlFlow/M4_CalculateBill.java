package ControlFlow;

import java.util.Scanner;

public class M4_CalculateBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int hours, minutes;
        int bill = 0;

        System.out.print("Enter hours used: ");
        hours = sc.nextInt();

        System.out.print("Enter minutes used: ");
        minutes = sc.nextInt();

        if(hours > 7 || (hours == 7 && minutes > 0)) {
            System.out.println("Usage exceeds maximum limit of 7 hours.");
            return;
        }

        if(hours >= 5) {
            bill += 200;           
            hours -= 5;            
        }
        bill += hours * 50;
        bill += minutes * 1;
        System.out.println("Total Internet Bill = Rs. " + bill);

	}

}
