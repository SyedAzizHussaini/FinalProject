package headfirst.state.candy;

import java.util.Random;

public class OrderPlacedState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	CandyStore candyStore;

	public OrderPlacedState(CandyStore candyStore) {
		this.candyStore = candyStore;
	}

	public void orderNow() {
		System.out.println("Already ordered");
	}

	public void cancelOrder() {
		System.out.println("Order cancelled");
		candyStore.setState(candyStore.getOpenState());
	}

	public void placeOrder() {
		System.out.println("Order placed...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (candyStore.getCount() > 1)) {
			candyStore.setState(candyStore.getWinnerState());
		} else {
			candyStore.setState(candyStore.getOrderDeliveredState());
		}
	}

	public void delivered() {
		System.out.println("No candy delivered..");
	}

	public String toString() {
		return "waiting for placing order";
	}
}
