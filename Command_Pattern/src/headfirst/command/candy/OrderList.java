package headfirst.command.candy;

public class OrderList implements Command{
	CandyStore slot;
	String value;
	//Command command;
 
	public OrderList() {}
 
	public void placeOrder(CandyStore nystore, String type) {
		slot = nystore;
		value = type;
	}
 
	public void orderConfirmed() {
		slot.orderCandy(value);
		
	}
}