package com.itcast.day11;

public class Student extends Object{

	private String name;
	
	private int age;
	
	public Student() {}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		//重写toString方法		
		return "Student['name':'"+name+"','age':'"+age+"']";
	}

}
