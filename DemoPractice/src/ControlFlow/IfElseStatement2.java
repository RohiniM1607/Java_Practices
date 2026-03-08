package ControlFlow;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seatAvailable = false;
		System.out.println("Enter the seat number: ");
		String seatNumber = sc.next();
		if(seatAvailable) {
			System.out.println("You have booked the seat number: "+seatNumber);
		}
		else {
			System.out.println("Seat Number "+seatNumber+" is already booked");
		}
		sc.close();
	}

}
