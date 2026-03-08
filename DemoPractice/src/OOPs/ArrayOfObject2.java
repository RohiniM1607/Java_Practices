package OOPs;

public class ArrayOfObject2 {
	String theatreID;
	String theatreName;
	public void setTheatre(String id, String name) {
		theatreID = id;
		theatreName = name;
	}
	public void getTheatreDetails (){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreID);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
		
		ArrayOfObject2 obj[] = new ArrayOfObject2[3];
		for(int i=0;i<obj.length;i++) {
			obj[i] = new ArrayOfObject2();
		}
		obj[0].setTheatre("T4523", "INOX");
		obj[1].setTheatre("T4742", "SPI Cinemas");
		obj[2].setTheatre("T4965", "Metro City");
		for(int i = 0;i<obj.length;i++) {
			obj[i].getTheatreDetails();
		}
	}

}
