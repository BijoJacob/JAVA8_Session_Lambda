package com.jacobslab.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex10PredicateEmp {
	
	static Predicate<NEmp> salayGreaterThan3K = (emp) -> emp.getSalary() > 3000;
	static Predicate<NEmp> ageGreaterThan25   = (emp) -> emp.getAge() > 25;
	
	public static void main(String[] args) {
		showEmpSalaryGreatetThan3K(); 
		showEmpAgeGreaterThan25();
		showEmpAgeGreaterThan25AndSalaryGreaterThan3k();
	}

	private static void showEmpSalaryGreatetThan3K() {
		getEmps().forEach(emp->{
			if(salayGreaterThan3K.test(emp)) {
				System.out.println(emp);
			}
		});
	}
	private static void showEmpAgeGreaterThan25() {
		getEmps().forEach(emp->{
			if(ageGreaterThan25.test(emp)) {
				System.out.println(emp);
			}
		});
	}
	
	private static void showEmpAgeGreaterThan25AndSalaryGreaterThan3k() {
		getEmps().forEach(emp->{
			if(ageGreaterThan25.and(salayGreaterThan3K).test(emp)) {
				System.out.println(emp);
			}
		});
	}
	
	private static List<NEmp> getEmps(){
		return Arrays.asList(
				new NEmp("BIJO JACOB",5000,30),
				new NEmp("AMIT KUMAR",4000,20),
				new NEmp("SELVA MUNISAMY",3000,21)
				);
	}
}

class NEmp{
	private String name;
	private double salary;
	private int    age;
	public NEmp() {
		super();
	}
	public NEmp(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "NEmp [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}  
	

	
}
