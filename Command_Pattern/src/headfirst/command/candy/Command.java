package headfirst.command.candy;

public interface Command {

	public void placeOrder(CandyStore nystore, String type);
	public void orderConfirmed();
}