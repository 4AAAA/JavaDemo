package com.itcast.day09.test2;

public class test {

	public static void main(String[] args) {
		//程序员
		Programmer programmer = new Programmer("小白","110","6000");
		programmer.work();
		
		//经理
		Manager manager = new Manager("小牛","120","1W","2000");
		manager.work();
	}

}
