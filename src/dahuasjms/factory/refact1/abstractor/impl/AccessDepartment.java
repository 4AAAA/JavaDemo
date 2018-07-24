package dahuasjms.factory.refact1.abstractor.impl;

import dahuasjms.factory.refact1.abstractor.IDepartment;
/**
 * department的access模式
 * @author Macx
 *
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert() {
		System.out.println("insert into db with access");
	}

	@Override
	public void getById() {
		System.out.println("select department by id with access");
	}

}
