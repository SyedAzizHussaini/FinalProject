package headfirst.state.candy;

public class OrderDeliveredState implements State {

	CandyStore candyStore;

	public OrderDeliveredState(CandyStore candyStore) {
		this.candyStore = candyStore;
	}

	public void orderNow() {
		System.out.println("Please wait, we're already giving you a candy");
	}

	public void cancelOrder() {
		System.out.println("Sorry, you already placed order");
	}

	public void placeOrder() {
		System.out.println("saying twice doesn't get you another candy!");
	}

	public void delivered() {
		candyStore.giveCandy();
		if (candyStore.getCount() > 0) {
			candyStore.setState(candyStore.getOpenState());
		} else {
			System.out.println("Oops, out of stock!");
			candyStore.setState(candyStore.getClosedState());
		}
	}

	public String toString() {
		return "giving candy";
	}
}


