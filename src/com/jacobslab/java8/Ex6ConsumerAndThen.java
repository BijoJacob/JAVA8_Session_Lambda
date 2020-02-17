package com.jacobslab.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex6ConsumerAndThen {

	public static void main(String[] args) {
		List<Emp> empsLst = Arrays.asList(new Emp("BIJO", "JACOB", 5000, "IS/IT"),
				new Emp("AMIT", "KUMAR", 1000, "IS/IT"), new Emp("SELVA", "MUNISWAMMY", 2000, "IS/IT"),
				new Emp("MEKALA", "MANI", 3000, "IS/IT"));

		Consumer<Emp> firstNameConsumer = (emp) -> System.out.println("FIRST NAME =" + emp.getFirstName());
		Consumer<Emp> lastNameConsumer = (emp) -> System.out.println("Last NAME =" + emp.getLastName());
		Consumer<Emp> fullNameConsumer = (emp) -> System.out
				.println("FULL NAME  =" + emp.getFirstName() + " " + emp.getLastName());

		Consumer<Emp> salaryConsumer = (emp) -> System.out.println("SALARY =" + emp.getSalary());
		/* FLAVOR 1 */
		empsLst.forEach(fullNameConsumer.andThen(salaryConsumer));

		System.out.println("########################################");

		/* FLAVOR 2 */
		empsLst.forEach((emp) -> {
			fullNameConsumer.andThen(salaryConsumer).accept(emp);
			System.out.println("*********************************");
		});
		System.out.println("########################################");
		/* FLAVOR 3 */
		empsLst.forEach((emp) -> {
			firstNameConsumer.andThen(lastNameConsumer).andThen(salaryConsumer).accept(emp);
			System.out.println("**********************");
		});
		System.out.println("########################################");
		/* FLAVOR 4 */
		empsLst.forEach(firstNameConsumer.andThen(lastNameConsumer).andThen(salaryConsumer));

	}

}

class Emp {
	private String firstName;
	private String lastName;
	private double salary;
	private String departmentName;

	public Emp(String firstName, String lastName, double salary, String departmentName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.departmentName = departmentName;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", departmentName="
				+ departmentName + "]";
	}

}