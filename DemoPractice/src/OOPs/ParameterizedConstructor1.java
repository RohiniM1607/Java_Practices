package OOPs;

class PConstructor1 { 
	int empId;
	String empName;

	PConstructor1(int id, String name){
		empId=id; 
		empName=name; 
	}
	void getEmployeeDetails (){
		System.out.println("User given initial employee id is: "+empId);
		System.out.println("User given initial employee name is: "+empName);
	}

}

public class ParameterizedConstructor1 {

	public static void main(String[] args) {
		PConstructor1 emp= new PConstructor1(1003,"Peter");
		emp.getEmployeeDetails();
	}

}
