package ControlFlow;
import java.util.*;
public class IfStatement2 {

	public static void main(String[] args) {
		boolean seatAvailable = true; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the Seat Number : ");
		String SeatNumber = sc.next(); 
		if(seatAvailable){ 
			System.out.println("Your have booked the seat number : "+SeatNumber);
		}
		sc.close();
	}

}
