package dahuasjms.strategy.base;
/**
 * 商场收银软件
 * @author Macx
 *
 */
public class Test {

	public static void main(String[] args) {

		//输入
		double danjia = 1;
		double shuliang = 2;
		//前端設置下拉选项框折扣		
		int [] sale = {0,1,2,3};
		int sales = 0;
		
		//计算器
		System.out.println(CountPrice.count(danjia, shuliang,sales));
		
		
	}
	


}
