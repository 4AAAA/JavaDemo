package dahuasjms.decorator.demo01;

/**
 * 具体构件角色（真实对象）
 * 
 * @author Macx
 *
 */
public class Car implements ICar {

	@Override
	public void move() {

		System.out.println("汽车固有功能：跑！");
	}

}
