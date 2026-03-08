package ControlFlow;

public class ForLoopStatement2 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, seatCount = 0;
		for(seatCount=0;seatCount < MaxSeatCount;seatCount++){
			System.out.println("Current Seat Availability : "+(MaxSeatCount-seatCount));
		}
		System.out.println("Seats are Filled");
	}

}
