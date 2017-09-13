package com.collection;

import java.util.Arrays;
import java.util.List;


/**
 * Demo01:Arrays.asList(name) 将数组转换成集合
 * @author liuyawei
 *
 */
public class Demo01 {

	public static void main(String[] args) {

		//定义数组
		int num = 5;
		
		String[] arrayName = new String[num];
		for(int i=0; i<num; i++){
			arrayName[i]=String.valueOf(i);
		}
		
		//数组转换集合
		 List<String> asList = Arrays.asList(arrayName);
		 
		//迭代集合
		 for(String s : asList)
			 System.out.println(s+"");
		 System.out.println("迭代结束");
	}

}
