package dahuasjms.strategy.refact2.impl;

import dahuasjms.strategy.refact2.CashSuper;

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
