package com.cgi.javaconcepts;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee.companyName="CGI";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=Employee.getEmployeeInstance();
		
		//emp1.empId=-101;
		emp1.empName="Saul";
		emp1.empSalary=8000;

		//emp2.empId=-102;
		emp2.empName="Kim";
		emp2.empSalary=9000;

		//emp3.empId=103;
		emp3.empName="John";
		emp3.empSalary=4000;

		
		String authorName=Employee.getAuthorName();
		System.out.println(authorName);
		
		emp2.printEmployeeDetails();
		emp1.printEmployeeDetails();
		emp3.printEmployeeDetails();
	}

}
