package com.itcast.day09.test3;

public abstract class Animal {

	private String name;
	
	private String age;

	
	public Animal() {}

	public Animal(String name,String age) {
		this.name = name;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("动物们都要睡觉");
	}
	
	public abstract void eat();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
