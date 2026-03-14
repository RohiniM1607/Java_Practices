package ControlFlow;

public class LabeledContinue2 {

	public static void main(String[] args) {
		int MaxSeatCount = 5, TotalScreenCount = 2, seatCount = 0, screenCount = 0;
		SkipScreen:
		//System.out.println(screenCount);
		while(screenCount < TotalScreenCount){
			System.out.println("Screen "+(screenCount)+" Ticket Booking detail");
			seatCount=0;
		SkipSeat:
		while(seatCount < MaxSeatCount){
			seatCount++;
			if((seatCount == 2 || seatCount == 3) && screenCount == 1) {
				System.out.println("Seat No "+seatCount+" is Reserved");
				continue SkipSeat;
			}
			else
				System.out.println("Seats No Booked : "+(seatCount));
			}
			System.out.println("All Seats Filled in Screen "+(screenCount+1));
			screenCount++;
		} 
	}

}
