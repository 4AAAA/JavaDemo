package dahuasjms.factory.refact1.base.impl;

import dahuasjms.factory.refact1.base.IFactory;
import dahuasjms.factory.refact1.base.Operation;

/**
 * 创建减法运算类工厂
 * @author Macx
 *
 */
public class SubOperationFactory implements IFactory{

	@Override
	public Operation generateOper() {
		return new SubOperation();
	}

}
