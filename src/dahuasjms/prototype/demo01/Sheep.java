package dahuasjms.prototype.demo01;

/**
 * 浅拷贝：直接继承Cloneable接口,重写clone方法
 * @author Macx
 *
 */
public class Sheep implements Cloneable{

	private String name;
	
	private String age;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
