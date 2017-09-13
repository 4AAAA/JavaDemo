package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Demo07:集合反转
 * 如何使用 Collection 和 Listiterator 类的 listIterator() 和 collection.reverse() 方法来反转集合中的元素：
 * @author liuyawei
 *
 */
public class Demo07 {

	public static void main(String[] args) {

		String[] coins = {"A","B","C","D"};
		List arrayList = new ArrayList();
		
		for(int i=0; i<coins.length; i++)
			arrayList.add(coins[i]);
		
		System.out.println("-----集合反转前-----");
		ListIterator listIterator = arrayList.listIterator();
		while(listIterator.hasNext())
			System.out.println("value："+listIterator.next());
		
		//集合反转
		Collections.reverse(arrayList);
		
		System.out.println("-----集合反转后-----");
		ListIterator listIterator2 = arrayList.listIterator();
		while(listIterator2.hasNext())
			System.out.println("value:"+listIterator2.next());
		
			
	}

}
