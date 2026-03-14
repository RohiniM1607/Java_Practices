package OOPs;

class ProjectLeader{
	String proLeadName = "Ram Kumar";
	int empId = 1000;
}

class Programmer extends ProjectLeader{
	String progName;
	int empId;
	void setData(String name, int id) {
		progName = name;
		empId = id;
	}
	void displayData() {
		System.out.println("Programmer Name: "+ progName);
		System.out.println("Programmer Id: "+ empId);
		System.out.println("Project Leader Name: "+ super.proLeadName);
		System.out.println("Project Leader Id: "+ super.empId); 
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		obj.setData("Arun", 111);
		obj.displayData();
	}

}
