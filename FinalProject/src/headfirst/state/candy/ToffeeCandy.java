package headfirst.state.candy;

public class ToffeeCandy extends Candy {

	CandyIngredientFactory ingredientFactory;

	public ToffeeCandy(CandyIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		sugar = ingredientFactory.createSugar();
		milk = ingredientFactory.prepareMilk();
		toffee = ingredientFactory.createToffee();
	}

}
