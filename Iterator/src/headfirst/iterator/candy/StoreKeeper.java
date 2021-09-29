package headfirst.iterator.candy;

public class StoreKeeper {

	NewHavenCandyStoreMenu newHavenCandyStoreMenu;
	ChicagoCandyStoreMenu chicagoCandyStoreMenu;
	 
		public StoreKeeper(NewHavenCandyStoreMenu newHavenCandyStoreMenu, ChicagoCandyStoreMenu chicagoCandyStoreMenu) {
			this.newHavenCandyStoreMenu = newHavenCandyStoreMenu;
			this.chicagoCandyStoreMenu = chicagoCandyStoreMenu;
		}
	 
		public void printMenu() {
			Iterator nhIterator = newHavenCandyStoreMenu.createIterator();
			Iterator chIterator = chicagoCandyStoreMenu.createIterator();

			System.out.println("\t\t\tMENU\n\t\t\t----\nAfternoon's Menu\n----------- ----");
			printMenu(nhIterator);
			System.out.println("\nEvening's Menu\n--------- ----");
			printMenu(chIterator);
		}
	 
		private void printMenu(Iterator iterator) {
			while (iterator.hasNext()) {
				System.out.println("");
				MenuItem menuItem = (MenuItem)iterator.next();
				System.out.print(menuItem.getName() + ": ");
				System.out.print(menuItem.getDescription());
				System.out.println("\n $"+menuItem.getPrice());
			}
			System.out.println("");
		}
	 
		public void printVegetarianMenu() {
			printVegetarianMenu(newHavenCandyStoreMenu.createIterator());
			printVegetarianMenu(chicagoCandyStoreMenu.createIterator());
		}
	 
		public boolean isItemVegetarian(String name) {
			Iterator lunchIterator = newHavenCandyStoreMenu.createIterator();
			if (isVegetarian(name, lunchIterator)) {
				return true;
			}
			Iterator dinnerIterator = chicagoCandyStoreMenu.createIterator();
			if (isVegetarian(name, dinnerIterator)) {
				return true;
			}
			return false;
		}


		private void printVegetarianMenu(Iterator iterator) {
			while (iterator.hasNext()) {
				MenuItem menuItem = (MenuItem)iterator.next();
				if (menuItem.isVegetarian()) {
					System.out.print(menuItem.getName());
					System.out.println("\t\t" + menuItem.getPrice());
					System.out.println("\t" + menuItem.getDescription());
				}
			}
		}

		private boolean isVegetarian(String name, Iterator iterator) {
			while (iterator.hasNext()) {
				MenuItem menuItem = (MenuItem)iterator.next();
				if (menuItem.getName().equals(name)) {
					if (menuItem.isVegetarian()) {
						return true;
					}
				}
			}
			return false;
		}
	}