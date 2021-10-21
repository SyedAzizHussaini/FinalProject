package headfirst.state.candy;

import java.io.IOException;

public interface State {
	
		public void orderNow();
		public void cancelOrder();
		public void placeOrder();
		public void delivered();
	}

