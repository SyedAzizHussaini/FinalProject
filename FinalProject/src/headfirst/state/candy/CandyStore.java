package headfirst.state.candy;

public abstract class CandyStore {
 
	State closedState;
	State openState;
	State orderPlacedState;
	State orderDeliveredState;
	State winnerState;
 
	State state = closedState;
	int count = 0;
	
	protected abstract Candy createCandy(String item);
	 
	public Candy orderCandy(String type) {
		state.orderNow();
		Candy candy = createCandy(type);
		System.out.println("\t\t--- Making a " + candy.getName() + " ---");
		candy.prepare();
		candy.cut();
		candy.wrap();
		System.out.println(candy);
		return candy;
	}
 
	public CandyStore(int numberOfCandies) {
		closedState = new ClosedState(this);
		openState = new OpenState(this);
		orderPlacedState = new OrderPlacedState(this);
		orderDeliveredState = new OrderDeliveredState(this);
		winnerState = new WinnerState(this);

		this.count = numberOfCandies;
 		if (numberOfCandies > 0) {
			state = openState;
		} 
	}
 
	public void orderNow() {
		state.orderNow();
	}
 
	public void cancelOrder() {
		state.cancelOrder();
	}
 
	public void placeOrder() {
		state.placeOrder();
		state.delivered();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void giveCandy() {
		System.out.println("Ordered Candy is given.....! \n Visit Again :)\n");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = openState;
	}

    public State getState() {
        return state;
    }

    public State getClosedState() {
        return closedState;
    }

    public State getOpenState() {
        return openState;
    }

    public State getOrderPlacedState() {
        return orderPlacedState;
    }

    public State getOrderDeliveredState() {
        return orderDeliveredState;
    }
    
    public State getWinnerState() {
        return winnerState;
    }
 
    public abstract String toString(); 
}
