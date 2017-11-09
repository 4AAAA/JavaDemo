package com.itcast.day09.test3;

public class JumpCat extends Animal implements Sport{

	public JumpCat() {}
	
	public JumpCat(String name,String age) {
		super(name,age);
	}
	
	
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void jump() {
		System.out.println("猫会跳高");
	}

}
