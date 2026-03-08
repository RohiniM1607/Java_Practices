/**
 * P1_EmployeePayRollManagementSystem
 * This program demonstrates a payroll management system for different
 * types of employees such as Permanent, Contract, and Intern using
 * inheritance and polymorphism to calculate salaries efficiently.
 */

package OOPs;

import java.util.*;

class Employee2{
	String empId;
	String empName;
	double baseSalary;
	
	Employee2(String empId, String empName, double baseSalary){
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double calculateSalary() {
		return baseSalary;
	}
	
	@Override
	public String toString() {
		return "Employee Id: "+empId+"\nEmployee Name: "+empName+"\nSalary: "+calculateSalary();
	}
	
}

class PermanentEmployee extends Employee2{
	double bonus;

	PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		return baseSalary + bonus;
	}
}

class ContractEmployee extends Employee2{
	double taxRate;
	double serviceCharge;
	
	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge){
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}
	
	public double calculateSalary() {
		return baseSalary - (baseSalary*taxRate)-serviceCharge;
	}
}

class Intern extends Employee2{
	double stipend;
	Intern(String empId, String empName, double baseSalary, double stipend){
		super(empId, empName, baseSalary);
		this.stipend = stipend;
	}
	
	public double calculateSalary() {
		return stipend;
	}
}

public class P1_EmployeePayRollManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int emp;
		Employee2 emp1;
		
		String empId;
	    String empName;
	    double baseSalary;
	    
		System.out.println("***Employee Roll***");
		System.out.println("1. Permanent Employee");
		System.out.println("2. Contract Employee");
		System.out.println("3. Intern");
		System.out.println("4. Exit");

		System.out.print("Enter the Employee roll: ");
		emp = sc.nextInt();

		switch(emp) {
		case 1:
			System.out.print("Enter the employee Id: ");
			empId = sc.next();

			System.out.print("Enter the employee name: ");
			empName = sc.next();

			System.out.print("Enter the base salary: ");
			baseSalary = sc.nextDouble();
			
			System.out.print("Enter the bonus: ");
			double bonus = sc.nextDouble();
			emp1 = new PermanentEmployee(empId, empName, baseSalary, bonus);
			System.out.println("\nPermanent Employee Details\n"+emp1);
			break;

		case 2:
			System.out.print("Enter the employee Id: ");
			empId = sc.next();

			System.out.print("Enter the employee name: ");
			empName = sc.next();

			System.out.print("Enter the base salary: ");
			baseSalary = sc.nextDouble();
			System.out.print("Enter the tax rate: ");
			double taxRate = sc.nextDouble();
			System.out.print("Enter the service charge: ");
			double serviceCharge = sc.nextDouble();
			emp1 = new ContractEmployee(empId, empName, baseSalary, taxRate, serviceCharge);
			System.out.println("\nContract Employee Details\n"+emp1);
			break;
			
		case 3:
			System.out.print("Enter the employee Id: ");
			empId = sc.next();

			System.out.print("Enter the employee name: ");
			empName = sc.next();

			System.out.print("Enter the base salary: ");
			baseSalary = sc.nextDouble();
			System.out.print("Enter the stipend: ");
			double stipend = sc.nextDouble();
			emp1 = new Intern(empId, empName, baseSalary, stipend);
			System.out.println("\nIntern Employee Details\n"+emp1);
			break;
			
		case 4:
			System.out.println("Exiting from the application");
			break;
			
		default:
			System.out.println("Invalid choice of employee roll.");
			break;
		}


		
	}

}
