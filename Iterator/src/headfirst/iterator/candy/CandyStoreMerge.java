package headfirst.iterator.candy;

import java.util.*;

public class CandyStoreMerge {
	public static void main(String args[]) {
		NewHavenCandyStoreMenu afternoonMenu = new NewHavenCandyStoreMenu();
		ChicagoCandyStoreMenu eveningMenu = new ChicagoCandyStoreMenu();

		StoreKeeper storekeeper = new StoreKeeper(afternoonMenu, eveningMenu);

		storekeeper.printMenu();
	}
}