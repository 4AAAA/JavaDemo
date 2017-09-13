package com.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demo05:集合打乱顺序
 * Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序
 * @author liuyawei
 *
 */
public class Demo05 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++)
			arrayList.add(new Integer(i));
		
		{
			System.out.println("集合打乱顺序前：");
			System.out.println(arrayList);
		}
		
		for(int i=0; i<5; i++){
			System.out.println("--------第"+i+"次打乱集合--------");
			Collections.shuffle(arrayList);
			System.out.println("打乱："+arrayList);
			
		}
			
		
		
	}

}
