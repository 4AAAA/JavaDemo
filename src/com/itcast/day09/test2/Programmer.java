package com.itcast.day09.test2;

public class Programmer extends Employee{

	public Programmer() {}
	
	public Programmer(String name,String eid,String salary) {
		super(name,eid,salary);
	}
	
	@Override
	public void work() {
		System.out.println("程序员辛辛苦苦敲代码");
	}

	
}
