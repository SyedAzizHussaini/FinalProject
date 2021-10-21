package headfirst.state.candy;

public class ClosedState implements State {
	CandyStore candyStore;

	public ClosedState(CandyStore candyStore) {
		this.candyStore = candyStore;
	}

	public void orderNow() {
		System.out.println("You can't place any order, shop closed");
	}

	public void cancelOrder() {
		System.out.println("You can't cancel, you have not placed any order");
	}

	public void placeOrder() {
		System.out.println("Order placed but candy is out of stock");
	}

	public void delivered() {
		System.out.println("No candy delivered");
	}

	public String toString() {
		return "out of stock";
	}
}
