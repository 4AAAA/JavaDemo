package dahuasjms.factory.base;

import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		float firstNum = scanner.nextFloat();
		System.out.println("请输入第二个数字");
		float secondNum = scanner.nextFloat();
		System.out.println("请输入运算符号：+  -  *  /");
		String countQuato = scanner.next();
		
		if("+".equals(countQuato)) {
			System.out.println("result:"+(firstNum+secondNum));
		}else if("-".contentEquals(countQuato)) {
			System.out.println("result:"+(firstNum-secondNum));
		}else if("*".equals(countQuato)) {
			System.out.println("result:"+(firstNum*secondNum));
		}else if("/".equals(countQuato)) {
			System.out.println("result:"+(firstNum/secondNum));
		}
		
	}

}
