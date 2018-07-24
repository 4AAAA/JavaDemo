package dahuasjms.factory.refact1.abstractor.impl;

import dahuasjms.factory.refact1.abstractor.IDepartment;
import dahuasjms.factory.refact1.abstractor.IFactory;
import dahuasjms.factory.refact1.abstractor.IUser;

/**
 * user和department的sql模式创建对象工厂
 * @author Macx
 *
 */
public class SqlFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new SqlUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlDepartment();
	}

}
