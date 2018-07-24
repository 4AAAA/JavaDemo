package dahuasjms.factory.refact1.base.impl;

import dahuasjms.factory.refact1.base.IFactory;
import dahuasjms.factory.refact1.base.Operation;

/**
 * 创建除法运算类工厂
 * @author Macx
 *
 */
public class DivOperationFactory implements IFactory{

	@Override
	public Operation generateOper() {
		return new DivOperation();
	}

}
