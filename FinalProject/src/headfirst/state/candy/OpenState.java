package headfirst.state.candy;

public class OpenState implements State {
    CandyStore candyStore;
 
    public OpenState(CandyStore candyStore) {
        this.candyStore = candyStore;
    }
    
	public void orderNow() {
		System.out.println("You started the order");
		candyStore.setState(candyStore.getOrderPlacedState());
	}
 
	public void cancelOrder() {
		System.out.println("You haven't placed the Order");
	}
 
	public void placeOrder() {
		System.out.println("you placed but there is no order");
	 }
 
	public void delivered() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for order";
	}
}
