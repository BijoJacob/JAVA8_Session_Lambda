package com.jacobslab.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Ex16BiFunction {

	static Predicate<EmpR> empAgeCheck = (emp)->emp.getAge() >=25;
	static BiFunction<List<EmpR>, Predicate<EmpR>, Map<String,Double>> empFunct = (emps,ageCheck)->{
		
		Map<String,Double> empInfo = new HashMap<>();
		emps.forEach(emp->{
			if(ageCheck.test(emp)) {
				empInfo.put(emp.getName(), emp.getSalary());
			}
		});
		return empInfo;
	};
	
	public static void main(String[] args) {
		empFunct.apply(empsList(), empAgeCheck).forEach((name,sal)->{
			System.out.println("Employee Name = "+name+" : "+"Employee Salary = "+sal );
		});
	}
	
	static List<EmpR> empsList() {
		return Arrays.asList(
				new EmpR("Bijo Jacob", 9000,30),
				new EmpR("Amit Kumar", 5000,20),
				new EmpR("Selva     ", 7000,25));
	}
}

class EmpR{
	
	private String name;
	private double salary;
	private int age;
	public EmpR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpR(String name, double salary, int age) {
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
	
}
