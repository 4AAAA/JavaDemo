package com.string;

import java.util.LinkedList;

public class StringCompareEmp {

	public static void main(String[] args) {
//		String str = "Hello World";
//		String anotherString = "hello world";
//		Object objStr = str;
//		
//		//compareTo方法，返回参与比较的前后两个字符串的asc码的差值
//		System.out.println(str.compareTo(anotherString));
//		System.out.println(str.compareToIgnoreCase(anotherString));
//		System.out.println(str.compareTo(objStr.toString()));
		
		
//		String strOrig = "Hello World,Hello Liuyw";
//		int index = strOrig.lastIndexOf("Hello");
//		
//		if(index == -1){
//			System.out.println("没有找到字符串：Liuyw!!!");
//		}else{
//			System.out.println("字符串最后出现的位置："+index);			
//		}
		
		
//		String str = "this is java";
//		System.out.println(removeCharAt(str,3));
		
		
		
//		String str = "Hello World,Hello Liuyw";
//		
//		System.out.println(str.replace("H", "JJ"));
//		System.out.println(str.replaceFirst("H", "JJ"));
//		System.out.println(str.replaceAll("He", "JJ"));
		
//		String str = "lyw";
//		StringBuffer buffer = new StringBuffer(str);		
//		System.out.println(buffer.reverse().toString());
		
//		String str = "wo shi liuyawei";
//		int ii = str.indexOf("liu");
//		if(ii==-1){
//			System.out.println("不存在该值");
//		}else{
//			System.out.println("下标位置："+ii);
//		}
		
	
//		int sum =0;
//		int a =1;
//		do{
//			sum+=a;
//			a++;
//		}
//		while(a<=100);
//		System.out.println("计算结果总和："+sum);
		
		LinkedList ldli = new LinkedList();
		
		ldli.add("1");
		ldli.add("2");
		ldli.add("3");
		ldli.add("4");
		ldli.add("5");
		
		System.out.println(ldli);
		ldli.subList(2, 4).clear();
		System.out.println(ldli); 
		
		Object sfs = ldli.removeFirst();
		
		
		
		
		
		
	}
	
	
	public static String removeCharAt(String str,int pos){
		
		return str.substring(0,pos)+str.substring(pos+1);
	}

}
