package OOPs;

class ProjectLeader1{
	String proLeadName = "RamKumar";
	int empId = 1000;
	void displayData() {
		System.out.println("Project Leader Name: "+proLeadName);
		System.out.println("Project Leader Id: "+empId);
	}
}

class Programmer1 extends ProjectLeader1{
	String progName;
	int empId;
	void setData(String name, int id) {
		progName = name;
		empId = id;
	}
	void displayData() {
		System.out.println("Programmer Name: "+progName);
		System.out.println("Programmer Id: "+empId);
		super.displayData();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		Programmer1 obj = new Programmer1();
		obj.setData("Arum", 111);
		obj.displayData();
	}

}
