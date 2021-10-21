package headfirst.state.candy;

public class CandyBubblegum extends Candy {
	
	CandyIngredientFactory ingredientFactory;
	 
	public CandyBubblegum(CandyIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		sugar = ingredientFactory.createSugar();
		bubblegum = ingredientFactory.createBubblegum();
	}

}
