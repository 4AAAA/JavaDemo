package dahuasjms.factory.refact1.base;

import java.util.Scanner;

import dahuasjms.factory.refact1.base.impl.AddOperationFactory;



/**
 * <2>工厂方法模式
 *工厂方法 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使得一个类的实例化延迟到了子类
 *工厂方法在简单工厂的基础上再包了一层工厂，所有的工厂都是此工厂的子类。而产生对象的类型由子类工厂决定。使用工厂方法来实现上面的加减乘除对象的创建
 *
 *工厂方法将类的实例化推迟到了其子类。所以使用工厂方法模式时，需要客户端决定实例化哪一个工厂类。选择判断问题还是存在的。
 *也就是说，工厂方法把简单的工厂内部逻辑判断转移到了客户端来运行。你想要加的功能，本来是要改工厂类的，而现在是修改客户端。
 *不过，我们在某些情况下通过工厂方法，只需要修改一行实例化的代码就可以实现系统元素的切换(比如切换数据源)。这也是很方便的。
 * 
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {

		//客户端代码
		IFactory factory = new AddOperationFactory();
		Operation generateOper = factory.generateOper();
		generateOper.getResult(1, 2);

	}


}
