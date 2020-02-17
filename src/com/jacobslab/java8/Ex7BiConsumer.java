package com.jacobslab.java8;

import java.util.function.BiConsumer;

public class Ex7BiConsumer {
	
	public static void main(String[] args) {
	
		BiConsumer<Integer,Integer> multiplyConsumer = (x,y)->System.out.println("X*Y ="+(x*y));
		BiConsumer<Integer,Integer> divideConsumer   = (x,y)->System.out.println("X/Y ="+(x/y));
		
		multiplyConsumer.andThen(divideConsumer).accept(10, 5);
		
	}

}
