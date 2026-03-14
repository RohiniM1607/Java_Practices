package OOPs;

class GetSet2 {
	private int theatreId;
	private String theatreName;
	private int totalTheatreScreens;
	private String theatreLocation;
	public void setTheatreId(int id) {
		theatreId = id;
	}
	public void setTheatreName(String name) {
		theatreName = name;
	}
	
	public void setTheatreTotalScreen(int count) {
		totalTheatreScreens = count;
	}
	
	public void setTheatreLocation(String name) {
		theatreLocation = name;
	}
	
	public int getTheatreId(){
		return theatreId;
	}

	public String getTheatreName(){
		return theatreName;
	}
	public int getTheatreTotalScreen(){
		return totalTheatreScreens;
	}
	public String getTheatreLocation(){
		return theatreLocation;
	}
}

public class GetterSetter2 {

	public static void main(String[] args) {
		GetSet2 theatre = new GetSet2();
		theatre.setTheatreId(1002);
		theatre.setTheatreName("INOX");
		theatre.setTheatreTotalScreen(10);
		theatre.setTheatreLocation("Chennai");
		System.out.println("--------Theatre Detail----------");
		System.out.println("Theatre ID : "+theatre.getTheatreId());
		System.out.println("Theatre Name : "+theatre.getTheatreName());
		System.out.println("Theatre Total Screen : "+theatre.getTheatreTotalScreen());
		System.out.println("Theatre Location : "+theatre.getTheatreLocation());
	}

}
