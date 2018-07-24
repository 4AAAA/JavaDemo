package dahuasjms.strategy.refact2.impl;

import dahuasjms.strategy.refact2.CashSuper;

/**
 * 打折收费子类
 * @author Macx
 *
 */
public class CashRebate extends CashSuper {

	private double moneyRebate = 1d;

	/**
	 * 构造函数初始化折扣
	 * 
	 * @param moneyRebate
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.valueOf(moneyRebate);
	}

	/**
	 * 折扣计算
	 */
	@Override
	public double acceptCash(double money) {

		return money * moneyRebate;
	}

}
