package com.itcast.day09.test1;

public class Dog extends Animal {

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("我是狗,我要吃肉！");
	}

}
