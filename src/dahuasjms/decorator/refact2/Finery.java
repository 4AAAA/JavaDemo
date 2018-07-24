package dahuasjms.decorator.refact2;

public class Finery extends Person {

	protected Person component;

	/**
	 * 装饰器内部维护一个具体对象
	 * @param component
	 */
	public void Decorate(Person component) {
		this.component = component;
	}
	
	public void show() {
		if(component!=null) {			
			this.component.Show();
		}
	}
	
	
	

}
