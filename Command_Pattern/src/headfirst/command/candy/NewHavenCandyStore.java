package headfirst.command.candy;

public class NewHavenCandyStore extends CandyStore {

	protected Candy createCandy(String item) {
		Candy candy = null;
		if (item.equals("chocolate")) {
			return new NewHavenChocolateCandy();
		} else if (item.equals("toffee")) {
			return new NewHavenToffeeCandy();
		} 
		else return candy;
	}

}
