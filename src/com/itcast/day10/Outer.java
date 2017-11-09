package com.itcast.day10;

public class Outer {

	public int a =10;
	
	//成员位置（成员内部类）
	 public class Inner{
		public int a = 20;
		public void say () {
			int a = 30;
			System.out.println("我是成员内部类发出的信号!"+a+","+this.a+","+Outer.this.a);
		}
	}
	
	
	public void method() {
		Inner inner = new Inner();
		inner.say();
	}
	
	
}
