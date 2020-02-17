package com.jacobslab.java8;

import java.util.Comparator;

public class Ex4ComparatorWithLambda {
	
	public static void main(String[] args) {
		Comparator<Integer> intCompare = (a,b)->a.compareTo(b);
		
		System.out.println(intCompare.compare(20, 10));
		System.out.println(intCompare.compare(20, 20));
		System.out.println(intCompare.compare(10, 20));
	}

}
