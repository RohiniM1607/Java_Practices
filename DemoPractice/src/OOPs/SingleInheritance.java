package OOPs;

class InhEmployee { 
	String empName;
	int empId;
	void setData(String name, int id){ 
		empName=name;
		empId=id;
	}
	void displayData(){ 
		System.out.println("Employee Name:"+empName);
		System.out.println("ID:"+empId);
	}
}
class Manager extends InhEmployee { 
	String empDept;
	void setDept(String dept) { 
		empDept = dept;
	}
	void displayDept(){ 
		System.out.println("Department:"+empDept);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Manager m=new Manager(); 
		m.setData("Arun", 123); 
		m.setDept("Marketing");
		m. displayData(); 
		m. displayDept();
	}

}
