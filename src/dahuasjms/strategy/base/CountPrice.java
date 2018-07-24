package dahuasjms.strategy.base;

/**
 * 商场收银计算器
 * 
 * @author Macx
 *
 */
public class CountPrice {

	// 总金额
	static double total = 0.0D;

	public static double count(double danjia, double shuliang, int sale) {
		double totalPrice = danjia * shuliang;
		total = total + totalPrice;

		// 打折销售 （正常收費、打八折、打七折、打五折）
		switch (sale) {
		case 0:
			break;
		case 1:
			total = total * 0.8;
			break;
		case 2:
			total = total * 0.7;
			break;
		case 3:
			total = total * 0.5;
			break;
		default:
			break;

		}

		return total;
	}

}
