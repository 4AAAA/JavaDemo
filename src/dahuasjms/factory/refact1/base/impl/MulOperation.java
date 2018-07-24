package dahuasjms.factory.refact1.base.impl;

import dahuasjms.factory.refact1.base.Operation;

/**
 * 乘法运算类
 * @author Macx
 *
 */
public class MulOperation extends Operation{

	@Override
	public float getResult(float firstNum, float secondNum) {
		return firstNum*secondNum;
	}

}
