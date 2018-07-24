package com.money;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FindTime {

	public static void main(String[] args) throws ParseException {
		

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = dateFormat.parse("22010-12-31");
		 cal.setTime(parse);
		 int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
		 int months= month+1;
		 int day = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
		 int year = cal.get(Calendar.YEAR); //注意月份是从0开始的,比如当前7月，获得的month为6
		int years =  year% 10;
		 System.out.println("年份："+years+"，月份："+months+",日："+day);
	}

}
