package com.itcast.day12;

import java.util.Scanner;

/*
 * 模拟登录,给三次机会,并提示还有几次。
 * 
 * 分析：
 * 		A:给出固定的用户名和密码
 * 		B:键盘录入用户名和密码
 * 		C:比较用户名和密码
 * 		D:给出三次机会
 */
public class StringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//给出固定的用户名和密码
		String username = "admin";
		String password = "admin";
		
		for(int i=0;i<3;i++) {
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("请输入用户名:");
			String name = scanner1.nextLine();
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("请输入密码:");
			String pwd = scanner2.nextLine();
			
			if(username.equals(name) && password.equals(pwd)) {
				System.out.println("登录成功！");
				break;
			}else if(2-i==0) {
				System.out.println("账号被锁定，请联系管理员！");
			}else {
				System.out.println("登录失败，您还剩"+(2-i)+"次机会");
			}
			
			
		}
	}

}
