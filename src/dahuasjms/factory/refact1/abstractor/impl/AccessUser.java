package dahuasjms.factory.refact1.abstractor.impl;

import dahuasjms.factory.refact1.abstractor.IUser;
/**
 * user的access模式
 * @author Macx
 *
 */
public class AccessUser implements IUser {

	@Override
	public void insert() {
		System.out.println("insert into db with access");
	}

	@Override
	public void getById() {
		System.out.println("select user by id with access");

	}

}
