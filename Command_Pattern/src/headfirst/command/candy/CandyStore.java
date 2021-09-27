package headfirst.command.candy;

public abstract class CandyStore {
 
	protected abstract Candy createCandy(String item);
 
	public Candy orderCandy(String type) {
		Candy candy = createCandy(type);
		System.out.println("\n--- Making a " + candy.getName() + " ---");
		candy.prepare();
		candy.stir();
		candy.cool();
		candy.shape();
		candy.wrap();
		return candy;
	}
}
