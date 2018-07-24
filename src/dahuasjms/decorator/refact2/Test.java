package dahuasjms.decorator.refact2;

public class Test {

	public static void main(String[] args) {

		Person person = new Person();
		TShirt tShirt = new TShirt();
		WearBigTrouser wearBigTrouser = new WearBigTrouser();
		WearSneakers wearSneakers = new WearSneakers();
		
		tShirt.Decorate(person);
		wearBigTrouser.Decorate(tShirt);
		wearSneakers.Decorate(wearBigTrouser);
		wearSneakers.show();

		
	}

}
