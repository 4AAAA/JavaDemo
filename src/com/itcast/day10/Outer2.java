package com.itcast.day10;

public class Outer2 {

	public void method() {
		
		 Inner inner = new Inner() {

			@Override
			public void show() {

				System.out.println("我是匿名内部类");
			}
			
		};
		
		inner.show();
		
	}
	
}
