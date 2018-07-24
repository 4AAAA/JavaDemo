package dahuasjms.factory.refact1.simple;

import java.util.Scanner;

/**
 * <1>简单工厂模式
 * 计算器测试类
 * 简单工厂将对象的创建过程进行了封装，用户不需要知道具体的创建过程，只需要调用工厂类获取对象即可。
 * 这种简单工厂的写法是通过switch-case来判断对象创建过程的。在实际使用过程中，违背了 开放-关闭原则，当然有些情况下可以通过反射调用来弥补这种不足。
 * 
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		float firstNum = scanner.nextFloat();
		System.out.println("请输入第二个数字");
		float secondNum = scanner.nextFloat();
		System.out.println("请输入运算符号：+  -  *  /");
		String countQuato = scanner.next();

		// 调用计算器
		System.out.println(count(firstNum, secondNum, countQuato));

	}

	/**
	 * 计算器
	 * 简单工厂模式又 叫静态工厂方法模式（Static FactoryMethod Pattern）,是通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。 
	 * @param firstNum
	 * @param secondNum
	 * @param countQuato
	 * @return
	 */
	private static float count(float firstNum, float secondNum, String countQuato) {
		// 通过工厂类获取对象
		Operation operation = OperationFactory.getOperation(countQuato);
		return operation.getResult(firstNum, secondNum);
	}

}
