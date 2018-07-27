package dahuasjms.proxy.demo01;

/**
 * 真实对象
 * @author Macx
 *
 */
public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("真实对象面谈");
	}

	@Override
	public void signContract() {
		System.out.println("真实对象签合同");
	}

	@Override
	public void sing() {
		System.out.println("真实对象唱歌");
	}

}
