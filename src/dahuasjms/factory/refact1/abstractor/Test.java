package dahuasjms.factory.refact1.abstractor;

import dahuasjms.factory.refact1.abstractor.impl.AccessFactory;
import dahuasjms.factory.refact1.abstractor.impl.SqlFactory;

/***
 * <3>抽象工厂模式
 * 抽象工厂最大的好处就是便于交换产品系列，具体工厂在代码中一般只出现一次。这就使得改变应用的具体工厂很容易。
 *第二个好处是他能让具体的创建对象实例和客户端分离，客户端是通过他们的抽象接口操作实例
 *抽象工厂不太易于拓展，如果需要自增功能，或者自增产品，则需要至少修改三个类，而且实例化的代码是写死在程序中的 ， 这样无法避免违背开放-关闭原则。
 *对于上述问题，可以通过配置文件，结合反射的方式来解决。在这里就不再啰嗦
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {
		//生产工艺
		IFactory sqlFactory = null;
		
		
		{
			//切换生产工艺，保证生产流程不变
			sqlFactory = new SqlFactory();
			
			sqlFactory = new AccessFactory();
		}
		
		{
			//产品的固定生产流程
			IDepartment createDepartment = sqlFactory.createDepartment();		
			createDepartment.insert();
			createDepartment.getById();
			
			IUser createUser = sqlFactory.createUser();
			createUser.insert();
			createUser.getById();
		}
		

		
		
	}

}
