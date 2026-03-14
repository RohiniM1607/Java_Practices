package OOPs;

class StaticMeth1 { //define Employee class
	int empId;
	String empName;
	static String companyName = "ABC Solutions"; 

	StaticMeth1(int id, String name){
		empId = id; //Assign Initial employee id
		empName = name; //Assign Initial employee name
	}
	static void getCompany(){
		companyName = "XYZ Private Ltd"; //Access static data
	}
		
	void display (){
		System.out.println("Company Name : "+companyName); //common to all employee
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
	}
}


public class StaticMethod1 {

	public static void main(String[] args) {
		StaticMeth1 emp1= new StaticMeth1(1001,"Ram Kumar");
		StaticMeth1 emp2= new StaticMeth1(1002,"Raj Kumar");
		
		emp1.display();
		emp2.display();
		StaticMeth1.getCompany(); 
		
		emp1.display();
		emp2.display();
	}

}
