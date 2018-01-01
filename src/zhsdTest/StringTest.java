package zhsdTest;

public class StringTest {

	public static void main(String[] args) {

		String aa = "2017-01";
		
		String bb = aa.substring(aa.lastIndexOf("-")+1);
		
		System.out.println("look=>"+bb);
		
		
	}

}
