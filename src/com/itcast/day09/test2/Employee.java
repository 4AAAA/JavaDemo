package com.itcast.day09.test2;

public abstract class Employee {
	
	private String name;
	
	private String eid;
	
	private String salary;

	public Employee() {}

	public Employee(String name,String eid,String salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		
	}
	
	public abstract void work();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
