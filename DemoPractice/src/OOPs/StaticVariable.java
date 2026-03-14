package OOPs;

class StaticVar{
	int empId;
	String empName;
	static String companyName="ABC Solutions"; 
	
	StaticVar(int id, String name) {
	empId=id; 
	empName=name; 
	}
	
	void display (){ 
		System.out.println("Company Name : "+companyName); //common to all employee
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		} 
}

public class StaticVariable {

	public static void main(String[] args) {
		StaticVar emp1= new StaticVar(1001,"Ram Kumar");
		StaticVar emp2= new StaticVar(1002,"Raj Kumar");
		
		emp1.display();
		emp2.display();
	}

}
