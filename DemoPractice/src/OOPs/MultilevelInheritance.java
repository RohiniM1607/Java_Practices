package OOPs;

class PersonInh { 
	String name;
	int age;
	void setPersonData(String name, int age){
		this.name=name;
		this.age=age;
	}
	void displayPersonData() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class EmployeeInh extends PersonInh{ 
	String empId;
	void setEmpData(String id){
		empId=id;
	}
	void displayEmpData(){
		System.out.println("ID:"+empId);
	}
}
class ManagerInh extends EmployeeInh { 
	String dept;
	float sal;
	void setManagerData(String depart, float salary){
		dept = depart;
		sal=salary;
	}
	void displayManagerData(){
		System.out.println("Department:"+dept);
		System.out.println("Salary :"+ sal);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		ManagerInh m=new ManagerInh(); //child class object
		m.setPersonData("Arun", 34);
		m.setEmpData("M123");
		m.setManagerData("Marketing",60000);
		m.displayPersonData();
		m.displayEmpData();
		m.displayManagerData();
	}

}
