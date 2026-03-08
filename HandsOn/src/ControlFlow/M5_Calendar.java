package ControlFlow;

import java.util.Scanner;

public class M5_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int month, startDay, days = 0;

        System.out.print("Enter month number (1-12): ");
        month = sc.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("Invalid month. Program terminated.");
            return;
        }
        System.out.print("Enter starting day (1=Mon ... 7=Sun): ");
        startDay = sc.nextInt();
        switch(month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;

            case 2:
                System.out.print("Enter number of days in February (28 or 29): ");
                days = sc.nextInt();
                break;
        }

        System.out.println("\nMon Tue Wed Thu Fri Sat Sun");

        for(int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for(int date = 1; date <= days; date++) {

            System.out.printf("%3d ", date);

            if((date + startDay - 1) % 7 == 0)
                System.out.println();
        }
	}

}
