package com.collection;

import java.util.TreeMap;

/**
 * Demo10:集合输出 
 * 使用 Java Util 类的 tMap.keySet(),tMap.values() 和 tMap.firstKey() 方法将集合元素输出
 * @author liuyawei
 *
 */
public class Demo10 {

	public static void main(String[] args) {

		TreeMap treeMap = new TreeMap();
		
		treeMap.put(1, "Sunday");
		treeMap.put(2, "Monday");
		treeMap.put(3, "Tuesday");
		treeMap.put(4, "Wednesday");
		treeMap.put(5, "Thursday");
		treeMap.put(6, "Friday");
		treeMap.put(7, "Saturday");
		
		//获得Map的键值
		System.out.println("获得Map的键值:"+treeMap.keySet()+"\n");
		
		//获得Map的value
		System.out.println("获得Map的value:"+treeMap.values()+"\n");
		
		//获取键值为5的值
		System.out.println("获取键值为5的值:"+treeMap.get(5)+"\n");
		
		//获取第一个键值
		System.out.println("获取第一个键值:"+treeMap.firstKey()+"\n");
		
		//获取最后一个键值
		System.out.println("获取最后一个键值:"+treeMap.lastKey()+"\n");
		
		//移除第一个数据
		System.out.println("移除第一个数据:"+treeMap.remove(treeMap.firstKey())+"\n");
		System.out.println("移除第一个数据后的键值为:"+treeMap.keySet()+"\n");
		
		//移除最后一个数据
		System.out.println("移除最后一个数据:"+treeMap.remove(treeMap.lastKey())+"\n");
		System.out.println("移除最后一个数据的键值为:"+treeMap.keySet()+"\n");
		
	}

}
