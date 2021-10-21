package headfirst.state.candy;

public class ChicagoCandyStore extends CandyStore {

	public ChicagoCandyStore(int numberOfCandies) {
		super(numberOfCandies);
		// TODO Auto-generated constructor stub
	}

	protected Candy createCandy(String item) {
		Candy candy = null;
		CandyIngredientFactory candyIngredientFactory =
				new ChicagoIngredientFactory();

		if (item.equals("bubblegum")) {

			candy = new CandyBubblegum(candyIngredientFactory);
			candy.setName("Chicago's Bubble Gum");

		}else if (item.equals("chocolate")) {

			candy = new ChocolateCandy(candyIngredientFactory);
			candy.setName("Chicago's Chocolate Candy");

		} else if (item.equals("toffee")) {

			candy = new ToffeeCandy(candyIngredientFactory);
			candy.setName("Chicago's Toffee");
		} 
		return candy;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer();
		result.append("\nChicago Candy Store");
		//result.append("\nJava-enabled Standing Candy Model #2004");
		result.append("\nStock: " + count + " Candy");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Store is " + state + "\n");
		return result.toString();
	}
}
