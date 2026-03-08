package OOPs;

class ThisDemo{
	int empId;
	String empName;
	double empSalary;
	//1.Using this to refer to instane variables
	ThisDemo(int empId, String empName, double empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	//2.Using this() to call another constructor(constructor chaining)
	ThisDemo(){
		this(101, "Default Employee", 30000);
		System.out.println("Default constructor called - initialized with default data.\n");
	}
	//3.Using this to call another method in the same class
	void registerEmployee() {
		System.out.println("Registering Employee...");
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary+"\n");
	}
	//4.Using this to pass current object as an argument
	void sendForProcessing() {
		HRDepartment hr = new HRDepartment();
		hr.processEmployee(this);
	}
	
	//5.Using this to return current object(Method chaining)
	ThisDemo updateSalary(double hikePercentage) {
		this.empSalary = empSalary + (empSalary*hikePercentage/200);
		return this;
	}
	
	ThisDemo updateName(String newName) {
		this.empName = newName;
		return this;
	}
}
	
	//Helper class representing another department
class HRDepartment{
	void processEmployee(ThisDemo e) {
		System.out.println("HR Department Processing Employee..");
		System.out.println("Processed Employee: "+e.empName+" with salary "+e.empSalary+"\n");
		
	}
}
public class ThisDemoMain {

	public static void main(String[] args) {
		//Calls default constructor - internally calls parameterized constructor
		ThisDemo emp = new ThisDemo();
		
		//1 and 2 demonstrated through constructor chaining
		emp.registerEmployee();
		
		//4.Passing current object to another class
		emp.sendForProcessing();
		
		//5.Method chaining to update details
		System.out.println("--Updating Employee Details---");
		emp.updateName("Subham").updateSalary(15.5).displayDetails();
		
		//Passing again after update
		emp.sendForProcessing();
	}

}
