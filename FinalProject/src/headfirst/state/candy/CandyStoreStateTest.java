package headfirst.state.candy;

public class CandyStoreStateTest {

	public static void main(String[] args) {
		
/******
		New Haven Candy Store Test case
										*******/
		
		System.out.println("\t\t\t ******** Welcome to New Haven's Candy Store ********");
		CandyStore candyStore = new NewHeavenCandyStore(5);
		System.out.println(candyStore);
		NewHavenCandyStoreMenu nhMenu = new NewHavenCandyStoreMenu();
		NHStoreKeeper nhstorekeeper = new NHStoreKeeper(nhMenu);
		nhstorekeeper.nhPrintMenu();
		Candy candy = candyStore.orderCandy("bubblegum");
		System.out.println("Ethan ordered a " + candy + "\n");
		candyStore.placeOrder();
		System.out.println(candyStore);
		nhstorekeeper.nhPrintMenu();
		candy = candyStore.orderCandy("chocolate");
		System.out.println("Ethan ordered a " + candy + "\n");
		candyStore.placeOrder();
		System.out.println(candyStore);
		
/******
			Chicago Candy Store Test case
		
											*******/
		System.out.println("\t\t\t ******** Welcome to Chicago's Candy Store ********");
		CandyStore chicagoStore = new ChicagoCandyStore(5);
		System.out.println(chicagoStore);
		ChicagoCandyStoreMenu cgMenu = new ChicagoCandyStoreMenu();
		ChicagoStoreKeeper cgstorekeeper = new ChicagoStoreKeeper(cgMenu);
		cgstorekeeper.cgPrintMenu();
		Candy candy2 = chicagoStore.orderCandy("bubblegum");
		System.out.println("Ethan ordered a " + candy2 + "\n");
		chicagoStore.placeOrder();
		System.out.println(chicagoStore);
		cgstorekeeper.cgPrintMenu();
		candy2 = chicagoStore.orderCandy("chocolate");
		System.out.println("Ethan ordered a " + candy2 + "\n");
		chicagoStore.placeOrder();
		System.out.println(chicagoStore);
	}
}
