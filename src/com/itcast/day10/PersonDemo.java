package com.itcast.day10;

public class PersonDemo {
	
	public static Person method() {
		return new Person() {

			@Override
			public void say() {
				System.out.println("我会说话");
			}};
	}

}
