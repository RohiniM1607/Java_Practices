package OOPs;

public class StaticMethodMain {
	private static int totalseats = 20;
	StaticMethodMain(){
		System.out.println("Current Seat Availability: "+totalseats);
	}
	public void DisplayTheatreScreen() {
		System.out.println("Current Seat Availability: "+totalseats);
	}
	public static void BookTicket(int nooftickets) {
		System.out.println("No. of Seats Booked: "+nooftickets);
		totalseats -= nooftickets;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Screen Ticket Availability Status:");
		StaticMethodMain t1 = new StaticMethodMain();
		t1.BookTicket(4);
		StaticMethodMain t2 = new StaticMethodMain();
		t2.BookTicket(5);
		t2.DisplayTheatreScreen();
	}

}
