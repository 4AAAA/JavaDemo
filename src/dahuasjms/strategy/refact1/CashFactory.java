package dahuasjms.strategy.refact1;

import dahuasjms.strategy.refact1.impl.CashNormal;
import dahuasjms.strategy.refact1.impl.CashRebate;
import dahuasjms.strategy.refact1.impl.CashReturn;

/**
 * 现金收费工厂
 * 
 * @author Macx
 *
 */
public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;

		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300返100":
			cs = new CashReturn("300", "100");
			break;
		case "8折":
			cs = new CashRebate("0.8");
			break;
		default:
			break;

		}

		return cs;

	}
}
