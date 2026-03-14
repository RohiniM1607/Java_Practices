package ControlFlow;

public class LabeledBreak2 {

	public static void main(String[] args) {
		int MaxSeatCount = 10, TotalScreenCount = 2, seatCount = 0, screenCount = -1;
		Start:
		//System.out.println(screenCount);
		while(screenCount < TotalScreenCount){
			screenCount++;
			System.out.println("Screen "+(screenCount+1)+" Seat Booked detail");
			seatCount=0;
			while(seatCount < MaxSeatCount){
				if(seatCount >3 && screenCount == 1) {
					System.out.println("Seat No 4 & 5 are Reserved");
					break Start;
				}
				else {
					System.out.println("Seats No Booked : "+(seatCount+1));
					seatCount++;
				}
				System.out.println("All Seats Filled in Screen "+(screenCount+1));
			}
		}
	}

}
