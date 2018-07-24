package dahuasjms.strategy.refact1;
/**
 * 简单工厂优化
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {
		// 客户端下拉选项折扣
		String[] sale = { "正常收费", "满300返100", "8折" };
		
		double money = 10;
		
		CashSuper createCashAccept = CashFactory.createCashAccept(sale[0]);
		double acceptCash = createCashAccept.acceptCash(money);
	}

}
