package dahuasjms.decorator.base;

public class Test {

	public static void main(String[] args) {

		Person person = new Person("小菜");
		
		//装饰
		person.WearBigTrouser();
		person.WearSneakers();
		person.WearSuit();
		
		person.Show();
		
		/**
		 * 每新增一种装饰的方式都要去修改 Person 类，违反了 “开放-封闭” 原则，把装饰抽象出来，每新增一个装饰新建一个子类继承。
		 */
		
	}

}
