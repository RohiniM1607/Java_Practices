package ControlFlow;

public class NestedloopStatement4 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, TotalScreenCount = 2, seatCount = 0, screenCount = 0;
		do{
			System.out.println("Screen "+(screenCount+1)+" Availability details");
			seatCount = 0;
			do{
				System.out.println("Current Seats Availability : "+(MaxSeatCount-seatCount));
				seatCount++;
			} while(seatCount < MaxSeatCount);
			System.out.println("Seats Filled in Screen "+(screenCount+1));
			screenCount++;
		} while(screenCount < TotalScreenCount);
		
	}
}
