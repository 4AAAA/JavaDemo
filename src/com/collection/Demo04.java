package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Demo04:集合长度 
 * Collections 类 的collection.add() 来添加数据并使用 collection.size()来计算集合的长度
 * @author liuyawei
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		//定义变量
		String  str1= "what", str2="the", str3="fuck";
		Iterator iterator;
		int size;
		
		HashSet set = new HashSet();
		
		set.add(str1);
		set.add(str2);
		set.add(str3);
		
		iterator = set.iterator();
		 
		System.out.println("------迭代集合----");
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		if(set.isEmpty())
			System.out.println("集合为空！");
		else			
			System.out.println("集合长度为："+set.size());
		
		
	}

}
