package com.itcast.day14.regex;

import java.util.Scanner;

public class RegexDemo03 {

	public static void main(String[] args) {
		// 定义规则
		// String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,8}(\\.[a-z]{2,3})+";
		String regex = "\\w+@\\w{2,8}(\\.[a-z]{2,3})+";

		// 键盘录入邮箱
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();

		// 校验
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}

}
