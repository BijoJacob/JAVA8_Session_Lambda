package com.jacobslab.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Ex12BiPredicate {
	
	static BiPredicate<Double, Integer> check = (salary,age)-> salary > 1500 && age > 33;

	public static void main(String[] args) {
		getEmps().forEach(emp->{
			if(check.test(emp.getSalary(), emp.getAge())) {
				System.out.println(emp);
			}
		});
	}
	
	private static List<FEmp> getEmps(){
		List<FEmp> emps = Arrays.asList(
				new FEmp("Arun", 1000,  36),
				new FEmp("Joshi", 2000, 40),
				new FEmp("Karthik", 3000, 35)
				);
		return emps;
	}

}

class FEmp{
	private String name;
	private double salary;
	private int age;
	public FEmp(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public FEmp() {
		super();
		// TODO Auto-generated constructor stub
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
		return "FEmp [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}
