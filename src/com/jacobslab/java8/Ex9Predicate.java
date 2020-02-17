package com.jacobslab.java8;

import java.util.function.Predicate;

public class Ex9Predicate {

	static Predicate<Integer> evenNumberCheck = (num) -> num % 2 == 0;
	static Predicate<Integer> oddNumberCheck = (num) -> !(num % 2 == 0);
	static Predicate<Integer> numberDivisableBy5 = (num) -> num % 5 == 0;

	public static void main(String[] args) {

		evenNumberCheck(10);
		oddNumberCheck(5);
		numberEvenANDDivisableBy5(4);
		numberEvenORDivisableBy5(4);
		System.out.println(evenNumberCheck.or(numberDivisableBy5).negate().test(3));
	}

	private static void numberEvenORDivisableBy5(Integer num) {
		System.out.println("Number : " + num + " is even OR divisiable by 5 = "
				+ evenNumberCheck.or(numberDivisableBy5).test(num));
	}

	private static void numberEvenANDDivisableBy5(Integer num) {
		System.out.println("Number : " + num + " is even & divisiable by 5 = "
				+ evenNumberCheck.and(numberDivisableBy5).test(num));
	}

	private static void evenNumberCheck(Integer num) {
		System.out.println("Number : " + num + " is EVEN = " + evenNumberCheck.test(num));
	}

	private static void oddNumberCheck(Integer num) {
		System.out.println("Number : " + num + " is ODD = " + oddNumberCheck.test(num));
	}

}
