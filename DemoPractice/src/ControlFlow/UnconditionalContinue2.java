package ControlFlow;

public class UnconditionalContinue2 {

	public static void main(String[] args) {
		int executiveSeat = 5, premiumSeat = 5, vipSeat = 5, seatBooked = 0;
		int regularSeat = 0;
		int totalSeat = regularSeat + executiveSeat + premiumSeat + vipSeat;
		for(seatBooked = 0; seatBooked < totalSeat; seatBooked++) {
			if(seatBooked < (vipSeat)){
				System.out.println("All VIP Seats 1 to 5 are Reserved ");
				continue;
			}
			else if(seatBooked < vipSeat + premiumSeat) {
				System.out.println("PREMIUM Seat No : "+(seatBooked+1));
			}
			else if(seatBooked < (vipSeat + premiumSeat + executiveSeat)) {
				System.out.println("EXECUTIVE Seat No : "+(seatBooked+1));
			}
		}

	}

}
