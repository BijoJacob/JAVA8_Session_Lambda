package com.jacobslab.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Ex15FunctionEx {
	
	static Function<List<Employee>,Map<String,String>> empFunct = (emps)->{
		Map<String,String> empInfo = new HashMap<>();
		emps.forEach(emp->{
			empInfo.put(emp.getName(), emp.getDesignation());
		});
		
		return empInfo;
	};
	
	public static void main(String[] args) {
		
		empFunct.apply(empsList()).forEach((name,desg)->{
			System.out.println("Emp Name = "+name +" : "+"Designation = "+desg);
		});
	}

	static List<Employee> empsList() {
		return Arrays.asList(
				new Employee("Bijo Jacob", "Manager", 9000),
				new Employee("Amit Kumar", "Senior Engineer", 5000),
				new Employee("Selva     ", "Assistant Manager", 7000));
	}

}

class Employee {
	private String name;
	private String designation;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
