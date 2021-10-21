package headfirst.state.candy;

public class ChicagoIngredientFactory implements CandyIngredientFactory {

	public Milk prepareMilk() {
		return new WholeMilk();
	}

	public Chocolate createChocolate() {
		return new MilkChocolate();
	}

	public Bubblegum createBubblegum() {
		return new BubbleMintSugarFreeGum();
	}

	public Toffee createToffee() {
		return new AlmondButterCrunch();
	}

	public Sugar createSugar() {
		return new ExtraSweetSugar();
	}
}
