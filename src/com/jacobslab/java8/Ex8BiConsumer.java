package com.jacobslab.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Ex8BiConsumer {
	
	public static void main(String[] args) {
		
		BiConsumer<String, List<String>> biCons = (name,projectLst)->{
				System.out.println("Employee Name ="+name);
				System.out.println("Employee Project List ="+projectLst);
				System.out.println("**********");
		};
		
		List<REmp> empLst = Arrays.asList(
				new REmp("BIJO JACOB",Arrays.asList("TRV","GDV","BOM STS")),
				new REmp("AMIT KUMAR",Arrays.asList("ADP","PUMMP")),
				new REmp("SELVA MUNISAMY",Arrays.asList("TRV"))
				);
		
		empLst.forEach(emp->biCons.accept(emp.getName(), emp.getProjectNames()));
	}

}

class REmp{
	private String name;
	private List<String> projectNames;
	public REmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public REmp(String name, List<String> projectNames) {
		super();
		this.name = name;
		this.projectNames = projectNames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getProjectNames() {
		return projectNames;
	}
	public void setProjectNames(List<String> projectNames) {
		this.projectNames = projectNames;
	}
	
	
}
