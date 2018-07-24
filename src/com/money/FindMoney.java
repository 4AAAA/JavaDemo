package com.money;

import java.util.HashMap;
import java.util.Map;

public class FindMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map =findMonyNum("183105.65");
		
		
	System.out.println("查看值："+map);	
		
//		String valStr = "183105";
//
//		String head = null; // 整数部分
//		String rail = null; // 小数部分
//
//		if (valStr != null && valStr.indexOf(".") != -1) {
//			head = valStr.substring(0, valStr.indexOf(".")); // 取整数部分
//			rail = valStr.substring(valStr.indexOf(".") + 1, valStr.indexOf(".") + 3); // 取小数部分,只取小数点后两位
//
//			System.out.println("整数部分：" + head);
//			System.out.println("小数部分：" + rail);
//		} else {
//			head = valStr;
//			System.out.println("是整数：" + head);
//		}

		// String head = valStr.substring(0, valStr.indexOf(".")); // 取整数部分
		// String rail = valStr.substring(valStr.length() - 2); // 取小数部分
		//
		// System.out.println("整数部分："+head);
		// System.out.println("小数部分："+rail);

		// int s= Integer.parseInt(head);
		// int g = s%10;
		// int sw = s/10%10;
		// int b = s/100%10;
		// int q = s/1000%10;
		// int w = s/10000%10;
		// System.out.println("个位数是:"+g+";十位数是:"+sw+";百位数是："+b+";千位数是："+q+";万位数是："+w);
		//
		// int xiao = Integer.parseInt(rail);
		// int fen = xiao%10;
		// int jiao = xiao/10%10;
		// System.out.println("角是:"+jiao+";分是:"+fen);

		
		
		
	}

	public static Map<String, String> findMonyNum(String valStr) {

		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("万", "");
		hashMap.put("千", "");
		hashMap.put("百", "");
		hashMap.put("十", "");
		hashMap.put("元", "");
		hashMap.put("角", "");
		hashMap.put("分", "");

//		String valStr = "183105";

		String head = null; // 整数部分
		String rail = null; // 小数部分

		if (valStr != null && valStr.indexOf(".") != -1) {
			head = valStr.substring(0, valStr.indexOf(".")); // 取整数部分
			rail = valStr.substring(valStr.indexOf(".") + 1, valStr.indexOf(".") + 3); // 取小数部分,只取小数点后两位

		} else {
			head = valStr;
		}

		if (head != null) {
			int s = Integer.parseInt(head);

			hashMap.put("万", String.valueOf(s / 10000 % 10));
			hashMap.put("千", String.valueOf(s / 1000 % 10));
			hashMap.put("百", String.valueOf(s / 100 % 10));
			hashMap.put("十", String.valueOf(s / 10 % 10));
			hashMap.put("元", String.valueOf(s % 10));

		}

		if (rail != null) {
			int xiao = Integer.parseInt(rail);
			int fen = xiao % 10;
			int jiao = xiao / 10 % 10;
			hashMap.put("角", String.valueOf(xiao / 10 % 10));
			hashMap.put("分", String.valueOf(xiao % 10));

		}

		return hashMap;
	}

}
