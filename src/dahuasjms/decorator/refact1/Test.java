package dahuasjms.decorator.refact1;

public class Test {

	public static void main(String[] args) {
		Person person = new Person("小菜");
		
		//装饰
		TShirt tShirt = new TShirt();
		WearBigTrouser wearBigTrouser = new WearBigTrouser();
		WearSneakers wearSneakers = new WearSneakers();
		tShirt.show();
		wearBigTrouser.show();
		wearSneakers.show();
		
		person.Show();
		
		
		/**
		 * 一个人穿衣服的过程，完全暴露出来了，也就是说光着身在人家面前穿衣服，穿衣服的过程应该是在内部完成的
		 */
	}

}
