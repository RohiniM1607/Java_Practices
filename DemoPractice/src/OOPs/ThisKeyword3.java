package OOPs;

class This3 {
	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatreLocation;
	public void setTheatreDetails(int theatreId, String theatreName, int totalTheatreScreens,String theatreLocation){
		this.theatreId = theatreId; //this.theatreId and theatreId are instance variable
		this.theatreName = theatreName; //this.theatreName and theatreName are instance variable
		this.totalTheatreScreens = totalTheatreScreens; //this.totaltheatreScreens and totaltheatreScreens are instance variable
		this.theatreLocation = theatreLocation; //this.theatreLocation and theatreLocation are instance variable
	}
	public void getTheatreDetails() {
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Total Theatre Halls : "+totalTheatreScreens);
		System.out.println("Theatre Location : "+theatreLocation);
		System.out.println("--------------------------");
	}
}


public class ThisKeyword3 {

	public static void main(String[] args) {
		This3 T = new This3();
		T.setTheatreDetails(4523, "INOX", 10, "Kochi");
		T.getTheatreDetails(); 
	}

}
