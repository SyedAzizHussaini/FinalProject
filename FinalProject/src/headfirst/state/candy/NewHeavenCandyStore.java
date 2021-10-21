package headfirst.state.candy;

public class NewHeavenCandyStore extends CandyStore {

	public NewHeavenCandyStore(int numberOfCandies) {
		super(numberOfCandies);
		// TODO Auto-generated constructor stub
	}

	protected Candy createCandy(String item) {
		Candy candy = null;
		NewHavenIngredientFactory newHavenIngredientFactory =
				new NewHavenIngredientFactory();

		if (item.equals("bubblegum")) {

			candy = new CandyBubblegum(newHavenIngredientFactory);
			candy.setName("New Heaven's Bubble Gum");

		}  else if (item.equals("chocolate")) {

			candy = new ChocolateCandy(newHavenIngredientFactory);
			candy.setName("New Heaven's Chocolate Candy");

		} else if (item.equals("toffee")) {

			candy = new ToffeeCandy(newHavenIngredientFactory);
			candy.setName("New Heaven's Toffee");

		} 
		return candy;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer();
		result.append("\nNew Haven Candy Store");
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
