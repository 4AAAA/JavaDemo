package dahuasjms.decorator.base;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	/**
	 * 穿大T恤
	 */
	public void WearTShirts() {
		System.out.println("大T恤");
	}
	
	/**
	 * 穿垮裤
	 */
	public void WearBigTrouser() {
		System.out.println("穿垮裤");
	}
	
	/**
	 * 破球鞋
	 */
	public void WearSneakers() {
		System.out.println("破球鞋");
	}
	
	/**
	 * 穿西装
	 */
	public void WearSuit() {
		System.out.println("穿西装");
	}
	
	/**
	 * 
	 * @return
	 */
	public void Show() {
		System.out.println("装扮的："+name);
	}
}
