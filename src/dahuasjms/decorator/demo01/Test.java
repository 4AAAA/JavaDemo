package dahuasjms.decorator.demo01;

/**
 * 装饰模式：
 * 		职责：动态的为一个对象增加新的功能
　　　   装饰器模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，
        更加灵活，同时避免类型体系的快速膨胀。
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {
		
        /**
         * 在不继承车的父类的情况下，新增车“飞”的功能，而且"飞"的装饰功能适用于所有的车
         */
		FlyCar flyCar = new FlyCar(new Car());
		flyCar.move();
	}

}
