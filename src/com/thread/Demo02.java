package com.thread;
/**
 * Demo02:获取当前线程名称
 * 通过继承 Thread 类并使用 getName() 方法来获取当前线程名称
 * @author liuyawei
 *
 */
public class Demo02 extends Thread{

	public static void main(String[] args) {

		Demo02 demo02 = new Demo02();
		demo02.start();
		
		for(int i=0; i<10; i++)
			demo02.printMsg();
		
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++)
			printMsg();
	}
	
	public void printMsg(){
		Thread currentThread = Thread.currentThread(); 
		String name = currentThread.getName();
		
		System.out.println("当前线程名称:"+name);
	}

}
