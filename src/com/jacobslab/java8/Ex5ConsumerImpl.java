package com.jacobslab.java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class Ex5ConsumerImpl {
	
	public static void main(String[] args) {
		Consumer<String> greetLambda  = name -> System.out.println("HELLO "+name);
		greetLambda.accept("BIJO JACOB");
		
		Consumer<String> toUpperLambda  = str -> System.out.println(str.toUpperCase());
		toUpperLambda.accept("bijo jacob");
		
		
	}

}
