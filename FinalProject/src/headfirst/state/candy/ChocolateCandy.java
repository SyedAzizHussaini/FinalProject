package headfirst.state.candy;

public class ChocolateCandy extends Candy {

	CandyIngredientFactory ingredientFactory;

	public ChocolateCandy(CandyIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		sugar = ingredientFactory.createSugar();
		milk = ingredientFactory.prepareMilk();
		chocolate = ingredientFactory.createChocolate();
	}

}
