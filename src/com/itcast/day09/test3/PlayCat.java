package com.itcast.day09.test3;

public class PlayCat extends Player implements Sport{

	public PlayCat () {}
	
	public PlayCat(String name,String age) {
		super(name,age);
	}
	
	
	@Override
	public void play() {
		System.out.println("我是运动员");
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void jump() {
		System.out.println("我会特殊的技能：跳高");
	}

}
