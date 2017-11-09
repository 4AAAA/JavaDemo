package com.itcast.day10;

import com.itcast.day10.Outer.Inner;

public class Test {

	public static void main(String[] args) {

		 Outer outer = new Outer();
		 outer.method();
		 
		 System.out.println("------------华丽分割线--------------------");
		 
//		 Inner inner = new Outer.Inner();
		 
		 
//		 inner.say();
		 
		 System.out.println("------------华丽分割线2--------------------");
		 
		 Outer1 outer2 = new Outer1();
		 outer2.method();
		 
		 System.out.println("------------华丽分割线3--------------------");
		 Outer2 outer22 = new Outer2();
		 outer22.method();
		 
		 System.out.println("------------华丽分割线4--------------------");
		 
//		 new PersonDemo().method(new Person() {
//
//			@Override
//			public void say() {
//				System.out.println("匿名内部类创建一个对象");
//			}});
		 
		 
		  PersonDemo.method().say();
		
	}

}
