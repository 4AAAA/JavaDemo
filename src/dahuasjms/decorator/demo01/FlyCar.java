package dahuasjms.decorator.demo01;

/**
 * 具体装饰角色
 * @author Macx
 *
 */
public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);

	}

	@Override
	public void move() {
		
		super.move();
		fly();
	}

	public void fly() {
		System.out.println("汽车会飞");
	}

}
