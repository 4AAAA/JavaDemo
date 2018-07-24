package dahuasjms.decorator.refact1;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public void Show() {
		System.out.println("装扮的："+name);
	}
}
