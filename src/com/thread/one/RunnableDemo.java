package com.thread.one;

import java.util.TreeMap;

/**
 * 实现Runnable接口创建线程
 * @author liuyawei
 *
 */
public class RunnableDemo implements Runnable{

	private Thread t;
	private String threadName;
	
	
	 RunnableDemo(String threadName){
	
		 this.threadName = threadName;
		 System.out.println("构造方法_创建线程名称");
		 
	}
	
	@Override
	public void run() {
		System.out.println("开始执行run方法,线程名称为:"+threadName);
		try{
			for(int i=4; i>0; i--){
				System.out.println("线程名称:"+threadName+",当前循环次数:"+i);
				
				//让线程睡眠一会
				Thread.sleep(50);
			}
			
		}catch(Exception e){
			System.out.println("run方法发生异常！！！");
		}
		
		System.out.println("当前线程名称为:"+threadName+",退出run方法！！！");
		
		
	}
	
	public void start(){
		System.out.println("开始执行线程:"+threadName+"的start方法！！！");
		
		if(t==null){
			 t = new Thread(this,threadName);
			 t.start();
		}
		
	}
	
	

}
