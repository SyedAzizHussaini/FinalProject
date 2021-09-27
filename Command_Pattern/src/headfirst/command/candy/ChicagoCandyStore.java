package headfirst.command.candy;

public class ChicagoCandyStore extends CandyStore {

	protected Candy createCandy(String item) {
		Candy candy = null;
		if (item.equals("chocolate")) {
			return new ChicagoChocolateCandy();
		} else if (item.equals("toffee")) {
			return new ChicagoToffeeCandy();
		} 
		else return candy;
	}

}
