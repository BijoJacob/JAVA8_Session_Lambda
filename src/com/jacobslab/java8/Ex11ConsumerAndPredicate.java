package com.jacobslab.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex11ConsumerAndPredicate {

	static BiConsumer<String, List<String>> empInfo = (name,projects)->{
		System.out.println("Employee Name = "+name+" : "+" Projects = "+projects);
	};
	
	static Predicate<REmp> projCnt = (emp) -> emp.getProjectNames().size() > 1;
	
	static Consumer<REmp> empCon = (emp) ->{
		if(projCnt.test(emp)) {
			empInfo.accept(emp.getName(), emp.getProjectNames());
		}
		
	};
	
	public static void main(String[] args) {
		
		getEmps().forEach(empCon);

	}

	private static List<REmp> getEmps() {
		List<REmp> empLst = Arrays.asList(
				new REmp("BIJO JACOB", Arrays.asList("TRV", "GDV", "BOM STS")),
				new REmp("AMIT KUMAR", Arrays.asList("ADP", "PUMMP")), 
				new REmp("SELVA MUNISAMY", Arrays.asList("TRV")),
				new REmp("MEKALA", Arrays.asList("ADP", "PUMMP", "CAI")));
		return empLst;
	}

}
