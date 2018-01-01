package zhsdTest;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {

//		BigDecimal abc = null;
//		System.out.println("look->"+abc);
		
		BigDecimal aa = new BigDecimal("-0.5");
		
		BigDecimal bb = new BigDecimal("2");
		
		System.out.println("ok-->"+bb.multiply(aa));
		
	}

}
