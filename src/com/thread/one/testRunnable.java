package com.thread.one;

public class testRunnable {

	public static void main(String[] args) {
		
		RunnableDemo test1 = new RunnableDemo("NO.1-thread");		
		test1.start();
		
		RunnableDemo test2 = new RunnableDemo("NO.2-thread");
		test2.start();
		
		
		

	}

}
