package com.cgi.javaconcepts;

//A class is blueprint or template or type
public class Employee {

	private int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	private static int counter=101;
	
	public Employee()
	{
		empId=counter;
		counter=counter+1;
		System.out.println("object created");
		System.out.println("Launch browser!!");
	}
	

	public static String getAuthorName() {
		return "Balaji Dinakaran";
	}

	public void printEmployeeDetails() {
		System.out.println("---------------------------------------------");
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Salary:" + empSalary);
		System.out.println("CompanyName:" + Employee.companyName);
		System.out.println("---------------------------------------------");
	}

	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}
}
