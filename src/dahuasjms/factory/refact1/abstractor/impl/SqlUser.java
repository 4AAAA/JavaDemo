package dahuasjms.factory.refact1.abstractor.impl;

import dahuasjms.factory.refact1.abstractor.IUser;

/**
 * user的sql模式实现类
 * 
 * @author Macx
 *
 */
public class SqlUser implements IUser {

	@Override
	public void insert() {
		System.out.println("insert into db with sql");
	}

	@Override
	public void getById() {
		System.out.println("select user by id with sql");

	}

}
