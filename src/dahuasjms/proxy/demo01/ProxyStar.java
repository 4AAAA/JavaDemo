package dahuasjms.proxy.demo01;

/**
 * 代理对象
 * 
 * @author Macx
 *
 */
public class ProxyStar implements Star {

	private Star star;

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {

		System.out.println("代理调用真实对象的面谈");
		star.confer();
	}

	@Override
	public void signContract() {
		System.out.println("代理调用真实对象的签合同");
		star.signContract();
	}

	@Override
	public void sing() {
		System.out.println("代理调用真实对象的唱歌");
		star.sing();
	}

}
