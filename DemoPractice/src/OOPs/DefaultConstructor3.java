package OOPs;

class DConstructor3 {
	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatreLocation;
	DConstructor3(){
		theatreId = 4965;
		theatreName = "Metro City";
		totalTheatreScreens = 8;
		theatreLocation = "Ahmedabad"; 
		}
	public void getTheatreDetails (){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Total Theatre Halls : "+totalTheatreScreens);
		System.out.println("Theatre Location : "+theatreLocation);
		System.out.println("--------------------------");
	}
}

public class DefaultConstructor3 {

	public static void main(String[] args) {
		DConstructor3 T = new DConstructor3();
		T.getTheatreDetails(); 
	}

}
