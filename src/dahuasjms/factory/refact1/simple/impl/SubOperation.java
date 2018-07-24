package dahuasjms.factory.refact1.simple.impl;

import dahuasjms.factory.refact1.simple.Operation;
/**
 * 减法运算类
 * @author Macx
 *
 */
public class SubOperation extends Operation{

	@Override
	public float getResult(float firstNum, float secondNum) {
		return firstNum-secondNum;
	}

}
