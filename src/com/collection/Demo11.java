package com.collection;

import java.util.ArrayList;

/**
 * Demo11:集合转数组 
 * 使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
 * @author liuyawei
 *
 */
public class Demo11 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("我");
		arrayList.add("是");
		arrayList.add("大");
		arrayList.add("傻");
		arrayList.add("逼");
		
		//集合转数组
		String[] array = arrayList.toArray(new String[0]);
		
		for(int i=0; i<array.length; i++)
			System.out.println("value:"+array[i]);

		
	}

}
