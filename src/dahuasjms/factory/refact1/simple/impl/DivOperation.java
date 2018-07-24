package dahuasjms.factory.refact1.simple.impl;

import dahuasjms.factory.refact1.simple.Operation;
/**
 * 除法运算类
 * @author Macx
 *
 */
public class DivOperation extends Operation{

	@Override
	public float getResult(float firstNum, float secondNum) {
		return firstNum/secondNum;
	}

}
