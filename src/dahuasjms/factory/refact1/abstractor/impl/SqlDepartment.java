package dahuasjms.factory.refact1.abstractor.impl;

import dahuasjms.factory.refact1.abstractor.IDepartment;

/**
 * 部门的sql模式实现类
 * 
 * @author Macx
 *
 */
public class SqlDepartment implements IDepartment {

	@Override
	public void insert() {
		System.out.println("insert into db with sql");
	}

	@Override
	public void getById() {
		System.out.println("select department by id with sql");

	}

}
