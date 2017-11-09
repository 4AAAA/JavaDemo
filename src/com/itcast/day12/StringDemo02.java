package com.itcast.day12;

public class StringDemo02 {

	public static void main(String[] args) {

		String a = "hello";
		a+="world";
		System.out.println(a+"========================");
		
		String b = new String("liu");
		String c = "liu";
		
		System.out.println(b==c);
		System.out.println(b.equals(c));
		
		
	}

}
