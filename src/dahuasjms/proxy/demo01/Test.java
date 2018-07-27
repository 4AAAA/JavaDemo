package dahuasjms.proxy.demo01;
/**
 * 静态代理
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {

		//创建一个代理
		RealStar realStar = new RealStar();
		ProxyStar proxyStar = new ProxyStar(realStar);
		
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.sing();
		
	}

}
