package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Demo08:删除集合中指定元素 
 * 使用 Collection 类的 collection.remove() 方法来删除集合中的指定的元素
 * @author liuyawei
 *
 */
public class Demo08 {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		String str1="A",str2="B",str3="c";
		
		hashSet.add(str1);
		hashSet.add(str2);
		hashSet.add(str3);
		
	    System.out.println("-----删除元素'A'之前-----");
	    Iterator iterator = hashSet.iterator();
	    while(iterator.hasNext())
	    	System.out.println("value:"+iterator.next());
	    
	    System.out.println("-----删除元素'A'之前-----");
	    hashSet.remove(str1);
	    Iterator iterator2 = hashSet.iterator();
	    while(iterator2.hasNext())
	    	System.out.println("value:"+iterator2.next());
	    
	}

}
