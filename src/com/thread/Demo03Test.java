package com.thread;
/**
 * 测试Demo03
 * @author liuyawei
 *
 */
public class Demo03Test {

	public static void main(String[] args) throws InterruptedException {

		//新建一个线程
		Demo03 thread = new Demo03();
		thread.setName("Thread.NO1");
		
		//线程状态
		showThreadStatus(thread);
		
		//线程开启
		thread.start();
		//线程睡眠
		Thread.sleep(50);
		//线程状态
		showThreadStatus(thread);
		
		//线程通知
		thread.notice();
		thread.sleep(50);
		showThreadStatus(thread);
		
		while(thread.isAlive())
			System.out.println("进行一次判断线程是否存活:'Alive'="+thread.isAlive());
		//线程状态
		showThreadStatus(thread);
		
	}
	
	static void showThreadStatus(Thread t){
		System.out.println("输出当前线程信息:"+"'name':"+t.getName()+",'Alive':"+t.isAlive()+",'state':"+t.getState());
	}

}
