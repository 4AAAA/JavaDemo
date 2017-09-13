package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Demo09:只读集合
 * 使用 Collection 类的 Collections.unmodifiableList() 方法来设置集合为只读
 * @author liuyawei
 *
 */
public class Demo09 {

	public static void main(String[] args) {

		List asList = Arrays.asList(new String[]{"A","B","C"});
		
		/**
		 * List集合
		 */
		List arrayList = new ArrayList(asList);		
		//设置集合为只读
		arrayList = Collections.unmodifiableList(arrayList);
		
		//对集合做修改操作
		try{
			arrayList.set(0, "new value");
		}catch(UnsupportedOperationException e){
			System.out.println("List集合为只读，不能修改！");
		}
		
		/**
		 * Set集合
		 */
		Set hashSet = new HashSet(asList);
		//设置集合为只读
		hashSet = Collections.unmodifiableSet(hashSet);
		
		try{
			hashSet.add("new Value");
		}catch(UnsupportedOperationException e){
			System.out.println("Set集合为只读，不能修改！");
		}
		
		/**
		 * Map集合
		 */
		Map hashMap = new HashMap();
		hashMap = Collections.unmodifiableMap(hashMap);
		
		try{
			hashMap.put("1", "NO.1");
		}catch(UnsupportedOperationException u){
			System.out.println("Map集合为只读，不能修改！");
		}
		
		
	}

}
