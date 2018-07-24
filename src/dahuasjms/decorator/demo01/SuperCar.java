package dahuasjms.decorator.demo01;

/**
 * 装饰器，内部构造一个具体对象
 * 
 * @author Macx
 *
 */
public class SuperCar implements ICar {

	private ICar car;

	public SuperCar(ICar car) {
		this.car = car;
	}

	@Override
	public void move() {
		if (car != null)
			this.car.move();

	}

}
