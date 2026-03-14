package ControlFlow;

public class NestedLoopStatement6 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, TotalScreenCount = 2, seatCount = 0, screenCount = 0;
		System.out.println("Screen "+(screenCount+1)+" Availability details");
		for(screenCount=0; screenCount < TotalScreenCount;screenCount++){
			for(seatCount=0; seatCount < MaxSeatCount;seatCount++){
				System.out.println("Current Seat Availability "+(MaxSeatCount-seatCount));
			}
			System.out.println("Seats Filled in Screen "+(screenCount+1));
		}
	}

}
