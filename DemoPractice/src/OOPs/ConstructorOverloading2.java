package OOPs;
class TheatreConstructor {
	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatreLocation;
	TheatreConstructor(){
		theatreId = 4965;
		theatreName = "Metro City";
		totalTheatreScreens = 100;
		theatreLocation = "Ahmedabad";
	}
	TheatreConstructor(int tid, String tname,int halls,String addr){
		theatreId = tid; 
		theatreName = tname;
		totalTheatreScreens = halls;
		theatreLocation = addr;
	}
	public void getTheatreDetails(){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Total Theatre Screens : "+totalTheatreScreens);
		System.out.println("Theatre Location : "+theatreLocation);
		System.out.println("--------------------------");
	}
}

public class ConstructorOverloading2 {
	

	public static void main(String[] args) {
		TheatreConstructor T1 = new TheatreConstructor(); 
		TheatreConstructor T2 = new TheatreConstructor(4742, "SPI Cinemas", 120, "Chennai");
		System.out.println("Default Constructor");
		T1.getTheatreDetails();
		System.out.println("Parameterized Constructor");
		T2.getTheatreDetails();
	}

}
