package dahuasjms.strategy.refact2;
/**
 * 策略模式+简单工厂
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {
		// 客户端下拉选项折扣
		String[] sale = { "正常收费", "满300返100", "8折" };
		
		double money = 10;
		
//		CashSuper createCashAccept = CashFactory.createCashAccept(sale[0]);
//		double acceptCash = createCashAccept.acceptCash(money);
		
		//策略模式+简单工厂
		CashContext cashContext = new CashContext(sale[0]);
		cashContext.getResult(money);
		
		/**
		 * 策略模式与简单工厂的区别
		 * 
		 * 1.简单工厂让人认识了两个类，CashSuper 和 CashFactory ,但是策略模式+简单工厂 只让人认识一个类： CashContext就可以了，耦合更加降低了
		 */
		
	}

}
