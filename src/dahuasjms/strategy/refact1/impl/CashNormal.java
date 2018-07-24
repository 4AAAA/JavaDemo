package dahuasjms.strategy.refact1.impl;

import dahuasjms.strategy.refact1.CashSuper;
/**
 * 正常收费子类
 * @author Macx
 *
 */
public class CashNormal extends CashSuper{
	/**
	 * 正常收费，原价返回
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
