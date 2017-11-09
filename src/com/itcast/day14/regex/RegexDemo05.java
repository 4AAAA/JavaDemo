package com.itcast.day14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo05 {

	public static void main(String[] args) {

		// 模式对象和匹配器对象的基本使用
		// 把规则转换为模式对象
		Pattern p = Pattern.compile("a*b");
		// 通过模式对象得到匹配器对象
		Matcher m = p.matcher("aaaaab");
		// 通过匹配器对象调用功能
		boolean b = m.matches();
		while (b) {
			System.out.println(m.group());

		}

		// 作为判断来说
		String s = "aaaaab";
		String regex = "a*b";
		boolean flag = s.matches(regex);
		System.out.println(flag);

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		// 需求：获取功能
		// 获取由三个字符组成的单词
		String s1 = "da jia hao,wo men dou hen ai java.";
		// 定义规则
		String regex1 = "\\b[a-z]{3}\\b";

		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p.matcher(s1);

		while (m1.find()) {
			System.out.println(m1.group());
		}

	}

}
