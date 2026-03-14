package OOPs;

class StaticMeth2{
	private static int totalseats = 20 ; 
	StaticMeth2(){
		System.out.println("Current Seat Availability : "+totalseats);
	}
	public void DisplayTheatreScreen() {
		System.out.println("Current Seat Availability : "+totalseats);
	}
	public static void BookTicket(int nooftickets) { 
		System.out.println("No. of Seats Booked : "+nooftickets);
		totalseats-=nooftickets;
	}
}

public class StaticMethod2 {

	public static void main(String[] args) {
		System.out.println("Screen Ticket Availability Status:");
			StaticMeth2 TS1 = new StaticMeth2();
			TS1.BookTicket(4);
			StaticMeth2 TS2 = new StaticMeth2();
			TS2.BookTicket(5);
			TS2.DisplayTheatreScreen();
	}

}
