package com.thread;
/**
 * Demo01:查看线程是否存活 
 * 继承 Thread 类并使用 isAlive() 方法来检测一个线程是否存活
 * @author liuyawei
 *
 */
public class Demo01 extends Thread{

	
	public void run() {

		for(int i=0; i<10; i++)
			printMsg();		
	}

	public static void main(String[] args) {

		Demo01 tt = new Demo01();
		
		tt.setName("lyw-thread");
		System.out.println("before start(),tt.isAlive()="+tt.isAlive());
		
		//开始线程
		tt.start();		
		System.out.println("after start(),tt.isAlive()="+tt.isAlive());
		
		for(int i=0; i<10; i++)
			tt.printMsg();
		System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
	}
	
	public void printMsg(){
		//获得当前线程
		Thread currentThread = Thread.currentThread();		
		String name = currentThread.getName();
		System.out.println("线程Name:"+name);
	}
	
	

}
