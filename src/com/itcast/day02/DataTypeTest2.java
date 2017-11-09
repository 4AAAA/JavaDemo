package com.itcast.day02;

import java.time.YearMonth;

/*
byte b = 130;有没有问题?如果我想让赋值正确，可以怎么做?结果是多少呢?
*/
public class DataTypeTest2 {

	public static void main(String[] args) {
//		byte b = 130;

		//解决方案
		//方案1
		//int a  = 130;
	
		//方案2
		byte b = (byte) 130;
		System.out.println(b);
		
		System.out.println("---------------------------");
		
		//%和/的区别，一个是余数，一个是商
		System.out.println(5/3);
		System.out.println(5%3);

		//问题：判断数据整出，用哪个符号。
		//用%,如果余数为0，说明整除。

		System.out.println(5%3); //2
		System.out.println(5%-3);//2
		System.out.println(-5%3);//-2
		System.out.println(-5%3);//-2
		
		System.out.println("------------自增自减---------------");
		int a1 = 10;
		int b1 = a1++;
		System.out.println(a1);//11
		System.out.println(b1);//10
		System.out.println("------------");

		int c = 10;
		int d = ++c;
		System.out.println(c);//11
		System.out.println(d);//11

		System.out.println("------------");
		int e = 10;
		//e++;
		++e;
		System.out.println(e);
		
		
		System.out.println("------------测试题---------------");
		/*
		第一题：
			int a = 10;
			int b = 10;
			int c = 10;
			a = b++;
			c = --a;
			b = ++a;
			a = c--;
			请分别计算出a,b,c的值
		第二题：
			int a = 4;
			int b = (a++)+(++a)+(a*10);
	*/
		
		/*
		int a = 10;
		int b = 10;
		int c = 10;
		a = b++;//a=10,b=11,c=10
		c = --a;//a=9,b=11,c=9
		b = ++a;//a=10,b=10,c=9
		a = c--;//a=9,b=10,c=8
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------");
		*/

		
		int aa = 4;
		int bb = (aa++)+(++aa)+(aa*10);
			  //= 4 + 6 + 60
			  //= 70
		System.out.println(aa);
		System.out.println(bb);
		

		int i = 1;
//		System.out.println(i+++i+++i+++i++);
		System.out.println("分解：");
		System.out.println("i++ =>"+i++ );
//		i++ + i++ + i++ + i++ 
//		1	+ 2	  + 3	+ 4

//		int i = 1;
		System.out.println(i++ + ++i + i++ + ++i);//1+3+3+5
		//i++ + ++i + i++ + ++i
		//1 + 3 + 3 + 5
		
		System.out.println("YearMonth-----");
		
		
		 YearMonth ym = YearMonth.of(2018,1);
		 
	     YearMonth sh =  ym.minusMonths(1);
		 
		 System.out.println("时间:"+ym+",上一个月："+sh);
		
		
	}

}


/*
	十进制：130
	A:第一步，先把十进制转换为二进制
		二进制：000000000 000000000 000000000 100000010
		由于此二进制是一个正数，所以，补码也是000000000 000000000 000000000 100000010。
	B:做强制类型转换
		二进制：000000000 000000000 000000000 100000010
		截取后就变成了：100000010
	C:操作后的数据是补码，你看到的是原码
				符号位		数值位
		补码：	1			00000010
		反码：	1			00000001
		原码：	1			11111110
*/
