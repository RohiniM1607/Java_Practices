package ControlFlow;

public class DoWhileStatement2 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, seatCount = 0;
		do{
			System.out.println("Current Seat Availability : "+(MaxSeatCount-seatCount));
			seatCount++;
		} while(seatCount < MaxSeatCount);
		System.out.println("Seats are Filled");
	}

}
