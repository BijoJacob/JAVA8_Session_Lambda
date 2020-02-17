package com.jacobslab.java8;

import java.util.function.Function;

public class Ex13Function {

	static Function<String,String> toUpper = (str)->str.toUpperCase();
	public static void main(String[] args) {
		System.out.println(toUpper.apply("Bijo Jacob"));
	}
}
