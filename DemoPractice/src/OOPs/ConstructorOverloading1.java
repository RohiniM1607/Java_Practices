package OOPs;

class ConOverloading1 { 
	int empId;
	String empName;
	ConOverloading1(){ 
		empId=0;
		empName="AAA-BBB";
	}
	ConOverloading1(int id, String name){ 
		empId=1111; 
		empName=name; 
	}
	void getEmployeeDetails (){
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee name is:"+empName);
	}
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		ConOverloading1 emp0=new ConOverloading1(); 
		ConOverloading1 emp1= new ConOverloading1(1001,"Ram Kumar"); 
		emp0.getEmployeeDetails();
		emp1.getEmployeeDetails();;
	}

}
