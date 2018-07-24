package dahuasjms.factory.refact1.simple;


import dahuasjms.factory.refact1.simple.impl.AddOperation;
import dahuasjms.factory.refact1.simple.impl.DivOperation;
import dahuasjms.factory.refact1.simple.impl.MulOperation;
import dahuasjms.factory.refact1.simple.impl.SubOperation;

/**
 * 接下来需要解决的就是对象的创建问题了，既如何根据不同的情况创建不同的对象：我们正好可以通过简单工厂模式实现
 * 
 * @author Macx
 *
 */
public class OperationFactory {

	public static Operation getOperation(String quotaFlag) {
		Operation o = null;
		switch (quotaFlag) {
		case "+":
			o = new AddOperation();
			break;
		case "-":
			o = new SubOperation();
			break;
		case "*":
			o = new MulOperation();
			break;
		case "/":
			o = new DivOperation();
			break;
		default:
			break;

		}
		return o;
	}
}
