package dahuasjms.factory.refact1.abstractor;
/**
 * 总工厂接口
 * @author Macx
 *
 */
public interface IFactory {
	public IUser createUser();

	public IDepartment createDepartment();
}
