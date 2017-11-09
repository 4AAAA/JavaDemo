package com.itcast.day09.test2;

public class Manager extends Employee{

	private String bonus;
	
	public Manager () {} 
	
	public Manager (String name,String eid,String salary,String bonus) {
	
		super(name,eid,salary);
		this.bonus = bonus;
	}
	
	
	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("项目经理负责瞎逼逼");
		
	}

}
