package com.jacobslab.java8;

public class Ex1RunnableWithAnonymousInnerClass {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous Inner class run() implementation ...");	
			}
		};
		
		new Thread(runnable).start();
	}

}
