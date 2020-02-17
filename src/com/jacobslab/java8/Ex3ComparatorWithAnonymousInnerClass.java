package com.jacobslab.java8;

import java.util.Comparator;

public class Ex3ComparatorWithAnonymousInnerClass {

	public static void main(String[] args) {
		Comparator<Integer> compareInt = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		
		System.out.println(compareInt.compare(20, 10));
		System.out.println(compareInt.compare(10, 10));
		System.out.println(compareInt.compare(10, 20));
	}

}
