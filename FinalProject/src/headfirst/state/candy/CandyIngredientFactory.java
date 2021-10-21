package headfirst.state.candy;

public interface CandyIngredientFactory {
	
	public Milk prepareMilk(); 
	public Chocolate createChocolate();
	public Sugar createSugar();
	public Toffee  createToffee();
	public Bubblegum createBubblegum();
}