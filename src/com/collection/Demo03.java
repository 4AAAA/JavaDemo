package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Demo03:HashMap遍历
 * Collection 类的 iterator() 方法来遍历集合
 * @author liuyawei
 *
 */
public class Demo03 {

	public static void main(String[] args) {

		//HashMap集合
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("1", "NO.1");
		hashMap.put("2", "NO.2");
		hashMap.put("3", "NO.3");
		hashMap.put("4", "NO.4");
		
		//获取值
		Collection<String> values = hashMap.values();
		
		//获取迭代器
		Iterator<String> iterator = values.iterator();
		
		//迭代输出
		while(iterator.hasNext())
			System.out.println("数据展示--》"+iterator.next()); 
		
	}

}
