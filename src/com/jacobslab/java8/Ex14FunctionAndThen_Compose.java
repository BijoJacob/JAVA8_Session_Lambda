package com.jacobslab.java8;

import java.util.function.Function;

public class Ex14FunctionAndThen_Compose {
	
	static Function<String,String> toUpper 		= str->str.toUpperCase();
	static Function<String,String> concatVal    = str->str.concat(" for next 1 months");
	
	public static void main(String[] args) {
		andThenEx("java 8");
		composeEx("java 8");
		
	}
	
	static void andThenEx(String str) {
		System.out.println(toUpper.andThen(concatVal).apply(str));
	}
	
	static void composeEx(String str) {
		System.out.println(toUpper.compose(concatVal).apply(str));
	}


}
