package ControlFlow;

public class NestedLoopStatement2 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, TotalScreenCount = 2, seatCount = 0, screenCount = 0;
		while(screenCount < TotalScreenCount){
			seatCount = 0;
			System.out.println("Screen "+(screenCount+1)+" Availability details");
			while(seatCount < MaxSeatCount){
				System.out.println("Current Seat Availability : "+(MaxSeatCount-seatCount));
				seatCount++;
		} 
		System.out.println("Seats Filled in Screen "+(screenCount+1));
		screenCount++;
	}
	}

}
