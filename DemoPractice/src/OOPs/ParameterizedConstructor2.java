package OOPs;

class PConstructor2{
	String theatreID;
	String theatreName;
	PConstructor2(String tid, String tname){
		theatreID = tid;
		theatreName = tname;
	}
	public void getTheatreDetails (){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreID);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("--------------------------");
	} 
}
public class ParameterizedConstructor2 {

	public static void main(String[] args) {
		PConstructor2 con = new PConstructor2("T4742","SPI Cinemas");
		con.getTheatreDetails(); 
	}

}
