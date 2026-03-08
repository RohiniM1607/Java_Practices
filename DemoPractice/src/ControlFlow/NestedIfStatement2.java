package ControlFlow;
import java.util.*;
public class NestedIfStatement2 {

	public static void main(String[] args) {
		String username = "Sarvesh", password = "sarvesh@123",usernameentered = null, passwordentered;
		boolean seatAvailable = true;
		String seatNumber;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the Username : ");
		username = input.next(); 
		System.out.println("Enter the Password : ");
		password = input.next(); 
		if (usernameentered.equals(username) && password.equals(password)) 
		{ 
			System.out.println("You have logged in and you can book a ticket now");
			System.out.println("Enter the Seat Number : ");
			seatNumber = input.next(); 
			if (seatAvailable) { 
				System.out.println("Seat Number "+seatNumber+" you have chosen is available");
			} 
			else{
				System.out.println("Your expected Seat Number "+seatNumber+" is not available");
			}
		} 
		else
		{
			System.out.println("You have to login for booking the ticket");
		} 
	}

}
