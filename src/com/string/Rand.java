package com.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Rand {

	public static void main(String[] args) {
	      //定义人名数组
        String [] name = {"张三","李四","王五","八神庵","不知火舞","大蛇","景天","唐雪见","李逍遥","赵灵儿"};
        	//随机生成数组下标、
        int num = (int)(Math.random() * 1000);
        //对生成的随机数进行判断，如果小于数组下标，就跳出循环
		while (num>name.length-1) {
		         if (num<=name.length-1) {
		    break;
		   }
		          num = (int)(Math.random() * 1000);	
		  }
		//将数组下标设置成随机数，就可以实现人名的随机抽取
        System.out.println("被抽到的同学是："+name[num]);

	}

}


