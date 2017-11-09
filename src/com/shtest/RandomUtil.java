package com.shtest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SimpleDateFormat simpleDateFormat;

		simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

		Date date = new Date();

		String str = simpleDateFormat.format(date);

		int rancode = (int)(Math.random()*(9999-1000+1))+1000;

		System.out.println("DCKJ-" + str + "-" + rancode);



	}


}