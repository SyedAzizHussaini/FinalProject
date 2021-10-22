package headfirst.state.candy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyStoreTesting {

	@Test
	void test() {
		CandyStore test = new NewHeavenCandyStore(5);
		String expectedOutput = "\nNew Haven Candy Store\n"
				+ "Stock: 5 Candys\n"
				+ "Store is waiting for order\n";
		String bubbleGumOutput = "** New Heaven's Bubble Gum **"
				+ "\nGrinded Sugar\n"
				+ "Chewing Gum with WinterFresh Flavour\n"
				+ "";
		String output = test.toString();		
		Candy candy= test.orderCandy("bubblegum");
		test.placeOrder();
		int count = test.getCount();
		String result = candy.toString();
		System.out.println(candy);
		
		assertEquals(expectedOutput,output );
		assertEquals(bubbleGumOutput,result );
		assertEquals(4,count);
				
	}

}
