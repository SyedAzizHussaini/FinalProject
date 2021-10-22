package headfirst.state.candy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyIngredientFactoryTest {

	@Test
	void test() {
		CandyIngredientFactory cif = new ChicagoIngredientFactory();
		Chocolate chocolate = cif.createChocolate();
		String result_chocolate = chocolate.toString();
		
		CandyIngredientFactory nh = new NewHavenIngredientFactory();
		Toffee toffee = nh.createToffee();
		String result_toffee = toffee.toString();
		
		
		assertEquals("Chocolate with Milk",result_chocolate);
		assertEquals("Toffee with Layer of Dark chocolate",result_toffee);
	}

}
