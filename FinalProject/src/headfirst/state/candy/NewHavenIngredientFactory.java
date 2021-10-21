package headfirst.state.candy;

public class NewHavenIngredientFactory 
	implements CandyIngredientFactory 
{

	public Milk prepareMilk() {
		return new TonedMilk();
	}

	public Chocolate createChocolate() {
		return new LiquorChocolate();
	}

	public Bubblegum createBubblegum() {
		return new WinterFreshChewingGum();
	}

	public Toffee createToffee() {
		return new EnglishToffee();
	}
	
	public Sugar createSugar() {
		return new GrinedSugar();
	}
}
