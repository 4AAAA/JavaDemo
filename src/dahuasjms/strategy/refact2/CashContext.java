package dahuasjms.strategy.refact2;

import dahuasjms.strategy.refact2.impl.CashNormal;
import dahuasjms.strategy.refact2.impl.CashRebate;
import dahuasjms.strategy.refact2.impl.CashReturn;

/**
 * 策略模式-上下文
 * 结合简单工厂模式创建对象，把客户端选择对象的switch语句后移
 * @author Macx
 *
 */
public class CashContext {
	
	/**
	 * 声明策略对象 
	 */
	private CashSuper cs;

	/**
	 * 构造方法，传入具体收费策略
	 * @param cashSuper
	 */
	public CashContext(String type) {
		
		switch (type) {
		case "正常收费":
			this.cs = new CashNormal();
			break;
		case "满300返100":
			this.cs = new CashReturn("300", "100");
			break;
		case "8折":
			this.cs = new CashRebate("0.8");
			break;
		default:
			break;

		}
		
		/**
		 * 简单工厂，目前这种做法还有一个缺陷，还是使用了switch，如果新增一个type，又必须改语句，后期使用注解和反射可以解决。
		 */
		
	}
	
	public double getResult(double money) {
		return cs.acceptCash(money);
	}
	
}
