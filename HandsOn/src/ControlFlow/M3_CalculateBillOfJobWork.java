package ControlFlow;

import java.util.Scanner;

public class M3_CalculateBillOfJobWork {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pages, copies;
        int typingCost, printingCost, totalBill;

        System.out.print("Enter number of pages: ");
        pages = sc.nextInt();

        System.out.print("Enter number of copies: ");
        copies = sc.nextInt();

        typingCost = pages * 3;

        if(copies >= 1) {
            printingCost = pages * 5;

            printingCost += (copies - 1) * pages * 3;
        } else {
            printingCost = 0;
        }
        totalBill = typingCost + printingCost;

        System.out.println("Typing Cost = Rs. " + typingCost);
        System.out.println("Printing Cost = Rs. " + printingCost);
        System.out.println("Total Bill = Rs. " + totalBill);
    }
}
