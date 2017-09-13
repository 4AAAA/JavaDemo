package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Demo06:集合遍历 
 * 演示了如何遍历从Collection接口延伸出的List、Set和以键值对形式作存储的Map类型的集合，
 * 以下我们分别使用了普通for，增强型的 for ，iterator 等方式来遍历集合：
 * @author liuyawei
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//1.测试set集合
		setTest();
		
		//2.测试list集合
		listTest();
		
		/**
		 * Map集合测试
		 */

		//1.创建Map集合
		HashMap<String, String> hashMap = new HashMap<String,String>();
		
		hashMap.put("1", "Java");
		hashMap.put("2", "PHP");
		hashMap.put("3", ".NET");
		hashMap.put("4", "JavaScript");
		hashMap.put("5", "ios");
		hashMap.put("6", "jva web");
		
		//2.测试Map集合
		System.out.println("-----Map集合测试迭代1-----");
		traditionalMethod1(hashMap);
		traditionalMethod2(hashMap);
		
		System.out.println("-----Map集合测试迭代2-----");		
		strongForMethod1(hashMap);
		strongForMethod2(hashMap);
	}
	
	/**
	 * test-set collection
	 * set接口两个实现类：1.HashSet 2.LinkedHashSet
	 * set数据元素不能重复
	 */
	private static void setTest(){
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("我");
		hashSet.add("是");
		hashSet.add("大");
		hashSet.add("傻");
		hashSet.add("逼");
		
		//不能存放重复数据
		hashSet.add("我");
		hashSet.add("重复的'我'字没有被添加");
		
		//1.iterator遍历set集合
		Iterator<String> iterator = hashSet.iterator();	
		System.out.println("-----iterator遍历set集合-----");
		while(iterator.hasNext()){
			String value = iterator.next();
			System.out.println(value);
		}
		
		//2.增强for循环遍历set集合
		System.out.println("-----增强for循环遍历set集合-----");
		for(String aa : hashSet){
			System.out.println(aa);
		}
		
	}
	
	/**
	 * test-list collection
	 * list接口有三个实现类：1.LinkedList 2.ArrayList 3.Vector
	 * list数据元素可以重复
	 */
	private static void listTest(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("我");
		arrayList.add("也");
		arrayList.add("是");
		arrayList.add("大");
		arrayList.add("傻");
		arrayList.add("逼");
		
		//存放重复数据
		arrayList.add("我");
		arrayList.add("'我'字是重复数据");
		
		//1.iterator遍历list集合
		Iterator<String> iterator = arrayList.iterator();
		System.out.println("-----iterator遍历list集合-----");
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
		//2.普通for循环遍历list集合
		System.out.println("-----普通for循环遍历list集合-----");
		for(int i=0; i<arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		
		//3.增强for循环遍历list集合
		System.out.println("-----增强for循环遍历list集合-----");
		for(String aa : arrayList)
			System.out.println(aa);
		
	}
	
	/**
	 * 使用keySet()方法，获取maps集合中的所有键，遍历键取得所对应的值。
	 * @param hashMap
	 */
	private static void traditionalMethod1(HashMap<String, String> hashMap){
		
		Set<String> keySet = hashMap.keySet();
		
		//使用迭代器遍历
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = hashMap.get(key);
			System.out.println("Key:"+key+" "+"value:"+value);
		}
	}

	/**
	 * 使用entrySet()方法，获取maps集合中的每一个键值对，
	 * @param hashMap
	 */
	private static void traditionalMethod2(HashMap<String, String> hashMap){
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		
		//使用迭代器遍历
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, String> next = iterator.next();
			String key = next.getKey();
			String value = next.getValue();
			System.out.println("key:"+key+" "+"value:"+value);
		}
	}
	
	/**
	 * 增加for循环，使用keySet()方法
	 * @param hashMap
	 */
	private static void strongForMethod1(HashMap<String, String> hashMap){
		Set<String> keySet = hashMap.keySet();
		
		//增强for循环迭代
		for(String aa : keySet)
			System.out.println("key:"+aa+" "+"value:"+hashMap.get(aa));
		
	}
	
	/**
	 * 增强for循环，使用entrySet()方法
	 */
	private static void strongForMethod2(HashMap<String, String> hashMap){
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		
		//增强for循环遍历
		for(Entry<String, String> aa : entrySet)
			System.out.println("key:"+aa.getKey()+" "+"value:"+aa.getValue());
		
	}
}
