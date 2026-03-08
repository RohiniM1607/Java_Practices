package OOPs;

class ParameterizedConstructor2{
	String theatreID;
	String theatreName;
	ParameterizedConstructor2(String tid, String tname){
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
public class ParameterizedConstructor2Main {

	public static void main(String[] args) {
		ParameterizedConstructor2 con = new ParameterizedConstructor2("T4742","SPI Cinemas");
		con.getTheatreDetails(); 
	}

}
