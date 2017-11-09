package com.itcast.day10;

public class Outer1 {
	
	int a = 11;
	
	public void method() {
		
		int a=10;
		
		class Inner{
			public void say() {
				System.out.println("我是局部内部类发出的方法,aa="+a);
			}
		}
		
		Inner inner = new Inner();
		inner.say();
	}

}
