package com.itcast.day09.test3;

public class Test {

	public static void main(String[] args) {

		JumpCat jumpCat = new JumpCat("小白猫","90");
		
		//公共睡觉方法
		jumpCat.sleep();
		
		//吃饭方法
		jumpCat.eat();
		
		//属性
		System.out.println(jumpCat.getName());
		System.out.println(jumpCat.getAge());
		
		//接口属性
		System.out.println(Sport.a); 
		
		//跳高
		jumpCat.jump();
		
		System.out.println("------------华丽的分割线------------------------");
		
		PlayCat playCat = new PlayCat("运动猫","12");
		
		System.out.println(playCat.getName()); 
		
		System.out.println(playCat.getAge());
		
		playCat.eat();
		
		playCat.sleep();
		
		playCat.play();
		
		playCat.jump();
		
		
	}	

}
