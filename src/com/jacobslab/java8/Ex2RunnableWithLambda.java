package com.jacobslab.java8;

public class Ex2RunnableWithLambda {
	
	public static void main(String[] args) {
		Runnable runnable1 = ()->{System.out.println("Runnable 1 run() implementation with LAMBDA");};
		new Thread(runnable1).start();
		
		Runnable runnable2 = ()->System.out.println("Runnable 2 run() implementation with LAMBDA");
		new Thread(runnable2).start();
		
		new Thread(()->System.out.println("Runnable 3 run() implementation with LAMBDA")).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable 4 run() implementation with Anonymous Inner class as argument");
				
			}
		}).start();
	}

}
