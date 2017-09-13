package com.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demo02:集合比较 
 * Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素
 * @author liuyawei
 *
 */
public class Demo02 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unchecked", "unchecked" })
	public static void main(String[] args) {
		
		//字符串转换成集合
//		String[] arrayNo1 = {"a","b","c","d","e"};
//		String[] arrayNo1 = {"1","2","3","4","5"};
		int[] arrayNo1 = {1,2,3,4,5};
		
		Set treeSet01 = new TreeSet();
		
		for(int i=0;i<arrayNo1.length;i++)
			treeSet01.add(arrayNo1[i]);
		
		System.out.println("求最大值和最小值");
		
		{
			System.out.println("最大值--》"+Collections.max(treeSet01));		
			System.out.println("最小值--》"+Collections.min(treeSet01));
		}
	}

}
