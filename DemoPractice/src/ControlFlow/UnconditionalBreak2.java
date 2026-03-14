package ControlFlow;

public class UnconditionalBreak2 {

	public static void main(String[] args) {
		int premiumSeat = 5, vipSeat = 5, seatBooked = 0;
		int totalSeat = premiumSeat + vipSeat;
		for(seatBooked = 0; seatBooked < totalSeat; seatBooked++) {
			if(seatBooked > premiumSeat) {
				System.out.println("All PREMIUM Seats Booked");
				System.out.println("All VIP Seats 1 to 5 are Reserved");
				break;
			}
			else {
				System.out.println("PREMIUM Seat Availability: "+(premiumSeat- seatBooked));
			}
		}
	}

}
