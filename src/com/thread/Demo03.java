package com.thread;
/**
 * Demo03:状态监测
 * 通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
 * @author liuyawei
 *
 */
public class Demo03 extends Thread{

	boolean waiting = true;
	boolean ready = false;
	
	//空的构造方法
	Demo03(){
		
	}

	@Override
	public void run() {
		//获得线程名称
		String name = this.getName();
		System.out.println("线程名称:"+name+",开始启动run()方法");
		//判断是否等待
		while(waiting)
			System.out.println("'waiting'的值为:"+waiting);
		//开始等待
		System.out.println("线程执行等待...");
		startWait();
		//线程睡眠
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			 System.out.println(name + " interrupted.");
		}
		
		 System.out.println("线程:"+name + ",退出run()方法,终止");
	}
	
	/**
	 * 等待
	 * wait()需要放进同步代码块中
	 */
	synchronized void startWait(){
		try{			
			while(!ready)wait();			
		}catch(Exception exc){			
			System.out.println("wait() interrupted");	
		}
	}
	
	/**
	 * 通知
	 * notify()需要放进同步代码块中
	 */
	synchronized void notice(){
		ready = true;
		notify();
	}
	
	
	

}
