package headfirst.command.candy;

public class OrderCandy {
	public static void main(String[] args) {
		CandyStore nhstore = new NewHavenCandyStore();
		CandyStore chstore = new ChicagoCandyStore();
		OrderList order = new OrderList();
		order.placeOrder(nhstore,"chocolate");
		order.orderConfirmed();

//		chstore.orderCandy("chocolate");
//		nystore.orderCandy("chocolate");
//		chstore.orderCandy("toffee");
//		nystore.orderCandy("toffee");
//		
		
	}
}
