package dahuasjms.strategy.refact2.impl;

import dahuasjms.strategy.refact2.CashSuper;

/**
 * 返利收费子类
 * 
 * @author Macx
 *
 */
public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	/**
	 * 构造函数初始化返现条件
	 * 
	 * @param moneyCondition
	 *            符合满减金额
	 * @param moneyReturn
	 *            返现金额
	 */
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.valueOf(moneyCondition);
		this.moneyReturn = Double.valueOf(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {

		double result = money;
		if (money >= moneyCondition)
			result = money - moneyReturn;

		return result;
	}

}
